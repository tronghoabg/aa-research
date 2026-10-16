package eg;

import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Predicate;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34709b;

    public /* synthetic */ b(Object obj, int i5) {
        this.f34708a = i5;
        this.f34709b = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i5 = this.f34708a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f34708a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i5 = this.f34708a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f34708a) {
            case 0:
                return Stream.CC.of((String[]) ((a) obj).f34707a.clone()).anyMatch(new c());
            default:
                return ((String) this.f34709b).equals((String) obj);
        }
    }
}
