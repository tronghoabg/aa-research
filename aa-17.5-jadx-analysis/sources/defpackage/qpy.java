package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.car.CarCall;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.internal.LocationReceiver;

/* loaded from: classes2.dex */
public final /* synthetic */ class qpy implements smy {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qpy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v29, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v32, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v33, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v34, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v35, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v36, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v39, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.smy
    public final void a(Object obj, Object obj2) throws RemoteException {
        switch (this.b) {
            case 0:
                ((qvx) ((rni) obj).v()).l((CarCall) this.a);
                ((nok) obj2).c(null);
                return;
            case 1:
                ((qvx) ((rni) obj).v()).m((String) this.a);
                ((nok) obj2).c(null);
                return;
            case 2:
                ((qvx) ((rni) obj).v()).z((CarCall) this.a);
                ((nok) obj2).c(null);
                return;
            case 3:
                rni rniVar = (rni) obj;
                Object obj3 = this.a;
                smp smpVar = ((smr) obj3).a;
                if (smpVar != null) {
                    aat aatVar = rniVar.a;
                    synchronized (aatVar) {
                        rnh rnhVar = (rnh) aatVar.get(smpVar);
                        if (rnhVar == null || !rnhVar.a.c()) {
                            rnhVar = new rnh((smr) obj3);
                            aatVar.put(((smr) obj3).a, rnhVar);
                        }
                        ((qvx) rniVar.v()).t(rnhVar);
                    }
                }
                ((nok) obj2).c(null);
                return;
            case 4:
                rni rniVar2 = (rni) obj;
                smp smpVar2 = ((smr) this.a).a;
                aat aatVar2 = rniVar2.a;
                synchronized (aatVar2) {
                    rnh rnhVar2 = (rnh) aatVar2.remove(smpVar2);
                    if (rnhVar2 != null) {
                        ((qvx) rniVar2.v()).u(rnhVar2);
                    } else {
                        rrd.d(5, "CAR.TEL.CLIENT", null, "Tried to unregister nonexistent listener", new Object[0]);
                    }
                }
                ((nok) obj2).c(true);
                return;
            case 5:
                ((qvx) ((rni) obj).v()).r((CarCall) this.a);
                ((nok) obj2).c(null);
                return;
            case 6:
                ((qvx) ((rni) obj).v()).h((CarCall) this.a);
                ((nok) obj2).c(null);
                return;
            case 7:
                ((qvx) ((rni) obj).v()).j((CarCall) this.a);
                ((nok) obj2).c(null);
                return;
            case 8:
                ((qvx) ((rni) obj).v()).q((CarCall) this.a);
                ((nok) obj2).c(null);
                return;
            case 9:
                sjd sjdVar = (sjd) obj;
                sjm sjmVar = sjc.a;
                siz sizVar = new siz((nok) obj2);
                ?? r8 = this.a;
                try {
                    sjf sjfVar = (sjf) sjdVar.v();
                    Parcel parcelGh = sjfVar.gh();
                    ijp.i(parcelGh, sizVar);
                    ijp.g(parcelGh, r8);
                    sjfVar.gk(8, parcelGh);
                    return;
                } catch (RemoteException | RuntimeException e) {
                    Log.e("ClearcutLoggerApiImpl", "Failed to call logError", e);
                    throw e;
                }
            case 10:
                sjp sjpVar = (sjp) ((sjo) obj).v();
                qwr qwrVar = new qwr((nok) obj2, 2);
                Parcel parcelGh2 = sjpVar.gh();
                ijp.g(parcelGh2, this.a);
                ijp.i(parcelGh2, qwrVar);
                sjpVar.gk(2, parcelGh2);
                return;
            case 11:
                soy soyVar = (soy) ((sow) obj).v();
                Parcel parcelGh3 = soyVar.gh();
                ijp.g(parcelGh3, this.a);
                soyVar.gk(1, parcelGh3);
                ((nok) obj2).e(null);
                return;
            case 12:
                spa spaVar = (spa) ((sox) obj).v();
                Parcel parcelGh4 = spaVar.gh();
                ijp.g(parcelGh4, this.a);
                spaVar.gk(1, parcelGh4);
                ((nok) obj2).e(null);
                return;
            case 13:
                soz sozVar = (soz) ((sph) obj).v();
                Parcel parcelGh5 = sozVar.gh();
                ijp.g(parcelGh5, this.a);
                sozVar.gk(1, parcelGh5);
                ((nok) obj2).e(null);
                return;
            case 14:
                sua suaVar = (sua) obj;
                boolean zH = suaVar.H(ssw.i);
                ?? r82 = this.a;
                if (!zH) {
                    stl stlVar = (stl) suaVar.v();
                    Parcel parcelGh6 = stlVar.gh();
                    ijp.g(parcelGh6, r82);
                    parcelGh6.writeInt(1);
                    stlVar.gj(26, parcelGh6);
                    ((nok) obj2).e(null);
                    return;
                }
                stl stlVar2 = (stl) suaVar.v();
                stv stvVar = new stv(null, (nok) obj2);
                Parcel parcelGh7 = stlVar2.gh();
                ijp.g(parcelGh7, r82);
                parcelGh7.writeInt(1);
                ijp.i(parcelGh7, stvVar);
                stlVar2.gj(86, parcelGh7);
                return;
            case 15:
                sua suaVar2 = (sua) obj;
                boolean zH2 = suaVar2.H(ssw.j);
                ?? r83 = this.a;
                if (zH2) {
                    stl stlVar3 = (stl) suaVar2.v();
                    LocationReceiver locationReceiver = new LocationReceiver(4, null, new sur((nok) obj2, 1), null, null);
                    Parcel parcelGh8 = stlVar3.gh();
                    ijp.g(parcelGh8, r83);
                    ijp.g(parcelGh8, locationReceiver);
                    Parcel parcelGi = stlVar3.gi(92, parcelGh8);
                    IBinder strongBinder = parcelGi.readStrongBinder();
                    if (strongBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
                        if (iInterfaceQueryLocalInterface instanceof soi) {
                        }
                    }
                    parcelGi.recycle();
                    return;
                }
                if (suaVar2.H(ssw.e)) {
                    stl stlVar4 = (stl) suaVar2.v();
                    sur surVar = new sur((nok) obj2, 1);
                    Parcel parcelGh9 = stlVar4.gh();
                    ijp.g(parcelGh9, r83);
                    ijp.i(parcelGh9, surVar);
                    Parcel parcelGi2 = stlVar4.gi(87, parcelGh9);
                    IBinder strongBinder2 = parcelGi2.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
                        if (iInterfaceQueryLocalInterface2 instanceof soi) {
                        }
                    }
                    parcelGi2.recycle();
                    return;
                }
                nok nokVar = (nok) obj2;
                smr smrVar = new smr(zfq.a, new stt(suaVar2, nokVar));
                smrVar.a.getClass();
                stu stuVar = new stu(smrVar, nokVar);
                nok nokVar2 = new nok(null, null);
                CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) r83;
                stf stfVar = new stf(currentLocationRequest.c, 0L);
                stfVar.e(0L);
                stfVar.b(currentLocationRequest.d);
                stfVar.c(currentLocationRequest.b);
                stfVar.d(currentLocationRequest.a);
                stfVar.b = currentLocationRequest.e;
                stfVar.f(currentLocationRequest.f);
                stfVar.a = true;
                stfVar.c = currentLocationRequest.g;
                suaVar2.I(stuVar, stfVar.a(), nokVar2);
                ((svz) nokVar2.a).m(new ljd(obj2, 4));
                return;
            case 16:
                int i = suq.a;
                ((sut) ((suu) obj).v()).e(new sus((nok) obj2), (String) this.a);
                return;
            default:
                Object obj4 = this.a;
                ((sxa) obj).H(((swr) ((sla) obj4).e).a, null, new swn((swo) obj4, (nok) obj2));
                return;
        }
    }
}
