package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.service.notification.NotificationListenerService;
import com.google.android.apps.auto.components.notifications.listener.ParceledNotificationList;

/* loaded from: classes2.dex */
public final class mbh extends ijn implements mbj {
    public mbh(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.components.notifications.listener.INotificationService");
    }

    @Override // defpackage.mbj
    public final NotificationListenerService.RankingMap e() throws RemoteException {
        Parcel parcelGi = gi(8, gh());
        NotificationListenerService.RankingMap rankingMap = (NotificationListenerService.RankingMap) ijp.a(parcelGi, NotificationListenerService.RankingMap.CREATOR);
        parcelGi.recycle();
        return rankingMap;
    }

    @Override // defpackage.mbj
    public final ParceledNotificationList f(String[] strArr) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeStringArray(null);
        Parcel parcelGi = gi(3, parcelGh);
        ParceledNotificationList parceledNotificationList = (ParceledNotificationList) ijp.a(parcelGi, ParceledNotificationList.CREATOR);
        parcelGi.recycle();
        return parceledNotificationList;
    }

    @Override // defpackage.mbj
    public final void g(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gj(6, parcelGh);
    }
}
