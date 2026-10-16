package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class abrc {
    final sun.misc.Unsafe a;

    public abrc(sun.misc.Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract double a(java.lang.Object obj, long j);

    public abstract float b(java.lang.Object obj, long j);

    public abstract void c(java.lang.Object obj, long j, boolean z);

    public abstract void d(java.lang.Object obj, long j, double d);

    public abstract void e(java.lang.Object obj, long j, float f);

    public abstract boolean f(java.lang.Object obj, long j);

    public final int g(java.lang.Object obj, long j) {
        return this.a.getInt(obj, j);
    }

    public final long h(java.lang.Object obj, long j) {
        return this.a.getLong(obj, j);
    }

    public final java.lang.Object i(java.lang.Object obj, long j) {
        return this.a.getObject(obj, j);
    }

    public final void j(java.lang.Object obj, long j, int i) {
        this.a.putInt(obj, j, i);
    }

    public final void k(java.lang.Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }

    public final void l(java.lang.Object obj, long j, java.lang.Object obj2) {
        this.a.putObject(obj, j, obj2);
    }
}
