package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService;
import j$.util.OptionalInt;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.Set;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes2.dex */
public final /* synthetic */ class pfq implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ pfq(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, pab] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, pab] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object, piy] */
    /* JADX WARN: Type inference failed for: r12v28, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v51, types: [java.lang.Object, psm] */
    /* JADX WARN: Type inference failed for: r12v64, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r12v65, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        abpc abpcVarL;
        byte[] bArr = null;
        int i = 9;
        switch (this.c) {
            case 0:
                ((pgr) this.a).af(this.b, 12);
                return;
            case 1:
                ((pgr) this.a).af(this.b, 9);
                return;
            case 2:
                xhv xhvVar = (xhv) this.a;
                ((ype) pgr.a.l().ai((char) 6466)).y("GalMessageObserver#onByeByeMessageSent: %s", xhvVar.name());
                ((pfy) this.b).c(false, xhvVar);
                return;
            case 3:
                xhv xhvVar2 = (xhv) this.a;
                ((ype) pgr.a.l().ai((char) 6467)).y("GalMessageObserver#onPctsByeByeMessageSent: %s", xhvVar2.name());
                ((pfy) this.b).c(true, xhvVar2);
                return;
            case 4:
                ((WirelessSetupSharedService) this.b).q.e(yxi.WIRELESS_SETUP_CDM_READY, (OptionalInt) this.a);
                return;
            case 5:
                ((WirelessSetupSharedService) this.b).q.e(yxi.WIRELESS_SETUP_HU_TRACKER_READY, (OptionalInt) this.a);
                return;
            case 6:
                Object obj = this.a;
                Set<BluetoothDevice> bondedDevices = ((BluetoothManager) jfj.c((Context) obj).getSystemService(BluetoothManager.class)).getAdapter().getBondedDevices();
                if (bondedDevices == null) {
                    ((WirelessSetupSharedService) obj).q.d(yxi.WIRELESS_SETUP_SHARED_SERVICE_BONDED_DEVICE_LOOKUP_FAILED);
                    return;
                } else {
                    if (bondedDevices.contains(this.b)) {
                        return;
                    }
                    ((WirelessSetupSharedService) obj).q.d(yxi.WIRELESS_SETUP_SHARED_SERVICE_STARTED_WITH_NOT_BONDED_DEVICE);
                    return;
                }
            case 7:
                trw trwVar = (trw) this.a;
                this.b.b(trwVar.c, trwVar.b);
                return;
            case 8:
                Object obj2 = this.b;
                pyo pyoVar = pyo.LAZIFY_DEPENDENCIES_DURING_STARTUP_V2025Q3;
                plq plqVar = (plq) obj2;
                Context context = plqVar.a;
                boolean zA = pyn.a(context, pyoVar);
                if (!pyn.a(context, pyo.MIGRATE_PRELOADING_DURING_STARTUP_TO_USE_CLIENT_PARAMETERS_OBSERVABLES) && !zA) {
                    uyc uycVar = ((htm) this.a.a()).B().h;
                    if (uycVar == null) {
                        uycVar = uyc.a;
                    }
                    if (!uycVar.c) {
                        plt pltVar = plqVar.b;
                        ((plv) pltVar).g.d(new pfp(pltVar, 14));
                        zgp zgpVar = zgl.a;
                        return;
                    }
                }
                TelephonyManager telephonyManager = plqVar.c;
                String simCountryIso = telephonyManager.getSimCountryIso();
                if (woy.am(simCountryIso) && telephonyManager.getPhoneType() != 2) {
                    simCountryIso = telephonyManager.getNetworkCountryIso();
                }
                if (woy.am(simCountryIso)) {
                    simCountryIso = Locale.getDefault().getCountry();
                }
                plqVar.f = simCountryIso.toUpperCase(Locale.ROOT);
                if (plq.f(context)) {
                    plt pltVar2 = plqVar.b;
                    ((plv) pltVar2).g.d(new pfq(pltVar2, plqVar.f, i, bArr));
                    zgp zgpVar2 = zgl.a;
                    return;
                }
                return;
            case 9:
                ((plv) this.b).a.o(plv.d, (String) this.a);
                return;
            case 10:
                ((plv) this.b).a.o(plv.c, (String) this.a);
                return;
            case 11:
                Object obj3 = this.a;
                pqt pqtVar = (pqt) obj3;
                ackk ackkVar = pqtVar.f;
                Object obj4 = this.b;
                pma pmaVar = pma.a;
                ((abnv) obj4).equals(pmaVar);
                try {
                    if (((pqt) obj3).p.w()) {
                        ((abnv) obj4).equals(pmaVar);
                        return;
                    }
                    return;
                } catch (val unused) {
                    return;
                }
            case 12:
                psj.f(this.a, (psk) this.b);
                return;
            case 13:
                ((pto) this.b).c.remove(((xxh) this.a).b());
                return;
            case 14:
                ((puh) this.b).a.p(lws.G((CronetException) this.a));
                return;
            case 15:
                Object obj5 = this.a;
                Object obj6 = this.b;
                try {
                    try {
                        ByteBuffer byteBufferW = ((pxo) obj6).d.w();
                        pxp pxpVar = ((pxo) obj6).b;
                        Object obj7 = pxpVar.b;
                        pvn pvnVar = ((pxr) obj7).d;
                        pvnVar.c(byteBufferW.position());
                        byte[] bArr2 = new byte[byteBufferW.remaining()];
                        byteBufferW.get(bArr2);
                        abnj abnjVar = new abnj();
                        Object obj8 = pxpVar.a;
                        int iOrdinal = ((Enum) obj8).ordinal();
                        if (iOrdinal == 0 || iOrdinal == 1) {
                            abgq abgqVar = abgq.a;
                            abpcVarL = abnv.L(abgq.class);
                        } else {
                            if (iOrdinal != 2) {
                                throw null;
                            }
                            abgi abgiVar = abgi.a;
                            abpcVarL = abnv.L(abgi.class);
                        }
                        pxq pxqVar = pxq.PAINT_REROUTILE;
                        if (((pxq) obj8).equals(pxqVar) && !((pxr) obj7).f) {
                            ((ynz) ((ynz) pxr.a.g()).ai((char) 6936)).u("Reroutile request type, but isReroutilePaintRequestPathEnabled is false");
                        }
                        if (((pxq) obj8).equals(pxq.PAINT) || ((pxq) obj8).equals(pxqVar)) {
                            abnjVar.c(abge.c);
                            abnjVar.c(abgr.b);
                        } else {
                            ((pxq) obj8).equals(pxq.GET_PARAMETERS);
                        }
                        Object objJ = abpcVarL.j(bArr2, abnjVar);
                        pvnVar.b(byteBufferW.position());
                        ((pxr) obj7).e.b();
                        ((pxo) obj6).a.o(objJ);
                        ((pxo) obj6).c.b();
                    } catch (Exception e) {
                        ((ynz) ((ynz) pxr.a.f()).ai(6931)).u("Failed to read the response!");
                        ((pxo) obj6).a.p(e);
                    }
                    return;
                } finally {
                    ((pxo) obj6).a((UrlResponseInfo) obj5);
                }
            case 16:
                pwv pwvVarG = lws.G((CronetException) this.a);
                pxo pxoVar = (pxo) this.b;
                pxoVar.a.p(pwvVarG);
                pxoVar.c.b();
                return;
            case 17:
                ((pyx) this.b).g.execute(this.a);
                return;
            case 18:
                ((pyx) this.b).h.execute(this.a);
                return;
            case 19:
                Throwable th = (Throwable) this.a;
                xyg.c(th);
                ((ynz) ((ynz) ((ynz) qau.a.g()).p(th)).ai(6981)).u((String) this.b);
                return;
            default:
                Object obj9 = this.a;
                qcx qcxVar = (qcx) this.b;
                qcxVar.i(obj9);
                qcxVar.e();
                return;
        }
    }

    public /* synthetic */ pfq(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public pfq(UrlRequest.Callback callback, CronetException cronetException, int i) {
        this.c = i;
        this.a = cronetException;
        this.b = callback;
    }
}
