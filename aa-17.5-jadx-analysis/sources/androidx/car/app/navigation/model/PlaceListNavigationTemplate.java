package androidx.car.app.navigation.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import defpackage.rb;
import defpackage.ut;
import defpackage.wb;
import defpackage.xc;
import defpackage.xf;
import j$.util.Objects;

@Deprecated
@rb
/* loaded from: classes2.dex */
public final class PlaceListNavigationTemplate implements wb {
    private final ActionStrip mActionStrip;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final ItemList mItemList;
    private final ActionStrip mMapActionStrip;
    private final ut mOnContentRefreshDelegate;
    private final xc mPanModeDelegate;

    @Deprecated
    private final CarText mTitle;

    PlaceListNavigationTemplate(xf xfVar) {
        CarText carText = xfVar.a;
        this.mTitle = null;
        boolean z = xfVar.b;
        this.mIsLoading = false;
        ItemList itemList = xfVar.c;
        this.mItemList = null;
        Header header = xfVar.d;
        this.mHeader = null;
        Action action = xfVar.e;
        this.mHeaderAction = null;
        ActionStrip actionStrip = xfVar.f;
        this.mActionStrip = null;
        ActionStrip actionStrip2 = xfVar.g;
        this.mMapActionStrip = null;
        xc xcVar = xfVar.h;
        this.mPanModeDelegate = null;
        ut utVar = xfVar.i;
        this.mOnContentRefreshDelegate = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceListNavigationTemplate)) {
            return false;
        }
        PlaceListNavigationTemplate placeListNavigationTemplate = (PlaceListNavigationTemplate) obj;
        if (this.mIsLoading == placeListNavigationTemplate.mIsLoading && Objects.equals(this.mTitle, placeListNavigationTemplate.mTitle) && Objects.equals(this.mItemList, placeListNavigationTemplate.mItemList) && Objects.equals(this.mHeaderAction, placeListNavigationTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, placeListNavigationTemplate.mActionStrip) && Objects.equals(this.mMapActionStrip, placeListNavigationTemplate.mMapActionStrip)) {
            if (Objects.equals(Boolean.valueOf(this.mPanModeDelegate == null), Boolean.valueOf(placeListNavigationTemplate.mPanModeDelegate == null))) {
                if (Objects.equals(Boolean.valueOf(this.mOnContentRefreshDelegate == null), Boolean.valueOf(placeListNavigationTemplate.mOnContentRefreshDelegate == null)) && Objects.equals(this.mHeader, placeListNavigationTemplate.mHeader)) {
                    return true;
                }
            }
        }
        return false;
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public ItemList getItemList() {
        return this.mItemList;
    }

    public ActionStrip getMapActionStrip() {
        return this.mMapActionStrip;
    }

    public ut getOnContentRefreshDelegate() {
        return this.mOnContentRefreshDelegate;
    }

    public xc getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, Boolean.valueOf(this.mIsLoading), this.mItemList, this.mHeaderAction, this.mActionStrip, this.mMapActionStrip, Boolean.valueOf(this.mPanModeDelegate == null), Boolean.valueOf(this.mOnContentRefreshDelegate == null), this.mHeader);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "PlaceListNavigationTemplate";
    }

    private PlaceListNavigationTemplate() {
        this.mTitle = null;
        this.mIsLoading = false;
        this.mItemList = null;
        this.mHeader = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mMapActionStrip = null;
        this.mPanModeDelegate = null;
        this.mOnContentRefreshDelegate = null;
    }
}
