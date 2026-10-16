package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum jfm {
    OFF(0, "off", defpackage.zbd.dl),
    ON(1, "on", defpackage.zbd.dk);

    public final java.lang.String c;
    public final defpackage.zbd d;
    private final int f;

    static {
        defpackage.ygw.p(values());
    }

    jfm(int i, java.lang.String str, defpackage.zbd zbdVar) {
        this.c = str;
        this.f = i;
        this.d = zbdVar;
    }

    public static defpackage.jfm a(java.lang.String str) {
        if (str == null) {
            return OFF;
        }
        defpackage.jfm jfmVar = ON;
        if (str.equals(jfmVar.c)) {
            return jfmVar;
        }
        defpackage.jfm jfmVar2 = OFF;
        str.equals(jfmVar2.c);
        return jfmVar2;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        defpackage.xym xymVar = new defpackage.xym("MultiDisplaySetting");
        xymVar.f("integerValue", this.f);
        xymVar.b("carServiceValue", this.c);
        xymVar.b("uiAction", this.d);
        return xymVar.toString();
    }
}
