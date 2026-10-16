package defpackage;

import android.content.Intent;
import androidx.car.app.CarContext;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import androidx.car.app.utils.RemoteUtils;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class a2 implements RemoteUtils.RemoteCall {
    public final /* synthetic */ int a;
    public final /* synthetic */ IStartCarApp b;
    public final /* synthetic */ Intent c;

    public /* synthetic */ a2(IStartCarApp iStartCarApp, Intent intent, int i) {
        this.a = i;
        this.b = iStartCarApp;
        this.c = intent;
    }

    @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
    public final Object call() {
        switch (this.a) {
            case 0:
                return CarAppNotificationBroadcastReceiver.lambda$onReceive$0(this.b, this.c);
            default:
                return CarContext.lambda$startCarApp$1(this.b, this.c);
        }
    }
}
