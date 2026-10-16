package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ohk extends defpackage.ijv implements defpackage.ohm {
    public ohk(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.components.telecom.service.ICarCallListener");
    }

    @Override // defpackage.ohm
    public final void e(android.telecom.CallAudioState callAudioState) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, callAudioState);
        fs(2, parcelFp);
    }

    @Override // defpackage.ohm
    public final void f(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        fs(3, parcelFp);
    }

    @Override // defpackage.ohm
    public final void g(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        fs(11, parcelFp);
    }

    @Override // defpackage.ohm
    public final void h(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        fs(4, parcelFp);
    }

    @Override // defpackage.ohm
    public final void i(com.google.android.apps.auto.components.telecom.call.CarCall carCall, java.util.List list) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        parcelFp.writeStringList(list);
        fs(9, parcelFp);
    }

    @Override // defpackage.ohm
    public final void j(com.google.android.apps.auto.components.telecom.call.CarCall carCall, java.util.List list) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        parcelFp.writeTypedList(list);
        fs(7, parcelFp);
    }

    @Override // defpackage.ohm
    public final void k(com.google.android.apps.auto.components.telecom.call.CarCall carCall, java.util.List list) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        parcelFp.writeTypedList(list);
        fs(12, parcelFp);
    }

    @Override // defpackage.ohm
    public final void l(com.google.android.apps.auto.components.telecom.call.CarCall carCall, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        parcelFp.writeString(str);
        fs(15, parcelFp);
    }

    @Override // defpackage.ohm
    public final void m(com.google.android.apps.auto.components.telecom.call.CarCall carCall, com.google.android.apps.auto.components.telecom.call.CarCall.Details details) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        defpackage.ijx.g(parcelFp, details);
        fs(8, parcelFp);
    }

    @Override // defpackage.ohm
    public final void n(com.google.android.apps.auto.components.telecom.call.CarCall carCall, com.google.android.apps.auto.components.telecom.call.CarCall carCall2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        defpackage.ijx.g(parcelFp, carCall2);
        fs(6, parcelFp);
    }

    @Override // defpackage.ohm
    public final void o(com.google.android.apps.auto.components.telecom.call.CarCall carCall, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        parcelFp.writeInt(i);
        fs(14, parcelFp);
    }

    @Override // defpackage.ohm
    public final void p(com.google.android.apps.auto.components.telecom.call.CarCall carCall, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        parcelFp.writeString(str);
        fs(10, parcelFp);
    }

    @Override // defpackage.ohm
    public final void q(com.google.android.apps.auto.components.telecom.call.CarCall carCall, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        parcelFp.writeInt(i);
        fs(5, parcelFp);
    }

    @Override // defpackage.ohm
    public final void r(com.google.android.apps.auto.components.telecom.call.CarCall carCall, android.net.Uri uri) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        defpackage.ijx.g(parcelFp, uri);
        fs(16, parcelFp);
    }

    @Override // defpackage.ohm
    public final void s(com.google.android.apps.auto.components.telecom.call.CarCall carCall, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        parcelFp.writeInt(z ? 1 : 0);
        fs(17, parcelFp);
    }
}
