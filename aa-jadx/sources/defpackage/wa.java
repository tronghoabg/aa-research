package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wa {
    public androidx.car.app.model.CarText a;
    public androidx.car.app.model.CarIcon b;
    public java.lang.String c;
    public final androidx.car.app.model.TabStyle d = null;

    public final androidx.car.app.model.Tab a() {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("A title must be set for the tab");
        }
        if (this.b == null) {
            throw new java.lang.IllegalStateException("An icon must be set for the tab");
        }
        if (this.c != null) {
            return new androidx.car.app.model.Tab(this);
        }
        throw new java.lang.IllegalStateException("A content ID must be set for the tab");
    }

    public final void b(androidx.car.app.model.CarIcon carIcon) {
        defpackage.wo.b.a(carIcon);
        this.b = carIcon;
    }

    public final void c(java.lang.CharSequence charSequence) {
        androidx.car.app.model.CarText carTextCreate = androidx.car.app.model.CarText.create(charSequence);
        if (carTextCreate.isEmpty()) {
            throw new java.lang.IllegalArgumentException("The title cannot be null or empty");
        }
        defpackage.wp.e.a(carTextCreate);
        this.a = carTextCreate;
    }
}
