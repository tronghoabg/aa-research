package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class esy extends defpackage.etb {
    public volatile defpackage.esx a;
    public volatile defpackage.esx b;
    private java.util.concurrent.Executor k;

    public esy(android.content.Context context) {
        super(context);
    }

    public abstract java.lang.Object a();

    final void c(defpackage.esx esxVar, java.lang.Object obj) {
        f(obj);
        if (this.b == esxVar) {
            if (this.i) {
                o();
            }
            android.os.SystemClock.uptimeMillis();
            this.b = null;
            e();
        }
    }

    @Override // defpackage.etb
    @java.lang.Deprecated
    public void d(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.c);
        printWriter.print(" mListener=");
        printWriter.println(this.j);
        if (this.e || this.h || this.i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.i);
        }
        if (this.f || this.g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f);
            printWriter.print(" mReset=");
            printWriter.println(this.g);
        }
        if (this.a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.a);
            printWriter.print(" waiting=");
            boolean z = this.a.a;
            printWriter.println(false);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.b);
            printWriter.print(" waiting=");
            boolean z2 = this.b.a;
            printWriter.println(false);
        }
    }

    final void e() {
        if (this.b != null || this.a == null) {
            return;
        }
        boolean z = this.a.a;
        if (this.k == null) {
            this.k = android.os.AsyncTask.THREAD_POOL_EXECUTOR;
        }
        defpackage.esx esxVar = this.a;
        java.util.concurrent.Executor executor = this.k;
        if (esxVar.f == 1) {
            esxVar.f = 2;
            executor.execute(esxVar.c);
            return;
        }
        int i = esxVar.f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            throw new java.lang.IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i2 == 2) {
            throw new java.lang.IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new java.lang.IllegalStateException("We should never reach this state");
    }

    @Override // defpackage.etb
    protected final void g() {
        h();
        this.a = new defpackage.esx(this);
        e();
    }

    @Override // defpackage.etb
    public final void h() {
        if (this.a != null) {
            if (!this.e) {
                o();
            }
            defpackage.esx esxVar = this.b;
            defpackage.esx esxVar2 = this.a;
            if (esxVar != null) {
                boolean z = esxVar2.a;
            } else {
                boolean z2 = esxVar2.a;
                defpackage.esx esxVar3 = this.a;
                esxVar3.d.set(true);
                if (esxVar3.c.cancel(false)) {
                    this.b = this.a;
                    b();
                }
            }
            this.a = null;
        }
    }

    public void b() {
    }

    public void f(java.lang.Object obj) {
    }
}
