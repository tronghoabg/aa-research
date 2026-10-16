package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f18258a;

    public r0(Unsafe unsafe) {
        this.f18258a = unsafe;
    }

    public final int a(Class cls) {
        return this.f18258a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f18258a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j8, Object obj);

    public abstract byte d(long j8, Object obj);

    public abstract double e(long j8, Object obj);

    public abstract float f(long j8, Object obj);

    public final int g(long j8, Object obj) {
        return this.f18258a.getInt(obj, j8);
    }

    public final long h(long j8, Object obj) {
        return this.f18258a.getLong(obj, j8);
    }

    public final Object i(long j8, Object obj) {
        return this.f18258a.getObject(obj, j8);
    }

    public final long j(Field field) {
        return this.f18258a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j8, boolean z2);

    public abstract void l(Object obj, long j8, byte b5);

    public abstract void m(Object obj, long j8, double d3);

    public abstract void n(Object obj, long j8, float f10);

    public final void o(long j8, Object obj, int i5) {
        this.f18258a.putInt(obj, j8, i5);
    }

    public final void p(Object obj, long j8, long j10) {
        this.f18258a.putLong(obj, j8, j10);
    }

    public final void q(Object obj, long j8, Object obj2) {
        this.f18258a.putObject(obj, j8, obj2);
    }
}
