package androidx.car.app.model.constraints;

import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.Background;
import j$.util.Objects;

/* compiled from: WazeSource */
@RequiresCarApi(9)
/* loaded from: classes2.dex */
public final class BackgroundConstraints {
    public static final BackgroundConstraints COLOR_ONLY;
    public static final BackgroundConstraints UNCONSTRAINED = new Builder().build();
    private final boolean mIsImageAllowed;

    static {
        Builder builder = new Builder();
        builder.setImageAllowed(false);
        COLOR_ONLY = builder.build();
    }

    BackgroundConstraints(Builder builder) {
        this.mIsImageAllowed = builder.mIsImageAllowed;
    }

    public boolean isImageAllowed() {
        return this.mIsImageAllowed;
    }

    public void validateOrThrow(Background background) {
        if (!this.mIsImageAllowed && background.getImage() != null) {
            throw new IllegalArgumentException("Image backgrounds are not supported");
        }
    }

    /* compiled from: WazeSource */
    public final class Builder {
        boolean mIsImageAllowed;

        public Builder(BackgroundConstraints backgroundConstraints) {
            this.mIsImageAllowed = true;
            Objects.requireNonNull(backgroundConstraints);
            this.mIsImageAllowed = backgroundConstraints.isImageAllowed();
        }

        public BackgroundConstraints build() {
            return new BackgroundConstraints(this);
        }

        public Builder setImageAllowed(boolean z) {
            this.mIsImageAllowed = z;
            return this;
        }

        public Builder() {
            this.mIsImageAllowed = true;
        }
    }
}
