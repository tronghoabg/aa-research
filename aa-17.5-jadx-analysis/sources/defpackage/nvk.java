package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class nvk extends ijo implements nvl {
    final /* synthetic */ nvo a;
    final /* synthetic */ yzy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvk(nvo nvoVar, yzy yzyVar) {
        super("com.google.android.apps.auto.components.system.notification.quickfeedback.IOnFeedbackCallback");
        this.a = nvoVar;
        this.b = yzyVar;
    }

    @Override // defpackage.nvl
    public final void e() {
        szp.u(new ily(19));
        nvo nvoVar = this.a;
        if (nvoVar != null) {
            nvoVar.a(this.b);
        }
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
