package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hdf extends hcc {
    public final boolean a;
    public final afdr b;
    public final hju c;
    public final hju d;
    public final List e;
    public final hju f;
    public final cfr g;

    public hdf(boolean z, afdr afdrVar, hju hjuVar, hju hjuVar2, List list, hju hjuVar3, cfr cfrVar) {
        this.a = z;
        this.b = afdrVar;
        this.c = hjuVar;
        this.d = hjuVar2;
        this.e = list;
        this.f = hjuVar3;
        this.g = cfrVar;
    }

    @Override // defpackage.hcc
    public final void a(cfy cfyVar, hcd hcdVar, bux buxVar, int i) {
        int i2;
        cfyVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1583426331);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(this) : buxVarC.E(this)) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 131) != 130, i2 & 1)) {
            hdd.a(this, cfyVar, buxVarC, ((i2 << 3) & 112) | ((i2 >> 6) & 14));
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gtu((Object) this, (Object) cfyVar, (Object) hcdVar, i, 11, (byte[]) null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdf)) {
            return false;
        }
        hdf hdfVar = (hdf) obj;
        if (this.a != hdfVar.a) {
            return false;
        }
        return (this.b == null) == (hdfVar.b == null) && affa.f(this.c, hdfVar.c) && affa.f(this.d, hdfVar.d) && affa.f(this.e, hdfVar.e) && affa.f(this.f, hdfVar.f);
    }

    public final int hashCode() {
        hju hjuVar = this.c;
        int iF = (((((((a.f(this.a) * 31) + a.f(this.b != null)) * 31) + (hjuVar != null ? hjuVar.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        hju hjuVar2 = this.f;
        return (iF * 31) + (hjuVar2 != null ? hjuVar2.hashCode() : 0);
    }

    public final String toString() {
        return "RowLayoutUiModel(isEnabled=" + this.a + ", onClick=" + this.b + ", rowLeading=" + this.c + ", rowCenter=" + this.d + ", rowTrailingList=" + this.e + ", rowBelow=" + this.f + ", topRowVerticalAlignment=" + this.g + ")";
    }
}
