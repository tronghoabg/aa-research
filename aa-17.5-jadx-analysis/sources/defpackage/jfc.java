package defpackage;

/* loaded from: classes.dex */
public enum jfc {
    OFF(0, "off", yzy.dn),
    BATTERY_OPTIMIZED(1, "battery_optimized", yzy.dq),
    ON(2, "on", yzy.dp);

    public final String d;
    public final int e;
    public final yzy f;

    static {
        yfq.p(values());
    }

    jfc(int i, String str, yzy yzyVar) {
        this.d = str;
        this.e = i;
        this.f = yzyVar;
    }

    public static jfc a(String str) {
        if (str == null) {
            return b();
        }
        jfc jfcVar = ON;
        if (str.equals(jfcVar.d)) {
            return jfcVar;
        }
        jfc jfcVar2 = OFF;
        if (str.equals(jfcVar2.d)) {
            return jfcVar2;
        }
        jfc jfcVar3 = BATTERY_OPTIMIZED;
        return str.equals(jfcVar3.d) ? jfcVar3 : b();
    }

    private static jfc b() {
        int iC = (int) actz.c();
        return iC != 0 ? iC != 1 ? ON : BATTERY_OPTIMIZED : OFF;
    }

    @Override // java.lang.Enum
    public final String toString() {
        xxg xxgVar = new xxg("ClusterDisplaySetting");
        xxgVar.f("integerValue", this.e);
        xxgVar.b("carServiceValue", this.d);
        xxgVar.b("uiAction", this.f);
        return xxgVar.toString();
    }
}
