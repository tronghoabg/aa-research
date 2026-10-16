package defpackage;

/* loaded from: classes.dex */
public enum ypk {
    STRING('s', ypm.GENERAL, "-#", true),
    BOOLEAN('b', ypm.BOOLEAN, "-", true),
    CHAR('c', ypm.CHARACTER, "-", true),
    DECIMAL('d', ypm.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', ypm.INTEGRAL, "-#0(", false),
    HEX('x', ypm.INTEGRAL, "-#0(", true),
    FLOAT('f', ypm.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', ypm.FLOAT, "-#0+ (", true),
    GENERAL('g', ypm.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', ypm.FLOAT, "-#0+ ", true);

    public static final ypk[] k = new ypk[26];
    public final char l;
    public final ypm m;
    public final int n;
    public final String o;

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    static {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ypk.<clinit>():void");
    }

    ypk(char c, ypm ypmVar, String str, boolean z) {
        this.l = c;
        this.m = ypmVar;
        ypl yplVar = ypl.a;
        int i = true != z ? 0 : 128;
        for (int i2 = 0; i2 < str.length(); i2++) {
            int iA = ypl.a(str.charAt(i2));
            if (iA < 0) {
                throw new IllegalArgumentException("invalid flags: ".concat(str));
            }
            i |= 1 << iA;
        }
        this.n = i;
        this.o = "%" + c;
    }
}
