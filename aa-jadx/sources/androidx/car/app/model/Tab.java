package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class Tab {
    private static final java.lang.String EMPTY_TAB_CONTENT_ID = "EMPTY_TAB_CONTENT_ID";
    private final java.lang.String mContentId;
    private final androidx.car.app.model.CarIcon mIcon;
    private final androidx.car.app.model.TabStyle mStyle;
    private final androidx.car.app.model.CarText mTitle;

    public Tab(defpackage.wa waVar) {
        this.mTitle = waVar.a;
        this.mIcon = waVar.b;
        androidx.car.app.model.TabStyle tabStyle = waVar.d;
        this.mStyle = null;
        java.lang.String str = waVar.c;
        if (str != null) {
            this.mContentId = str;
        } else {
            this.mContentId = EMPTY_TAB_CONTENT_ID;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.Tab)) {
            return false;
        }
        androidx.car.app.model.Tab tab = (androidx.car.app.model.Tab) obj;
        return j$.util.Objects.equals(this.mTitle, tab.mTitle) && j$.util.Objects.equals(this.mContentId, tab.mContentId) && j$.util.Objects.equals(this.mIcon, tab.mIcon) && j$.util.Objects.equals(this.mStyle, tab.mStyle);
    }

    public java.lang.String getContentId() {
        java.lang.String str = this.mContentId;
        str.getClass();
        return str;
    }

    public androidx.car.app.model.CarIcon getIcon() {
        androidx.car.app.model.CarIcon carIcon = this.mIcon;
        carIcon.getClass();
        return carIcon;
    }

    public androidx.car.app.model.TabStyle getStyle() {
        return this.mStyle;
    }

    public androidx.car.app.model.CarText getTitle() {
        androidx.car.app.model.CarText carText = this.mTitle;
        carText.getClass();
        return carText;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mTitle, this.mContentId, this.mIcon, this.mStyle);
    }

    public java.lang.String toString() {
        return "Tab { title: " + androidx.car.app.model.CarText.toShortString(this.mTitle) + ", contentId: " + this.mContentId + ", icon: " + this.mIcon + ", style: " + this.mStyle + " }";
    }

    private Tab() {
        this.mTitle = null;
        this.mContentId = EMPTY_TAB_CONTENT_ID;
        this.mIcon = null;
        this.mStyle = null;
    }
}
