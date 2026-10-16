package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.auto.components.demand.suggestions.PendingIntentFactory;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class kzt {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public kzt(ComponentName componentName, geb gebVar, gns gnsVar, gjv gjvVar) {
        this.c = new Handler(Looper.getMainLooper(), new gly(this, 1));
        this.a = componentName;
        this.b = gebVar;
        this.d = gnsVar;
        int i = 19;
        gjvVar.b(this, 10, new elt(this, i));
        gjvVar.b(this, 11, new elt(this, i));
    }

    public static kzt a() {
        final mki mkiVar = mki.a;
        return (kzt) mkiVar.b(kzt.class, new tgr() { // from class: kzq
            @Override // defpackage.tgr
            public final Object a() {
                Context context = mkiVar.c;
                int i = kzz.a;
                kzz kzzVar = new kzz(new PendingIntentFactory(context), new kzv(context), context);
                kzy kzyVar = new kzy();
                yph yphVar = laa.a;
                osi osiVar = osi.a;
                afco afcoVar = tby.a;
                eqm eqmVar = new eqm(osiVar);
                if (acpc.x()) {
                    mad madVarE = mad.e();
                    eqj eqjVarE = tby.e(luk.a().a(), madVarE.c, madVarE.b, new kuv(5));
                    eql eqlVar = new eql();
                    eqlVar.r(eqjVarE, new kqc(eqlVar, 11));
                    eqmVar = eqlVar;
                }
                int i2 = 9;
                eqj eqjVarD = tby.d(eqmVar, eqy.c(eqy.a(kiu.a()), new kut(tby.v(tby.C(lgx.b().a(mpz.d), new kut(loy.j(), i2)), new kmn(8)), 10)), new kuu(3));
                oit.a();
                return new kzt(kzzVar, kzyVar, tby.E(tby.v(eqy.a(eqjVarD), new kmn(i2))));
            }
        });
    }

    public static void b(yzy yzyVar, int i) {
        woy.Q(i >= 0, "Invalid eventCount %s", i);
        if (i == 0) {
            return;
        }
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.ASSISTANT_SUGGESTION, yzyVar);
        rrbVarH.w(i);
        ohsVarJ.F(rrbVarH.l());
    }

    public static final pcq h(pcm pcmVar, boolean z) {
        return (pcmVar.b || pcmVar.c) ? pcq.d : (pcmVar.d || !z) ? pcmVar.a ? pcq.c : pcq.b : pcq.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [eqn, java.lang.Object] */
    public final void c() {
        int size;
        eqj eqjVar = (eqj) this.c;
        ?? r1 = this.d;
        eqjVar.k(r1);
        ((kzs) r1).a.clear();
        Object obj = this.b;
        synchronized (obj) {
            ype ypeVar = (ype) kzy.a.l().ai(3666);
            Map map = ((kzy) obj).b;
            ypeVar.y("cancelAllNotifications(): notificationIdMap=%s", map);
            if (map.isEmpty()) {
                size = 0;
            } else {
                nuj nujVarB = nuj.b();
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    nujVarB.g("GH.Assistant.Suggestion", ((Long) it.next()).longValue(), RemoteApiConstants.NOW_PACKAGE);
                }
                size = map.size();
                map.clear();
            }
        }
        b(yzy.tF, size);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final eqj d(BluetoothDevice bluetoothDevice, final Supplier supplier) {
        Object objPutIfAbsent;
        bluetoothDevice.getClass();
        if (!((Boolean) ((ajab) this.c).b()).booleanValue()) {
            throw new IllegalStateException("HU presence checker not started");
        }
        ?? r3 = this.a;
        Object objA = r3.get(bluetoothDevice);
        if (objA == null && (objPutIfAbsent = r3.putIfAbsent(bluetoothDevice, (objA = ajac.a(new pcm(false, false, false, true))))) != null) {
            objA = objPutIfAbsent;
        }
        return eqy.b(dtx.l((ajab) objA, afcp.a, 5000L), new afec() { // from class: pck
            @Override // defpackage.afec
            public final Object invoke(Object obj) {
                pcm pcmVar = (pcm) obj;
                pcmVar.getClass();
                Object obj2 = supplier.get();
                obj2.getClass();
                return kzt.h(pcmVar, ((Boolean) obj2).booleanValue());
            }
        });
    }

    public final pcq e(BluetoothDevice bluetoothDevice, boolean z) {
        pcm pcmVar;
        bluetoothDevice.getClass();
        if (!((Boolean) ((ajab) this.c).b()).booleanValue()) {
            throw new IllegalStateException("HU presence checker not started");
        }
        ajab ajabVar = (ajab) ((ConcurrentHashMap) this.a).get(bluetoothDevice);
        if (ajabVar == null || (pcmVar = (pcm) ajabVar.b()) == null) {
            pcmVar = new pcm(false, false, false, true);
        }
        return h(pcmVar, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(android.bluetooth.BluetoothDevice r6, boolean r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.pcn
            if (r0 == 0) goto L13
            r0 = r8
            pcn r0 = (defpackage.pcn) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            pcn r0 = new pcn
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.woy.dF(r8)
            goto L5d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.woy.dF(r8)
            java.lang.Object r8 = r5.a
            java.lang.Object r2 = r8.get(r6)
            if (r2 != 0) goto L4c
            pcm r2 = new pcm
            r4 = 0
            r2.<init>(r4, r4, r4, r3)
            ajab r2 = defpackage.ajac.a(r2)
            java.lang.Object r6 = r8.putIfAbsent(r6, r2)
            if (r6 != 0) goto L4b
            goto L4c
        L4b:
            r2 = r6
        L4c:
            aiyk r2 = (defpackage.aiyk) r2
            pco r6 = new pco
            r8 = 0
            r6.<init>(r5, r7, r8)
            r0.b = r3
            java.lang.Object r5 = defpackage.afpt.q(r2, r6, r0)
            if (r5 != r1) goto L5d
            return r1
        L5d:
            afak r5 = defpackage.afak.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kzt.f(android.bluetooth.BluetoothDevice, boolean, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [aiyk, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.afck r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.pcp
            if (r0 == 0) goto L13
            r0 = r5
            pcp r0 = (defpackage.pcp) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            pcp r0 = new pcp
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.woy.dF(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.woy.dF(r5)
            java.lang.Object r4 = r4.c
            thu r5 = new thu
            r2 = 0
            r5.<init>(r2, r3, r2)
            r0.b = r3
            java.lang.Object r4 = defpackage.afpt.q(r4, r5, r0)
            if (r4 != r1) goto L43
            return r1
        L43:
            afak r4 = defpackage.afak.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kzt.g(afck):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, java.util.concurrent.BlockingQueue] */
    public final synchronized void i(hqt hqtVar) {
        ?? r0 = this.a;
        String strC = hqtVar.c();
        List list = (List) r0.remove(strC);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (hrf.b) {
            hrf.d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strC);
        }
        hqt hqtVar2 = (hqt) list.remove(0);
        r0.put(strC, list);
        hqtVar2.p(this);
        try {
            this.c.put(hqtVar2);
        } catch (InterruptedException e) {
            hrf.b("Couldn't add request to queue. %s", e.toString());
            Thread.currentThread().interrupt();
            ((hqi) this.b).a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized boolean j(hqt hqtVar) {
        ?? r0 = this.a;
        String strC = hqtVar.c();
        if (!r0.containsKey(strC)) {
            r0.put(strC, null);
            hqtVar.p(this);
            if (hrf.b) {
                hrf.a("new request, sending to network %s", strC);
            }
            return false;
        }
        List arrayList = (List) r0.get(strC);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        hqtVar.e("waiting-for-response");
        arrayList.add(hqtVar);
        r0.put(strC, arrayList);
        if (hrf.b) {
            hrf.a("Request for cacheKey=%s is in flight, putting on hold.", strC);
        }
        return true;
    }

    public final void k(gnk gnkVar, gdk gdkVar) {
        l(gnkVar);
        gdkVar.a(new glf(this, gnkVar));
    }

    public final void l(gnk gnkVar) {
        int iOrdinal = gnkVar.ordinal();
        Handler handler = (Handler) this.c;
        handler.removeMessages(iOrdinal);
        handler.sendMessageDelayed(handler.obtainMessage(gnkVar.ordinal()), 5000L);
    }

    public kzt(FrameLayout frameLayout, ocw ocwVar, View view, ocs ocsVar) {
        this.b = frameLayout;
        this.a = ocwVar;
        this.c = view;
        this.d = ocsVar;
    }

    public kzt(iha ihaVar, iha ihaVar2, iha ihaVar3, iha ihaVar4) {
        this.c = ihaVar;
        this.a = ihaVar2;
        this.b = ihaVar3;
        this.d = ihaVar4;
    }

    public kzt(String str, IconCompat iconCompat, afdr afdrVar, afdr afdrVar2) {
        this.b = str;
        this.a = iconCompat;
        this.c = afdrVar;
        this.d = afdrVar2;
    }

    public kzt(String str, IconCompat iconCompat, afdr afdrVar, afdr afdrVar2, byte[] bArr) {
        this.b = str;
        this.a = iconCompat;
        this.d = afdrVar;
        this.c = afdrVar2;
    }

    public kzt(String str, String str2, IconCompat iconCompat, afdr afdrVar) {
        this.d = str;
        this.b = str2;
        this.c = iconCompat;
        this.a = afdrVar;
    }

    public kzt(String str, sr srVar, geu geuVar, whg whgVar) {
        this.a = str;
        this.c = srVar;
        this.d = geuVar;
        this.b = whgVar;
    }

    public kzt(List list, hvn hvnVar, hxl hxlVar, ContentResolver contentResolver) {
        this.d = hvnVar;
        this.a = hxlVar;
        this.b = contentResolver;
        this.c = list;
    }

    public kzt(afco afcoVar) {
        this.d = ahni.b(afcoVar);
        this.a = new ConcurrentHashMap();
        this.b = new pcl(this);
        this.c = ajac.a(false);
    }

    public kzt(affv affvVar, gez gezVar, gfk gfkVar, bux buxVar) {
        this.a = (ktf) affvVar.a;
        this.d = gezVar.a;
        this.c = gezVar.b;
        this.b = gfkVar.a(afgi.k(jtk.f((fwf) buxVar.f(fwg.a)).i), buxVar, 64);
    }

    public kzt(Context context, fnc fncVar, fmx fmxVar, fnc fncVar2) {
        this.a = context;
        this.b = fncVar;
        this.c = fmxVar;
        this.d = fncVar2;
    }

    public kzt(kzz kzzVar, kzy kzyVar, eqj eqjVar) {
        this.d = new kzs();
        this.a = kzzVar;
        this.b = kzyVar;
        this.c = eqjVar;
    }

    public kzt(Context context, ajdr ajdrVar) {
        pdn pdnVar = new pdn(this, 0);
        this.a = pdnVar;
        this.b = new Handler(Looper.getMainLooper());
        this.d = ajdrVar;
        this.c = omc.b(context, pdnVar, null, null, 0);
    }

    public kzt(hqi hqiVar, BlockingQueue blockingQueue, hqz hqzVar) {
        this.a = new HashMap();
        this.d = hqzVar;
        this.b = hqiVar;
        this.c = blockingQueue;
    }
}
