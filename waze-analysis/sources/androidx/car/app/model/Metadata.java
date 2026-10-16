package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class Metadata {
    public static final Metadata EMPTY_METADATA = new Builder().build();
    private final Place mPlace;

    /* compiled from: WazeSource */
    public final class Builder {
        Place mPlace;

        public Builder(Metadata metadata) {
            this.mPlace = ((Metadata) Objects.requireNonNull(metadata)).getPlace();
        }

        public Metadata build() {
            return new Metadata(this);
        }

        public Builder setPlace(Place place) {
            this.mPlace = (Place) Objects.requireNonNull(place);
            return this;
        }
    }

    Metadata(Builder builder) {
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
