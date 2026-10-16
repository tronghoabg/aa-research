package defpackage;

import androidx.car.app.model.CarText;
import java.util.List;

/* loaded from: classes2.dex */
public final class fzg implements gmo {
    public final CarText a;
    public final CarText b;
    public final fyj c;
    public final gag d;
    public final List e;
    public final List f;

    public fzg(CarText carText, CarText carText2, fyj fyjVar, gag gagVar, List list, List list2) {
        this.a = carText;
        this.b = carText2;
        this.c = fyjVar;
        this.d = gagVar;
        this.e = list;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzg)) {
            return false;
        }
        fzg fzgVar = (fzg) obj;
        return affa.f(this.a, fzgVar.a) && affa.f(this.b, fzgVar.b) && affa.f(this.c, fzgVar.c) && affa.f(this.d, fzgVar.d) && affa.f(this.e, fzgVar.e) && affa.f(this.f, fzgVar.f);
    }

    public final int hashCode() {
        CarText carText = this.a;
        int iHashCode = carText == null ? 0 : carText.hashCode();
        CarText carText2 = this.b;
        int iHashCode2 = carText2 == null ? 0 : carText2.hashCode();
        int i = iHashCode * 31;
        fyj fyjVar = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (fyjVar == null ? 0 : fyjVar.hashCode())) * 31;
        gag gagVar = this.d;
        return ((((iHashCode3 + (gagVar != null ? gagVar.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "HeaderInternal(title=" + this.a + ", subtitle=" + this.b + ", background=" + this.c + ", startImage=" + this.d + ", startActions=" + this.e + ", endActions=" + this.f + ")";
    }
}
