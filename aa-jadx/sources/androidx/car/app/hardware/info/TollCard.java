package androidx.car.app.hardware.info;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class TollCard {
    public static final int TOLLCARD_STATE_INVALID = 2;
    public static final int TOLLCARD_STATE_NOT_INSERTED = 3;
    public static final int TOLLCARD_STATE_UNKNOWN = 0;
    public static final int TOLLCARD_STATE_VALID = 1;
    private final androidx.car.app.hardware.common.CarValue<java.lang.Integer> mCardState;

    public TollCard(defpackage.sk skVar) {
        java.lang.Object obj = skVar.a;
        obj.getClass();
        this.mCardState = (androidx.car.app.hardware.common.CarValue) obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.hardware.info.TollCard) {
            return j$.util.Objects.equals(this.mCardState, ((androidx.car.app.hardware.info.TollCard) obj).mCardState);
        }
        return false;
    }

    public androidx.car.app.hardware.common.CarValue<java.lang.Integer> getCardState() {
        androidx.car.app.hardware.common.CarValue<java.lang.Integer> carValue = this.mCardState;
        carValue.getClass();
        return carValue;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mCardState);
    }

    public java.lang.String toString() {
        return "[ tollcard state: " + this.mCardState + "]";
    }

    private TollCard() {
        this.mCardState = androidx.car.app.hardware.common.CarValue.UNKNOWN_INTEGER;
    }
}
