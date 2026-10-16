package r0;

import a.AbstractC1304a;

/* renamed from: r0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3904i implements InterfaceC3903h {
    @Override // r0.InterfaceC3903h
    public final long a(long j8, long j10) {
        return AbstractC1304a.g(1.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3904i)) {
            return false;
        }
        Float fValueOf = Float.valueOf(1.0f);
        ((C3904i) obj).getClass();
        return fValueOf.equals(Float.valueOf(1.0f));
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f);
    }

    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
