package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ogx extends defpackage.ijv implements defpackage.ogz {
    public ogx(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.components.telecom.service.ICarCall");
    }

    @Override // defpackage.ogz
    public final void A(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        fr(13, parcelFp);
    }

    @Override // defpackage.ogz
    public final boolean B() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(2, fp());
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.ogz
    public final boolean C(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        android.os.Parcel parcelFq = fq(30, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.ogz
    public final boolean D(defpackage.ohm ohmVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, ohmVar);
        android.os.Parcel parcelFq = fq(7, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.ogz
    public final boolean E(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        android.os.Parcel parcelFq = fq(29, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.ogz
    public final boolean F(defpackage.ohm ohmVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, ohmVar);
        android.os.Parcel parcelFq = fq(8, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.ogz
    public final void G() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.ogz
    public final int e() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(5, fp());
        int i = parcelFq.readInt();
        parcelFq.recycle();
        return i;
    }

    @Override // defpackage.ogz
    public final int f() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(4, fp());
        int i = parcelFq.readInt();
        parcelFq.recycle();
        return i;
    }

    @Override // defpackage.ogz
    public final android.telecom.CallAudioState g() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(28, fp());
        android.telecom.CallAudioState callAudioState = (android.telecom.CallAudioState) defpackage.ijx.a(parcelFq, android.telecom.CallAudioState.CREATOR);
        parcelFq.recycle();
        return callAudioState;
    }

    @Override // defpackage.ogz
    public final java.util.List h() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(1, fp());
        java.util.ArrayList arrayListCreateTypedArrayList = parcelFq.createTypedArrayList(com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
        parcelFq.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.ogz
    public final void i(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        fr(9, parcelFp);
    }

    @Override // defpackage.ogz
    public final void j(com.google.android.apps.auto.components.telecom.call.CarCall carCall, com.google.android.apps.auto.components.telecom.call.CarCall carCall2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        defpackage.ijx.g(parcelFp, carCall2);
        fr(17, parcelFp);
    }

    @Override // defpackage.ogz
    public final void k(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        fr(11, parcelFp);
    }

    @Override // defpackage.ogz
    public final void l() throws android.os.RemoteException {
        fr(20, fp());
    }

    @Override // defpackage.ogz
    public final void m(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        fr(12, parcelFp);
    }

    @Override // defpackage.ogz
    public final void n(com.google.android.apps.auto.components.telecom.call.CarCall carCall, android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        defpackage.ijx.g(parcelFp, phoneAccountHandle);
        parcelFp.writeInt(0);
        fr(26, parcelFp);
    }

    @Override // defpackage.ogz
    public final void o(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        fr(19, parcelFp);
    }

    @Override // defpackage.ogz
    public final void p(android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.ogz
    public final void q(com.google.android.apps.auto.components.telecom.call.CarCall carCall, char c) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        parcelFp.writeInt(c);
        fr(14, parcelFp);
    }

    @Override // defpackage.ogz
    public final void r(com.google.android.apps.auto.components.telecom.call.CarCall carCall, boolean z) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.ogz
    public final void s(com.google.android.apps.auto.components.telecom.call.CarCall carCall, boolean z, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        parcelFp.writeInt(0);
        parcelFp.writeString("");
        fr(10, parcelFp);
    }

    @Override // defpackage.ogz
    public final void t(android.bluetooth.BluetoothDevice bluetoothDevice) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, bluetoothDevice);
        fr(27, parcelFp);
    }

    @Override // defpackage.ogz
    public final void u(com.google.android.apps.auto.components.telecom.call.CarCall carCall, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        parcelFp.writeInt(z ? 1 : 0);
        fr(31, parcelFp);
    }

    @Override // defpackage.ogz
    public final void v(com.google.android.apps.auto.components.telecom.call.CarCall carCall, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        parcelFp.writeString("android.telecom.event.LOCAL_CALL_SILENCE_STATE_CHANGED");
        defpackage.ijx.g(parcelFp, bundle);
        fr(23, parcelFp);
    }

    @Override // defpackage.ogz
    public final void w(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fr(6, parcelFp);
    }

    @Override // defpackage.ogz
    public final void x(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fr(3, parcelFp);
    }

    @Override // defpackage.ogz
    public final void y(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.ogz
    public final void z(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        fr(15, parcelFp);
    }
}
