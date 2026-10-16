package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ajv {
    public long a = 0;
    public android.widget.EdgeEffect b;
    public android.widget.EdgeEffect c;
    public android.widget.EdgeEffect d;
    public android.widget.EdgeEffect e;
    public android.widget.EdgeEffect f;
    public android.widget.EdgeEffect g;
    public android.widget.EdgeEffect h;
    public android.widget.EdgeEffect i;
    private final android.content.Context j;
    private final int k;

    public ajv(android.content.Context context, int i) {
        this.j = context;
        this.k = i;
    }

    private final android.widget.EdgeEffect u(defpackage.apn apnVar) {
        android.widget.EdgeEffect edgeEffect;
        int i = android.os.Build.VERSION.SDK_INT;
        android.content.Context context = this.j;
        if (i >= 31) {
            try {
                edgeEffect = new android.widget.EdgeEffect(context, null);
            } catch (java.lang.Throwable unused) {
                edgeEffect = new android.widget.EdgeEffect(context);
            }
        } else {
            edgeEffect = new defpackage.ake(context);
        }
        edgeEffect.setColor(this.k);
        long j = this.a;
        if (j != 0) {
            int i2 = (int) (j >> 32);
            int i3 = (int) (j & 4294967295L);
            if (apnVar == defpackage.apn.a) {
                edgeEffect.setSize(i2, i3);
            } else {
                edgeEffect.setSize(i3, i2);
            }
        }
        return edgeEffect;
    }

    private static final boolean v(android.widget.EdgeEffect edgeEffect) {
        return (edgeEffect == null || edgeEffect.isFinished()) ? false : true;
    }

    private static final boolean w(android.widget.EdgeEffect edgeEffect) {
        return (edgeEffect == null || defpackage.ca.bg(edgeEffect) == 0.0f) ? false : true;
    }

    public final android.widget.EdgeEffect a() {
        android.widget.EdgeEffect edgeEffect = this.c;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect edgeEffectU = u(defpackage.apn.a);
        this.c = edgeEffectU;
        return edgeEffectU;
    }

    public final android.widget.EdgeEffect b() {
        android.widget.EdgeEffect edgeEffect = this.g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect edgeEffectU = u(defpackage.apn.a);
        this.g = edgeEffectU;
        return edgeEffectU;
    }

    public final android.widget.EdgeEffect c() {
        android.widget.EdgeEffect edgeEffect = this.d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect edgeEffectU = u(defpackage.apn.b);
        this.d = edgeEffectU;
        return edgeEffectU;
    }

    public final android.widget.EdgeEffect d() {
        android.widget.EdgeEffect edgeEffect = this.h;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect edgeEffectU = u(defpackage.apn.b);
        this.h = edgeEffectU;
        return edgeEffectU;
    }

    public final android.widget.EdgeEffect e() {
        android.widget.EdgeEffect edgeEffect = this.e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect edgeEffectU = u(defpackage.apn.b);
        this.e = edgeEffectU;
        return edgeEffectU;
    }

    public final android.widget.EdgeEffect f() {
        android.widget.EdgeEffect edgeEffect = this.i;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect edgeEffectU = u(defpackage.apn.b);
        this.i = edgeEffectU;
        return edgeEffectU;
    }

    public final android.widget.EdgeEffect g() {
        android.widget.EdgeEffect edgeEffect = this.b;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect edgeEffectU = u(defpackage.apn.a);
        this.b = edgeEffectU;
        return edgeEffectU;
    }

    public final android.widget.EdgeEffect h() {
        android.widget.EdgeEffect edgeEffect = this.f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect edgeEffectU = u(defpackage.apn.a);
        this.f = edgeEffectU;
        return edgeEffectU;
    }

    public final boolean i() {
        return v(this.c);
    }

    public final boolean j() {
        return w(this.g);
    }

    public final boolean k() {
        return w(this.c);
    }

    public final boolean l() {
        return v(this.d);
    }

    public final boolean m() {
        return w(this.h);
    }

    public final boolean n() {
        return w(this.d);
    }

    public final boolean o() {
        return v(this.e);
    }

    public final boolean p() {
        return w(this.i);
    }

    public final boolean q() {
        return w(this.e);
    }

    public final boolean r() {
        return v(this.b);
    }

    public final boolean s() {
        return w(this.f);
    }

    public final boolean t() {
        return w(this.b);
    }
}
