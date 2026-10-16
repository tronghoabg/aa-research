package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.utils.CollectionUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class ItemList {
    private final List<Item> mItems;
    private final CarText mNoItemsMessage;
    private final OnItemVisibilityChangedDelegate mOnItemVisibilityChangedDelegate;
    private final OnSelectedDelegate mOnSelectedDelegate;
    private final int mSelectedIndex;

    /* compiled from: WazeSource */
    public interface OnItemVisibilityChangedListener {
        void onItemVisibilityChanged(int i2, int i3);
    }

    /* compiled from: WazeSource */
    public interface OnSelectedListener {
        void onSelected(int i2);
    }

    ItemList(Builder builder) {
        this.mSelectedIndex = builder.mSelectedIndex;
        this.mItems = CollectionUtils.unmodifiableCopy(builder.mItems);
        this.mNoItemsMessage = builder.mNoItemsMessage;
        this.mOnSelectedDelegate = builder.mOnSelectedDelegate;
        this.mOnItemVisibilityChangedDelegate = builder.mOnItemVisibilityChangedDelegate;
    }

    static OnClickDelegate getOnClickDelegate(Item item) {
        if (item instanceof Row) {
            return ((Row) item).getOnClickDelegate();
        }
        if (item instanceof GridItem) {
            return ((GridItem) item).getOnClickDelegate();
        }
        return null;
    }

    static Toggle getToggle(Item item) {
        if (item instanceof Row) {
            return ((Row) item).getToggle();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemList)) {
            return false;
        }
        ItemList itemList = (ItemList) obj;
        if (this.mSelectedIndex == itemList.mSelectedIndex && Objects.equals(this.mItems, itemList.mItems)) {
            if (Objects.equals(Boolean.valueOf(this.mOnSelectedDelegate == null), Boolean.valueOf(itemList.mOnSelectedDelegate == null))) {
                if (Objects.equals(Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), Boolean.valueOf(itemList.mOnItemVisibilityChangedDelegate == null)) && Objects.equals(this.mNoItemsMessage, itemList.mNoItemsMessage)) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<Item> getItems() {
        return CollectionUtils.emptyIfNull(this.mItems);
    }

    public CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public OnItemVisibilityChangedDelegate getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    public OnSelectedDelegate getOnSelectedDelegate() {
        return this.mOnSelectedDelegate;
    }

    public int getSelectedIndex() {
        return this.mSelectedIndex;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mSelectedIndex), this.mItems, Boolean.valueOf(this.mOnSelectedDelegate == null), Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), this.mNoItemsMessage);
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ items: ");
        List<Item> list = this.mItems;
        sb.append(list != null ? list.toString() : null);
        sb.append(", selected: ");
        sb.append(this.mSelectedIndex);
        sb.append("]");
        return sb.toString();
    }

    private ItemList() {
        this.mSelectedIndex = 0;
        this.mItems = Collections.EMPTY_LIST;
        this.mNoItemsMessage = null;
        this.mOnSelectedDelegate = null;
        this.mOnItemVisibilityChangedDelegate = null;
    }

    /* compiled from: WazeSource */
    public final class Builder {
        final List<Item> mItems;
        CarText mNoItemsMessage;
        OnItemVisibilityChangedDelegate mOnItemVisibilityChangedDelegate;
        OnSelectedDelegate mOnSelectedDelegate;
        int mSelectedIndex;

        Builder(ItemList itemList) {
            this.mSelectedIndex = itemList.getSelectedIndex();
            this.mOnSelectedDelegate = itemList.getOnSelectedDelegate();
            this.mOnItemVisibilityChangedDelegate = itemList.getOnItemVisibilityChangedDelegate();
            this.mNoItemsMessage = itemList.getNoItemsMessage();
            this.mItems = new ArrayList(itemList.getItems());
        }

        public Builder addItem(Item item) {
            this.mItems.add((Item) Objects.requireNonNull(item));
            return this;
        }

        public ItemList build() {
            if (this.mOnSelectedDelegate != null) {
                int size = this.mItems.size();
                if (size == 0) {
                    throw new IllegalStateException("A selectable list cannot be empty");
                }
                if (this.mSelectedIndex >= size) {
                    throw new IllegalStateException("The selected item index (" + this.mSelectedIndex + ") is larger than the size of the list (" + size + ")");
                }
                for (Item item : this.mItems) {
                    if (ItemList.getOnClickDelegate(item) != null) {
                        throw new IllegalStateException("Items that belong to selectable lists can't have an onClickListener. Use the OnSelectedListener of the list instead");
                    }
                    if (ItemList.getToggle(item) != null) {
                        throw new IllegalStateException("Items that belong to selectable lists can't have a toggle");
                    }
                }
            }
            return new ItemList(this);
        }

        public Builder clearItems() {
            this.mItems.clear();
            return this;
        }

        public Builder setNoItemsMessage(CharSequence charSequence) {
            this.mNoItemsMessage = CarText.create((CharSequence) Objects.requireNonNull(charSequence));
            return this;
        }

        public Builder setOnItemsVisibilityChangedDelegate(OnItemVisibilityChangedDelegate onItemVisibilityChangedDelegate) {
            this.mOnItemVisibilityChangedDelegate = onItemVisibilityChangedDelegate;
            return this;
        }

        public Builder setOnItemsVisibilityChangedListener(OnItemVisibilityChangedListener onItemVisibilityChangedListener) {
            this.mOnItemVisibilityChangedDelegate = OnItemVisibilityChangedDelegateImpl.create(onItemVisibilityChangedListener);
            return this;
        }

        public Builder setOnSelectedDelegate(OnSelectedDelegate onSelectedDelegate) {
            this.mOnSelectedDelegate = onSelectedDelegate;
            return this;
        }

        public Builder setOnSelectedListener(OnSelectedListener onSelectedListener) {
            this.mOnSelectedDelegate = OnSelectedDelegateImpl.create(onSelectedListener);
            return this;
        }

        public Builder setSelectedIndex(int i2) {
            if (i2 < 0) {
                throw new IllegalArgumentException("The item index must be larger than or equal to 0");
            }
            this.mSelectedIndex = i2;
            return this;
        }

        public Builder() {
            this.mItems = new ArrayList();
        }
    }
}
