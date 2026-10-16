package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kkh extends java.lang.Exception {
    public final com.google.android.gms.car.control.CarPropertySetError a;

    public kkh(com.google.android.gms.car.control.CarPropertySetError carPropertySetError) {
        super("CarPropertySetError: " + carPropertySetError.a);
        this.a = carPropertySetError;
    }
}
