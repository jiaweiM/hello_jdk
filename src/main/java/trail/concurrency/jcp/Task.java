package trail.concurrency.jcp;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author JiaweiMao
 * @version 1.0.0
 * @since 06 Mar 2020, 4:00 PM
 */
public class Task implements Runnable
{
    private Date initDate;
    private String name;

    public Task(String name)
    {
        this.name = name;
        this.initDate = new Date();
    }

    @Override
    public void run()
    {
        System.out.printf("%s: Task %s: Created on: %s\n", Thread.currentThread().getName(), name, initDate);
        System.out.printf("%s: Task %s: Started on: %s\n", Thread.currentThread().getName(), name, new Date());

        long duration = (long) (Math.random() * 10);
        System.out.printf("%s: Task %s: Doing a task during %d seconds\n", Thread.currentThread().getName(), name, duration);
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("%s: Task %s: Finished on: %s\n", Thread.currentThread().getName(), name, new Date());
    }
}
