package m9;

import ba.C1521a;
import j$.util.Objects;
import java.util.Map;
import ka.C1;

/* renamed from: m9.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3507f {

    /* renamed from: a, reason: collision with root package name */
    public final C3506e f40478a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f40479b;

    public C3507f(C3506e c3506e, Map map) {
        c3506e.getClass();
        this.f40478a = c3506e;
        this.f40479b = map;
    }

    public final long a() {
        C3503b c3503b = new C3503b(null, "count");
        Number number = (Number) c(c3503b);
        Long lValueOf = number != null ? Long.valueOf(number.longValue()) : null;
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        throw new IllegalArgumentException(wg.b.c(new StringBuilder("RunAggregationQueryResponse alias "), c3503b.f40472c, " is null"));
    }

    public final Object b(AbstractC3505d abstractC3505d) {
        Map map = this.f40479b;
        String str = abstractC3505d.f40472c;
        if (map.containsKey(str)) {
            return new C1521a((Object) this.f40478a.f40475a.f40457b, false, (Object) EnumC3515n.f40500d, 14).o((C1) map.get(str));
        }
        throw new IllegalArgumentException("'" + abstractC3505d.f40471b + "(" + abstractC3505d.a() + ")' was not requested in the aggregation query.");
    }

    public final Object c(AbstractC3505d abstractC3505d) {
        Object objB = b(abstractC3505d);
        if (objB == null) {
            return null;
        }
        if (Number.class.isInstance(objB)) {
            return Number.class.cast(objB);
        }
        throw new RuntimeException("AggregateField '" + abstractC3505d.f40472c + "' is not a " + Number.class.getName());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3507f)) {
            return false;
        }
        C3507f c3507f = (C3507f) obj;
        return this.f40478a.equals(c3507f.f40478a) && this.f40479b.equals(c3507f.f40479b);
    }

    public final int hashCode() {
        return Objects.hash(this.f40478a, this.f40479b);
    }
}
