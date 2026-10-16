package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kja extends defpackage.eqp {
    private final defpackage.kiz a;

    public kja() {
        super(null);
        this.a = new defpackage.kiz(this);
    }

    public static defpackage.kja a() {
        return (defpackage.kja) defpackage.mkp.a.b(defpackage.kja.class, new defpackage.lga(1));
    }

    @Override // defpackage.eqp
    protected final void c() {
        defpackage.epy lifecycle = ((defpackage.lht) defpackage.mkp.a.i(defpackage.lht.class)).getLifecycle();
        defpackage.kiz kizVar = this.a;
        lifecycle.c(kizVar);
        defpackage.yqm yqmVar = defpackage.kit.a;
        ((defpackage.kit) defpackage.mkp.a.i(defpackage.kit.class)).v(kizVar);
    }

    @Override // defpackage.eqp
    protected final void d() {
        defpackage.epy lifecycle = defpackage.ler.c().getLifecycle();
        defpackage.kiz kizVar = this.a;
        lifecycle.d(kizVar);
        defpackage.kit.b().w(kizVar);
    }
}
