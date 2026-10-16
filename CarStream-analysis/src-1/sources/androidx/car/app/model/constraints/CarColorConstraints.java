package androidx.car.app.model.constraints;

import androidx.car.app.model.CarColor;
import java.util.HashSet;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class CarColorConstraints {
    private final HashSet<Integer> mAllowedTypes = new HashSet<>();
    public static final CarColorConstraints UNCONSTRAINED = create(new int[]{0, 1, 2, 3, 4, 5, 6, 7});
    public static final CarColorConstraints STANDARD_ONLY = create(new int[]{1, 2, 3, 4, 5, 6, 7});

    private CarColorConstraints(int[] iArr) {
        for (int i : iArr) {
            this.mAllowedTypes.add(Integer.valueOf(i));
        }
    }

    private static CarColorConstraints create(int[] iArr) {
        return new CarColorConstraints(iArr);
    }

    public void validateOrThrow(CarColor carColor) {
        if (this.mAllowedTypes.contains(Integer.valueOf(carColor.getType()))) {
            return;
        }
        throw new IllegalArgumentException("Car color type is not allowed: " + carColor);
    }
}
