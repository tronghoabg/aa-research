package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mbp extends defpackage.ijw implements mbq {
    final /* synthetic */ defpackage.mce a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbp(defpackage.mce mceVar) {
        super("com.google.android.apps.auto.components.notifications.listener.INotificationService");
        this.a = mceVar;
    }

    public final android.service.notification.NotificationListenerService.RankingMap e() {
        return this.a.a();
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 3) {
            java.lang.String[] strArrCreateStringArray = parcel.createStringArray();
            defpackage.ijx.d(parcel);
            com.google.android.apps.auto.components.notifications.listener.ParceledNotificationList parceledNotificationListF = f(strArrCreateStringArray);
            parcel2.writeNoException();
            defpackage.ijx.h(parcel2, parceledNotificationListF);
            return true;
        }
        if (i == 6) {
            int i2 = parcel.readInt();
            defpackage.ijx.d(parcel);
            g(i2);
            parcel2.writeNoException();
            return true;
        }
        if (i != 8) {
            return false;
        }
        android.service.notification.NotificationListenerService.RankingMap rankingMapE = e();
        parcel2.writeNoException();
        defpackage.ijx.h(parcel2, rankingMapE);
        return true;
    }

    public final com.google.android.apps.auto.components.notifications.listener.ParceledNotificationList f(java.lang.String[] strArr) {
        return new com.google.android.apps.auto.components.notifications.listener.ParceledNotificationList(this.a.c(strArr == null ? null : java.util.Arrays.asList(strArr)));
    }

    public final void g(int i) {
        this.a.h(i);
    }
}
