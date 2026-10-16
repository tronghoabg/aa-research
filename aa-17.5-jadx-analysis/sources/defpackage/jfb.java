package defpackage;

/* loaded from: classes.dex */
public enum jfb {
    OFF(0, "off", yzy.dn),
    BATTERY_OPTIMIZED(1, "battery_optimized", yzy.f10do),
    ON(2, "on", yzy.dm);

    public final String d;
    public final int e;
    public final yzy f;

    static {
        yfq.p(values());
    }

    jfb(int i, String str, yzy yzyVar) {
        this.d = str;
        this.e = i;
        this.f = yzyVar;
    }

    public static jfb a(String str) {
        if (str == null) {
            return b();
        }
        jfb jfbVar = ON;
        if (str.equals(jfbVar.d)) {
            return jfbVar;
        }
        jfb jfbVar2 = OFF;
        if (str.equals(jfbVar2.d)) {
            return jfbVar2;
        }
        jfb jfbVar3 = BATTERY_OPTIMIZED;
        return str.equals(jfbVar3.d) ? jfbVar3 : b();
    }

    private static jfb b() {
        int iB = (int) actz.b();
        return iB != 0 ? iB != 1 ? ON : BATTERY_OPTIMIZED : OFF;
    }

    @Override // java.lang.Enum
    public final String toString() {
        xxg xxgVar = new xxg("AuxiliaryDisplaySetting");
        xxgVar.f("integerValue", this.e);
        xxgVar.b("carServiceValue", this.d);
        xxgVar.b("uiAction", this.f);
        return xxgVar.toString();
    }
}
