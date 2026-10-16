package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.constraints.CarIconConstraints;
import androidx.car.app.model.constraints.CarTextConstraints;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(9)
/* loaded from: classes2.dex */
public final class SectionHeader {
    public static final int IMAGE_TYPE_LARGE = 2;
    public static final int IMAGE_TYPE_SMALL = 1;
    private final CarIcon mEndIcon;
    private final OnClickDelegate mOnClickDelegate;
    private final CarIcon mStartIcon;
    private final int mStartIconType;
    private final CarText mSubtitle;
    private final CarText mTitle;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface SectionHeaderImageType {
    }

    SectionHeader(Builder builder) {
        this.mTitle = (CarText) Objects.requireNonNull(builder.mTitle);
        this.mSubtitle = builder.mSubtitle;
        this.mStartIcon = builder.mStartIcon;
        this.mStartIconType = builder.mStartIconType;
        this.mEndIcon = builder.mEndIcon;
        this.mOnClickDelegate = builder.mOnClickDelegate;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionHeader)) {
            return false;
        }
        SectionHeader sectionHeader = (SectionHeader) obj;
        if (Objects.equals(this.mTitle, sectionHeader.mTitle) && Objects.equals(this.mSubtitle, sectionHeader.mSubtitle) && Objects.equals(this.mStartIcon, sectionHeader.mStartIcon) && this.mStartIconType == sectionHeader.mStartIconType && Objects.equals(this.mEndIcon, sectionHeader.mEndIcon)) {
            if ((this.mOnClickDelegate == null) == (sectionHeader.mOnClickDelegate == null)) {
                return true;
            }
        }
        return false;
    }

    public CarIcon getEndIcon() {
        return this.mEndIcon;
    }

    public OnClickDelegate getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public CarIcon getStartIcon() {
        return this.mStartIcon;
    }

    public int getStartIconType() {
        return this.mStartIconType;
    }

    public CarText getSubtitle() {
        return this.mSubtitle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mSubtitle, this.mStartIcon, Integer.valueOf(this.mStartIconType), this.mEndIcon, Boolean.valueOf(this.mOnClickDelegate == null));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SectionHeader { title: ");
        sb.append(this.mTitle);
        sb.append(", subtitle: ");
        sb.append(this.mSubtitle);
        sb.append(", startIcon: ");
        sb.append(this.mStartIcon);
        sb.append(", startIconType: ");
        sb.append(this.mStartIconType);
        sb.append(", endIcon: ");
        sb.append(this.mEndIcon);
        sb.append(", hasClickListener: ");
        sb.append(this.mOnClickDelegate != null);
        sb.append(" }");
        return sb.toString();
    }

    /* compiled from: WazeSource */
    public final class Builder {
        CarIcon mEndIcon;
        OnClickDelegate mOnClickDelegate;
        CarIcon mStartIcon;
        int mStartIconType;
        CarText mSubtitle;
        CarText mTitle;

        public Builder(CarText carText) {
            this.mStartIconType = 1;
            Objects.requireNonNull(carText);
            if (carText.isEmpty()) {
                throw new IllegalArgumentException("The title cannot be empty");
            }
            CarTextConstraints.TEXT_ONLY.validateOrThrow(carText);
            this.mTitle = carText;
        }

        public SectionHeader build() {
            return new SectionHeader(this);
        }

        public Builder clearSubtitle() {
            this.mSubtitle = null;
            return this;
        }

        public Builder setEndIcon(CarIcon carIcon) {
            Objects.requireNonNull(carIcon);
            if (carIcon.getType() != 1) {
                throw new IllegalArgumentException("Only custom icon types are supported");
            }
            CarIconConstraints.DEFAULT.validateOrThrow(carIcon);
            this.mEndIcon = carIcon;
            return this;
        }

        public Builder setOnClickListener(OnClickListener onClickListener) {
            this.mOnClickDelegate = OnClickDelegateImpl.create(onClickListener);
            return this;
        }

        public Builder setStartIcon(CarIcon carIcon, int i2) {
            Objects.requireNonNull(carIcon);
            if (carIcon.getType() != 1) {
                throw new IllegalArgumentException("Only custom icon types are supported");
            }
            CarIconConstraints.DEFAULT.validateOrThrow(carIcon);
            this.mStartIcon = carIcon;
            this.mStartIconType = i2;
            return this;
        }

        public Builder setSubtitle(CarText carText) {
            CarTextConstraints.TEXT_WITH_COLORS.validateOrThrow((CarText) Objects.requireNonNull(carText));
            this.mSubtitle = carText;
            return this;
        }

        public Builder setSubtitle(CharSequence charSequence) {
            this.mSubtitle = CarText.create(charSequence);
            CarTextConstraints.TEXT_WITH_COLORS.validateOrThrow(this.mSubtitle);
            return this;
        }

        public Builder setStartIcon(CarIcon carIcon) {
            setStartIcon(carIcon, 1);
            return this;
        }

        public Builder(CharSequence charSequence) {
            this(CarText.create((CharSequence) Objects.requireNonNull(charSequence)));
        }
    }

    private SectionHeader() {
        this.mTitle = CarText.create("");
        this.mSubtitle = null;
        this.mStartIcon = null;
        this.mStartIconType = 1;
        this.mEndIcon = null;
        this.mOnClickDelegate = null;
    }
}
