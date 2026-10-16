package defpackage;

/* loaded from: classes3.dex */
public final class abdf extends abnv implements abox {
    public static final abdf a;
    public int b;
    public aboh c;
    public abod d;
    public aboh e;
    public abod f;
    public int g;
    public boolean h;
    public String i;
    public String j;
    public float k;
    public float l;
    public int m;

    static {
        abdf abdfVar = new abdf();
        a = abdfVar;
        abnv.P(abdf.class, abdfVar);
    }

    private abdf() {
        abpf abpfVar = abpf.b;
        this.c = abpfVar;
        abnw abnwVar = abnw.a;
        this.d = abnwVar;
        this.e = abpfVar;
        this.f = abnwVar;
        this.i = "";
        this.j = "";
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u000b\u0000\u0001\u0001\u000f\u000b\u0000\u0004\u0000\u0001\u001b\u0004င\u0002\u0005ဇ\u0003\u0006'\u0007ဈ\u0004\tဈ\u0006\u000bခ\b\fင\n\rခ\t\u000e\u001b\u000f'", new Object[]{"b", "c", abes.class, "g", "h", "d", "i", "j", "k", "m", "l", "e", abes.class, "f"});
        }
        if (i2 == 3) {
            return new abdf();
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
        return abnv.L(abdf.class);
    }
}
