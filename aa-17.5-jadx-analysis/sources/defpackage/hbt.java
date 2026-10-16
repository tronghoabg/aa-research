package defpackage;

/* loaded from: classes2.dex */
public final class hbt extends hcc {
    public static final int a;
    public final afdr b;
    public final fzv c;
    public final boolean d;
    public final boolean e;
    public final gfa f;
    public final gfa g;
    public final int h;
    public final boolean i;
    public final gcb j;

    static {
        int i = gcb.c;
        a = fzv.a | 8;
    }

    public /* synthetic */ hbt(afdr afdrVar, fzv fzvVar, boolean z, boolean z2, gfa gfaVar, gfa gfaVar2, int i, boolean z3, gcb gcbVar, int i2) {
        this.b = 1 == (i2 & 1) ? null : afdrVar;
        this.c = fzvVar;
        this.d = ((i2 & 4) == 0) & z;
        this.e = ((i2 & 8) == 0) & z2;
        this.f = (i2 & 16) != 0 ? null : gfaVar;
        this.g = (i2 & 32) != 0 ? null : gfaVar2;
        this.h = (i2 & 64) != 0 ? 3 : i;
        this.i = ((i2 & 128) == 0) & z3;
        this.j = (i2 & 256) != 0 ? null : gcbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0  */
    @Override // defpackage.hcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.cfy r17, defpackage.hcd r18, defpackage.bux r19, int r20) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbt.a(cfy, hcd, bux, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbt)) {
            return false;
        }
        hbt hbtVar = (hbt) obj;
        return affa.f(this.b, hbtVar.b) && affa.f(this.c, hbtVar.c) && this.d == hbtVar.d && this.e == hbtVar.e && affa.f(this.f, hbtVar.f) && affa.f(this.g, hbtVar.g) && a.Y(this.h, hbtVar.h) && this.i == hbtVar.i && affa.f(this.j, hbtVar.j);
    }

    public final int hashCode() {
        afdr afdrVar = this.b;
        int iHashCode = afdrVar == null ? 0 : afdrVar.hashCode();
        fzv fzvVar = this.c;
        int iHashCode2 = fzvVar == null ? 0 : fzvVar.hashCode();
        int i = iHashCode * 31;
        boolean z = this.d;
        boolean z2 = this.e;
        gfa gfaVar = this.f;
        int iF = (((((((i + iHashCode2) * 31) + a.f(z)) * 31) + a.f(z2)) * 31) + (gfaVar == null ? 0 : gfaVar.hashCode())) * 31;
        gfa gfaVar2 = this.g;
        int iHashCode3 = (((((iF + (gfaVar2 == null ? 0 : gfaVar2.hashCode())) * 31) + this.h) * 31) + a.f(this.i)) * 31;
        gcb gcbVar = this.j;
        return iHashCode3 + (gcbVar != null ? gcbVar.hashCode() : 0);
    }

    public final String toString() {
        return "GridItemUiModel(onClick=" + this.b + ", image=" + this.c + ", applyImagePassiveTint=" + this.d + ", shouldCropImageCircle=" + this.e + ", title=" + this.f + ", subtitle=" + this.g + ", textAlignment=" + dkt.a(this.h) + ", forceHighContrastText=" + this.i + ", progressIndicator=" + this.j + ")";
    }
}
