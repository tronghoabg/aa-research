package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mbo extends defpackage.ijv implements defpackage.mbq {
    public mbo(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.components.notifications.listener.INotificationService");
    }

    @Override // defpackage.mbq
    public final android.service.notification.NotificationListenerService.RankingMap e() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(8, fp());
        android.service.notification.NotificationListenerService.RankingMap rankingMap = (android.service.notification.NotificationListenerService.RankingMap) defpackage.ijx.a(parcelFq, android.service.notification.NotificationListenerService.RankingMap.CREATOR);
        parcelFq.recycle();
        return rankingMap;
    }

    @Override // defpackage.mbq
    public final com.google.android.apps.auto.components.notifications.listener.ParceledNotificationList f(java.lang.String[] strArr) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeStringArray(null);
        android.os.Parcel parcelFq = fq(3, parcelFp);
        com.google.android.apps.auto.components.notifications.listener.ParceledNotificationList parceledNotificationList = (com.google.android.apps.auto.components.notifications.listener.ParceledNotificationList) defpackage.ijx.a(parcelFq, com.google.android.apps.auto.components.notifications.listener.ParceledNotificationList.CREATOR);
        parcelFq.recycle();
        return parceledNotificationList;
    }

    @Override // defpackage.mbq
    public final void g(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fr(6, parcelFp);
    }
}
