package androidx.car.app.connection;

import android.content.Context;
import androidx.car.app.utils.CommonUtils;
import androidx.lifecycle.LiveData;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class CarConnection {
    public static final String ACTION_CAR_CONNECTION_UPDATED = "androidx.car.app.connection.action.CAR_CONNECTION_UPDATED";
    public static final String CAR_CONNECTION_STATE = "CarConnectionState";
    public static final int CONNECTION_TYPE_NATIVE = 1;
    public static final int CONNECTION_TYPE_NOT_CONNECTED = 0;
    public static final int CONNECTION_TYPE_PROJECTION = 2;
    private final LiveData<Integer> mConnectionTypeLiveData;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConnectionType {
    }

    public CarConnection(Context context) {
        Objects.requireNonNull(context);
        this.mConnectionTypeLiveData = CommonUtils.isAutomotiveOS(context) ? new AutomotiveCarConnectionTypeLiveData() : new CarConnectionTypeLiveData(context);
    }

    public LiveData<Integer> getType() {
        return this.mConnectionTypeLiveData;
    }
}
