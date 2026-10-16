package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.Stack;

/* loaded from: classes2.dex */
public final class ove extends ijo implements ovf {
    final /* synthetic */ ogz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ove(ogz ogzVar) {
        super("com.google.android.apps.auto.sdk.IDrawerCallback");
        this.a = ogzVar;
    }

    @Override // defpackage.ovf
    public final void e() {
        Log.d("CSL.MenuController", "onDrawerClosed");
        ((Stack) ((oct) this.a.b).a).clear();
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            if (i == 2) {
                h();
            } else if (i == 3) {
                e();
            } else if (i != 4) {
                return false;
            }
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.ovf
    public final void h() {
        Log.d("CSL.MenuController", "onDrawerOpening");
        ((Stack) ((oct) this.a.b).a).clear();
    }

    @Override // defpackage.ovf
    public final void f() {
    }

    @Override // defpackage.ovf
    public final void g() {
    }
}
