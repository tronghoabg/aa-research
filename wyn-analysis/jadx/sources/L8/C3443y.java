package l8;

import java.util.Comparator;

/* renamed from: l8.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3443y extends AbstractC3399A {
    public static AbstractC3399A f(int i5) {
        return i5 < 0 ? AbstractC3399A.f40039b : i5 > 0 ? AbstractC3399A.f40040c : AbstractC3399A.f40038a;
    }

    @Override // l8.AbstractC3399A
    public final AbstractC3399A a(int i5, int i10) {
        return f(Integer.compare(i5, i10));
    }

    @Override // l8.AbstractC3399A
    public final AbstractC3399A b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // l8.AbstractC3399A
    public final AbstractC3399A c(boolean z2, boolean z10) {
        return f(Boolean.compare(z2, z10));
    }

    @Override // l8.AbstractC3399A
    public final AbstractC3399A d(boolean z2, boolean z10) {
        return f(Boolean.compare(z10, z2));
    }

    @Override // l8.AbstractC3399A
    public final int e() {
        return 0;
    }
}
