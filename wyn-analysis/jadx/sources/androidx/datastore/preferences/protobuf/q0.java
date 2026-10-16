package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class q0 extends r0 {
    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean c(long j8, Object obj) {
        return this.f18258a.getBoolean(obj, j8);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final byte d(long j8, Object obj) {
        return this.f18258a.getByte(obj, j8);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final double e(long j8, Object obj) {
        return this.f18258a.getDouble(obj, j8);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final float f(long j8, Object obj) {
        return this.f18258a.getFloat(obj, j8);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void k(Object obj, long j8, boolean z2) {
        this.f18258a.putBoolean(obj, j8, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void l(Object obj, long j8, byte b5) {
        this.f18258a.putByte(obj, j8, b5);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void m(Object obj, long j8, double d3) {
        this.f18258a.putDouble(obj, j8, d3);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void n(Object obj, long j8, float f10) {
        this.f18258a.putFloat(obj, j8, f10);
    }
}
