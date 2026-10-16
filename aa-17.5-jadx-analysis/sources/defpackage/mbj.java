package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import android.service.notification.NotificationListenerService;
import com.google.android.apps.auto.components.notifications.listener.ParceledNotificationList;

/* loaded from: classes2.dex */
public interface mbj extends IInterface {
    NotificationListenerService.RankingMap e() throws RemoteException;

    ParceledNotificationList f(String[] strArr) throws RemoteException;

    void g(int i) throws RemoteException;
}
