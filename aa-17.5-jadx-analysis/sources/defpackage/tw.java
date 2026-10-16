package defpackage;

import androidx.car.app.model.Badge;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarProgressBar;
import androidx.car.app.model.CarText;
import androidx.car.app.model.GridItem;
import androidx.car.app.model.OnClickDelegateImpl;

/* loaded from: classes2.dex */
public final class tw {
    public CarText a;
    public CarText b;
    public CarIcon c;
    public uq e;
    public boolean f;
    public Badge g;
    public CarProgressBar i;
    public int d = 2;
    public final boolean h = true;

    public final GridItem a() {
        CarIcon carIcon = this.c;
        if (carIcon == null) {
            throw new IllegalStateException("When a grid item is loading, the image must not be set and vice versa");
        }
        if (carIcon != null || this.g == null) {
            return new GridItem(this);
        }
        throw new IllegalStateException("A badge can only be set when a grid item image is also provided");
    }

    public final void b(CarIcon carIcon) {
        wh whVar = wh.a;
        carIcon.getClass();
        whVar.a(carIcon);
        this.c = carIcon;
        this.d = 2;
    }

    public final void c(CarIcon carIcon, Badge badge) {
        this.g = badge;
        b(carIcon);
    }

    public final void d(us usVar) {
        this.e = OnClickDelegateImpl.create(usVar);
    }

    public final void e(CharSequence charSequence) {
        if (charSequence == null) {
            this.a = null;
            return;
        }
        CarText carTextCreate = CarText.create(charSequence);
        wi.e.a(carTextCreate);
        this.a = carTextCreate;
    }
}
