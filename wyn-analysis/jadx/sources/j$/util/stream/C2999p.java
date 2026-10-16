package j$.util.stream;

import j$.util.C3056w;
import j$.util.C3057x;
import j$.util.C3059z;
import java.util.LinkedHashSet;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;

/* renamed from: j$.util.stream.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2999p implements BiConsumer, ObjDoubleConsumer, Supplier, LongFunction, BinaryOperator, IntFunction, DoubleBinaryOperator, DoubleFunction, ToDoubleFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38275a;

    public /* synthetic */ C2999p(int i5) {
        this.f38275a = i5;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f38275a) {
            case 0:
                break;
            case 2:
                break;
            case 20:
                break;
            case 21:
                break;
        }
        return j$.com.android.tools.r8.a.a(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f38275a) {
        }
        return j$.com.android.tools.r8.a.b(this, function);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d3) {
        return Double.valueOf(d3);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j8) {
        switch (this.f38275a) {
            case 8:
                return AbstractC3044y0.G(j8);
            case 9:
            default:
                return AbstractC3044y0.O(j8);
            case 10:
                return AbstractC3044y0.N(j8);
        }
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d3, double d5) {
        switch (this.f38275a) {
            case 22:
                return Math.min(d3, d5);
            default:
                return Math.max(d3, d5);
        }
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d3) {
        switch (this.f38275a) {
            case 1:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                AbstractC2974k.a(dArr, d3);
                dArr[3] = dArr[3] + d3;
                break;
            case 2:
            default:
                ((C3056w) obj).accept(d3);
                break;
            case 3:
                double[] dArr2 = (double[]) obj;
                AbstractC2974k.a(dArr2, d3);
                dArr2[2] = dArr2[2] + d3;
                break;
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f38275a) {
            case 4:
                return new G();
            case 5:
                return new H();
            case 6:
                return new I();
            case 7:
                return new J();
            case 16:
                return new C3056w();
            case 17:
                return new C3057x();
            case 18:
                return new C3059z();
            case 19:
                return new LinkedHashSet();
            default:
                return new double[4];
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f38275a) {
            case 0:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                AbstractC2974k.a(dArr, dArr2[0]);
                AbstractC2974k.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 2:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                AbstractC2974k.a(dArr3, dArr4[0]);
                AbstractC2974k.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
            case 20:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 21:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            default:
                ((C3056w) obj).b((C3056w) obj2);
                break;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i5) {
        switch (this.f38275a) {
            case 15:
                return new Object[i5];
            default:
                return new Double[i5];
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f38275a) {
            case 9:
                return new S0((E0) obj, (E0) obj2);
            case 10:
            case 12:
            default:
                return new W0((K0) obj, (K0) obj2);
            case 11:
                return new T0((G0) obj, (G0) obj2);
            case 13:
                return new U0((I0) obj, (I0) obj2);
        }
    }
}
