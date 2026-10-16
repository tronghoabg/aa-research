package defpackage;

/* loaded from: classes2.dex */
public final class ajey extends abns implements abnt {
    public static final ajey a;
    private byte b = 2;

    static {
        ajey ajeyVar = new ajey();
        a = ajeyVar;
        abnv.P(ajey.class, ajeyVar);
    }

    private ajey() {
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
            return new ajey();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ajey.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
