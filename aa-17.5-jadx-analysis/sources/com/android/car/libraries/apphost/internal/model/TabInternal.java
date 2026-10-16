package com.android.car.libraries.apphost.internal.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import defpackage.afeu;
import defpackage.affa;
import defpackage.gmu;
import defpackage.rb;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001B+\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0007HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/android/car/libraries/apphost/internal/model/TabInternal;", "", "title", "Landroidx/car/app/model/CarText;", "icon", "Landroidx/car/app/model/CarIcon;", "contentId", "", "<init>", "(Landroidx/car/app/model/CarText;Landroidx/car/app/model/CarIcon;Ljava/lang/String;)V", "getTitle", "()Landroidx/car/app/model/CarText;", "getIcon", "()Landroidx/car/app/model/CarIcon;", "getContentId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "third_party.java_src.android_libs.car.apphost.main.com.android.car.libraries.apphost.internal.model_model"}, k = 1, mv = {2, 3, 0}, xi = 48)
@rb
/* loaded from: classes2.dex */
public final /* data */ class TabInternal {
    public static final gmu Companion = new gmu();
    private static final String EMPTY_TAB_CONTENT_ID = "EMPTY_TAB_CONTENT_ID";
    private final String contentId;
    private final CarIcon icon;
    private final CarText title;

    public /* synthetic */ TabInternal(CarText carText, CarIcon carIcon, String str, int i, afeu afeuVar) {
        this(1 == (i & 1) ? null : carText, (i & 2) != 0 ? null : carIcon, (i & 4) != 0 ? EMPTY_TAB_CONTENT_ID : str);
    }

    public static /* synthetic */ TabInternal copy$default(TabInternal tabInternal, CarText carText, CarIcon carIcon, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            carText = tabInternal.title;
        }
        if ((i & 2) != 0) {
            carIcon = tabInternal.icon;
        }
        if ((i & 4) != 0) {
            str = tabInternal.contentId;
        }
        return tabInternal.copy(carText, carIcon, str);
    }

    /* renamed from: component1, reason: from getter */
    public final CarText getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final CarIcon getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    public final TabInternal copy(CarText title, CarIcon icon, String contentId) {
        contentId.getClass();
        return new TabInternal(title, icon, contentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabInternal)) {
            return false;
        }
        TabInternal tabInternal = (TabInternal) other;
        return affa.f(this.title, tabInternal.title) && affa.f(this.icon, tabInternal.icon) && affa.f(this.contentId, tabInternal.contentId);
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final CarIcon getIcon() {
        return this.icon;
    }

    public final CarText getTitle() {
        return this.title;
    }

    public int hashCode() {
        CarText carText = this.title;
        int iHashCode = carText == null ? 0 : carText.hashCode();
        CarIcon carIcon = this.icon;
        return (((iHashCode * 31) + (carIcon != null ? carIcon.hashCode() : 0)) * 31) + this.contentId.hashCode();
    }

    public String toString() {
        return "TabInternal(title=" + this.title + ", icon=" + this.icon + ", contentId=" + this.contentId + ")";
    }

    public TabInternal(CarText carText) {
        this(carText, null, null, 6, null);
    }

    public TabInternal(CarText carText, CarIcon carIcon) {
        this(carText, carIcon, null, 4, null);
    }

    public TabInternal(CarText carText, CarIcon carIcon, String str) {
        str.getClass();
        this.title = carText;
        this.icon = carIcon;
        this.contentId = str;
    }

    public TabInternal() {
        this(null, null, null, 7, null);
    }
}
