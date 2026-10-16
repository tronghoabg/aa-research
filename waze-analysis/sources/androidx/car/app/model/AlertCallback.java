package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes2.dex */
public interface AlertCallback {
    public static final int REASON_NOT_SUPPORTED = 3;
    public static final int REASON_TIMEOUT = 1;
    public static final int REASON_USER_ACTION = 2;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Reason {
    }

    void onCancel(int i2);

    void onDismiss();
}
