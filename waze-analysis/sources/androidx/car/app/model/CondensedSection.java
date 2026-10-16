package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.Section;
import java.util.List;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(9)
/* loaded from: classes2.dex */
public final class CondensedSection extends Section<CondensedItem> {
    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CondensedSection) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        return "CondensedSection { " + super.toString() + " }";
    }

    /* compiled from: WazeSource */
    @RequiresCarApi(9)
    public final class Builder extends Section.BaseBuilder<CondensedItem, Builder> {
        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder addItem(Item item) {
            super.addItem(item);
            return this;
        }

        public CondensedSection build() {
            return new CondensedSection(this);
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

    private CondensedSection() {
    }

    private CondensedSection(Builder builder) {
        super(builder);
    }
}
