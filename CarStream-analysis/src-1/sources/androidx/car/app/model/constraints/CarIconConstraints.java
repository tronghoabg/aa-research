package androidx.car.app.model.constraints;

import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.ad;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
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
        int type = iconCompat.getType();
        for (int i : this.mAllowedTypes) {
            if (type == i) {
                if (type != 4 || "content".equalsIgnoreCase(iconCompat.getUri().getScheme())) {
                    return iconCompat;
                }
                throw new IllegalArgumentException("Unsupported URI scheme for: " + iconCompat);
            }
        }
        throw new IllegalArgumentException(ad.b(type, "Custom icon type is not allowed: "));
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
