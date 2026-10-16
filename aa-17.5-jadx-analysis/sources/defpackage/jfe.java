package defpackage;

/* loaded from: classes.dex */
public enum jfe {
    OFF(0, "off", yzy.dl),
    ON(1, "on", yzy.dk);

    public final String c;
    public final yzy d;
    private final int f;

    static {
        yfq.p(values());
    }

    jfe(int i, String str, yzy yzyVar) {
        this.c = str;
        this.f = i;
        this.d = yzyVar;
    }

    public static jfe a(String str) {
        if (str == null) {
            return OFF;
        }
        jfe jfeVar = ON;
        if (str.equals(jfeVar.c)) {
            return jfeVar;
        }
        jfe jfeVar2 = OFF;
        str.equals(jfeVar2.c);
        return jfeVar2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        xxg xxgVar = new xxg("MultiDisplaySetting");
        xxgVar.f("integerValue", this.f);
        xxgVar.b("carServiceValue", this.c);
        xxgVar.b("uiAction", this.d);
        return xxgVar.toString();
    }
}
