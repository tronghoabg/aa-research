package defpackage;

/* loaded from: classes3.dex */
public enum zou {
    BRANCH(0),
    SINGLE(1),
    ANY(2),
    RANGE(3),
    MAP(4),
    TMAP(5);

    public static final zou[] g = values();

    zou(int i) {
        if (i != ordinal()) {
            throw new AssertionError(a.bp(i, "bad opcode value: "));
        }
    }

    public static int a(zos zosVar, ajlp ajlpVar, int i) {
        int iC = (zosVar.c() << 16) | zosVar.c();
        if (!ajlpVar.k()) {
            return i;
        }
        int iJ = ajlpVar.j();
        int i2 = ((int) (1099368461105 >>> (iJ * 4))) & 15 & (iC >>> (((int) (903298571996192 >>> (iJ * 5))) & 31));
        if (i2 == 0) {
            return 3;
        }
        return zosVar.e(i2 - 1);
    }
}
