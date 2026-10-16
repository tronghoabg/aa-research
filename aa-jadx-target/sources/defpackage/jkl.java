package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jkl {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.CarDisplayInfo");
    public defpackage.jhl b;
    private final defpackage.jkr c;

    public jkl(defpackage.jkr jkrVar) {
        this.c = jkrVar;
    }

    public static int a(float f, int i) {
        return java.lang.Math.round((f * 160.0f) / i);
    }

    public final void b(defpackage.jhi jhiVar, com.google.android.gms.car.display.CarRegionId carRegionId, java.util.UUID uuid) {
        if (defpackage.acwv.a.fF().t()) {
            defpackage.jkr jkrVar = this.c;
            defpackage.jkj jkjVar = new defpackage.jkj();
            jkjVar.n(carRegionId);
            jkjVar.l(7);
            jkjVar.m(999);
            jkjVar.f(192);
            defpackage.ive iveVar = jhiVar.a;
            int i = iveVar.g;
            int i2 = iveVar.h;
            jkjVar.d(new android.graphics.Rect(i, i2, iveVar.e + i, iveVar.f + i2));
            jkjVar.g(new jhq(iveVar.n));
            jkjVar.e(new jkk(jkrVar));
            jkjVar.b(uuid);
            defpackage.jhl jhlVarJ = jkrVar.j(jkjVar.a());
            this.b = jhlVarJ;
            if (jhlVarJ != null) {
                jhlVarJ.aK();
            }
        }
    }

    public final void c() {
        defpackage.jhl jhlVar = this.b;
        if (jhlVar != null) {
            ((defpackage.inh) this.c).R(jhlVar, null, null, true, true, false, null);
        }
    }
}
