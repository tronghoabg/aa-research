package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fnj {
    public final android.content.Context a;
    public final java.lang.Object b;
    public final java.util.LinkedHashSet c;
    public java.lang.Object d;
    private final defpackage.ajer e;

    protected fnj(android.content.Context context, defpackage.ajer ajerVar) {
        this.e = ajerVar;
        android.content.Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        this.b = new java.lang.Object();
        this.c = new java.util.LinkedHashSet();
    }

    public abstract java.lang.Object b();

    public abstract void d();

    public abstract void e();

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void f(java.lang.Object obj) {
        synchronized (this.b) {
            java.lang.Object obj2 = this.d;
            if (obj2 == null || !defpackage.afga.f(obj2, obj)) {
                this.d = obj;
                this.e.d.execute(new defpackage.etd(defpackage.afga.aZ(this.c), this, 10, (char[]) null));
            }
        }
    }
}
