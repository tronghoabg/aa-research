package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.afdr;
import defpackage.afyh;
import defpackage.dsy;
import defpackage.fja;
import defpackage.fjc;
import defpackage.fjo;
import defpackage.fjv;
import defpackage.fjw;
import defpackage.fkz;
import defpackage.flo;
import defpackage.fod;
import defpackage.ncp;
import defpackage.woy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String a = fjo.b("DiagnosticsRcvr");

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        fjo.a().c(a, "Requesting diagnostics");
        try {
            fjv fjvVarA = fjv.a(context);
            fjw fjwVar = new fjw(DiagnosticsWorker.class);
            ncp ncpVar = new ncp(fjwVar);
            fja fjaVar = fjwVar.b.j;
            boolean z = fjaVar.b() || fjaVar.e || fjaVar.c || fjaVar.d;
            fod fodVar = fjwVar.b;
            if (fodVar.p) {
                if (z) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (fodVar.g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            String str = fodVar.v;
            if (str == null) {
                List listL = afyh.L(fodVar.c, new String[]{"."}, 0);
                String strZ = listL.size() == 1 ? (String) listL.get(0) : (String) woy.bK(listL);
                if (strZ.length() > 127) {
                    strZ = afyh.z(strZ, 127);
                }
                fodVar.v = strZ;
            } else if (str.length() > 127) {
                fodVar.v = afyh.z(str, 127);
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            uuidRandomUUID.getClass();
            fjwVar.a = uuidRandomUUID;
            String string = uuidRandomUUID.toString();
            string.getClass();
            fod fodVar2 = fjwVar.b;
            fodVar2.getClass();
            fjwVar.b = new fod(string, fodVar2.b, fodVar2.c, fodVar2.d, new fjc(fodVar2.e), new fjc(fodVar2.f), fodVar2.g, fodVar2.h, fodVar2.i, new fja(fodVar2.j), fodVar2.k, fodVar2.x, fodVar2.l, fodVar2.m, fodVar2.n, fodVar2.o, fodVar2.p, fodVar2.y, fodVar2.q, fodVar2.s, fodVar2.t, fodVar2.u, fodVar2.v, fodVar2.w, 524288);
            List listBg = woy.bg(ncpVar);
            if (listBg.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            final fkz fkzVar = new fkz((flo) fjvVarA, listBg);
            if (!fkzVar.e) {
                flo floVar = fkzVar.b;
                dsy.g(floVar.c.h, "EnqueueRunnable_KEEP", floVar.k.e, new afdr() { // from class: fky
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, java.util.Set] */
                    @Override // defpackage.afdr
                    public final Object invoke() throws Throwable {
                        boolean z2;
                        boolean z3;
                        boolean z4;
                        boolean z5;
                        boolean z6;
                        WorkDatabase workDatabase;
                        Object obj;
                        String str2;
                        Object fodVar3;
                        int i;
                        String str3 = "androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME";
                        String str4 = foq.a;
                        HashSet hashSet = new HashSet();
                        fkz fkzVar2 = fkzVar;
                        List list = fkzVar2.d;
                        hashSet.addAll(list);
                        HashSet hashSet2 = new HashSet();
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            if (hashSet2.contains((String) it.next())) {
                                throw new IllegalStateException("WorkContinuation has cycles (" + fkzVar2 + ")");
                            }
                        }
                        hashSet.removeAll(list);
                        flo floVar2 = fkzVar2.b;
                        WorkDatabase workDatabase2 = floVar2.d;
                        workDatabase2.getClass();
                        workDatabase2.k();
                        try {
                            floVar2.c.getClass();
                            boolean z7 = true;
                            List listBk = woy.bk(fkzVar2);
                            int i2 = 0;
                            while (!listBk.isEmpty()) {
                                List list2 = ((fkz) woy.bu(listBk)).c;
                                if (list2.isEmpty()) {
                                    i = 0;
                                } else {
                                    Iterator it2 = list2.iterator();
                                    i = 0;
                                    while (it2.hasNext()) {
                                        if (((fod) ((ncp) it2.next()).b).j.b() && (i = i + 1) < 0) {
                                            woy.bn();
                                        }
                                    }
                                }
                                i2 += i;
                            }
                            try {
                                if (i2 != 0) {
                                    int iA = workDatabase2.x().a();
                                    if (iA + i2 > 8) {
                                        throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: 8;\nalready enqueued count: " + iA + ";\ncurrent enqueue operation count: " + i2 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
                                    }
                                }
                                HashSet hashSet3 = new HashSet();
                                List list3 = fkzVar2.c;
                                String[] strArr = (String[]) hashSet3.toArray(new String[0]);
                                floVar2.k.getClass();
                                dsy dsyVar = floVar2.c.g;
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                WorkDatabase workDatabase3 = floVar2.d;
                                workDatabase3.getClass();
                                int length = strArr.length;
                                boolean z8 = length != 0;
                                if (length != 0) {
                                    z3 = true;
                                    int i3 = 0;
                                    z4 = false;
                                    z5 = false;
                                    while (i3 < length) {
                                        String str5 = strArr[i3];
                                        z2 = z7;
                                        fod fodVarC = workDatabase3.x().c(str5);
                                        if (fodVarC == null) {
                                            fjo.a();
                                            Log.e(foq.a, a.bq(str5, "Prerequisite ", " doesn't exist; not enqueuing"));
                                            z6 = false;
                                            break;
                                        }
                                        fju fjuVar = fodVarC.b;
                                        z3 &= fjuVar == fju.c ? z2 : false;
                                        if (fjuVar == fju.d) {
                                            z4 = z2;
                                        } else if (fjuVar == fju.f) {
                                            z5 = z2;
                                        }
                                        i3++;
                                        z7 = z2;
                                    }
                                    z2 = z7;
                                } else {
                                    z2 = true;
                                    z3 = true;
                                    z4 = false;
                                    z5 = false;
                                }
                                Throwable th = null;
                                boolean zIsEmpty = TextUtils.isEmpty(null);
                                if (!zIsEmpty && !z8) {
                                    workDatabase3.x();
                                    throw null;
                                }
                                Iterator it3 = list3.iterator();
                                boolean z9 = false;
                                while (it3.hasNext()) {
                                    ncp ncpVar2 = (ncp) it3.next();
                                    Throwable th2 = th;
                                    Object obj2 = ncpVar2.b;
                                    if (!z8 || z3) {
                                        workDatabase = workDatabase2;
                                        obj = obj2;
                                        ((fod) obj).m = jCurrentTimeMillis;
                                    } else if (z4) {
                                        workDatabase = workDatabase2;
                                        obj = obj2;
                                        ((fod) obj).b = fju.d;
                                    } else {
                                        workDatabase = workDatabase2;
                                        obj = obj2;
                                        ((fod) obj).b = z5 ? fju.f : fju.e;
                                    }
                                    z9 |= !(((fod) obj).b == fju.a ? false : z2);
                                    foe foeVarX = workDatabase3.x();
                                    floVar2.e.getClass();
                                    boolean z10 = zIsEmpty;
                                    boolean zA = ((fod) obj).e.a(str3, String.class);
                                    Iterator it4 = it3;
                                    boolean zA2 = ((fod) obj).e.a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
                                    boolean zA3 = ((fod) obj).e.a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
                                    if (!zA && zA2 && zA3) {
                                        String str6 = ((fod) obj).c;
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        fjc fjcVar = ((fod) obj).e;
                                        fjcVar.getClass();
                                        dsr.p(fjcVar.b, linkedHashMap);
                                        linkedHashMap.put(str3, str6);
                                        fjc fjcVarO = dsr.o(linkedHashMap);
                                        String str7 = ((fod) obj).a;
                                        fju fjuVar2 = ((fod) obj).b;
                                        String str8 = ((fod) obj).d;
                                        str2 = str3;
                                        fjc fjcVar2 = ((fod) obj).f;
                                        long j = ((fod) obj).g;
                                        long j2 = ((fod) obj).h;
                                        long j3 = ((fod) obj).i;
                                        fja fjaVar2 = ((fod) obj).j;
                                        int i4 = ((fod) obj).k;
                                        int i5 = ((fod) obj).x;
                                        long j4 = ((fod) obj).l;
                                        long j5 = ((fod) obj).m;
                                        long j6 = ((fod) obj).n;
                                        long j7 = ((fod) obj).o;
                                        boolean z11 = ((fod) obj).p;
                                        int i6 = ((fod) obj).y;
                                        int i7 = ((fod) obj).q;
                                        int i8 = ((fod) obj).r;
                                        long j8 = ((fod) obj).s;
                                        int i9 = ((fod) obj).t;
                                        int i10 = ((fod) obj).u;
                                        String str9 = ((fod) obj).v;
                                        Boolean bool = ((fod) obj).w;
                                        fjuVar2.getClass();
                                        str8.getClass();
                                        fjcVar2.getClass();
                                        fjaVar2.getClass();
                                        if (i5 == 0) {
                                            throw th2;
                                        }
                                        if (i6 == 0) {
                                            throw th2;
                                        }
                                        fodVar3 = new fod(str7, fjuVar2, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", str8, fjcVarO, fjcVar2, j, j2, j3, fjaVar2, i4, i5, j4, j5, j6, j7, z11, i6, i7, i8, j8, i9, i10, str9, bool);
                                    } else {
                                        str2 = str3;
                                        fodVar3 = obj;
                                    }
                                    foeVarX.k((fod) fodVar3);
                                    if (z8) {
                                        int length2 = strArr.length;
                                        int i11 = 0;
                                        while (i11 < length2) {
                                            workDatabase3.s().c(new sx(ncpVar2.A(), strArr[i11], (byte[]) th2));
                                            i11++;
                                            length2 = length2;
                                            th2 = null;
                                        }
                                    }
                                    workDatabase3.y().b(ncpVar2.A(), ncpVar2.c);
                                    if (!z10) {
                                        workDatabase3.v();
                                        throw null;
                                    }
                                    workDatabase2 = workDatabase;
                                    zIsEmpty = z10;
                                    str3 = str2;
                                    it3 = it4;
                                    th = null;
                                }
                                z6 = z9;
                                WorkDatabase workDatabase4 = workDatabase2;
                                fkzVar2.e = z2;
                                workDatabase4.n();
                                workDatabase4.l();
                                if (z6) {
                                    fkq.a(floVar2.c, floVar2.d, floVar2.e);
                                }
                                return afak.a;
                            } catch (Throwable th3) {
                                th = th3;
                                workDatabase2.l();
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                });
                return;
            }
            fjo.a();
            Log.w(fkz.a, "Already enqueued work ids (" + TextUtils.join(", ", fkzVar.d) + ")");
        } catch (IllegalStateException e) {
            fjo.a();
            Log.e(a, "WorkManager is not initialized", e);
        }
    }
}
