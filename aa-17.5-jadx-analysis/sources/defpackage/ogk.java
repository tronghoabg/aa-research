package defpackage;

import android.os.RemoteException;
import android.telecom.CallAudioState;
import com.google.android.apps.auto.components.telecom.call.CarCall;

/* loaded from: classes2.dex */
public final /* synthetic */ class ogk implements ogo {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ogk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ogo
    public final void a(ogs ogsVar) throws RemoteException {
        int i = this.b;
        if (i == 0) {
            ogsVar.h((CarCall) this.a);
            return;
        }
        if (i == 1) {
            int i2 = ogj.b;
            CarCall carCall = (CarCall) this.a;
            ogsVar.m(carCall, carCall.f);
        } else {
            if (i == 2) {
                ogsVar.f((CarCall) this.a);
                return;
            }
            Object obj = this.a;
            if (i != 3) {
                ogsVar.e((CallAudioState) obj);
            } else {
                ogsVar.h((CarCall) obj);
            }
        }
    }
}
