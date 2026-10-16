package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ohe implements defpackage.ohi {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ohe(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ohi
    public final void a(defpackage.ohm ohmVar) throws android.os.RemoteException {
        int i = this.b;
        if (i == 0) {
            ohmVar.h((com.google.android.apps.auto.components.telecom.call.CarCall) this.a);
            return;
        }
        if (i == 1) {
            int i2 = defpackage.ohd.b;
            com.google.android.apps.auto.components.telecom.call.CarCall carCall = (com.google.android.apps.auto.components.telecom.call.CarCall) this.a;
            ohmVar.m(carCall, carCall.f);
        } else {
            if (i == 2) {
                ohmVar.f((com.google.android.apps.auto.components.telecom.call.CarCall) this.a);
                return;
            }
            java.lang.Object obj = this.a;
            if (i != 3) {
                ohmVar.e((android.telecom.CallAudioState) obj);
            } else {
                ohmVar.h((com.google.android.apps.auto.components.telecom.call.CarCall) obj);
            }
        }
    }
}
