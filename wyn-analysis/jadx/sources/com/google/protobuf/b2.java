package com.google.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final class b2 extends c2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27651b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(Unsafe unsafe, int i5) {
        super(unsafe);
        this.f27651b = i5;
    }

    @Override // com.google.protobuf.c2
    public final void c(long j8, byte[] bArr, long j10, long j11) {
        switch (this.f27651b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.c2
    public final void d(byte[] bArr, long j8, long j10, long j11) {
        switch (this.f27651b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.c2
    public final boolean e(long j8, Object obj) {
        switch (this.f27651b) {
            case 0:
                if (d2.f27669h) {
                    if (d2.h(j8, obj) == 0) {
                    }
                } else if (d2.i(j8, obj) == 0) {
                }
                break;
            default:
                if (d2.f27669h) {
                    if (d2.h(j8, obj) == 0) {
                    }
                } else if (d2.i(j8, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.protobuf.c2
    public final byte f(long j8) {
        switch (this.f27651b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.c2
    public final double g(long j8, Object obj) {
        switch (this.f27651b) {
        }
        return Double.longBitsToDouble(j(j8, obj));
    }

    @Override // com.google.protobuf.c2
    public final float h(long j8, Object obj) {
        switch (this.f27651b) {
        }
        return Float.intBitsToFloat(i(j8, obj));
    }

    @Override // com.google.protobuf.c2
    public final void m(Object obj, long j8, boolean z2) {
        switch (this.f27651b) {
            case 0:
                if (!d2.f27669h) {
                    d2.n(obj, j8, z2 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    d2.m(obj, j8, z2 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!d2.f27669h) {
                    d2.n(obj, j8, z2 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    d2.m(obj, j8, z2 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // com.google.protobuf.c2
    public final void n(byte b5, long j8) {
        switch (this.f27651b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.c2
    public final void o(Object obj, long j8, byte b5) {
        switch (this.f27651b) {
            case 0:
                if (!d2.f27669h) {
                    d2.n(obj, j8, b5);
                    break;
                } else {
                    d2.m(obj, j8, b5);
                    break;
                }
            default:
                if (!d2.f27669h) {
                    d2.n(obj, j8, b5);
                    break;
                } else {
                    d2.m(obj, j8, b5);
                    break;
                }
        }
    }

    @Override // com.google.protobuf.c2
    public final void p(Object obj, long j8, double d3) {
        switch (this.f27651b) {
            case 0:
                s(obj, j8, Double.doubleToLongBits(d3));
                break;
            default:
                s(obj, j8, Double.doubleToLongBits(d3));
                break;
        }
    }

    @Override // com.google.protobuf.c2
    public final void q(Object obj, long j8, float f10) {
        switch (this.f27651b) {
            case 0:
                r(j8, obj, Float.floatToIntBits(f10));
                break;
            default:
                r(j8, obj, Float.floatToIntBits(f10));
                break;
        }
    }

    @Override // com.google.protobuf.c2
    public final boolean u() {
        switch (this.f27651b) {
        }
        return false;
    }
}
