package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum jfj {
    OFF(0, "off", defpackage.zbd.dn),
    BATTERY_OPTIMIZED(1, "battery_optimized", defpackage.zbd.f10do),
    ON(2, "on", defpackage.zbd.dm);

    public final java.lang.String d;
    public final int e;
    public final defpackage.zbd f;

    static {
        defpackage.ygw.p(values());
    }

    jfj(int i, java.lang.String str, defpackage.zbd zbdVar) {
        this.d = str;
        this.e = i;
        this.f = zbdVar;
    }

    public static defpackage.jfj a(java.lang.String str) {
        if (str == null) {
            return b();
        }
        defpackage.jfj jfjVar = ON;
        if (str.equals(jfjVar.d)) {
            return jfjVar;
        }
        defpackage.jfj jfjVar2 = OFF;
        if (str.equals(jfjVar2.d)) {
            return jfjVar2;
        }
        defpackage.jfj jfjVar3 = BATTERY_OPTIMIZED;
        return str.equals(jfjVar3.d) ? jfjVar3 : b();
    }

    private static defpackage.jfj b() {
        int iB = (int) defpackage.acvb.b();
        if (iB != 0) {
            return iB != 1 ? ON : BATTERY_OPTIMIZED;
        }
        return OFF;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        defpackage.xym xymVar = new defpackage.xym("AuxiliaryDisplaySetting");
        xymVar.f("integerValue", this.e);
        xymVar.b("carServiceValue", this.d);
        xymVar.b("uiAction", this.f);
        return xymVar.toString();
    }
}
