package androidx.car.app;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class CarToast {
    public static final int LENGTH_LONG = 1;
    public static final int LENGTH_SHORT = 0;
    private final CarContext mCarContext;
    private int mDuration;
    private CharSequence mText;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Duration {
    }

    public CarToast(CarContext carContext) {
        Objects.requireNonNull(carContext);
        this.mCarContext = carContext;
    }

    public static CarToast makeText(CarContext carContext, int i, int i2) {
        Objects.requireNonNull(carContext);
        return makeText(carContext, i == 0 ? "" : carContext.getString(i), i2);
    }

    public void setDuration(int i) {
        this.mDuration = i;
    }

    public void setText(int i) {
        this.mText = i == 0 ? "" : this.mCarContext.getString(i);
    }

    public void show() {
        CharSequence charSequence = this.mText;
        if (charSequence == null) {
            throw new IllegalStateException("setText must have been called");
        }
        ((AppManager) this.mCarContext.getCarService(AppManager.class)).showToast(charSequence, this.mDuration);
    }

    public void setText(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        this.mText = charSequence;
    }

    public static CarToast makeText(CarContext carContext, CharSequence charSequence, int i) {
        Objects.requireNonNull(carContext);
        CarToast carToast = new CarToast(carContext);
        Objects.requireNonNull(charSequence);
        carToast.mText = charSequence;
        carToast.mDuration = i;
        return carToast;
    }
}
