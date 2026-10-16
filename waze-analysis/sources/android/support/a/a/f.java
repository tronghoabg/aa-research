package android.support.a.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface f extends IInterface {
    Bundle areNotificationsEnabled(Bundle bundle);

    void cancelNotification(Bundle bundle);

    Bundle extraCommand(String str, Bundle bundle, IBinder iBinder);

    Bundle getActiveNotifications();

    int getInterfaceVersion();

    Bundle getSmallIconBitmap();

    int getSmallIconId();

    Bundle notifyNotificationWithChannel(Bundle bundle);
}
