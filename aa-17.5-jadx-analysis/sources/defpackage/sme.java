package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionThrottlingConfig;
import com.google.android.gms.libs.throttling.ThrottlingLimits;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes.dex */
public final class sme implements slb, slc {
    public final skv b;
    public final slr c;
    public final int f;
    public boolean g;
    public final /* synthetic */ smi k;
    public final rju l;
    private Set m;
    private final smz n;
    private volatile ConnectionThrottlingConfig o;
    public final Queue a = new LinkedList();
    public final Set d = new HashSet();
    public final Map e = new HashMap();
    public final List h = new ArrayList();
    public ConnectionResult i = null;
    public int j = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public sme(smi smiVar, sla slaVar) {
        this.k = smiVar;
        Looper looper = smiVar.o.getLooper();
        snr snrVarA = slaVar.t().a();
        skv skvVarD = ((omc) slaVar.k.a).d(slaVar.b, looper, snrVarA, slaVar.e, this, this);
        spy spyVar = slaVar.d;
        if (spyVar != null) {
            ((snp) skvVarD).k = spyVar;
        } else {
            String str = slaVar.c;
            if (str != null) {
                ((snp) skvVarD).j = str;
            }
        }
        this.b = skvVarD;
        this.c = slaVar.f;
        this.l = new rju((byte[]) null, (byte[]) null);
        this.f = slaVar.h;
        if (skvVarD.i()) {
            this.n = new smz(smiVar.g, smiVar.o, slaVar.t().a());
        } else {
            this.n = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Feature r(Feature[] featureArr) {
        if (featureArr != null) {
            Feature[] featureArrR = this.b.r();
            if (featureArrR == null) {
                featureArrR = new Feature[0];
            }
            yw ywVar = new yw(featureArrR.length);
            for (Feature feature : featureArrR) {
                ywVar.put(feature.a, Long.valueOf(feature.a()));
            }
            for (int i = 0; i <= 0; i++) {
                Feature feature2 = featureArr[i];
                Long l = (Long) ywVar.get(feature2.a);
                if (l == null || l.longValue() < feature2.a()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    private final Status s(ConnectionResult connectionResult) {
        return smi.a(this.c, connectionResult);
    }

    private final void t(ConnectionResult connectionResult) {
        Set set = this.d;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((wkm) it.next()).f(this.c, connectionResult, Objects.equals(connectionResult, ConnectionResult.a) ? this.b.k() : null);
        }
        set.clear();
    }

    private final void u(Status status, Exception exc, boolean z) {
        spu.ao(this.k.o);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            slq slqVar = (slq) it.next();
            if (!z || slqVar.c == 2) {
                if (status != null) {
                    slqVar.f(status);
                } else {
                    slqVar.g(exc);
                }
                it.remove();
            }
        }
    }

    private final void v(slq slqVar) {
        slqVar.i(this.l, q());
        try {
            slqVar.h(this);
        } catch (DeadObjectException unused) {
            b(1);
            this.b.o("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final boolean w(slq slqVar) {
        y(slqVar);
        if (!(slqVar instanceof slk)) {
            v(slqVar);
            return true;
        }
        slk slkVar = (slk) slqVar;
        Feature featureR = r(slkVar.d(this));
        if (featureR == null) {
            v(slqVar);
            return true;
        }
        String name = this.b.getClass().getName();
        long jA = featureR.a();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        String str = featureR.a;
        sb.append(str);
        sb.append(", ");
        sb.append(jA);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        smi smiVar = this.k;
        if (!smiVar.p || !slkVar.c(this)) {
            slkVar.g(new slj(featureR));
            return true;
        }
        int iA = slkVar.a(this);
        smf smfVar = new smf(this.c, featureR);
        List list = this.h;
        int iIndexOf = list.indexOf(smfVar);
        if (iIndexOf >= 0) {
            smf smfVar2 = (smf) list.get(iIndexOf);
            Handler handler = smiVar.o;
            handler.removeMessages(15, smfVar2);
            handler.sendMessageDelayed(Message.obtain(handler, 15, smfVar2), 5000L);
            return false;
        }
        list.add(smfVar);
        Handler handler2 = smiVar.o;
        handler2.sendMessageDelayed(Message.obtain(handler2, 15, smfVar), 5000L);
        handler2.sendMessageDelayed(Message.obtain(handler2, 16, smfVar), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(1, 2, null, null, Integer.valueOf(iA));
        if (x(connectionResult)) {
            Log.w("GoogleApiManager", "A dialog should be displayed for missing feature: " + str + ", version: " + featureR.a());
            return false;
        }
        if (!smiVar.h(connectionResult, this.f)) {
            return false;
        }
        Log.w("GoogleApiManager", "Notification displayed for missing feature: " + str + ", version: " + featureR.a());
        return false;
    }

    private final boolean x(ConnectionResult connectionResult) {
        synchronized (smi.c) {
            smi smiVar = this.k;
            if (smiVar.l == null || !smiVar.m.contains(this.c)) {
                return false;
            }
            smb smbVar = smiVar.l;
            acjs acjsVar = new acjs(connectionResult, this.f);
            if (a.p(smbVar.b, acjsVar)) {
                smbVar.c.post(new rgq(smbVar, acjsVar, 2));
            }
            return true;
        }
    }

    private final void y(slq slqVar) {
        ConnectionThrottlingConfig connectionThrottlingConfig;
        slk slkVar;
        int iA;
        int maxInflight;
        if (slqVar.d || slqVar.e || (connectionThrottlingConfig = this.o) == null || !(slqVar instanceof slk) || (iA = (slkVar = (slk) slqVar).a(this)) == 0) {
            return;
        }
        smi smiVar = this.k;
        SparseArray sparseArray = connectionThrottlingConfig.a;
        erb erbVarJ = smiVar.j();
        ThrottlingLimits throttlingLimits = (ThrottlingLimits) sparseArray.get(iA, (ThrottlingLimits) sparseArray.get(0));
        if (throttlingLimits == null) {
            maxInflight = Integer.MIN_VALUE;
        } else {
            Object obj = erbVarJ.a;
            long j = iA;
            int maxInflight2 = throttlingLimits.getMaxInflight();
            if (maxInflight2 > 0) {
                Object obj2 = ((ajki) obj).b;
                synchronized (obj2) {
                    long[] jArr = (long[]) ((LongSparseArray) obj2).get(j);
                    if (jArr != null) {
                        long j2 = jArr[0];
                        long j3 = ((ajki) obj).a + 1;
                        ((ajki) obj).a = j3;
                        jArr[1] = j3;
                        if (j2 < maxInflight2) {
                            jArr[0] = j2 + 1;
                        }
                    } else {
                        if (((LongSparseArray) obj2).size() >= 2000) {
                            int size = ((LongSparseArray) obj2).size();
                            long j4 = Long.MAX_VALUE;
                            int i = 0;
                            for (int i2 = 0; i2 < size; i2++) {
                                long j5 = ((long[]) ((LongSparseArray) obj2).valueAt(i2))[1];
                                if (j5 < j4) {
                                    j4 = j5;
                                }
                                if (j5 < j4) {
                                    i = i2;
                                }
                            }
                            ((LongSparseArray) obj2).removeAt(i);
                        }
                        long j6 = ((ajki) obj).a + 1;
                        ((ajki) obj).a = j6;
                        ((LongSparseArray) obj2).put(j, new long[]{1, j6});
                    }
                    maxInflight = Integer.MIN_VALUE;
                }
            }
            maxInflight = throttlingLimits.getMaxInflight();
        }
        if (maxInflight != Integer.MIN_VALUE) {
            Log.i("GoogleApiManager", a.bo(maxInflight, iA, "Call throttled for method key: ", " with limit: "));
            smi smiVar2 = this.k;
            snd sndVar = new snd(iA, smiVar2.g.getPackageName(), maxInflight);
            Handler handler = smiVar2.o;
            handler.sendMessage(handler.obtainMessage(21, sndVar));
            slqVar.e = true;
            return;
        }
        slqVar.d = true;
        if (this.m == null) {
            this.m = new HashSet();
        }
        this.m.add(slkVar);
        smi smiVar3 = this.k;
        Handler handler2 = smiVar3.o;
        handler2.getClass();
        slkVar.b(new fpe(handler2, 8), new smh(this, smiVar3.j(), slkVar, iA));
    }

    @Override // defpackage.slz
    public final void a(Bundle bundle) {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = this.k.o;
        if (looperMyLooper == handler.getLooper()) {
            h(bundle);
        } else {
            handler.post(new sbj(this, bundle, 6));
        }
    }

    @Override // defpackage.slz
    public final void b(int i) {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = this.k.o;
        if (looperMyLooper == handler.getLooper()) {
            k(i);
        } else {
            handler.post(new rgm(this, i, 9));
        }
    }

    public final void c() {
        spu.ao(this.k.o);
        this.i = null;
    }

    public final void d() {
        int iL;
        smi smiVar = this.k;
        spu.ao(smiVar.o);
        skv skvVar = this.b;
        if (skvVar.p() || skvVar.q()) {
            return;
        }
        try {
            wcp wcpVar = smiVar.q;
            Context context = smiVar.g;
            if (context == null) {
                throw new NullPointerException("null reference");
            }
            if (skvVar == null) {
                throw new NullPointerException("null reference");
            }
            int iA = skvVar.a();
            int iE = wcpVar.e(iA);
            if (iE == -1) {
                Object obj = wcpVar.b;
                synchronized (obj) {
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= ((SparseIntArray) obj).size()) {
                            i = -1;
                            break;
                        }
                        int iKeyAt = ((SparseIntArray) obj).keyAt(i2);
                        if (iKeyAt > iA && ((SparseIntArray) obj).get(iKeyAt) == 0) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    iL = i == -1 ? ((sjw) wcpVar.a).l(context, iA) : i;
                    ((SparseIntArray) obj).put(iA, iL);
                }
                iE = iL;
            }
            if (iE != 0) {
                ConnectionResult connectionResult = new ConnectionResult(1, iE, null, null, null);
                Log.w("GoogleApiManager", "The service for " + this.b.getClass().getName() + " is not available: " + connectionResult.toString());
                j(connectionResult, null);
                return;
            }
            smi smiVar2 = this.k;
            skv skvVar2 = this.b;
            smg smgVar = new smg(smiVar2, skvVar2, this.c);
            if (skvVar2.i()) {
                smz smzVar = this.n;
                if (smzVar == null) {
                    throw new NullPointerException("null reference");
                }
                svj svjVar = smzVar.e;
                if (svjVar != null) {
                    svjVar.y();
                }
                snr snrVar = smzVar.d;
                snrVar.h = Integer.valueOf(System.identityHashCode(smzVar));
                omc omcVar = smzVar.g;
                Context context2 = smzVar.a;
                Handler handler = smzVar.b;
                smzVar.e = (svj) omcVar.d(context2, handler.getLooper(), snrVar, snrVar.g, smzVar, smzVar);
                smzVar.f = smgVar;
                Set set = smzVar.c;
                if (set == null || set.isEmpty()) {
                    handler.post(new shd(smzVar, 4, null));
                } else {
                    svj svjVar2 = smzVar.e;
                    svjVar2.n(new snm(svjVar2));
                }
            }
            try {
                skvVar2.n(smgVar);
            } catch (SecurityException e) {
                j(new ConnectionResult(1, 10, null, null, null), e);
            }
        } catch (IllegalStateException e2) {
            j(new ConnectionResult(1, 10, null, null, null), e2);
        }
    }

    public final void e(slq slqVar) {
        spu.ao(this.k.o);
        y(slqVar);
        if (this.b.p()) {
            if (w(slqVar)) {
                n();
                return;
            } else {
                this.a.add(slqVar);
                return;
            }
        }
        Queue queue = this.a;
        if (queue.size() >= 1000) {
            slqVar.f(new Status(8, "Pending API call limit exceeded", null, null));
            return;
        }
        queue.add(slqVar);
        ConnectionResult connectionResult = this.i;
        if (connectionResult == null || !connectionResult.b()) {
            d();
        } else {
            j(connectionResult, null);
        }
    }

    public final void f(Status status) {
        spu.ao(this.k.o);
        u(status, null, false);
    }

    public final void g() {
        Queue queue = this.a;
        ArrayList arrayList = new ArrayList(queue);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            slq slqVar = (slq) arrayList.get(i);
            if (!this.b.p()) {
                return;
            }
            if (w(slqVar)) {
                queue.remove(slqVar);
            }
        }
    }

    public final void h(Bundle bundle) {
        c();
        t(ConnectionResult.a);
        p();
        if (bundle == null || !bundle.containsKey("com.google.android.gms.common.internal.CONNECTION_THROTTLING_CONFIG")) {
            this.o = null;
        } else {
            byte[] byteArray = bundle.getByteArray("com.google.android.gms.common.internal.CONNECTION_THROTTLING_CONFIG");
            this.o = byteArray != null ? (ConnectionThrottlingConfig) spu.h(byteArray, ConnectionThrottlingConfig.CREATOR) : null;
        }
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            Object obj = ((rjr) it.next()).b;
            if (r(((smw) obj).b) != null) {
                it.remove();
            } else {
                try {
                    ((smw) obj).b(this.b, new nok(null, null));
                } catch (DeadObjectException unused) {
                    b(3);
                    this.b.o("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e) {
                    e = e;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e2) {
                    e = e2;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        g();
        n();
    }

    @Override // defpackage.smu
    public final void i(ConnectionResult connectionResult) {
        j(connectionResult, null);
    }

    public final void j(ConnectionResult connectionResult, Exception exc) {
        svj svjVar;
        smi smiVar = this.k;
        Handler handler = smiVar.o;
        spu.ao(handler);
        smz smzVar = this.n;
        if (smzVar != null && (svjVar = smzVar.e) != null) {
            svjVar.y();
        }
        c();
        smiVar.q.d();
        t(connectionResult);
        if ((this.b instanceof sph) && connectionResult.c != 24) {
            smiVar.f = true;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        int i = connectionResult.c;
        if (i == 4) {
            f(smi.b);
            return;
        }
        if (i == 25) {
            f(s(connectionResult));
            return;
        }
        Queue queue = this.a;
        if (queue.isEmpty()) {
            this.i = connectionResult;
            return;
        }
        if (exc != null) {
            spu.ao(handler);
            u(null, exc, false);
            return;
        }
        if (!smiVar.p) {
            f(s(connectionResult));
            return;
        }
        u(s(connectionResult), null, true);
        if (queue.isEmpty() || x(connectionResult) || smiVar.h(connectionResult, this.f)) {
            return;
        }
        if (i == 18) {
            this.g = true;
        }
        if (this.g) {
            handler.sendMessageDelayed(Message.obtain(handler, 9, this.c), 5000L);
        } else {
            f(s(connectionResult));
        }
    }

    public final void k(int i) {
        c();
        this.g = true;
        skv skvVar = this.b;
        String strL = skvVar.l();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strL != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strL);
        }
        this.l.p(true, new Status(20, sb.toString(), null, null));
        Status status = new Status(20, "Connection suspended: ".concat(String.valueOf(skvVar.l())), null, null);
        Set set = this.m;
        if (set != null) {
            ArrayList arrayList = new ArrayList(set);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                slk slkVar = (slk) arrayList.get(i2);
                slkVar.g(new skw(status));
                this.a.remove(slkVar);
            }
        }
        smi smiVar = this.k;
        slr slrVar = this.c;
        Handler handler = smiVar.o;
        handler.sendMessageDelayed(Message.obtain(handler, 9, slrVar), 5000L);
        handler.sendMessageDelayed(Message.obtain(handler, 11, slrVar), 120000L);
        smiVar.q.d();
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            Object obj = ((rjr) it.next()).a;
        }
    }

    public final void l(ConnectionResult connectionResult) {
        spu.ao(this.k.o);
        skv skvVar = this.b;
        skvVar.o("onSignInFailed for " + skvVar.getClass().getName() + " with " + String.valueOf(connectionResult));
        j(connectionResult, null);
    }

    final void m(slk slkVar) {
        spu.ao(this.k.o);
        Set set = this.m;
        if (set != null) {
            set.remove(slkVar);
            if (this.m.isEmpty()) {
                this.m = null;
            }
        }
    }

    public final void n() {
        smi smiVar = this.k;
        Handler handler = smiVar.o;
        slr slrVar = this.c;
        handler.removeMessages(12, slrVar);
        handler.sendMessageDelayed(handler.obtainMessage(12, slrVar), smiVar.e);
    }

    public final void o() {
        spu.ao(this.k.o);
        Status status = smi.a;
        f(status);
        this.l.p(false, status);
        for (smp smpVar : (smp[]) this.e.keySet().toArray(new smp[0])) {
            e(new slp(smpVar, new nok(null, null)));
        }
        t(new ConnectionResult(1, 4, null, null, null));
        skv skvVar = this.b;
        if (skvVar.p()) {
            skvVar.t(new ykd(this, null));
        }
    }

    public final void p() {
        if (this.g) {
            smi smiVar = this.k;
            slr slrVar = this.c;
            Handler handler = smiVar.o;
            handler.removeMessages(11, slrVar);
            handler.removeMessages(9, slrVar);
            this.g = false;
        }
    }

    public final boolean q() {
        return this.b.i();
    }
}
