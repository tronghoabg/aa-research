package com.bytedance.sdk.component.bcc.oa;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.api.f;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class xs extends ThreadPoolExecutor {
    private boolean lw;
    private int moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f24957oa;
    private final String uef;
    private int yo;

    public static class uef {
        private String uef = "cache";

        /* renamed from: oa, reason: collision with root package name */
        private int f24959oa = 4;
        private int yo = 100;
        private int moa = 0;
        private long lw = 30000;
        private boolean ivm = false;
        private TimeUnit xs = TimeUnit.MILLISECONDS;
        private boolean bcc = false;
        private BlockingQueue<Runnable> cz = new PriorityBlockingQueue();
        private ThreadFactory zjm = null;

        public uef lw(int i5) {
            return this;
        }

        public uef moa(int i5) {
            return this;
        }

        public uef oa(int i5) {
            this.yo = i5;
            return this;
        }

        public uef uef(String str) {
            this.uef = str;
            return this;
        }

        public uef yo(int i5) {
            this.moa = i5;
            return this;
        }

        public uef oa(boolean z2) {
            this.bcc = z2;
            return this;
        }

        public uef uef(int i5) {
            this.f24959oa = i5;
            return this;
        }

        public uef uef(long j8) {
            this.lw = j8;
            return this;
        }

        public uef uef(boolean z2) {
            this.ivm = z2;
            return this;
        }

        public xs uef() {
            if (this.zjm == null) {
                this.zjm = new lw(this.uef);
            }
            if (this.f24959oa < 0) {
                this.f24959oa = 8;
            }
            if (this.f24959oa == 0) {
                this.cz = new SynchronousQueue();
            }
            if (this.cz == null) {
                this.cz = new LinkedBlockingQueue();
            }
            if (this.yo > 100) {
                this.yo = 100;
            }
            int i5 = this.yo;
            int i10 = this.f24959oa;
            if (i5 < i10) {
                this.yo = i10;
            }
            return new xs(this);
        }
    }

    private void oa() {
        try {
            if (this.f24957oa != 0 && getCorePoolSize() < this.yo) {
                int size = getQueue().size();
                if (getActiveCount() < this.f24957oa || size < this.moa) {
                    return;
                }
                setCorePoolSize(this.yo);
            }
        } catch (Exception e7) {
            e7.getMessage();
        }
    }

    private void yo() {
        try {
            if (this.f24957oa != 0 && getCorePoolSize() > this.f24957oa && getQueue().size() == 0) {
                setCorePoolSize(this.f24957oa);
            }
        } catch (Exception e7) {
            e7.getMessage();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        boolean z2 = runnable instanceof yo;
        if (z2) {
            ((yo) runnable).setAfterTimestamp(SystemClock.elapsedRealtime());
        }
        super.afterExecute(runnable, th);
        if (z2) {
            yo yoVar = (yo) runnable;
            yoVar.getName();
            yoVar.getPriority();
            yoVar.getSubmitTimestamp();
            yoVar.getBeforeTimestamp();
            yoVar.getAfterTimestamp();
        }
        yo();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof yo) {
            ((yo) runnable).setBeforeTimestamp(SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bytedance.sdk.component.bcc.oa.uef uefVarUef;
        if (!(runnable instanceof yo)) {
            runnable = new yo("unknown", runnable) { // from class: com.bytedance.sdk.component.bcc.oa.xs.2
                @Override // java.lang.Runnable
                public void run() {
                    Runnable target = getTarget();
                    if (target != null) {
                        target.run();
                    }
                }
            };
        }
        if (!"cache".equals(this.uef)) {
            String name = Thread.currentThread().getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(lw.uef(this.uef)) && (uefVarUef = moa.uef()) != null) {
                uefVarUef.uef(this, (yo) runnable);
            }
        }
        ((yo) runnable).setSubmitTimestamp(SystemClock.elapsedRealtime());
        try {
            super.execute(runnable);
            oa();
        } catch (Throwable th) {
            uef(runnable, th);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("aidl".equals(this.uef)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return "aidl".equals(this.uef) ? Collections.EMPTY_LIST : super.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        int priority;
        String name;
        runnable.getClass();
        final RunnableFuture runnableFutureNewTaskFor = newTaskFor(runnable, null);
        if (runnable instanceof yo) {
            yo yoVar = (yo) runnable;
            priority = yoVar.getPriority();
            name = yoVar.getName();
        } else {
            priority = 6;
            name = "";
        }
        if (priority == 0 || TextUtils.isEmpty(name)) {
            new RuntimeException();
        }
        execute(new yo(name, priority) { // from class: com.bytedance.sdk.component.bcc.oa.xs.1
            @Override // java.lang.Runnable
            public void run() {
                runnableFutureNewTaskFor.run();
            }
        });
        return runnableFutureNewTaskFor;
    }

    public void uef(uef uefVar) {
        try {
            if (uefVar.f24959oa >= 0 && this.f24957oa != uefVar.f24959oa) {
                int i5 = uefVar.f24959oa;
                this.f24957oa = i5;
                setCorePoolSize(i5);
            }
            this.yo = uefVar.yo;
            this.moa = uefVar.moa;
            allowCoreThreadTimeOut(uefVar.ivm);
            this.lw = uefVar.bcc;
        } catch (Throwable th) {
            th.getMessage();
        }
        String unused = uefVar.uef;
        int unused2 = uefVar.f24959oa;
        int unused3 = uefVar.yo;
        long unused4 = uefVar.lw;
        int unused5 = uefVar.moa;
        boolean unused6 = uefVar.bcc;
        BlockingQueue unused7 = uefVar.cz;
    }

    private xs(uef uefVar) {
        super(uefVar.f24959oa, f.API_PRIORITY_OTHER, uefVar.lw, uefVar.xs, (BlockingQueue<Runnable>) uefVar.cz, uefVar.zjm);
        this.lw = false;
        String unused = uefVar.uef;
        int unused2 = uefVar.f24959oa;
        int unused3 = uefVar.yo;
        long unused4 = uefVar.lw;
        int unused5 = uefVar.moa;
        boolean unused6 = uefVar.bcc;
        BlockingQueue unused7 = uefVar.cz;
        this.uef = uefVar.uef;
        this.f24957oa = uefVar.f24959oa;
        this.yo = uefVar.yo;
        this.moa = uefVar.moa;
        allowCoreThreadTimeOut(uefVar.ivm);
        this.lw = uefVar.bcc;
    }

    private void uef(Runnable runnable, Throwable th) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Handler handlerOa = moa.oa();
                if (handlerOa != null) {
                    handlerOa.post(runnable);
                    return;
                }
                return;
            }
            runnable.run();
        } catch (Throwable unused) {
        }
    }

    public boolean uef() {
        return this.lw;
    }
}
