package androidx.car.app.model.signin;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class PinSignInMethod implements defpackage.ww {
    private static final int MAX_PIN_LENGTH = 12;
    private final androidx.car.app.model.CarText mPinCode;

    public PinSignInMethod(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length();
        if (length == 0) {
            throw new java.lang.IllegalArgumentException("PIN must not be empty");
        }
        if (length > 12) {
            throw new java.lang.IllegalArgumentException("PIN must not be longer than 12 characters");
        }
        this.mPinCode = androidx.car.app.model.CarText.create(charSequence);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.signin.PinSignInMethod) {
            return j$.util.Objects.equals(this.mPinCode, ((androidx.car.app.model.signin.PinSignInMethod) obj).mPinCode);
        }
        return false;
    }

    public androidx.car.app.model.CarText getPinCode() {
        androidx.car.app.model.CarText carText = this.mPinCode;
        carText.getClass();
        return carText;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mPinCode);
    }

    private PinSignInMethod() {
        this.mPinCode = null;
    }
}
