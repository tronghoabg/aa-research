package androidx.car.app.model.constraints;

import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.Item;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.Pane;
import androidx.car.app.model.Row;
import androidx.car.app.model.SectionedItemList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class RowListConstraints {
    public static final RowListConstraints MAP_ROW_LIST_CONSTRAINTS_ALLOW_SELECTABLE;
    public static final RowListConstraints ROW_LIST_CONSTRAINTS_CONSERVATIVE;
    public static final RowListConstraints ROW_LIST_CONSTRAINTS_FULL_LIST;
    public static final RowListConstraints ROW_LIST_CONSTRAINTS_PANE;

    @Deprecated
    public static final RowListConstraints ROW_LIST_CONSTRAINTS_ROUTE_PREVIEW;
    public static final RowListConstraints ROW_LIST_CONSTRAINTS_SIMPLE;
    private final boolean mAllowSelectableLists;
    private final int mMaxActions;
    private final RowConstraints mRowConstraints;

    static {
        RowListConstraints rowListConstraintsBuild = new Builder().setMaxActions(0).setRowConstraints(RowConstraints.ROW_CONSTRAINTS_CONSERVATIVE).setAllowSelectableLists(false).build();
        ROW_LIST_CONSTRAINTS_CONSERVATIVE = rowListConstraintsBuild;
        ROW_LIST_CONSTRAINTS_PANE = new Builder(rowListConstraintsBuild).setMaxActions(2).setRowConstraints(RowConstraints.ROW_CONSTRAINTS_PANE).setAllowSelectableLists(false).build();
        Builder builder = new Builder(rowListConstraintsBuild);
        RowConstraints rowConstraints = RowConstraints.ROW_CONSTRAINTS_SIMPLE;
        ROW_LIST_CONSTRAINTS_SIMPLE = builder.setRowConstraints(rowConstraints).build();
        ROW_LIST_CONSTRAINTS_ROUTE_PREVIEW = new Builder(rowListConstraintsBuild).setRowConstraints(rowConstraints).setAllowSelectableLists(true).build();
        MAP_ROW_LIST_CONSTRAINTS_ALLOW_SELECTABLE = new Builder(rowListConstraintsBuild).setRowConstraints(rowConstraints).setAllowSelectableLists(true).build();
        ROW_LIST_CONSTRAINTS_FULL_LIST = new Builder(rowListConstraintsBuild).setRowConstraints(RowConstraints.ROW_CONSTRAINTS_FULL_LIST).setAllowSelectableLists(true).build();
    }

    public RowListConstraints(Builder builder) {
        this.mMaxActions = builder.mMaxActions;
        this.mRowConstraints = builder.mRowConstraints;
        this.mAllowSelectableLists = builder.mAllowSelectableLists;
    }

    private void validateRows(List<? extends Item> list) {
        for (Item item : list) {
            if (item instanceof Row) {
                this.mRowConstraints.validateOrThrow((Row) item);
            } else if (!(item instanceof ConversationItem)) {
                throw new IllegalArgumentException("Unsupported item type: ".concat(item.getClass().getSimpleName()));
            }
        }
    }

    public int getMaxActions() {
        return this.mMaxActions;
    }

    public RowConstraints getRowConstraints() {
        return this.mRowConstraints;
    }

    public boolean isAllowSelectableLists() {
        return this.mAllowSelectableLists;
    }

    public void validateOrThrow(ItemList itemList) {
        if (itemList.getOnSelectedDelegate() != null && !this.mAllowSelectableLists) {
            throw new IllegalArgumentException("Selectable lists are not allowed");
        }
        validateRows(itemList.getItems());
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        boolean mAllowSelectableLists;
        int mMaxActions;
        RowConstraints mRowConstraints;

        public Builder() {
            this.mRowConstraints = RowConstraints.UNCONSTRAINED;
        }

        public RowListConstraints build() {
            return new RowListConstraints(this);
        }

        public Builder setAllowSelectableLists(boolean z) {
            this.mAllowSelectableLists = z;
            return this;
        }

        public Builder setMaxActions(int i) {
            this.mMaxActions = i;
            return this;
        }

        public Builder setRowConstraints(RowConstraints rowConstraints) {
            this.mRowConstraints = rowConstraints;
            return this;
        }

        public Builder(RowListConstraints rowListConstraints) {
            this.mRowConstraints = RowConstraints.UNCONSTRAINED;
            Objects.requireNonNull(rowListConstraints);
            this.mMaxActions = rowListConstraints.getMaxActions();
            this.mRowConstraints = rowListConstraints.getRowConstraints();
            this.mAllowSelectableLists = rowListConstraints.isAllowSelectableLists();
        }
    }

    public void validateOrThrow(List<SectionedItemList> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<SectionedItemList> it = list.iterator();
        while (it.hasNext()) {
            ItemList itemList = it.next().getItemList();
            if (itemList.getOnSelectedDelegate() != null && !this.mAllowSelectableLists) {
                throw new IllegalArgumentException("Selectable lists are not allowed");
            }
            arrayList.addAll(itemList.getItems());
        }
        validateRows(arrayList);
    }

    public void validateOrThrow(Pane pane) {
        if (pane.getActions().size() <= this.mMaxActions) {
            validateRows(pane.getRows());
        } else {
            throw new IllegalArgumentException("The number of actions on the pane exceeded the supported max of " + this.mMaxActions);
        }
    }
}
