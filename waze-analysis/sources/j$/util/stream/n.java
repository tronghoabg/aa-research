package j$.util.stream;

import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class n implements ToDoubleFunction, IntFunction, DoubleBinaryOperator, Supplier, ObjDoubleConsumer, BiConsumer, Predicate, BinaryOperator, Function, IntBinaryOperator, ObjIntConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50529a;

    public /* synthetic */ n(int i2) {
        this.f50529a = i2;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f50529a) {
            case 5:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                Collectors.a(dArr, dArr2[0]);
                Collectors.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 9:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                Collectors.a(dArr3, dArr4[0]);
                Collectors.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
            case 21:
                ((c1) obj).u(obj2);
                break;
            default:
                ((j$.util.v) obj).a((j$.util.v) obj2);
                break;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f50529a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f50529a) {
            case 5:
                break;
            case 9:
                break;
            case 21:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        c1 c1Var = (c1) obj;
        c1 c1Var2 = (c1) obj2;
        if (c1Var.f50348a == null && c1Var.f50349b == null) {
            return c1Var2;
        }
        if (c1Var2.f50348a == null && c1Var2.f50349b == null) {
            return c1Var;
        }
        m2 m2VarBuild = c1Var2.build();
        if (c1Var.f50348a == null || !(m2VarBuild instanceof b1) || ((c) m2VarBuild).count() >= 8) {
            c1Var.f50349b = d4.C(k7.REFERENCE, c1Var.build(), m2VarBuild);
            return c1Var;
        }
        ((e7) m2VarBuild).forEach(c1Var);
        return c1Var;
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d2, double d3) {
        switch (this.f50529a) {
            case 2:
                return Math.max(d2, d3);
            default:
                return Math.min(d2, d3);
        }
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i2, int i3) {
        switch (this.f50529a) {
            case 25:
                return Math.min(i2, i3);
            case 28:
                return i2 + i3;
            default:
                return Math.max(i2, i3);
        }
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f50529a) {
            case 3:
                return new double[3];
            case 7:
                return new double[4];
            case 12:
                return new a0();
            case 14:
                return new b0();
            case 16:
                return new c0();
            case 18:
                return new d0();
            default:
                return new c1();
        }
    }

    public /* synthetic */ Predicate negate() {
        switch (this.f50529a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f50529a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.f50529a) {
            case 11:
                return ((j$.util.z) obj).f50737a;
            case 12:
            case 14:
            default:
                return ((Optional) obj).f50121a != null;
            case 13:
                return ((j$.util.a0) obj).f50130a;
            case 15:
                return ((j$.util.b0) obj).f50135a;
        }
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    /* renamed from: andThen, reason: collision with other method in class */
    public /* synthetic */ Function m37435andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        return ((c1) obj).build();
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i2) {
        switch (this.f50529a) {
            case 1:
                return new Double[i2];
            case 19:
                return new Object[i2];
            default:
                return new Integer[i2];
        }
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i2) {
        ((j$.util.v) obj).accept(i2);
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d2) {
        switch (this.f50529a) {
            case 4:
                double[] dArr = (double[]) obj;
                Collectors.a(dArr, d2);
                dArr[2] = dArr[2] + d2;
                break;
            case 8:
                double[] dArr2 = (double[]) obj;
                dArr2[2] = dArr2[2] + 1.0d;
                Collectors.a(dArr2, d2);
                dArr2[3] = dArr2[3] + d2;
                break;
            default:
                ((j$.util.u) obj).accept(d2);
                break;
        }
    }
}
