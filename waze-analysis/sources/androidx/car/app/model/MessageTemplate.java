package androidx.car.app.model;

import android.util.Log;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.Header;
import androidx.car.app.model.constraints.ActionsConstraints;
import androidx.car.app.model.constraints.CarIconConstraints;
import androidx.car.app.model.constraints.CarTextConstraints;
import androidx.car.app.utils.CollectionUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class MessageTemplate implements Template {
    private final List<Action> mActionList;

    @Deprecated
    private final ActionStrip mActionStrip;
    private final CarText mDebugMessage;

    @RequiresCarApi(7)
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final CarIcon mIcon;
    private final boolean mIsLoading;
    private final CarText mMessage;

    @Deprecated
    private final CarText mTitle;

    MessageTemplate(Builder builder) {
        this.mIsLoading = builder.mIsLoading;
        this.mTitle = builder.mTitle;
        this.mMessage = builder.mMessage;
        this.mDebugMessage = builder.mDebugMessage;
        this.mIcon = builder.mIcon;
        this.mHeaderAction = builder.mHeaderAction;
        this.mActionStrip = builder.mActionStrip;
        this.mActionList = CollectionUtils.unmodifiableCopy(builder.mActionList);
        this.mHeader = builder.mHeader;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageTemplate)) {
            return false;
        }
        MessageTemplate messageTemplate = (MessageTemplate) obj;
        return this.mIsLoading == messageTemplate.mIsLoading && Objects.equals(this.mTitle, messageTemplate.mTitle) && Objects.equals(this.mMessage, messageTemplate.mMessage) && Objects.equals(this.mDebugMessage, messageTemplate.mDebugMessage) && Objects.equals(this.mHeaderAction, messageTemplate.mHeaderAction) && Objects.equals(this.mActionList, messageTemplate.mActionList) && Objects.equals(this.mIcon, messageTemplate.mIcon) && Objects.equals(this.mActionStrip, messageTemplate.mActionStrip) && Objects.equals(this.mHeader, messageTemplate.mHeader);
    }

    @RequiresCarApi(2)
    @Deprecated
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public List<Action> getActions() {
        return CollectionUtils.emptyIfNull(this.mActionList);
    }

    public CarText getDebugMessage() {
        return this.mDebugMessage;
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

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public CarText getMessage() {
        return (CarText) Objects.requireNonNull(this.mMessage);
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mMessage, this.mDebugMessage, this.mHeaderAction, this.mActionList, this.mIcon, this.mActionStrip, this.mHeader);
    }

    @RequiresCarApi(2)
    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "MessageTemplate";
    }

    /* compiled from: WazeSource */
    public final class Builder {
        List<Action> mActionList = new ArrayList();
        ActionStrip mActionStrip;
        Throwable mDebugCause;
        CarText mDebugMessage;
        String mDebugString;
        Header mHeader;
        Action mHeaderAction;
        CarIcon mIcon;
        boolean mIsLoading;
        CarText mMessage;
        CarText mTitle;

        public Builder(CharSequence charSequence) {
            this.mMessage = CarText.create((CharSequence) Objects.requireNonNull(charSequence));
        }

        public Builder addAction(Action action) {
            this.mActionList.add((Action) Objects.requireNonNull(action));
            ActionsConstraints.ACTIONS_CONSTRAINTS_BODY_WITH_PRIMARY_ACTION.validateOrThrow(this.mActionList);
            return this;
        }

        public MessageTemplate build() {
            if (this.mIsLoading && this.mIcon != null) {
                throw new IllegalStateException("Template in a loading state can not have an icon");
            }
            if (this.mMessage.isEmpty()) {
                throw new IllegalStateException("Message cannot be empty");
            }
            String strConcat = this.mDebugString;
            if (strConcat == null) {
                strConcat = "";
            }
            if (!strConcat.isEmpty() && this.mDebugCause != null) {
                strConcat = strConcat.concat("\n");
            }
            String strConcat2 = strConcat.concat(String.valueOf(Log.getStackTraceString(this.mDebugCause)));
            if (!strConcat2.isEmpty()) {
                this.mDebugMessage = CarText.create(strConcat2);
            }
            return new MessageTemplate(this);
        }

        @RequiresCarApi(2)
        @Deprecated
        public Builder setActionStrip(ActionStrip actionStrip) {
            ActionsConstraints.ACTIONS_CONSTRAINTS_SIMPLE.validateOrThrow(((ActionStrip) Objects.requireNonNull(actionStrip)).getActions());
            this.mActionStrip = actionStrip;
            return this;
        }

        public Builder setDebugMessage(String str) {
            this.mDebugString = (String) Objects.requireNonNull(str);
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
            ActionsConstraints.ACTIONS_CONSTRAINTS_HEADER.validateOrThrow(Collections.singletonList((Action) Objects.requireNonNull(action)));
            this.mHeaderAction = action;
            return this;
        }

        public Builder setIcon(CarIcon carIcon) {
            CarIconConstraints.DEFAULT.validateOrThrow((CarIcon) Objects.requireNonNull(carIcon));
            this.mIcon = carIcon;
            return this;
        }

        @RequiresCarApi(2)
        public Builder setLoading(boolean z) {
            this.mIsLoading = z;
            return this;
        }

        @Deprecated
        public Builder setTitle(CharSequence charSequence) {
            this.mTitle = CarText.create((CharSequence) Objects.requireNonNull(charSequence));
            CarTextConstraints.TEXT_ONLY.validateOrThrow(this.mTitle);
            return this;
        }

        public Builder setDebugMessage(Throwable th) {
            this.mDebugCause = (Throwable) Objects.requireNonNull(th);
            return this;
        }

        public Builder(CarText carText) {
            this.mMessage = (CarText) Objects.requireNonNull(carText);
        }
    }

    private MessageTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mMessage = null;
        this.mDebugMessage = null;
        this.mIcon = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mActionList = Collections.EMPTY_LIST;
        this.mHeader = null;
    }
}
