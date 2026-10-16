package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.constraints.CarIconConstraints;
import androidx.car.app.model.constraints.CarTextConstraints;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(6)
/* loaded from: classes2.dex */
public final class Tab implements Content {
    private static final String EMPTY_TAB_CONTENT_ID = "EMPTY_TAB_CONTENT_ID";
    private final String mContentId;
    private final CarIcon mIcon;
    private final CarText mTitle;

    /* compiled from: WazeSource */
    public final class Builder {
        String mContentId;
        CarIcon mIcon;
        CarText mTitle;

        public Builder(Tab tab) {
            Objects.requireNonNull(tab);
            this.mContentId = tab.getContentId();
            this.mIcon = tab.getIcon();
            this.mTitle = tab.getTitle();
        }

        public Tab build() {
            if (this.mTitle == null) {
                throw new IllegalStateException("A title must be set for the tab");
            }
            if (this.mIcon == null) {
                throw new IllegalStateException("A icon must be set for the tab");
            }
            if (this.mContentId != null) {
                return new Tab(this);
            }
            throw new IllegalStateException("A content ID must be set for the tab");
        }

        public Builder setContentId(String str) {
            if (((String) Objects.requireNonNull(str)).isEmpty()) {
                throw new IllegalArgumentException("The content ID cannot be null or empty");
            }
            this.mContentId = str;
            return this;
        }

        public Builder setIcon(CarIcon carIcon) {
            CarIconConstraints.DEFAULT.validateOrThrow((CarIcon) Objects.requireNonNull(carIcon));
            this.mIcon = carIcon;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            CarText carTextCreate = CarText.create((CharSequence) Objects.requireNonNull(charSequence));
            if (carTextCreate.isEmpty()) {
                throw new IllegalArgumentException("The title cannot be null or empty");
            }
            CarTextConstraints.TEXT_AND_ICON.validateOrThrow(carTextCreate);
            this.mTitle = carTextCreate;
            return this;
        }
    }

    Tab(Builder builder) {
        this.mTitle = builder.mTitle;
        this.mIcon = builder.mIcon;
        String str = builder.mContentId;
        if (str != null) {
            this.mContentId = str;
        } else {
            this.mContentId = EMPTY_TAB_CONTENT_ID;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tab)) {
            return false;
        }
        Tab tab = (Tab) obj;
        return Objects.equals(this.mTitle, tab.mTitle) && Objects.equals(this.mContentId, tab.mContentId) && Objects.equals(this.mIcon, tab.mIcon);
    }

    @Override // androidx.car.app.model.Content
    public String getContentId() {
        return (String) Objects.requireNonNull(this.mContentId);
    }

    public CarIcon getIcon() {
        return (CarIcon) Objects.requireNonNull(this.mIcon);
    }

    public CarText getTitle() {
        return (CarText) Objects.requireNonNull(this.mTitle);
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mContentId, this.mIcon);
    }

    public String toString() {
        return "[title: " + CarText.toShortString(this.mTitle) + ", contentId: " + this.mContentId + ", icon: " + this.mIcon + "]";
    }

    private Tab() {
        this.mTitle = null;
        this.mContentId = EMPTY_TAB_CONTENT_ID;
        this.mIcon = null;
    }
}
