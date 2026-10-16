package defpackage;

/* loaded from: classes2.dex */
public final class gvr implements hju, wb {
    public final hju a;
    public final hcl b;
    public final gbg c;
    public final hju d;

    public gvr(hju hjuVar, hcl hclVar, gbg gbgVar, hju hjuVar2) {
        this.a = hjuVar;
        this.b = hclVar;
        this.c = gbgVar;
        this.d = hjuVar2;
    }

    public final boolean a() {
        hju hjuVar = this.d;
        return hjuVar instanceof fxz ? !((fxz) hjuVar).a.isEmpty() : (hjuVar instanceof fxj) && !((fxj) hjuVar).a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvr)) {
            return false;
        }
        gvr gvrVar = (gvr) obj;
        return affa.f(this.a, gvrVar.a) && affa.f(this.b, gvrVar.b) && affa.f(this.c, gvrVar.c) && affa.f(this.d, gvrVar.d);
    }

    public final int hashCode() {
        hju hjuVar = this.a;
        int iHashCode = ((hjuVar == null ? 0 : hjuVar.hashCode()) * 31) + this.b.hashCode();
        gbg gbgVar = this.c;
        int iHashCode2 = ((iHashCode * 31) + (gbgVar == null ? 0 : gbgVar.hashCode())) * 31;
        hju hjuVar2 = this.d;
        return iHashCode2 + (hjuVar2 != null ? hjuVar2.hashCode() : 0);
    }

    public final String toString() {
        return "PaneTemplateLayoutUiModel(header=" + this.a + ", rowsSection=" + this.b + ", image=" + this.c + ", actions=" + this.d + ")";
    }
}
