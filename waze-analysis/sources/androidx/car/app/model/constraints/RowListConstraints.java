package androidx.car.app.model.constraints;

import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.Banner;
import androidx.car.app.model.Item;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.Pane;
import androidx.car.app.model.Row;
import androidx.car.app.model.SectionedItemList;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
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
        Builder builder = new Builder();
        builder.setMaxActions(0);
        builder.setRowConstraints(RowConstraints.ROW_CONSTRAINTS_CONSERVATIVE);
        builder.setAllowSelectableLists(false);
        RowListConstraints rowListConstraintsBuild = builder.build();
        ROW_LIST_CONSTRAINTS_CONSERVATIVE = rowListConstraintsBuild;
        Builder builder2 = new Builder(rowListConstraintsBuild);
        builder2.setMaxActions(2);
        builder2.setRowConstraints(RowConstraints.ROW_CONSTRAINTS_PANE);
        builder2.setAllowSelectableLists(false);
        ROW_LIST_CONSTRAINTS_PANE = builder2.build();
        Builder builder3 = new Builder(rowListConstraintsBuild);
        builder3.setRowConstraints(RowConstraints.ROW_CONSTRAINTS_SIMPLE);
        ROW_LIST_CONSTRAINTS_SIMPLE = builder3.build();
        Builder builder4 = new Builder(rowListConstraintsBuild);
        builder4.setRowConstraints(RowConstraints.ROW_CONSTRAINTS_SIMPLE);
        builder4.setAllowSelectableLists(true);
        ROW_LIST_CONSTRAINTS_ROUTE_PREVIEW = builder4.build();
        Builder builder5 = new Builder(rowListConstraintsBuild);
        builder5.setRowConstraints(RowConstraints.ROW_CONSTRAINTS_SIMPLE);
        builder5.setAllowSelectableLists(true);
        MAP_ROW_LIST_CONSTRAINTS_ALLOW_SELECTABLE = builder5.build();
        Builder builder6 = new Builder(rowListConstraintsBuild);
        builder6.setRowConstraints(RowConstraints.ROW_CONSTRAINTS_FULL_LIST);
        builder6.setAllowSelectableLists(true);
        ROW_LIST_CONSTRAINTS_FULL_LIST = builder6.build();
    }

    RowListConstraints(Builder builder) {
        this.mMaxActions = builder.mMaxActions;
        this.mRowConstraints = builder.mRowConstraints;
        this.mAllowSelectableLists = builder.mAllowSelectableLists;
    }

    private void validateRows(List<? extends Item> list) {
        for (Item item : list) {
            if (item instanceof Row) {
                this.mRowConstraints.validateOrThrow((Row) item);
            } else if (!(item instanceof ConversationItem) && !(item instanceof Banner)) {
                throw new IllegalArgumentException(String.format("Unsupported item type: %s", item.getClass().getSimpleName()));
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

    /* compiled from: WazeSource */
    public final class Builder {
        boolean mAllowSelectableLists;
        int mMaxActions;
        RowConstraints mRowConstraints;

        public Builder(RowListConstraints rowListConstraints) {
            this.mRowConstraints = RowConstraints.UNCONSTRAINED;
            Objects.requireNonNull(rowListConstraints);
            this.mMaxActions = rowListConstraints.getMaxActions();
            this.mRowConstraints = rowListConstraints.getRowConstraints();
            this.mAllowSelectableLists = rowListConstraints.isAllowSelectableLists();
        }

        public RowListConstraints build() {
            return new RowListConstraints(this);
        }

        public Builder setAllowSelectableLists(boolean z) {
            this.mAllowSelectableLists = z;
            return this;
        }

        public Builder setMaxActions(int i2) {
            this.mMaxActions = i2;
            return this;
        }

        public Builder setRowConstraints(RowConstraints rowConstraints) {
            this.mRowConstraints = rowConstraints;
            return this;
        }

        public Builder() {
            this.mRowConstraints = RowConstraints.UNCONSTRAINED;
        }
    }

    public void validateOrThrow(Pane pane) {
        if (pane.getActions().size() <= this.mMaxActions) {
            validateRows(pane.getRows());
        } else {
            throw new IllegalArgumentException("The number of actions on the pane exceeded the supported max of " + this.mMaxActions);
        }
    }

    public void validateOrThrow(ItemList itemList) {
        if (itemList.getOnSelectedDelegate() != null && !this.mAllowSelectableLists) {
            throw new IllegalArgumentException("Selectable lists are not allowed");
        }
        validateRows(itemList.getItems());
    }
}
