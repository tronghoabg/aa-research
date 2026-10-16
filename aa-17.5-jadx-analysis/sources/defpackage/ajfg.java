package defpackage;

/* loaded from: classes3.dex */
public final class ajfg extends abnv implements abox {
    public static final ajfg a;
    public int b;
    public Object d;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public ajfw n;
    public int o;
    public ajff p;
    public int q;
    public long r;
    public int s;
    public int t;
    public int u;
    public int v;
    public String w;
    public abog x;
    public String y;
    public ajfi z;
    public int c = 0;
    private byte A = 2;
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        ajfg ajfgVar = new ajfg();
        a = ajfgVar;
        abnv.P(ajfg.class, ajfgVar);
    }

    private ajfg() {
        Object[] objArr = abpf.a;
        this.w = "";
        this.x = abor.a;
        this.y = "";
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.A);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0018\u0001\u0001\u0001\u001d\u0018\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006ဋ\u0006\u0007ဋ\u0007\b᠌\b\nဉ\t\u000bဉ\u000b\rဂ\u000e\u000e᠌\u000f\u000f᠌\u0010\u0010င\u0012\u0011ဈ\u0013\u0013င\u0011\u0014ဈ\u0015\u0015(\u0016ဉ\u0016\u0018᠌\n\u0019ဈ\u0002\u001b᠌\f\u001c5\u0000\u001d<\u0000", new Object[]{"d", "c", "b", "e", "f", "h", "i", "j", "k", "l", "m", achi.t, "n", "p", "r", "s", achi.u, "t", achi.s, "v", "w", "u", "y", "x", "z", "o", achi.q, "g", "q", achi.r, ajfy.class});
        }
        if (i2 == 3) {
            return new ajfg();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ajfg.class);
        }
        this.A = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
