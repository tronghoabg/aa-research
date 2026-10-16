package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class fxz implements hju {
    public final List a;
    public final boolean b;
    public final cfm c;
    public final int d;

    public /* synthetic */ fxz(List list, boolean z, int i, cfm cfmVar, int i2) {
        this((i2 & 1) != 0 ? afbe.a : list, z | (!((i2 & 2) == 0)), (i2 & 4) != 0 ? 2 : i, (i2 & 8) != 0 ? cfl.k : cfmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxz)) {
            return false;
        }
        fxz fxzVar = (fxz) obj;
        return affa.f(this.a, fxzVar.a) && this.b == fxzVar.b && this.d == fxzVar.d && affa.f(this.c, fxzVar.c);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + a.f(this.b)) * 31) + this.d) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "RowActionsUiModel(actionDelegates=" + this.a + ", collapseAction=" + this.b + ", stretchButtons=" + ((Object) fxp.b(this.d)) + ", horizontalAlignment=" + this.c + ")";
    }

    public fxz(List list, boolean z, int i, cfm cfmVar) {
        list.getClass();
        if (i == 0) {
            throw null;
        }
        cfmVar.getClass();
        this.a = list;
        this.b = z;
        this.d = i;
        this.c = cfmVar;
    }

    public fxz() {
        this(null, false, 0, null, 15);
    }
}
