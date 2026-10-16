package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class fzh implements fzj {
    public final gcq a;
    public final gcq b;
    public final gbg c;
    public final List d;
    public final List e;
    public final fwl f;

    public fzh(gcq gcqVar, gcq gcqVar2, fwl fwlVar, gbg gbgVar, List list, List list2) {
        this.a = gcqVar;
        this.b = gcqVar2;
        this.f = fwlVar;
        this.c = gbgVar;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzh)) {
            return false;
        }
        fzh fzhVar = (fzh) obj;
        return affa.f(this.a, fzhVar.a) && affa.f(this.b, fzhVar.b) && affa.f(this.f, fzhVar.f) && affa.f(this.c, fzhVar.c) && affa.f(this.d, fzhVar.d) && affa.f(this.e, fzhVar.e);
    }

    public final int hashCode() {
        gcq gcqVar = this.a;
        int iHashCode = gcqVar == null ? 0 : gcqVar.hashCode();
        gcq gcqVar2 = this.b;
        int iHashCode2 = gcqVar2 == null ? 0 : gcqVar2.hashCode();
        int i = iHashCode * 31;
        fwl fwlVar = this.f;
        int iHashCode3 = (((i + iHashCode2) * 31) + (fwlVar == null ? 0 : fwlVar.hashCode())) * 31;
        gbg gbgVar = this.c;
        return ((((iHashCode3 + (gbgVar != null ? gbgVar.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "HeaderUiModel(title=" + this.a + ", subtitle=" + this.b + ", background=" + this.f + ", startImage=" + this.c + ", startContents=" + this.d + ", endContents=" + this.e + ")";
    }
}
