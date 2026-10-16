package androidx.car.app.connection;

import android.content.Context;
import androidx.car.app.utils.CommonUtils;
import androidx.lifecycle.LiveData;
import j$.util.Objects;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CarConnection {
    public static final String ACTION_CAR_CONNECTION_UPDATED = "androidx.car.app.connection.action.CAR_CONNECTION_UPDATED";
    public static final String CAR_CONNECTION_STATE = "CarConnectionState";
    public static final int CONNECTION_TYPE_NATIVE = 1;
    public static final int CONNECTION_TYPE_NOT_CONNECTED = 0;
    public static final int CONNECTION_TYPE_PROJECTION = 2;
    private final LiveData<Integer> mConnectionTypeLiveData;

    /* compiled from: WazeSource */
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
