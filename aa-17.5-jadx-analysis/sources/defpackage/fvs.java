package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class fvs implements hju {
    public final List a;
    public final float b;
    public final int c;

    public /* synthetic */ fvs(List list) {
        float f = gjk.e.k;
        this.a = list;
        this.c = 2;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvs)) {
            return false;
        }
        fvs fvsVar = (fvs) obj;
        if (!affa.f(this.a, fvsVar.a)) {
            return false;
        }
        int i = fvsVar.c;
        return dlj.c(this.b, fvsVar.b);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 2) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "FloatingActionsUiModel(actions=" + this.a + ", orientation=" + ((Object) gvq.e(2)) + ", actionSpacing=" + dlj.b(this.b) + ")";
    }
}
