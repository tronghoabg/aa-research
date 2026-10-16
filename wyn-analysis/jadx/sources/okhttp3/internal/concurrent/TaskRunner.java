package okhttp3.internal.concurrent;

import bg.ThreadFactoryC1532a;
import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner;", "", "Backend", "Companion", "RealBackend", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TaskRunner {

    /* renamed from: h, reason: collision with root package name */
    public static final Companion f42533h = new Companion(0);

    /* renamed from: i, reason: collision with root package name */
    public static final TaskRunner f42534i;

    /* renamed from: j, reason: collision with root package name */
    public static final Logger f42535j;

    /* renamed from: a, reason: collision with root package name */
    public final RealBackend f42536a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f42538c;

    /* renamed from: d, reason: collision with root package name */
    public long f42539d;

    /* renamed from: b, reason: collision with root package name */
    public int f42537b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f42540e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f42541f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final TaskRunner$runnable$1 f42542g = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
        @Override // java.lang.Runnable
        public final void run() {
            Task taskC;
            long jNanoTime;
            while (true) {
                TaskRunner taskRunner = this.f42544a;
                synchronized (taskRunner) {
                    taskC = taskRunner.c();
                }
                if (taskC == null) {
                    return;
                }
                TaskQueue taskQueue = taskC.f42523c;
                AbstractC3340k.b(taskQueue);
                TaskRunner taskRunner2 = this.f42544a;
                TaskRunner.f42533h.getClass();
                boolean zIsLoggable = TaskRunner.f42535j.isLoggable(Level.FINE);
                if (zIsLoggable) {
                    TaskRunner.RealBackend realBackend = taskQueue.f42525a.f42536a;
                    jNanoTime = System.nanoTime();
                    TaskLoggerKt.a(taskC, taskQueue, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    TaskRunner.a(taskRunner2, taskC);
                    if (zIsLoggable) {
                        TaskRunner.RealBackend realBackend2 = taskQueue.f42525a.f42536a;
                        TaskLoggerKt.a(taskC, taskQueue, AbstractC3340k.k(TaskLoggerKt.b(System.nanoTime() - jNanoTime), "finished run in "));
                    }
                } finally {
                }
            }
        }
    };

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Backend;", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface Backend {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Companion;", "", "<init>", "()V", "Lokhttp3/internal/concurrent/TaskRunner;", "INSTANCE", "Lokhttp3/internal/concurrent/TaskRunner;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$RealBackend;", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class RealBackend implements Backend {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadPoolExecutor f42543a;

        public RealBackend(ThreadFactoryC1532a threadFactoryC1532a) {
            this.f42543a = new ThreadPoolExecutor(0, f.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryC1532a);
        }

        public final void a(TaskRunner$runnable$1 runnable) {
            AbstractC3340k.e(runnable, "runnable");
            this.f42543a.execute(runnable);
        }
    }

    static {
        String name = AbstractC3340k.k(" TaskRunner", Util.f42444g);
        AbstractC3340k.e(name, "name");
        f42534i = new TaskRunner(new RealBackend(new ThreadFactoryC1532a(0, name, true)));
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        AbstractC3340k.d(logger, "getLogger(TaskRunner::class.java.name)");
        f42535j = logger;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [okhttp3.internal.concurrent.TaskRunner$runnable$1] */
    public TaskRunner(RealBackend realBackend) {
        this.f42536a = realBackend;
    }

    public static final void a(TaskRunner taskRunner, Task task) {
        taskRunner.getClass();
        byte[] bArr = Util.f42438a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(task.f42521a);
        try {
            long jA = task.a();
            synchronized (taskRunner) {
                taskRunner.b(task, jA);
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (taskRunner) {
                taskRunner.b(task, -1L);
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(Task task, long j8) {
        byte[] bArr = Util.f42438a;
        TaskQueue taskQueue = task.f42523c;
        AbstractC3340k.b(taskQueue);
        if (taskQueue.f42528d != task) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = taskQueue.f42530f;
        taskQueue.f42530f = false;
        taskQueue.f42528d = null;
        this.f42540e.remove(taskQueue);
        if (j8 != -1 && !z2 && !taskQueue.f42527c) {
            taskQueue.e(task, j8, true);
        }
        if (taskQueue.f42529e.isEmpty()) {
            return;
        }
        this.f42541f.add(taskQueue);
    }

    public final Task c() {
        long j8;
        Task task;
        boolean z2;
        byte[] bArr = Util.f42438a;
        while (true) {
            ArrayList arrayList = this.f42541f;
            if (arrayList.isEmpty()) {
                return null;
            }
            RealBackend realBackend = this.f42536a;
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            Task task2 = null;
            while (true) {
                if (!it.hasNext()) {
                    j8 = jNanoTime;
                    task = null;
                    z2 = false;
                    break;
                }
                Task task3 = (Task) ((TaskQueue) it.next()).f42529e.get(0);
                j8 = jNanoTime;
                task = null;
                long jMax = Math.max(0L, task3.f42524d - j8);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (task2 != null) {
                        z2 = true;
                        break;
                    }
                    task2 = task3;
                }
                jNanoTime = j8;
            }
            ArrayList arrayList2 = this.f42540e;
            if (task2 != null) {
                byte[] bArr2 = Util.f42438a;
                task2.f42524d = -1L;
                TaskQueue taskQueue = task2.f42523c;
                AbstractC3340k.b(taskQueue);
                taskQueue.f42529e.remove(task2);
                arrayList.remove(taskQueue);
                taskQueue.f42528d = task2;
                arrayList2.add(taskQueue);
                if (z2 || (!this.f42538c && !arrayList.isEmpty())) {
                    realBackend.a(this.f42542g);
                }
                return task2;
            }
            if (this.f42538c) {
                if (jMin >= this.f42539d - j8) {
                    return task;
                }
                notify();
                return task;
            }
            this.f42538c = true;
            this.f42539d = j8 + jMin;
            try {
                try {
                    long j10 = jMin / 1000000;
                    Long.signum(j10);
                    long j11 = jMin - (1000000 * j10);
                    if (j10 > 0 || jMin > 0) {
                        wait(j10, (int) j11);
                    }
                } catch (InterruptedException unused) {
                    int size = arrayList2.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i5 = size - 1;
                            ((TaskQueue) arrayList2.get(size)).b();
                            if (i5 < 0) {
                                break;
                            }
                            size = i5;
                        }
                    }
                    int size2 = arrayList.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i10 = size2 - 1;
                            TaskQueue taskQueue2 = (TaskQueue) arrayList.get(size2);
                            taskQueue2.b();
                            if (taskQueue2.f42529e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                            if (i10 < 0) {
                                break;
                            }
                            size2 = i10;
                        }
                    }
                }
            } finally {
                this.f42538c = false;
            }
        }
    }

    public final void d(TaskQueue taskQueue) {
        AbstractC3340k.e(taskQueue, "taskQueue");
        byte[] bArr = Util.f42438a;
        if (taskQueue.f42528d == null) {
            boolean zIsEmpty = taskQueue.f42529e.isEmpty();
            ArrayList arrayList = this.f42541f;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                AbstractC3340k.e(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        boolean z2 = this.f42538c;
        RealBackend realBackend = this.f42536a;
        if (z2) {
            notify();
        } else {
            realBackend.a(this.f42542g);
        }
    }

    public final TaskQueue e() {
        int i5;
        synchronized (this) {
            i5 = this.f42537b;
            this.f42537b = i5 + 1;
        }
        return new TaskQueue(this, AbstractC3340k.k(Integer.valueOf(i5), "Q"));
    }
}
