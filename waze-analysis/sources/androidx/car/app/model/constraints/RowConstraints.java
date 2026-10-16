package androidx.car.app.model.constraints;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Row;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RowConstraints {
    public static final RowConstraints ROW_CONSTRAINTS_CONSERVATIVE;
    public static final RowConstraints ROW_CONSTRAINTS_FULL_LIST;
    public static final RowConstraints ROW_CONSTRAINTS_PANE;
    public static final RowConstraints ROW_CONSTRAINTS_SIMPLE;
    public static final RowConstraints UNCONSTRAINED = new Builder().build();
    private final CarIconConstraints mCarIconConstraints;
    private final boolean mIsImageAllowed;
    private final boolean mIsOnClickListenerAllowed;
    private final boolean mIsToggleAllowed;
    private final int mMaxActionsExclusive;
    private final int mMaxTextLinesPerRow;

    static {
        Builder builder = new Builder();
        builder.setMaxActionsExclusive(0);
        builder.setImageAllowed(false);
        builder.setMaxTextLinesPerRow(1);
        builder.setOnClickListenerAllowed(true);
        builder.setToggleAllowed(false);
        ROW_CONSTRAINTS_CONSERVATIVE = builder.build();
        Builder builder2 = new Builder();
        builder2.setMaxActionsExclusive(2);
        builder2.setImageAllowed(true);
        builder2.setMaxTextLinesPerRow(2);
        builder2.setToggleAllowed(true);
        builder2.setOnClickListenerAllowed(false);
        ROW_CONSTRAINTS_PANE = builder2.build();
        Builder builder3 = new Builder();
        builder3.setMaxActionsExclusive(0);
        builder3.setImageAllowed(true);
        builder3.setMaxTextLinesPerRow(2);
        builder3.setToggleAllowed(true);
        builder3.setOnClickListenerAllowed(true);
        RowConstraints rowConstraintsBuild = builder3.build();
        ROW_CONSTRAINTS_SIMPLE = rowConstraintsBuild;
        Builder builder4 = new Builder(rowConstraintsBuild);
        builder4.setToggleAllowed(true);
        ROW_CONSTRAINTS_FULL_LIST = builder4.build();
    }

    RowConstraints(Builder builder) {
        this.mIsOnClickListenerAllowed = builder.mIsOnClickListenerAllowed;
        this.mMaxTextLinesPerRow = builder.mMaxTextLines;
        this.mMaxActionsExclusive = builder.mMaxActionsExclusive;
        this.mIsToggleAllowed = builder.mIsToggleAllowed;
        this.mIsImageAllowed = builder.mIsImageAllowed;
        this.mCarIconConstraints = builder.mCarIconConstraints;
    }

    public CarIconConstraints getCarIconConstraints() {
        return this.mCarIconConstraints;
    }

    public int getMaxActionsExclusive() {
        return this.mMaxActionsExclusive;
    }

    public int getMaxTextLinesPerRow() {
        return this.mMaxTextLinesPerRow;
    }

    public boolean isImageAllowed() {
        return this.mIsImageAllowed;
    }

    public boolean isOnClickListenerAllowed() {
        return this.mIsOnClickListenerAllowed;
    }

    public boolean isToggleAllowed() {
        return this.mIsToggleAllowed;
    }

    public void validateOrThrow(Row row) {
        if (!this.mIsOnClickListenerAllowed && row.getOnClickDelegate() != null) {
            throw new IllegalArgumentException("A click listener is not allowed on the row");
        }
        if (!this.mIsToggleAllowed && row.getToggle() != null) {
            throw new IllegalArgumentException("A toggle is not allowed on the row");
        }
        CarIcon image = row.getImage();
        if (image != null) {
            if (!this.mIsImageAllowed) {
                throw new IllegalArgumentException("An image is not allowed on the row");
            }
            this.mCarIconConstraints.validateOrThrow(image);
        }
        if (row.getTexts().size() <= this.mMaxTextLinesPerRow) {
            return;
        }
        throw new IllegalArgumentException("The number of lines of texts for the row exceeded the supported max of " + this.mMaxTextLinesPerRow);
    }

    /* compiled from: WazeSource */
    public final class Builder {
        CarIconConstraints mCarIconConstraints;
        boolean mIsImageAllowed;
        boolean mIsOnClickListenerAllowed;
        boolean mIsToggleAllowed;
        int mMaxActionsExclusive;
        int mMaxTextLines;

        public Builder(RowConstraints rowConstraints) {
            this.mIsOnClickListenerAllowed = true;
            this.mIsToggleAllowed = true;
            this.mMaxTextLines = Integer.MAX_VALUE;
            this.mMaxActionsExclusive = Integer.MAX_VALUE;
            this.mIsImageAllowed = true;
            this.mCarIconConstraints = CarIconConstraints.UNCONSTRAINED;
            Objects.requireNonNull(rowConstraints);
            this.mIsOnClickListenerAllowed = rowConstraints.isOnClickListenerAllowed();
            this.mMaxTextLines = rowConstraints.getMaxTextLinesPerRow();
            this.mMaxActionsExclusive = rowConstraints.getMaxActionsExclusive();
            this.mIsToggleAllowed = rowConstraints.isToggleAllowed();
            this.mIsImageAllowed = rowConstraints.isImageAllowed();
            this.mCarIconConstraints = rowConstraints.getCarIconConstraints();
        }

        public RowConstraints build() {
            return new RowConstraints(this);
        }

        public Builder setCarIconConstraints(CarIconConstraints carIconConstraints) {
            this.mCarIconConstraints = carIconConstraints;
            return this;
        }

        public Builder setImageAllowed(boolean z) {
            this.mIsImageAllowed = z;
            return this;
        }

        public Builder setMaxActionsExclusive(int i2) {
            this.mMaxActionsExclusive = i2;
            return this;
        }

        public Builder setMaxTextLinesPerRow(int i2) {
            this.mMaxTextLines = i2;
            return this;
        }

        public Builder setOnClickListenerAllowed(boolean z) {
            this.mIsOnClickListenerAllowed = z;
            return this;
        }

        public Builder setToggleAllowed(boolean z) {
            this.mIsToggleAllowed = z;
            return this;
        }

        public Builder() {
            this.mIsOnClickListenerAllowed = true;
            this.mIsToggleAllowed = true;
            this.mMaxTextLines = Integer.MAX_VALUE;
            this.mMaxActionsExclusive = Integer.MAX_VALUE;
            this.mIsImageAllowed = true;
            this.mCarIconConstraints = CarIconConstraints.UNCONSTRAINED;
        }
    }
}
