package defpackage;

import androidx.car.app.model.CarColor;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class ghv {
    public static final ghv a = new ghv(new int[]{0, 1, 2, 3, 4, 5, 6, 7});
    public static final ghv b = new ghv(new int[]{1, 2, 3, 4, 5, 6, 7});
    public static final ghv c = new ghv(new int[0]);
    private final HashSet d = new HashSet();

    private ghv(int[] iArr) {
        for (int i : iArr) {
            this.d.add(Integer.valueOf(i));
        }
    }

    public final CarColor a(CarColor carColor) {
        if (carColor != null && this.d.contains(Integer.valueOf(carColor.getType()))) {
            return carColor;
        }
        return null;
    }
}
