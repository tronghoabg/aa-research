package com.android.car.libraries.apphost.external.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public class GoogleTabTemplate implements defpackage.wi {
    private final java.lang.String mActiveTabContentId;
    private final androidx.car.app.model.Action mHeaderAction;
    private final boolean mIsLoading;
    private final defpackage.wb mTabCallbackDelegate;
    private final com.android.car.libraries.apphost.external.model.GoogleTabContents mTabContents;
    private final java.util.List<com.android.car.libraries.apphost.external.model.GoogleTab> mTabs;

    public GoogleTabTemplate(defpackage.gkd gkdVar) {
        this.mIsLoading = gkdVar.b;
        this.mHeaderAction = gkdVar.c;
        this.mTabs = new java.util.ArrayList(gkdVar.d);
        this.mTabContents = gkdVar.e;
        this.mTabCallbackDelegate = gkdVar.a;
        this.mActiveTabContentId = gkdVar.f;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.android.car.libraries.apphost.external.model.GoogleTabTemplate)) {
            return false;
        }
        com.android.car.libraries.apphost.external.model.GoogleTabTemplate googleTabTemplate = (com.android.car.libraries.apphost.external.model.GoogleTabTemplate) obj;
        return this.mIsLoading == googleTabTemplate.mIsLoading && j$.util.Objects.equals(this.mHeaderAction, googleTabTemplate.mHeaderAction) && j$.util.Objects.equals(this.mTabs, googleTabTemplate.mTabs) && j$.util.Objects.equals(this.mTabContents, googleTabTemplate.mTabContents) && j$.util.Objects.equals(this.mActiveTabContentId, googleTabTemplate.getActiveTabContentId());
    }

    public java.lang.String getActiveTabContentId() {
        return this.mActiveTabContentId;
    }

    public androidx.car.app.model.Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public defpackage.wb getTabCallbackDelegate() {
        defpackage.wb wbVar = this.mTabCallbackDelegate;
        wbVar.getClass();
        return wbVar;
    }

    public com.android.car.libraries.apphost.external.model.GoogleTabContents getTabContents() {
        return this.mTabContents;
    }

    public java.util.List<com.android.car.libraries.apphost.external.model.GoogleTab> getTabs() {
        java.util.List<com.android.car.libraries.apphost.external.model.GoogleTab> list = this.mTabs;
        return list == null ? new java.util.ArrayList() : list;
    }

    public int hashCode() {
        return j$.util.Objects.hash(java.lang.Boolean.valueOf(this.mIsLoading), this.mHeaderAction, this.mTabs, this.mTabContents, this.mActiveTabContentId);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public java.lang.String toString() {
        return "TabTemplate";
    }

    private GoogleTabTemplate() {
        this.mIsLoading = false;
        this.mHeaderAction = null;
        this.mTabs = new java.util.ArrayList();
        this.mTabContents = null;
        this.mTabCallbackDelegate = null;
        this.mActiveTabContentId = null;
    }
}
