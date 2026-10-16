package com.android.car.libraries.apphost.internal.model;

import androidx.car.app.model.Action;
import defpackage.afeu;
import defpackage.affa;
import defpackage.gmv;
import defpackage.rb;
import defpackage.vu;
import defpackage.wb;
import defpackage.woy;
import j$.util.Objects;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000B\t\b\u0012¢\u0006\u0004\b\u0004\u0010\u0014J\n\u0010!\u001a\u00020\u0012H\u0096\u0080\u0004J\n\u0010\"\u001a\u00020#H\u0096\u0080\u0004J\u0014\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0082\u0004R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0016R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086$¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006)"}, d2 = {"Lcom/android/car/libraries/apphost/internal/model/TabTemplateInternal;", "Landroidx/car/app/model/Template;", "builder", "Lcom/android/car/libraries/apphost/internal/model/TabTemplateInternal$Builder;", "<init>", "(Lcom/android/car/libraries/apphost/internal/model/TabTemplateInternal$Builder;)V", "isLoading", "", "tabCallbackDelegate", "Landroidx/car/app/model/TabCallbackDelegate;", "headerAction", "Landroidx/car/app/model/Action;", "tabContents", "Lcom/android/car/libraries/apphost/internal/model/TabContentsInternal;", "tabs", "", "Lcom/android/car/libraries/apphost/internal/model/TabInternal;", "activeTabContentId", "", "(ZLandroidx/car/app/model/TabCallbackDelegate;Landroidx/car/app/model/Action;Lcom/android/car/libraries/apphost/internal/model/TabContentsInternal;Ljava/util/List;Ljava/lang/String;)V", "()V", "value", "()Z", "getTabCallbackDelegate", "()Landroidx/car/app/model/TabCallbackDelegate;", "getHeaderAction", "()Landroidx/car/app/model/Action;", "getTabContents", "()Lcom/android/car/libraries/apphost/internal/model/TabContentsInternal;", "getTabs", "()Ljava/util/List;", "getActiveTabContentId", "()Ljava/lang/String;", "toString", "hashCode", "", "equals", "other", "", "copy", "Builder", "third_party.java_src.android_libs.car.apphost.main.com.android.car.libraries.apphost.internal.model_model"}, k = 1, mv = {2, 3, 0}, xi = 48)
@rb
/* loaded from: classes2.dex */
public final class TabTemplateInternal implements wb {
    private String activeTabContentId;
    private Action headerAction;
    private boolean isLoading;
    private vu tabCallbackDelegate;
    private TabContentsInternal tabContents;
    private List<TabInternal> tabs;

    public /* synthetic */ TabTemplateInternal(boolean z, vu vuVar, Action action, TabContentsInternal tabContentsInternal, List list, String str, int i, afeu afeuVar) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), vuVar, (i & 4) != 0 ? null : action, (i & 8) != 0 ? null : tabContentsInternal, list, (i & 32) != 0 ? null : str);
    }

    public static /* synthetic */ TabTemplateInternal copy$default(TabTemplateInternal tabTemplateInternal, boolean z, vu vuVar, Action action, TabContentsInternal tabContentsInternal, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = tabTemplateInternal.isLoading;
        }
        if ((i & 2) != 0) {
            vuVar = tabTemplateInternal.getTabCallbackDelegate();
        }
        if ((i & 4) != 0) {
            action = tabTemplateInternal.headerAction;
        }
        if ((i & 8) != 0) {
            tabContentsInternal = tabTemplateInternal.tabContents;
        }
        if ((i & 16) != 0) {
            list = tabTemplateInternal.getTabs();
        }
        if ((i & 32) != 0) {
            str = tabTemplateInternal.activeTabContentId;
        }
        List list2 = list;
        String str2 = str;
        return tabTemplateInternal.copy(z, vuVar, action, tabContentsInternal, list2, str2);
    }

    public final TabTemplateInternal copy(boolean z, vu vuVar, Action action, TabContentsInternal tabContentsInternal, List<TabInternal> list, String str) {
        vuVar.getClass();
        list.getClass();
        return new TabTemplateInternal(z, vuVar, action, tabContentsInternal, list, str);
    }

    public boolean equals(Object other) {
        if (!(other instanceof TabTemplateInternal)) {
            return false;
        }
        TabTemplateInternal tabTemplateInternal = (TabTemplateInternal) other;
        return this.isLoading == tabTemplateInternal.isLoading && affa.f(this.headerAction, tabTemplateInternal.headerAction) && affa.f(getTabs(), tabTemplateInternal.getTabs()) && affa.f(this.tabContents, tabTemplateInternal.tabContents) && affa.f(this.activeTabContentId, tabTemplateInternal.activeTabContentId);
    }

    public final String getActiveTabContentId() {
        return this.activeTabContentId;
    }

    public final Action getHeaderAction() {
        return this.headerAction;
    }

    public final vu getTabCallbackDelegate() {
        vu vuVar = this.tabCallbackDelegate;
        if (vuVar != null) {
            return vuVar;
        }
        affa.d("tabCallbackDelegate");
        return null;
    }

    public final TabContentsInternal getTabContents() {
        return this.tabContents;
    }

    public final List<TabInternal> getTabs() {
        List<TabInternal> list = this.tabs;
        if (list != null) {
            return list;
        }
        affa.d("tabs");
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isLoading), this.headerAction, getTabs(), this.tabContents, this.activeTabContentId);
    }

    /* renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "TabTemplate";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TabTemplateInternal(gmv gmvVar) {
        this(gmvVar.b, gmvVar.a, gmvVar.c, gmvVar.e, woy.cf(gmvVar.d), gmvVar.f);
        gmvVar.getClass();
    }

    public TabTemplateInternal(boolean z, vu vuVar, Action action, TabContentsInternal tabContentsInternal, List<TabInternal> list, String str) {
        vuVar.getClass();
        list.getClass();
        this.isLoading = z;
        this.tabCallbackDelegate = vuVar;
        this.headerAction = action;
        this.tabContents = tabContentsInternal;
        this.tabs = list;
        this.activeTabContentId = str;
    }

    private TabTemplateInternal() {
    }
}
