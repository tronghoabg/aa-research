package defpackage;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Tab;
import androidx.car.app.model.TabStyle;

/* loaded from: classes2.dex */
public final class vt {
    public CarText a;
    public CarIcon b;
    public String c;
    public final TabStyle d = null;

    public final Tab a() {
        if (this.a == null) {
            throw new IllegalStateException("A title must be set for the tab");
        }
        if (this.b == null) {
            throw new IllegalStateException("An icon must be set for the tab");
        }
        if (this.c != null) {
            return new Tab(this);
        }
        throw new IllegalStateException("A content ID must be set for the tab");
    }

    public final void b(CarIcon carIcon) {
        wh.b.a(carIcon);
        this.b = carIcon;
    }

    public final void c(CharSequence charSequence) {
        CarText carTextCreate = CarText.create(charSequence);
        if (carTextCreate.isEmpty()) {
            throw new IllegalArgumentException("The title cannot be null or empty");
        }
        wi.e.a(carTextCreate);
        this.a = carTextCreate;
    }
}
