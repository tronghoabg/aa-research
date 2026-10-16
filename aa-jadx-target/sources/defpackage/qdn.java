package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qdn implements defpackage.qdo {
    public final android.content.Context b;
    private defpackage.qdv c;
    private final java.util.concurrent.ScheduledExecutorService e;
    private final boolean f;
    private final java.lang.String g;
    private final defpackage.qef h;
    private final defpackage.qdl i;
    private final java.util.Set d = new java.util.concurrent.CopyOnWriteArraySet();
    public final java.util.Set a = new java.util.concurrent.CopyOnWriteArraySet();

    public qdn(defpackage.qdm qdmVar) {
        qdmVar.b.getClass();
        this.e = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
        this.f = true;
        this.i = new defpackage.qdl();
        this.b = qdmVar.b.getApplicationContext();
        this.h = qdmVar.a;
        java.lang.String str = qdmVar.c;
        if (str == null) {
            throw new java.lang.NullPointerException("serviceClassName must be specified");
        }
        this.g = str;
    }

    @Override // defpackage.qdo
    public final void a() {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.qdo) it.next()).a();
        }
    }

    public final defpackage.qdv b() {
        defpackage.qdv qdvVar = this.c;
        if (qdvVar != null) {
            return qdvVar;
        }
        android.content.Context context = this.b;
        defpackage.qdv qdvVar2 = new defpackage.qdv(context.getApplicationContext(), this.g, this.i, this, this, this.e, this.h);
        this.c = qdvVar2;
        return qdvVar2;
    }

    public final void c() {
        java.util.Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((defpackage.qdn) it.next()).c();
        }
    }

    public final boolean d() {
        return b().n();
    }

    public final defpackage.qdp e() {
        return new defpackage.qdp(this.b);
    }

    public final defpackage.rkc f() {
        return new defpackage.rkc(this.b, this.i);
    }

    protected final void finalize() throws java.lang.Throwable {
        if (this.f) {
            this.e.shutdownNow();
        }
    }
}
