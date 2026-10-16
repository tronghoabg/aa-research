package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class Spliterators {
    public static final j$.util.w0 a = new j$.util.w0();
    public static final j$.util.u0 b = new j$.util.u0();
    public static final j$.util.v0 c = new j$.util.v0();
    public static final j$.util.t0 d = new j$.util.t0();

    public static void a(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(i2);
            }
            if (i3 > i) {
                throw new java.lang.ArrayIndexOutOfBoundsException(i3);
            }
            return;
        }
        throw new java.lang.ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
    }

    public static j$.util.r0 b(java.lang.Object[] objArr, int i, int i2, int i3) {
        objArr.getClass();
        a(objArr.length, i, i2);
        return new j$.util.r0(objArr, i, i2, i3);
    }

    public static j$.util.Spliterator.OfInt spliterator(int[] iArr, int i, int i2, int i3) {
        iArr.getClass();
        a(iArr.length, i, i2);
        return new j$.util.x0(iArr, i, i2, i3);
    }

    public static <T> j$.util.Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i) {
        collection.getClass();
        return new j$.util.y0(collection, i);
    }
}
