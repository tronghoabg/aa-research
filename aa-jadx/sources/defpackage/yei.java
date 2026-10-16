package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yei extends defpackage.yek {
    public static final defpackage.yek h(int i) {
        if (i < 0) {
            return defpackage.yek.c;
        }
        return i > 0 ? defpackage.yek.d : defpackage.yek.b;
    }

    @Override // defpackage.yek
    public final int a() {
        return 0;
    }

    @Override // defpackage.yek
    public final defpackage.yek b(float f, float f2) {
        return h(java.lang.Float.compare(f, f2));
    }

    @Override // defpackage.yek
    public final defpackage.yek c(int i, int i2) {
        return h(java.lang.Integer.compare(i, i2));
    }

    @Override // defpackage.yek
    public final defpackage.yek d(long j, long j2) {
        return h(java.lang.Long.compare(j, j2));
    }

    @Override // defpackage.yek
    public final defpackage.yek e(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        return h(comparable.compareTo(comparable2));
    }

    @Override // defpackage.yek
    public final defpackage.yek f(java.lang.Object obj, java.lang.Object obj2, java.util.Comparator comparator) {
        return h(comparator.compare(obj, obj2));
    }

    @Override // defpackage.yek
    public final defpackage.yek g(boolean z, boolean z2) {
        return h(java.lang.Boolean.compare(z, z2));
    }
}
