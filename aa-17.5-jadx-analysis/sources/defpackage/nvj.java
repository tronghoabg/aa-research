package defpackage;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class nvj extends ijn implements nvl {
    public nvj(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.components.system.notification.quickfeedback.IOnFeedbackCallback");
    }

    @Override // defpackage.nvl
    public final void e() throws RemoteException {
        gj(2, gh());
    }
}
