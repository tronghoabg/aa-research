package j$.util.function;

import java.util.function.LongUnaryOperator;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements LongUnaryOperator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LongUnaryOperator b;
    public final /* synthetic */ LongUnaryOperator c;

    public /* synthetic */ i(LongUnaryOperator longUnaryOperator, LongUnaryOperator longUnaryOperator2, byte b) {
        this.a = b;
        this.b = longUnaryOperator;
        this.c = longUnaryOperator2;
    }

    public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
        switch (this.a) {
        }
        return LongUnaryOperator$CC.$default$andThen(this, longUnaryOperator);
    }

    @Override // java.util.function.LongUnaryOperator
    public final long applyAsLong(long j) {
        byte b = this.a;
        LongUnaryOperator longUnaryOperator = this.c;
        LongUnaryOperator longUnaryOperator2 = this.b;
        switch (b) {
            case 0:
                return longUnaryOperator.applyAsLong(longUnaryOperator2.applyAsLong(j));
            default:
                return longUnaryOperator2.applyAsLong(longUnaryOperator.applyAsLong(j));
        }
    }

    public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
        switch (this.a) {
        }
        return LongUnaryOperator$CC.$default$compose(this, longUnaryOperator);
    }
}
