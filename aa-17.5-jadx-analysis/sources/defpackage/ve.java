package defpackage;

import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;

/* loaded from: classes2.dex */
public final class ve {
    public CarIcon a;
    public CarText b;
    public CarColor c;
    public final int d = 0;

    public final void a(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() > 3) {
            throw new IllegalArgumentException("Marker label cannot contain more than 3 characters");
        }
        this.b = CarText.create(charSequence);
    }
}
