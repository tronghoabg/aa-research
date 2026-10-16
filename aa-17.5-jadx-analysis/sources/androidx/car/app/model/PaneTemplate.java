package androidx.car.app.model;

import defpackage.rb;
import defpackage.ua;
import defpackage.vb;
import defpackage.wb;
import j$.util.Objects;
import java.util.Iterator;

@rb
/* loaded from: classes2.dex */
public final class PaneTemplate implements wb {

    @Deprecated
    private final ActionStrip mActionStrip;
    private final Banner mBanner;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final Pane mPane;

    @Deprecated
    private final CarText mTitle;

    public PaneTemplate(vb vbVar) {
        this.mTitle = vbVar.a;
        this.mPane = vbVar.b;
        this.mHeaderAction = vbVar.c;
        this.mActionStrip = vbVar.d;
        this.mHeader = vbVar.e;
        Banner banner = vbVar.f;
        this.mBanner = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaneTemplate)) {
            return false;
        }
        PaneTemplate paneTemplate = (PaneTemplate) obj;
        return Objects.equals(this.mTitle, paneTemplate.mTitle) && Objects.equals(this.mPane, paneTemplate.mPane) && Objects.equals(this.mHeaderAction, paneTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, paneTemplate.mActionStrip) && Objects.equals(this.mHeader, paneTemplate.mHeader) && Objects.equals(this.mBanner, paneTemplate.mBanner);
    }

    @Deprecated
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Banner getBanner() {
        return this.mBanner;
    }

    public Header getHeader() {
        Header header = this.mHeader;
        if (header != null) {
            return header;
        }
        if (this.mTitle == null && this.mHeaderAction == null && this.mActionStrip == null) {
            return null;
        }
        ua uaVar = new ua();
        CarText carText = this.mTitle;
        if (carText != null) {
            uaVar.d(carText);
        }
        Action action = this.mHeaderAction;
        if (action != null) {
            uaVar.c(action);
        }
        ActionStrip actionStrip = this.mActionStrip;
        if (actionStrip != null) {
            Iterator<Action> it = actionStrip.getActions().iterator();
            while (it.hasNext()) {
                uaVar.b(it.next());
            }
        }
        return uaVar.a();
    }

    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public Pane getPane() {
        Pane pane = this.mPane;
        pane.getClass();
        return pane;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mPane, this.mHeaderAction, this.mActionStrip, this.mHeader, this.mBanner);
    }

    public String toString() {
        return "PaneTemplate";
    }

    private PaneTemplate() {
        this.mTitle = null;
        this.mPane = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mHeader = null;
        this.mBanner = null;
    }
}
