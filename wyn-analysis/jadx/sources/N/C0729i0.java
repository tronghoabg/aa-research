package N;

import kotlin.jvm.internal.AbstractC3340k;
import x.C4421n;
import x.C4422o;

/* renamed from: N.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0729i0 {

    /* renamed from: a, reason: collision with root package name */
    public int f7785a;

    /* renamed from: b, reason: collision with root package name */
    public C0744s f7786b;

    /* renamed from: c, reason: collision with root package name */
    public C0716c f7787c;

    /* renamed from: d, reason: collision with root package name */
    public tf.p f7788d;

    /* renamed from: e, reason: collision with root package name */
    public int f7789e;

    /* renamed from: f, reason: collision with root package name */
    public C4421n f7790f;

    /* renamed from: g, reason: collision with root package name */
    public C4422o f7791g;

    public C0729i0(C0744s c0744s) {
        this.f7786b = c0744s;
    }

    public static boolean a(C0751z c0751z, C4422o c4422o) {
        AbstractC3340k.c(c0751z, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        return !AbstractC3340k.a(c0751z.j().f7958f, c4422o.e(c0751z));
    }

    public final boolean b() {
        if (this.f7786b != null) {
            C0716c c0716c = this.f7787c;
            if (c0716c != null ? c0716c.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final int c(Object obj) {
        int iO;
        C0744s c0744s = this.f7786b;
        if (c0744s == null || (iO = c0744s.o(this, obj)) == 0) {
            return 1;
        }
        return iO;
    }

    public final void d() {
        C0744s c0744s = this.f7786b;
        if (c0744s != null) {
            c0744s.f7917o = true;
        }
        this.f7786b = null;
        this.f7790f = null;
        this.f7791g = null;
    }

    public final void e(boolean z2) {
        if (z2) {
            this.f7785a |= 32;
        } else {
            this.f7785a &= -33;
        }
    }
}
