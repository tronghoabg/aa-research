package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class mbm extends defpackage.ijw implements mbn {
    public mbm() {
        super("com.google.android.apps.auto.components.notifications.listener.INotificationClient");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        mbq mboVar;
        if (i == 1) {
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                mboVar = null;
            } else {
                mbq mbqVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.auto.components.notifications.listener.INotificationService");
                mboVar = mbqVarQueryLocalInterface instanceof mbq ? mbqVarQueryLocalInterface : new mbo(strongBinder);
            }
            defpackage.ijx.d(parcel);
            a(mboVar);
        } else if (i == 2) {
            b();
        } else if (i == 3) {
            android.service.notification.StatusBarNotification statusBarNotification = (android.service.notification.StatusBarNotification) defpackage.ijx.a(parcel, android.service.notification.StatusBarNotification.CREATOR);
            android.service.notification.NotificationListenerService.RankingMap rankingMap = (android.service.notification.NotificationListenerService.RankingMap) defpackage.ijx.a(parcel, android.service.notification.NotificationListenerService.RankingMap.CREATOR);
            defpackage.ijx.d(parcel);
            c(statusBarNotification, rankingMap);
        } else if (i == 4) {
            android.service.notification.StatusBarNotification statusBarNotification2 = (android.service.notification.StatusBarNotification) defpackage.ijx.a(parcel, android.service.notification.StatusBarNotification.CREATOR);
            android.service.notification.NotificationListenerService.RankingMap rankingMap2 = (android.service.notification.NotificationListenerService.RankingMap) defpackage.ijx.a(parcel, android.service.notification.NotificationListenerService.RankingMap.CREATOR);
            defpackage.ijx.d(parcel);
            f(statusBarNotification2, rankingMap2);
        } else {
            if (i != 5) {
                return false;
            }
            android.service.notification.NotificationListenerService.RankingMap rankingMap3 = (android.service.notification.NotificationListenerService.RankingMap) defpackage.ijx.a(parcel, android.service.notification.NotificationListenerService.RankingMap.CREATOR);
            defpackage.ijx.d(parcel);
            d(rankingMap3);
        }
        return true;
    }
}
