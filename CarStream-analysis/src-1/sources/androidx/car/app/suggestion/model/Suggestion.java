package androidx.car.app.suggestion.model;

import android.app.PendingIntent;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.constraints.CarIconConstraints;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public final class Suggestion {
    private final PendingIntent mAction;
    private final CarIcon mIcon;
    private final String mIdentifier;
    private final CarText mSubtitle;
    private final CarText mTitle;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        PendingIntent mAction;
        CarIcon mIcon;
        String mId;
        CarText mSubtitle;
        CarText mTitle;

        public Suggestion build() {
            if (this.mId == null) {
                throw new IllegalStateException("Identifier is a required field");
            }
            CarText carText = this.mTitle;
            if (carText == null || carText.isEmpty()) {
                throw new IllegalStateException("Title is a required field");
            }
            if (this.mAction != null) {
                return new Suggestion(this);
            }
            throw new IllegalStateException("Action is a required field");
        }

        public Builder setAction(PendingIntent pendingIntent) {
            Objects.requireNonNull(pendingIntent);
            this.mAction = pendingIntent;
            return this;
        }

        public Builder setIcon(CarIcon carIcon) {
            CarIconConstraints carIconConstraints = CarIconConstraints.DEFAULT;
            Objects.requireNonNull(carIcon);
            carIconConstraints.validateOrThrow(carIcon);
            this.mIcon = carIcon;
            return this;
        }

        public Builder setIdentifier(String str) {
            Objects.requireNonNull(str);
            this.mId = str;
            return this;
        }

        public Builder setSubtitle(CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            this.mSubtitle = CarText.create(charSequence);
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            this.mTitle = CarText.create(charSequence);
            return this;
        }
    }

    public Suggestion(Builder builder) {
        String str = builder.mId;
        Objects.requireNonNull(str);
        this.mIdentifier = str;
        CarText carText = builder.mTitle;
        Objects.requireNonNull(carText);
        this.mTitle = carText;
        this.mSubtitle = builder.mSubtitle;
        this.mIcon = builder.mIcon;
        PendingIntent pendingIntent = builder.mAction;
        Objects.requireNonNull(pendingIntent);
        this.mAction = pendingIntent;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Suggestion)) {
            return false;
        }
        Suggestion suggestion = (Suggestion) obj;
        return Objects.equals(this.mIdentifier, suggestion.mIdentifier) && Objects.equals(this.mTitle, suggestion.mTitle) && Objects.equals(this.mSubtitle, suggestion.mSubtitle) && Objects.equals(this.mAction, suggestion.mAction) && Objects.equals(this.mIcon, suggestion.mIcon);
    }

    public PendingIntent getAction() {
        return this.mAction;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public String getIdentifier() {
        return this.mIdentifier;
    }

    public CarText getSubtitle() {
        return this.mSubtitle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mIdentifier, this.mTitle, this.mSubtitle, this.mIcon, this.mAction);
    }

    public String toString() {
        return "[id: " + this.mIdentifier + ", title: " + CarText.toShortString(this.mTitle) + ", subtitle: " + CarText.toShortString(this.mSubtitle) + ", pendingIntent: " + this.mAction + ", icon: " + this.mIcon + "]";
    }

    private Suggestion() {
        this.mIdentifier = "";
        this.mTitle = CarText.create("");
        this.mSubtitle = null;
        this.mIcon = null;
        this.mAction = null;
    }
}
