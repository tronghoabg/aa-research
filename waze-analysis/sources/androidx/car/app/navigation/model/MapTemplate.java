package androidx.car.app.navigation.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.Header;
import androidx.car.app.model.Item;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ModelUtils;
import androidx.car.app.model.Pane;
import androidx.car.app.model.Template;
import androidx.car.app.model.constraints.ActionsConstraints;
import androidx.car.app.model.constraints.RowListConstraints;
import j$.util.Objects;
import java.util.List;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(5)
@Deprecated
/* loaded from: classes2.dex */
public final class MapTemplate implements Template {
    private final ActionStrip mActionStrip;
    private final Header mHeader;
    private final ItemList mItemList;
    private final MapController mMapController;
    private final Pane mPane;

    /* compiled from: WazeSource */
    public final class Builder {
        ActionStrip mActionStrip;
        Header mHeader;
        ItemList mItemList;
        MapController mMapController;
        Pane mPane;

        public MapTemplate build() {
            if ((this.mPane == null) != (this.mItemList == null)) {
                return new MapTemplate(this);
            }
            throw new IllegalStateException("Either Pane or Item List must be set but not both");
        }

        public Builder setActionStrip(ActionStrip actionStrip) {
            ActionsConstraints.ACTIONS_CONSTRAINTS_NAVIGATION.validateOrThrow(((ActionStrip) Objects.requireNonNull(actionStrip)).getActions());
            this.mActionStrip = actionStrip;
            return this;
        }

        public Builder setHeader(Header header) {
            this.mHeader = (Header) Objects.requireNonNull(header);
            return this;
        }

        public Builder setItemList(ItemList itemList) {
            List<Item> items = ((ItemList) Objects.requireNonNull(itemList)).getItems();
            RowListConstraints.MAP_ROW_LIST_CONSTRAINTS_ALLOW_SELECTABLE.validateOrThrow(itemList);
            ModelUtils.validateAllRowsHaveOnlySmallImages(items);
            ModelUtils.validateNoRowsHaveBothMarkersAndImages(items);
            this.mItemList = itemList;
            return this;
        }

        public Builder setMapController(MapController mapController) {
            this.mMapController = (MapController) Objects.requireNonNull(mapController);
            return this;
        }

        public Builder setPane(Pane pane) {
            List<Action> actions = ((Pane) Objects.requireNonNull(pane)).getActions();
            RowListConstraints.ROW_LIST_CONSTRAINTS_PANE.validateOrThrow(pane);
            ActionsConstraints.ACTIONS_CONSTRAINTS_BODY_WITH_PRIMARY_ACTION.validateOrThrow(actions);
            this.mPane = pane;
            return this;
        }
    }

    MapTemplate(Builder builder) {
        this.mMapController = builder.mMapController;
        this.mPane = builder.mPane;
        this.mItemList = builder.mItemList;
        this.mHeader = builder.mHeader;
        this.mActionStrip = builder.mActionStrip;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapTemplate)) {
            return false;
        }
        MapTemplate mapTemplate = (MapTemplate) obj;
        return Objects.equals(this.mPane, mapTemplate.mPane) && Objects.equals(this.mItemList, mapTemplate.mItemList) && Objects.equals(this.mHeader, mapTemplate.mHeader) && Objects.equals(this.mMapController, mapTemplate.mMapController) && Objects.equals(this.mActionStrip, mapTemplate.mActionStrip);
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public ItemList getItemList() {
        return this.mItemList;
    }

    public MapController getMapController() {
        return this.mMapController;
    }

    public Pane getPane() {
        return this.mPane;
    }

    public int hashCode() {
        return Objects.hash(this.mMapController, this.mPane, this.mItemList, this.mHeader, this.mActionStrip);
    }

    private MapTemplate() {
        this.mMapController = null;
        this.mPane = null;
        this.mItemList = null;
        this.mHeader = null;
        this.mActionStrip = null;
    }
}
