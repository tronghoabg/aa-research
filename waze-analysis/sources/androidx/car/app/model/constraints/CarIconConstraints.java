package androidx.car.app.model.constraints;

import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CarIconConstraints {
    private final int[] mAllowedTypes;
    public static final CarIconConstraints UNCONSTRAINED = create(new int[]{1, 2, 4});
    public static final CarIconConstraints DEFAULT = create(new int[]{1, 2});

    private CarIconConstraints(int[] iArr) {
        this.mAllowedTypes = iArr;
    }

    private static CarIconConstraints create(int[] iArr) {
        return new CarIconConstraints(iArr);
    }

    public IconCompat checkSupportedIcon(IconCompat iconCompat) {
        int[] iArr = this.mAllowedTypes;
        int type = iconCompat.getType();
        for (int i2 : iArr) {
            if (type == i2) {
                if (type != 4 || "content".equalsIgnoreCase(iconCompat.getUri().getScheme())) {
                    return iconCompat;
                }
                Objects.toString(iconCompat);
                throw new IllegalArgumentException("Unsupported URI scheme for: ".concat(String.valueOf(iconCompat)));
            }
        }
        throw new IllegalArgumentException("Custom icon type is not allowed: " + type);
    }

    public void validateOrThrow(CarIcon carIcon) {
        if (carIcon == null || carIcon.getType() != 1) {
            return;
        }
        IconCompat icon = carIcon.getIcon();
        if (icon == null) {
            throw new IllegalStateException("Custom icon does not have a backing IconCompat");
        }
        checkSupportedIcon(icon);
    }
}
