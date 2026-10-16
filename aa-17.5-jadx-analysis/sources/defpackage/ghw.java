package defpackage;

import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes2.dex */
public final class ghw {
    public static final ghw a = new ghw(new int[]{1, 2, 4});
    public static final ghw b = new ghw(new int[]{1, 2});
    private final int[] c;

    private ghw(int[] iArr) {
        this.c = iArr;
    }

    public final void a(CarIcon carIcon) {
        if (carIcon.getType() != 1) {
            return;
        }
        IconCompat icon = carIcon.getIcon();
        if (icon == null) {
            throw new IllegalStateException("Custom icon does not have a backing IconCompat");
        }
        int[] iArr = this.c;
        int iB = icon.b();
        for (int i : iArr) {
            if (iB == i) {
                if (iB == 4 && !"content".equalsIgnoreCase(icon.f().getScheme())) {
                    throw new IllegalArgumentException("Unsupported URI scheme for: ".concat(icon.toString()));
                }
                return;
            }
        }
        throw new IllegalArgumentException(a.bp(iB, "Custom icon type is not allowed: "));
    }
}
