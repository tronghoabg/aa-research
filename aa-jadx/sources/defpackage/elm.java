package defpackage;

/* JADX INFO: loaded from: classes2.dex */
abstract class elm {
    final sun.misc.Unsafe a;

    public elm(sun.misc.Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract double a(java.lang.Object obj, long j);

    public abstract float b(java.lang.Object obj, long j);

    public abstract void c(java.lang.Object obj, long j, boolean z);

    public abstract void d(java.lang.Object obj, long j, byte b);

    public abstract void e(java.lang.Object obj, long j, double d);

    public abstract void f(java.lang.Object obj, long j, float f);

    public abstract boolean g(java.lang.Object obj, long j);

    public boolean h() {
        throw null;
    }

    public boolean i() {
        try {
            java.lang.Class<?> cls = this.a.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("arrayBaseOffset", java.lang.Class.class);
            cls.getMethod("arrayIndexScale", java.lang.Class.class);
            cls.getMethod("getInt", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putInt", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Integer.TYPE);
            cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
            java.lang.Class<?> cls2 = java.lang.Long.TYPE;
            cls.getMethod("putLong", java.lang.Object.class, cls2, cls2);
            cls.getMethod("getObject", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putObject", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Object.class);
            return true;
        } catch (java.lang.Throwable th) {
            defpackage.eln.i(th);
            return false;
        }
    }

    public final int j(java.lang.Object obj, long j) {
        return this.a.getInt(obj, j);
    }

    public final long k(java.lang.Object obj, long j) {
        return this.a.getLong(obj, j);
    }

    public final void l(java.lang.Object obj, long j, int i) {
        this.a.putInt(obj, j, i);
    }

    public final void m(java.lang.Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }
}
