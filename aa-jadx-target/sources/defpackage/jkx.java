package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jkx {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.WM.WATERMARK");
    public defpackage.jhl b;
    private final defpackage.jkr e;
    private final defpackage.jfa f;
    private final defpackage.jfo g;
    private final defpackage.xzi d = defpackage.ysr.aQ(new defpackage.imy(6));
    public android.util.Size c = null;

    public jkx(defpackage.jkr jkrVar, defpackage.jfa jfaVar, defpackage.jfo jfoVar) {
        this.e = jkrVar;
        this.f = jfaVar;
        this.g = jfoVar;
    }

    public final void a(defpackage.jhi jhiVar, com.google.android.gms.car.display.CarRegionId carRegionId, java.util.UUID uuid) {
        j$.util.Optional optionalX = ((defpackage.imi) this.f).X();
        optionalX.isPresent();
        com.google.android.gms.carsetup.CarInfoInternal carInfoInternal = ((defpackage.iuk) optionalX.get()).r;
        long j = carInfoInternal != null ? carInfoInternal.q : -1L;
        boolean zContains = ((defpackage.yhx) this.d.fF()).contains(java.lang.Long.valueOf(j));
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(2267)).I("Using cert serial number (0x%x) to determine watermark visibility. showWatermark: %b", j, zContains);
        this.g.e(defpackage.zbe.CAR_SERVICE, zContains ? defpackage.zbd.ul : defpackage.zbd.um);
        if (zContains) {
            defpackage.jkr jkrVar = this.e;
            defpackage.jkj jkjVar = new defpackage.jkj();
            jkjVar.n(carRegionId);
            jkjVar.l(7);
            jkjVar.m(1000);
            defpackage.ive iveVar = jhiVar.a;
            int i = iveVar.g;
            int i2 = iveVar.h;
            int i3 = iveVar.e;
            int i4 = iveVar.f;
            jkjVar.d(new android.graphics.Rect(i, i2, i + i3, i2 + i4));
            jkjVar.g(new jhq(iveVar.n));
            jkjVar.e(new defpackage.jkw(this, jkrVar));
            jkjVar.b(uuid);
            defpackage.jhl jhlVarJ = jkrVar.j(jkjVar.a());
            this.b = jhlVarJ;
            if (jhlVarJ != null) {
                jhlVarJ.aK();
            }
            this.c = new android.util.Size(i3, i4);
        }
    }

    public final void b() {
        defpackage.jhl jhlVar = this.b;
        if (jhlVar != null) {
            ((defpackage.inh) this.e).R(jhlVar, null, null, true, true, false, null);
        }
        this.c = null;
    }
}
