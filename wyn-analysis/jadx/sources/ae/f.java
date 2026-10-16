package ae;

import ef.C2527k;
import ff.AbstractC2641B;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final e f17648a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f17649b;

    /* renamed from: c, reason: collision with root package name */
    public G9.e f17650c;

    public f(e eVar) {
        this.f17648a = eVar;
        this.f17649b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f17648a == fVar.f17648a && AbstractC3340k.a(this.f17649b, fVar.f17649b);
    }

    public final int hashCode() {
        int iHashCode = this.f17648a.hashCode() * 31;
        Map map = this.f17649b;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "QAction(type=" + this.f17648a + ", parameters=" + this.f17649b + ")";
    }

    public f(e eVar, Map map) {
        this.f17648a = eVar;
        this.f17649b = map;
    }

    public f(e eVar, c cVar, Object obj) {
        Map mapE = AbstractC2641B.E(new C2527k(cVar, obj));
        this.f17648a = eVar;
        this.f17649b = mapE;
    }
}
