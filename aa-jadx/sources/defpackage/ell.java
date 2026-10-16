package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ell extends defpackage.elm {
    @Override // defpackage.elm
    public final double a(java.lang.Object obj, long j) {
        return this.a.getDouble(obj, j);
    }

    @Override // defpackage.elm
    public final float b(java.lang.Object obj, long j) {
        return this.a.getFloat(obj, j);
    }

    @Override // defpackage.elm
    public final void c(java.lang.Object obj, long j, boolean z) {
        this.a.putBoolean(obj, j, z);
    }

    @Override // defpackage.elm
    public final void d(java.lang.Object obj, long j, byte b) {
        this.a.putByte(obj, j, b);
    }

    @Override // defpackage.elm
    public final void e(java.lang.Object obj, long j, double d) {
        this.a.putDouble(obj, j, d);
    }

    @Override // defpackage.elm
    public final void f(java.lang.Object obj, long j, float f) {
        this.a.putFloat(obj, j, f);
    }

    @Override // defpackage.elm
    public final boolean g(java.lang.Object obj, long j) {
        return this.a.getBoolean(obj, j);
    }

    @Override // defpackage.elm
    public final boolean h() {
        try {
            java.lang.Class<?> cls = this.a.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
            if (defpackage.eln.g() != null) {
                try {
                    java.lang.Class<?> cls2 = this.a.getClass();
                    cls2.getMethod("getByte", java.lang.Long.TYPE);
                    cls2.getMethod("putByte", java.lang.Long.TYPE, java.lang.Byte.TYPE);
                    cls2.getMethod("getInt", java.lang.Long.TYPE);
                    cls2.getMethod("putInt", java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    cls2.getMethod("getLong", java.lang.Long.TYPE);
                    java.lang.Class<?> cls3 = java.lang.Long.TYPE;
                    cls2.getMethod("putLong", cls3, cls3);
                    java.lang.Class<?> cls4 = java.lang.Long.TYPE;
                    cls2.getMethod("copyMemory", cls4, cls4, cls4);
                    java.lang.Class<?> cls5 = java.lang.Long.TYPE;
                    cls2.getMethod("copyMemory", java.lang.Object.class, cls5, java.lang.Object.class, cls5, cls5);
                    return true;
                } catch (java.lang.Throwable th) {
                    defpackage.eln.i(th);
                    return false;
                }
            }
        } catch (java.lang.Throwable th2) {
            defpackage.eln.i(th2);
        }
        return false;
    }

    @Override // defpackage.elm
    public final boolean i() {
        if (!super.i()) {
            return false;
        }
        try {
            java.lang.Class<?> cls = this.a.getClass();
            cls.getMethod("getByte", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putByte", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Byte.TYPE);
            cls.getMethod("getBoolean", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putBoolean", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Boolean.TYPE);
            cls.getMethod("getFloat", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putFloat", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Float.TYPE);
            cls.getMethod("getDouble", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putDouble", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Double.TYPE);
            return true;
        } catch (java.lang.Throwable th) {
            defpackage.eln.i(th);
            return false;
        }
    }
}
