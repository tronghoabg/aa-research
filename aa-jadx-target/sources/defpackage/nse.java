package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nse implements defpackage.lhn {
    public final defpackage.eqg a;
    public android.content.ComponentName c;
    public android.content.ComponentName d;
    private nsc g;
    private final defpackage.nst e = new nsd(this, 0);
    private final java.util.Map f = new android.util.ArrayMap();
    public final defpackage.eqp b = defpackage.tcu.v(defpackage.mpj.b().h, new defpackage.nqv(6));

    public nse(defpackage.eqg eqgVar) {
        this.a = eqgVar;
    }

    public static defpackage.nse b() {
        return (defpackage.nse) defpackage.mkp.a.b(defpackage.nse.class, new defpackage.mbf(15));
    }

    public final nsc a() {
        nsc nscVar = this.g;
        nscVar.getClass();
        return nscVar;
    }

    @Override // defpackage.lhn
    public final void d() {
        defpackage.nte.c().b().A(this.e);
        this.g = null;
    }

    public final void e(defpackage.ntb ntbVar) {
        nsc nscVar;
        nsc nscVar2;
        if (com.google.android.gms.car.display.CarDisplayId.b(ntbVar.o) && (nscVar2 = this.g) != (nscVar = (nsc) j$.util.Map.-EL.computeIfAbsent(this.f, ntbVar.m(), new defpackage.jxj(this, ntbVar, 11)))) {
            if (nscVar2 != null) {
                nscVar2.g();
            }
            nscVar.d();
            this.g = nscVar;
        }
    }

    @Override // defpackage.lhn
    public final void eQ() {
        this.f.clear();
        this.c = null;
        this.d = null;
        defpackage.nte.c().b().w(this.e);
        e(defpackage.nte.c().b());
    }
}
