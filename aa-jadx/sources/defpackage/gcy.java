package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gcy implements defpackage.gmv {
    public final java.util.List a;
    public final java.util.List b;
    public final transient androidx.car.app.model.CarText c;

    public gcy(java.util.List list, java.util.List list2, androidx.car.app.model.CarText carText) {
        this.a = list;
        this.b = list2;
        this.c = carText;
    }

    public static final androidx.car.app.model.CarText a(defpackage.gcy gcyVar) {
        if (gcyVar == null) {
            return null;
        }
        java.lang.String str = (java.lang.String) defpackage.afga.aB(gcyVar.a);
        if (str == null) {
            str = "";
        }
        androidx.car.app.model.CarText carText = gcyVar.c;
        return carText == null ? new androidx.car.app.model.CarText.Builder(str).build() : carText;
    }

    public static final java.lang.CharSequence b(java.lang.String str, java.util.List list) {
        if (list.isEmpty()) {
            return str;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.gda gdaVar = (defpackage.gda) it.next();
            defpackage.gcz gczVar = gdaVar.c;
            spannableString.setSpan(gczVar.a, gdaVar.a, gdaVar.b, 33);
        }
        return spannableString;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.gcy)) {
            return false;
        }
        defpackage.gcy gcyVar = (defpackage.gcy) obj;
        return defpackage.afga.f(this.a, gcyVar.a) && defpackage.afga.f(this.b, gcyVar.b) && defpackage.afga.f(this.c, gcyVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        androidx.car.app.model.CarText carText = this.c;
        return (iHashCode * 31) + (carText == null ? 0 : carText.hashCode());
    }

    public final java.lang.String toString() {
        return "CarTextInternalModel(texts=" + this.a + ", spans=" + this.b + ", legacyOriginalText=" + this.c + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public gcy() {
        defpackage.afce afceVar = defpackage.afce.a;
        this(afceVar, afceVar, null);
    }
}
