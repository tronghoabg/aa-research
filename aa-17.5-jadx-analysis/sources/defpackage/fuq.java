package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class fuq extends hjt {
    public static final int a = fzv.a | 8;
    public final hju b;
    public final gfa c;
    public final gfa d;
    public final fzv e;
    public final List f;
    public final hga g;
    public final boolean h;

    public fuq(hju hjuVar, gfa gfaVar, gfa gfaVar2, fzv fzvVar, List list, hga hgaVar, boolean z) {
        super(z, false);
        this.b = hjuVar;
        this.c = gfaVar;
        this.d = gfaVar2;
        this.e = fzvVar;
        this.f = list;
        this.g = hgaVar;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuq)) {
            return false;
        }
        fuq fuqVar = (fuq) obj;
        return affa.f(this.b, fuqVar.b) && affa.f(this.c, fuqVar.c) && affa.f(this.d, fuqVar.d) && affa.f(this.e, fuqVar.e) && affa.f(this.f, fuqVar.f) && affa.f(this.g, fuqVar.g) && this.h == fuqVar.h;
    }

    public final int hashCode() {
        hju hjuVar = this.b;
        int iHashCode = ((((hjuVar == null ? 0 : hjuVar.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        fzv fzvVar = this.e;
        return (((((((iHashCode * 31) + (fzvVar != null ? fzvVar.hashCode() : 0)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + a.f(this.h);
    }

    public final String toString() {
        return "ActionsWidgetUiModel(headerAction=" + this.b + ", titlePrimary=" + this.c + ", titleSecondary=" + this.d + ", titleIcon=" + this.e + ", actions=" + this.f + ", surfaceCallbacks=" + this.g + ", surfaceCallbackRegistered=" + this.h + ")";
    }
}
