package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.constraints.ActionsConstraints;
import androidx.car.app.model.constraints.CarTextConstraints;
import androidx.car.app.model.constraints.RowListConstraints;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public final class PlaceListMapTemplate implements Template {
    private final ActionStrip mActionStrip;
    private final Place mAnchor;
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final ItemList mItemList;
    private final OnContentRefreshDelegate mOnContentRefreshDelegate;
    private final boolean mShowCurrentLocation;
    private final CarText mTitle;

    public PlaceListMapTemplate(Builder builder) {
        this.mShowCurrentLocation = builder.mShowCurrentLocation;
        this.mIsLoading = builder.mIsLoading;
        this.mTitle = builder.mTitle;
        this.mItemList = builder.mItemList;
        this.mHeaderAction = builder.mHeaderAction;
        this.mActionStrip = builder.mActionStrip;
        this.mAnchor = builder.mAnchor;
        this.mOnContentRefreshDelegate = builder.mOnContentRefreshDelegate;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceListMapTemplate)) {
            return false;
        }
        PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
        if (this.mShowCurrentLocation == placeListMapTemplate.mShowCurrentLocation && this.mIsLoading == placeListMapTemplate.mIsLoading && Objects.equals(this.mTitle, placeListMapTemplate.mTitle) && Objects.equals(this.mItemList, placeListMapTemplate.mItemList) && Objects.equals(this.mHeaderAction, placeListMapTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, placeListMapTemplate.mActionStrip) && Objects.equals(this.mAnchor, placeListMapTemplate.mAnchor)) {
            if (Boolean.valueOf(this.mOnContentRefreshDelegate == null).equals(Boolean.valueOf(placeListMapTemplate.mOnContentRefreshDelegate == null))) {
                return true;
            }
        }
        return false;
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Place getAnchor() {
        return this.mAnchor;
    }

    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public ItemList getItemList() {
        return this.mItemList;
    }

    @RequiresCarApi(5)
    public OnContentRefreshDelegate getOnContentRefreshDelegate() {
        return this.mOnContentRefreshDelegate;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mShowCurrentLocation), Boolean.valueOf(this.mIsLoading), this.mTitle, this.mItemList, this.mHeaderAction, this.mActionStrip, this.mAnchor, Boolean.valueOf(this.mOnContentRefreshDelegate == null));
    }

    public boolean isCurrentLocationEnabled() {
        return this.mShowCurrentLocation;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "PlaceListMapTemplate";
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        ActionStrip mActionStrip;
        Place mAnchor;
        Action mHeaderAction;
        boolean mIsLoading;
        ItemList mItemList;

        @RequiresCarApi(5)
        OnContentRefreshDelegate mOnContentRefreshDelegate;
        boolean mShowCurrentLocation;
        CarText mTitle;

        public PlaceListMapTemplate build() {
            if (this.mIsLoading != (this.mItemList != null)) {
                return new PlaceListMapTemplate(this);
            }
            throw new IllegalArgumentException("Template is in a loading state but a list is set, or vice versa");
        }

        public Builder setActionStrip(ActionStrip actionStrip) {
            ActionsConstraints actionsConstraints = ActionsConstraints.ACTIONS_CONSTRAINTS_NAVIGATION;
            Objects.requireNonNull(actionStrip);
            actionsConstraints.validateOrThrow(actionStrip.getActions());
            this.mActionStrip = actionStrip;
            return this;
        }

        public Builder setAnchor(Place place) {
            Objects.requireNonNull(place);
            this.mAnchor = place;
            return this;
        }

        public Builder setCurrentLocationEnabled(boolean z) {
            this.mShowCurrentLocation = z;
            return this;
        }

        public Builder setHeaderAction(Action action) {
            ActionsConstraints actionsConstraints = ActionsConstraints.ACTIONS_CONSTRAINTS_HEADER;
            Objects.requireNonNull(action);
            actionsConstraints.validateOrThrow(Collections.singletonList(action));
            this.mHeaderAction = action;
            return this;
        }

        public Builder setItemList(ItemList itemList) {
            Objects.requireNonNull(itemList);
            List<Item> items = itemList.getItems();
            RowListConstraints.ROW_LIST_CONSTRAINTS_SIMPLE.validateOrThrow(itemList);
            ModelUtils.validateAllNonBrowsableRowsHaveDistance(items);
            ModelUtils.validateAllRowsHaveOnlySmallImages(items);
            ModelUtils.validateNoRowsHaveBothMarkersAndImages(items);
            this.mItemList = itemList;
            return this;
        }

        public Builder setLoading(boolean z) {
            this.mIsLoading = z;
            return this;
        }

        @RequiresCarApi(5)
        public Builder setOnContentRefreshListener(OnContentRefreshListener onContentRefreshListener) {
            this.mOnContentRefreshDelegate = OnContentRefreshDelegateImpl.create(onContentRefreshListener);
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            CarText carTextCreate = CarText.create(charSequence);
            this.mTitle = carTextCreate;
            CarTextConstraints.TEXT_ONLY.validateOrThrow(carTextCreate);
            return this;
        }

        public Builder setTitle(CarText carText) {
            Objects.requireNonNull(carText);
            this.mTitle = carText;
            CarTextConstraints.TEXT_ONLY.validateOrThrow(carText);
            return this;
        }
    }

    private PlaceListMapTemplate() {
        this.mShowCurrentLocation = false;
        this.mIsLoading = false;
        this.mTitle = null;
        this.mItemList = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mAnchor = null;
        this.mOnContentRefreshDelegate = null;
    }
}
