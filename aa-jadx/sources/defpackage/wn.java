package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wn {
    public static final defpackage.wn a = new defpackage.wn(new int[]{0, 1, 2, 3, 4, 5, 6, 7});
    private final java.util.HashSet b = new java.util.HashSet();

    static {
        new defpackage.wn(new int[]{1, 2, 3, 4, 5, 6, 7});
    }

    private wn(int[] iArr) {
        for (int i : iArr) {
            this.b.add(java.lang.Integer.valueOf(i));
        }
    }

    public final void a(androidx.car.app.model.CarColor carColor) {
        if (this.b.contains(java.lang.Integer.valueOf(carColor.getType()))) {
            return;
        }
        java.util.Objects.toString(carColor);
        throw new java.lang.IllegalArgumentException("Car color type is not allowed: ".concat(java.lang.String.valueOf(carColor)));
    }
}
