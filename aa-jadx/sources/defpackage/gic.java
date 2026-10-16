package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gic {
    public static final defpackage.gic a = new defpackage.gic(new int[]{1, 2, 4});
    public static final defpackage.gic b = new defpackage.gic(new int[]{1, 2});
    private final int[] c;

    private gic(int[] iArr) {
        this.c = iArr;
    }

    public final void a(androidx.car.app.model.CarIcon carIcon) {
        if (carIcon.getType() != 1) {
            return;
        }
        androidx.core.graphics.drawable.IconCompat icon = carIcon.getIcon();
        if (icon == null) {
            throw new java.lang.IllegalStateException("Custom icon does not have a backing IconCompat");
        }
        int[] iArr = this.c;
        int iB = icon.b();
        for (int i : iArr) {
            if (iB == i) {
                if (iB == 4 && !"content".equalsIgnoreCase(icon.f().getScheme())) {
                    throw new java.lang.IllegalArgumentException("Unsupported URI scheme for: ".concat(icon.toString()));
                }
                return;
            }
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bo(iB, "Custom icon type is not allowed: "));
    }
}
