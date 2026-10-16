package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class SectionedItemList {
    private final androidx.car.app.model.CarText mHeader;
    private final androidx.car.app.model.ItemList mItemList;

    private SectionedItemList() {
        this.mItemList = null;
        this.mHeader = null;
    }

    public static androidx.car.app.model.SectionedItemList create(androidx.car.app.model.ItemList itemList, java.lang.CharSequence charSequence) {
        charSequence.getClass();
        androidx.car.app.model.CarText carTextCreate = androidx.car.app.model.CarText.create(charSequence);
        defpackage.wp.d.a(carTextCreate);
        itemList.getClass();
        return new androidx.car.app.model.SectionedItemList(itemList, carTextCreate);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.SectionedItemList)) {
            return false;
        }
        androidx.car.app.model.SectionedItemList sectionedItemList = (androidx.car.app.model.SectionedItemList) obj;
        return j$.util.Objects.equals(this.mItemList, sectionedItemList.mItemList) && j$.util.Objects.equals(this.mHeader, sectionedItemList.mHeader);
    }

    public androidx.car.app.model.CarText getHeader() {
        androidx.car.app.model.CarText carText = this.mHeader;
        carText.getClass();
        return carText;
    }

    public androidx.car.app.model.ItemList getItemList() {
        androidx.car.app.model.ItemList itemList = this.mItemList;
        itemList.getClass();
        return itemList;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mItemList, this.mHeader);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[ items: ");
        sb.append(this.mItemList);
        sb.append(", has header: ");
        sb.append(this.mHeader != null);
        sb.append("]");
        return sb.toString();
    }

    private SectionedItemList(androidx.car.app.model.ItemList itemList, androidx.car.app.model.CarText carText) {
        this.mItemList = itemList;
        this.mHeader = carText;
    }
}
