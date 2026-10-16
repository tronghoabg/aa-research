package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class gdf implements gmw {
    public final fzg a;
    public final String b;
    public final fvu c;
    public final afec d;
    public final afec e;
    public final afec f;
    public final afec g;
    public final Map h;

    public gdf(fzg fzgVar, String str, fvu fvuVar, afec afecVar, afec afecVar2, afec afecVar3, afec afecVar4, Map map) {
        this.a = fzgVar;
        this.b = str;
        this.c = fvuVar;
        this.d = afecVar;
        this.e = afecVar2;
        this.f = afecVar3;
        this.g = afecVar4;
        this.h = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdf)) {
            return false;
        }
        gdf gdfVar = (gdf) obj;
        return affa.f(this.a, gdfVar.a) && affa.f(this.b, gdfVar.b) && affa.f(this.c, gdfVar.c) && affa.f(this.d, gdfVar.d) && affa.f(this.e, gdfVar.e) && affa.f(this.f, gdfVar.f) && affa.f(this.g, gdfVar.g) && affa.f(this.h, gdfVar.h);
    }

    public final int hashCode() {
        fzg fzgVar = this.a;
        int iHashCode = fzgVar == null ? 0 : fzgVar.hashCode();
        String str = this.b;
        int iHashCode2 = (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
        afec afecVar = this.d;
        int iHashCode3 = ((iHashCode2 * 31) + (afecVar == null ? 0 : afecVar.hashCode())) * 31;
        afec afecVar2 = this.e;
        int iHashCode4 = (iHashCode3 + (afecVar2 == null ? 0 : afecVar2.hashCode())) * 31;
        afec afecVar3 = this.f;
        return ((((iHashCode4 + (afecVar3 != null ? afecVar3.hashCode() : 0)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "TelephoneKeypadTemplateInternal(header=" + this.a + ", initialPhoneNumber=" + this.b + ", primaryAction=" + this.c + ", onKeypadKeyLongPress=" + this.d + ", onKeypadKeyDown=" + this.e + ", onKeypadKeyUp=" + this.f + ", onDialedNumberChanged=" + this.g + ", keypadKeySecondaryText=" + this.h + ")";
    }
}
