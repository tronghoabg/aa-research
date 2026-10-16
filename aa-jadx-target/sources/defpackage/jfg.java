package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum jfg {
    PROVIDED_BY_HU(defpackage.zbd.dJ),
    LEFT(defpackage.zbd.dK),
    RIGHT(defpackage.zbd.dL);

    public static final defpackage.ygw e;
    public final defpackage.zbd f;
    public static final defpackage.jfg d = PROVIDED_BY_HU;

    static {
        j$.util.stream.Stream map = j$.util.DesugarArrays.stream(values()).map(new defpackage.ilz(13));
        int i = defpackage.ygw.d;
        e = (defpackage.ygw) map.collect(defpackage.yds.a);
    }

    jfg(defpackage.zbd zbdVar) {
        this.f = zbdVar;
    }

    public static defpackage.jfg a(java.lang.String str) {
        defpackage.jfg jfgVar = PROVIDED_BY_HU;
        if (jfgVar.name().equals(str)) {
            return jfgVar;
        }
        defpackage.jfg jfgVar2 = LEFT;
        if (jfgVar2.name().equals(str)) {
            return jfgVar2;
        }
        defpackage.jfg jfgVar3 = RIGHT;
        if (jfgVar3.name().equals(str)) {
            return jfgVar3;
        }
        throw new java.lang.IllegalArgumentException("Unknown DriverPositionSetting ".concat(java.lang.String.valueOf(str)));
    }
}
