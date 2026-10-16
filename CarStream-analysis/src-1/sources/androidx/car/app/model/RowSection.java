package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.Section;
import androidx.car.app.model.constraints.RowConstraints;
import defpackage.ad;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public final class RowSection extends Section<Row> {
    private final int mInitialSelectedIndex;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder extends Section.BaseBuilder<Row, Builder> {
        private int mInitialSelectedIndex = -1;

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.car.app.model.RowSection$Builder, java.lang.Object] */
        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder addItem(Item item) {
            return super.addItem(item);
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

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.car.app.model.RowSection$Builder, java.lang.Object] */
        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder clearItems() {
            return super.clearItems();
        }

        public Builder clearSelectionGroup() {
            this.mInitialSelectedIndex = -1;
            return this;
        }

        public Builder setAsSelectionGroup(int i) {
            this.mInitialSelectedIndex = i;
            return this;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.car.app.model.RowSection$Builder, java.lang.Object] */
        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder setItems(List list) {
            return super.setItems(list);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.car.app.model.RowSection$Builder, java.lang.Object] */
        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder setNoItemsMessage(CarText carText) {
            return super.setNoItemsMessage(carText);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.car.app.model.RowSection$Builder, java.lang.Object] */
        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder setTitle(CarText carText) {
            return super.setTitle(carText);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.car.app.model.RowSection$Builder, java.lang.Object] */
        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder setNoItemsMessage(CharSequence charSequence) {
            return super.setNoItemsMessage(charSequence);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.car.app.model.RowSection$Builder, java.lang.Object] */
        @Override // androidx.car.app.model.Section.BaseBuilder
        public /* bridge */ /* synthetic */ Builder setTitle(CharSequence charSequence) {
            return super.setTitle(charSequence);
        }
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
        StringBuilder sb = new StringBuilder("RowSection { initialSelectedIndex: ");
        sb.append(this.mInitialSelectedIndex);
        sb.append(", ");
        return ad.e(sb, super.toString(), " }");
    }

    private RowSection() {
        this.mInitialSelectedIndex = -1;
    }

    private RowSection(Builder builder) {
        super(builder);
        this.mInitialSelectedIndex = builder.mInitialSelectedIndex;
    }
}
