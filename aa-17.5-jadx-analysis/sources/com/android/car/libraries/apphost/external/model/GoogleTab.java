package com.android.car.libraries.apphost.external.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import defpackage.gju;
import defpackage.rb;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public final class GoogleTab {
    private static final String EMPTY_TAB_CONTENT_ID = "EMPTY_TAB_CONTENT_ID";
    private final String mContentId;
    private final CarIcon mIcon;
    private final CarText mTitle;

    public GoogleTab(gju gjuVar) {
        this.mTitle = gjuVar.a;
        this.mIcon = gjuVar.b;
        String str = gjuVar.c;
        if (str != null) {
            this.mContentId = str;
        } else {
            this.mContentId = EMPTY_TAB_CONTENT_ID;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleTab)) {
            return false;
        }
        GoogleTab googleTab = (GoogleTab) obj;
        return Objects.equals(this.mTitle, googleTab.mTitle) && Objects.equals(this.mContentId, googleTab.mContentId) && Objects.equals(this.mIcon, googleTab.mIcon);
    }

    public String getContentId() {
        String str = this.mContentId;
        str.getClass();
        return str;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mContentId, this.mIcon);
    }

    public String toString() {
        CarIcon carIcon = this.mIcon;
        return "[title: " + CarText.toShortString(this.mTitle) + ", contentId: " + this.mContentId + ", icon: " + String.valueOf(carIcon) + "]";
    }

    private GoogleTab() {
        this.mTitle = null;
        this.mContentId = EMPTY_TAB_CONTENT_ID;
        this.mIcon = null;
    }
}
