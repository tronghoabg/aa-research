package j$.util.function;

import java.util.function.LongPredicate;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements LongPredicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LongPredicate b;
    public final /* synthetic */ LongPredicate c;

    public /* synthetic */ h(LongPredicate longPredicate, LongPredicate longPredicate2, byte b) {
        this.a = b;
        this.b = longPredicate;
        this.c = longPredicate2;
    }

    public final /* synthetic */ LongPredicate and(LongPredicate longPredicate) {
        switch (this.a) {
        }
        return LongPredicate$CC.$default$and(this, longPredicate);
    }

    public final /* synthetic */ LongPredicate negate() {
        switch (this.a) {
        }
        return LongPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ LongPredicate or(LongPredicate longPredicate) {
        switch (this.a) {
        }
        return LongPredicate$CC.$default$or(this, longPredicate);
    }

    @Override // java.util.function.LongPredicate
    public final boolean test(long j) {
        byte b = this.a;
        LongPredicate longPredicate = this.c;
        LongPredicate longPredicate2 = this.b;
        switch (b) {
            case 0:
                if (longPredicate2.test(j) || longPredicate.test(j)) {
                    break;
                }
                break;
            default:
                if (longPredicate2.test(j) && longPredicate.test(j)) {
                    break;
                }
                break;
        }
        return true;
    }
}
