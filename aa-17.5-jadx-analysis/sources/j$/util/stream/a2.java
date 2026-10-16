package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class a2 implements t4, u4 {
    public static final b1 b = new b1();
    public static final z0 c = new z0();
    public static final a1 d = new a1();
    public static final y0 e = new y0();
    public static final int[] f = new int[0];
    public static final long[] g = new long[0];
    public static final double[] h = new double[0];
    public final /* synthetic */ byte a;

    public /* synthetic */ a2(byte b2) {
        this.a = b2;
    }

    public static j0 C(j0 j0Var, IntFunction intFunction) {
        if (j0Var.l() <= 0) {
            return j0Var;
        }
        long jCount = j0Var.count();
        if (jCount >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new y1(j0Var, objArr).invoke();
        return new m0(objArr);
    }

    public static f0 D(f0 f0Var) {
        if (f0Var.l() <= 0) {
            return f0Var;
        }
        long jCount = f0Var.count();
        if (jCount >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            return null;
        }
        int[] iArr = new int[(int) jCount];
        new v1(f0Var, iArr).invoke();
        return new e1(iArr);
    }

    public static z E(long j) {
        return (j < 0 || j >= 2147483639) ? new g1() : new f1(j);
    }

    public static a0 F(long j) {
        return (j < 0 || j >= 2147483639) ? new p1() : new o1(j);
    }

    public static j$.nio.file.h0 G(w wVar, Predicate predicate) {
        predicate.getClass();
        wVar.getClass();
        return new j$.nio.file.h0(v3.REFERENCE, wVar, new j$.nio.file.h0((Object) wVar, (Object) predicate, (byte) 6));
    }

    public static void d() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void e(x2 x2Var, Integer num) {
        if (v4.a) {
            v4.a(x2Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        x2Var.accept(num.intValue());
    }

    public static void g(y2 y2Var, Long l) {
        if (v4.a) {
            v4.a(y2Var.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        y2Var.accept(l.longValue());
    }

    public static void i() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Object[] j(i0 i0Var, IntFunction intFunction) {
        if (v4.a) {
            v4.a(i0Var.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (i0Var.count() >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) i0Var.count());
        i0Var.h(objArr, 0);
        return objArr;
    }

    public static void k(d0 d0Var, Double[] dArr, int i) {
        if (v4.a) {
            v4.a(d0Var.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) d0Var.b();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static void l(f0 f0Var, Integer[] numArr, int i) {
        if (v4.a) {
            v4.a(f0Var.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) f0Var.b();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static void m(h0 h0Var, Long[] lArr, int i) {
        if (v4.a) {
            v4.a(h0Var.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) h0Var.b();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static void n(d0 d0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            d0Var.e((DoubleConsumer) consumer);
        } else {
            if (v4.a) {
                v4.a(d0Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.e0) d0Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void o(f0 f0Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            f0Var.e((IntConsumer) consumer);
        } else {
            if (v4.a) {
                v4.a(f0Var.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((Spliterator.OfInt) f0Var.spliterator()).forEachRemaining((Consumer<? super Integer>) consumer);
        }
    }

    public static void q(h0 h0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            h0Var.e((LongConsumer) consumer);
        } else {
            if (v4.a) {
                v4.a(h0Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((Spliterator.OfLong) h0Var.spliterator()).forEachRemaining((Consumer<? super Long>) consumer);
        }
    }

    public static d0 t(d0 d0Var, long j, long j2) {
        if (j == 0 && j2 == d0Var.count()) {
            return d0Var;
        }
        long j3 = j2 - j;
        j$.util.e0 e0Var = (j$.util.e0) d0Var.spliterator();
        y x0Var = (j3 < 0 || j3 >= 2147483639) ? new x0() : new w0(j3);
        x0Var.p(j3);
        boolean z = false;
        for (int i = 0; i < j && e0Var.tryAdvance((DoubleConsumer) new c0(z ? 1 : 0)); i++) {
        }
        if (j2 == d0Var.count()) {
            e0Var.forEachRemaining((DoubleConsumer) x0Var);
        } else {
            for (int i2 = 0; i2 < j3 && e0Var.tryAdvance((DoubleConsumer) x0Var); i2++) {
            }
        }
        x0Var.end();
        return x0Var.build();
    }

    public static f0 u(f0 f0Var, long j, long j2) {
        if (j == 0 && j2 == f0Var.count()) {
            return f0Var;
        }
        long j3 = j2 - j;
        Spliterator.OfInt ofInt = (Spliterator.OfInt) f0Var.spliterator();
        z zVarE = E(j3);
        zVarE.p(j3);
        for (int i = 0; i < j && ofInt.tryAdvance((IntConsumer) new e0((byte) 0)); i++) {
        }
        if (j2 == f0Var.count()) {
            ofInt.forEachRemaining((IntConsumer) zVarE);
        } else {
            for (int i2 = 0; i2 < j3 && ofInt.tryAdvance((IntConsumer) zVarE); i2++) {
            }
        }
        zVarE.end();
        return zVarE.build();
    }

    public static h0 v(h0 h0Var, long j, long j2) {
        if (j == 0 && j2 == h0Var.count()) {
            return h0Var;
        }
        long j3 = j2 - j;
        Spliterator.OfLong ofLong = (Spliterator.OfLong) h0Var.spliterator();
        a0 a0VarF = F(j3);
        a0VarF.p(j3);
        for (int i = 0; i < j && ofLong.tryAdvance((LongConsumer) new g0((byte) 0)); i++) {
        }
        if (j2 == h0Var.count()) {
            ofLong.forEachRemaining((LongConsumer) a0VarF);
        } else {
            for (int i2 = 0; i2 < j3 && ofLong.tryAdvance((LongConsumer) a0VarF); i2++) {
            }
        }
        a0VarF.end();
        return a0VarF.build();
    }

    public static j0 w(j0 j0Var, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == j0Var.count()) {
            return j0Var;
        }
        Spliterator spliterator = j0Var.spliterator();
        long j3 = j2 - j;
        b0 b0VarX = x(j3, intFunction);
        b0VarX.p(j3);
        for (int i = 0; i < j && spliterator.tryAdvance(new i((byte) 8)); i++) {
        }
        if (j2 == j0Var.count()) {
            spliterator.forEachRemaining(b0VarX);
        } else {
            for (int i2 = 0; i2 < j3 && spliterator.tryAdvance(b0VarX); i2++) {
            }
        }
        b0VarX.end();
        return b0VarX.build();
    }

    public static b0 x(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new u1() : new d1(j, intFunction);
    }

    public static j0 y(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long jG = aVar.g(spliterator);
        if (jG < 0 || !spliterator.hasCharacteristics(16384)) {
            j0 j0Var = (j0) new o0(aVar, spliterator, new j$.desugar.sun.nio.fs.h((byte) 11, intFunction), new i((byte) 14)).invoke();
            return z ? C(j0Var, intFunction) : j0Var;
        }
        if (jG >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jG);
        new s1(spliterator, aVar, objArr).invoke();
        return new m0(objArr);
    }

    public static l0 z(v3 v3Var, j0 j0Var, j0 j0Var2) {
        int i = k0.a[v3Var.ordinal()];
        if (i == 1) {
            return new u0(j0Var, j0Var2);
        }
        if (i == 2) {
            return new r0((f0) j0Var, (f0) j0Var2);
        }
        if (i == 3) {
            return new s0((h0) j0Var, (h0) j0Var2);
        }
        if (i == 4) {
            return new q0((d0) j0Var, (d0) j0Var2);
        }
        throw new IllegalStateException("Unknown shape ".concat(String.valueOf(v3Var)));
    }

    public n2 H() {
        return new p2();
    }

    @Override // j$.util.stream.t4
    public Object a(a aVar, Spliterator spliterator) {
        switch (this.a) {
            case 1:
                aVar.a(spliterator, aVar.t(this));
                return null;
            default:
                n2 n2VarH = H();
                aVar.s(spliterator, n2VarH);
                return n2VarH.get();
        }
    }

    @Override // j$.util.stream.z2
    public /* synthetic */ void accept(int i) {
        d();
        throw null;
    }

    @Override // java.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.t4
    public Object b(a aVar, Spliterator spliterator) {
        switch (this.a) {
            case 1:
                new p(aVar, spliterator, aVar.t(this)).invoke();
                return null;
            default:
                return ((n2) new q2(this, aVar, spliterator).invoke()).get();
        }
    }

    @Override // j$.util.stream.t4
    public int c() {
        switch (this.a) {
            case 1:
                return u3.q;
            default:
                return 0;
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return null;
    }

    @Override // j$.util.stream.z2
    public boolean s() {
        return false;
    }

    @Override // j$.util.stream.z2
    public /* synthetic */ void accept(long j) {
        i();
        throw null;
    }

    @Override // j$.util.stream.z2
    public void p(long j) {
    }

    @Override // j$.util.stream.z2
    public void end() {
    }
}
