package j$.util.function;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements IntPredicate, Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f37889a;

    public /* synthetic */ f(Object obj) {
        this.f37889a = obj;
    }

    public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return IntPredicate$CC.$default$and(this, intPredicate);
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ IntPredicate negate() {
        return IntPredicate$CC.$default$negate(this);
    }

    /* renamed from: negate, reason: collision with other method in class */
    public /* synthetic */ Predicate m398negate() {
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return IntPredicate$CC.$default$or(this, intPredicate);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.f37889a).test(obj);
    }

    @Override // java.util.function.IntPredicate
    public boolean test(int i5) {
        return !((IntPredicate) this.f37889a).test(i5);
    }
}
