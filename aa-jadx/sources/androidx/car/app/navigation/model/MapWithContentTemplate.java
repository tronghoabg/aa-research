package androidx.car.app.navigation.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class MapWithContentTemplate implements defpackage.wi {
    private final androidx.car.app.model.ActionStrip mActionStrip;
    private final defpackage.wi mContentTemplate;
    private final androidx.car.app.navigation.model.MapController mMapController;

    private MapWithContentTemplate() {
        this.mMapController = null;
        this.mContentTemplate = new defpackage.xc();
        this.mActionStrip = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.navigation.model.MapWithContentTemplate)) {
            return false;
        }
        androidx.car.app.navigation.model.MapWithContentTemplate mapWithContentTemplate = (androidx.car.app.navigation.model.MapWithContentTemplate) obj;
        return j$.util.Objects.equals(this.mContentTemplate, mapWithContentTemplate.mContentTemplate) && j$.util.Objects.equals(this.mMapController, mapWithContentTemplate.mMapController) && j$.util.Objects.equals(this.mActionStrip, mapWithContentTemplate.mActionStrip);
    }

    public androidx.car.app.model.ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public defpackage.wi getContentTemplate() {
        return this.mContentTemplate;
    }

    public androidx.car.app.navigation.model.MapController getMapController() {
        return this.mMapController;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mMapController, this.mContentTemplate, this.mActionStrip);
    }

    public MapWithContentTemplate(defpackage.xd xdVar) {
        this.mMapController = xdVar.a;
        this.mContentTemplate = xdVar.b;
        this.mActionStrip = xdVar.c;
    }
}
