package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class qxf extends ijo implements qxg {
    final /* synthetic */ rfe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxf(rfe rfeVar) {
        super("com.google.android.gms.car.ICarMicrophoneDiagnosticsListener");
        this.a = rfeVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.qxg
    public final void e(byte[] bArr) {
        oub oubVar = oub.a;
        oub oubVar2 = (oub) rfe.a(bArr, abnv.L(oub.class), "MicrophoneSessionDiagnostics");
        rfe rfeVar = this.a;
        synchronized (rfeVar) {
            for (rfd rfdVar : rfeVar.f) {
                ((sss) rfeVar.b).post(new rfc(rfdVar, oubVar2, 2));
            }
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        ijp.d(parcel);
        e(bArrCreateByteArray);
        return true;
    }
}
