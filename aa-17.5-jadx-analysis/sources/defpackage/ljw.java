package defpackage;

import android.content.ComponentName;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class ljw {
    public Resources a;
    private ComponentName b;
    private String c;
    private String d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private byte m;

    public final ljx a() {
        ComponentName componentName;
        String str;
        String str2;
        if (this.m == -1 && (componentName = this.b) != null && (str = this.c) != null && (str2 = this.d) != null) {
            return new ljx(componentName, str, str2, this.e, this.f, this.g, this.a, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
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
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.h = i;
        this.m = (byte) (this.m | 8);
    }

    public final void c(int i) {
        this.e = i;
        this.m = (byte) (this.m | 1);
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null appName");
        }
        this.d = str;
    }

    public final void e(int i) {
        this.g = i;
        this.m = (byte) (this.m | 4);
    }

    public final void f(ComponentName componentName) {
        if (componentName == null) {
            throw new NullPointerException("Null componentName");
        }
        this.b = componentName;
    }

    public final void g(boolean z) {
        this.k = z;
        this.m = (byte) (this.m | 64);
    }

    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null packageName");
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
