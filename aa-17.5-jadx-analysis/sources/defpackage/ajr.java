package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class ajr {
    public long a = 0;
    public EdgeEffect b;
    public EdgeEffect c;
    public EdgeEffect d;
    public EdgeEffect e;
    public EdgeEffect f;
    public EdgeEffect g;
    public EdgeEffect h;
    public EdgeEffect i;
    private final Context j;
    private final int k;

    public ajr(Context context, int i) {
        this.j = context;
        this.k = i;
    }

    private final EdgeEffect u(api apiVar) {
        EdgeEffect edgeEffect;
        int i = Build.VERSION.SDK_INT;
        Context context = this.j;
        if (i >= 31) {
            try {
                edgeEffect = new EdgeEffect(context, null);
            } catch (Throwable unused) {
                edgeEffect = new EdgeEffect(context);
            }
        } else {
            edgeEffect = new ajz(context);
        }
        edgeEffect.setColor(this.k);
        long j = this.a;
        if (j != 0) {
            int i2 = (int) (j >> 32);
            int i3 = (int) (j & 4294967295L);
            if (apiVar == api.a) {
                edgeEffect.setSize(i2, i3);
            } else {
                edgeEffect.setSize(i3, i2);
            }
        }
        return edgeEffect;
    }

    private static final boolean v(EdgeEffect edgeEffect) {
        return (edgeEffect == null || edgeEffect.isFinished()) ? false : true;
    }

    private static final boolean w(EdgeEffect edgeEffect) {
        return (edgeEffect == null || ca.bg(edgeEffect) == BitmapDescriptorFactory.HUE_RED) ? false : true;
    }

    public final EdgeEffect a() {
        EdgeEffect edgeEffect = this.c;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectU = u(api.a);
        this.c = edgeEffectU;
        return edgeEffectU;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectU = u(api.a);
        this.g = edgeEffectU;
        return edgeEffectU;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectU = u(api.b);
        this.d = edgeEffectU;
        return edgeEffectU;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.h;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectU = u(api.b);
        this.h = edgeEffectU;
        return edgeEffectU;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectU = u(api.b);
        this.e = edgeEffectU;
        return edgeEffectU;
    }

    public final EdgeEffect f() {
        EdgeEffect edgeEffect = this.i;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectU = u(api.b);
        this.i = edgeEffectU;
        return edgeEffectU;
    }

    public final EdgeEffect g() {
        EdgeEffect edgeEffect = this.b;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectU = u(api.a);
        this.b = edgeEffectU;
        return edgeEffectU;
    }

    public final EdgeEffect h() {
        EdgeEffect edgeEffect = this.f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectU = u(api.a);
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
