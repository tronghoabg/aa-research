package defpackage;

/* loaded from: classes3.dex */
public final class ziy extends adqq {
    public final adqq a;
    private final xus b;

    public ziy(adqq adqqVar) {
        super(null, null);
        this.a = adqqVar;
        this.b = new xus(xts.e());
    }

    private final void k(Runnable runnable) {
        if (xts.d()) {
            runnable.run();
            return;
        }
        xus xusVar = this.b;
        int i = xur.a;
        new xuo(xusVar.a, runnable).run();
    }

    @Override // defpackage.adqq
    public final void a(adnq adnqVar, admc admcVar) {
        k(new uze((Object) this, (Object) adnqVar, (Object) admcVar, 8, (byte[]) null));
    }

    @Override // defpackage.adqq
    public final void be(admc admcVar) {
        k(new xab(this, admcVar, 10, null));
    }

    @Override // defpackage.adqq
    public final void g(Object obj) {
        k(new xab(this, obj, 11, null));
    }

    @Override // defpackage.adqq
    public final void h() {
        k(new wxj(this.a, 17));
    }
}
