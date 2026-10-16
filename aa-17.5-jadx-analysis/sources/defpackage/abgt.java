package defpackage;

/* loaded from: classes3.dex */
public final class abgt extends abnv implements abox {
    public static final abgt a;
    public int b;
    public abls c;
    public abfz d;
    private ablr g;
    private abgu h;
    private byte i = 2;
    public String e = "";
    public boolean f = true;

    static {
        abgt abgtVar = new abgt();
        a = abgtVar;
        abnv.P(abgt.class, abgtVar);
    }

    private abgt() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0006\u0000\u0001\u0001\u001a\u0006\u0000\u0000\u0004\u0001ᐉ\u0000\u0003ᐉ\u0003\u0004ᐉ\u0004\bᐉ\u0002\u0019ဈ\u0006\u001aဇ\u0007", new Object[]{"b", "c", "h", "d", "g", "e", "f"});
        }
        if (i2 == 3) {
            return new abgt();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abgt.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
