package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public class TabTemplate implements defpackage.wi {
    private final java.lang.String mActiveTabContentId;
    private final androidx.car.app.model.Action mHeaderAction;
    private final boolean mIsLoading;
    private final defpackage.wb mTabCallbackDelegate;
    private final androidx.car.app.model.TabContents mTabContents;
    private final java.util.List<androidx.car.app.model.Tab> mTabs;

    public TabTemplate(defpackage.wg wgVar) {
        this.mIsLoading = wgVar.b;
        androidx.car.app.model.Action action = wgVar.c;
        this.mHeaderAction = null;
        this.mTabs = defpackage.tq.b(wgVar.d);
        androidx.car.app.model.TabContents tabContents = wgVar.e;
        this.mTabContents = null;
        this.mTabCallbackDelegate = wgVar.a;
        java.lang.String str = wgVar.f;
        this.mActiveTabContentId = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.TabTemplate)) {
            return false;
        }
        androidx.car.app.model.TabTemplate tabTemplate = (androidx.car.app.model.TabTemplate) obj;
        return this.mIsLoading == tabTemplate.mIsLoading && j$.util.Objects.equals(this.mHeaderAction, tabTemplate.mHeaderAction) && j$.util.Objects.equals(this.mTabs, tabTemplate.mTabs) && j$.util.Objects.equals(this.mTabContents, tabTemplate.mTabContents) && j$.util.Objects.equals(this.mActiveTabContentId, tabTemplate.mActiveTabContentId);
    }

    public java.lang.String getActiveTabContentId() {
        java.lang.String str = this.mActiveTabContentId;
        str.getClass();
        return str;
    }

    public androidx.car.app.model.Action getHeaderAction() {
        androidx.car.app.model.Action action = this.mHeaderAction;
        action.getClass();
        return action;
    }

    public defpackage.wb getTabCallbackDelegate() {
        defpackage.wb wbVar = this.mTabCallbackDelegate;
        wbVar.getClass();
        return wbVar;
    }

    public androidx.car.app.model.TabContents getTabContents() {
        androidx.car.app.model.TabContents tabContents = this.mTabContents;
        tabContents.getClass();
        return tabContents;
    }

    public java.util.List<androidx.car.app.model.Tab> getTabs() {
        return defpackage.tq.a(this.mTabs);
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

    private TabTemplate() {
        this.mIsLoading = false;
        this.mHeaderAction = null;
        this.mTabs = java.util.Collections.EMPTY_LIST;
        this.mTabContents = null;
        this.mTabCallbackDelegate = null;
        this.mActiveTabContentId = null;
    }
}
