package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.Section;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(8)
/* loaded from: classes2.dex */
public final class GridSection extends Section<GridItem> {
    public static final int ITEM_IMAGE_SHAPE_CIRCLE = 2;
    public static final int ITEM_IMAGE_SHAPE_UNSET = 1;
    public static final int ITEM_SIZE_EXTRA_LARGE = 4;
    public static final int ITEM_SIZE_LARGE = 3;
    public static final int ITEM_SIZE_MEDIUM = 2;
    public static final int ITEM_SIZE_SMALL = 1;
    private final int mItemImageShape;
    private final int mItemSize;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ItemImageShape {
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ItemSize {
    }

    private GridSection(Builder builder) {
        super(builder);
        this.mItemSize = builder.mItemSize;
        this.mItemImageShape = builder.mItemImageShape;
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GridSection)) {
            return false;
        }
        GridSection gridSection = (GridSection) obj;
        return super.equals(gridSection) && this.mItemImageShape == gridSection.mItemImageShape && this.mItemSize == gridSection.mItemSize;
    }

    public int getItemImageShape() {
        return this.mItemImageShape;
    }

    public int getItemSize() {
        return this.mItemSize;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Integer.valueOf(this.mItemImageShape), Integer.valueOf(this.mItemSize));
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        return "GridSection { itemSize: " + this.mItemSize + ", itemImageShape: " + this.mItemImageShape + ", " + super.toString() + " }";
    }

    /* compiled from: WazeSource */
    public final class Builder extends Section.BaseBuilder<GridItem, Builder> {
        private int mItemSize = 1;
        private int mItemImageShape = 1;

        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder addItem(Item item) {
            super.addItem(item);
            return this;
        }

        public GridSection build() {
            return new GridSection(this);
        }

        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder clearItems() {
            super.clearItems();
            return this;
        }

        public Builder setItemImageShape(int i2) {
            this.mItemImageShape = i2;
            return this;
        }

        public Builder setItemSize(int i2) {
            this.mItemSize = i2;
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

    private GridSection() {
        this.mItemSize = 1;
        this.mItemImageShape = 1;
    }
}
