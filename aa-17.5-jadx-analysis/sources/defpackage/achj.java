package defpackage;

/* loaded from: classes3.dex */
public final class achj extends abnv implements abox {
    public static final achj a;
    public int b;
    public boolean c;
    public String d;
    public String e;
    public float f;
    public achh g;
    private int h;
    private int i;
    private abot j;
    private abot k;
    private abot l;
    private abot m;

    static {
        achj achjVar = new achj();
        a = achjVar;
        abnv.P(achj.class, achjVar);
    }

    private achj() {
        abot abotVar = abot.a;
        this.j = abotVar;
        this.k = abotVar;
        this.l = abotVar;
        this.m = abotVar;
        this.c = true;
        this.d = "https://www.google.com/maps/vt/";
        this.e = "https://www.google.com/maps/vt/";
        this.f = 15.0f;
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            lds ldsVar = new lds(abqd.INT32, 0, abqd.ENUM, 0);
            abqd abqdVar = abqd.STRING;
            abqd abqdVar2 = abqd.BOOL;
            return new abpg(a, "\u0001\n\u0000\u0002\u0007§\n\u0004\u0000\u0000\u0007င\b\bဇ\t\u0010ဈ\u0011\u0011ဈ\u0012\u0019ခ\u00174࠲9ဉ-\\2^2§2", new Object[]{"h", "i", "b", "c", "d", "e", "f", "j", ldsVar, achi.a, "g", "k", new lds(abqdVar, "", abqdVar2, false), "l", new lds(abqdVar, "", abqdVar2, false), "m", new lds(abqdVar, "", abqdVar2, false)});
        }
        if (i2 == 3) {
            return new achj();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(achj.class);
    }
}
