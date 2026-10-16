package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.projection.gearhead.GhApplication;
import j$.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class teg implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ teg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v39, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r13v44, types: [java.lang.Object, mpb] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, zgt] */
    @Override // java.lang.Runnable
    public final void run() {
        zgp zgpVar;
        final int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        switch (this.b) {
            case 0:
                yph yphVar = tel.a;
                this.a.invoke();
                return;
            case 1:
                Object obj = this.a;
                synchronized (((svk) obj).a) {
                    if (((svk) obj).b()) {
                        spu spuVar = svk.f;
                        spu.aD("%s ** IS FORCE-RELEASED ON TIMEOUT **", ((svk) obj).d);
                        ((svk) obj).a();
                        if (((svk) obj).b()) {
                            ((svk) obj).b = 1;
                            ((svk) obj).f();
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 2:
                ((teu) this.a).a();
                return;
            case 3:
                tgj tgjVar = (tgj) this.a;
                Map map = (Map) tgjVar.h.get(tfx.b);
                map.getClass();
                if (tgjVar.j) {
                    tgj.j(map, (tgh) tgjVar.c().orElseThrow());
                }
                tgj.d(map);
                if (map.containsKey(tfy.GEARHEAD_FRX_STARTED)) {
                    ((ype) tgj.a.l().ai((char) 9018)).u("Not recording startup latency for session with FRX");
                } else if (tgjVar.k()) {
                    ((ype) tgj.a.l().ai((char) 9017)).u("not recording startup latency for first run for new version");
                } else if (map.containsKey(tfy.GEARHEAD_WIRELESS_COLD_STARTUP_STARTED)) {
                    tgjVar.i(tfw.COLD);
                } else if (map.containsKey(tfy.GEARHEAD_WIRELESS_WARM_STARTUP_STARTED)) {
                    tgjVar.i(tfw.WARM);
                } else {
                    ((ype) ((ype) tgj.a.h()).ai((char) 9016)).u("no warm or cold startup time recorded, ignoring call");
                }
                map.clear();
                return;
            case 4:
                vqq vqqVar = (vqq) this.a;
                vky vkyVar = vqqVar.h;
                vkyVar.getClass();
                if (vqqVar.b == 0) {
                    vqqVar.c = true;
                    Iterator it = vqqVar.g.iterator();
                    while (it.hasNext()) {
                        ((vpy) it.next()).k(vkyVar);
                    }
                }
                vqqVar.h.getClass();
                vqqVar.a();
                return;
            case 5:
                vtt vttVar = (vtt) this.a;
                if (((Boolean) vttVar.h.a()).booleanValue()) {
                    voy voyVar = vttVar.j;
                    Iterator it2 = voyVar.b.iterator();
                    while (it2.hasNext()) {
                        zgp zgpVarA = ((vpc) it2.next()).a();
                        kew kewVar = new kew(voyVar, 5);
                        Executor executor = voyVar.a;
                        int i4 = zfb.c;
                        zez zezVar = new zez(zgpVarA, kewVar);
                        zgpVarA.c(zezVar, yrm.aK(executor, zezVar));
                    }
                }
                rdx rdxVar = vttVar.k;
                if (((Boolean) rdxVar.c.a()).booleanValue()) {
                    rdxVar.b.scheduleWithFixedDelay(new upk(rdxVar, 11), Math.round(((Long) rdxVar.d.a()).longValue() + (((Random) rdxVar.a).nextDouble() * ((Long) r3.a()).longValue())), ((Long) rdxVar.f.a()).longValue(), TimeUnit.MILLISECONDS);
                    return;
                }
                return;
            case 6:
                final vtt vttVar2 = (vtt) this.a;
                vttVar2.c.execute(new zhk(new zfj() { // from class: vts
                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Finally extract failed */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:114:0x02ed A[Catch: all -> 0x02fb, LOOP:1: B:481:0x01e7->B:114:0x02ed, LOOP_END, TryCatch #17 {all -> 0x02fb, blocks: (B:105:0x02c4, B:113:0x02ec, B:112:0x02e9, B:114:0x02ed, B:120:0x0301, B:121:0x0309, B:95:0x0288, B:74:0x0201, B:109:0x02e4), top: B:468:0x02c4, inners: #0, #5, #6 }] */
                    /* JADX WARN: Removed duplicated region for block: B:171:0x041a  */
                    /* JADX WARN: Removed duplicated region for block: B:174:0x0420  */
                    /* JADX WARN: Removed duplicated region for block: B:187:0x043a  */
                    /* JADX WARN: Removed duplicated region for block: B:190:0x0451 A[Catch: all -> 0x03f4, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x03f4, blocks: (B:162:0x03f1, B:190:0x0451, B:196:0x045b, B:197:0x045d, B:202:0x0494), top: B:456:0x03f1 }] */
                    /* JADX WARN: Removed duplicated region for block: B:192:0x0454  */
                    /* JADX WARN: Removed duplicated region for block: B:195:0x0459  */
                    /* JADX WARN: Removed duplicated region for block: B:199:0x0473  */
                    /* JADX WARN: Removed duplicated region for block: B:202:0x0494 A[Catch: all -> 0x03f4, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x03f4, blocks: (B:162:0x03f1, B:190:0x0451, B:196:0x045b, B:197:0x045d, B:202:0x0494), top: B:456:0x03f1 }] */
                    /* JADX WARN: Removed duplicated region for block: B:237:0x05ac A[Catch: all -> 0x05d7, TRY_ENTER, TryCatch #32 {all -> 0x05d7, blocks: (B:217:0x052f, B:219:0x0541, B:220:0x0557, B:237:0x05ac, B:239:0x05c6, B:240:0x05d1, B:247:0x05ee, B:250:0x0606, B:253:0x0626, B:259:0x0639, B:261:0x063d, B:256:0x0631), top: B:497:0x052f }] */
                    /* JADX WARN: Removed duplicated region for block: B:247:0x05ee A[Catch: all -> 0x05d7, TRY_ENTER, TRY_LEAVE, TryCatch #32 {all -> 0x05d7, blocks: (B:217:0x052f, B:219:0x0541, B:220:0x0557, B:237:0x05ac, B:239:0x05c6, B:240:0x05d1, B:247:0x05ee, B:250:0x0606, B:253:0x0626, B:259:0x0639, B:261:0x063d, B:256:0x0631), top: B:497:0x052f }] */
                    /* JADX WARN: Removed duplicated region for block: B:250:0x0606 A[Catch: all -> 0x05d7, TRY_ENTER, TRY_LEAVE, TryCatch #32 {all -> 0x05d7, blocks: (B:217:0x052f, B:219:0x0541, B:220:0x0557, B:237:0x05ac, B:239:0x05c6, B:240:0x05d1, B:247:0x05ee, B:250:0x0606, B:253:0x0626, B:259:0x0639, B:261:0x063d, B:256:0x0631), top: B:497:0x052f }] */
                    /* JADX WARN: Removed duplicated region for block: B:253:0x0626 A[Catch: all -> 0x05d7, TRY_ENTER, TryCatch #32 {all -> 0x05d7, blocks: (B:217:0x052f, B:219:0x0541, B:220:0x0557, B:237:0x05ac, B:239:0x05c6, B:240:0x05d1, B:247:0x05ee, B:250:0x0606, B:253:0x0626, B:259:0x0639, B:261:0x063d, B:256:0x0631), top: B:497:0x052f }] */
                    /* JADX WARN: Removed duplicated region for block: B:257:0x0636  */
                    /* JADX WARN: Removed duplicated region for block: B:265:0x064e A[Catch: all -> 0x084b, TRY_ENTER, TRY_LEAVE, TryCatch #25 {all -> 0x084b, blocks: (B:232:0x0597, B:235:0x05a6, B:245:0x05db, B:248:0x05f9, B:251:0x061a, B:265:0x064e), top: B:483:0x0597 }] */
                    /* JADX WARN: Removed duplicated region for block: B:267:0x0661  */
                    /* JADX WARN: Removed duplicated region for block: B:307:0x0755 A[Catch: all -> 0x0841, TryCatch #19 {all -> 0x0841, blocks: (B:325:0x0830, B:308:0x075e, B:309:0x0766, B:311:0x076c, B:313:0x077e, B:315:0x07a1, B:316:0x07b7, B:318:0x07ea, B:319:0x07f5, B:321:0x0812, B:322:0x081d, B:323:0x0824, B:306:0x0743, B:307:0x0755), top: B:471:0x0830 }] */
                    /* JADX WARN: Removed duplicated region for block: B:311:0x076c A[Catch: all -> 0x0841, TryCatch #19 {all -> 0x0841, blocks: (B:325:0x0830, B:308:0x075e, B:309:0x0766, B:311:0x076c, B:313:0x077e, B:315:0x07a1, B:316:0x07b7, B:318:0x07ea, B:319:0x07f5, B:321:0x0812, B:322:0x081d, B:323:0x0824, B:306:0x0743, B:307:0x0755), top: B:471:0x0830 }] */
                    /* JADX WARN: Removed duplicated region for block: B:359:0x089f  */
                    /* JADX WARN: Removed duplicated region for block: B:384:0x08e8  */
                    /* JADX WARN: Removed duplicated region for block: B:386:0x08eb  */
                    /* JADX WARN: Removed duplicated region for block: B:389:0x0922  */
                    /* JADX WARN: Removed duplicated region for block: B:390:0x092b  */
                    /* JADX WARN: Removed duplicated region for block: B:436:0x031d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:444:0x0201 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:450:0x086b A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:469:0x0207 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:477:0x04e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:73:0x01ff  */
                    /* JADX WARN: Type inference failed for: r20v3 */
                    /* JADX WARN: Type inference failed for: r6v5, types: [aezk, java.lang.Object] */
                    @Override // defpackage.zfj
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final defpackage.zgp a() throws java.lang.Throwable {
                        /*
                            Method dump skipped, instructions count: 2838
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.vts.a():zgp");
                    }
                }));
                return;
            case 7:
                ((vve) this.a).g.a(8, null);
                return;
            case 8:
                wcq wcqVar = (wcq) this.a;
                if (wcqVar.g) {
                    wae waeVar = wcqVar.d;
                    if (!tmz.e(waeVar.c)) {
                        wcq.a.a(waeVar);
                        return;
                    }
                }
                wcqVar.d();
                return;
            case 9:
                zhp zhpVar = zhp.FILE;
                woy woyVar = new woy();
                wcq wcqVar2 = (wcq) this.a;
                wdb wdbVar = wcqVar2.d.h;
                wdg wczVar = (wdg) wdbVar.c.gu();
                if (wczVar == null && !wcqVar2.h) {
                    zgp zgpVar2 = zgl.a;
                    return;
                }
                int i5 = 1 << zhpVar.h;
                if ((wdbVar.e & i5) == 0) {
                    CopyOnWriteArrayList copyOnWriteArrayList = wdbVar.f;
                    synchronized (copyOnWriteArrayList) {
                        int i6 = wdbVar.e;
                        if ((i6 & i5) == 0) {
                            copyOnWriteArrayList.add(woyVar);
                            wdbVar.e = i5 | i6;
                        }
                    }
                }
                if (wdbVar.h == null) {
                    synchronized (wdbVar.g) {
                        if (wdbVar.h == null) {
                            if (wczVar == null) {
                                wczVar = new wcz();
                            }
                            Context context = wdbVar.a;
                            if (tmz.e(context)) {
                                zgp zgpVarG = ((six) wdbVar.d.gu()).g(new wda(wdbVar, wczVar));
                                wdbVar.h = zgpVarG;
                                zgpVar = zgpVarG;
                            } else {
                                oyx oyxVar = new oyx(14);
                                xyc xycVar = wdbVar.b;
                                zgp zgpVarC = tmz.c(context, oyxVar, (Executor) xycVar.gu());
                                vzf vzfVar = new vzf(wdbVar, wczVar, 3);
                                Executor executor2 = (Executor) xycVar.gu();
                                int i7 = zfb.c;
                                zez zezVar2 = new zez(zgpVarC, vzfVar);
                                zgpVarC.c(zezVar2, yrm.aK(executor2, zezVar2));
                                wdbVar.h = zezVar2;
                                zgpVar = zezVar2;
                            }
                            zgpVar.c(new upk(zgpVar, 18), (Executor) wdbVar.b.gu());
                        }
                    }
                    return;
                }
                return;
            case 10:
                ?? r13 = this.a;
                try {
                    woy.ad(r13.isDone(), "Future was expected to be done: %s", r13);
                    a.L(r13);
                    return;
                } catch (ExecutionException e) {
                    wer.e(new upk(e, 17));
                    return;
                }
            case 11:
                wlz wlzVar = (wlz) this.a;
                wlzVar.b = false;
                BottomSheetBehavior bottomSheetBehavior = wlzVar.c;
                een eenVar = bottomSheetBehavior.z;
                if (eenVar != null && eenVar.l()) {
                    wlzVar.a(wlzVar.a);
                    return;
                } else {
                    if (bottomSheetBehavior.y == 2) {
                        bottomSheetBehavior.V(wlzVar.a);
                        return;
                    }
                    return;
                }
            case 12:
                ?? r132 = this.a;
                lig ligVar = (lig) r132;
                if (!ligVar.e || wxz.A().k()) {
                    ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.LIFETIME, ligVar.e ? yzy.pj : yzy.pi).l());
                    return;
                }
                mpd.b().j(r132);
                ligVar.n();
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.LIFETIME, yzy.pk).l());
                return;
            case 13:
                int i8 = GhApplication.b;
                tfk.a.a(tfj.GEARHEAD_FIRST_PROCESS_STABLE_FLAG_READ, Duration.ZERO, (Duration) this.a);
                return;
            case 14:
                int i9 = GhApplication.b;
                if (koo.n()) {
                    final Object obj2 = this.a;
                    yph yphVar2 = kow.a;
                    woy.aa(koo.n(), "Failure injection is disabled");
                    rla rlaVarM = koo.m();
                    pbd pbdVar = pbd.DISABLE_WIFI;
                    rlaVarM.e(pbdVar, new rkw() { // from class: kop
                        @Override // defpackage.rkw
                        public final void a() {
                            int i10 = i;
                            if (i10 == 0) {
                                yph yphVar3 = kow.a;
                                try {
                                    a.L(((ozf) obj2).g());
                                    return;
                                } catch (ExecutionException e2) {
                                    throw new IllegalStateException("Unexpected failure when clearing wifi data store", e2);
                                }
                            }
                            Object obj3 = obj2;
                            if (i10 != 1) {
                                jxc.f((Context) obj3, false);
                                return;
                            }
                            SharedPreferences sharedPreferences = ((scy) obj3).a;
                            for (String str : sharedPreferences.getAll().keySet()) {
                                if (str.startsWith("AndroidAutoBluetooth")) {
                                    sharedPreferences.edit().remove(str).apply();
                                }
                            }
                            sharedPreferences.edit().remove("SDP_REQUESTED_MAC_ADDRESS_STORE").apply();
                        }
                    });
                    final Context context2 = (Context) obj2;
                    koo.m().f(pbdVar, new rkx() { // from class: koq
                        @Override // defpackage.rkx
                        public final void a() {
                            jxc.f(context2, true);
                        }
                    });
                    final ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    final AtomicReference atomicReference = new AtomicReference(null);
                    rla rlaVarM2 = koo.m();
                    pbd pbdVar2 = pbd.SEVER_HFP;
                    rlaVarM2.e(pbdVar2, new rkw() { // from class: kor
                        @Override // defpackage.rkw
                        public final void a() {
                            executorServiceNewSingleThreadExecutor.execute(new kot(context2, atomicReference, 0));
                        }
                    });
                    koo.m().f(pbdVar2, new rkx() { // from class: kos
                        @Override // defpackage.rkx
                        public final void a() {
                            executorServiceNewSingleThreadExecutor.execute(new kot(context2, atomicReference, 1));
                        }
                    });
                    final ozf ozfVarA = ozf.a(context2, Executors.newSingleThreadExecutor());
                    koo.m().e(pbd.CLEAR_WIFI_DATA_STORE, new rkw() { // from class: kop
                        @Override // defpackage.rkw
                        public final void a() {
                            int i10 = i2;
                            if (i10 == 0) {
                                yph yphVar3 = kow.a;
                                try {
                                    a.L(((ozf) ozfVarA).g());
                                    return;
                                } catch (ExecutionException e2) {
                                    throw new IllegalStateException("Unexpected failure when clearing wifi data store", e2);
                                }
                            }
                            Object obj3 = ozfVarA;
                            if (i10 != 1) {
                                jxc.f((Context) obj3, false);
                                return;
                            }
                            SharedPreferences sharedPreferences = ((scy) obj3).a;
                            for (String str : sharedPreferences.getAll().keySet()) {
                                if (str.startsWith("AndroidAutoBluetooth")) {
                                    sharedPreferences.edit().remove(str).apply();
                                }
                            }
                            sharedPreferences.edit().remove("SDP_REQUESTED_MAC_ADDRESS_STORE").apply();
                        }
                    });
                    final scy scyVar = new scy(context2, new kmy(context2, "common_user_settings"));
                    koo.m().e(pbd.CLEAR_BLUETOOTH_DATA_STORE, new rkw() { // from class: kop
                        @Override // defpackage.rkw
                        public final void a() {
                            int i10 = i3;
                            if (i10 == 0) {
                                yph yphVar3 = kow.a;
                                try {
                                    a.L(((ozf) scyVar).g());
                                    return;
                                } catch (ExecutionException e2) {
                                    throw new IllegalStateException("Unexpected failure when clearing wifi data store", e2);
                                }
                            }
                            Object obj3 = scyVar;
                            if (i10 != 1) {
                                jxc.f((Context) obj3, false);
                                return;
                            }
                            SharedPreferences sharedPreferences = ((scy) obj3).a;
                            for (String str : sharedPreferences.getAll().keySet()) {
                                if (str.startsWith("AndroidAutoBluetooth")) {
                                    sharedPreferences.edit().remove(str).apply();
                                }
                            }
                            sharedPreferences.edit().remove("SDP_REQUESTED_MAC_ADDRESS_STORE").apply();
                        }
                    });
                    return;
                }
                return;
            case 15:
                int i10 = GhApplication.b;
                tfk.a.a(tfj.GEARHEAD_APPLICATION_CREATED, Duration.ZERO, (Duration) this.a);
                return;
            default:
                xfl xflVar = (xfl) this.a;
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) xflVar.c.getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (!TextUtils.isEmpty(runningAppProcessInfo.processName) && xflVar.d.containsKey(runningAppProcessInfo.processName)) {
                            xfk xfkVar = (xfk) xflVar.g.get(runningAppProcessInfo.processName);
                            if (runningAppProcessInfo != null && (runningAppProcessInfo.importance != xfkVar.a || runningAppProcessInfo.lru != xfkVar.d || runningAppProcessInfo.uid != xfkVar.e)) {
                                String string = xfkVar.toString();
                                xfkVar.a = runningAppProcessInfo.importance;
                                xfkVar.b = runningAppProcessInfo.importanceReasonCode;
                                xfkVar.c = runningAppProcessInfo.importanceReasonPid;
                                xfkVar.d = runningAppProcessInfo.lru;
                                xfkVar.e = runningAppProcessInfo.uid;
                                ((ype) xfl.a.l().ai(10239)).R("Process info changed %s:%s->%s", runningAppProcessInfo.processName, string, xfkVar);
                            }
                            if (runningAppProcessInfo.importance >= 400) {
                                xflVar.a(runningAppProcessInfo.processName, yyv.PROCESS_RUNNING_AT_LOW_PRIORITY);
                            } else {
                                xflVar.a(runningAppProcessInfo.processName, yyv.PROCESS_RUNNING_AT_HIGH_PRIORITY);
                            }
                        }
                    }
                }
                if (xflVar.h) {
                    xflVar.e.postDelayed(xflVar.f, acvq.b());
                    return;
                }
                return;
        }
    }

    public teg(wlz wlzVar, int i) {
        this.b = i;
        this.a = wlzVar;
    }
}
