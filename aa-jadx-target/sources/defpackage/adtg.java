package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adtg implements adtk {
    public defpackage.ador a;
    final /* synthetic */ defpackage.adth b;
    public final defpackage.adrq c;

    public adtg(defpackage.adth adthVar, defpackage.adrq adrqVar) {
        this.b = adthVar;
        this.c = adrqVar;
    }

    public final void a(defpackage.ador adorVar, defpackage.adtj adtjVar, defpackage.adnd adndVar) {
        int i = defpackage.aefb.a;
        defpackage.adth adthVar = this.b;
        defpackage.adks adksVarK = adthVar.k();
        if (adorVar.p == defpackage.adoo.CANCELLED && adksVarK != null && adksVarK.f()) {
            adorVar = adthVar.f.b();
            adndVar = new defpackage.adnd();
        }
        adthVar.c.execute(new defpackage.adte(this, adorVar, adndVar));
    }

    public final void b(defpackage.ador adorVar) {
        this.a = adorVar;
        this.b.h.c(adorVar);
    }

    public final void c(defpackage.adnd adndVar) {
        int i = defpackage.aefb.a;
        this.b.c.execute(new adtc(this, adndVar));
    }

    public final void d(aeax aeaxVar) {
        int i = defpackage.aefb.a;
        this.b.c.execute(new adtd(this, aeaxVar));
    }

    public final void e() {
        defpackage.adth adthVar = this.b;
        if (adthVar.b.a.a()) {
            return;
        }
        int i = defpackage.aefb.a;
        adthVar.c.execute(new adtf(this));
    }
}
