package androidx.car.app.model.constraints;

import androidx.car.app.model.Alert;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Row;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class RowConstraints {
    public static final RowConstraints ROW_CONSTRAINTS_FULL_LIST;
    public static final RowConstraints ROW_CONSTRAINTS_SIMPLE;
    private final CarIconConstraints mCarIconConstraints;
    private final boolean mIsImageAllowed;
    private final boolean mIsOnClickListenerAllowed;
    private final boolean mIsToggleAllowed;
    private final int mMaxActionsExclusive;
    private final int mMaxTextLinesPerRow;
    public static final RowConstraints UNCONSTRAINED = new Builder().build();
    public static final RowConstraints ROW_CONSTRAINTS_CONSERVATIVE = new Builder().setMaxActionsExclusive(0).setImageAllowed(false).setMaxTextLinesPerRow(1).setOnClickListenerAllowed(true).setToggleAllowed(false).build();
    public static final RowConstraints ROW_CONSTRAINTS_PANE = new Builder().setMaxActionsExclusive(2).setImageAllowed(true).setMaxTextLinesPerRow(2).setToggleAllowed(true).setOnClickListenerAllowed(false).build();

    static {
        RowConstraints rowConstraintsBuild = new Builder().setMaxActionsExclusive(0).setImageAllowed(true).setMaxTextLinesPerRow(2).setToggleAllowed(true).setOnClickListenerAllowed(true).build();
        ROW_CONSTRAINTS_SIMPLE = rowConstraintsBuild;
        ROW_CONSTRAINTS_FULL_LIST = new Builder(rowConstraintsBuild).setToggleAllowed(true).build();
    }

    public RowConstraints(Builder builder) {
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

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        CarIconConstraints mCarIconConstraints;
        boolean mIsImageAllowed;
        boolean mIsOnClickListenerAllowed;
        boolean mIsToggleAllowed;
        int mMaxActionsExclusive;
        int mMaxTextLines;

        public Builder() {
            this.mIsOnClickListenerAllowed = true;
            this.mIsToggleAllowed = true;
            this.mMaxTextLines = Alert.DURATION_SHOW_INDEFINITELY;
            this.mMaxActionsExclusive = Alert.DURATION_SHOW_INDEFINITELY;
            this.mIsImageAllowed = true;
            this.mCarIconConstraints = CarIconConstraints.UNCONSTRAINED;
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

        public Builder setMaxActionsExclusive(int i) {
            this.mMaxActionsExclusive = i;
            return this;
        }

        public Builder setMaxTextLinesPerRow(int i) {
            this.mMaxTextLines = i;
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

        public Builder(RowConstraints rowConstraints) {
            this.mIsOnClickListenerAllowed = true;
            this.mIsToggleAllowed = true;
            this.mMaxTextLines = Alert.DURATION_SHOW_INDEFINITELY;
            this.mMaxActionsExclusive = Alert.DURATION_SHOW_INDEFINITELY;
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
    }
}
