package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

/* loaded from: classes.dex */
public abstract class mbf extends ijo implements mbg {
    public mbf() {
        super("com.google.android.apps.auto.components.notifications.listener.INotificationClient");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        mbj mbhVar;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                mbhVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.auto.components.notifications.listener.INotificationService");
                mbhVar = iInterfaceQueryLocalInterface instanceof mbj ? (mbj) iInterfaceQueryLocalInterface : new mbh(strongBinder);
            }
            ijp.d(parcel);
            a(mbhVar);
        } else if (i == 2) {
            b();
        } else if (i == 3) {
            StatusBarNotification statusBarNotification = (StatusBarNotification) ijp.a(parcel, StatusBarNotification.CREATOR);
            NotificationListenerService.RankingMap rankingMap = (NotificationListenerService.RankingMap) ijp.a(parcel, NotificationListenerService.RankingMap.CREATOR);
            ijp.d(parcel);
            c(statusBarNotification, rankingMap);
        } else if (i == 4) {
            StatusBarNotification statusBarNotification2 = (StatusBarNotification) ijp.a(parcel, StatusBarNotification.CREATOR);
            NotificationListenerService.RankingMap rankingMap2 = (NotificationListenerService.RankingMap) ijp.a(parcel, NotificationListenerService.RankingMap.CREATOR);
            ijp.d(parcel);
            f(statusBarNotification2, rankingMap2);
        } else {
            if (i != 5) {
                return false;
            }
            NotificationListenerService.RankingMap rankingMap3 = (NotificationListenerService.RankingMap) ijp.a(parcel, NotificationListenerService.RankingMap.CREATOR);
            ijp.d(parcel);
            d(rankingMap3);
        }
        return true;
    }
}
