package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class BannerSection extends androidx.car.app.model.Section<androidx.car.app.model.Banner> {
    BannerSection() {
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.BannerSection) {
            return super.equals((androidx.car.app.model.BannerSection) obj);
        }
        return false;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()));
    }

    @Override // androidx.car.app.model.Section
    public java.lang.String toString() {
        return "BannerSection { " + super.toString() + " }";
    }

    BannerSection(defpackage.tl tlVar) {
        super(tlVar);
    }
}
