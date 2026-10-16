package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class gzi implements gmw {
    public final boolean a;
    public final fvu b;
    public final har c;
    public final String d;
    public final String e;
    public final boolean f;
    public final afec g;
    public final afec h;
    public final List i;

    public gzi(boolean z, fvu fvuVar, har harVar, String str, String str2, boolean z2, afec afecVar, afec afecVar2, List list) {
        this.a = z;
        this.b = fvuVar;
        this.c = harVar;
        this.d = str;
        this.e = str2;
        this.f = z2;
        this.g = afecVar;
        this.h = afecVar2;
        this.i = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzi)) {
            return false;
        }
        gzi gziVar = (gzi) obj;
        return this.a == gziVar.a && affa.f(this.b, gziVar.b) && affa.f(this.c, gziVar.c) && affa.f(this.d, gziVar.d) && affa.f(this.e, gziVar.e) && this.f == gziVar.f && affa.f(this.g, gziVar.g) && affa.f(this.h, gziVar.h) && affa.f(this.i, gziVar.i);
    }

    public final int hashCode() {
        fvu fvuVar = this.b;
        int iHashCode = fvuVar == null ? 0 : fvuVar.hashCode();
        boolean z = this.a;
        har harVar = this.c;
        int iHashCode2 = harVar == null ? 0 : harVar.hashCode();
        int iF = (a.f(z) * 31) + iHashCode;
        String str = this.d;
        int iHashCode3 = ((((iF * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + a.f(this.f)) * 31;
        afec afecVar = this.g;
        int iHashCode5 = (iHashCode4 + (afecVar == null ? 0 : afecVar.hashCode())) * 31;
        afec afecVar2 = this.h;
        return ((iHashCode5 + (afecVar2 != null ? afecVar2.hashCode() : 0)) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "SearchTemplateInternal(isLoading=" + this.a + ", headerAction=" + this.b + ", rowSection=" + this.c + ", initialSearchText=" + this.d + ", searchHint=" + this.e + ", showKeyboardByDefault=" + this.f + ", onSearchTextChanged=" + this.g + ", onSearchSubmitted=" + this.h + ", actions=" + this.i + ")";
    }

    public gzi() {
        this(false, null, null, null, null, true, null, null, afbe.a);
    }
}
