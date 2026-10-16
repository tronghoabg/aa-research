package androidx.car.app.notification;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.car.app.CarContext;
import androidx.car.app.IStartCarApp;
import androidx.car.app.utils.RemoteUtils;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class CarAppNotificationBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "CarApp.NBR";

    static /* synthetic */ Object lambda$onReceive$0(IStartCarApp iStartCarApp, Intent intent) {
        iStartCarApp.startCarApp(intent);
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        IBinder binder;
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("androidx.car.app.notification.COMPONENT_EXTRA_KEY");
        intent.removeExtra("androidx.car.app.notification.COMPONENT_EXTRA_KEY");
        intent.setComponent(componentName);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            binder = extras.getBinder(CarContext.EXTRA_START_CAR_APP_BINDER_KEY);
            extras.remove(CarContext.EXTRA_START_CAR_APP_BINDER_KEY);
        } else {
            binder = null;
        }
        if (binder == null) {
            Objects.toString(intent);
            Log.e(TAG, "Notification intent missing expected extra: ".concat(String.valueOf(intent)));
        } else {
            final IStartCarApp iStartCarApp = (IStartCarApp) j$.util.Objects.requireNonNull(IStartCarApp.Stub.asInterface(binder));
            RemoteUtils.dispatchCallToHost("startCarApp from notification", new RemoteUtils.RemoteCall() { // from class: androidx.car.app.notification.CarAppNotificationBroadcastReceiver$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
                public final Object call() {
                    CarAppNotificationBroadcastReceiver.lambda$onReceive$0(iStartCarApp, intent);
                    return null;
                }
            });
        }
    }
}
