package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aeeb extends defpackage.aeea {
    public final boolean a;
    private boolean b = false;
    private boolean c = false;
    private final defpackage.adrq d;

    public aeeb(defpackage.adrq adrqVar, boolean z) {
        this.d = adrqVar;
        this.a = z;
    }

    @Override // defpackage.aeep
    public final void a() {
        this.d.j();
        this.c = true;
    }

    @Override // defpackage.aeep
    public final void b(java.lang.Throwable th) {
        this.d.i("Cancelled by client with StreamObserver.onError()", th);
        this.b = true;
    }

    @Override // defpackage.aeep
    public final void c(java.lang.Object obj) {
        defpackage.ysr.bk(!this.b, "Stream was terminated by error, no further calls are allowed");
        defpackage.ysr.bk(!this.c, "Stream is already completed, no further calls are allowed");
        this.d.n(obj);
    }

    public final void d() {
        boolean z = this.a;
        defpackage.adrq adrqVar = this.d;
        if (z) {
            adrqVar.m(1);
        } else {
            adrqVar.m(2);
        }
    }
}
