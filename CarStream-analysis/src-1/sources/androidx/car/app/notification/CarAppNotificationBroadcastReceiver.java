package androidx.car.app.notification;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import androidx.car.app.CarContext;
import androidx.car.app.IStartCarApp;
import androidx.car.app.utils.RemoteUtils;
import defpackage.a2;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class CarAppNotificationBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "CarApp.NBR";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$onReceive$0(IStartCarApp iStartCarApp, Intent intent) {
        iStartCarApp.startCarApp(intent);
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
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
            intent.toString();
            return;
        }
        IStartCarApp iStartCarAppAsInterface = IStartCarApp.Stub.asInterface(binder);
        Objects.requireNonNull(iStartCarAppAsInterface);
        RemoteUtils.dispatchCallToHost("startCarApp from notification", new a2(iStartCarAppAsInterface, intent, 0));
    }
}
