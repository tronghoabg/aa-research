package defpackage;

/* loaded from: classes.dex */
final class aedb extends aeda {
    public final boolean a;
    private boolean b = false;
    private boolean c = false;
    private final adqq d;

    public aedb(adqq adqqVar, boolean z) {
        this.d = adqqVar;
        this.a = z;
    }

    @Override // defpackage.aedp
    public final void a() {
        this.d.j();
        this.c = true;
    }

    @Override // defpackage.aedp
    public final void b(Throwable th) {
        this.d.i("Cancelled by client with StreamObserver.onError()", th);
        this.b = true;
    }

    @Override // defpackage.aedp
    public final void c(Object obj) {
        woy.aa(!this.b, "Stream was terminated by error, no further calls are allowed");
        woy.aa(!this.c, "Stream is already completed, no further calls are allowed");
        this.d.n(obj);
    }

    public final void d() {
        boolean z = this.a;
        adqq adqqVar = this.d;
        if (z) {
            adqqVar.m(1);
        } else {
            adqqVar.m(2);
        }
    }
}
