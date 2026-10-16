package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class p0 extends r0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18251b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Unsafe unsafe, int i5) {
        super(unsafe);
        this.f18251b = i5;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean c(long j8, Object obj) {
        switch (this.f18251b) {
            case 0:
                if (s0.f18268h) {
                    if (s0.g(j8, obj) == 0) {
                    }
                } else if (s0.h(j8, obj) == 0) {
                }
                break;
            default:
                if (s0.f18268h) {
                    if (s0.g(j8, obj) == 0) {
                    }
                } else if (s0.h(j8, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final byte d(long j8, Object obj) {
        switch (this.f18251b) {
            case 0:
                if (!s0.f18268h) {
                    break;
                } else {
                    break;
                }
            default:
                if (!s0.f18268h) {
                    break;
                } else {
                    break;
                }
        }
        return s0.h(j8, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final double e(long j8, Object obj) {
        switch (this.f18251b) {
        }
        return Double.longBitsToDouble(h(j8, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final float f(long j8, Object obj) {
        switch (this.f18251b) {
        }
        return Float.intBitsToFloat(g(j8, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void k(Object obj, long j8, boolean z2) {
        switch (this.f18251b) {
            case 0:
                if (!s0.f18268h) {
                    s0.l(obj, j8, z2 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    s0.k(obj, j8, z2 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!s0.f18268h) {
                    s0.l(obj, j8, z2 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    s0.k(obj, j8, z2 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void l(Object obj, long j8, byte b5) {
        switch (this.f18251b) {
            case 0:
                if (!s0.f18268h) {
                    s0.l(obj, j8, b5);
                    break;
                } else {
                    s0.k(obj, j8, b5);
                    break;
                }
            default:
                if (!s0.f18268h) {
                    s0.l(obj, j8, b5);
                    break;
                } else {
                    s0.k(obj, j8, b5);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void m(Object obj, long j8, double d3) {
        switch (this.f18251b) {
            case 0:
                p(obj, j8, Double.doubleToLongBits(d3));
                break;
            default:
                p(obj, j8, Double.doubleToLongBits(d3));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void n(Object obj, long j8, float f10) {
        switch (this.f18251b) {
            case 0:
                o(j8, obj, Float.floatToIntBits(f10));
                break;
            default:
                o(j8, obj, Float.floatToIntBits(f10));
                break;
        }
    }
}
