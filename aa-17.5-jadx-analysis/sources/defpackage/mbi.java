package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.service.notification.NotificationListenerService;
import com.google.android.apps.auto.components.notifications.listener.ParceledNotificationList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class mbi extends ijo implements mbj {
    final /* synthetic */ mbw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbi(mbw mbwVar) {
        super("com.google.android.apps.auto.components.notifications.listener.INotificationService");
        this.a = mbwVar;
    }

    @Override // defpackage.mbj
    public final NotificationListenerService.RankingMap e() {
        return this.a.a();
    }

    @Override // defpackage.mbj
    public final ParceledNotificationList f(String[] strArr) {
        return new ParceledNotificationList(this.a.c(strArr == null ? null : Arrays.asList(strArr)));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 3) {
            String[] strArrCreateStringArray = parcel.createStringArray();
            ijp.d(parcel);
            ParceledNotificationList parceledNotificationListF = f(strArrCreateStringArray);
            parcel2.writeNoException();
            ijp.h(parcel2, parceledNotificationListF);
            return true;
        }
        if (i == 6) {
            int i2 = parcel.readInt();
            ijp.d(parcel);
            g(i2);
            parcel2.writeNoException();
            return true;
        }
        if (i != 8) {
            return false;
        }
        NotificationListenerService.RankingMap rankingMapE = e();
        parcel2.writeNoException();
        ijp.h(parcel2, rankingMapE);
        return true;
    }

    @Override // defpackage.mbj
    public final void g(int i) {
        this.a.h(i);
    }
}
