package z;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final o f48263a;

    /* renamed from: b, reason: collision with root package name */
    public final C4600e f48264b;

    public w(o oVar, C4600e c4600e) {
        this.f48263a = oVar;
        this.f48264b = c4600e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return AbstractC3340k.a(this.f48263a, wVar.f48263a) && AbstractC3340k.a(this.f48264b, wVar.f48264b);
    }

    public final int hashCode() {
        o oVar = this.f48263a;
        int iHashCode = (oVar == null ? 0 : oVar.hashCode()) * 961;
        C4600e c4600e = this.f48264b;
        return (iHashCode + (c4600e != null ? c4600e.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f48263a + ", slide=null, changeSize=" + this.f48264b + ", scale=null)";
    }
}
