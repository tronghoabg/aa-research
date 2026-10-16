package defpackage;

import com.google.android.apps.auto.components.graphics.icon.GhIcon;

/* loaded from: classes2.dex */
public final class ndy {
    public final GhIcon a;
    public final boolean b;
    public final afdr c;
    public final ndx d;

    public ndy(GhIcon ghIcon, ndx ndxVar, boolean z, afdr afdrVar) {
        this.a = ghIcon;
        this.d = ndxVar;
        this.b = z;
        this.c = afdrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndy)) {
            return false;
        }
        ndy ndyVar = (ndy) obj;
        return affa.f(this.a, ndyVar.a) && affa.f(this.d, ndyVar.d) && this.b == ndyVar.b && affa.f(this.c, ndyVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ndx ndxVar = this.d;
        return ((((iHashCode + (ndxVar == null ? 0 : ndxVar.hashCode())) * 31) + a.f(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CallAction(icon=" + this.a + ", color=" + this.d + ", enabled=" + this.b + ", clickAction=" + this.c + ")";
    }
}
