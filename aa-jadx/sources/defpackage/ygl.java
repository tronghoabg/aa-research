package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ygl {
    static int f(int i, int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int iHighestOneBit = java.lang.Integer.highestOneBit(i2 - 1);
            i3 = iHighestOneBit + iHighestOneBit;
        }
        return i3 < 0 ? androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY : i3;
    }

    public abstract void c(java.lang.Object obj);

    public abstract defpackage.ygm g();
}
