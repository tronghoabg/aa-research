package androidx.car.app.model;

import defpackage.rb;
import defpackage.to;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public final class ChipSection extends Section<Chip> {
    private final ChipStyle mStyle;

    ChipSection(to toVar) {
        super(toVar);
        ChipStyle chipStyle = toVar.a;
        this.mStyle = null;
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChipSection)) {
            return false;
        }
        ChipSection chipSection = (ChipSection) obj;
        return super.equals(chipSection) && Objects.equals(this.mStyle, chipSection.mStyle);
    }

    public ChipStyle getStyle() {
        return this.mStyle;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.mStyle);
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        return "ChipSection{items=" + getItemsDelegate() + ", title=" + getTitle() + ", style=" + this.mStyle + "}";
    }

    private ChipSection() {
        this.mStyle = null;
    }
}
