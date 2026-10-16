package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.Section;
import defpackage.ad;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public final class GridSection extends Section<GridItem> {
    public static final int ITEM_IMAGE_SHAPE_CIRCLE = 2;
    public static final int ITEM_IMAGE_SHAPE_UNSET = 1;
    public static final int ITEM_SIZE_LARGE = 3;
    public static final int ITEM_SIZE_MEDIUM = 2;
    public static final int ITEM_SIZE_SMALL = 1;
    private final int mItemImageShape;
    private final int mItemSize;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder extends Section.BaseBuilder<GridItem, Builder> {
        private int mItemSize = 1;
        private int mItemImageShape = 1;

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.car.app.model.GridSection$Builder, java.lang.Object] */
        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder addItem(Item item) {
            return super.addItem(item);
        }

        public GridSection build() {
            return new GridSection(this);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.car.app.model.GridSection$Builder, java.lang.Object] */
        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder clearItems() {
            return super.clearItems();
        }

        public Builder setItemImageShape(int i) {
            this.mItemImageShape = i;
            return this;
        }

        public Builder setItemSize(int i) {
            this.mItemSize = i;
            return this;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.car.app.model.GridSection$Builder, java.lang.Object] */
        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder setItems(List list) {
            return super.setItems(list);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.car.app.model.GridSection$Builder, java.lang.Object] */
        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder setNoItemsMessage(CarText carText) {
            return super.setNoItemsMessage(carText);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.car.app.model.GridSection$Builder, java.lang.Object] */
        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder setTitle(CarText carText) {
            return super.setTitle(carText);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.car.app.model.GridSection$Builder, java.lang.Object] */
        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder setNoItemsMessage(CharSequence charSequence) {
            return super.setNoItemsMessage(charSequence);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.car.app.model.GridSection$Builder, java.lang.Object] */
        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder setTitle(CharSequence charSequence) {
            return super.setTitle(charSequence);
        }
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ItemImageShape {
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ItemSize {
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
        StringBuilder sb = new StringBuilder("GridSection { itemSize: ");
        sb.append(this.mItemSize);
        sb.append(", itemImageShape: ");
        sb.append(this.mItemImageShape);
        sb.append(", ");
        return ad.e(sb, super.toString(), " }");
    }

    private GridSection() {
        this.mItemSize = 1;
        this.mItemImageShape = 1;
    }

    private GridSection(Builder builder) {
        super(builder);
        this.mItemSize = builder.mItemSize;
        this.mItemImageShape = builder.mItemImageShape;
    }
}
