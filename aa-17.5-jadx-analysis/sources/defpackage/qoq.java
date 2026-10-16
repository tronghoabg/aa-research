package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import android.telecom.PhoneAccountHandle;
import android.util.Log;
import com.google.android.gms.auth.aang.GetTokenRequest;
import com.google.android.gms.car.CarCall;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationReceiver;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class qoq implements smy {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ qoq(String str, int i) {
        this.c = i;
        this.b = str;
        this.a = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, sty] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, sty] */
    @Override // defpackage.smy
    public final void a(Object obj, Object obj2) throws RemoteException {
        ArrayList arrayList;
        stb stbVar;
        switch (this.c) {
            case 0:
                ?? r0 = this.b;
                qot qotVar = new qot((GetTokenRequest) r0, (nok) obj2);
                qop qopVar = (qop) ((qon) obj).v();
                Parcel parcelGh = qopVar.gh();
                ijp.i(parcelGh, qotVar);
                ijp.g(parcelGh, r0);
                qopVar.gj(2, parcelGh);
                return;
            case 1:
                qos qosVar = new qos((nok) obj2);
                qop qopVar2 = (qop) ((qon) obj).v();
                Parcel parcelGh2 = qopVar2.gh();
                ijp.i(parcelGh2, qosVar);
                ijp.g(parcelGh2, this.b);
                qopVar2.gj(1, parcelGh2);
                return;
            case 2:
                ((qvx) ((rni) obj).v()).v((CarCall) this.a, (PhoneAccountHandle) this.b);
                ((nok) obj2).c(null);
                return;
            case 3:
                ((qvx) ((rni) obj).v()).i((CarCall) this.b, (CarCall) this.a);
                ((nok) obj2).c(null);
                return;
            case 4:
                ssd ssdVar = (ssd) obj;
                ssb ssbVar = ssdVar.a;
                WeakReference weakReference = new WeakReference(((ssc) this.a).a);
                Object obj3 = this.b;
                GoogleHelp googleHelp = (GoogleHelp) ((Intent) obj3).getParcelableExtra("EXTRA_GOOGLE_HELP");
                int i = googleHelp.M;
                if (i == 0 || i == 1) {
                    ydx ydxVar = ssg.a;
                    synchronized (ydxVar) {
                        arrayList = new ArrayList(ydxVar);
                    }
                    if (!arrayList.isEmpty()) {
                        googleHelp.N = arrayList;
                    }
                }
                thg thgVar = googleHelp.R;
                try {
                    ssf ssfVar = (ssf) ssdVar.v();
                    sry sryVar = new sry((Intent) obj3, weakReference, thgVar);
                    Parcel parcelGh3 = ssfVar.gh();
                    ijp.g(parcelGh3, googleHelp);
                    ijp.g(parcelGh3, null);
                    ijp.i(parcelGh3, sryVar);
                    ssfVar.gj(2, parcelGh3);
                    return;
                } catch (RemoteException e) {
                    Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
                    return;
                }
            case 5:
                sua suaVar = (sua) obj;
                ?? r2 = this.a;
                smr smrVarB = r2.b();
                smp smpVar = smrVarB.a;
                smpVar.getClass();
                boolean zH = suaVar.H(ssw.j);
                aat aatVar = suaVar.a;
                Object obj4 = this.b;
                synchronized (aatVar) {
                    stb stbVar2 = (stb) aatVar.get(smpVar);
                    if (stbVar2 == null || zH) {
                        stb stbVar3 = new stb(r2);
                        aatVar.put(smpVar, stbVar3);
                        stbVar = stbVar3;
                    } else {
                        stbVar2.a.d(smrVarB);
                        stbVar = stbVar2;
                        stbVar2 = null;
                    }
                    if (zH) {
                        ((stl) suaVar.v()).e(LocationReceiver.b(stbVar2, stbVar, smpVar.a()), (LocationRequest) obj4, new stv(null, (nok) obj2));
                    } else {
                        ((stl) suaVar.v()).g(new LocationRequestUpdateData(1, new LocationRequestInternal((LocationRequest) obj4, null, false, false, false, false, Long.MAX_VALUE), stbVar, null, null, new stx((nok) obj2, stbVar), smpVar.a()));
                    }
                }
                return;
            case 6:
                ((sua) obj).I(this.a, (LocationRequest) this.b, (nok) obj2);
                return;
            case 7:
                int i2 = suq.a;
                sus susVar = new sus((nok) obj2);
                sut sutVar = (sut) ((suu) obj).v();
                Parcel parcelGh4 = sutVar.gh();
                ijp.i(parcelGh4, susVar);
                parcelGh4.writeString((String) this.b);
                parcelGh4.writeString((String) this.a);
                parcelGh4.writeString(null);
                sutVar.gj(11, parcelGh4);
                return;
            case 8:
                int i3 = suq.a;
                sus susVar2 = new sus((nok) obj2);
                sut sutVar2 = (sut) ((suu) obj).v();
                Parcel parcelGh5 = sutVar2.gh();
                ijp.i(parcelGh5, susVar2);
                parcelGh5.writeString((String) this.b);
                parcelGh5.writeByteArray((byte[]) this.a);
                sutVar2.gj(20, parcelGh5);
                return;
            case 9:
                int i4 = suq.a;
                sus susVar3 = new sus((nok) obj2);
                sut sutVar3 = (sut) ((suu) obj).v();
                Parcel parcelGh6 = sutVar3.gh();
                ijp.i(parcelGh6, susVar3);
                parcelGh6.writeString((String) this.b);
                parcelGh6.writeString(null);
                parcelGh6.writeString("");
                parcelGh6.writeString((String) this.a);
                sutVar3.gj(23, parcelGh6);
                return;
            case 10:
                int i5 = suq.a;
                sut sutVar4 = (sut) ((suu) obj).v();
                sur surVar = new sur((smr) this.b, 0);
                Parcel parcelGh7 = sutVar4.gh();
                parcelGh7.writeString((String) this.a);
                ijp.i(parcelGh7, surVar);
                sutVar4.gj(28, parcelGh7);
                return;
            case 11:
                int i6 = suq.a;
                sus susVar4 = new sus((nok) obj2);
                ((sut) ((suu) obj).v()).e(susVar4, "CURRENT:" + ((String) this.a) + ":" + ((String) this.b));
                return;
            default:
                int i7 = suq.a;
                sup supVar = new sup((nok) obj2);
                sut sutVar5 = (sut) ((suu) obj).v();
                byte[] bArrH = ((abmd) this.b).h();
                Parcel parcelGh8 = sutVar5.gh();
                ijp.i(parcelGh8, supVar);
                parcelGh8.writeString((String) this.a);
                parcelGh8.writeByteArray(bArrH);
                sutVar5.gj(25, parcelGh8);
                return;
        }
    }

    public /* synthetic */ qoq(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ qoq(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
