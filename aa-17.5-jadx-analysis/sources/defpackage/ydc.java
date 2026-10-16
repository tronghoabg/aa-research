package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class ydc extends yde {
    public static final yde h(int i) {
        return i < 0 ? yde.c : i > 0 ? yde.d : yde.b;
    }

    @Override // defpackage.yde
    public final int a() {
        return 0;
    }

    @Override // defpackage.yde
    public final yde b(float f, float f2) {
        return h(Float.compare(f, f2));
    }

    @Override // defpackage.yde
    public final yde c(int i, int i2) {
        return h(Integer.compare(i, i2));
    }

    @Override // defpackage.yde
    public final yde d(long j, long j2) {
        return h(Long.compare(j, j2));
    }

    @Override // defpackage.yde
    public final yde e(Comparable comparable, Comparable comparable2) {
        return h(comparable.compareTo(comparable2));
    }

    @Override // defpackage.yde
    public final yde f(Object obj, Object obj2, Comparator comparator) {
        return h(comparator.compare(obj, obj2));
    }

    @Override // defpackage.yde
    public final yde g(boolean z, boolean z2) {
        return h(Boolean.compare(z, z2));
    }
}
