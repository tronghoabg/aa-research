package defpackage;

import android.os.RemoteException;
import android.view.KeyEvent;

/* loaded from: classes2.dex */
final class rmx extends rng {
    final /* synthetic */ KeyEvent a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rmx(KeyEvent keyEvent) {
        super("dispatchPhoneKeyEvent");
        this.a = keyEvent;
    }

    @Override // defpackage.rng
    public final void a(qwa qwaVar) throws RemoteException {
        qwaVar.e(this.a);
    }
}
