package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.model.Action;
import androidx.car.app.model.Alert;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class jyo extends ijo implements jyp {
    final /* synthetic */ Consumer a;
    final /* synthetic */ Action b;
    final /* synthetic */ Alert c;
    public final /* synthetic */ jym d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyo(jym jymVar, Consumer consumer, Action action, Alert alert) {
        super("com.google.android.apps.auto.components.apphost.notification.IAlertToNotificationEvent");
        this.a = consumer;
        this.b = action;
        this.c = alert;
        this.d = jymVar;
    }

    @Override // defpackage.jyp
    public final void e() {
        this.a.andThen(new kqa(this, this.b, 1, null)).accept(this.c);
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        e();
        parcel2.writeNoException();
        return true;
    }
}
