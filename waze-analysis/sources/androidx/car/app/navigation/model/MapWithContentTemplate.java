package androidx.car.app.navigation.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.Template;
import androidx.car.app.model.constraints.ActionsConstraints;
import androidx.car.app.navigation.model.constraints.ContentTemplateConstraints;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(7)
/* loaded from: classes2.dex */
public final class MapWithContentTemplate implements Template {
    private final ActionStrip mActionStrip;
    private final Template mContentTemplate;
    private final MapController mMapController;

    /* compiled from: WazeSource */
    public final class Builder {
        ActionStrip mActionStrip;
        Template mContentTemplate = new Template() { // from class: androidx.car.app.navigation.model.MapWithContentTemplate.Builder.1
        };
        MapController mMapController;

        public MapWithContentTemplate build() {
            ContentTemplateConstraints.MAP_WITH_CONTENT_TEMPLATE_CONSTRAINTS_API_8.validateOrThrow(this.mContentTemplate);
            return new MapWithContentTemplate(this);
        }

        public Builder setActionStrip(ActionStrip actionStrip) {
            ActionsConstraints.ACTIONS_CONSTRAINTS_NAVIGATION.validateOrThrow(((ActionStrip) Objects.requireNonNull(actionStrip)).getActions());
            this.mActionStrip = actionStrip;
            return this;
        }

        public Builder setContentTemplate(Template template) {
            this.mContentTemplate = (Template) Objects.requireNonNull(template);
            return this;
        }

        public Builder setMapController(MapController mapController) {
            this.mMapController = (MapController) Objects.requireNonNull(mapController);
            return this;
        }
    }

    private MapWithContentTemplate() {
        this.mMapController = null;
        this.mContentTemplate = new Template() { // from class: androidx.car.app.navigation.model.MapWithContentTemplate.1
        };
        this.mActionStrip = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapWithContentTemplate)) {
            return false;
        }
        MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
        return Objects.equals(this.mContentTemplate, mapWithContentTemplate.mContentTemplate) && Objects.equals(this.mMapController, mapWithContentTemplate.mMapController) && Objects.equals(this.mActionStrip, mapWithContentTemplate.mActionStrip);
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Template getContentTemplate() {
        return this.mContentTemplate;
    }

    public MapController getMapController() {
        return this.mMapController;
    }

    public int hashCode() {
        return Objects.hash(this.mMapController, this.mContentTemplate, this.mActionStrip);
    }

    MapWithContentTemplate(Builder builder) {
        this.mMapController = builder.mMapController;
        this.mContentTemplate = builder.mContentTemplate;
        this.mActionStrip = builder.mActionStrip;
    }
}
