package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gib {
    public static final defpackage.gib a = new defpackage.gib(new int[]{0, 1, 2, 3, 4, 5, 6, 7});
    public static final defpackage.gib b = new defpackage.gib(new int[]{1, 2, 3, 4, 5, 6, 7});
    public static final defpackage.gib c = new defpackage.gib(new int[0]);
    private final java.util.HashSet d = new java.util.HashSet();

    private gib(int[] iArr) {
        for (int i : iArr) {
            this.d.add(java.lang.Integer.valueOf(i));
        }
    }

    public final androidx.car.app.model.CarColor a(androidx.car.app.model.CarColor carColor) {
        if (carColor != null && this.d.contains(java.lang.Integer.valueOf(carColor.getType()))) {
            return carColor;
        }
        return null;
    }
}
