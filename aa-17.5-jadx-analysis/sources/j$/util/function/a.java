package j$.util.function;

import java.util.function.BiPredicate;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements BiPredicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ BiPredicate b;
    public final /* synthetic */ BiPredicate c;

    public /* synthetic */ a(BiPredicate biPredicate, BiPredicate biPredicate2, byte b) {
        this.a = b;
        this.b = biPredicate;
        this.c = biPredicate2;
    }

    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        switch (this.a) {
        }
        return BiPredicate$CC.$default$and(this, biPredicate);
    }

    public final /* synthetic */ BiPredicate negate() {
        switch (this.a) {
        }
        return BiPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        switch (this.a) {
        }
        return BiPredicate$CC.$default$or(this, biPredicate);
    }

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        byte b = this.a;
        BiPredicate biPredicate = this.c;
        BiPredicate biPredicate2 = this.b;
        switch (b) {
            case 0:
                if (biPredicate2.test(obj, obj2) || biPredicate.test(obj, obj2)) {
                    break;
                }
                break;
            default:
                if (biPredicate2.test(obj, obj2) && biPredicate.test(obj, obj2)) {
                    break;
                }
                break;
        }
        return true;
    }
}
