package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fzn implements defpackage.gmv {
    public final androidx.car.app.model.CarText a;
    public final androidx.car.app.model.CarText b;
    public final defpackage.fys c;
    public final defpackage.gam d;
    public final java.util.List e;
    public final java.util.List f;

    public fzn(androidx.car.app.model.CarText carText, androidx.car.app.model.CarText carText2, defpackage.fys fysVar, defpackage.gam gamVar, java.util.List list, java.util.List list2) {
        this.a = carText;
        this.b = carText2;
        this.c = fysVar;
        this.d = gamVar;
        this.e = list;
        this.f = list2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.fzn)) {
            return false;
        }
        defpackage.fzn fznVar = (defpackage.fzn) obj;
        return defpackage.afga.f(this.a, fznVar.a) && defpackage.afga.f(this.b, fznVar.b) && defpackage.afga.f(this.c, fznVar.c) && defpackage.afga.f(this.d, fznVar.d) && defpackage.afga.f(this.e, fznVar.e) && defpackage.afga.f(this.f, fznVar.f);
    }

    public final int hashCode() {
        androidx.car.app.model.CarText carText = this.a;
        int iHashCode = carText == null ? 0 : carText.hashCode();
        androidx.car.app.model.CarText carText2 = this.b;
        int iHashCode2 = carText2 == null ? 0 : carText2.hashCode();
        int i = iHashCode * 31;
        defpackage.fys fysVar = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (fysVar == null ? 0 : fysVar.hashCode())) * 31;
        defpackage.gam gamVar = this.d;
        return ((((iHashCode3 + (gamVar != null ? gamVar.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final java.lang.String toString() {
        return "HeaderInternal(title=" + this.a + ", subtitle=" + this.b + ", background=" + this.c + ", startImage=" + this.d + ", startActions=" + this.e + ", endActions=" + this.f + ")";
    }
}
