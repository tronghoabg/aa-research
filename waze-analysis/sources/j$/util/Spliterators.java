package j$.util;

import j$.util.Spliterator;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class Spliterators {

    /* renamed from: a, reason: collision with root package name */
    public static final m1 f50122a = new m1();

    /* renamed from: b, reason: collision with root package name */
    public static final k1 f50123b = new k1();

    /* renamed from: c, reason: collision with root package name */
    public static final l1 f50124c = new l1();

    /* renamed from: d, reason: collision with root package name */
    public static final j1 f50125d = new j1();

    public static void a(int i2, int i3, int i4) {
        if (i3 <= i4) {
            if (i3 < 0) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
            if (i4 > i2) {
                throw new ArrayIndexOutOfBoundsException(i4);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i3 + ") > fence(" + i4 + ")");
    }

    public static h1 b(Object[] objArr, int i2, int i3, int i4) {
        a(((Object[]) Objects.requireNonNull(objArr)).length, i2, i3);
        return new h1(objArr, i2, i3, i4);
    }

    public static Spliterator.OfInt spliterator(int[] iArr, int i2, int i3, int i4) {
        a(((int[]) Objects.requireNonNull(iArr)).length, i2, i3);
        return new n1(iArr, i2, i3, i4);
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i2) {
        return new o1((java.util.Collection) Objects.requireNonNull(collection), i2);
    }
}
