package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class qvm extends ijo implements qvn {
    final /* synthetic */ rfe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvm(rfe rfeVar) {
        super("com.google.android.gms.car.ICarAudioStreamDiagnosticsListener");
        this.a = rfeVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.qvn
    public final void e(byte[] bArr) {
        ots otsVar = ots.a;
        ots otsVar2 = (ots) rfe.a(bArr, abnv.L(ots.class), "AudioStreamDiagnostics");
        rfe rfeVar = this.a;
        synchronized (rfeVar) {
            for (rfb rfbVar : rfeVar.d) {
                ((sss) rfeVar.b).post(new rfc(rfbVar, otsVar2, 0));
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
