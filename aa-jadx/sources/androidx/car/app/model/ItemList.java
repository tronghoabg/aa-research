package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class ItemList {
    private final java.util.List<defpackage.uk> mItems;
    private final androidx.car.app.model.CarText mNoItemsMessage;
    private final defpackage.vb mOnItemVisibilityChangedDelegate;
    private final defpackage.vd mOnSelectedDelegate;
    private final int mSelectedIndex;

    public ItemList(defpackage.ul ulVar) {
        this.mSelectedIndex = ulVar.b;
        this.mItems = defpackage.tq.b(ulVar.a);
        this.mNoItemsMessage = ulVar.e;
        this.mOnSelectedDelegate = ulVar.c;
        this.mOnItemVisibilityChangedDelegate = ulVar.d;
    }

    public static defpackage.uv getOnClickDelegate(defpackage.uk ukVar) {
        if (ukVar instanceof androidx.car.app.model.Row) {
            return ((androidx.car.app.model.Row) ukVar).getOnClickDelegate();
        }
        if (ukVar instanceof androidx.car.app.model.GridItem) {
            return ((androidx.car.app.model.GridItem) ukVar).getOnClickDelegate();
        }
        return null;
    }

    public static androidx.car.app.model.Toggle getToggle(defpackage.uk ukVar) {
        if (ukVar instanceof androidx.car.app.model.Row) {
            return ((androidx.car.app.model.Row) ukVar).getToggle();
        }
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.ItemList)) {
            return false;
        }
        androidx.car.app.model.ItemList itemList = (androidx.car.app.model.ItemList) obj;
        if (this.mSelectedIndex == itemList.mSelectedIndex && j$.util.Objects.equals(this.mItems, itemList.mItems)) {
            if (j$.util.Objects.equals(java.lang.Boolean.valueOf(this.mOnSelectedDelegate == null), java.lang.Boolean.valueOf(itemList.mOnSelectedDelegate == null))) {
                if (j$.util.Objects.equals(java.lang.Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), java.lang.Boolean.valueOf(itemList.mOnItemVisibilityChangedDelegate == null)) && j$.util.Objects.equals(this.mNoItemsMessage, itemList.mNoItemsMessage)) {
                    return true;
                }
            }
        }
        return false;
    }

    public java.util.List<defpackage.uk> getItems() {
        return defpackage.tq.a(this.mItems);
    }

    public androidx.car.app.model.CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public defpackage.vb getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    public defpackage.vd getOnSelectedDelegate() {
        return this.mOnSelectedDelegate;
    }

    public int getSelectedIndex() {
        return this.mSelectedIndex;
    }

    public int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.mSelectedIndex), this.mItems, java.lang.Boolean.valueOf(this.mOnSelectedDelegate == null), java.lang.Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), this.mNoItemsMessage);
    }

    public defpackage.ul toBuilder() {
        return new defpackage.ul(this);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[ items: ");
        java.util.List<defpackage.uk> list = this.mItems;
        sb.append(list != null ? list.toString() : null);
        sb.append(", selected: ");
        sb.append(this.mSelectedIndex);
        sb.append("]");
        return sb.toString();
    }

    private ItemList() {
        this.mSelectedIndex = 0;
        this.mItems = java.util.Collections.EMPTY_LIST;
        this.mNoItemsMessage = null;
        this.mOnSelectedDelegate = null;
        this.mOnItemVisibilityChangedDelegate = null;
    }
}
