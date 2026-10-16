package j$.util.stream;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.LongConsumer;
import java.util.function.Predicate;

/* renamed from: j$.util.stream.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3044y0 implements N3 {

    /* renamed from: a, reason: collision with root package name */
    private static final C2941d1 f38353a = new C2941d1();

    /* renamed from: b, reason: collision with root package name */
    private static final G0 f38354b = new C2931b1();

    /* renamed from: c, reason: collision with root package name */
    private static final I0 f38355c = new C2936c1();

    /* renamed from: d, reason: collision with root package name */
    private static final E0 f38356d = new C2926a1();

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f38357e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    private static final long[] f38358f = new long[0];

    /* renamed from: g, reason: collision with root package name */
    private static final double[] f38359g = new double[0];

    public abstract V1 T();

    @Override // j$.util.stream.N3
    public /* synthetic */ int d() {
        return 0;
    }

    public static C2924a M(Function function) {
        C2924a c2924a = new C2924a(8);
        c2924a.f38137b = function;
        return c2924a;
    }

    public static C3034w0 S(EnumC3029v0 enumC3029v0, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(enumC3029v0);
        return new C3034w0(EnumC2963h3.REFERENCE, enumC3029v0, new C3000p0(1, enumC3029v0, predicate));
    }

    static AbstractC2946e1 H(EnumC2963h3 enumC2963h3) {
        int i5 = L0.f38029a[enumC2963h3.ordinal()];
        if (i5 == 1) {
            return f38353a;
        }
        if (i5 == 2) {
            return (AbstractC2946e1) f38354b;
        }
        if (i5 == 3) {
            return (AbstractC2946e1) f38355c;
        }
        if (i5 == 4) {
            return (AbstractC2946e1) f38356d;
        }
        throw new IllegalStateException("Unknown shape " + enumC2963h3);
    }

    public static C3034w0 Q(EnumC3029v0 enumC3029v0, IntPredicate intPredicate) {
        Objects.requireNonNull(intPredicate);
        Objects.requireNonNull(enumC3029v0);
        return new C3034w0(EnumC2963h3.INT_VALUE, enumC3029v0, new C3000p0(0, enumC3029v0, intPredicate));
    }

    public static K0 w(K0 k02, long j8, long j10, IntFunction intFunction) {
        if (j8 == 0 && j10 == k02.count()) {
            return k02;
        }
        Spliterator spliterator = k02.spliterator();
        long j11 = j10 - j8;
        C0 c0A = A(j11, intFunction);
        c0A.l(j11);
        for (int i5 = 0; i5 < j8 && spliterator.tryAdvance(new r(28)); i5++) {
        }
        if (j10 == k02.count()) {
            spliterator.forEachRemaining(c0A);
        } else {
            for (int i10 = 0; i10 < j11 && spliterator.tryAdvance(c0A); i10++) {
            }
        }
        c0A.k();
        return c0A.a();
    }

    static M0 F(EnumC2963h3 enumC2963h3, K0 k02, K0 k03) {
        int i5 = L0.f38029a[enumC2963h3.ordinal()];
        if (i5 == 1) {
            return new W0(k02, k03);
        }
        if (i5 == 2) {
            return new T0((G0) k02, (G0) k03);
        }
        if (i5 == 3) {
            return new U0((I0) k02, (I0) k03);
        }
        if (i5 != 4) {
            throw new IllegalStateException("Unknown shape " + enumC2963h3);
        }
        return new S0((E0) k02, (E0) k03);
    }

    public static C3034w0 R(EnumC3029v0 enumC3029v0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC3029v0);
        return new C3034w0(EnumC2963h3.LONG_VALUE, enumC3029v0, new C2995o0(enumC3029v0, 0));
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static C3034w0 P(EnumC3029v0 enumC3029v0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC3029v0);
        return new C3034w0(EnumC2963h3.DOUBLE_VALUE, enumC3029v0, new C2995o0(enumC3029v0, 1));
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    static C0 A(long j8, IntFunction intFunction) {
        if (j8 >= 0 && j8 < 2147483639) {
            return new C2951f1(j8, intFunction);
        }
        return new C3040x1();
    }

    public static void a() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void g(InterfaceC3002p2 interfaceC3002p2, Integer num) {
        if (Q3.f38068a) {
            Q3.a(interfaceC3002p2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC3002p2.accept(num.intValue());
    }

    public static void i(InterfaceC3007q2 interfaceC3007q2, Long l10) {
        if (Q3.f38068a) {
            Q3.a(interfaceC3007q2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC3007q2.accept(l10.longValue());
    }

    static A0 N(long j8) {
        if (j8 < 0 || j8 >= 2147483639) {
            return new C2966i1();
        }
        return new C2961h1(j8);
    }

    public static void e(InterfaceC2997o2 interfaceC2997o2, Double d3) {
        if (Q3.f38068a) {
            Q3.a(interfaceC2997o2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        interfaceC2997o2.accept(d3.doubleValue());
    }

    static B0 O(long j8) {
        if (j8 < 0 || j8 >= 2147483639) {
            return new C3010r1();
        }
        return new C3006q1(j8);
    }

    public static Object[] m(J0 j02, IntFunction intFunction) {
        if (Q3.f38068a) {
            Q3.a(j02.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (j02.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j02.count());
        j02.i(objArr, 0);
        return objArr;
    }

    static InterfaceC3049z0 G(long j8) {
        if (j8 < 0 || j8 >= 2147483639) {
            return new Z0();
        }
        return new Y0(j8);
    }

    public static K0 B(AbstractC2929b abstractC2929b, Spliterator spliterator, boolean z2, IntFunction intFunction) {
        long jD = abstractC2929b.D(spliterator);
        if (jD < 0 || !spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            Q0 q02 = new Q0();
            q02.f38063a = intFunction;
            K0 k02 = (K0) new P0(abstractC2929b, spliterator, q02, new C2999p(14), 3).invoke();
            return z2 ? I(k02, intFunction) : k02;
        }
        if (jD >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jD);
        new C3030v1(spliterator, abstractC2929b, objArr).invoke();
        return new N0(objArr);
    }

    public static void r(G0 g02, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            g02.e((IntConsumer) consumer);
        } else {
            if (Q3.f38068a) {
                Q3.a(g02.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((Spliterator.OfInt) g02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void o(G0 g02, Integer[] numArr, int i5) {
        if (Q3.f38068a) {
            Q3.a(g02.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) g02.d();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            numArr[i5 + i10] = Integer.valueOf(iArr[i10]);
        }
    }

    public static G0 u(G0 g02, long j8, long j10) {
        if (j8 == 0 && j10 == g02.count()) {
            return g02;
        }
        long j11 = j10 - j8;
        Spliterator.OfInt ofInt = (Spliterator.OfInt) g02.spliterator();
        A0 a0N = N(j11);
        a0N.l(j11);
        for (int i5 = 0; i5 < j8 && ofInt.tryAdvance((IntConsumer) new F0(0)); i5++) {
        }
        if (j10 == g02.count()) {
            ofInt.forEachRemaining((IntConsumer) a0N);
        } else {
            for (int i10 = 0; i10 < j11 && ofInt.tryAdvance((IntConsumer) a0N); i10++) {
            }
        }
        a0N.k();
        return a0N.a();
    }

    public static G0 D(AbstractC2929b abstractC2929b, Spliterator spliterator, boolean z2) {
        long jD = abstractC2929b.D(spliterator);
        if (jD < 0 || !spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            G0 g02 = (G0) new P0(abstractC2929b, spliterator, new C2999p(10), new C2999p(11), 1).invoke();
            return z2 ? K(g02) : g02;
        }
        if (jD >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jD];
        new C3020t1(spliterator, abstractC2929b, iArr).invoke();
        return new C2956g1(iArr);
    }

    public static I0 E(AbstractC2929b abstractC2929b, Spliterator spliterator, boolean z2) {
        long jD = abstractC2929b.D(spliterator);
        if (jD < 0 || !spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            I0 i02 = (I0) new P0(abstractC2929b, spliterator, new C2999p(12), new C2999p(13), 2).invoke();
            return z2 ? L(i02) : i02;
        }
        if (jD >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jD];
        new C3025u1(spliterator, abstractC2929b, jArr).invoke();
        return new C3001p1(jArr);
    }

    public static void s(I0 i02, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            i02.e((LongConsumer) consumer);
        } else {
            if (Q3.f38068a) {
                Q3.a(i02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.a0) i02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void p(I0 i02, Long[] lArr, int i5) {
        if (Q3.f38068a) {
            Q3.a(i02.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) i02.d();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            lArr[i5 + i10] = Long.valueOf(jArr[i10]);
        }
    }

    public static I0 v(I0 i02, long j8, long j10) {
        if (j8 == 0 && j10 == i02.count()) {
            return i02;
        }
        long j11 = j10 - j8;
        j$.util.a0 a0Var = (j$.util.a0) i02.spliterator();
        B0 b0O = O(j11);
        b0O.l(j11);
        for (int i5 = 0; i5 < j8 && a0Var.tryAdvance((LongConsumer) new H0(0)); i5++) {
        }
        if (j10 == i02.count()) {
            a0Var.forEachRemaining((LongConsumer) b0O);
        } else {
            for (int i10 = 0; i10 < j11 && a0Var.tryAdvance((LongConsumer) b0O); i10++) {
            }
        }
        b0O.k();
        return b0O.a();
    }

    public static E0 C(AbstractC2929b abstractC2929b, Spliterator spliterator, boolean z2) {
        long jD = abstractC2929b.D(spliterator);
        if (jD < 0 || !spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            E0 e02 = (E0) new P0(abstractC2929b, spliterator, new C2999p(8), new C2999p(9), 0).invoke();
            return z2 ? J(e02) : e02;
        }
        if (jD >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jD];
        new C3015s1(spliterator, abstractC2929b, dArr).invoke();
        return new X0(dArr);
    }

    public static K0 I(K0 k02, IntFunction intFunction) {
        if (k02.q() <= 0) {
            return k02;
        }
        long jCount = k02.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new A1(k02, objArr, 1).invoke();
        return new N0(objArr);
    }

    public static void q(E0 e02, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            e02.e((DoubleConsumer) consumer);
        } else {
            if (Q3.f38068a) {
                Q3.a(e02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.V) e02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static G0 K(G0 g02) {
        if (g02.q() <= 0) {
            return g02;
        }
        long jCount = g02.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jCount];
        new C3050z1(g02, iArr, 0).invoke();
        return new C2956g1(iArr);
    }

    public static void n(E0 e02, Double[] dArr, int i5) {
        if (Q3.f38068a) {
            Q3.a(e02.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) e02.d();
        for (int i10 = 0; i10 < dArr2.length; i10++) {
            dArr[i5 + i10] = Double.valueOf(dArr2[i10]);
        }
    }

    public static E0 t(E0 e02, long j8, long j10) {
        if (j8 == 0 && j10 == e02.count()) {
            return e02;
        }
        long j11 = j10 - j8;
        j$.util.V v2 = (j$.util.V) e02.spliterator();
        InterfaceC3049z0 interfaceC3049z0G = G(j11);
        interfaceC3049z0G.l(j11);
        for (int i5 = 0; i5 < j8 && v2.tryAdvance((DoubleConsumer) new D0(0)); i5++) {
        }
        if (j10 == e02.count()) {
            v2.forEachRemaining((DoubleConsumer) interfaceC3049z0G);
        } else {
            for (int i10 = 0; i10 < j11 && v2.tryAdvance((DoubleConsumer) interfaceC3049z0G); i10++) {
            }
        }
        interfaceC3049z0G.k();
        return interfaceC3049z0G.a();
    }

    public static I0 L(I0 i02) {
        if (i02.q() <= 0) {
            return i02;
        }
        long jCount = i02.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jCount];
        new C3045y1(i02, jArr, 0).invoke();
        return new C3001p1(jArr);
    }

    public static E0 J(E0 e02) {
        if (e02.q() <= 0) {
            return e02;
        }
        long jCount = e02.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jCount];
        new C3045y1(e02, dArr, 0).invoke();
        return new X0(dArr);
    }

    @Override // j$.util.stream.N3
    public Object b(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        V1 v1T = T();
        abstractC2929b.S(spliterator, v1T);
        return v1T.get();
    }

    @Override // j$.util.stream.N3
    public Object c(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        return ((V1) new C2937c2(this, abstractC2929b, spliterator).invoke()).get();
    }
}
