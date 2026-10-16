package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum yqp {
    STRING('s', defpackage.yqr.GENERAL, "-#", true),
    BOOLEAN('b', defpackage.yqr.BOOLEAN, "-", true),
    CHAR('c', defpackage.yqr.CHARACTER, "-", true),
    DECIMAL('d', defpackage.yqr.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', defpackage.yqr.INTEGRAL, "-#0(", false),
    HEX('x', defpackage.yqr.INTEGRAL, "-#0(", true),
    FLOAT('f', defpackage.yqr.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', defpackage.yqr.FLOAT, "-#0+ (", true),
    GENERAL('g', defpackage.yqr.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', defpackage.yqr.FLOAT, "-#0+ ", true);

    public static final defpackage.yqp[] k = new defpackage.yqp[26];
    public final char l;
    public final defpackage.yqr m;
    public final int n;
    public final java.lang.String o;

    static {
        for (defpackage.yqp yqpVar : values()) {
            k[(yqpVar.l | ' ') - 97] = yqpVar;
        }
    }

    yqp(char c, defpackage.yqr yqrVar, java.lang.String str, boolean z) {
        this.l = c;
        this.m = yqrVar;
        defpackage.yqq yqqVar = defpackage.yqq.a;
        int i = true != z ? 0 : 128;
        for (int i2 = 0; i2 < str.length(); i2++) {
            int iA = defpackage.yqq.a(str.charAt(i2));
            if (iA < 0) {
                throw new java.lang.IllegalArgumentException("invalid flags: ".concat(str));
            }
            i |= 1 << iA;
        }
        this.n = i;
        this.o = "%" + c;
    }
}
