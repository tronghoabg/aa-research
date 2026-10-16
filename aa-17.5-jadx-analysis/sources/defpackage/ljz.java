package defpackage;

import android.util.Range;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class ljz implements Predicate {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ ljz(long j, int i) {
        this.b = i;
        this.a = j;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return this.b != 0 ? Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo56negate() {
        return this.b != 0 ? Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        return this.b != 0 ? Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        if (this.b != 0) {
            return ((Range) obj).contains((Range) Long.valueOf(this.a));
        }
        Map map = lkb.a;
        return (this.a & ((Long) obj).longValue()) != 0;
    }
}
