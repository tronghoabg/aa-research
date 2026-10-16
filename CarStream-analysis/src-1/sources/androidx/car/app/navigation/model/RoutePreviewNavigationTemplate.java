package androidx.car.app.navigation.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ModelUtils;
import androidx.car.app.model.Template;
import androidx.car.app.model.constraints.ActionsConstraints;
import androidx.car.app.model.constraints.CarTextConstraints;
import androidx.car.app.model.constraints.RowListConstraints;
import java.util.Collections;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@Deprecated
/* loaded from: classes.dex */
public final class RoutePreviewNavigationTemplate implements Template {
    private final ActionStrip mActionStrip;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final ItemList mItemList;
    private final ActionStrip mMapActionStrip;
    private final Action mNavigateAction;
    private final PanModeDelegate mPanModeDelegate;

    @Deprecated
    private final CarText mTitle;

    public RoutePreviewNavigationTemplate(Builder builder) {
        this.mTitle = builder.mTitle;
        this.mIsLoading = builder.mIsLoading;
        this.mNavigateAction = builder.mNavigateAction;
        this.mItemList = builder.mItemList;
        this.mHeader = builder.mHeader;
        this.mHeaderAction = builder.mHeaderAction;
        this.mActionStrip = builder.mActionStrip;
        this.mMapActionStrip = builder.mMapActionStrip;
        this.mPanModeDelegate = builder.mPanModeDelegate;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutePreviewNavigationTemplate)) {
            return false;
        }
        RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
        if (this.mIsLoading == routePreviewNavigationTemplate.mIsLoading && Objects.equals(this.mTitle, routePreviewNavigationTemplate.mTitle) && Objects.equals(this.mNavigateAction, routePreviewNavigationTemplate.mNavigateAction) && Objects.equals(this.mItemList, routePreviewNavigationTemplate.mItemList) && Objects.equals(this.mHeaderAction, routePreviewNavigationTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, routePreviewNavigationTemplate.mActionStrip) && Objects.equals(this.mMapActionStrip, routePreviewNavigationTemplate.mMapActionStrip)) {
            if (Boolean.valueOf(this.mPanModeDelegate == null).equals(Boolean.valueOf(routePreviewNavigationTemplate.mPanModeDelegate == null)) && Objects.equals(this.mHeader, routePreviewNavigationTemplate.mHeader)) {
                return true;
            }
        }
        return false;
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    @RequiresCarApi(5)
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

    @RequiresCarApi(4)
    public ActionStrip getMapActionStrip() {
        return this.mMapActionStrip;
    }

    public Action getNavigateAction() {
        return this.mNavigateAction;
    }

    @RequiresCarApi(4)
    public PanModeDelegate getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, Boolean.valueOf(this.mIsLoading), this.mNavigateAction, this.mItemList, this.mHeaderAction, this.mActionStrip, this.mMapActionStrip, Boolean.valueOf(this.mPanModeDelegate == null), this.mHeader);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "RoutePreviewNavigationTemplate";
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        ActionStrip mActionStrip;
        Header mHeader;
        Action mHeaderAction;
        boolean mIsLoading;
        ItemList mItemList;
        ActionStrip mMapActionStrip;
        Action mNavigateAction;
        PanModeDelegate mPanModeDelegate;
        CarText mTitle;

        public RoutePreviewNavigationTemplate build() {
            boolean z = this.mItemList != null;
            boolean z2 = this.mIsLoading;
            if (z2 == z) {
                throw new IllegalStateException("Template is in a loading state but a list is set, or vice versa");
            }
            if (z2 || this.mNavigateAction != null) {
                return new RoutePreviewNavigationTemplate(this);
            }
            throw new IllegalStateException("The navigation action cannot be null when the list is not in a loading state");
        }

        public Builder setActionStrip(ActionStrip actionStrip) {
            ActionsConstraints actionsConstraints = ActionsConstraints.ACTIONS_CONSTRAINTS_NAVIGATION;
            Objects.requireNonNull(actionStrip);
            actionsConstraints.validateOrThrow(actionStrip.getActions());
            this.mActionStrip = actionStrip;
            return this;
        }

        @RequiresCarApi(5)
        public Builder setHeader(Header header) {
            Objects.requireNonNull(header);
            this.mHeader = header;
            return this;
        }

        @Deprecated
        public Builder setHeaderAction(Action action) {
            ActionsConstraints actionsConstraints = ActionsConstraints.ACTIONS_CONSTRAINTS_HEADER;
            Objects.requireNonNull(action);
            actionsConstraints.validateOrThrow(Collections.singletonList(action));
            this.mHeaderAction = action;
            return this;
        }

        public Builder setItemList(ItemList itemList) {
            RowListConstraints rowListConstraints = RowListConstraints.MAP_ROW_LIST_CONSTRAINTS_ALLOW_SELECTABLE;
            Objects.requireNonNull(itemList);
            rowListConstraints.validateOrThrow(itemList);
            ModelUtils.validateAllRowsHaveDistanceOrDuration(itemList.getItems());
            ModelUtils.validateAllRowsHaveOnlySmallImages(itemList.getItems());
            if (!itemList.getItems().isEmpty() && itemList.getOnSelectedDelegate() == null) {
                throw new IllegalArgumentException("The OnSelectedListener must be set for the route list");
            }
            this.mItemList = itemList;
            return this;
        }

        public Builder setLoading(boolean z) {
            this.mIsLoading = z;
            return this;
        }

        @RequiresCarApi(4)
        public Builder setMapActionStrip(ActionStrip actionStrip) {
            ActionsConstraints actionsConstraints = ActionsConstraints.ACTIONS_CONSTRAINTS_MAP;
            Objects.requireNonNull(actionStrip);
            actionsConstraints.validateOrThrow(actionStrip.getActions());
            this.mMapActionStrip = actionStrip;
            return this;
        }

        public Builder setNavigateAction(Action action) {
            Objects.requireNonNull(action);
            if (CarText.isNullOrEmpty(action.getTitle())) {
                throw new IllegalArgumentException("The Action's title cannot be null or empty");
            }
            this.mNavigateAction = action;
            return this;
        }

        @RequiresCarApi(4)
        public Builder setPanModeListener(PanModeListener panModeListener) {
            Objects.requireNonNull(panModeListener);
            this.mPanModeDelegate = PanModeDelegateImpl.create(panModeListener);
            return this;
        }

        @Deprecated
        public Builder setTitle(CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            CarText carTextCreate = CarText.create(charSequence);
            this.mTitle = carTextCreate;
            CarTextConstraints.TEXT_ONLY.validateOrThrow(carTextCreate);
            return this;
        }

        @Deprecated
        public Builder setTitle(CarText carText) {
            Objects.requireNonNull(carText);
            this.mTitle = carText;
            CarTextConstraints.TEXT_ONLY.validateOrThrow(carText);
            return this;
        }
    }

    private RoutePreviewNavigationTemplate() {
        this.mTitle = null;
        this.mIsLoading = false;
        this.mNavigateAction = null;
        this.mItemList = null;
        this.mHeader = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mMapActionStrip = null;
        this.mPanModeDelegate = null;
    }
}
