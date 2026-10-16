package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.constraints.CarIconConstraints;
import androidx.core.os.EnvironmentCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class CarIconSpan extends CarSpan {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    private final int mAlignment;
    private final CarIcon mIcon;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Alignment {
    }

    private CarIconSpan() {
        this.mIcon = null;
        this.mAlignment = 1;
    }

    private static String alignmentToString(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? EnvironmentCompat.MEDIA_UNKNOWN : TtmlNode.CENTER : "baseline" : "bottom";
    }

    public static CarIconSpan create(CarIcon carIcon, int i2) {
        CarIconConstraints.DEFAULT.validateOrThrow(carIcon);
        if (i2 == 1 || i2 == 0 || i2 == 2) {
            return new CarIconSpan((CarIcon) Objects.requireNonNull(carIcon), i2);
        }
        throw new IllegalStateException("Invalid alignment value: " + i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarIconSpan) {
            return Objects.equals(this.mIcon, ((CarIconSpan) obj).mIcon);
        }
        return false;
    }

    public int getAlignment() {
        return this.mAlignment;
    }

    public CarIcon getIcon() {
        return (CarIcon) Objects.requireNonNull(this.mIcon);
    }

    public int hashCode() {
        return Objects.hashCode(this.mIcon);
    }

    public String toString() {
        return "[icon: " + this.mIcon + ", alignment: " + alignmentToString(this.mAlignment) + "]";
    }

    private CarIconSpan(CarIcon carIcon, int i2) {
        this.mIcon = carIcon;
        this.mAlignment = i2;
    }

    public static CarIconSpan create(CarIcon carIcon) {
        return create(carIcon, 1);
    }
}
