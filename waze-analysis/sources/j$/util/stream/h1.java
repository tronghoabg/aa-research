package j$.util.stream;

import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class h1 implements Supplier, ObjIntConsumer, BiConsumer, ToIntFunction, IntFunction, ObjLongConsumer, LongFunction, LongBinaryOperator, ToLongFunction, Consumer, BinaryOperator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50427a;

    public /* synthetic */ h1(int i2) {
        this.f50427a = i2;
    }

    private final void accept$j$$util$stream$Node$0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$0(Object obj) {
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f50427a) {
            case 2:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
            case 6:
                ((j$.util.x) obj).a((j$.util.x) obj2);
                break;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                break;
        }
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f50427a) {
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f50427a) {
            case 19:
                return new t2((g2) obj, (g2) obj2);
            case 20:
            case 22:
            default:
                return new x2((m2) obj, (m2) obj2);
            case 21:
                return new u2((i2) obj, (i2) obj2);
            case 23:
                return new v2((k2) obj, (k2) obj2);
        }
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j2, long j3) {
        switch (this.f50427a) {
            case 12:
                return Math.max(j2, j3);
            case 13:
                return j2 + j3;
            default:
                return Math.min(j2, j3);
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f50427a) {
            case 0:
                return new long[2];
            default:
                return new long[2];
        }
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f50427a) {
            case 2:
                break;
            case 6:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f50427a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i2) {
        switch (this.f50427a) {
            case 4:
                return Integer.valueOf(i2);
            case 7:
                return new Long[i2];
            case 17:
                return new Object[i2];
            case 25:
                return new Object[i2];
            case 26:
                return new Integer[i2];
            case 27:
                return new Long[i2];
            default:
                return new Double[i2];
        }
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j2) {
        switch (this.f50427a) {
            case 8:
                return Long.valueOf(j2);
            case 18:
                return d4.D(j2);
            case 20:
                return d4.K(j2);
            default:
                return d4.L(j2);
        }
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j2) {
        switch (this.f50427a) {
            case 5:
                ((j$.util.x) obj).accept(j2);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j2;
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void u(Object obj) {
        int i2 = this.f50427a;
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i2) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + i2;
    }
}
