package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lkd {
    public android.content.res.Resources a;
    private android.content.ComponentName b;
    private java.lang.String c;
    private java.lang.String d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private byte m;

    public final defpackage.lke a() {
        android.content.ComponentName componentName;
        java.lang.String str;
        java.lang.String str2;
        if (this.m == -1 && (componentName = this.b) != null && (str = this.c) != null && (str2 = this.d) != null) {
            return new defpackage.lke(componentName, str, str2, this.e, this.f, this.g, this.a, this.h, this.i, this.j, this.k, this.l);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == null) {
            sb.append(" componentName");
        }
        if (this.c == null) {
            sb.append(" packageName");
        }
        if (this.d == null) {
            sb.append(" appName");
        }
        if ((this.m & 1) == 0) {
            sb.append(" appIconResourceId");
        }
        if ((this.m & 2) == 0) {
            sb.append(" smallAppIconResourceId");
        }
        if ((this.m & 4) == 0) {
            sb.append(" attributionIconResourceId");
        }
        if ((this.m & 8) == 0) {
            sb.append(" accentColor");
        }
        if ((this.m & 16) == 0) {
            sb.append(" primaryColor");
        }
        if ((this.m & 32) == 0) {
            sb.append(" primaryColorDark");
        }
        if ((this.m & 64) == 0) {
            sb.append(" isCarLocalMedia");
        }
        if ((this.m & 128) == 0) {
            sb.append(" usesFallbackData");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.h = i;
        this.m = (byte) (this.m | 8);
    }

    public final void c(int i) {
        this.e = i;
        this.m = (byte) (this.m | 1);
    }

    public final void d(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null appName");
        }
        this.d = str;
    }

    public final void e(int i) {
        this.g = i;
        this.m = (byte) (this.m | 4);
    }

    public final void f(android.content.ComponentName componentName) {
        if (componentName == null) {
            throw new java.lang.NullPointerException("Null componentName");
        }
        this.b = componentName;
    }

    public final void g(boolean z) {
        this.k = z;
        this.m = (byte) (this.m | 64);
    }

    public final void h(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null packageName");
        }
        this.c = str;
    }

    public final void i(int i) {
        this.i = i;
        this.m = (byte) (this.m | 16);
    }

    public final void j(int i) {
        this.j = i;
        this.m = (byte) (this.m | 32);
    }

    public final void k(int i) {
        this.f = i;
        this.m = (byte) (this.m | 2);
    }

    public final void l(boolean z) {
        this.l = z;
        this.m = (byte) (this.m | (-128));
    }
}
