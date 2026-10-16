package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class Metadata {
    public static final androidx.car.app.model.Metadata EMPTY_METADATA = new androidx.car.app.model.Metadata(new defpackage.us());
    private final androidx.car.app.model.Place mPlace;

    public Metadata(defpackage.us usVar) {
        this.mPlace = (androidx.car.app.model.Place) usVar.a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.Metadata) {
            return j$.util.Objects.equals(this.mPlace, ((androidx.car.app.model.Metadata) obj).mPlace);
        }
        return false;
    }

    public androidx.car.app.model.Place getPlace() {
        return this.mPlace;
    }

    public int hashCode() {
        return j$.util.Objects.hashCode(this.mPlace);
    }

    private Metadata() {
        this.mPlace = null;
    }
}
