package j$.util.stream;

import j$.util.C3057x;
import j$.util.C3059z;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class r implements Supplier, Predicate, IntFunction, ToIntFunction, IntBinaryOperator, ObjIntConsumer, BiConsumer, ObjLongConsumer, LongBinaryOperator, ToLongFunction, LongFunction, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38298a;

    public /* synthetic */ r(int i5) {
        this.f38298a = i5;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f38298a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f38298a) {
            case 11:
                break;
            case 16:
                break;
            case 20:
                break;
        }
        return j$.com.android.tools.r8.a.a(this, biConsumer);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j8) {
        return Long.valueOf(j8);
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i5, int i10) {
        switch (this.f38298a) {
            case 9:
                return Math.min(i5, i10);
            case 12:
                return i5 + i10;
            default:
                return Math.max(i5, i10);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j8, long j10) {
        switch (this.f38298a) {
            case 18:
                return Math.min(j8, j10);
            case 26:
                return Math.max(j8, j10);
            default:
                return j8 + j10;
        }
    }

    public /* synthetic */ Predicate negate() {
        switch (this.f38298a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f38298a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.f38298a) {
            case 1:
                return ((j$.util.A) obj).c();
            case 2:
                return ((j$.util.B) obj).c();
            case 3:
                return ((j$.util.C) obj).c();
            default:
                return ((Optional) obj).isPresent();
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i5) {
        switch (this.f38298a) {
            case 5:
                return new Object[i5];
            case 6:
                return new Integer[i5];
            case 8:
                return Integer.valueOf(i5);
            case 21:
                return new Long[i5];
            default:
                return new Object[i5];
        }
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f38298a) {
            case 0:
                return new double[3];
            case 14:
                return new long[2];
            default:
                return new long[2];
        }
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j8) {
        switch (this.f38298a) {
            case 17:
                ((C3059z) obj).accept(j8);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j8;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f38298a) {
            case 11:
                ((C3057x) obj).b((C3057x) obj2);
                break;
            case 16:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
            case 20:
                ((C3059z) obj).b((C3059z) obj2);
                break;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                break;
        }
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i5) {
        switch (this.f38298a) {
            case 10:
                ((C3057x) obj).accept(i5);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + i5;
                break;
        }
    }
}
