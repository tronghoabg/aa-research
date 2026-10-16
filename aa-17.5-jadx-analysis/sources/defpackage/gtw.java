package defpackage;

/* loaded from: classes2.dex */
public final class gtw extends hjt {
    public static final int a = gud.a | 8;
    public final gva b;
    public final gua c;
    public final gud d;
    public final goz e;
    public final hga f;
    public final hge g;
    public final hgc h;
    public final boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gtw(gva gvaVar, gua guaVar, gud gudVar, goz gozVar, hga hgaVar, hgc hgcVar, boolean z, int i) {
        super(true, false);
        hgaVar = (i & 16) != 0 ? new hga(null) : hgaVar;
        hge hgeVar = (i & 32) != 0 ? new hge(null, 15) : null;
        hgcVar = (i & 64) != 0 ? hgc.b : hgcVar;
        int i2 = i & 4;
        int i3 = i & 2;
        int i4 = i & 1;
        gozVar = (i & 8) != 0 ? null : gozVar;
        gudVar = i2 != 0 ? null : gudVar;
        guaVar = i3 != 0 ? null : guaVar;
        gvaVar = 1 == i4 ? null : gvaVar;
        boolean z2 = (i & 128) == 0;
        hgaVar.getClass();
        hgeVar.getClass();
        hgcVar.getClass();
        this.b = gvaVar;
        this.c = guaVar;
        this.d = gudVar;
        this.e = gozVar;
        this.f = hgaVar;
        this.g = hgeVar;
        this.h = hgcVar;
        this.i = z & z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtw)) {
            return false;
        }
        gtw gtwVar = (gtw) obj;
        return affa.f(this.b, gtwVar.b) && affa.f(this.c, gtwVar.c) && affa.f(this.d, gtwVar.d) && affa.f(this.e, gtwVar.e) && affa.f(this.f, gtwVar.f) && affa.f(this.g, gtwVar.g) && this.h == gtwVar.h && this.i == gtwVar.i;
    }

    public final int hashCode() {
        gva gvaVar = this.b;
        int iHashCode = gvaVar == null ? 0 : gvaVar.hashCode();
        gua guaVar = this.c;
        int iHashCode2 = guaVar == null ? 0 : guaVar.hashCode();
        int i = iHashCode * 31;
        gud gudVar = this.d;
        int iHashCode3 = (((i + iHashCode2) * 31) + (gudVar == null ? 0 : gudVar.hashCode())) * 31;
        goz gozVar = this.e;
        return ((((((((iHashCode3 + (gozVar != null ? gozVar.hashCode() : 0)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + a.f(this.i);
    }

    public final String toString() {
        return "NavigationLayoutUiModel(turnCard=" + this.b + ", alertCard=" + this.c + ", etaCard=" + this.d + ", mapActions=" + this.e + ", surfaceCallbacks=" + this.f + ", surfaceAreaParams=" + this.g + ", panModeState=" + this.h + ", isMinimized=" + this.i + ")";
    }

    public gtw() {
        this(null, null, null, null, null, null, false, 255);
    }
}
