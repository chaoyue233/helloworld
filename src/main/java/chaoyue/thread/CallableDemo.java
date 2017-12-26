package chaoyue.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class TaskWithResult implements Callable<String> {
  private int id;

  public TaskWithResult(int id) {
    this.id = id;
  }

  public String call() throws Exception {
    return "result of TaskWithResult  " + id;
  }
}

public class CallableDemo {
  public static void main(String[] args) {
    ExecutorService executorService = Executors.newCachedThreadPool();
    List<Future<String>> results = new ArrayList<Future<String>>();
    for (int i = 0; i < 10; i++) {
      results.add(executorService.submit(new TaskWithResult(i+233)));
    }
    for (Future<String> future : results) {
      try {
        System.out.println(future.get());
      } catch (InterruptedException e) {
        e.printStackTrace();
      } catch (ExecutionException e) {
        e.printStackTrace();
      } finally {
        executorService.shutdown();
      }
    }
  }
}