package defpackage;

import androidx.car.app.model.CarText;
import java.util.List;

/* loaded from: classes2.dex */
public final class gcy implements gmw {
    public final fzg a;
    public final gac b;
    public final CarText c;
    public final List d;
    public final List e;
    public final boolean f;

    public gcy(fzg fzgVar, gac gacVar, CarText carText, List list, List list2, boolean z) {
        this.a = fzgVar;
        this.b = gacVar;
        this.c = carText;
        this.d = list;
        this.e = list2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcy)) {
            return false;
        }
        gcy gcyVar = (gcy) obj;
        return affa.f(this.a, gcyVar.a) && affa.f(this.b, gcyVar.b) && affa.f(this.c, gcyVar.c) && affa.f(this.d, gcyVar.d) && affa.f(this.e, gcyVar.e) && this.f == gcyVar.f;
    }

    public final int hashCode() {
        fzg fzgVar = this.a;
        int iHashCode = fzgVar == null ? 0 : fzgVar.hashCode();
        gac gacVar = this.b;
        int iHashCode2 = gacVar == null ? 0 : gacVar.hashCode();
        int i = iHashCode * 31;
        CarText carText = this.c;
        return ((((((((i + iHashCode2) * 31) + (carText != null ? carText.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + a.f(this.f);
    }

    public final String toString() {
        return "InCallTemplateInternal(header=" + this.a + ", image=" + this.b + ", title=" + this.c + ", texts=" + this.d + ", actions=" + this.e + ", isLoading=" + this.f + ")";
    }
}
