package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qvv extends defpackage.ijv implements defpackage.qvx {
    public qvv(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarAudio");
    }

    @Override // defpackage.qvx
    public final int b(int i, int i2) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qvx
    public final int c(int i, int i2) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qvx
    public final com.google.android.gms.car.CarAudioConfiguration d(int i, int i2) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qvx
    public final com.google.android.gms.car.CarAudioConfiguration f(int i, int i2) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qvx
    public final void g(qwj qwjVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qwjVar);
        fr(13, parcelFp);
    }

    @Override // defpackage.qvx
    public final void h(qyc qycVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qycVar);
        fr(15, parcelFp);
    }

    @Override // defpackage.qvx
    public final void k(qwj qwjVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qwjVar);
        fr(14, parcelFp);
    }

    @Override // defpackage.qvx
    public final void l(qyc qycVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qycVar);
        fr(16, parcelFp);
    }

    @Override // defpackage.qvx
    public final boolean m(long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qvx
    public final boolean n(long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qvx
    public final int[] o() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(2, fp());
        int[] iArrCreateIntArray = parcelFq.createIntArray();
        parcelFq.recycle();
        return iArrCreateIntArray;
    }

    @Override // defpackage.qvx
    public final int[] p() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qvx
    public final com.google.android.gms.car.CarAudioConfiguration[] q(int i) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qvx
    public final com.google.android.gms.car.CarAudioConfiguration[] r(int i) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qvx
    public final qwd s(qwa qwaVar, int i) throws android.os.RemoteException {
        qwd qwbVar;
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qwaVar);
        parcelFp.writeInt(0);
        parcelFp.writeInt(0);
        parcelFp.writeInt(512);
        android.os.Parcel parcelFq = fq(10, parcelFp);
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            qwbVar = null;
        } else {
            qwd qwdVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarAudioRecord");
            qwbVar = qwdVarQueryLocalInterface instanceof qwd ? qwdVarQueryLocalInterface : new defpackage.qwb(strongBinder);
        }
        parcelFq.recycle();
        return qwbVar;
    }

    @Override // defpackage.qvx
    public final qwk t() throws android.os.RemoteException {
        throw null;
    }
}
