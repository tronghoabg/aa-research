package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class zha extends java.util.concurrent.atomic.AtomicReference implements java.util.concurrent.Executor, java.lang.Runnable {
    defpackage.zhc a;
    java.util.concurrent.Executor b;
    defpackage.zim c;
    java.lang.Thread d;

    public zha(java.util.concurrent.Executor executor, defpackage.zhc zhcVar) {
        super(defpackage.zgz.a);
        this.b = executor;
        this.a = zhcVar;
    }

    public final boolean a() {
        return compareAndSet(defpackage.zgz.a, defpackage.zgz.b);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        if (get() == defpackage.zgz.b) {
            this.b = null;
            this.a = null;
            return;
        }
        this.d = java.lang.Thread.currentThread();
        defpackage.zim zimVar = (defpackage.zim) runnable;
        try {
            defpackage.zhc zhcVar = this.a;
            zhcVar.getClass();
            defpackage.zhb zhbVar = zhcVar.a;
            if (zhbVar.a == this.d) {
                this.a = null;
                if (zhbVar.b != null) {
                    throw new java.lang.IllegalStateException();
                }
                zhbVar.b = zimVar;
                java.util.concurrent.Executor executor = this.b;
                executor.getClass();
                zhbVar.c = executor;
                this.b = null;
            } else {
                java.util.concurrent.Executor executor2 = this.b;
                executor2.getClass();
                this.b = null;
                this.c = zimVar;
                try {
                    executor2.execute(this);
                } catch (java.util.concurrent.RejectedExecutionException e) {
                    a();
                    zimVar.p(e);
                }
            }
            this.d = null;
        } catch (java.lang.Throwable th) {
            this.d = null;
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.Executor executor;
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        if (threadCurrentThread != this.d) {
            defpackage.zim zimVar = this.c;
            zimVar.getClass();
            this.c = null;
            zimVar.run();
            return;
        }
        defpackage.zhb zhbVar = new defpackage.zhb();
        zhbVar.a = threadCurrentThread;
        defpackage.zhc zhcVar = this.a;
        zhcVar.getClass();
        zhcVar.a = zhbVar;
        this.a = null;
        try {
            defpackage.zim zimVar2 = this.c;
            zimVar2.getClass();
            this.c = null;
            zimVar2.run();
            while (true) {
                defpackage.zim zimVar3 = zhbVar.b;
                if (zimVar3 == null || (executor = zhbVar.c) == null) {
                    break;
                }
                zhbVar.b = null;
                zhbVar.c = null;
                try {
                    executor.execute(zimVar3);
                } catch (java.util.concurrent.RejectedExecutionException e) {
                    zimVar3.p(e);
                }
            }
            zhbVar.a = null;
        } catch (java.lang.Throwable th) {
            zhbVar.a = null;
            throw th;
        }
    }
}
