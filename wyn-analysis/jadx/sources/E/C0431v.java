package E;

import kotlin.jvm.internal.AbstractC3340k;
import t0.C4070r;

/* renamed from: E.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0431v implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final C0411a f2773a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f2774b;

    public C0431v(C0411a included, Q q4) {
        AbstractC3340k.e(included, "included");
        this.f2773a = included;
        this.f2774b = q4;
    }

    @Override // E.Q
    public final int a(C4070r density, L0.i layoutDirection) {
        AbstractC3340k.e(density, "density");
        AbstractC3340k.e(layoutDirection, "layoutDirection");
        int iA = this.f2773a.a(density, layoutDirection) - this.f2774b.a(density, layoutDirection);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // E.Q
    public final int b(C4070r density, L0.i layoutDirection) {
        AbstractC3340k.e(density, "density");
        AbstractC3340k.e(layoutDirection, "layoutDirection");
        int iB = this.f2773a.b(density, layoutDirection) - this.f2774b.b(density, layoutDirection);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // E.Q
    public final int c(C4070r density) {
        AbstractC3340k.e(density, "density");
        int iC = this.f2773a.c(density) - this.f2774b.c(density);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // E.Q
    public final int d(C4070r density) {
        AbstractC3340k.e(density, "density");
        int iD = this.f2773a.d(density) - this.f2774b.d(density);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0431v)) {
            return false;
        }
        C0431v c0431v = (C0431v) obj;
        return AbstractC3340k.a(c0431v.f2773a, this.f2773a) && c0431v.f2774b.equals(this.f2774b);
    }

    public final int hashCode() {
        return this.f2774b.hashCode() + (this.f2773a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f2773a + " - " + this.f2774b + ')';
    }
}
