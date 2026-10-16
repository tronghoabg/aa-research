package j$.nio.file;

import java.nio.file.OpenOption;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements OpenOption {
    public final /* synthetic */ v a;

    public /* synthetic */ u(v vVar) {
        this.a = vVar;
    }

    public static /* synthetic */ OpenOption a(v vVar) {
        if (vVar != null) {
            return vVar instanceof t ? ((t) vVar).a : vVar instanceof LinkOption ? a.c((LinkOption) vVar) : vVar instanceof g0 ? a.e((g0) vVar) : new u(vVar);
        }
        return null;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        v vVar = this.a;
        if (obj instanceof u) {
            obj = ((u) obj).a;
        }
        return vVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
