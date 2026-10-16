package defpackage;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.telecom.CallAudioState;
import android.view.KeyEvent;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ogr extends ijo implements ogs {
    public final /* synthetic */ ofb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogr(ofb ofbVar) {
        super("com.google.android.apps.auto.components.telecom.service.ICarCallListener");
        this.a = ofbVar;
    }

    @Override // defpackage.ogs
    public final void e(CallAudioState callAudioState) throws RemoteException {
        szp.v(new mgw(this, callAudioState, 17));
    }

    @Override // defpackage.ogs
    public final void f(CarCall carCall) throws RemoteException {
        if (this.a.D(carCall)) {
            szp.v(new ojl(this, carCall, 1));
            return;
        }
        ComponentName componentNameB = mcd.A().b(carCall);
        if (carCall.e == 2) {
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL, yzy.at);
            rrbVarH.p(componentNameB);
            ebf.j().F(rrbVarH.l());
        }
        rrb rrbVarH2 = rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL, yzy.as);
        rrbVarH2.p(componentNameB);
        ebf.j().F(rrbVarH2.l());
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i) {
            case 1:
                KeyEvent keyEvent = (KeyEvent) ijp.a(parcel, KeyEvent.CREATOR);
                ijp.d(parcel);
                szp.v(new mgw(this, keyEvent, 20));
                return true;
            case 2:
                CallAudioState callAudioState = (CallAudioState) ijp.a(parcel, CallAudioState.CREATOR);
                ijp.d(parcel);
                e(callAudioState);
                return true;
            case 3:
                CarCall carCall = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.d(parcel);
                f(carCall);
                return true;
            case 4:
                CarCall carCall2 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.d(parcel);
                h(carCall2);
                return true;
            case 5:
                CarCall carCall3 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                int i2 = parcel.readInt();
                ijp.d(parcel);
                q(carCall3, i2);
                return true;
            case 6:
                CarCall carCall4 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                CarCall carCall5 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.d(parcel);
                n(carCall4, carCall5);
                return true;
            case 7:
                CarCall carCall6 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(CarCall.CREATOR);
                ijp.d(parcel);
                j(carCall6, arrayListCreateTypedArrayList);
                return true;
            case 8:
                CarCall carCall7 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                CarCall.Details details = (CarCall.Details) ijp.a(parcel, CarCall.Details.CREATOR);
                ijp.d(parcel);
                m(carCall7, details);
                return true;
            case 9:
                CarCall carCall8 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                ijp.d(parcel);
                i(carCall8, arrayListCreateStringArrayList);
                return true;
            case 10:
                CarCall carCall9 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                String string = parcel.readString();
                ijp.d(parcel);
                p(carCall9, string);
                return true;
            case 11:
                CarCall carCall10 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.d(parcel);
                g(carCall10);
                return true;
            case 12:
                CarCall carCall11 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(CarCall.CREATOR);
                ijp.d(parcel);
                k(carCall11, arrayListCreateTypedArrayList2);
                return true;
            case 13:
                CarCall carCall12 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                parcel.readString();
                ijp.d(parcel);
                this.a.D(carCall12);
                return true;
            case 14:
                CarCall carCall13 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                int i3 = parcel.readInt();
                ijp.d(parcel);
                o(carCall13, i3);
                return true;
            case 15:
                CarCall carCall14 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                String string2 = parcel.readString();
                ijp.d(parcel);
                l(carCall14, string2);
                return true;
            case 16:
                CarCall carCall15 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                Uri uri = (Uri) ijp.a(parcel, Uri.CREATOR);
                ijp.d(parcel);
                r(carCall15, uri);
                return true;
            case 17:
                CarCall carCall16 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                boolean zJ = ijp.j(parcel);
                ijp.d(parcel);
                s(carCall16, zJ);
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.ogs
    public final void g(CarCall carCall) throws RemoteException {
        if (this.a.D(carCall)) {
            szp.v(new mgw(this, carCall, 19));
        }
    }

    @Override // defpackage.ogs
    public final void h(CarCall carCall) throws RemoteException {
        if (this.a.D(carCall)) {
            szp.v(new mgw(this, carCall, 18));
        }
    }

    @Override // defpackage.ogs
    public final void i(CarCall carCall, List list) throws RemoteException {
        if (this.a.D(carCall)) {
            szp.v(new oey(this, carCall, list, 3));
        }
    }

    @Override // defpackage.ogs
    public final void j(CarCall carCall, List list) throws RemoteException {
        if (this.a.D(carCall)) {
            szp.v(new oey(this, carCall, list, 5));
        }
    }

    @Override // defpackage.ogs
    public final void k(CarCall carCall, List list) throws RemoteException {
        if (this.a.D(carCall)) {
            szp.v(new oey(this, carCall, list, 6));
        }
    }

    @Override // defpackage.ogs
    public final void l(CarCall carCall, String str) {
        ofb ofbVar = this.a;
        if (ofbVar.D(carCall)) {
            ofbVar.g.put(carCall, str);
            szp.v(new oey(this, carCall, str, 0));
        }
    }

    @Override // defpackage.ogs
    public final void m(CarCall carCall, CarCall.Details details) throws RemoteException {
        if (this.a.D(carCall)) {
            szp.v(new oey((Object) this, (Object) carCall, (Object) details, 1, (byte[]) null));
        }
    }

    @Override // defpackage.ogs
    public final void n(CarCall carCall, CarCall carCall2) throws RemoteException {
        if (this.a.D(carCall)) {
            szp.v(new oey(this, carCall, carCall2, 7, (char[]) null));
        }
    }

    @Override // defpackage.ogs
    public final void o(CarCall carCall, int i) {
        ofb ofbVar = this.a;
        if (ofbVar.D(carCall)) {
            ofbVar.f.put(carCall, Integer.valueOf(i));
            szp.v(new oa(this, carCall, i, 9));
        }
    }

    @Override // defpackage.ogs
    public final void p(CarCall carCall, String str) throws RemoteException {
        if (this.a.D(carCall)) {
            szp.v(new oey(this, carCall, str, 2));
        }
    }

    @Override // defpackage.ogs
    public final void q(CarCall carCall, int i) throws RemoteException {
        if (this.a.D(carCall)) {
            szp.v(new oa(this, carCall, i, 8));
        }
    }

    @Override // defpackage.ogs
    public final void r(CarCall carCall, Uri uri) {
        ofb ofbVar = this.a;
        if (ofbVar.D(carCall)) {
            ofbVar.h.put(carCall, uri);
            szp.v(new oey((Object) this, (Object) carCall, (Object) uri, 4, (byte[]) null));
        }
    }

    @Override // defpackage.ogs
    public final void s(CarCall carCall, boolean z) {
        if (this.a.D(carCall)) {
            ((ype) ((ype) ofb.a.f()).ai(5725)).E("onVoipCallSilenceStateChanged, updating value for call %s to %s", carCall.a, z);
            szp.v(new oez(this, 0));
        }
    }
}
