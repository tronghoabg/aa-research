package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum jfk {
    OFF(0, "off", defpackage.zbd.dn),
    BATTERY_OPTIMIZED(1, "battery_optimized", defpackage.zbd.dq),
    ON(2, "on", defpackage.zbd.dp);

    public final java.lang.String d;
    public final int e;
    public final defpackage.zbd f;

    static {
        defpackage.ygw.p(values());
    }

    jfk(int i, java.lang.String str, defpackage.zbd zbdVar) {
        this.d = str;
        this.e = i;
        this.f = zbdVar;
    }

    public static defpackage.jfk a(java.lang.String str) {
        if (str == null) {
            return b();
        }
        defpackage.jfk jfkVar = ON;
        if (str.equals(jfkVar.d)) {
            return jfkVar;
        }
        defpackage.jfk jfkVar2 = OFF;
        if (str.equals(jfkVar2.d)) {
            return jfkVar2;
        }
        defpackage.jfk jfkVar3 = BATTERY_OPTIMIZED;
        return str.equals(jfkVar3.d) ? jfkVar3 : b();
    }

    private static defpackage.jfk b() {
        int iC = (int) defpackage.acvb.c();
        if (iC != 0) {
            return iC != 1 ? ON : BATTERY_OPTIMIZED;
        }
        return OFF;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        defpackage.xym xymVar = new defpackage.xym("ClusterDisplaySetting");
        xymVar.f("integerValue", this.e);
        xymVar.b("carServiceValue", this.d);
        xymVar.b("uiAction", this.f);
        return xymVar.toString();
    }
}
