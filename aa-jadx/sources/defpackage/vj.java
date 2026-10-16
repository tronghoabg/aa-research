package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vj {
    public androidx.car.app.model.CarIcon a;
    public androidx.car.app.model.CarText b;
    public androidx.car.app.model.CarColor c;
    public final int d = 0;

    public final void a(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() > 3) {
            throw new java.lang.IllegalArgumentException("Marker label cannot contain more than 3 characters");
        }
        this.b = androidx.car.app.model.CarText.create(charSequence);
    }
}
