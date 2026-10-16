package j$.util.stream;

import j$.util.C2910e;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2924a implements Supplier, Consumer, BooleanSupplier, DoubleFunction, Function, LongFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38136a;

    /* renamed from: b, reason: collision with root package name */
    public Object f38137b;

    public /* synthetic */ C2924a(int i5) {
        this.f38136a = i5;
    }

    public /* synthetic */ C2924a(int i5, Object obj) {
        this.f38136a = i5;
        this.f38137b = obj;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f38136a) {
            case 1:
                ((InterfaceC3011r2) this.f38137b).accept((InterfaceC3011r2) obj);
                break;
            default:
                ((ArrayList) this.f38137b).add(obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f38136a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f38136a) {
            case 0:
                return ((AbstractC2929b) this.f38137b).J();
            default:
                return (Spliterator) this.f38137b;
        }
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object objApply = ((Function) this.f38137b).apply(obj);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) objApply);
        }
        if (objApply instanceof java.util.stream.Stream) {
            return C2943d3.k((java.util.stream.Stream) objApply);
        }
        if (objApply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        if (objApply instanceof E) {
            return D.k((E) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return C.k((DoubleStream) objApply);
        }
        if (objApply instanceof InterfaceC2990n0) {
            return C2985m0.k((InterfaceC2990n0) objApply);
        }
        if (objApply instanceof LongStream) {
            return C2980l0.k((LongStream) objApply);
        }
        C2910e.a("java.util.stream.*Stream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d3) {
        Object objApply = ((DoubleFunction) this.f38137b).apply(d3);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof E) {
            return D.k((E) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return C.k((DoubleStream) objApply);
        }
        C2910e.a("java.util.stream.DoubleStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j8) {
        Object objApply = ((LongFunction) this.f38137b).apply(j8);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC2990n0) {
            return C2985m0.k((InterfaceC2990n0) objApply);
        }
        if (objApply instanceof LongStream) {
            return C2980l0.k((LongStream) objApply);
        }
        C2910e.a("java.util.stream.LongStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.f38136a) {
            case 2:
                C3012r3 c3012r3 = (C3012r3) this.f38137b;
                return c3012r3.f38226d.tryAdvance(c3012r3.f38227e);
            case 3:
                C3022t3 c3022t3 = (C3022t3) this.f38137b;
                return c3022t3.f38226d.tryAdvance(c3022t3.f38227e);
            case 4:
                C3032v3 c3032v3 = (C3032v3) this.f38137b;
                return c3032v3.f38226d.tryAdvance(c3032v3.f38227e);
            default:
                K3 k32 = (K3) this.f38137b;
                return k32.f38226d.tryAdvance(k32.f38227e);
        }
    }
}
