package j$.util;

import j$.util.Spliterator;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class Spliterators {

    /* renamed from: a, reason: collision with root package name */
    private static final Spliterator f37766a = new o0();

    /* renamed from: b, reason: collision with root package name */
    private static final Spliterator.OfInt f37767b = new m0();

    /* renamed from: c, reason: collision with root package name */
    private static final a0 f37768c = new n0();

    /* renamed from: d, reason: collision with root package name */
    private static final V f37769d = new l0();

    public static Spliterator e() {
        return f37766a;
    }

    public static Spliterator.OfInt c() {
        return f37767b;
    }

    public static a0 d() {
        return f37768c;
    }

    public static V b() {
        return f37769d;
    }

    public static Spliterator l(Object[] objArr, int i5, int i10) {
        a(((Object[]) Objects.requireNonNull(objArr)).length, i5, i10);
        return new j0(objArr, i5, i10, 1040);
    }

    public static Spliterator.OfInt spliterator(int[] iArr, int i5, int i10, int i11) {
        a(((int[]) Objects.requireNonNull(iArr)).length, i5, i10);
        return new p0(iArr, i5, i10, i11);
    }

    public static a0 k(long[] jArr, int i5, int i10) {
        a(((long[]) Objects.requireNonNull(jArr)).length, i5, i10);
        return new r0(jArr, i5, i10, 1040);
    }

    public static V j(double[] dArr, int i5, int i10) {
        a(((double[]) Objects.requireNonNull(dArr)).length, i5, i10);
        return new k0(dArr, i5, i10, 1040);
    }

    private static void a(int i5, int i10, int i11) {
        if (i10 <= i11) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(i10);
            }
            if (i11 > i5) {
                throw new ArrayIndexOutOfBoundsException(i11);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i10 + ") > fence(" + i11 + ")");
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i5) {
        return new q0((java.util.Collection) Objects.requireNonNull(collection), i5);
    }

    public static Spliterator m(Iterator it) {
        return new q0((Iterator) Objects.requireNonNull(it));
    }

    public static Iterator i(Spliterator spliterator) {
        Objects.requireNonNull(spliterator);
        return new f0(spliterator);
    }

    public static K g(Spliterator.OfInt ofInt) {
        Objects.requireNonNull(ofInt);
        return new g0(ofInt);
    }

    public static O h(a0 a0Var) {
        Objects.requireNonNull(a0Var);
        return new h0(a0Var);
    }

    public static G f(V v2) {
        Objects.requireNonNull(v2);
        return new i0(v2);
    }
}
