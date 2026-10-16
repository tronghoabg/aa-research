package defpackage;

/* loaded from: classes3.dex */
public final class trz {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/api/v3/label/LabelRestriction");
    public static final xxj b = new ptu(5);
    public static final xxj c = new ptu(6);
    public static final xxj d = new ptu(7);
    public final xxj e;
    public final abjm f;

    public trz(xxj xxjVar, abjm abjmVar) {
        this.e = xxjVar;
        this.f = abjmVar;
    }

    public final boolean equals(Object obj) {
        abjm abjmVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof trz) {
            trz trzVar = (trz) obj;
            if (this.e.equals(trzVar.e) && ((abjmVar = this.f) != null ? abjmVar.equals(trzVar.f) : trzVar.f == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.e.hashCode() ^ 1000003;
        abjm abjmVar = this.f;
        return (abjmVar == null ? 0 : abjmVar.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        abjm abjmVar = this.f;
        return "{" + this.e.toString() + ", " + String.valueOf(abjmVar) + "}";
    }

    public trz() {
        throw null;
    }
}
