package defpackage;

import java.lang.reflect.Field;

/* loaded from: classes2.dex */
final class eld extends ele {
    @Override // defpackage.ele
    public final double a(Object obj, long j) {
        return this.a.getDouble(obj, j);
    }

    @Override // defpackage.ele
    public final float b(Object obj, long j) {
        return this.a.getFloat(obj, j);
    }

    @Override // defpackage.ele
    public final void c(Object obj, long j, boolean z) {
        this.a.putBoolean(obj, j, z);
    }

    @Override // defpackage.ele
    public final void d(Object obj, long j, byte b) {
        this.a.putByte(obj, j, b);
    }

    @Override // defpackage.ele
    public final void e(Object obj, long j, double d) {
        this.a.putDouble(obj, j, d);
    }

    @Override // defpackage.ele
    public final void f(Object obj, long j, float f) {
        this.a.putFloat(obj, j, f);
    }

    @Override // defpackage.ele
    public final boolean g(Object obj, long j) {
        return this.a.getBoolean(obj, j);
    }

    @Override // defpackage.ele
    public final boolean h() {
        try {
            Class<?> cls = this.a.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (elf.g() != null) {
                try {
                    Class<?> cls2 = this.a.getClass();
                    cls2.getMethod("getByte", Long.TYPE);
                    cls2.getMethod("putByte", Long.TYPE, Byte.TYPE);
                    cls2.getMethod("getInt", Long.TYPE);
                    cls2.getMethod("putInt", Long.TYPE, Integer.TYPE);
                    cls2.getMethod("getLong", Long.TYPE);
                    Class<?> cls3 = Long.TYPE;
                    cls2.getMethod("putLong", cls3, cls3);
                    Class<?> cls4 = Long.TYPE;
                    cls2.getMethod("copyMemory", cls4, cls4, cls4);
                    Class<?> cls5 = Long.TYPE;
                    cls2.getMethod("copyMemory", Object.class, cls5, Object.class, cls5, cls5);
                    return true;
                } catch (Throwable th) {
                    elf.i(th);
                    return false;
                }
            }
        } catch (Throwable th2) {
            elf.i(th2);
        }
        return false;
    }

    @Override // defpackage.ele
    public final boolean i() {
        if (!super.i()) {
            return false;
        }
        try {
            Class<?> cls = this.a.getClass();
            cls.getMethod("getByte", Object.class, Long.TYPE);
            cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, Long.TYPE);
            cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, Long.TYPE);
            cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod("getDouble", Object.class, Long.TYPE);
            cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            elf.i(th);
            return false;
        }
    }
}
