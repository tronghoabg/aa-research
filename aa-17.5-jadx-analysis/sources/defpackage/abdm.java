package defpackage;

/* loaded from: classes3.dex */
public final class abdm extends abns implements abnt {
    public static final abdm a;
    private byte b = 2;

    static {
        abdm abdmVar = new abdm();
        a = abdmVar;
        abnv.P(abdm.class, abdmVar);
    }

    private abdm() {
        Object[] objArr = abpf.a;
        abnw abnwVar = abnw.a;
        abor aborVar = abor.a;
        abnn abnnVar = abnn.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.b);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new abdm();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abdm.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
