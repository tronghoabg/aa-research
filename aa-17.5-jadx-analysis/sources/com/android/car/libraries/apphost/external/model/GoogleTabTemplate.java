package com.android.car.libraries.apphost.external.model;

import androidx.car.app.model.Action;
import defpackage.gjw;
import defpackage.rb;
import defpackage.vu;
import defpackage.wb;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

@rb
/* loaded from: classes2.dex */
public class GoogleTabTemplate implements wb {
    private final String mActiveTabContentId;
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final vu mTabCallbackDelegate;
    private final GoogleTabContents mTabContents;
    private final List<GoogleTab> mTabs;

    public GoogleTabTemplate(gjw gjwVar) {
        this.mIsLoading = gjwVar.b;
        this.mHeaderAction = gjwVar.c;
        this.mTabs = new ArrayList(gjwVar.d);
        this.mTabContents = gjwVar.e;
        this.mTabCallbackDelegate = gjwVar.a;
        this.mActiveTabContentId = gjwVar.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleTabTemplate)) {
            return false;
        }
        GoogleTabTemplate googleTabTemplate = (GoogleTabTemplate) obj;
        return this.mIsLoading == googleTabTemplate.mIsLoading && Objects.equals(this.mHeaderAction, googleTabTemplate.mHeaderAction) && Objects.equals(this.mTabs, googleTabTemplate.mTabs) && Objects.equals(this.mTabContents, googleTabTemplate.mTabContents) && Objects.equals(this.mActiveTabContentId, googleTabTemplate.getActiveTabContentId());
    }

    public String getActiveTabContentId() {
        return this.mActiveTabContentId;
    }

    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public vu getTabCallbackDelegate() {
        vu vuVar = this.mTabCallbackDelegate;
        vuVar.getClass();
        return vuVar;
    }

    public GoogleTabContents getTabContents() {
        return this.mTabContents;
    }

    public List<GoogleTab> getTabs() {
        List<GoogleTab> list = this.mTabs;
        return list == null ? new ArrayList() : list;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mHeaderAction, this.mTabs, this.mTabContents, this.mActiveTabContentId);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "TabTemplate";
    }

    private GoogleTabTemplate() {
        this.mIsLoading = false;
        this.mHeaderAction = null;
        this.mTabs = new ArrayList();
        this.mTabContents = null;
        this.mTabCallbackDelegate = null;
        this.mActiveTabContentId = null;
    }
}
