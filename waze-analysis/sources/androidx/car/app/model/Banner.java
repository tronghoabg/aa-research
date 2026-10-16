package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.constraints.ActionsConstraints;
import androidx.car.app.model.constraints.BackgroundConstraints;
import androidx.car.app.model.constraints.CarTextConstraints;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(9)
/* loaded from: classes2.dex */
public final class Banner implements Item {
    private static final int MAX_TRAILING_ELEMENTS = 2;
    private final Background mBackground;
    private final List<Action> mBelowActions;
    private final BannerElement mLeadingElement;
    private final OnClickDelegate mOnClickDelegate;
    private final CarText mSubtitle;
    private final CarText mTitle;
    private final List<BannerElement> mTrailingElements;

    Banner(Builder builder) {
        this.mTitle = builder.mTitle;
        this.mSubtitle = builder.mSubtitle;
        this.mOnClickDelegate = builder.mOnClickDelegate;
        this.mBackground = builder.mBackground;
        this.mLeadingElement = builder.mLeadingElement;
        this.mTrailingElements = DesugarCollections.unmodifiableList(builder.mTrailingElements);
        this.mBelowActions = DesugarCollections.unmodifiableList(builder.mBelowActions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Banner)) {
            return false;
        }
        Banner banner = (Banner) obj;
        if (Objects.equals(this.mTitle, banner.mTitle) && Objects.equals(this.mSubtitle, banner.mSubtitle)) {
            if (Objects.equals(Boolean.valueOf(this.mOnClickDelegate == null), Boolean.valueOf(banner.mOnClickDelegate == null)) && Objects.equals(this.mBackground, banner.mBackground) && Objects.equals(this.mLeadingElement, banner.mLeadingElement) && Objects.equals(this.mTrailingElements, banner.mTrailingElements) && Objects.equals(this.mBelowActions, banner.mBelowActions)) {
                return true;
            }
        }
        return false;
    }

    public Background getBackground() {
        return this.mBackground;
    }

    public List<Action> getBelowActions() {
        return this.mBelowActions;
    }

    public BannerElement getLeadingElement() {
        return this.mLeadingElement;
    }

    public OnClickDelegate getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public CarText getSubtitle() {
        return this.mSubtitle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public List<BannerElement> getTrailingElements() {
        return this.mTrailingElements;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mSubtitle, Boolean.valueOf(this.mOnClickDelegate == null), this.mBackground, this.mLeadingElement, this.mTrailingElements, this.mBelowActions);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[title: ");
        sb.append(CarText.toShortString(this.mTitle));
        sb.append(", subtitle: ");
        sb.append(CarText.toShortString(this.mSubtitle));
        sb.append(", has click listener: ");
        sb.append(this.mOnClickDelegate != null);
        sb.append(", background color: ");
        sb.append(this.mBackground);
        sb.append(", leading element: ");
        sb.append(this.mLeadingElement);
        sb.append(", trailing elements: ");
        sb.append(this.mTrailingElements);
        sb.append(", below actions: ");
        sb.append(this.mBelowActions);
        sb.append("]");
        return sb.toString();
    }

    /* compiled from: WazeSource */
    public final class Builder {
        Background mBackground;
        BannerElement mLeadingElement;
        OnClickDelegate mOnClickDelegate;
        CarText mSubtitle;
        CarText mTitle;
        List<BannerElement> mTrailingElements = new ArrayList();
        List<Action> mBelowActions = new ArrayList();

        private void validateNewTrailingElement(BannerElement bannerElement) {
            ArrayList arrayList = new ArrayList(this.mTrailingElements);
            arrayList.add(bannerElement);
            if (arrayList.size() > 2) {
                throw new IllegalStateException("Total number of trailing elements in a banner must not exceed 2, found " + this.mTrailingElements.size());
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                BannerElement bannerElement2 = (BannerElement) arrayList.get(i2);
                if (bannerElement2.getType() == 1) {
                    arrayList2.add((Action) Objects.requireNonNull(bannerElement2.getAction()));
                }
            }
            ActionsConstraints.ACTION_CONSTRAINTS_BANNER_TRAILING.validateOrThrow(arrayList2);
        }

        public Builder addBelowAction(Action action) {
            ArrayList arrayList = new ArrayList(this.mBelowActions);
            arrayList.add((Action) Objects.requireNonNull(action));
            ActionsConstraints.ACTION_CONSTRAINTS_BANNER_BELOW.validateOrThrow(arrayList);
            this.mBelowActions.add((Action) Objects.requireNonNull(action));
            return this;
        }

        public Builder addTrailingAction(Action action) {
            BannerElement bannerElement = new BannerElement(1, (Action) Objects.requireNonNull(action), null);
            validateNewTrailingElement(bannerElement);
            this.mTrailingElements.add(bannerElement);
            return this;
        }

        public Builder addTrailingIcon(CarIcon carIcon) {
            BannerElement bannerElement = new BannerElement(2, null, (CarIcon) Objects.requireNonNull(carIcon));
            validateNewTrailingElement(bannerElement);
            this.mTrailingElements.add(bannerElement);
            return this;
        }

        public Builder addTrailingImage(CarIcon carIcon) {
            BannerElement bannerElement = new BannerElement(3, null, (CarIcon) Objects.requireNonNull(carIcon));
            validateNewTrailingElement(bannerElement);
            this.mTrailingElements.add(bannerElement);
            return this;
        }

        public Banner build() {
            if (CarText.isNullOrEmpty(this.mTitle)) {
                throw new IllegalArgumentException("A title must be provided");
            }
            return new Banner(this);
        }

        public Builder setBackground(Background background) {
            BackgroundConstraints.COLOR_ONLY.validateOrThrow((Background) Objects.requireNonNull(background));
            this.mBackground = background;
            return this;
        }

        public Builder setLeadingIcon(CarIcon carIcon) {
            this.mLeadingElement = new BannerElement(2, null, (CarIcon) Objects.requireNonNull(carIcon));
            return this;
        }

        public Builder setLeadingImage(CarIcon carIcon) {
            this.mLeadingElement = new BannerElement(3, null, (CarIcon) Objects.requireNonNull(carIcon));
            return this;
        }

        public Builder setOnClickListener(OnClickListener onClickListener) {
            this.mOnClickDelegate = OnClickDelegateImpl.create((OnClickListener) Objects.requireNonNull(onClickListener));
            return this;
        }

        public Builder setSubtitle(CarText carText) {
            CarTextConstraints.TEXT_WITH_COLORS_AND_ICON.validateOrThrow((CarText) Objects.requireNonNull(carText));
            this.mSubtitle = carText;
            return this;
        }

        public Builder setTitle(CarText carText) {
            CarTextConstraints.TEXT_AND_ICON.validateOrThrow((CarText) Objects.requireNonNull(carText));
            this.mTitle = carText;
            return this;
        }

        public Builder setSubtitle(CharSequence charSequence) {
            setSubtitle(CarText.create((CharSequence) Objects.requireNonNull(charSequence)));
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            setTitle(CarText.create((CharSequence) Objects.requireNonNull(charSequence)));
            return this;
        }
    }

    private Banner() {
        this.mTitle = null;
        this.mSubtitle = null;
        this.mOnClickDelegate = null;
        this.mBackground = null;
        this.mLeadingElement = null;
        this.mTrailingElements = Collections.EMPTY_LIST;
        this.mBelowActions = Collections.EMPTY_LIST;
    }
}
