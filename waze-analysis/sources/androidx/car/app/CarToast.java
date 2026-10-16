package androidx.car.app;

import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CarToast {
    public static final int LENGTH_LONG = 1;
    public static final int LENGTH_SHORT = 0;
    private final CarContext mCarContext;
    private int mDuration;
    private CharSequence mText;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Duration {
    }

    CarToast(CarContext carContext) {
        this.mCarContext = (CarContext) Objects.requireNonNull(carContext);
    }

    public static CarToast makeText(CarContext carContext, CharSequence charSequence, int i2) {
        CarToast carToast = new CarToast((CarContext) Objects.requireNonNull(carContext));
        carToast.mText = (CharSequence) Objects.requireNonNull(charSequence);
        carToast.mDuration = i2;
        return carToast;
    }

    public void setDuration(int i2) {
        this.mDuration = i2;
    }

    public void setText(int i2) {
        this.mText = i2 == 0 ? "" : this.mCarContext.getString(i2);
    }

    public void show() {
        CharSequence charSequence = this.mText;
        if (charSequence == null) {
            throw new IllegalStateException("setText must have been called");
        }
        ((AppManager) this.mCarContext.getCarService(AppManager.class)).showToast(charSequence, this.mDuration);
    }

    public void setText(CharSequence charSequence) {
        this.mText = (CharSequence) Objects.requireNonNull(charSequence);
    }

    public static CarToast makeText(CarContext carContext, int i2, int i3) {
        return makeText((CarContext) Objects.requireNonNull(carContext), i2 == 0 ? "" : carContext.getString(i2), i3);
    }
}
