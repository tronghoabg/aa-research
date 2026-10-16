package androidx.car.app.model;

import defpackage.rb;
import defpackage.tl;
import defpackage.vu;
import defpackage.vz;
import defpackage.wb;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

@rb
/* loaded from: classes2.dex */
public class TabTemplate implements wb {
    private final String mActiveTabContentId;
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final vu mTabCallbackDelegate;
    private final TabContents mTabContents;
    private final List<Tab> mTabs;

    public TabTemplate(vz vzVar) {
        this.mIsLoading = vzVar.b;
        Action action = vzVar.c;
        this.mHeaderAction = null;
        this.mTabs = tl.b(vzVar.d);
        TabContents tabContents = vzVar.e;
        this.mTabContents = null;
        this.mTabCallbackDelegate = vzVar.a;
        String str = vzVar.f;
        this.mActiveTabContentId = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabTemplate)) {
            return false;
        }
        TabTemplate tabTemplate = (TabTemplate) obj;
        return this.mIsLoading == tabTemplate.mIsLoading && Objects.equals(this.mHeaderAction, tabTemplate.mHeaderAction) && Objects.equals(this.mTabs, tabTemplate.mTabs) && Objects.equals(this.mTabContents, tabTemplate.mTabContents) && Objects.equals(this.mActiveTabContentId, tabTemplate.mActiveTabContentId);
    }

    public String getActiveTabContentId() {
        String str = this.mActiveTabContentId;
        str.getClass();
        return str;
    }

    public Action getHeaderAction() {
        Action action = this.mHeaderAction;
        action.getClass();
        return action;
    }

    public vu getTabCallbackDelegate() {
        vu vuVar = this.mTabCallbackDelegate;
        vuVar.getClass();
        return vuVar;
    }

    public TabContents getTabContents() {
        TabContents tabContents = this.mTabContents;
        tabContents.getClass();
        return tabContents;
    }

    public List<Tab> getTabs() {
        return tl.a(this.mTabs);
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

    private TabTemplate() {
        this.mIsLoading = false;
        this.mHeaderAction = null;
        this.mTabs = Collections.EMPTY_LIST;
        this.mTabContents = null;
        this.mTabCallbackDelegate = null;
        this.mActiveTabContentId = null;
    }
}
