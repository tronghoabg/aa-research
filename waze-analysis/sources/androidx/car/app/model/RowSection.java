package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.Section;
import androidx.car.app.model.constraints.RowConstraints;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(8)
/* loaded from: classes2.dex */
public final class RowSection extends Section<Row> {
    private final int mInitialSelectedIndex;

    private RowSection(Builder builder) {
        super(builder);
        this.mInitialSelectedIndex = builder.mInitialSelectedIndex;
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RowSection)) {
            return false;
        }
        RowSection rowSection = (RowSection) obj;
        return super.equals(rowSection) && this.mInitialSelectedIndex == rowSection.mInitialSelectedIndex;
    }

    public int getInitialSelectedIndex() {
        return this.mInitialSelectedIndex;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Integer.valueOf(this.mInitialSelectedIndex));
    }

    public boolean isSelectionGroup() {
        return this.mInitialSelectedIndex >= 0;
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        return "RowSection { initialSelectedIndex: " + this.mInitialSelectedIndex + ", " + super.toString() + " }";
    }

    /* compiled from: WazeSource */
    public final class Builder extends Section.BaseBuilder<Row, Builder> {
        private int mInitialSelectedIndex = -1;

        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder addItem(Item item) {
            super.addItem(item);
            return this;
        }

        public RowSection build() {
            if (this.mInitialSelectedIndex >= 0) {
                if (!this.mItems.isEmpty() && this.mInitialSelectedIndex >= this.mItems.size()) {
                    throw new IllegalArgumentException("The set initial selected index (" + this.mInitialSelectedIndex + ") cannot be larger than the size of the list (" + this.mItems.size() + ")");
                }
                Iterator it = this.mItems.iterator();
                while (it.hasNext()) {
                    if (((Row) it.next()).getToggle() != null) {
                        throw new IllegalArgumentException("A row that has a toggle set cannot be added to a RowSection that has an onSelectedListener.");
                    }
                }
            }
            Iterator it2 = this.mItems.iterator();
            while (it2.hasNext()) {
                RowConstraints.ROW_CONSTRAINTS_FULL_LIST.validateOrThrow((Row) it2.next());
            }
            return new RowSection(this);
        }

        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder clearItems() {
            super.clearItems();
            return this;
        }

        public Builder clearSelectionGroup() {
            this.mInitialSelectedIndex = -1;
            return this;
        }

        public Builder setAsSelectionGroup(int i2) {
            this.mInitialSelectedIndex = i2;
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

    private RowSection() {
        this.mInitialSelectedIndex = -1;
    }
}
