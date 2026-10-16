package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.internal.Util;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue;", "", "AwaitIdleTask", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TaskQueue {

    /* renamed from: a, reason: collision with root package name */
    public final TaskRunner f42525a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42526b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f42527c;

    /* renamed from: d, reason: collision with root package name */
    public Task f42528d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f42529e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f42530f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue$AwaitIdleTask;", "Lokhttp3/internal/concurrent/Task;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class AwaitIdleTask extends Task {

        /* renamed from: e, reason: collision with root package name */
        public final CountDownLatch f42531e;

        public AwaitIdleTask() {
            super(AbstractC3340k.k(" awaitIdle", Util.f42444g), false);
            this.f42531e = new CountDownLatch(1);
        }

        @Override // okhttp3.internal.concurrent.Task
        public final long a() {
            this.f42531e.countDown();
            return -1L;
        }
    }

    public TaskQueue(TaskRunner taskRunner, String name) {
        AbstractC3340k.e(taskRunner, "taskRunner");
        AbstractC3340k.e(name, "name");
        this.f42525a = taskRunner;
        this.f42526b = name;
        this.f42529e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = Util.f42438a;
        synchronized (this.f42525a) {
            if (b()) {
                this.f42525a.d(this);
            }
        }
    }

    public final boolean b() {
        Task task = this.f42528d;
        if (task != null && task.f42522b) {
            this.f42530f = true;
        }
        ArrayList arrayList = this.f42529e;
        int size = arrayList.size() - 1;
        boolean z2 = false;
        if (size < 0) {
            return false;
        }
        while (true) {
            int i5 = size - 1;
            if (((Task) arrayList.get(size)).f42522b) {
                Task task2 = (Task) arrayList.get(size);
                TaskRunner.f42533h.getClass();
                if (TaskRunner.f42535j.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(task2, this, "canceled");
                }
                arrayList.remove(size);
                z2 = true;
            }
            if (i5 < 0) {
                return z2;
            }
            size = i5;
        }
    }

    public final void c(Task task, long j8) {
        AbstractC3340k.e(task, "task");
        synchronized (this.f42525a) {
            if (!this.f42527c) {
                if (e(task, j8, false)) {
                    this.f42525a.d(this);
                }
            } else if (task.f42522b) {
                TaskRunner.f42533h.getClass();
                if (TaskRunner.f42535j.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                TaskRunner.f42533h.getClass();
                if (TaskRunner.f42535j.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(okhttp3.internal.concurrent.Task r11, long r12, boolean r14) {
        /*
            r10 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.AbstractC3340k.e(r11, r0)
            okhttp3.internal.concurrent.TaskQueue r0 = r11.f42523c
            if (r0 != r10) goto La
            goto Le
        La:
            if (r0 != 0) goto L98
            r11.f42523c = r10
        Le:
            okhttp3.internal.concurrent.TaskRunner r0 = r10.f42525a
            okhttp3.internal.concurrent.TaskRunner$RealBackend r0 = r0.f42536a
            long r0 = java.lang.System.nanoTime()
            long r2 = r0 + r12
            java.util.ArrayList r4 = r10.f42529e
            int r5 = r4.indexOf(r11)
            r6 = 0
            r7 = -1
            if (r5 == r7) goto L40
            long r8 = r11.f42524d
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 > 0) goto L3d
            okhttp3.internal.concurrent.TaskRunner$Companion r12 = okhttp3.internal.concurrent.TaskRunner.f42533h
            r12.getClass()
            java.util.logging.Logger r12 = okhttp3.internal.concurrent.TaskRunner.f42535j
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r12 = r12.isLoggable(r13)
            if (r12 == 0) goto L97
            java.lang.String r12 = "already scheduled"
            okhttp3.internal.concurrent.TaskLoggerKt.a(r11, r10, r12)
            return r6
        L3d:
            r4.remove(r5)
        L40:
            r11.f42524d = r2
            okhttp3.internal.concurrent.TaskRunner$Companion r5 = okhttp3.internal.concurrent.TaskRunner.f42533h
            r5.getClass()
            java.util.logging.Logger r5 = okhttp3.internal.concurrent.TaskRunner.f42535j
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            boolean r5 = r5.isLoggable(r8)
            if (r5 == 0) goto L6d
            if (r14 == 0) goto L5f
            long r2 = r2 - r0
            java.lang.String r14 = okhttp3.internal.concurrent.TaskLoggerKt.b(r2)
            java.lang.String r2 = "run again after "
            java.lang.String r14 = kotlin.jvm.internal.AbstractC3340k.k(r14, r2)
            goto L6a
        L5f:
            long r2 = r2 - r0
            java.lang.String r14 = okhttp3.internal.concurrent.TaskLoggerKt.b(r2)
            java.lang.String r2 = "scheduled after "
            java.lang.String r14 = kotlin.jvm.internal.AbstractC3340k.k(r14, r2)
        L6a:
            okhttp3.internal.concurrent.TaskLoggerKt.a(r11, r10, r14)
        L6d:
            java.util.Iterator r14 = r4.iterator()
            r2 = r6
        L72:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L89
            java.lang.Object r3 = r14.next()
            okhttp3.internal.concurrent.Task r3 = (okhttp3.internal.concurrent.Task) r3
            long r8 = r3.f42524d
            long r8 = r8 - r0
            int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r3 <= 0) goto L86
            goto L8a
        L86:
            int r2 = r2 + 1
            goto L72
        L89:
            r2 = r7
        L8a:
            if (r2 != r7) goto L90
            int r2 = r4.size()
        L90:
            r4.add(r2, r11)
            if (r2 != 0) goto L97
            r11 = 1
            return r11
        L97:
            return r6
        L98:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "task is in multiple queues"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.concurrent.TaskQueue.e(okhttp3.internal.concurrent.Task, long, boolean):boolean");
    }

    public final void f() {
        byte[] bArr = Util.f42438a;
        synchronized (this.f42525a) {
            this.f42527c = true;
            if (b()) {
                this.f42525a.d(this);
            }
        }
    }

    /* renamed from: toString, reason: from getter */
    public final String getF42526b() {
        return this.f42526b;
    }
}
