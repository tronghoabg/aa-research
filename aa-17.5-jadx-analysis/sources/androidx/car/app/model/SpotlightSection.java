package androidx.car.app.model;

import defpackage.rb;
import defpackage.vr;
import defpackage.vs;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public final class SpotlightSection extends Section<CondensedItem> {
    private final CarIcon mImage;

    private SpotlightSection(vr vrVar) {
        super(vrVar);
        CarIcon carIcon = vrVar.a;
        this.mImage = null;
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpotlightSection)) {
            return false;
        }
        SpotlightSection spotlightSection = (SpotlightSection) obj;
        return super.equals(spotlightSection) && Objects.equals(this.mImage, spotlightSection.mImage);
    }

    public CarIcon getImage() {
        CarIcon carIcon = this.mImage;
        carIcon.getClass();
        return carIcon;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.mImage);
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        return "SpotlightSection { image: " + this.mImage + ", " + super.toString() + " }";
    }

    private SpotlightSection() {
        this.mImage = null;
    }

    /* synthetic */ SpotlightSection(vr vrVar, vs vsVar) {
        this(vrVar);
    }
}
