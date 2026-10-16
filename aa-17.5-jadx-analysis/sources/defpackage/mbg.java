package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

/* loaded from: classes2.dex */
public interface mbg extends IInterface {
    void a(mbj mbjVar) throws RemoteException;

    void b() throws RemoteException;

    void c(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) throws RemoteException;

    void d(NotificationListenerService.RankingMap rankingMap) throws RemoteException;

    void f(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) throws RemoteException;
}
