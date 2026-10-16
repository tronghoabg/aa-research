package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class d4 implements r8 {

    /* renamed from: a, reason: collision with root package name */
    public static final e3 f50370a = new e3();

    /* renamed from: b, reason: collision with root package name */
    public static final c3 f50371b = new c3();

    /* renamed from: c, reason: collision with root package name */
    public static final d3 f50372c = new d3();

    /* renamed from: d, reason: collision with root package name */
    public static final b3 f50373d = new b3();

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f50374e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public static final long[] f50375f = new long[0];

    /* renamed from: g, reason: collision with root package name */
    public static final double[] f50376g = new double[0];

    public static i2 A(a aVar, Spliterator spliterator, boolean z) {
        long jR = aVar.r(spliterator);
        if (jR < 0 || !spliterator.hasCharacteristics(16384)) {
            i2 i2Var = (i2) new r2(aVar, spliterator, new h1(20), new h1(21)).invoke();
            return z ? H(i2Var) : i2Var;
        }
        if (jR >= 2147483639) {
            j$.time.f.b("Stream size exceeds max array size");
            return null;
        }
        int[] iArr = new int[(int) jR];
        new u3(spliterator, aVar, iArr).invoke();
        return new h3(iArr);
    }

    public static k2 B(a aVar, Spliterator spliterator, boolean z) {
        long jR = aVar.r(spliterator);
        if (jR < 0 || !spliterator.hasCharacteristics(16384)) {
            k2 k2Var = (k2) new r2(aVar, spliterator, new h1(22), new h1(23)).invoke();
            return z ? I(k2Var) : k2Var;
        }
        if (jR >= 2147483639) {
            j$.time.f.b("Stream size exceeds max array size");
            return null;
        }
        long[] jArr = new long[(int) jR];
        new v3(spliterator, aVar, jArr).invoke();
        return new q3(jArr);
    }

    public static o2 C(k7 k7Var, m2 m2Var, m2 m2Var2) {
        int i2 = n2.f50535a[k7Var.ordinal()];
        if (i2 == 1) {
            return new x2(m2Var, m2Var2);
        }
        if (i2 == 2) {
            return new u2((i2) m2Var, (i2) m2Var2);
        }
        if (i2 == 3) {
            return new v2((k2) m2Var, (k2) m2Var2);
        }
        if (i2 == 4) {
            return new t2((g2) m2Var, (g2) m2Var2);
        }
        throw new IllegalStateException("Unknown shape ".concat(String.valueOf(k7Var)));
    }

    public static b2 D(long j2) {
        return (j2 < 0 || j2 >= 2147483639) ? new a3() : new z2(j2);
    }

    public static f3 E(k7 k7Var) {
        int i2 = n2.f50535a[k7Var.ordinal()];
        if (i2 == 1) {
            return f50370a;
        }
        if (i2 == 2) {
            return f50371b;
        }
        if (i2 == 3) {
            return f50372c;
        }
        if (i2 == 4) {
            return f50373d;
        }
        throw new IllegalStateException("Unknown shape ".concat(String.valueOf(k7Var)));
    }

    public static m2 F(m2 m2Var, IntFunction intFunction) {
        if (m2Var.s() <= 0) {
            return m2Var;
        }
        long jCount = m2Var.count();
        if (jCount >= 2147483639) {
            j$.time.f.b("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new b4(m2Var, objArr, 1).invoke();
        return new p2(objArr);
    }

    public static g2 G(g2 g2Var) {
        if (g2Var.s() <= 0) {
            return g2Var;
        }
        long jCount = g2Var.count();
        if (jCount >= 2147483639) {
            j$.time.f.b("Stream size exceeds max array size");
            return null;
        }
        double[] dArr = new double[(int) jCount];
        new z3(g2Var, dArr, 0).invoke();
        return new y2(dArr);
    }

    public static i2 H(i2 i2Var) {
        if (i2Var.s() <= 0) {
            return i2Var;
        }
        long jCount = i2Var.count();
        if (jCount >= 2147483639) {
            j$.time.f.b("Stream size exceeds max array size");
            return null;
        }
        int[] iArr = new int[(int) jCount];
        new a4(i2Var, iArr, 0).invoke();
        return new h3(iArr);
    }

    public static k2 I(k2 k2Var) {
        if (k2Var.s() <= 0) {
            return k2Var;
        }
        long jCount = k2Var.count();
        if (jCount >= 2147483639) {
            j$.time.f.b("Stream size exceeds max array size");
            return null;
        }
        long[] jArr = new long[(int) jCount];
        new z3(k2Var, jArr, 0).invoke();
        return new q3(jArr);
    }

    public static g0 J(Function function) {
        g0 g0Var = new g0();
        g0Var.f50410a = function;
        return g0Var;
    }

    public static c2 K(long j2) {
        return (j2 < 0 || j2 >= 2147483639) ? new j3() : new i3(j2);
    }

    public static d2 L(long j2) {
        return (j2 < 0 || j2 >= 2147483639) ? new s3() : new r3(j2);
    }

    public static j$.nio.file.z M(z1 z1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(z1Var);
        return new j$.nio.file.z(k7.DOUBLE_VALUE, z1Var, new t1(z1Var, 2));
    }

    public static j$.nio.file.z N(z1 z1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(z1Var);
        return new j$.nio.file.z(k7.INT_VALUE, z1Var, new t1(z1Var, 1));
    }

    public static j$.nio.file.z O(z1 z1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(z1Var);
        return new j$.nio.file.z(k7.LONG_VALUE, z1Var, new t1(z1Var, 0));
    }

    public static j$.nio.file.z P(z1 z1Var, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(z1Var);
        return new j$.nio.file.z(k7.REFERENCE, z1Var, new j$.nio.file.z(6, z1Var, predicate));
    }

    public static void d() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void e(q5 q5Var, Double d2) {
        if (t8.f50623a) {
            t8.a(q5Var.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        q5Var.accept(d2.doubleValue());
    }

    public static void g(r5 r5Var, Integer num) {
        if (t8.f50623a) {
            t8.a(r5Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        r5Var.accept(num.intValue());
    }

    public static void i(s5 s5Var, Long l2) {
        if (t8.f50623a) {
            t8.a(s5Var.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        s5Var.accept(l2.longValue());
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Object[] m(l2 l2Var, IntFunction intFunction) {
        if (t8.f50623a) {
            t8.a(l2Var.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (l2Var.count() >= 2147483639) {
            j$.time.f.b("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) l2Var.count());
        l2Var.h(objArr, 0);
        return objArr;
    }

    public static void n(g2 g2Var, Double[] dArr, int i2) {
        if (t8.f50623a) {
            t8.a(g2Var.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) g2Var.b();
        for (int i3 = 0; i3 < dArr2.length; i3++) {
            dArr[i2 + i3] = Double.valueOf(dArr2[i3]);
        }
    }

    public static void o(i2 i2Var, Integer[] numArr, int i2) {
        if (t8.f50623a) {
            t8.a(i2Var.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) i2Var.b();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            numArr[i2 + i3] = Integer.valueOf(iArr[i3]);
        }
    }

    public static void p(k2 k2Var, Long[] lArr, int i2) {
        if (t8.f50623a) {
            t8.a(k2Var.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) k2Var.b();
        for (int i3 = 0; i3 < jArr.length; i3++) {
            lArr[i2 + i3] = Long.valueOf(jArr[i3]);
        }
    }

    public static void q(g2 g2Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            g2Var.d((DoubleConsumer) consumer);
        } else {
            if (t8.f50623a) {
                t8.a(g2Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.s0) g2Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void r(i2 i2Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            i2Var.d((IntConsumer) consumer);
        } else {
            if (t8.f50623a) {
                t8.a(i2Var.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((Spliterator.OfInt) i2Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void s(k2 k2Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            k2Var.d((LongConsumer) consumer);
        } else {
            if (t8.f50623a) {
                t8.a(k2Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.x0) k2Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static g2 t(g2 g2Var, long j2, long j3) {
        if (j2 == 0 && j3 == g2Var.count()) {
            return g2Var;
        }
        long j4 = j3 - j2;
        j$.util.s0 s0Var = (j$.util.s0) g2Var.spliterator();
        b2 b2VarD = D(j4);
        b2VarD.l(j4);
        int i2 = 0;
        for (int i3 = 0; i3 < j2 && s0Var.tryAdvance((DoubleConsumer) new f2(i2)); i3++) {
        }
        if (j3 == g2Var.count()) {
            s0Var.forEachRemaining((DoubleConsumer) b2VarD);
        } else {
            while (i2 < j4 && s0Var.tryAdvance((DoubleConsumer) b2VarD)) {
                i2++;
            }
        }
        b2VarD.end();
        return b2VarD.build();
    }

    public static i2 u(i2 i2Var, long j2, long j3) {
        if (j2 == 0 && j3 == i2Var.count()) {
            return i2Var;
        }
        long j4 = j3 - j2;
        Spliterator.OfInt ofInt = (Spliterator.OfInt) i2Var.spliterator();
        c2 c2VarK = K(j4);
        c2VarK.l(j4);
        for (int i2 = 0; i2 < j2 && ofInt.tryAdvance((IntConsumer) new h2(0)); i2++) {
        }
        if (j3 == i2Var.count()) {
            ofInt.forEachRemaining((IntConsumer) c2VarK);
        } else {
            for (int i3 = 0; i3 < j4 && ofInt.tryAdvance((IntConsumer) c2VarK); i3++) {
            }
        }
        c2VarK.end();
        return c2VarK.build();
    }

    public static k2 v(k2 k2Var, long j2, long j3) {
        if (j2 == 0 && j3 == k2Var.count()) {
            return k2Var;
        }
        long j4 = j3 - j2;
        j$.util.x0 x0Var = (j$.util.x0) k2Var.spliterator();
        d2 d2VarL = L(j4);
        d2VarL.l(j4);
        int i2 = 0;
        for (int i3 = 0; i3 < j2 && x0Var.tryAdvance((LongConsumer) new j2(i2)); i3++) {
        }
        if (j3 == k2Var.count()) {
            x0Var.forEachRemaining((LongConsumer) d2VarL);
        } else {
            while (i2 < j4 && x0Var.tryAdvance((LongConsumer) d2VarL)) {
                i2++;
            }
        }
        d2VarL.end();
        return d2VarL.build();
    }

    public static m2 w(m2 m2Var, long j2, long j3, IntFunction intFunction) {
        if (j2 == 0 && j3 == m2Var.count()) {
            return m2Var;
        }
        Spliterator spliterator = m2Var.spliterator();
        long j4 = j3 - j2;
        e2 e2VarX = x(j4, intFunction);
        e2VarX.l(j4);
        for (int i2 = 0; i2 < j2 && spliterator.tryAdvance(new h1(16)); i2++) {
        }
        if (j3 == m2Var.count()) {
            spliterator.forEachRemaining(e2VarX);
        } else {
            for (int i3 = 0; i3 < j4 && spliterator.tryAdvance(e2VarX); i3++) {
            }
        }
        e2VarX.end();
        return e2VarX.build();
    }

    public static e2 x(long j2, IntFunction intFunction) {
        return (j2 < 0 || j2 >= 2147483639) ? new y3() : new g3(j2, intFunction);
    }

    public static m2 y(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long jR = aVar.r(spliterator);
        if (jR < 0 || !spliterator.hasCharacteristics(16384)) {
            m2 m2Var = (m2) new r2(aVar, spliterator, new j$.desugar.sun.nio.fs.g(7, intFunction), new h1(24)).invoke();
            return z ? F(m2Var, intFunction) : m2Var;
        }
        if (jR >= 2147483639) {
            j$.time.f.b("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jR);
        new w3(spliterator, aVar, objArr).invoke();
        return new p2(objArr);
    }

    public static g2 z(a aVar, Spliterator spliterator, boolean z) {
        long jR = aVar.r(spliterator);
        if (jR < 0 || !spliterator.hasCharacteristics(16384)) {
            g2 g2Var = (g2) new r2(aVar, spliterator, new h1(18), new h1(19)).invoke();
            return z ? G(g2Var) : g2Var;
        }
        if (jR >= 2147483639) {
            j$.time.f.b("Stream size exceeds max array size");
            return null;
        }
        double[] dArr = new double[(int) jR];
        new t3(spliterator, aVar, dArr).invoke();
        return new y2(dArr);
    }

    public abstract y4 Q();

    @Override // j$.util.stream.r8
    public Object a(a aVar, Spliterator spliterator) {
        y4 y4VarQ = Q();
        aVar.Q(spliterator, y4VarQ);
        return y4VarQ.get();
    }

    @Override // j$.util.stream.r8
    public Object b(a aVar, Spliterator spliterator) {
        return ((y4) new f5(this, aVar, spliterator).invoke()).get();
    }

    @Override // j$.util.stream.r8
    public int c() {
        return 0;
    }
}
