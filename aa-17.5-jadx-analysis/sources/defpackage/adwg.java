package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class adwg {
    public final adyf a;
    public final Object b;
    public final Map c;
    private final adwe d;
    private final Map e;
    private final Map f;

    public adwg(adwe adweVar, Map map, Map map2, adyf adyfVar, Object obj, Map map3) {
        this.d = adweVar;
        this.e = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f = DesugarCollections.unmodifiableMap(new HashMap(map2));
        this.a = adyfVar;
        this.b = obj;
        this.c = map3 != null ? DesugarCollections.unmodifiableMap(new HashMap(map3)) : null;
    }

    final adkk a() {
        if (this.f.isEmpty() && this.e.isEmpty() && this.d == null) {
            return null;
        }
        return new adwf(this);
    }

    final adwe b(admf admfVar) {
        adwe adweVar = (adwe) this.e.get(admfVar.b);
        if (adweVar == null) {
            adweVar = (adwe) this.f.get(admfVar.c);
        }
        return adweVar == null ? this.d : adweVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            adwg adwgVar = (adwg) obj;
            if (Objects.equals(this.d, adwgVar.d) && Objects.equals(this.e, adwgVar.e) && Objects.equals(this.f, adwgVar.f) && Objects.equals(this.a, adwgVar.a) && Objects.equals(this.b, adwgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.e, this.f, this.a, this.b);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("defaultMethodConfig", this.d);
        xxgVarAo.b("serviceMethodMap", this.e);
        xxgVarAo.b("serviceMap", this.f);
        xxgVarAo.b("retryThrottling", this.a);
        xxgVarAo.b("loadBalancingConfig", this.b);
        return xxgVarAo.toString();
    }
}
