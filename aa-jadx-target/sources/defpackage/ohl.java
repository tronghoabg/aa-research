package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ohl extends defpackage.ijw implements defpackage.ohm {
    public final /* synthetic */ defpackage.ofv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohl(defpackage.ofv ofvVar) {
        super("com.google.android.apps.auto.components.telecom.service.ICarCallListener");
        this.a = ofvVar;
    }

    @Override // defpackage.ohm
    public final void e(android.telecom.CallAudioState callAudioState) throws android.os.RemoteException {
        defpackage.tna.j(new defpackage.mbx(this, callAudioState, 20));
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                android.view.KeyEvent keyEvent = (android.view.KeyEvent) defpackage.ijx.a(parcel, android.view.KeyEvent.CREATOR);
                defpackage.ijx.d(parcel);
                defpackage.tna.j(new oft(this, keyEvent, 2));
                return true;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                android.telecom.CallAudioState callAudioState = (android.telecom.CallAudioState) defpackage.ijx.a(parcel, android.telecom.CallAudioState.CREATOR);
                defpackage.ijx.d(parcel);
                e(callAudioState);
                return true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                f(carCall);
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall2 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                h(carCall2);
                return true;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall3 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                int i2 = parcel.readInt();
                defpackage.ijx.d(parcel);
                q(carCall3, i2);
                return true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall4 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                com.google.android.apps.auto.components.telecom.call.CarCall carCall5 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                n(carCall4, carCall5);
                return true;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall6 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                j(carCall6, arrayListCreateTypedArrayList);
                return true;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall7 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                com.google.android.apps.auto.components.telecom.call.CarCall.Details details = (com.google.android.apps.auto.components.telecom.call.CarCall.Details) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.Details.CREATOR);
                defpackage.ijx.d(parcel);
                m(carCall7, details);
                return true;
            case 9:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall8 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                java.util.ArrayList<java.lang.String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                defpackage.ijx.d(parcel);
                i(carCall8, arrayListCreateStringArrayList);
                return true;
            case 10:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall9 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                java.lang.String string = parcel.readString();
                defpackage.ijx.d(parcel);
                p(carCall9, string);
                return true;
            case 11:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall10 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                g(carCall10);
                return true;
            case 12:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall11 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                java.util.ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                k(carCall11, arrayListCreateTypedArrayList2);
                return true;
            case 13:
                com.google.android.apps.auto.components.telecom.call.CarCall carCallA = defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                parcel.readString();
                defpackage.ijx.d(parcel);
                this.a.D(carCallA);
                return true;
            case 14:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall12 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                int i3 = parcel.readInt();
                defpackage.ijx.d(parcel);
                o(carCall12, i3);
                return true;
            case 15:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall13 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                java.lang.String string2 = parcel.readString();
                defpackage.ijx.d(parcel);
                l(carCall13, string2);
                return true;
            case 16:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall14 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                android.net.Uri uri = (android.net.Uri) defpackage.ijx.a(parcel, android.net.Uri.CREATOR);
                defpackage.ijx.d(parcel);
                r(carCall14, uri);
                return true;
            case 17:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall15 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                boolean zJ = defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                s(carCall15, zJ);
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.ohm
    public final void f(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws android.os.RemoteException {
        if (this.a.D(carCall)) {
            defpackage.tna.j(new oft(this, carCall, 3));
            return;
        }
        android.content.ComponentName componentNameB = defpackage.mkc.R().b(carCall);
        if (carCall.e == 2) {
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, defpackage.zbd.at);
            rrvVarH.p(componentNameB);
            defpackage.omf.u().F(rrvVarH.l());
        }
        defpackage.rrv rrvVarH2 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, defpackage.zbd.as);
        rrvVarH2.p(componentNameB);
        defpackage.omf.u().F(rrvVarH2.l());
    }

    @Override // defpackage.ohm
    public final void g(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws android.os.RemoteException {
        if (this.a.D(carCall)) {
            defpackage.tna.j(new oft(this, carCall, 0));
        }
    }

    @Override // defpackage.ohm
    public final void h(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws android.os.RemoteException {
        if (this.a.D(carCall)) {
            defpackage.tna.j(new oft(this, carCall, 1));
        }
    }

    @Override // defpackage.ohm
    public final void i(com.google.android.apps.auto.components.telecom.call.CarCall carCall, java.util.List list) throws android.os.RemoteException {
        if (this.a.D(carCall)) {
            defpackage.tna.j(new ofs(this, carCall, list, 4, (char[]) null));
        }
    }

    @Override // defpackage.ohm
    public final void j(com.google.android.apps.auto.components.telecom.call.CarCall carCall, java.util.List list) throws android.os.RemoteException {
        if (this.a.D(carCall)) {
            defpackage.tna.j(new ofs(this, carCall, list, 6, (char[]) null));
        }
    }

    @Override // defpackage.ohm
    public final void k(com.google.android.apps.auto.components.telecom.call.CarCall carCall, java.util.List list) throws android.os.RemoteException {
        if (this.a.D(carCall)) {
            defpackage.tna.j(new ofs(this, carCall, list, 7, (char[]) null));
        }
    }

    @Override // defpackage.ohm
    public final void l(com.google.android.apps.auto.components.telecom.call.CarCall carCall, java.lang.String str) {
        defpackage.ofv ofvVar = this.a;
        if (ofvVar.D(carCall)) {
            ofvVar.g.put(carCall, str);
            defpackage.tna.j(new ofs(this, carCall, str, 2, (char[]) null));
        }
    }

    @Override // defpackage.ohm
    public final void m(com.google.android.apps.auto.components.telecom.call.CarCall carCall, com.google.android.apps.auto.components.telecom.call.CarCall.Details details) throws android.os.RemoteException {
        if (this.a.D(carCall)) {
            defpackage.tna.j(new ofs(this, carCall, details, 0));
        }
    }

    @Override // defpackage.ohm
    public final void n(com.google.android.apps.auto.components.telecom.call.CarCall carCall, com.google.android.apps.auto.components.telecom.call.CarCall carCall2) throws android.os.RemoteException {
        if (this.a.D(carCall)) {
            defpackage.tna.j(new ofs(this, carCall, carCall2, 8, (short[]) null));
        }
    }

    @Override // defpackage.ohm
    public final void o(com.google.android.apps.auto.components.telecom.call.CarCall carCall, int i) {
        defpackage.ofv ofvVar = this.a;
        if (ofvVar.D(carCall)) {
            ofvVar.f.put(carCall, java.lang.Integer.valueOf(i));
            defpackage.tna.j(new oc(this, carCall, i, 9, (byte[]) null));
        }
    }

    @Override // defpackage.ohm
    public final void p(com.google.android.apps.auto.components.telecom.call.CarCall carCall, java.lang.String str) throws android.os.RemoteException {
        if (this.a.D(carCall)) {
            defpackage.tna.j(new ofs(this, carCall, str, 3, (char[]) null));
        }
    }

    @Override // defpackage.ohm
    public final void q(com.google.android.apps.auto.components.telecom.call.CarCall carCall, int i) throws android.os.RemoteException {
        if (this.a.D(carCall)) {
            defpackage.tna.j(new oc(this, carCall, i, 8, (byte[]) null));
        }
    }

    @Override // defpackage.ohm
    public final void r(com.google.android.apps.auto.components.telecom.call.CarCall carCall, android.net.Uri uri) {
        defpackage.ofv ofvVar = this.a;
        if (ofvVar.D(carCall)) {
            ofvVar.h.put(carCall, uri);
            defpackage.tna.j(new ofs(this, carCall, uri, 5));
        }
    }

    @Override // defpackage.ohm
    public final void s(com.google.android.apps.auto.components.telecom.call.CarCall carCall, boolean z) {
        if (this.a.D(carCall)) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.ofv.a.f()).ai(5751)).E("onVoipCallSilenceStateChanged, updating value for call %s to %s", carCall.a, z);
            defpackage.tna.j(new defpackage.ocy(this, 10));
        }
    }
}
