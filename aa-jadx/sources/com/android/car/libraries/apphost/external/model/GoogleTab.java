package com.android.car.libraries.apphost.external.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class GoogleTab {
    private static final java.lang.String EMPTY_TAB_CONTENT_ID = "EMPTY_TAB_CONTENT_ID";
    private final java.lang.String mContentId;
    private final androidx.car.app.model.CarIcon mIcon;
    private final androidx.car.app.model.CarText mTitle;

    public GoogleTab(defpackage.gkb gkbVar) {
        this.mTitle = gkbVar.a;
        this.mIcon = gkbVar.b;
        java.lang.String str = gkbVar.c;
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
        if (!(obj instanceof com.android.car.libraries.apphost.external.model.GoogleTab)) {
            return false;
        }
        com.android.car.libraries.apphost.external.model.GoogleTab googleTab = (com.android.car.libraries.apphost.external.model.GoogleTab) obj;
        return j$.util.Objects.equals(this.mTitle, googleTab.mTitle) && j$.util.Objects.equals(this.mContentId, googleTab.mContentId) && j$.util.Objects.equals(this.mIcon, googleTab.mIcon);
    }

    public java.lang.String getContentId() {
        java.lang.String str = this.mContentId;
        str.getClass();
        return str;
    }

    public androidx.car.app.model.CarIcon getIcon() {
        return this.mIcon;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mTitle, this.mContentId, this.mIcon);
    }

    public java.lang.String toString() {
        androidx.car.app.model.CarIcon carIcon = this.mIcon;
        return "[title: " + androidx.car.app.model.CarText.toShortString(this.mTitle) + ", contentId: " + this.mContentId + ", icon: " + java.lang.String.valueOf(carIcon) + "]";
    }

    private GoogleTab() {
        this.mTitle = null;
        this.mContentId = EMPTY_TAB_CONTENT_ID;
        this.mIcon = null;
    }
}
