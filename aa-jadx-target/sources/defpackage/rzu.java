package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class rzu implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rzu(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v74, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v78, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v43, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, zhw] */
    @Override // java.lang.Runnable
    public final void run() {
        defpackage.zhs zhsVar;
        int i = 5;
        int i2 = 2;
        byte[] bArr = null;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                java.lang.Object obj = this.a;
                synchronized (((defpackage.rzv) obj).b) {
                    if (((defpackage.rzv) obj).d > 1) {
                        defpackage.rzv.a.h().ai(8593).C("%d USB disconnections occurred within the last %dms, this could be due to a bad cable.", ((defpackage.rzv) obj).d, ((defpackage.rzv) obj).e);
                    }
                    defpackage.rzs rzsVar = ((defpackage.rzv) obj).c;
                    if (rzsVar == null) {
                        defpackage.rzv.a.h().ai(8592).x("No USB state changes occurred within %dms, the system might be under pressure or a head unit application crash.", ((defpackage.rzv) obj).e);
                    } else if (rzsVar.c) {
                        defpackage.rzv.a.h().ai(8591).O("USB cable is still connected, this could signify a bad cable or a crash on the head unit. (isConfigured=%b, usbDisconnections=%d)", rzsVar.b, ((defpackage.rzv) obj).d);
                    } else {
                        defpackage.rzv.a.l().ai(8590).u("USB cable is no longer connected, this is likely a normal projection exit.");
                    }
                    ((defpackage.rzv) obj).g();
                    break;
                }
                return;
            case 1:
                ((defpackage.rzn) this.a).f();
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                com.google.android.gms.carsetup.CarSetupServiceImpl.a.f().ai(8663).u("quit handler thread");
                com.google.android.gms.carsetup.CarSetupServiceImpl carSetupServiceImpl = (com.google.android.gms.carsetup.CarSetupServiceImpl) this.a;
                carSetupServiceImpl.u.quitSafely();
                carSetupServiceImpl.u = null;
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Object obj2 = this.a;
                defpackage.sbq sbqVar = (defpackage.sbq) obj2;
                if (sbqVar.a.compareAndSet(false, true)) {
                    com.google.android.gms.carsetup.CarSetupServiceImpl.a.f().ai(8628).u("Car setup no longer needed");
                    try {
                        ((defpackage.sbq) obj2).h.close();
                        break;
                    } catch (java.io.IOException unused) {
                    }
                    sbqVar.c.removeCallbacks(sbqVar.b);
                    sbqVar.d.c();
                    sbqVar.n.b();
                    return;
                }
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.sbq sbqVar2 = (defpackage.sbq) this.a;
                defpackage.sid sidVar = (defpackage.sid) sbqVar2.n;
                sidVar.e.post(new defpackage.sas(sidVar, sbqVar2.l, sbqVar2.i, i2));
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.sbu sbuVar = (defpackage.sbu) this.a;
                if (!sbuVar.a) {
                    com.google.android.gms.carsetup.CarSetupServiceImpl carSetupServiceImpl2 = sbuVar.b;
                    carSetupServiceImpl2.q = java.lang.Boolean.FALSE;
                    carSetupServiceImpl2.k();
                    defpackage.omv.g(carSetupServiceImpl2, "com.google.android.gms.car.CAR_SETUP_SERVICE", defpackage.rsk.k.ordinal(), null);
                    return;
                }
                com.google.android.gms.carsetup.CarSetupServiceImpl carSetupServiceImpl3 = sbuVar.b;
                carSetupServiceImpl3.q = java.lang.Boolean.TRUE;
                if (!carSetupServiceImpl3.c.d()) {
                    defpackage.omv.g(carSetupServiceImpl3, "com.google.android.gms.car.CAR_SETUP_SERVICE", defpackage.rsk.j.ordinal(), null);
                    return;
                } else {
                    defpackage.omv.g(carSetupServiceImpl3, "com.google.android.gms.car.CAR_SETUP_SERVICE", defpackage.rsk.i.ordinal(), null);
                    carSetupServiceImpl3.d.i();
                    return;
                }
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.yqk yqkVar = defpackage.rvp.a;
                defpackage.rvk rvkVar = new defpackage.rvk();
                defpackage.shp shpVar = (defpackage.shp) this.a;
                defpackage.shu shuVar = shpVar.h;
                rvkVar.c = shuVar.b;
                rvkVar.p = 2;
                rvkVar.a = shpVar.e;
                rvkVar.e = new defpackage.shq();
                rvkVar.k = shpVar.d;
                rvkVar.d = shuVar.e;
                com.google.android.gms.car.CarInfo carInfo = shuVar.f;
                if (carInfo != null) {
                    rvkVar.o = new defpackage.ruq(carInfo.e, carInfo.f);
                }
                shpVar.g = new defpackage.rvp(rvkVar);
                defpackage.wyz wyzVar = shuVar.h;
                defpackage.rvp rvpVar = shpVar.g;
                defpackage.yqk yqkVar2 = defpackage.qtn.a;
                ((defpackage.qtn) wyzVar.a).d.post(new defpackage.kfq(wyzVar, rvpVar, 4, bArr));
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.rxe) this.a).a.h.f(true);
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.sid sidVar2 = (defpackage.sid) this.a;
                defpackage.sic sicVar = sidVar2.i;
                sicVar.a();
                sicVar.b.addAll(sidVar2.f);
                sidVar2.f();
                return;
            case 9:
                defpackage.sid sidVar3 = (defpackage.sid) this.a;
                defpackage.sic sicVar2 = sidVar3.i;
                if (sicVar2.a) {
                    sidVar3.b.unbindService(sidVar3.h);
                    sicVar2.a();
                    return;
                }
                return;
            case 10:
                java.lang.Object obj3 = this.a;
                defpackage.sbq sbqVar3 = (defpackage.sbq) obj3;
                if (sbqVar3.o) {
                    sbqVar3.c.post(new defpackage.ryw(obj3, 11));
                    return;
                } else {
                    sbqVar3.c.post(sbqVar3.b);
                    return;
                }
            case 11:
                java.lang.Object obj4 = this.a;
                synchronized (((defpackage.swi) obj4).a) {
                    if (((defpackage.swi) obj4).b()) {
                        defpackage.sqs sqsVar = defpackage.swi.f;
                        defpackage.sqs.aW("%s ** IS FORCE-RELEASED ON TIMEOUT **", ((defpackage.swi) obj4).d);
                        ((defpackage.swi) obj4).a();
                        if (((defpackage.swi) obj4).b()) {
                            ((defpackage.swi) obj4).b = 1;
                            ((defpackage.swi) obj4).f();
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 12:
                defpackage.yqm yqmVar = defpackage.tfh.a;
                this.a.invoke();
                return;
            case 13:
                ((defpackage.tfq) this.a).a();
                return;
            case 14:
                defpackage.thf thfVar = (defpackage.thf) this.a;
                java.util.Map map = (java.util.Map) thfVar.h.get(defpackage.tgt.b);
                map.getClass();
                if (thfVar.j) {
                    defpackage.thf.j(map, (defpackage.thd) thfVar.c().orElseThrow());
                }
                defpackage.thf.d(map);
                if (map.containsKey(defpackage.tgu.GEARHEAD_FRX_STARTED)) {
                    ((defpackage.yqj) defpackage.thf.a.l().ai((char) 9043)).u("Not recording startup latency for session with FRX");
                } else if (thfVar.k()) {
                    ((defpackage.yqj) defpackage.thf.a.l().ai((char) 9042)).u("not recording startup latency for first run for new version");
                } else if (map.containsKey(defpackage.tgu.GEARHEAD_WIRELESS_COLD_STARTUP_STARTED)) {
                    thfVar.i(defpackage.tgs.COLD);
                } else if (map.containsKey(defpackage.tgu.GEARHEAD_WIRELESS_WARM_STARTUP_STARTED)) {
                    thfVar.i(defpackage.tgs.WARM);
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.thf.a.h()).ai((char) 9041)).u("no warm or cold startup time recorded, ignoring call");
                }
                map.clear();
                return;
            case 15:
                defpackage.vrl vrlVar = (defpackage.vrl) this.a;
                defpackage.vlu vluVar = vrlVar.h;
                vluVar.getClass();
                if (vrlVar.b == 0) {
                    vrlVar.c = true;
                    java.util.Iterator it = vrlVar.g.iterator();
                    while (it.hasNext()) {
                        ((defpackage.vqu) it.next()).k(vluVar);
                    }
                }
                vrlVar.h.getClass();
                vrlVar.a();
                return;
            case 16:
                defpackage.vup vupVar = (defpackage.vup) this.a;
                if (((java.lang.Boolean) vupVar.h.a()).booleanValue()) {
                    defpackage.vpu vpuVar = vupVar.j;
                    java.util.Iterator it2 = vpuVar.b.iterator();
                    while (it2.hasNext()) {
                        defpackage.zhs zhsVarA = ((defpackage.vpy) it2.next()).a();
                        defpackage.key keyVar = new defpackage.key(vpuVar, i);
                        java.util.concurrent.Executor executor = vpuVar.a;
                        int i3 = defpackage.zgh.c;
                        defpackage.zgf zgfVar = new defpackage.zgf(zhsVarA, keyVar);
                        zhsVarA.c(zgfVar, defpackage.ysr.ch(executor, zgfVar));
                    }
                }
                defpackage.ret retVar = vupVar.k;
                if (((java.lang.Boolean) retVar.c.a()).booleanValue()) {
                    double dLongValue = ((java.lang.Long) retVar.d.a()).longValue();
                    java.lang.Object obj5 = retVar.a;
                    ?? r3 = retVar.f;
                    retVar.b.scheduleWithFixedDelay(new unh(retVar, 19), java.lang.Math.round(dLongValue + (((java.util.Random) obj5).nextDouble() * ((java.lang.Long) r3.a()).longValue())), ((java.lang.Long) r3.a()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
                    return;
                }
                return;
            case 17:
                final defpackage.vup vupVar2 = (defpackage.vup) this.a;
                vupVar2.c.execute(new defpackage.zim(new defpackage.zgm() { // from class: vuo
                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:114:0x02ed A[Catch: all -> 0x02fb, LOOP:1: B:481:0x01e7->B:114:0x02ed, LOOP_END, TryCatch #17 {all -> 0x02fb, blocks: (B:105:0x02c4, B:113:0x02ec, B:112:0x02e9, B:114:0x02ed, B:120:0x0301, B:121:0x0309, B:95:0x0288, B:74:0x0201, B:109:0x02e4), top: B:468:0x02c4, inners: #0, #2, #6 }] */
                    /* JADX WARN: Code duplicated, block: B:265:0x064e A[Catch: all -> 0x084b, TRY_ENTER, TRY_LEAVE, TryCatch #25 {all -> 0x084b, blocks: (B:232:0x0597, B:235:0x05a6, B:245:0x05db, B:248:0x05f9, B:251:0x061a, B:265:0x064e), top: B:483:0x0597 }] */
                    /* JADX WARN: Code duplicated, block: B:267:0x0661  */
                    /* JADX WARN: Code duplicated, block: B:271:0x066a  */
                    /* JADX WARN: Code duplicated, block: B:283:0x0696  */
                    /* JADX WARN: Code duplicated, block: B:287:0x06c0  */
                    /* JADX WARN: Code duplicated, block: B:290:0x06e5 A[Catch: all -> 0x068a, LOOP:9: B:286:0x06be->B:290:0x06e5, LOOP_END, TryCatch #23 {all -> 0x068a, blocks: (B:275:0x067a, B:288:0x06c2, B:290:0x06e5, B:291:0x06eb, B:292:0x071b), top: B:479:0x067a }] */
                    /* JADX WARN: Code duplicated, block: B:305:0x073c  */
                    /* JADX WARN: Code duplicated, block: B:307:0x0755 A[Catch: all -> 0x0841, TryCatch #19 {all -> 0x0841, blocks: (B:325:0x0830, B:308:0x075e, B:309:0x0766, B:311:0x076c, B:313:0x077e, B:315:0x07a1, B:316:0x07b7, B:318:0x07ea, B:319:0x07f5, B:321:0x0812, B:322:0x081d, B:323:0x0824, B:306:0x0743, B:307:0x0755), top: B:471:0x0830 }] */
                    /* JADX WARN: Code duplicated, block: B:359:0x089f  */
                    /* JADX WARN: Code duplicated, block: B:361:0x08a3  */
                    /* JADX WARN: Code duplicated, block: B:363:0x08a7  */
                    /* JADX WARN: Code duplicated, block: B:365:0x08ab  */
                    /* JADX WARN: Code duplicated, block: B:367:0x08af  */
                    /* JADX WARN: Code duplicated, block: B:369:0x08b3  */
                    /* JADX WARN: Code duplicated, block: B:371:0x08b7  */
                    /* JADX WARN: Code duplicated, block: B:373:0x08bb  */
                    /* JADX WARN: Code duplicated, block: B:375:0x08bf  */
                    /* JADX WARN: Code duplicated, block: B:376:0x08d5  */
                    /* JADX WARN: Code duplicated, block: B:377:0x08d8  */
                    /* JADX WARN: Code duplicated, block: B:378:0x08db  */
                    /* JADX WARN: Code duplicated, block: B:379:0x08dd  */
                    /* JADX WARN: Code duplicated, block: B:380:0x08df  */
                    /* JADX WARN: Code duplicated, block: B:381:0x08e2  */
                    /* JADX WARN: Code duplicated, block: B:382:0x08e4  */
                    /* JADX WARN: Code duplicated, block: B:383:0x08e6  */
                    /* JADX WARN: Code duplicated, block: B:384:0x08e8  */
                    /* JADX WARN: Code duplicated, block: B:386:0x08eb  */
                    /* JADX WARN: Code duplicated, block: B:389:0x0922  */
                    /* JADX WARN: Code duplicated, block: B:390:0x092b  */
                    /* JADX WARN: Code duplicated, block: B:392:0x0946  */
                    /* JADX WARN: Code duplicated, block: B:395:0x0959  */
                    /* JADX WARN: Code duplicated, block: B:396:0x096f  */
                    /* JADX WARN: Code duplicated, block: B:398:0x097c  */
                    /* JADX WARN: Code duplicated, block: B:399:0x0998  */
                    /* JADX WARN: Code duplicated, block: B:402:0x09a0  */
                    /* JADX WARN: Code duplicated, block: B:404:0x09c2  */
                    /* JADX WARN: Code duplicated, block: B:405:0x09d4  */
                    /* JADX WARN: Code duplicated, block: B:417:0x0a18  */
                    /* JADX WARN: Code duplicated, block: B:436:0x031d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:438:0x0201 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:450:0x086b A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:458:0x0664 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:466:0x0a33 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:469:0x0207 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:485:0x066d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:541:0x06eb A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:73:0x01ff  */
                    /* JADX WARN: Code duplicated, block: B:86:0x0239 A[Catch: all -> 0x02fd, TRY_ENTER, TRY_LEAVE, TryCatch #18 {all -> 0x02fd, blocks: (B:76:0x0207, B:86:0x0239, B:94:0x027e, B:96:0x028b, B:103:0x02b9, B:74:0x0201), top: B:469:0x0207 }] */
                    /* JADX WARN: Code duplicated, block: B:89:0x0257 A[Catch: all -> 0x01f8, TRY_ENTER, TryCatch #14 {all -> 0x01f8, blocks: (B:66:0x01ee, B:79:0x021d, B:89:0x0257, B:91:0x0265, B:93:0x026b, B:99:0x02a4), top: B:462:0x01ee }] */
                    /* JADX WARN: Code duplicated, block: B:99:0x02a4 A[Catch: all -> 0x01f8, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x01f8, blocks: (B:66:0x01ee, B:79:0x021d, B:89:0x0257, B:91:0x0265, B:93:0x026b, B:99:0x02a4), top: B:462:0x01ee }] */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r20v3 */
                    /* JADX WARN: Type inference failed for: r6v5, types: [afak, java.lang.Object] */
                    @Override // defpackage.zgm
                    public final defpackage.zhs a() throws java.lang.Throwable {
                        int i4;
                        int i5;
                        java.lang.String str;
                        int i6;
                        android.app.ApplicationExitInfo applicationExitInfo;
                        long j;
                        java.io.File file;
                        int iM;
                        int i7;
                        defpackage.vpq vpqVar;
                        int iM$1;
                        defpackage.abqv abqvVarC;
                        java.io.File file2;
                        java.io.File[] fileArrListFiles;
                        java.io.File file3;
                        java.lang.Long lValueOf;
                        int i8;
                        defpackage.zho zhoVar;
                        java.io.FileInputStream fileInputStream;
                        java.io.File file4;
                        java.util.List listI;
                        long j2;
                        long j3;
                        java.lang.Throwable th;
                        int i9;
                        boolean zEquals;
                        java.util.Map.Entry[] entryArr;
                        int length;
                        yif yifVarA;
                        java.lang.Object[] objArr;
                        java.lang.Object[] objArr2;
                        java.lang.Object obj6;
                        int i10;
                        java.util.Map.Entry entry;
                        java.util.Map.Entry entry2;
                        java.util.Map.Entry[] entryArr2;
                        java.lang.Object key;
                        int i11;
                        java.lang.Throwable th2;
                        int i12;
                        defpackage.abts abtsVar;
                        java.lang.Throwable th3;
                        defpackage.abnv abnvVarE;
                        defpackage.abnv abnvVarT;
                        defpackage.afak afakVar;
                        defpackage.abor aborVarN;
                        java.util.zip.GZIPOutputStream gZIPOutputStream;
                        defpackage.abnv abnvVarB;
                        defpackage.afak afakVar2;
                        android.app.ApplicationExitInfo.AnrInfo anrInfoM;
                        defpackage.vup vupVar3 = vupVar2;
                        defpackage.aclm aclmVar = vupVar3.e;
                        if (!((defpackage.vuk) aclmVar.a()).c()) {
                            return defpackage.zho.a;
                        }
                        if (!hh$.ExternalSyntheticApiModelOutline0.m().equals(java.lang.String.valueOf(vupVar3.b.getPackageName()).concat(java.lang.String.valueOf(((defpackage.vuk) aclmVar.a()).a)))) {
                            return defpackage.zho.a;
                        }
                        if (!((java.lang.Boolean) vupVar3.f.a()).booleanValue()) {
                            return defpackage.zho.a;
                        }
                        final defpackage.vum vumVar = vupVar3.i;
                        defpackage.afak afakVar3 = vupVar3.d;
                        java.lang.String string = ((android.content.SharedPreferences) afakVar3.a()).getString("lastExitProcessName", null);
                        long j4 = ((android.content.SharedPreferences) afakVar3.a()).getLong("lastExitTimestamp", -1L);
                        android.content.Context context = vumVar.a;
                        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
                        activityManager.getClass();
                        int i13 = 0;
                        java.util.List listM = bgp$.ExternalSyntheticApiModelOutline0.m(activityManager, context.getPackageName(), 0, 0);
                        int i14 = defpackage.ygw.d;
                        int i15 = 4;
                        defpackage.ygr ygrVar = new defpackage.ygr(4);
                        java.util.Iterator it3 = listM.iterator();
                        while (it3.hasNext()) {
                            android.app.ApplicationExitInfo applicationExitInfoM = bgp$.ExternalSyntheticApiModelOutline0.m(it3.next());
                            if (bgp$.ExternalSyntheticApiModelOutline0.m(applicationExitInfoM).equals(string) && bgp$.ExternalSyntheticApiModelOutline0.m(applicationExitInfoM) == j4) {
                                defpackage.zgo zgoVar = new defpackage.zgo(defpackage.ygw.n(ygrVar.g()), true);
                                defpackage.kpo kpoVar = new defpackage.kpo(7);
                                defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
                                int i16 = defpackage.zgh.c;
                                defpackage.zgg zggVar = new defpackage.zgg(zgoVar, kpoVar);
                                zgoVar.c(zggVar, defpackage.ysr.ch(zgtVar, zggVar));
                                defpackage.zgf zgfVar2 = new defpackage.zgf(zggVar, new defpackage.whl(vupVar3, 1));
                                zggVar.c(zgfVar2, defpackage.ysr.ch(zgtVar, zgfVar2));
                                return zgfVar2;
                            }
                            final defpackage.abor aborVarN2 = ajfh.a.n();
                            java.lang.String strM = bgp$.ExternalSyntheticApiModelOutline0.m(applicationExitInfoM);
                            aborVarN2.t();
                            ajfh ajfhVar = aborVarN2.b;
                            strM.getClass();
                            ajfhVar.b |= 1;
                            ajfhVar.c = strM;
                            int iM$2 = bgp$.ExternalSyntheticApiModelOutline0.m$1(applicationExitInfoM);
                            aborVarN2.t();
                            ajfh ajfhVar2 = aborVarN2.b;
                            ajfhVar2.b |= i15;
                            ajfhVar2.e = iM$2;
                            long j5 = j4;
                            long jM = bgp$.ExternalSyntheticApiModelOutline0.m(applicationExitInfoM);
                            aborVarN2.t();
                            ajfh ajfhVar3 = aborVarN2.b;
                            int i17 = 16;
                            ajfhVar3.b |= 16;
                            ajfhVar3.g = jM;
                            long jM$1 = bgp$.ExternalSyntheticApiModelOutline0.m$1(applicationExitInfoM);
                            aborVarN2.t();
                            ajfh ajfhVar4 = aborVarN2.b;
                            ajfhVar4.b |= 64;
                            ajfhVar4.i = jM$1;
                            long jM2 = vuo$.ExternalSyntheticApiModelOutline4.m(applicationExitInfoM);
                            aborVarN2.t();
                            ajfh ajfhVar5 = aborVarN2.b;
                            ajfhVar5.b |= 128;
                            ajfhVar5.j = jM2;
                            boolean zM = vuo$.ExternalSyntheticApiModelOutline4.m();
                            aborVarN2.t();
                            ajfh ajfhVar6 = aborVarN2.b;
                            ajfhVar6.b |= 256;
                            ajfhVar6.k = zM;
                            int iM2 = bgp$.ExternalSyntheticApiModelOutline0.m(applicationExitInfoM);
                            java.lang.String strM2 = vuo$.ExternalSyntheticApiModelOutline4.m(applicationExitInfoM);
                            char c = 5;
                            switch (iM2) {
                                case defpackage.abnt.b /* 0 */:
                                    i17 = 15;
                                    i4 = i17;
                                    i5 = 2;
                                    it3 = it3;
                                    break;
                                case 1:
                                    i4 = 2;
                                    i5 = 2;
                                    break;
                                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                    i4 = 3;
                                    i5 = 2;
                                    break;
                                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                    i4 = 4;
                                    i5 = 2;
                                    break;
                                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                    i4 = 5;
                                    i5 = 2;
                                    break;
                                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                    i4 = 6;
                                    i5 = 2;
                                    break;
                                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                    i4 = 7;
                                    i5 = 2;
                                    break;
                                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                    i4 = 8;
                                    i5 = 2;
                                    break;
                                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                    i4 = 9;
                                    i5 = 2;
                                    break;
                                case 9:
                                    i4 = 10;
                                    i5 = 2;
                                    break;
                                case 10:
                                    i17 = 11;
                                    i4 = i17;
                                    i5 = 2;
                                    it3 = it3;
                                    break;
                                case 11:
                                    i17 = 12;
                                    i4 = i17;
                                    i5 = 2;
                                    it3 = it3;
                                    break;
                                case 12:
                                    i17 = 13;
                                    i4 = i17;
                                    i5 = 2;
                                    it3 = it3;
                                    break;
                                case 13:
                                    i17 = 14;
                                    if (strM2 != null && strM2.contains("MemoryLimiter:AnonSwap")) {
                                        i17 = 18;
                                    }
                                    i4 = i17;
                                    i5 = 2;
                                    it3 = it3;
                                    break;
                                case 14:
                                    i4 = 100;
                                    i5 = 2;
                                    break;
                                case 15:
                                    i4 = i17;
                                    i5 = 2;
                                    it3 = it3;
                                    break;
                                case 16:
                                    i17 = 17;
                                    i4 = i17;
                                    i5 = 2;
                                    it3 = it3;
                                    break;
                                default:
                                    it3 = it3;
                                    i5 = 2;
                                    ((defpackage.ype) ((defpackage.ype) vmf.a.h()).ai((char) 9848)).y("Unknown ApplicationExitInfo Reason: %s", new defpackage.vqo(iM2));
                                    i4 = i13;
                                    break;
                            }
                            if (i4 != 0) {
                                aborVarN2.t();
                                ajfh ajfhVar7 = aborVarN2.b;
                                int i18 = i4 - 1;
                                ajfhVar7.d = i18;
                                ajfhVar7.b |= 2;
                                if (i18 != 5) {
                                    if (i18 == 6 && android.os.Build.VERSION.SDK_INT >= 33) {
                                        try {
                                            java.io.InputStream inputStreamM = vuo$.ExternalSyntheticApiModelOutline4.m(applicationExitInfoM);
                                            try {
                                                java.lang.String strM3 = vuo$.ExternalSyntheticApiModelOutline4.m(applicationExitInfoM);
                                                if (inputStreamM != null && !defpackage.ysr.bw(strM3)) {
                                                    defpackage.abnv abnvVar = defpackage.abnv.d;
                                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                                    int iMin = 256;
                                                    while (true) {
                                                        try {
                                                            byte[] bArr2 = new byte[iMin];
                                                            int i19 = i13;
                                                            while (i19 < iMin) {
                                                                try {
                                                                    int i20 = inputStreamM.read(bArr2, i19, iMin - i19);
                                                                    if (i20 == -1) {
                                                                        if (i19 == 0) {
                                                                            abnvVarE = null;
                                                                        } else {
                                                                            try {
                                                                                abnvVarE = defpackage.abnv.E(bArr2, i13, i19);
                                                                            } catch (defpackage.abpp e) {
                                                                                throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                                                                            }
                                                                        }
                                                                        if (abnvVarE == null) {
                                                                            try {
                                                                                abnvVarT = defpackage.abnv.t(arrayList);
                                                                                afakVar = vumVar.f;
                                                                                if (((java.lang.Long) afakVar.a()).longValue() >= 0 || abnvVarT.d() <= ((java.lang.Long) afakVar.a()).longValue()) {
                                                                                    aborVarN = ajfg.a.n();
                                                                                    aborVarN.t();
                                                                                    ajfg ajfgVar = aborVarN.b;
                                                                                    strM3.getClass();
                                                                                    ajfgVar.b |= 1;
                                                                                    ajfgVar.e = strM3;
                                                                                    if (android.os.Build.VERSION.SDK_INT >= 37 && ((java.lang.Boolean) vumVar.e.a()).booleanValue() && (anrInfoM = dac$.ExternalSyntheticApiModelOutline0.m(applicationExitInfoM)) != null) {
                                                                                        boolean zM2 = dac$.ExternalSyntheticApiModelOutline0.m(anrInfoM);
                                                                                        aborVarN.t();
                                                                                        ajfg ajfgVar2 = aborVarN.b;
                                                                                        ajfgVar2.b |= 8;
                                                                                        ajfgVar2.f = zM2;
                                                                                    }
                                                                                    abnu abnuVar = new abnu();
                                                                                    gZIPOutputStream = new java.util.zip.GZIPOutputStream(abnuVar);
                                                                                    try {
                                                                                        abnvVarT.m(gZIPOutputStream);
                                                                                        gZIPOutputStream.close();
                                                                                        abnvVarB = abnuVar.b();
                                                                                        afakVar2 = vumVar.g;
                                                                                        if (((java.lang.Long) afakVar2.a()).longValue() >= 0 || abnvVarB.d() <= ((java.lang.Long) afakVar2.a()).longValue()) {
                                                                                            aborVarN.t();
                                                                                            ajfg ajfgVar3 = aborVarN.b;
                                                                                            abnvVarB.getClass();
                                                                                            try {
                                                                                                ajfgVar3.c = 5;
                                                                                                ajfgVar3.d = abnvVarB;
                                                                                                ajfg ajfgVarQ = aborVarN.q();
                                                                                                aborVarN2.t();
                                                                                                ajfh ajfhVar8 = aborVarN2.b;
                                                                                                ajfgVarQ.getClass();
                                                                                                ajfhVar8.l = ajfgVarQ;
                                                                                                ajfhVar8.b |= 512;
                                                                                                inputStreamM.close();
                                                                                            } catch (java.lang.Throwable th4) {
                                                                                                th = th4;
                                                                                                th3 = th;
                                                                                                if (inputStreamM != null) {
                                                                                                    try {
                                                                                                        inputStreamM.close();
                                                                                                    } catch (java.lang.Throwable th5) {
                                                                                                        th3.addSuppressed(th5);
                                                                                                    }
                                                                                                }
                                                                                                throw th3;
                                                                                            }
                                                                                        }
                                                                                    } catch (java.lang.Throwable th6) {
                                                                                        try {
                                                                                            gZIPOutputStream.close();
                                                                                            throw th6;
                                                                                        } catch (java.lang.Throwable th7) {
                                                                                            th6.addSuppressed(th7);
                                                                                            throw th6;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    inputStreamM.close();
                                                                                } catch (java.io.IOException e2) {
                                                                                    e = e2;
                                                                                    ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).p(e)).ai((char) 9843)).u("Failed to read ANR trace");
                                                                                }
                                                                            } catch (java.lang.Throwable th8) {
                                                                                th = th8;
                                                                                th3 = th;
                                                                                if (inputStreamM != null) {
                                                                                    inputStreamM.close();
                                                                                }
                                                                                throw th3;
                                                                            }
                                                                        } else {
                                                                            arrayList.add(abnvVarE);
                                                                            iMin = java.lang.Math.min(iMin + iMin, 8192);
                                                                            c = 5;
                                                                        }
                                                                    } else {
                                                                        i19 += i20;
                                                                    }
                                                                } catch (java.lang.Throwable th9) {
                                                                    th3 = th9;
                                                                    if (inputStreamM != null) {
                                                                        inputStreamM.close();
                                                                    }
                                                                    throw th3;
                                                                }
                                                            }
                                                            if (i19 == 0) {
                                                                abnvVarE = null;
                                                            } else {
                                                                abnvVarE = defpackage.abnv.E(bArr2, i13, i19);
                                                            }
                                                            if (abnvVarE == null) {
                                                                abnvVarT = defpackage.abnv.t(arrayList);
                                                                afakVar = vumVar.f;
                                                                if (((java.lang.Long) afakVar.a()).longValue() >= 0) {
                                                                    aborVarN = ajfg.a.n();
                                                                    aborVarN.t();
                                                                    ajfg ajfgVar4 = aborVarN.b;
                                                                    strM3.getClass();
                                                                    ajfgVar4.b |= 1;
                                                                    ajfgVar4.e = strM3;
                                                                    if (android.os.Build.VERSION.SDK_INT >= 37) {
                                                                        boolean zM3 = dac$.ExternalSyntheticApiModelOutline0.m(anrInfoM);
                                                                        aborVarN.t();
                                                                        ajfg ajfgVar5 = aborVarN.b;
                                                                        ajfgVar5.b |= 8;
                                                                        ajfgVar5.f = zM3;
                                                                    }
                                                                    abnu abnuVar2 = new abnu();
                                                                    gZIPOutputStream = new java.util.zip.GZIPOutputStream(abnuVar2);
                                                                    abnvVarT.m(gZIPOutputStream);
                                                                    gZIPOutputStream.close();
                                                                    abnvVarB = abnuVar2.b();
                                                                    afakVar2 = vumVar.g;
                                                                    if (((java.lang.Long) afakVar2.a()).longValue() >= 0) {
                                                                    }
                                                                    aborVarN.t();
                                                                    ajfg ajfgVar6 = aborVarN.b;
                                                                    abnvVarB.getClass();
                                                                    ajfgVar6.c = 5;
                                                                    ajfgVar6.d = abnvVarB;
                                                                    ajfg ajfgVarQ2 = aborVarN.q();
                                                                    aborVarN2.t();
                                                                    ajfh ajfhVar9 = aborVarN2.b;
                                                                    ajfgVarQ2.getClass();
                                                                    ajfhVar9.l = ajfgVarQ2;
                                                                    ajfhVar9.b |= 512;
                                                                    inputStreamM.close();
                                                                } else {
                                                                    aborVarN = ajfg.a.n();
                                                                    aborVarN.t();
                                                                    ajfg ajfgVar7 = aborVarN.b;
                                                                    strM3.getClass();
                                                                    ajfgVar7.b |= 1;
                                                                    ajfgVar7.e = strM3;
                                                                    if (android.os.Build.VERSION.SDK_INT >= 37) {
                                                                        boolean zM4 = dac$.ExternalSyntheticApiModelOutline0.m(anrInfoM);
                                                                        aborVarN.t();
                                                                        ajfg ajfgVar8 = aborVarN.b;
                                                                        ajfgVar8.b |= 8;
                                                                        ajfgVar8.f = zM4;
                                                                    }
                                                                    abnu abnuVar3 = new abnu();
                                                                    gZIPOutputStream = new java.util.zip.GZIPOutputStream(abnuVar3);
                                                                    abnvVarT.m(gZIPOutputStream);
                                                                    gZIPOutputStream.close();
                                                                    abnvVarB = abnuVar3.b();
                                                                    afakVar2 = vumVar.g;
                                                                    if (((java.lang.Long) afakVar2.a()).longValue() >= 0) {
                                                                    }
                                                                    aborVarN.t();
                                                                    ajfg ajfgVar9 = aborVarN.b;
                                                                    abnvVarB.getClass();
                                                                    ajfgVar9.c = 5;
                                                                    ajfgVar9.d = abnvVarB;
                                                                    ajfg ajfgVarQ3 = aborVarN.q();
                                                                    aborVarN2.t();
                                                                    ajfh ajfhVar10 = aborVarN2.b;
                                                                    ajfgVarQ3.getClass();
                                                                    ajfhVar10.l = ajfgVarQ3;
                                                                    ajfhVar10.b |= 512;
                                                                    inputStreamM.close();
                                                                }
                                                            } else {
                                                                arrayList.add(abnvVarE);
                                                                iMin = java.lang.Math.min(iMin + iMin, 8192);
                                                                c = 5;
                                                            }
                                                        } catch (java.lang.Throwable th10) {
                                                            th = th10;
                                                            th3 = th;
                                                            if (inputStreamM != null) {
                                                                inputStreamM.close();
                                                            }
                                                            throw th3;
                                                        }
                                                    }
                                                } else if (inputStreamM != null) {
                                                    try {
                                                        inputStreamM.close();
                                                    } catch (java.io.IOException e3) {
                                                        e = e3;
                                                        ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).p(e)).ai((char) 9843)).u("Failed to read ANR trace");
                                                        str = string;
                                                        i6 = i13;
                                                        applicationExitInfo = applicationExitInfoM;
                                                        j = j5;
                                                        file = null;
                                                        iM = vuo$.ExternalSyntheticApiModelOutline4.m(applicationExitInfo);
                                                        if (iM != 100) {
                                                            i7 = 2;
                                                        } else if (iM != 125) {
                                                            i7 = 3;
                                                        } else if (iM != 200) {
                                                            i7 = 5;
                                                        } else if (iM != 230) {
                                                            i7 = 6;
                                                        } else if (iM != 300) {
                                                            i7 = 8;
                                                        } else if (iM != 325) {
                                                            i7 = 4;
                                                        } else if (iM != 350) {
                                                            i7 = 7;
                                                        } else if (iM != 400) {
                                                            i7 = 9;
                                                        } else if (iM != 1000) {
                                                            ((defpackage.ype) ((defpackage.ype) vmf.a.h()).ai((char) 9846)).y("Unknown ApplicationExitInfo Importance: %s", new defpackage.vqo(iM));
                                                            i7 = i6;
                                                        } else {
                                                            i7 = 10;
                                                        }
                                                        if (i7 != 0) {
                                                            aborVarN2.t();
                                                            ajfh ajfhVar11 = aborVarN2.b;
                                                            ajfhVar11.f = i7 - 1;
                                                            ajfhVar11.b |= 8;
                                                        }
                                                        vpqVar = vumVar.o;
                                                        iM$1 = vuo$.ExternalSyntheticApiModelOutline4.m$1(applicationExitInfo);
                                                        long jM3 = bgp$.ExternalSyntheticApiModelOutline0.m(applicationExitInfo);
                                                        abqvVarC = defpackage.abrx.c(jM3 / 1000, (int) ((jM3 % 1000) * 1000000));
                                                        if (((java.lang.Boolean) vpqVar.d.a()).booleanValue()) {
                                                            file2 = new java.io.File(vpqVar.a.getFilesDir(), "flight_records");
                                                            if (((java.lang.Boolean) vpqVar.c.a()).booleanValue()) {
                                                                defpackage.vpq.a(file2, vpqVar.b.f().getEpochSecond());
                                                            }
                                                            if (file2.exists()) {
                                                                fileArrListFiles = file2.listFiles((java.io.FilenameFilter) new vpo(iM$1));
                                                                if (fileArrListFiles == null) {
                                                                    ((defpackage.ype) ((defpackage.ype) vmf.a.f()).ai(9793)).w("Failed to find any valid flight records for process id %d", iM$1);
                                                                    zhoVar = new defpackage.zho(defpackage.xxe.a);
                                                                } else {
                                                                    file3 = file;
                                                                    lValueOf = file3;
                                                                    i8 = i6;
                                                                    while (i8 < fileArrListFiles.length) {
                                                                        file4 = fileArrListFiles[i8];
                                                                        listI = new defpackage.xzd(new defpackage.xyx(new defpackage.xxo('_'))).i(file4.getName());
                                                                        if (listI.size() != 2) {
                                                                            ((defpackage.ype) ((defpackage.ype) vmf.a.h()).ai((char) 9792)).y("Invalid flight record file name: %s", file4.getName());
                                                                        } else {
                                                                            try {
                                                                                j2 = java.lang.Long.parseLong((java.lang.String) listI.get(1));
                                                                                j3 = abqvVarC.b;
                                                                                if (j2 > j3) {
                                                                                }
                                                                            } catch (java.lang.NumberFormatException e4) {
                                                                                ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).p(e4)).ai((char) 9791)).y("Invalid timestamp in flight record file name: %s", file4.getName());
                                                                            }
                                                                        }
                                                                        i8++;
                                                                        lValueOf = lValueOf;
                                                                    }
                                                                    if (file3 == null) {
                                                                        ((defpackage.ype) ((defpackage.ype) vmf.a.f()).ai(9790)).w("Failed to find any valid flight records for process id %d", iM$1);
                                                                        zhoVar = new defpackage.zho(defpackage.xxe.a);
                                                                    } else {
                                                                        try {
                                                                            fileInputStream = new java.io.FileInputStream(file3);
                                                                            try {
                                                                                defpackage.abol abolVarA = defpackage.abol.a();
                                                                                vpn vpnVar = vpn.a;
                                                                                int i21 = defpackage.abny.l;
                                                                                vpn vpnVarC = defpackage.abox.C(vpnVar, new defpackage.abnx(fileInputStream), abolVarA);
                                                                                defpackage.abox.U(vpnVarC);
                                                                                vpn vpnVar2 = vpnVarC;
                                                                                ((defpackage.ype) ((defpackage.ype) vmf.a.e()).ai(9788)).u("Read and serialization successful");
                                                                                vpnVar2.getClass();
                                                                                defpackage.zho zhoVar2 = new defpackage.zho(new defpackage.xys(vpnVar2));
                                                                                fileInputStream.close();
                                                                                zhoVar = zhoVar2;
                                                                            } catch (java.lang.Throwable th11) {
                                                                                try {
                                                                                    fileInputStream.close();
                                                                                } catch (java.lang.Throwable th12) {
                                                                                    th11.addSuppressed(th12);
                                                                                }
                                                                                throw th11;
                                                                            }
                                                                        } catch (java.io.IOException e5) {
                                                                            ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).p(e5)).ai((char) 9789)).u("Failed to read FlightRecord from file");
                                                                            zhoVar = new defpackage.zho(defpackage.xxe.a);
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                ((defpackage.ype) ((defpackage.ype) vmf.a.f()).ai((char) 9794)).u("Flight records directory does not exist");
                                                                zhoVar = new defpackage.zho(defpackage.xxe.a);
                                                            }
                                                        } else {
                                                            zhoVar = new defpackage.zho(defpackage.xxe.a);
                                                        }
                                                        defpackage.xyd xydVar = new defpackage.xyd() { // from class: vul
                                                            @Override // defpackage.xyd
                                                            public final java.lang.Object a(java.lang.Object obj7) {
                                                                int i22;
                                                                boolean z;
                                                                defpackage.ygw ygwVarA;
                                                                defpackage.xyn xynVar = (defpackage.xyn) obj7;
                                                                boolean zF = xynVar.f();
                                                                defpackage.abor aborVar = aborVarN2;
                                                                if (!zF) {
                                                                    return aborVar.q();
                                                                }
                                                                for (vpj vpjVar : ((vpn) xynVar.b()).e) {
                                                                    int i23 = vpjVar.b;
                                                                    int i24 = 3;
                                                                    boolean z2 = true;
                                                                    if (i23 == 0) {
                                                                        i22 = 5;
                                                                    } else if (i23 == 1) {
                                                                        i22 = 1;
                                                                    } else if (i23 == 2) {
                                                                        i22 = 2;
                                                                    } else if (i23 != 3) {
                                                                        i22 = i23 != 4 ? 0 : 4;
                                                                    } else {
                                                                        i22 = 3;
                                                                    }
                                                                    if (i22 == 0) {
                                                                        throw null;
                                                                    }
                                                                    int i25 = i22 - 1;
                                                                    defpackage.vum vumVar2 = vumVar;
                                                                    if (i25 != 0) {
                                                                        if (i25 == 1) {
                                                                            defpackage.abqv abqvVar = (i23 == 2 ? (vpk) vpjVar.c : vpk.a).c;
                                                                            if (abqvVar == null) {
                                                                                abqvVar = defpackage.abqv.a;
                                                                            }
                                                                            long jA = defpackage.abrx.a(abqvVar);
                                                                            aborVar.t();
                                                                            ajfh ajfhVar12 = aborVar.b;
                                                                            ajfh ajfhVar13 = ajfh.a;
                                                                            ajfhVar12.b |= 32;
                                                                            ajfhVar12.h = jA;
                                                                        } else if (i25 != 2) {
                                                                            if (i25 == 3) {
                                                                                vpm vpmVar = i23 == 4 ? (vpm) vpjVar.c : vpm.a;
                                                                                defpackage.abor aborVarN3 = ajhy.a.n();
                                                                                if (vpmVar.c.equals(((defpackage.vsz) vumVar2.b).a())) {
                                                                                    z = false;
                                                                                } else {
                                                                                    java.lang.String str2 = vpmVar.c;
                                                                                    aborVarN3.t();
                                                                                    ajhy ajhyVar = aborVarN3.b;
                                                                                    str2.getClass();
                                                                                    ajhyVar.b |= 1;
                                                                                    ajhyVar.c = str2;
                                                                                    z = true;
                                                                                }
                                                                                if (vpmVar.d != ((defpackage.vsy) vumVar2.c).a().intValue()) {
                                                                                    int i26 = vpmVar.d;
                                                                                    aborVarN3.t();
                                                                                    ajhy ajhyVar2 = aborVarN3.b;
                                                                                    ajhyVar2.b = 2 | ajhyVar2.b;
                                                                                    ajhyVar2.d = i26;
                                                                                    z = true;
                                                                                }
                                                                                if (vpmVar.e != ((java.lang.Integer) vumVar2.d.a()).intValue()) {
                                                                                    int i27 = vpmVar.e;
                                                                                    aborVarN3.t();
                                                                                    ajhy ajhyVar3 = aborVarN3.b;
                                                                                    ajhyVar3.b = 4 | ajhyVar3.b;
                                                                                    ajhyVar3.e = i27;
                                                                                } else {
                                                                                    z2 = z;
                                                                                }
                                                                                if (vpmVar.f != android.os.Build.VERSION.SDK_INT) {
                                                                                    int i28 = vpmVar.f;
                                                                                    aborVarN3.t();
                                                                                    ajhy ajhyVar4 = aborVarN3.b;
                                                                                    ajhyVar4.b |= 8;
                                                                                    ajhyVar4.f = i28;
                                                                                } else if (z2) {
                                                                                }
                                                                                ajhy ajhyVarQ = aborVarN3.q();
                                                                                aborVar.t();
                                                                                ajfh ajfhVar14 = aborVar.b;
                                                                                ajfh ajfhVar15 = ajfh.a;
                                                                                ajhyVarQ.getClass();
                                                                                ajfhVar14.o = ajhyVarQ;
                                                                                ajfhVar14.b |= 4096;
                                                                            }
                                                                        } else if ((aborVar.b.b & 512) != 0 && ((java.lang.Boolean) vumVar2.h.a()).booleanValue()) {
                                                                            vpl vplVar = vpjVar.b == 3 ? (vpl) vpjVar.c : vpl.a;
                                                                            defpackage.afak afakVar4 = vumVar2.j;
                                                                            java.util.List list = vplVar.c;
                                                                            if (((java.lang.Long) afakVar4.a()).longValue() >= 0) {
                                                                                j$.time.Instant instantMinusSeconds = j$.time.Instant.ofEpochMilli(aborVar.b.g).minusSeconds(((java.lang.Long) afakVar4.a()).longValue());
                                                                                defpackage.abqv abqvVar2 = (vpjVar.b == 3 ? (vpl) vpjVar.c : vpl.a).d;
                                                                                if (abqvVar2 == null) {
                                                                                    abqvVar2 = defpackage.abqv.a;
                                                                                }
                                                                                if (!defpackage.acmh.z(abqvVar2).isBefore(instantMinusSeconds)) {
                                                                                }
                                                                            }
                                                                            defpackage.afak afakVar5 = vumVar2.i;
                                                                            if (((java.lang.Long) afakVar5.a()).longValue() >= 0) {
                                                                                j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(list).filter(new defpackage.orr(j$.time.Instant.ofEpochMilli(aborVar.b.g).minusSeconds(((java.lang.Long) afakVar5.a()).longValue()), 17));
                                                                                int i29 = defpackage.ygw.d;
                                                                                list = (java.util.List) streamFilter.collect(defpackage.yds.a);
                                                                            }
                                                                            long jLongValue = ((java.lang.Long) vumVar2.k.a()).longValue();
                                                                            long jLongValue2 = ((java.lang.Long) vumVar2.l.a()).longValue();
                                                                            java.util.Iterator it4 = list.iterator();
                                                                            boolean z3 = false;
                                                                            boolean z4 = false;
                                                                            while (it4.hasNext()) {
                                                                                int i30 = ((ajhv) it4.next()).c;
                                                                                z3 |= i30 == 1;
                                                                                z4 |= i30 == 3;
                                                                            }
                                                                            if (z3 && z4) {
                                                                                ((defpackage.ype) ((defpackage.ype) vmf.a.h()).ai((char) 9809)).u("TraceContext list contains both Trace and TraceRecord");
                                                                                int i31 = defpackage.ygw.d;
                                                                                ygwVarA = defpackage.ymx.a;
                                                                            } else if (z3) {
                                                                                j$.util.stream.Stream map2 = j$.util.Collection.-EL.stream(list).map(new defpackage.vap(4));
                                                                                int i32 = defpackage.ygw.d;
                                                                                ygwVarA = vxd.a((java.util.List) map2.collect(defpackage.yds.a), jLongValue, jLongValue2);
                                                                            } else if (z4) {
                                                                                j$.util.stream.Stream map3 = j$.util.Collection.-EL.stream(list).map(new defpackage.vap(2));
                                                                                int i33 = defpackage.ygw.d;
                                                                                ygwVarA = vxd.a((java.util.List) map3.collect(defpackage.yds.a), jLongValue, jLongValue2);
                                                                            } else {
                                                                                ((defpackage.ype) ((defpackage.ype) vmf.a.h()).ai((char) 9808)).u("TraceContext list contains neither Trace nor TraceRecord");
                                                                                int i34 = defpackage.ygw.d;
                                                                                ygwVarA = defpackage.ymx.a;
                                                                            }
                                                                            if (!ygwVarA.isEmpty()) {
                                                                                defpackage.abor aborVarN4 = ajhw.a.n();
                                                                                aborVarN4.t();
                                                                                ajhw ajhwVar = aborVarN4.b;
                                                                                defpackage.abpj abpjVar = ajhwVar.c;
                                                                                if (!abpjVar.c()) {
                                                                                    int size = abpjVar.size();
                                                                                    ajhwVar.c = abpjVar.d(size + size);
                                                                                }
                                                                                defpackage.abnf.i(ygwVarA, ajhwVar.c);
                                                                                defpackage.abqv abqvVar3 = (vpjVar.b == 3 ? (vpl) vpjVar.c : vpl.a).d;
                                                                                if (abqvVar3 == null) {
                                                                                    abqvVar3 = defpackage.abqv.a;
                                                                                }
                                                                                aborVarN4.t();
                                                                                ajhw ajhwVar2 = aborVarN4.b;
                                                                                abqvVar3.getClass();
                                                                                ajhwVar2.d = abqvVar3;
                                                                                ajhwVar2.b |= 1;
                                                                                int iAo = defpackage.a.ao((vpjVar.b == 3 ? (vpl) vpjVar.c : vpl.a).e);
                                                                                if (iAo == 0) {
                                                                                    iAo = 1;
                                                                                }
                                                                                int i35 = iAo - 1;
                                                                                if (i35 == 0) {
                                                                                    i24 = 1;
                                                                                } else if (i35 == 1) {
                                                                                    i24 = 2;
                                                                                }
                                                                                aborVarN4.t();
                                                                                ajhw ajhwVar3 = aborVarN4.b;
                                                                                ajhwVar3.e = i24 - 1;
                                                                                ajhwVar3.b |= 2;
                                                                                ajhw ajhwVarQ = aborVarN4.q();
                                                                                aborVar.t();
                                                                                ajfh ajfhVar16 = aborVar.b;
                                                                                ajhwVarQ.getClass();
                                                                                ajfhVar16.n = ajhwVarQ;
                                                                                ajfhVar16.b |= 2048;
                                                                            }
                                                                        }
                                                                    } else if ((aborVar.b.b & 1024) != 0) {
                                                                        ((defpackage.ype) ((defpackage.ype) vmf.a.h()).ai((char) 9842)).u("FlightRecord should not contain more than one MetricExtension. Only the first will be logged.");
                                                                    } else {
                                                                        ajfx ajfxVar = i23 == 1 ? (ajfx) vpjVar.c : ajfx.a;
                                                                        aborVar.t();
                                                                        ajfh ajfhVar17 = aborVar.b;
                                                                        ajfxVar.getClass();
                                                                        ajfhVar17.m = ajfxVar;
                                                                        ajfhVar17.b |= 1024;
                                                                    }
                                                                }
                                                                return aborVar.q();
                                                            }
                                                        };
                                                        defpackage.zgt zgtVar2 = defpackage.zgt.INSTANCE;
                                                        int i22 = defpackage.zgh.c;
                                                        defpackage.zgg zggVar2 = new defpackage.zgg(zhoVar, xydVar);
                                                        zhoVar.c(zggVar2, defpackage.ysr.ch(zgtVar2, zggVar2));
                                                        ygrVar.i(zggVar2);
                                                        it3 = it3;
                                                        i13 = i6;
                                                        string = str;
                                                        j4 = j;
                                                        i15 = 4;
                                                    }
                                                }
                                            } catch (java.lang.Throwable th13) {
                                                th = th13;
                                            }
                                        } catch (java.io.IOException e6) {
                                            e = e6;
                                        }
                                    }
                                } else if (android.os.Build.VERSION.SDK_INT >= 31 && ((java.lang.Boolean) vumVar.m.a()).booleanValue()) {
                                    try {
                                        java.io.InputStream inputStreamM2 = vuo$.ExternalSyntheticApiModelOutline4.m(applicationExitInfoM);
                                        if (inputStreamM2 == null) {
                                            try {
                                                ((defpackage.ype) ((defpackage.ype) vmf.a.h()).ai(9845)).u("Native crash tombstone input stream is null");
                                            } catch (java.lang.Throwable th14) {
                                                th = th14;
                                                str = string;
                                                inputStreamM2 = inputStreamM2;
                                                i6 = i13;
                                                applicationExitInfo = applicationExitInfoM;
                                                j = j5;
                                                file = null;
                                                th = th;
                                                if (inputStreamM2 != null) {
                                                    try {
                                                        inputStreamM2.close();
                                                    } catch (java.lang.Throwable th15) {
                                                        th.addSuppressed(th15);
                                                    }
                                                }
                                                throw th;
                                            }
                                        } else {
                                            defpackage.abol abolVarA2 = defpackage.abol.a();
                                            acav acavVar = acav.a;
                                            int i23 = defpackage.abny.l;
                                            acav acavVarC = defpackage.abox.C(acavVar, new defpackage.abnx(inputStreamM2), abolVarA2);
                                            defpackage.abox.U(acavVarC);
                                            acav acavVar2 = acavVarC;
                                            long jLongValue = ((java.lang.Long) vumVar.n.a()).longValue();
                                            int i24 = acavVar2.c;
                                            acau acauVar = (acau) j$.util.DesugarCollections.unmodifiableMap(acavVar2.f).get(java.lang.Integer.valueOf(i24));
                                            if (acauVar == null) {
                                                ((defpackage.ype) ((defpackage.ype) vmf.a.h()).ai(9847)).w("Tombstone missing crashed thread %d", i24);
                                                str = string;
                                                inputStreamM2 = inputStreamM2;
                                                i6 = i13;
                                                applicationExitInfo = applicationExitInfoM;
                                                j = j5;
                                                abtsVar = null;
                                                file = null;
                                            } else {
                                                defpackage.abor aborVarN3 = defpackage.abts.a.n();
                                                acat acatVar = acavVar2.d;
                                                if (acatVar == null) {
                                                    acatVar = acat.a;
                                                }
                                                int i25 = acatVar.b;
                                                aborVarN3.t();
                                                try {
                                                    defpackage.abts abtsVar2 = (defpackage.abts) aborVarN3.b;
                                                    str = string;
                                                    try {
                                                        abtsVar2.b |= 1;
                                                        abtsVar2.c = i25;
                                                        acat acatVar2 = acavVar2.d;
                                                        if (acatVar2 == null) {
                                                            try {
                                                                acatVar2 = acat.a;
                                                            } catch (java.lang.Throwable th16) {
                                                                th = th16;
                                                                inputStreamM2 = inputStreamM2;
                                                                applicationExitInfo = applicationExitInfoM;
                                                                j = j5;
                                                                file = null;
                                                                i6 = 0;
                                                                if (inputStreamM2 != null) {
                                                                    inputStreamM2.close();
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        int i26 = acatVar2.c;
                                                        aborVarN3.t();
                                                        defpackage.abts abtsVar3 = (defpackage.abts) aborVarN3.b;
                                                        abtsVar3.b |= 2;
                                                        abtsVar3.d = i26;
                                                        int iAt = defpackage.a.at(acavVar2.b);
                                                        if (iAt == 0) {
                                                            iAt = 1;
                                                        }
                                                        int i27 = iAt - 2;
                                                        if (i27 == 0) {
                                                            i9 = 2;
                                                        } else if (i27 == 1) {
                                                            i9 = 3;
                                                        } else if (i27 == i5) {
                                                            i9 = 4;
                                                        } else if (i27 != 3) {
                                                            i9 = i27 != 4 ? 1 : 6;
                                                        } else {
                                                            i9 = 5;
                                                        }
                                                        aborVarN3.t();
                                                        defpackage.abts abtsVar4 = (defpackage.abts) aborVarN3.b;
                                                        abtsVar4.f = i9 - 1;
                                                        abtsVar4.b |= 8;
                                                        acat acatVar3 = acavVar2.d;
                                                        if ((acatVar3 == null ? acat.a : acatVar3).d) {
                                                            if (acatVar3 == null) {
                                                                acatVar3 = acat.a;
                                                            }
                                                            long j6 = acatVar3.e;
                                                            aborVarN3.t();
                                                            defpackage.abts abtsVar5 = (defpackage.abts) aborVarN3.b;
                                                            abtsVar5.b |= 4;
                                                            abtsVar5.e = j6;
                                                        }
                                                        abtp abtpVar = abtp.a;
                                                        defpackage.abor aborVarN4 = abtpVar.n();
                                                        aborVarN4.t();
                                                        abtp abtpVar2 = aborVarN4.b;
                                                        abtpVar2.b |= 2;
                                                        abtpVar2.d = i24;
                                                        if (!acauVar.b.isEmpty()) {
                                                            java.lang.String str2 = acauVar.b;
                                                            aborVarN4.t();
                                                            abtp abtpVar3 = aborVarN4.b;
                                                            str2.getClass();
                                                            abtpVar3.b |= 1;
                                                            abtpVar3.c = str2;
                                                        }
                                                        abtp abtpVarQ = aborVarN4.q();
                                                        aborVarN3.t();
                                                        defpackage.abts abtsVar6 = (defpackage.abts) aborVarN3.b;
                                                        abtpVarQ.getClass();
                                                        abtsVar6.j = abtpVarQ;
                                                        abtsVar6.b |= 128;
                                                        java.util.Collection collectionValues = j$.util.DesugarCollections.unmodifiableMap(acavVar2.f).values();
                                                        defpackage.yha yhaVar = new defpackage.yha(4);
                                                        java.util.HashSet hashSet = new java.util.HashSet();
                                                        java.util.Iterator it4 = collectionValues.iterator();
                                                        while (it4.hasNext()) {
                                                            try {
                                                                java.util.Iterator it5 = ((acau) it4.next()).c.iterator();
                                                                while (it5.hasNext()) {
                                                                    abtpVar = abtpVar;
                                                                    acas acasVar = (acas) it5.next();
                                                                    inputStreamM2 = inputStreamM2;
                                                                    try {
                                                                        if (!acasVar.e.isEmpty()) {
                                                                            int size = hashSet.size();
                                                                            java.util.Iterator it6 = it4;
                                                                            if (hashSet.add(acasVar.e)) {
                                                                                defpackage.abor aborVarN5 = abtq.a.n();
                                                                                java.util.HashSet hashSet2 = hashSet;
                                                                                java.lang.String str3 = acasVar.e;
                                                                                aborVarN5.t();
                                                                                java.util.Iterator it7 = it5;
                                                                                abtq abtqVar = aborVarN5.b;
                                                                                str3.getClass();
                                                                                applicationExitInfo = applicationExitInfoM;
                                                                                try {
                                                                                    abtqVar.b |= 2;
                                                                                    abtqVar.d = str3;
                                                                                    if (!acasVar.d.isEmpty()) {
                                                                                        java.lang.String str4 = acasVar.d;
                                                                                        aborVarN5.t();
                                                                                        abtq abtqVar2 = aborVarN5.b;
                                                                                        str4.getClass();
                                                                                        abtqVar2.b |= 1;
                                                                                        abtqVar2.c = str4;
                                                                                    }
                                                                                    yhaVar.f(acasVar.e, new acku(aborVarN5.q(), size));
                                                                                    it4 = it6;
                                                                                    hashSet = hashSet2;
                                                                                    it5 = it7;
                                                                                    applicationExitInfoM = applicationExitInfo;
                                                                                } catch (java.lang.Throwable th17) {
                                                                                    th = th17;
                                                                                    th = th;
                                                                                    j = j5;
                                                                                    file = null;
                                                                                    i6 = 0;
                                                                                    if (inputStreamM2 != null) {
                                                                                        inputStreamM2.close();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            } else {
                                                                                it4 = it6;
                                                                            }
                                                                        }
                                                                    } catch (java.lang.Throwable th18) {
                                                                        th = th18;
                                                                        applicationExitInfo = applicationExitInfoM;
                                                                        th = th;
                                                                        j = j5;
                                                                        file = null;
                                                                        i6 = 0;
                                                                        if (inputStreamM2 != null) {
                                                                            inputStreamM2.close();
                                                                        }
                                                                        throw th;
                                                                    }
                                                                }
                                                            } catch (java.lang.Throwable th19) {
                                                                th = th19;
                                                                inputStreamM2 = inputStreamM2;
                                                            }
                                                        }
                                                        abtp abtpVar4 = abtpVar;
                                                        inputStreamM2 = inputStreamM2;
                                                        applicationExitInfo = applicationExitInfoM;
                                                        try {
                                                            defpackage.yhe yheVarD = yhaVar.d(true);
                                                            try {
                                                                defpackage.you youVarListIterator = ((defpackage.ygw) yheVarD.values()).listIterator(0);
                                                                while (youVarListIterator.hasNext()) {
                                                                    java.lang.Object obj7 = ((acku) youVarListIterator.next()).b;
                                                                    aborVarN3.t();
                                                                    defpackage.abts abtsVar7 = (defpackage.abts) aborVarN3.b;
                                                                    obj7.getClass();
                                                                    defpackage.abpj abpjVar = abtsVar7.h;
                                                                    if (!abpjVar.c()) {
                                                                        int size2 = abpjVar.size();
                                                                        abtsVar7.h = abpjVar.d(size2 + size2);
                                                                    }
                                                                    abtsVar7.h.add(obj7);
                                                                }
                                                                defpackage.ygw ygwVarA = defpackage.vum.a(acauVar, yheVarD, jLongValue);
                                                                aborVarN3.t();
                                                                defpackage.abts abtsVar8 = (defpackage.abts) aborVarN3.b;
                                                                defpackage.abpj abpjVar2 = abtsVar8.g;
                                                                if (!abpjVar2.c()) {
                                                                    int size3 = abpjVar2.size();
                                                                    abtsVar8.g = abpjVar2.d(size3 + size3);
                                                                }
                                                                defpackage.abnf.i(ygwVarA, abtsVar8.g);
                                                                if (!acavVar2.e.isEmpty()) {
                                                                    java.lang.String str5 = acavVar2.e;
                                                                    aborVarN3.t();
                                                                    defpackage.abts abtsVar9 = (defpackage.abts) aborVarN3.b;
                                                                    str5.getClass();
                                                                    abtsVar9.b |= 64;
                                                                    abtsVar9.i = str5;
                                                                }
                                                                yif yifVarUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(acavVar2.f);
                                                                java.util.Comparator comparator = yif.a;
                                                                if (yifVarUnmodifiableMap instanceof java.util.SortedMap) {
                                                                    java.util.Comparator comparator2 = ((java.util.SortedMap) yifVarUnmodifiableMap).comparator();
                                                                    zEquals = comparator2 == null ? true : comparator.equals(comparator2);
                                                                } else {
                                                                    zEquals = false;
                                                                }
                                                                if (zEquals && (yifVarUnmodifiableMap instanceof yif)) {
                                                                    yif yifVar = yifVarUnmodifiableMap;
                                                                    if (yifVar.c()) {
                                                                        entryArr = (java.util.Map.Entry[]) defpackage.ysr.aq(yifVarUnmodifiableMap.entrySet()).toArray(yif.b);
                                                                        length = entryArr.length;
                                                                        if (length != 0) {
                                                                            j = j5;
                                                                            file = null;
                                                                            i6 = 0;
                                                                            yifVarA = yif.a(comparator);
                                                                        } else if (length != 1) {
                                                                            objArr = new java.lang.Object[length];
                                                                            objArr2 = new java.lang.Object[length];
                                                                            if (zEquals) {
                                                                                i12 = 0;
                                                                                while (i12 < length) {
                                                                                    java.util.Map.Entry entry3 = entryArr[i12];
                                                                                    entry3.getClass();
                                                                                    int i28 = i12;
                                                                                    java.lang.Object key2 = entry3.getKey();
                                                                                    j = j5;
                                                                                    java.lang.Object value = entry3.getValue();
                                                                                    defpackage.ysr.aJ(key2, value);
                                                                                    objArr[i28] = key2;
                                                                                    objArr2[i28] = value;
                                                                                    i12 = i28 + 1;
                                                                                    j5 = j;
                                                                                }
                                                                                j = j5;
                                                                            } else {
                                                                                j = j5;
                                                                                java.util.Arrays.sort(entryArr, 0, length, new defpackage.dab(comparator, 9));
                                                                                java.util.Map.Entry entry4 = entryArr[0];
                                                                                entry4.getClass();
                                                                                java.lang.Object key3 = entry4.getKey();
                                                                                objArr[0] = key3;
                                                                                java.lang.Object value2 = entry4.getValue();
                                                                                objArr2[0] = value2;
                                                                                defpackage.ysr.aJ(objArr[0], value2);
                                                                                obj6 = key3;
                                                                                i10 = 1;
                                                                                while (i10 < length) {
                                                                                    entry = entryArr[i10 - 1];
                                                                                    entry.getClass();
                                                                                    entry2 = entryArr[i10];
                                                                                    entry2.getClass();
                                                                                    entryArr2 = entryArr;
                                                                                    key = entry2.getKey();
                                                                                    i11 = i10;
                                                                                    java.lang.Object value3 = entry2.getValue();
                                                                                    defpackage.ysr.aJ(key, value3);
                                                                                    objArr[i11] = key;
                                                                                    objArr2[i11] = value3;
                                                                                    if (comparator.compare(obj6, key) != 0) {
                                                                                        throw new java.lang.IllegalArgumentException("Multiple entries with same key: " + entry.toString() + " and " + entry2.toString());
                                                                                    }
                                                                                    i10 = i11 + 1;
                                                                                    obj6 = key;
                                                                                    entryArr = entryArr2;
                                                                                }
                                                                            }
                                                                            defpackage.yne yneVar = new defpackage.yne(defpackage.ygw.l(objArr, length), comparator);
                                                                            defpackage.ygw ygwVarL = defpackage.ygw.l(objArr2, length);
                                                                            file = null;
                                                                            yifVarA = new yif(yneVar, ygwVarL, (yif) null);
                                                                        } else {
                                                                            j = j5;
                                                                            file = null;
                                                                            i6 = 0;
                                                                            java.util.Map.Entry entry5 = entryArr[0];
                                                                            entry5.getClass();
                                                                            yifVarA = yif.s(comparator, entry5.getKey(), entry5.getValue());
                                                                        }
                                                                    } else {
                                                                        yifVarA = yifVar;
                                                                        j = j5;
                                                                        file = null;
                                                                    }
                                                                    i6 = 0;
                                                                } else {
                                                                    entryArr = (java.util.Map.Entry[]) defpackage.ysr.aq(yifVarUnmodifiableMap.entrySet()).toArray(yif.b);
                                                                    length = entryArr.length;
                                                                    if (length != 0) {
                                                                        j = j5;
                                                                        file = null;
                                                                        i6 = 0;
                                                                        yifVarA = yif.a(comparator);
                                                                    } else if (length != 1) {
                                                                        try {
                                                                            objArr = new java.lang.Object[length];
                                                                            objArr2 = new java.lang.Object[length];
                                                                            if (zEquals) {
                                                                                i12 = 0;
                                                                                while (i12 < length) {
                                                                                    try {
                                                                                        java.util.Map.Entry entry6 = entryArr[i12];
                                                                                        entry6.getClass();
                                                                                        int i29 = i12;
                                                                                        java.lang.Object key4 = entry6.getKey();
                                                                                        j = j5;
                                                                                        try {
                                                                                            java.lang.Object value4 = entry6.getValue();
                                                                                            defpackage.ysr.aJ(key4, value4);
                                                                                            objArr[i29] = key4;
                                                                                            objArr2[i29] = value4;
                                                                                            i12 = i29 + 1;
                                                                                            j5 = j;
                                                                                        } catch (java.lang.Throwable th20) {
                                                                                            th2 = th20;
                                                                                            th = th2;
                                                                                            file = null;
                                                                                            i6 = 0;
                                                                                            if (inputStreamM2 != null) {
                                                                                                inputStreamM2.close();
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (java.lang.Throwable th21) {
                                                                                        th2 = th21;
                                                                                        j = j5;
                                                                                        th = th2;
                                                                                        file = null;
                                                                                        i6 = 0;
                                                                                        if (inputStreamM2 != null) {
                                                                                            inputStreamM2.close();
                                                                                        }
                                                                                        throw th;
                                                                                    }
                                                                                }
                                                                                j = j5;
                                                                            } else {
                                                                                j = j5;
                                                                                java.util.Arrays.sort(entryArr, 0, length, new defpackage.dab(comparator, 9));
                                                                                java.util.Map.Entry entry7 = entryArr[0];
                                                                                entry7.getClass();
                                                                                java.lang.Object key5 = entry7.getKey();
                                                                                objArr[0] = key5;
                                                                                java.lang.Object value5 = entry7.getValue();
                                                                                objArr2[0] = value5;
                                                                                defpackage.ysr.aJ(objArr[0], value5);
                                                                                obj6 = key5;
                                                                                i10 = 1;
                                                                                while (i10 < length) {
                                                                                    entry = entryArr[i10 - 1];
                                                                                    entry.getClass();
                                                                                    entry2 = entryArr[i10];
                                                                                    entry2.getClass();
                                                                                    entryArr2 = entryArr;
                                                                                    key = entry2.getKey();
                                                                                    i11 = i10;
                                                                                    java.lang.Object value6 = entry2.getValue();
                                                                                    defpackage.ysr.aJ(key, value6);
                                                                                    objArr[i11] = key;
                                                                                    objArr2[i11] = value6;
                                                                                    if (comparator.compare(obj6, key) != 0) {
                                                                                        throw new java.lang.IllegalArgumentException("Multiple entries with same key: " + entry.toString() + " and " + entry2.toString());
                                                                                    }
                                                                                    i10 = i11 + 1;
                                                                                    obj6 = key;
                                                                                    entryArr = entryArr2;
                                                                                }
                                                                            }
                                                                            try {
                                                                                defpackage.yne yneVar2 = new defpackage.yne(defpackage.ygw.l(objArr, length), comparator);
                                                                                defpackage.ygw ygwVarL2 = defpackage.ygw.l(objArr2, length);
                                                                                file = null;
                                                                                try {
                                                                                    yifVarA = new yif(yneVar2, ygwVarL2, (yif) null);
                                                                                    i6 = 0;
                                                                                } catch (java.lang.Throwable th22) {
                                                                                    th = th22;
                                                                                    th = th;
                                                                                    i6 = 0;
                                                                                    if (inputStreamM2 != null) {
                                                                                        inputStreamM2.close();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            } catch (java.lang.Throwable th23) {
                                                                                th = th23;
                                                                                file = null;
                                                                                th = th;
                                                                                i6 = 0;
                                                                                if (inputStreamM2 != null) {
                                                                                    inputStreamM2.close();
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        } catch (java.lang.Throwable th24) {
                                                                            th = th24;
                                                                            j = j5;
                                                                        }
                                                                    } else {
                                                                        j = j5;
                                                                        file = null;
                                                                        i6 = 0;
                                                                        java.util.Map.Entry entry8 = entryArr[0];
                                                                        entry8.getClass();
                                                                        yifVarA = yif.s(comparator, entry8.getKey(), entry8.getValue());
                                                                    }
                                                                }
                                                                defpackage.yot it8 = yifVarA.f().iterator();
                                                                while (it8.hasNext()) {
                                                                    java.util.Map.Entry entry9 = (java.util.Map.Entry) it8.next();
                                                                    int iIntValue = ((java.lang.Integer) entry9.getKey()).intValue();
                                                                    if (iIntValue != i24) {
                                                                        defpackage.abor aborVarN6 = abtpVar4.n();
                                                                        aborVarN6.t();
                                                                        abtp abtpVar5 = aborVarN6.b;
                                                                        abtpVar5.b |= 2;
                                                                        abtpVar5.d = iIntValue;
                                                                        acau acauVar2 = (acau) entry9.getValue();
                                                                        if (!acauVar2.b.isEmpty()) {
                                                                            java.lang.String str6 = acauVar2.b;
                                                                            aborVarN6.t();
                                                                            abtp abtpVar6 = aborVarN6.b;
                                                                            str6.getClass();
                                                                            abtpVar6.b |= 1;
                                                                            abtpVar6.c = str6;
                                                                        }
                                                                        defpackage.abor aborVarN7 = abto.a.n();
                                                                        abtp abtpVarQ2 = aborVarN6.q();
                                                                        aborVarN7.t();
                                                                        abto abtoVar = aborVarN7.b;
                                                                        abtpVarQ2.getClass();
                                                                        abtoVar.c = abtpVarQ2;
                                                                        abtoVar.b |= 1;
                                                                        defpackage.ygw ygwVarA2 = defpackage.vum.a(acauVar2, yheVarD, jLongValue);
                                                                        aborVarN7.t();
                                                                        abto abtoVar2 = aborVarN7.b;
                                                                        defpackage.abpj abpjVar3 = abtoVar2.d;
                                                                        if (!abpjVar3.c()) {
                                                                            int size4 = abpjVar3.size();
                                                                            abtoVar2.d = abpjVar3.d(size4 + size4);
                                                                        }
                                                                        defpackage.abnf.i(ygwVarA2, abtoVar2.d);
                                                                        abto abtoVarQ = aborVarN7.q();
                                                                        aborVarN3.t();
                                                                        defpackage.abts abtsVar10 = (defpackage.abts) aborVarN3.b;
                                                                        abtoVarQ.getClass();
                                                                        defpackage.abpj abpjVar4 = abtsVar10.k;
                                                                        if (!abpjVar4.c()) {
                                                                            int size5 = abpjVar4.size();
                                                                            abtsVar10.k = abpjVar4.d(size5 + size5);
                                                                        }
                                                                        abtsVar10.k.add(abtoVarQ);
                                                                    }
                                                                }
                                                                abtsVar = (defpackage.abts) aborVarN3.q();
                                                            } catch (java.lang.Throwable th25) {
                                                                th = th25;
                                                                i6 = 0;
                                                                j = j5;
                                                                file = null;
                                                            }
                                                        } catch (java.lang.Throwable th26) {
                                                            th = th26;
                                                            j = j5;
                                                            file = null;
                                                            i6 = 0;
                                                        }
                                                    } catch (java.lang.Throwable th27) {
                                                        th = th27;
                                                        inputStreamM2 = inputStreamM2;
                                                        applicationExitInfo = applicationExitInfoM;
                                                        j = j5;
                                                        file = null;
                                                        i6 = 0;
                                                        th = th;
                                                        if (inputStreamM2 != null) {
                                                            inputStreamM2.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (java.lang.Throwable th28) {
                                                    th = th28;
                                                    str = string;
                                                }
                                            }
                                            if (abtsVar != null) {
                                                try {
                                                    aborVarN2.t();
                                                    ajfh ajfhVar12 = aborVarN2.b;
                                                    ajfhVar12.p = abtsVar;
                                                    ajfhVar12.b |= 8192;
                                                } catch (java.lang.Throwable th29) {
                                                    th = th29;
                                                    th = th;
                                                    if (inputStreamM2 != null) {
                                                        inputStreamM2.close();
                                                    }
                                                    throw th;
                                                }
                                            }
                                            try {
                                                inputStreamM2.close();
                                            } catch (java.io.IOException e7) {
                                                e = e7;
                                                ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).p(e)).ai((char) 9844)).u("Failed to read native crash tombstone");
                                            }
                                        }
                                        j = j5;
                                        file = null;
                                        th = th;
                                        if (inputStreamM2 != null) {
                                            inputStreamM2.close();
                                        }
                                        throw th;
                                    } catch (java.io.IOException e8) {
                                        e = e8;
                                        str = string;
                                        i6 = i13;
                                        applicationExitInfo = applicationExitInfoM;
                                        j = j5;
                                        file = null;
                                    }
                                }
                                str = string;
                                i6 = i13;
                                applicationExitInfo = applicationExitInfoM;
                                j = j5;
                                file = null;
                            } else {
                                str = string;
                                i6 = i13;
                                applicationExitInfo = applicationExitInfoM;
                                j = j5;
                                file = null;
                            }
                            iM = vuo$.ExternalSyntheticApiModelOutline4.m(applicationExitInfo);
                            if (iM != 100) {
                                i7 = 2;
                            } else if (iM != 125) {
                                i7 = 3;
                            } else if (iM != 200) {
                                i7 = 5;
                            } else if (iM != 230) {
                                i7 = 6;
                            } else if (iM != 300) {
                                i7 = 8;
                            } else if (iM != 325) {
                                i7 = 4;
                            } else if (iM != 350) {
                                i7 = 7;
                            } else if (iM != 400) {
                                i7 = 9;
                            } else if (iM != 1000) {
                                ((defpackage.ype) ((defpackage.ype) vmf.a.h()).ai((char) 9846)).y("Unknown ApplicationExitInfo Importance: %s", new defpackage.vqo(iM));
                                i7 = i6;
                            } else {
                                i7 = 10;
                            }
                            if (i7 != 0) {
                                aborVarN2.t();
                                ajfh ajfhVar13 = aborVarN2.b;
                                ajfhVar13.f = i7 - 1;
                                ajfhVar13.b |= 8;
                            }
                            vpqVar = vumVar.o;
                            iM$1 = vuo$.ExternalSyntheticApiModelOutline4.m$1(applicationExitInfo);
                            long jM4 = bgp$.ExternalSyntheticApiModelOutline0.m(applicationExitInfo);
                            abqvVarC = defpackage.abrx.c(jM4 / 1000, (int) ((jM4 % 1000) * 1000000));
                            if (((java.lang.Boolean) vpqVar.d.a()).booleanValue()) {
                                zhoVar = new defpackage.zho(defpackage.xxe.a);
                            } else {
                                file2 = new java.io.File(vpqVar.a.getFilesDir(), "flight_records");
                                if (((java.lang.Boolean) vpqVar.c.a()).booleanValue()) {
                                    defpackage.vpq.a(file2, vpqVar.b.f().getEpochSecond());
                                }
                                if (file2.exists()) {
                                    ((defpackage.ype) ((defpackage.ype) vmf.a.f()).ai((char) 9794)).u("Flight records directory does not exist");
                                    zhoVar = new defpackage.zho(defpackage.xxe.a);
                                } else {
                                    fileArrListFiles = file2.listFiles((java.io.FilenameFilter) new vpo(iM$1));
                                    if (fileArrListFiles == null) {
                                        ((defpackage.ype) ((defpackage.ype) vmf.a.f()).ai(9793)).w("Failed to find any valid flight records for process id %d", iM$1);
                                        zhoVar = new defpackage.zho(defpackage.xxe.a);
                                    } else {
                                        file3 = file;
                                        lValueOf = file3;
                                        i8 = i6;
                                        while (i8 < fileArrListFiles.length) {
                                            file4 = fileArrListFiles[i8];
                                            listI = new defpackage.xzd(new defpackage.xyx(new defpackage.xxo('_'))).i(file4.getName());
                                            if (listI.size() != 2) {
                                                ((defpackage.ype) ((defpackage.ype) vmf.a.h()).ai((char) 9792)).y("Invalid flight record file name: %s", file4.getName());
                                            } else {
                                                j2 = java.lang.Long.parseLong((java.lang.String) listI.get(1));
                                                j3 = abqvVarC.b;
                                                if (j2 > j3 && (lValueOf == 0 || j3 - j2 < lValueOf.longValue())) {
                                                    file3 = file4;
                                                    lValueOf = java.lang.Long.valueOf(abqvVarC.b - j2);
                                                }
                                            }
                                            i8++;
                                            lValueOf = lValueOf;
                                        }
                                        if (file3 == null) {
                                            ((defpackage.ype) ((defpackage.ype) vmf.a.f()).ai(9790)).w("Failed to find any valid flight records for process id %d", iM$1);
                                            zhoVar = new defpackage.zho(defpackage.xxe.a);
                                        } else {
                                            fileInputStream = new java.io.FileInputStream(file3);
                                            defpackage.abol abolVarA3 = defpackage.abol.a();
                                            vpn vpnVar3 = vpn.a;
                                            int i210 = defpackage.abny.l;
                                            vpn vpnVarC2 = defpackage.abox.C(vpnVar3, new defpackage.abnx(fileInputStream), abolVarA3);
                                            defpackage.abox.U(vpnVarC2);
                                            vpn vpnVar4 = vpnVarC2;
                                            ((defpackage.ype) ((defpackage.ype) vmf.a.e()).ai(9788)).u("Read and serialization successful");
                                            vpnVar4.getClass();
                                            defpackage.zho zhoVar3 = new defpackage.zho(new defpackage.xys(vpnVar4));
                                            fileInputStream.close();
                                            zhoVar = zhoVar3;
                                        }
                                    }
                                }
                            }
                            defpackage.xyd xydVar2 = new defpackage.xyd() { // from class: vul
                                @Override // defpackage.xyd
                                public final java.lang.Object a(java.lang.Object obj8) {
                                    int i211;
                                    boolean z;
                                    defpackage.ygw ygwVarA3;
                                    defpackage.xyn xynVar = (defpackage.xyn) obj8;
                                    boolean zF = xynVar.f();
                                    defpackage.abor aborVar = aborVarN2;
                                    if (!zF) {
                                        return aborVar.q();
                                    }
                                    for (vpj vpjVar : ((vpn) xynVar.b()).e) {
                                        int i212 = vpjVar.b;
                                        int i213 = 3;
                                        boolean z2 = true;
                                        if (i212 == 0) {
                                            i211 = 5;
                                        } else if (i212 == 1) {
                                            i211 = 1;
                                        } else if (i212 == 2) {
                                            i211 = 2;
                                        } else if (i212 != 3) {
                                            i211 = i212 != 4 ? 0 : 4;
                                        } else {
                                            i211 = 3;
                                        }
                                        if (i211 == 0) {
                                            throw null;
                                        }
                                        int i214 = i211 - 1;
                                        defpackage.vum vumVar2 = vumVar;
                                        if (i214 != 0) {
                                            if (i214 == 1) {
                                                defpackage.abqv abqvVar = (i212 == 2 ? (vpk) vpjVar.c : vpk.a).c;
                                                if (abqvVar == null) {
                                                    abqvVar = defpackage.abqv.a;
                                                }
                                                long jA = defpackage.abrx.a(abqvVar);
                                                aborVar.t();
                                                ajfh ajfhVar14 = aborVar.b;
                                                ajfh ajfhVar15 = ajfh.a;
                                                ajfhVar14.b |= 32;
                                                ajfhVar14.h = jA;
                                            } else if (i214 != 2) {
                                                if (i214 == 3) {
                                                    vpm vpmVar = i212 == 4 ? (vpm) vpjVar.c : vpm.a;
                                                    defpackage.abor aborVarN8 = ajhy.a.n();
                                                    if (vpmVar.c.equals(((defpackage.vsz) vumVar2.b).a())) {
                                                        z = false;
                                                    } else {
                                                        java.lang.String str7 = vpmVar.c;
                                                        aborVarN8.t();
                                                        ajhy ajhyVar = aborVarN8.b;
                                                        str7.getClass();
                                                        ajhyVar.b |= 1;
                                                        ajhyVar.c = str7;
                                                        z = true;
                                                    }
                                                    if (vpmVar.d != ((defpackage.vsy) vumVar2.c).a().intValue()) {
                                                        int i215 = vpmVar.d;
                                                        aborVarN8.t();
                                                        ajhy ajhyVar2 = aborVarN8.b;
                                                        ajhyVar2.b = 2 | ajhyVar2.b;
                                                        ajhyVar2.d = i215;
                                                        z = true;
                                                    }
                                                    if (vpmVar.e != ((java.lang.Integer) vumVar2.d.a()).intValue()) {
                                                        int i216 = vpmVar.e;
                                                        aborVarN8.t();
                                                        ajhy ajhyVar3 = aborVarN8.b;
                                                        ajhyVar3.b = 4 | ajhyVar3.b;
                                                        ajhyVar3.e = i216;
                                                    } else {
                                                        z2 = z;
                                                    }
                                                    if (vpmVar.f != android.os.Build.VERSION.SDK_INT) {
                                                        int i217 = vpmVar.f;
                                                        aborVarN8.t();
                                                        ajhy ajhyVar4 = aborVarN8.b;
                                                        ajhyVar4.b |= 8;
                                                        ajhyVar4.f = i217;
                                                    } else if (z2) {
                                                    }
                                                    ajhy ajhyVarQ = aborVarN8.q();
                                                    aborVar.t();
                                                    ajfh ajfhVar16 = aborVar.b;
                                                    ajfh ajfhVar17 = ajfh.a;
                                                    ajhyVarQ.getClass();
                                                    ajfhVar16.o = ajhyVarQ;
                                                    ajfhVar16.b |= 4096;
                                                }
                                            } else if ((aborVar.b.b & 512) != 0 && ((java.lang.Boolean) vumVar2.h.a()).booleanValue()) {
                                                vpl vplVar = vpjVar.b == 3 ? (vpl) vpjVar.c : vpl.a;
                                                defpackage.afak afakVar4 = vumVar2.j;
                                                java.util.List list = vplVar.c;
                                                if (((java.lang.Long) afakVar4.a()).longValue() >= 0) {
                                                    j$.time.Instant instantMinusSeconds = j$.time.Instant.ofEpochMilli(aborVar.b.g).minusSeconds(((java.lang.Long) afakVar4.a()).longValue());
                                                    defpackage.abqv abqvVar2 = (vpjVar.b == 3 ? (vpl) vpjVar.c : vpl.a).d;
                                                    if (abqvVar2 == null) {
                                                        abqvVar2 = defpackage.abqv.a;
                                                    }
                                                    if (!defpackage.acmh.z(abqvVar2).isBefore(instantMinusSeconds)) {
                                                    }
                                                }
                                                defpackage.afak afakVar5 = vumVar2.i;
                                                if (((java.lang.Long) afakVar5.a()).longValue() >= 0) {
                                                    j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(list).filter(new defpackage.orr(j$.time.Instant.ofEpochMilli(aborVar.b.g).minusSeconds(((java.lang.Long) afakVar5.a()).longValue()), 17));
                                                    int i218 = defpackage.ygw.d;
                                                    list = (java.util.List) streamFilter.collect(defpackage.yds.a);
                                                }
                                                long jLongValue2 = ((java.lang.Long) vumVar2.k.a()).longValue();
                                                long jLongValue3 = ((java.lang.Long) vumVar2.l.a()).longValue();
                                                java.util.Iterator it9 = list.iterator();
                                                boolean z3 = false;
                                                boolean z4 = false;
                                                while (it9.hasNext()) {
                                                    int i30 = ((ajhv) it9.next()).c;
                                                    z3 |= i30 == 1;
                                                    z4 |= i30 == 3;
                                                }
                                                if (z3 && z4) {
                                                    ((defpackage.ype) ((defpackage.ype) vmf.a.h()).ai((char) 9809)).u("TraceContext list contains both Trace and TraceRecord");
                                                    int i31 = defpackage.ygw.d;
                                                    ygwVarA3 = defpackage.ymx.a;
                                                } else if (z3) {
                                                    j$.util.stream.Stream map2 = j$.util.Collection.-EL.stream(list).map(new defpackage.vap(4));
                                                    int i32 = defpackage.ygw.d;
                                                    ygwVarA3 = vxd.a((java.util.List) map2.collect(defpackage.yds.a), jLongValue2, jLongValue3);
                                                } else if (z4) {
                                                    j$.util.stream.Stream map3 = j$.util.Collection.-EL.stream(list).map(new defpackage.vap(2));
                                                    int i33 = defpackage.ygw.d;
                                                    ygwVarA3 = vxd.a((java.util.List) map3.collect(defpackage.yds.a), jLongValue2, jLongValue3);
                                                } else {
                                                    ((defpackage.ype) ((defpackage.ype) vmf.a.h()).ai((char) 9808)).u("TraceContext list contains neither Trace nor TraceRecord");
                                                    int i34 = defpackage.ygw.d;
                                                    ygwVarA3 = defpackage.ymx.a;
                                                }
                                                if (!ygwVarA3.isEmpty()) {
                                                    defpackage.abor aborVarN9 = ajhw.a.n();
                                                    aborVarN9.t();
                                                    ajhw ajhwVar = aborVarN9.b;
                                                    defpackage.abpj abpjVar5 = ajhwVar.c;
                                                    if (!abpjVar5.c()) {
                                                        int size6 = abpjVar5.size();
                                                        ajhwVar.c = abpjVar5.d(size6 + size6);
                                                    }
                                                    defpackage.abnf.i(ygwVarA3, ajhwVar.c);
                                                    defpackage.abqv abqvVar3 = (vpjVar.b == 3 ? (vpl) vpjVar.c : vpl.a).d;
                                                    if (abqvVar3 == null) {
                                                        abqvVar3 = defpackage.abqv.a;
                                                    }
                                                    aborVarN9.t();
                                                    ajhw ajhwVar2 = aborVarN9.b;
                                                    abqvVar3.getClass();
                                                    ajhwVar2.d = abqvVar3;
                                                    ajhwVar2.b |= 1;
                                                    int iAo = defpackage.a.ao((vpjVar.b == 3 ? (vpl) vpjVar.c : vpl.a).e);
                                                    if (iAo == 0) {
                                                        iAo = 1;
                                                    }
                                                    int i35 = iAo - 1;
                                                    if (i35 == 0) {
                                                        i213 = 1;
                                                    } else if (i35 == 1) {
                                                        i213 = 2;
                                                    }
                                                    aborVarN9.t();
                                                    ajhw ajhwVar3 = aborVarN9.b;
                                                    ajhwVar3.e = i213 - 1;
                                                    ajhwVar3.b |= 2;
                                                    ajhw ajhwVarQ = aborVarN9.q();
                                                    aborVar.t();
                                                    ajfh ajfhVar18 = aborVar.b;
                                                    ajhwVarQ.getClass();
                                                    ajfhVar18.n = ajhwVarQ;
                                                    ajfhVar18.b |= 2048;
                                                }
                                            }
                                        } else if ((aborVar.b.b & 1024) != 0) {
                                            ((defpackage.ype) ((defpackage.ype) vmf.a.h()).ai((char) 9842)).u("FlightRecord should not contain more than one MetricExtension. Only the first will be logged.");
                                        } else {
                                            ajfx ajfxVar = i212 == 1 ? (ajfx) vpjVar.c : ajfx.a;
                                            aborVar.t();
                                            ajfh ajfhVar19 = aborVar.b;
                                            ajfxVar.getClass();
                                            ajfhVar19.m = ajfxVar;
                                            ajfhVar19.b |= 1024;
                                        }
                                    }
                                    return aborVar.q();
                                }
                            };
                            defpackage.zgt zgtVar3 = defpackage.zgt.INSTANCE;
                            int i211 = defpackage.zgh.c;
                            defpackage.zgg zggVar3 = new defpackage.zgg(zhoVar, xydVar2);
                            zhoVar.c(zggVar3, defpackage.ysr.ch(zgtVar3, zggVar3));
                            ygrVar.i(zggVar3);
                            it3 = it3;
                            i13 = i6;
                            string = str;
                            j4 = j;
                            i15 = 4;
                        }
                        defpackage.zgo zgoVar2 = new defpackage.zgo(defpackage.ygw.n(ygrVar.g()), true);
                        defpackage.kpo kpoVar2 = new defpackage.kpo(7);
                        defpackage.zgt zgtVar4 = defpackage.zgt.INSTANCE;
                        int i110 = defpackage.zgh.c;
                        defpackage.zgg zggVar4 = new defpackage.zgg(zgoVar2, kpoVar2);
                        zgoVar2.c(zggVar4, defpackage.ysr.ch(zgtVar4, zggVar4));
                        defpackage.zgf zgfVar3 = new defpackage.zgf(zggVar4, new defpackage.whl(vupVar3, 1));
                        zggVar4.c(zgfVar3, defpackage.ysr.ch(zgtVar4, zgfVar3));
                        return zgfVar3;
                    }
                }));
                return;
            case 18:
                ((defpackage.vvz) this.a).g.a(8, null);
                return;
            case 19:
                defpackage.wdn wdnVar = (defpackage.wdn) this.a;
                if (wdnVar.g) {
                    defpackage.wba wbaVar = wdnVar.d;
                    if (!defpackage.tnx.e(wbaVar.c)) {
                        defpackage.wdn.a.a(wbaVar);
                        return;
                    }
                }
                wdnVar.d();
                return;
            default:
                defpackage.zir zirVar = defpackage.zir.FILE;
                defpackage.sqs sqsVar2 = new defpackage.sqs();
                defpackage.wdn wdnVar2 = (defpackage.wdn) this.a;
                defpackage.wdx wdxVar = wdnVar2.d.h;
                wdv wdvVar = (defpackage.wec) wdxVar.c.fF();
                if (wdvVar == null && !wdnVar2.h) {
                    defpackage.zhs zhsVar2 = defpackage.zho.a;
                    return;
                }
                int i4 = 1 << zirVar.h;
                if ((wdxVar.e & i4) == 0) {
                    java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = wdxVar.f;
                    synchronized (copyOnWriteArrayList) {
                        int i5 = wdxVar.e;
                        if ((i5 & i4) == 0) {
                            copyOnWriteArrayList.add(sqsVar2);
                            wdxVar.e = i4 | i5;
                        }
                        break;
                    }
                }
                if (wdxVar.h == null) {
                    synchronized (wdxVar.g) {
                        if (wdxVar.h == null) {
                            if (wdvVar == null) {
                                wdvVar = new wdv();
                            }
                            android.content.Context context = wdxVar.a;
                            if (defpackage.tnx.e(context)) {
                                defpackage.zhs zhsVarD = ((defpackage.roy) wdxVar.d.fF()).d(new wdw(wdxVar, wdvVar));
                                wdxVar.h = zhsVarD;
                                zhsVar = zhsVarD;
                            } else {
                                ozv ozvVar = new ozv(15);
                                defpackage.xzi xziVar = wdxVar.b;
                                defpackage.zhs zhsVarC = defpackage.tnx.c(context, ozvVar, (java.util.concurrent.Executor) xziVar.fF());
                                waa waaVar = new waa(wdxVar, wdvVar, 3);
                                java.util.concurrent.Executor executor2 = (java.util.concurrent.Executor) xziVar.fF();
                                int i6 = defpackage.zgh.c;
                                defpackage.zgf zgfVar2 = new defpackage.zgf(zhsVarC, waaVar);
                                zhsVarC.c(zgfVar2, defpackage.ysr.ch(executor2, zgfVar2));
                                wdxVar.h = zgfVar2;
                                zhsVar = zgfVar2;
                            }
                            zhsVar.c(new defpackage.wdg(zhsVar, i), (java.util.concurrent.Executor) wdxVar.b.fF());
                        }
                        break;
                    }
                    return;
                }
                return;
        }
    }

    public rzu(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
