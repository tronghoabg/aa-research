package androidx.car.app.model;

import defpackage.rb;
import defpackage.tg;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public final class BannerSection extends Section<Banner> {
    BannerSection() {
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof BannerSection) {
            return super.equals((BannerSection) obj);
        }
        return false;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()));
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        return "BannerSection { " + super.toString() + " }";
    }

    BannerSection(tg tgVar) {
        super(tgVar);
    }
}
