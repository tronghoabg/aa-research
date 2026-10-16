package defpackage;

/* loaded from: classes3.dex */
public final class acbw extends abnv implements abox {
    public static final acbw a;
    public int b;
    public zpi f;
    public long i;
    public zbi j;
    public aazo k;
    private byte l = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String g = "";
    public aboh h = abpf.b;

    static {
        acbw acbwVar = new acbw();
        a = acbwVar;
        abnv.P(acbw.class, acbwVar);
    }

    private acbw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0001\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0003\u0005Л\u0006ဂ\u0006\u0007ဈ\u0005\bဉ\u0007\tဉ\b\u000bဉ\u0004", new Object[]{"b", "c", "d", "e", "h", ablu.class, "i", "g", "j", "k", "f"});
        }
        if (i2 == 3) {
            return new acbw();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acbw.class);
        }
        this.l = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
