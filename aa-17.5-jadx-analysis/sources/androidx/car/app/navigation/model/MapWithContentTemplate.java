package androidx.car.app.navigation.model;

import androidx.car.app.model.ActionStrip;
import defpackage.rb;
import defpackage.wb;
import defpackage.wv;
import defpackage.ww;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public final class MapWithContentTemplate implements wb {
    private final ActionStrip mActionStrip;
    private final wb mContentTemplate;
    private final MapController mMapController;

    private MapWithContentTemplate() {
        this.mMapController = null;
        this.mContentTemplate = new wv();
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

    public wb getContentTemplate() {
        return this.mContentTemplate;
    }

    public MapController getMapController() {
        return this.mMapController;
    }

    public int hashCode() {
        return Objects.hash(this.mMapController, this.mContentTemplate, this.mActionStrip);
    }

    public MapWithContentTemplate(ww wwVar) {
        this.mMapController = wwVar.a;
        this.mContentTemplate = wwVar.b;
        this.mActionStrip = wwVar.c;
    }
}
