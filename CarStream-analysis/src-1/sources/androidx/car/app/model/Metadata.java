package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public final class Metadata {
    public static final Metadata EMPTY_METADATA = new Builder().build();
    private final Place mPlace;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        Place mPlace;

        public Builder() {
        }

        public Metadata build() {
            return new Metadata(this);
        }

        public Builder setPlace(Place place) {
            Objects.requireNonNull(place);
            this.mPlace = place;
            return this;
        }

        public Builder(Metadata metadata) {
            Objects.requireNonNull(metadata);
            this.mPlace = metadata.getPlace();
        }
    }

    public Metadata(Builder builder) {
        this.mPlace = builder.mPlace;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Metadata) {
            return Objects.equals(this.mPlace, ((Metadata) obj).mPlace);
        }
        return false;
    }

    public Place getPlace() {
        return this.mPlace;
    }

    public int hashCode() {
        return Objects.hashCode(this.mPlace);
    }

    private Metadata() {
        this.mPlace = null;
    }
}
