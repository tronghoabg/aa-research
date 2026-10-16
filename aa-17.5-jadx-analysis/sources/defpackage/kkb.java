package defpackage;

import com.google.android.gms.car.control.CarPropertySetError;

/* loaded from: classes2.dex */
public final class kkb extends Exception {
    public final CarPropertySetError a;

    public kkb(CarPropertySetError carPropertySetError) {
        super("CarPropertySetError: " + carPropertySetError.a);
        this.a = carPropertySetError;
    }
}
