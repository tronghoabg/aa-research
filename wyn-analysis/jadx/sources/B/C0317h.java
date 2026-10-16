package B;

import e0.AbstractC2461m;

/* renamed from: B.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317h {

    /* renamed from: a, reason: collision with root package name */
    public final float f1431a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC2461m f1432b;

    public C0317h(float f10, AbstractC2461m abstractC2461m) {
        this.f1431a = f10;
        this.f1432b = abstractC2461m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0317h)) {
            return false;
        }
        C0317h c0317h = (C0317h) obj;
        return L0.d.a(this.f1431a, c0317h.f1431a) && this.f1432b.equals(c0317h.f1432b);
    }

    public final int hashCode() {
        return this.f1432b.hashCode() + (Float.floatToIntBits(this.f1431a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) L0.d.b(this.f1431a)) + ", brush=" + this.f1432b + ')';
    }
}
