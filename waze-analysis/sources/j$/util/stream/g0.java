package j$.util.stream;

import j$.util.function.Function$CC;
import j$.util.stream.IntStream;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class g0 implements DoubleFunction, Function, IntFunction, LongFunction {

    /* renamed from: a, reason: collision with root package name */
    public Object f50410a;

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object objApply = ((Function) this.f50410a).apply(obj);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof Stream) {
            return g7.e((Stream) objApply);
        }
        if (objApply instanceof java.util.stream.Stream) {
            return f7.e((java.util.stream.Stream) objApply);
        }
        if (objApply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return y.e((DoubleStream) objApply);
        }
        if (objApply instanceof java.util.stream.DoubleStream) {
            return x.e((java.util.stream.DoubleStream) objApply);
        }
        if (objApply instanceof LongStream) {
            return s1.e((LongStream) objApply);
        }
        if (objApply instanceof java.util.stream.LongStream) {
            return r1.e((java.util.stream.LongStream) objApply);
        }
        j$.util.e.a("java.util.stream.*Stream", objApply.getClass());
        throw null;
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i2) {
        Object objApply = ((IntFunction) this.f50410a).apply(i2);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        j$.util.e.a("java.util.stream.IntStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d2) {
        Object objApply = ((DoubleFunction) this.f50410a).apply(d2);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof DoubleStream) {
            return y.e((DoubleStream) objApply);
        }
        if (objApply instanceof java.util.stream.DoubleStream) {
            return x.e((java.util.stream.DoubleStream) objApply);
        }
        j$.util.e.a("java.util.stream.DoubleStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j2) {
        Object objApply = ((LongFunction) this.f50410a).apply(j2);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof LongStream) {
            return s1.e((LongStream) objApply);
        }
        if (objApply instanceof java.util.stream.LongStream) {
            return r1.e((java.util.stream.LongStream) objApply);
        }
        j$.util.e.a("java.util.stream.LongStream", objApply.getClass());
        throw null;
    }
}
