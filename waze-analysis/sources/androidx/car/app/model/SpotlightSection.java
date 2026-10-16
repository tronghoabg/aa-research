package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.Section;
import j$.util.Objects;
import java.util.List;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(9)
/* loaded from: classes2.dex */
public final class SpotlightSection extends Section<CondensedItem> {
    private final CarIcon mImage;

    private SpotlightSection(Builder builder) {
        super(builder);
        this.mImage = builder.mImage;
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
        return (CarIcon) Objects.requireNonNull(this.mImage);
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.mImage);
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        return "SpotlightSection { image: " + this.mImage + ", " + super.toString() + " }";
    }

    /* compiled from: WazeSource */
    public final class Builder extends Section.BaseBuilder<CondensedItem, Builder> {
        CarIcon mImage;

        public Builder(CarIcon carIcon) {
            this.mImage = (CarIcon) Objects.requireNonNull(carIcon);
        }

        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder addItem(Item item) {
            super.addItem(item);
            return this;
        }

        public SpotlightSection build() {
            if (this.mItems.isEmpty()) {
                throw new IllegalStateException("A spotlight section must contain at least 1 item");
            }
            return new SpotlightSection(this);
        }

        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder clearItems() {
            super.clearItems();
            return this;
        }

        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder setItems(List list) {
            super.setItems(list);
            return this;
        }

        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder setNoItemsMessage(CarText carText) {
            super.setNoItemsMessage(carText);
            return this;
        }

        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder setOnItemVisibilityChangedDelegate(OnItemVisibilityChangedDelegate onItemVisibilityChangedDelegate) {
            super.setOnItemVisibilityChangedDelegate(onItemVisibilityChangedDelegate);
            return this;
        }

        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder setOnItemVisibilityChangedListener(ItemList.OnItemVisibilityChangedListener onItemVisibilityChangedListener) {
            super.setOnItemVisibilityChangedListener(onItemVisibilityChangedListener);
            return this;
        }

        @Override // androidx.car.app.model.Section.BaseBuilder
        @RequiresCarApi(9)
        public /* bridge */ /* synthetic */ Builder setSectionHeader(SectionHeader sectionHeader) {
            super.setSectionHeader(sectionHeader);
            return this;
        }

        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder setTitle(CarText carText) {
            super.setTitle(carText);
            return this;
        }

        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder setNoItemsMessage(CharSequence charSequence) {
            super.setNoItemsMessage(charSequence);
            return this;
        }

        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder setTitle(CharSequence charSequence) {
            super.setTitle(charSequence);
            return this;
        }
    }

    private SpotlightSection() {
        this.mImage = null;
    }
}
