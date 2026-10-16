package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes.dex */
public interface AlertCallback {
    public static final int REASON_NOT_SUPPORTED = 3;
    public static final int REASON_TIMEOUT = 1;
    public static final int REASON_USER_ACTION = 2;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Reason {
    }

    void onCancel(int i);

    void onDismiss();
}
