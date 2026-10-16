package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.constraints.ActionsConstraints;
import androidx.car.app.model.constraints.BackgroundConstraints;
import androidx.car.app.model.constraints.CarTextConstraints;
import androidx.car.app.utils.CollectionUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes2.dex */
public final class Header {
    private final Background mBackground;
    private final List<Action> mEndHeaderActions;
    private final Action mStartHeaderAction;
    private final CarIcon mStartHeaderImage;
    private final CarText mSubtitle;
    private final CarText mTitle;

    Header(Builder builder) {
        this.mTitle = builder.mTitle;
        this.mSubtitle = builder.mSubtitle;
        this.mStartHeaderAction = builder.mStartHeaderAction;
        this.mEndHeaderActions = CollectionUtils.unmodifiableCopy(builder.mEndHeaderActions);
        this.mBackground = builder.mBackground;
        this.mStartHeaderImage = builder.mStartHeaderImage;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return Objects.equals(this.mTitle, header.mTitle) && Objects.equals(this.mSubtitle, header.mSubtitle) && Objects.equals(this.mEndHeaderActions, header.mEndHeaderActions) && Objects.equals(this.mStartHeaderAction, header.mStartHeaderAction) && Objects.equals(this.mBackground, header.mBackground) && Objects.equals(this.mStartHeaderImage, header.mStartHeaderImage);
    }

    @RequiresCarApi(9)
    public Background getBackground() {
        return this.mBackground;
    }

    public List<Action> getEndHeaderActions() {
        return this.mEndHeaderActions;
    }

    public Action getStartHeaderAction() {
        return this.mStartHeaderAction;
    }

    @RequiresCarApi(9)
    public CarIcon getStartHeaderImage() {
        return this.mStartHeaderImage;
    }

    @RequiresCarApi(9)
    public CarText getSubtitle() {
        return this.mSubtitle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mSubtitle, this.mEndHeaderActions, this.mStartHeaderAction, this.mBackground, this.mStartHeaderImage);
    }

    public String toString() {
        return "Header: " + this.mTitle + ", Subtitle: " + this.mSubtitle + ", Background: " + this.mBackground + ", StartHeaderImage: " + this.mStartHeaderImage;
    }

    /* compiled from: WazeSource */
    public final class Builder {
        Background mBackground;
        final List<Action> mEndHeaderActions = new ArrayList();
        Action mStartHeaderAction;
        CarIcon mStartHeaderImage;
        CarText mSubtitle;
        CarText mTitle;

        public Builder addEndHeaderAction(Action action) {
            this.mEndHeaderActions.add((Action) Objects.requireNonNull(action));
            return this;
        }

        public Header build() {
            if (CarText.isNullOrEmpty(this.mTitle) && this.mStartHeaderAction == null) {
                throw new IllegalStateException("Either the title or start header action must be set");
            }
            return new Header(this);
        }

        @RequiresCarApi(9)
        public Builder setBackground(Background background) {
            BackgroundConstraints.UNCONSTRAINED.validateOrThrow(background);
            this.mBackground = (Background) Objects.requireNonNull(background);
            return this;
        }

        public Builder setStartHeaderAction(Action action) {
            ActionsConstraints.ACTIONS_CONSTRAINTS_HEADER.validateOrThrow(Collections.singletonList((Action) Objects.requireNonNull(action)));
            this.mStartHeaderAction = action;
            return this;
        }

        @RequiresCarApi(9)
        public Builder setStartHeaderImage(CarIcon carIcon) {
            Objects.requireNonNull(carIcon);
            if (carIcon.getType() != 1) {
                throw new IllegalArgumentException("Only custom images are supported for startHeaderImage");
            }
            this.mStartHeaderImage = carIcon;
            return this;
        }

        @RequiresCarApi(9)
        public Builder setSubtitle(CarText carText) {
            this.mSubtitle = (CarText) Objects.requireNonNull(carText);
            CarTextConstraints.TEXT_WITH_COLORS_AND_ICON.validateOrThrow(this.mSubtitle);
            return this;
        }

        public Builder setTitle(CarText carText) {
            this.mTitle = (CarText) Objects.requireNonNull(carText);
            CarTextConstraints.TEXT_ONLY.validateOrThrow(this.mTitle);
            return this;
        }

        @RequiresCarApi(9)
        public Builder setSubtitle(CharSequence charSequence) {
            setSubtitle(CarText.create(charSequence));
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            setTitle(CarText.create(charSequence));
            return this;
        }
    }

    private Header() {
        this.mTitle = null;
        this.mSubtitle = null;
        this.mStartHeaderAction = null;
        this.mEndHeaderActions = new ArrayList();
        this.mBackground = null;
        this.mStartHeaderImage = null;
    }
}
