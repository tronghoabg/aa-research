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

    /* compiled from: WazeSource */
    public final class Builder extends Section.BaseBuilder<Banner, Builder> {
        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder addItem(Item item) {
            super.addItem(item);
            return this;
        }

        public BannerSection build() {
            if (this.mItems.size() == 1) {
                return new BannerSection(this);
            }
            throw new IllegalStateException("A BannerSection must contain exactly one Banner");
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

    BannerSection(Builder builder) {
        super(builder);
    }
}
