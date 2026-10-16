package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.Header;
import androidx.car.app.model.constraints.ActionsConstraints;
import androidx.car.app.model.constraints.CarTextConstraints;
import androidx.car.app.model.constraints.RowListConstraints;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public final class PaneTemplate implements Template {

    @Deprecated
    private final ActionStrip mActionStrip;

    @RequiresCarApi(7)
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final Pane mPane;

    @Deprecated
    private final CarText mTitle;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        ActionStrip mActionStrip;
        Header mHeader;
        Action mHeaderAction;
        Pane mPane;
        CarText mTitle;

        public Builder(Pane pane) {
            Objects.requireNonNull(pane);
            this.mPane = pane;
        }

        public PaneTemplate build() {
            RowListConstraints.ROW_LIST_CONSTRAINTS_PANE.validateOrThrow(this.mPane);
            ActionsConstraints.ACTIONS_CONSTRAINTS_BODY_WITH_PRIMARY_ACTION.validateOrThrow(this.mPane.getActions());
            return new PaneTemplate(this);
        }

        @Deprecated
        public Builder setActionStrip(ActionStrip actionStrip) {
            ActionsConstraints actionsConstraints = ActionsConstraints.ACTIONS_CONSTRAINTS_SIMPLE;
            Objects.requireNonNull(actionStrip);
            actionsConstraints.validateOrThrow(actionStrip.getActions());
            this.mActionStrip = actionStrip;
            return this;
        }

        @RequiresCarApi(7)
        public Builder setHeader(Header header) {
            if (header.getStartHeaderAction() != null) {
                this.mHeaderAction = header.getStartHeaderAction();
            }
            if (header.getTitle() != null) {
                this.mTitle = header.getTitle();
            }
            if (!header.getEndHeaderActions().isEmpty()) {
                ActionStrip.Builder builder = new ActionStrip.Builder();
                Iterator<Action> it = header.getEndHeaderActions().iterator();
                while (it.hasNext()) {
                    builder.addAction(it.next());
                }
                this.mActionStrip = builder.build();
            }
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

        @Deprecated
        public Builder setTitle(CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            CarText carTextCreate = CarText.create(charSequence);
            this.mTitle = carTextCreate;
            CarTextConstraints.TEXT_AND_ICON.validateOrThrow(carTextCreate);
            return this;
        }
    }

    public PaneTemplate(Builder builder) {
        this.mTitle = builder.mTitle;
        this.mPane = builder.mPane;
        this.mHeaderAction = builder.mHeaderAction;
        this.mActionStrip = builder.mActionStrip;
        this.mHeader = builder.mHeader;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaneTemplate)) {
            return false;
        }
        PaneTemplate paneTemplate = (PaneTemplate) obj;
        return Objects.equals(this.mTitle, paneTemplate.mTitle) && Objects.equals(this.mPane, paneTemplate.mPane) && Objects.equals(this.mHeaderAction, paneTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, paneTemplate.mActionStrip) && Objects.equals(this.mHeader, paneTemplate.mHeader);
    }

    @Deprecated
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Header getHeader() {
        Header header = this.mHeader;
        if (header != null) {
            return header;
        }
        if (this.mTitle == null && this.mHeaderAction == null && this.mActionStrip == null) {
            return null;
        }
        Header.Builder builder = new Header.Builder();
        CarText carText = this.mTitle;
        if (carText != null) {
            builder.setTitle(carText);
        }
        Action action = this.mHeaderAction;
        if (action != null) {
            builder.setStartHeaderAction(action);
        }
        ActionStrip actionStrip = this.mActionStrip;
        if (actionStrip != null) {
            Iterator<Action> it = actionStrip.getActions().iterator();
            while (it.hasNext()) {
                builder.addEndHeaderAction(it.next());
            }
        }
        return builder.build();
    }

    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public Pane getPane() {
        Pane pane = this.mPane;
        Objects.requireNonNull(pane);
        return pane;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mPane, this.mHeaderAction, this.mActionStrip, this.mHeader);
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
    }
}
