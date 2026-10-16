package androidx.car.app.model;

import defpackage.rb;
import defpackage.tl;
import defpackage.uf;
import defpackage.ug;
import defpackage.uq;
import defpackage.uw;
import defpackage.uy;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

@rb
/* loaded from: classes2.dex */
public final class ItemList {
    private final List<uf> mItems;
    private final CarText mNoItemsMessage;
    private final uw mOnItemVisibilityChangedDelegate;
    private final uy mOnSelectedDelegate;
    private final int mSelectedIndex;

    public ItemList(ug ugVar) {
        this.mSelectedIndex = ugVar.b;
        this.mItems = tl.b(ugVar.a);
        this.mNoItemsMessage = ugVar.e;
        this.mOnSelectedDelegate = ugVar.c;
        this.mOnItemVisibilityChangedDelegate = ugVar.d;
    }

    public static uq getOnClickDelegate(uf ufVar) {
        if (ufVar instanceof Row) {
            return ((Row) ufVar).getOnClickDelegate();
        }
        if (ufVar instanceof GridItem) {
            return ((GridItem) ufVar).getOnClickDelegate();
        }
        return null;
    }

    public static Toggle getToggle(uf ufVar) {
        if (ufVar instanceof Row) {
            return ((Row) ufVar).getToggle();
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

    public List<uf> getItems() {
        return tl.a(this.mItems);
    }

    public CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public uw getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    public uy getOnSelectedDelegate() {
        return this.mOnSelectedDelegate;
    }

    public int getSelectedIndex() {
        return this.mSelectedIndex;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mSelectedIndex), this.mItems, Boolean.valueOf(this.mOnSelectedDelegate == null), Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), this.mNoItemsMessage);
    }

    public ug toBuilder() {
        return new ug(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ items: ");
        List<uf> list = this.mItems;
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
}
