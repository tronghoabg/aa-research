package defpackage;

/* loaded from: classes2.dex */
public final class goz extends hjt {
    public final hju a;
    public final boolean b;
    public final hju c;
    public final boolean d;
    public final hju e;

    public goz(hju hjuVar, boolean z, hju hjuVar2, boolean z2, hju hjuVar3) {
        super(true, false);
        this.a = hjuVar;
        this.b = z;
        this.c = hjuVar2;
        this.d = z2;
        this.e = hjuVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof goz)) {
            return false;
        }
        goz gozVar = (goz) obj;
        return affa.f(this.a, gozVar.a) && this.b == gozVar.b && affa.f(this.c, gozVar.c) && this.d == gozVar.d && affa.f(this.e, gozVar.e);
    }

    public final int hashCode() {
        hju hjuVar = this.a;
        int iHashCode = hjuVar == null ? 0 : hjuVar.hashCode();
        boolean z = this.b;
        hju hjuVar2 = this.c;
        int iHashCode2 = hjuVar2 == null ? 0 : hjuVar2.hashCode();
        int iF = a.f(z);
        int i = iHashCode * 31;
        boolean z2 = this.d;
        hju hjuVar3 = this.e;
        return ((((((i + iF) * 31) + iHashCode2) * 31) + a.f(z2)) * 31) + (hjuVar3 != null ? hjuVar3.hashCode() : 0);
    }

    public final String toString() {
        return "MapActionsUiModel(topActions=" + this.a + ", reserveSpaceForTopActionsOnHide=" + this.b + ", bottomActions=" + this.c + ", reserveSpaceForBottomActionsOnHide=" + this.d + ", primaryAction=" + this.e + ")";
    }

    public goz() {
        this(null, false, null, false, null);
    }
}
