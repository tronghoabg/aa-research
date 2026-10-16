package e.a.d;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class gc {

    /* renamed from: a, reason: collision with root package name */
    private final ga f47003a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f47004b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f47005c;

    /* renamed from: d, reason: collision with root package name */
    private final ix f47006d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f47007e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f47008f;

    gc(ga gaVar, Map map, Map map2, ix ixVar, Object obj, Map map3) {
        this.f47003a = gaVar;
        this.f47004b = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f47005c = DesugarCollections.unmodifiableMap(new HashMap(map2));
        this.f47006d = ixVar;
        this.f47007e = obj;
        this.f47008f = map3 != null ? DesugarCollections.unmodifiableMap(new HashMap(map3)) : null;
    }

    final e.a.aw a() {
        if (this.f47005c.isEmpty() && this.f47004b.isEmpty() && this.f47003a == null) {
            return null;
        }
        return new gb(this);
    }

    final ga b(e.a.cq cqVar) {
        ga gaVar = (ga) this.f47004b.get(cqVar.f());
        if (gaVar == null) {
            gaVar = (ga) this.f47005c.get(cqVar.g());
        }
        return gaVar == null ? this.f47003a : gaVar;
    }

    final ix c() {
        return this.f47006d;
    }

    final Object d() {
        return this.f47007e;
    }

    final Map e() {
        return this.f47008f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            gc gcVar = (gc) obj;
            if (Objects.equals(this.f47003a, gcVar.f47003a) && Objects.equals(this.f47004b, gcVar.f47004b) && Objects.equals(this.f47005c, gcVar.f47005c) && Objects.equals(this.f47006d, gcVar.f47006d) && Objects.equals(this.f47007e, gcVar.f47007e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f47003a, this.f47004b, this.f47005c, this.f47006d, this.f47007e);
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("defaultMethodConfig", this.f47003a);
        zVarH.d("serviceMethodMap", this.f47004b);
        zVarH.d("serviceMap", this.f47005c);
        zVarH.d("retryThrottling", this.f47006d);
        zVarH.d("loadBalancingConfig", this.f47007e);
        return zVarH.toString();
    }
}
