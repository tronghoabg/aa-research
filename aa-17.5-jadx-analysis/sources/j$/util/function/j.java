package j$.util.function;

import java.util.function.Predicate;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Predicate b;
    public final /* synthetic */ Predicate c;

    public /* synthetic */ j(Predicate predicate, Predicate predicate2, byte b) {
        this.a = b;
        this.b = predicate;
        this.c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo56negate() {
        switch (this.a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        byte b = this.a;
        Predicate predicate = this.c;
        Predicate predicate2 = this.b;
        switch (b) {
            case 0:
                if (!predicate2.test(obj) || !predicate.test(obj)) {
                    break;
                }
                break;
            default:
                if (!predicate2.test(obj) && !predicate.test(obj)) {
                    break;
                }
                break;
        }
        return false;
    }
}
