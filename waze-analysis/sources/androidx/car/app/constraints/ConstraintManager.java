package androidx.car.app.constraints;

import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.CarContext;
import androidx.car.app.HostCall;
import androidx.car.app.HostDispatcher;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.managers.Manager;
import androidx.car.app.utils.LogTags;
import com.waze.R;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
@RequiresCarApi(2)
/* loaded from: classes2.dex */
public class ConstraintManager implements Manager {
    public static final int CONTENT_LIMIT_TYPE_GRID = 1;
    public static final int CONTENT_LIMIT_TYPE_LIST = 0;
    public static final int CONTENT_LIMIT_TYPE_PANE = 4;
    public static final int CONTENT_LIMIT_TYPE_PLACE_LIST = 2;
    public static final int CONTENT_LIMIT_TYPE_ROUTE_LIST = 3;
    private final CarContext mCarContext;
    private final HostDispatcher mHostDispatcher;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ContentLimitType {
    }

    private ConstraintManager(CarContext carContext, HostDispatcher hostDispatcher) {
        this.mCarContext = carContext;
        this.mHostDispatcher = hostDispatcher;
    }

    public static ConstraintManager create(CarContext carContext, HostDispatcher hostDispatcher) {
        return new ConstraintManager((CarContext) Objects.requireNonNull(carContext), (HostDispatcher) Objects.requireNonNull(hostDispatcher));
    }

    private int getResourceIdForContentType(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? R.integer.content_limit_list : R.integer.content_limit_pane : R.integer.content_limit_route_list : R.integer.content_limit_place_list : R.integer.content_limit_grid;
    }

    public int getContentLimit(final int i2) {
        Integer num;
        try {
            num = (Integer) this.mHostDispatcher.dispatchForResult(CarContext.CONSTRAINT_SERVICE, "getContentLimit", new HostCall() { // from class: androidx.car.app.constraints.ConstraintManager$$ExternalSyntheticLambda1
                @Override // androidx.car.app.HostCall
                public final Object dispatch(Object obj) {
                    return Integer.valueOf(((IConstraintHost) obj).getContentLimit(i2));
                }
            });
        } catch (RemoteException e2) {
            Log.w(LogTags.TAG, "Failed to retrieve list limit from the host, using defaults", e2);
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        CarContext carContext = this.mCarContext;
        return carContext.getResources().getInteger(getResourceIdForContentType(i2));
    }

    @RequiresCarApi(6)
    public boolean isAppDrivenRefreshEnabled() {
        try {
            return Boolean.TRUE.equals((Boolean) this.mHostDispatcher.dispatchForResult(CarContext.CONSTRAINT_SERVICE, "isAppDrivenRefreshEnabled", new HostCall() { // from class: androidx.car.app.constraints.ConstraintManager$$ExternalSyntheticLambda0
                @Override // androidx.car.app.HostCall
                public final Object dispatch(Object obj) {
                    return Boolean.valueOf(((IConstraintHost) obj).isAppDrivenRefreshEnabled());
                }
            }));
        } catch (RemoteException e2) {
            Log.w(LogTags.TAG, "Failed to retrieve if the host supports appDriven Refresh, using defaults", e2);
            return false;
        }
    }
}
