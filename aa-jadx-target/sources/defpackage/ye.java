package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ye implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    public ye(ajnd ajndVar, defpackage.erh erhVar, java.lang.String str, java.lang.Object obj, int i) {
        this.e = i;
        this.d = ajndVar;
        this.a = erhVar;
        this.c = str;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x036f  */
    /* JADX WARN: Code duplicated, block: B:149:0x0397  */
    /* JADX WARN: Code duplicated, block: B:305:0x0712  */
    /* JADX WARN: Code duplicated, block: B:400:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:305:0x0712, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yf] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.MenuItem, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v32, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v7, types: [hh] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v96, types: [java.lang.Object, rnh] */
    /* JADX WARN: Type inference failed for: r1v97 */
    /* JADX WARN: Type inference failed for: r1v98 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.car.app.IOnDoneCallback, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        java.lang.Object obj;
        java.lang.Throwable th;
        ?? r1;
        defpackage.yqm yqmVar;
        java.lang.Throwable th2;
        java.lang.Object obj2;
        java.io.File file = null;
        boolean z = true;
        boolean z2 = false;
        switch (this.e) {
            case defpackage.abnt.b /* 0 */:
                ?? r0 = this.d;
                java.lang.Object obj3 = this.c;
                ?? r2 = this.b;
                java.lang.Object obj4 = this.a;
                if (obj4 != null && ((defpackage.epy) obj4).a().a(defpackage.epx.c)) {
                    defpackage.tw.b(r2, (java.lang.String) obj3, r0);
                    return;
                } else {
                    java.util.Objects.toString(r0);
                    defpackage.tw.f(r2, (java.lang.String) obj3, new java.lang.IllegalStateException("Lifecycle is not at least created when dispatching ".concat(r0.toString())));
                    return;
                }
            case 1:
                java.lang.Object obj5 = this.d;
                if (obj5 != null) {
                    hb hbVar = ((ha) this.b).a;
                    hbVar.f = true;
                    ((defpackage.hh) ((defpackage.aahg) obj5).b).i(false);
                    hbVar.f = false;
                }
                ?? r3 = this.c;
                if (r3.isEnabled() && r3.hasSubMenu()) {
                    ((defpackage.hh) this.a).z(r3, null, 4);
                    return;
                }
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                eci.f((android.view.View) this.d, (defpackage.kwv) this.c, (ecd) this.a);
                ((android.animation.ValueAnimator) this.b).start();
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                etm etmVar = (etm) ((defpackage.etz) ((ajnd) this.d).a).c.get(((defpackage.erh) this.a).e());
                java.lang.Object obj6 = this.c;
                if (etmVar == null) {
                    android.util.Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=".concat(java.lang.String.valueOf(obj6)));
                    return;
                }
                java.lang.Object obj7 = this.b;
                if (obj7 == null) {
                    if (etmVar.d.remove(obj6) == null) {
                    }
                    if (z) {
                        return;
                    }
                    android.util.Log.w("MBServiceCompat", "removeSubscription called for " + ((java.lang.String) this.c) + " which is not subscribed");
                    return;
                }
                java.util.HashMap map = etmVar.d;
                java.util.List list = (java.util.List) map.get(obj6);
                if (list != null) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (obj7 == ((defpackage.dzp) it.next()).a) {
                            it.remove();
                            z2 = true;
                        }
                    }
                    if (list.size() == 0) {
                        map.remove(obj6);
                    }
                }
                z = z2;
                if (z) {
                    android.util.Log.w("MBServiceCompat", "removeSubscription called for " + ((java.lang.String) this.c) + " which is not subscribed");
                    return;
                }
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                etm etmVar2 = (etm) ((defpackage.etz) ((ajnd) this.d).a).c.get(((defpackage.erh) this.a).e());
                java.lang.Object obj8 = this.c;
                if (etmVar2 == null) {
                    android.util.Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=".concat(java.lang.String.valueOf(obj8)));
                    return;
                }
                etj etjVar = new etj(obj8, (android.support.v4.os.ResultReceiver) this.b);
                defpackage.etz.g(etjVar);
                if (!etjVar.c()) {
                    throw new java.lang.IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=".concat(java.lang.String.valueOf(obj8)));
                }
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                etm etmVar3 = (etm) ((defpackage.etz) ((ajnd) this.d).a).c.get(((defpackage.erh) this.a).e());
                java.lang.Object obj9 = this.c;
                if (etmVar3 == null) {
                    android.util.Log.w("MBServiceCompat", "search for callback that isn't registered query=".concat(java.lang.String.valueOf(obj9)));
                    return;
                }
                etk etkVar = new etk(obj9, (android.support.v4.os.ResultReceiver) this.b);
                ((etv) etkVar).h = 4;
                etkVar.b((java.lang.Object) null);
                if (!etkVar.c()) {
                    throw new java.lang.IllegalStateException("onSearch must call detach() or sendResult() before returning for query=".concat(java.lang.String.valueOf(obj9)));
                }
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Object obj10 = this.d;
                java.lang.String str = fky.a;
                androidx.work.impl.WorkDatabase workDatabase = (androidx.work.impl.WorkDatabase) obj10;
                fol folVarX = workDatabase.x();
                java.lang.String str2 = ((fof) this.a).a;
                if (folVarX.p(str2)) {
                    return;
                }
                ?? r4 = this.c;
                java.util.ListIterator listIterator = ((defpackage.afct) r4).listIterator(0);
                while (listIterator.hasNext()) {
                    ((fkw) listIterator.next()).b(str2);
                }
                fky.a((fjf) this.b, workDatabase, (java.util.List) r4);
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.ikz.B((com.google.android.gms.car.RadioProgramInfo) this.d);
                defpackage.ikz.C(this.a);
                defpackage.ikz.C(this.c);
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.imi imiVar = (defpackage.imi) this.b;
                defpackage.iuk iukVar = imiVar.u;
                if (iukVar.p == 0 && (obj = this.d) == defpackage.zaj.NO_LAUNCHER) {
                    ((defpackage.yqj) defpackage.imi.b.l().ai((char) 292)).y("ignore critical error in emulator:%s", obj);
                    return;
                }
                defpackage.yqm yqmVar2 = defpackage.imi.b;
                defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) yqmVar2.h()).ai(290);
                java.lang.Object obj11 = this.d;
                java.lang.Object obj12 = this.a;
                defpackage.zaj zajVar = (defpackage.zaj) obj11;
                int i = zajVar.D;
                yqjVar.R("Critical error %d detail: %d msg: %s", java.lang.Integer.valueOf(i), obj12 != null ? java.lang.Integer.valueOf(((defpackage.zak) obj12).az) : null, this.c);
                if (imiVar.br()) {
                    defpackage.jfo jfoVar = imiVar.O;
                    defpackage.abor aborVarN = defpackage.zal.a.n();
                    aborVarN.t();
                    defpackage.zal zalVar = (defpackage.zal) aborVarN.b;
                    zalVar.b |= 1;
                    zalVar.c = i;
                    defpackage.zak zakVar = (defpackage.zak) obj12;
                    int i2 = zakVar.az;
                    aborVarN.t();
                    defpackage.zal zalVar2 = (defpackage.zal) aborVarN.b;
                    zalVar2.b |= 2;
                    zalVar2.d = i2;
                    defpackage.zal zalVar3 = (defpackage.zal) aborVarN.q();
                    defpackage.abor aborVarN2 = defpackage.yyg.a.n();
                    aborVarN2.t();
                    defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
                    zalVar3.getClass();
                    yygVar.s = zalVar3;
                    yygVar.b = 65536 | yygVar.b;
                    defpackage.yyh yyhVar = defpackage.yyh.PROJECTION_ERROR;
                    int i3 = defpackage.ygw.d;
                    ((defpackage.jfp) jfoVar).m(aborVarN2, yyhVar, defpackage.ymx.a);
                    if (i <= 0 || i >= 1000) {
                        return;
                    }
                    if (imiVar.I) {
                        if (imiVar.G != obj11) {
                            ((defpackage.yqj) yqmVar2.l().ai(291)).M("got new critical error:%s while handling old one:%s", obj11, imiVar.G);
                            return;
                        }
                        return;
                    }
                    imiVar.I = true;
                    imiVar.G = zajVar;
                    if (iukVar.p == 0) {
                        imiVar.a(com.google.android.gms.car.diagnostics.CriticalError.a(zajVar, zakVar));
                        return;
                    } else {
                        fyq.h(imiVar.k, zajVar, iukVar.p, zakVar, (java.lang.String) null);
                        imiVar.a(com.google.android.gms.car.diagnostics.CriticalError.a(zajVar, zakVar));
                        return;
                    }
                }
                return;
            case 9:
                defpackage.imi imiVar2 = (defpackage.imi) this.b;
                android.util.SparseBooleanArray sparseBooleanArray = imiVar2.p;
                synchronized (sparseBooleanArray) {
                    if (sparseBooleanArray.get(15, false)) {
                        if (sparseBooleanArray.get(3, false)) {
                            return;
                        }
                        android.hardware.usb.UsbAccessory[] accessoryList = ((android.hardware.usb.UsbManager) imiVar2.k.getSystemService("usb")).getAccessoryList();
                        if (accessoryList == null || accessoryList.length <= 0) {
                            return;
                        }
                        imiVar2.ax((defpackage.zaj) this.d, (defpackage.zak) this.a, (java.lang.String) this.c);
                        return;
                    }
                    return;
                }
            case 10:
                java.lang.Object obj13 = this.c;
                java.lang.Object obj14 = this.a;
                java.lang.Object obj15 = this.b;
                java.lang.Object obj16 = this.d;
                try {
                    ((defpackage.jdk) obj15).b((defpackage.qug) obj14, (java.nio.ByteBuffer) obj13);
                    break;
                } catch (java.io.IOException unused) {
                    defpackage.ypu ypuVarAi = defpackage.jdl.a.f().ai(1896);
                    defpackage.jdl jdlVar = (defpackage.jdl) obj16;
                    int i4 = jdlVar.j;
                    if (i4 == 0) {
                        throw null;
                    }
                    ypuVarAi.K("%s Could not write message %d", defpackage.ebm.t(i4), ((defpackage.qug) obj14).f);
                    jdlVar.c.aF(defpackage.zaj.CAR_SERVICE_CONNECTION_ERROR, defpackage.zak.WRITER_IO_ERROR, "Failed to write message");
                }
                synchronized (((defpackage.jdl) obj16).h) {
                    ((defpackage.jdl) obj16).i--;
                    break;
                }
                return;
            case 11:
                defpackage.joq joqVar = (defpackage.joq) this.b;
                defpackage.imi imiVar3 = joqVar.f;
                java.lang.Object obj17 = this.d;
                android.util.SparseBooleanArray sparseBooleanArray2 = imiVar3.p;
                synchronized (sparseBooleanArray2) {
                    sparseBooleanArray2.put(((defpackage.zaj) obj17).D, true);
                    break;
                }
                java.lang.Object obj18 = this.c;
                java.lang.Object obj19 = this.a;
                if (obj17 == defpackage.zaj.CONNECTION_ERROR && imiVar3.u.p == 1) {
                    android.util.SparseBooleanArray sparseBooleanArray3 = imiVar3.p;
                    synchronized (sparseBooleanArray3) {
                        if (!sparseBooleanArray3.get(3, false)) {
                            imiVar3.o.postDelayed(new defpackage.ye((java.lang.Object) imiVar3, (defpackage.zaj) obj17, (defpackage.zak) obj19, (java.lang.String) obj18, 9), 1500L);
                        }
                    }
                    break;
                } else {
                    imiVar3.ax((defpackage.zaj) obj17, (defpackage.zak) obj19, (java.lang.String) obj18);
                }
                int i5 = ((defpackage.zaj) obj17).D;
                int i6 = ((defpackage.zak) obj19).az;
                java.util.Iterator it2 = joqVar.g.iterator();
                while (it2.hasNext()) {
                    try {
                        ((defpackage.rxr) it2.next()).g(i5, i6, (java.lang.String) obj18);
                    } catch (android.os.RemoteException e) {
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.joq.a.h()).p(e)).ai((char) 2451)).u("Can't callback to startup service client");
                    }
                }
                ((defpackage.joq) this.b).m((defpackage.zaj) this.d, (defpackage.zak) this.a);
                return;
            case 12:
                ?? r5 = this.b;
                defpackage.yqm yqmVar3 = com.google.android.apps.auto.components.bugreport.BugreportRequester.a;
                java.lang.Object obj20 = this.c;
                java.lang.Object obj21 = this.d;
                try {
                    java.io.File file2 = new java.io.File(com.google.android.apps.auto.components.bugreport.BugreportRequester.d((android.content.Context) r5), defpackage.kgl.f(defpackage.kgl.c((j$.time.Instant) this.a)));
                    try {
                        try {
                            ((defpackage.yqj) com.google.android.apps.auto.components.bugreport.BugreportRequester.a.l().ai(3026)).y("Temporarily saving logs to %s", file2.getAbsolutePath());
                            try {
                                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                                try {
                                    lbt.a((defpackage.qsh) obj21, fileOutputStream, com.google.android.apps.auto.components.bugreport.BugreportRequester.b);
                                    try {
                                        fileOutputStream.close();
                                    } catch (java.io.IOException | java.lang.IllegalStateException e2) {
                                        th2 = e2;
                                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.bugreport.BugreportRequester.a.h()).p(th2)).ai(3028)).u("Failed to capture logs");
                                        if (!z) {
                                            defpackage.yqm yqmVar4 = com.google.android.apps.auto.components.bugreport.BugreportRequester.a;
                                            ((defpackage.yqj) ((defpackage.yqj) yqmVar4.h()).ai((char) 3029)).y("Logs could not be written to %s", file2);
                                            if (!file2.delete()) {
                                                ((defpackage.yqj) ((defpackage.yqj) yqmVar4.h()).ai((char) 3030)).y("Couldn't delete %s", file2);
                                            }
                                            com.google.android.apps.auto.components.bugreport.BugreportRequester.h((android.content.Context) r5, defpackage.zbd.CM);
                                        }
                                        ((java.util.concurrent.CountDownLatch) obj20).countDown();
                                        return;
                                    }
                                    break;
                                } catch (java.lang.Throwable th3) {
                                    try {
                                        fileOutputStream.close();
                                        throw th3;
                                    } catch (java.lang.Throwable th4) {
                                        th3.addSuppressed(th4);
                                        throw th3;
                                    }
                                }
                            } catch (java.io.IOException | java.lang.IllegalStateException e3) {
                                th2 = e3;
                                z = false;
                            }
                            r5 = 3027;
                            ((defpackage.yqj) com.google.android.apps.auto.components.bugreport.BugreportRequester.a.l().ai((char) 3027)).u("Logs captured successfully");
                            ((java.util.concurrent.CountDownLatch) obj20).countDown();
                            return;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            file = file2;
                            z = false;
                            r1 = r5;
                            if (z) {
                                ((defpackage.yqj) com.google.android.apps.auto.components.bugreport.BugreportRequester.a.l().ai((char) 3033)).u("Logs captured successfully");
                            } else {
                                yqmVar = com.google.android.apps.auto.components.bugreport.BugreportRequester.a;
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 3031)).y("Logs could not be written to %s", file);
                                if (file != null && !file.delete()) {
                                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 3032)).y("Couldn't delete %s", file);
                                }
                                com.google.android.apps.auto.components.bugreport.BugreportRequester.h((android.content.Context) r1, defpackage.zbd.CM);
                            }
                            ((java.util.concurrent.CountDownLatch) obj20).countDown();
                            throw th;
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        file = file2;
                        r1 = r5;
                        if (z) {
                            yqmVar = com.google.android.apps.auto.components.bugreport.BugreportRequester.a;
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 3031)).y("Logs could not be written to %s", file);
                            if (file != null) {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 3032)).y("Couldn't delete %s", file);
                            }
                            com.google.android.apps.auto.components.bugreport.BugreportRequester.h((android.content.Context) r1, defpackage.zbd.CM);
                        } else {
                            ((defpackage.yqj) com.google.android.apps.auto.components.bugreport.BugreportRequester.a.l().ai((char) 3033)).u("Logs captured successfully");
                        }
                        ((java.util.concurrent.CountDownLatch) obj20).countDown();
                        throw th;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                }
                break;
            case 13:
                java.lang.Object obj22 = this.a;
                java.lang.Object obj23 = this.b;
                java.lang.Object obj24 = this.c;
                java.lang.Object obj25 = this.d;
                synchronized (obj25) {
                    boolean zL = ((defpackage.kou) obj25).l((pby) obj24);
                    android.os.Handler handler = ((defpackage.kou) obj25).e;
                    jlr jlrVar = new jlr((defpackage.kou) obj25, zL, (kor) obj23, (pbw) obj22, (pby) obj24, 2);
                    defpackage.aboh abohVar = ((pbw) obj22).c;
                    if (abohVar == null) {
                        abohVar = defpackage.aboh.a;
                    }
                    jx$.ExternalSyntheticApiModelOutline3.m(handler, jlrVar, obj23, defpackage.abrv.a(abohVar));
                    break;
                }
                return;
            case 14:
                ((com.google.android.apps.auto.components.feedback.hats.HatsDownloadService) this.d).a((java.lang.String) this.a, (android.os.PersistableBundle) this.b, (java.lang.String) this.c);
                return;
            case 15:
                if (((j$.util.Optional) this.c).isEmpty()) {
                    ((defpackage.knb) this.b).h("android.media.metadata.DISPLAY_ICON_URI", ((miy) this.d).b(((com.google.android.gms.car.RadioProgramInfo) this.a).a, "station_icon_fallback_play").toString());
                    return;
                }
                return;
            case 16:
                java.lang.Object obj26 = this.c;
                defpackage.yqm yqmVar5 = noe.a;
                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.RAIL_WIDGET, (defpackage.zbd) obj26);
                rrvVarH.p((android.content.ComponentName) this.b);
                defpackage.abor aborVarE = rrvVarH.E();
                int iA = ((defpackage.nve) this.a).a();
                aborVarE.t();
                defpackage.zaf zafVar = (defpackage.zaf) aborVarE.b;
                defpackage.zaf zafVar2 = defpackage.zaf.a;
                zafVar.d = iA - 1;
                zafVar.b |= 2;
                defpackage.omf.u().F(rrvVarH.l());
                ((defpackage.noc) this.d).b.invoke();
                return;
            case 17:
                java.lang.Object obj27 = this.c;
                java.lang.Object obj28 = this.b;
                java.lang.Object obj29 = this.d;
                java.lang.Object obj30 = this.a;
                try {
                    if (!zdl.b.equals(((qar) obj28).a)) {
                    }
                    abxr abxrVar = ((qav) obj29).f;
                    if (abxrVar != null) {
                        qbi qbiVar = ((qbs) obj27).g;
                        int i7 = abxrVar.a;
                        long epochMilli = ((qbs) obj27).c.f().toEpochMilli();
                        defpackage.yfd yfdVar = qbiVar.a;
                        synchronized (yfdVar) {
                            yfdVar.add(new qbh(i7, epochMilli));
                            break;
                        }
                    }
                    qbf qbfVar = new qbf();
                    qbfVar.a = obj28;
                    qbfVar.d = ((qbp) obj30).e;
                    qav.d();
                    qbfVar.b(((qav) obj29).a());
                    qbfVar.b = ((qav) obj29).f;
                    ((qbs) obj27).d(qbfVar.a(), (qbp) obj30);
                    java.util.List list2 = ((qbs) obj27).i;
                    synchronized (list2) {
                        java.util.Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            ((qaw) it3.next()).a();
                        }
                        break;
                    }
                    return;
                } catch (java.lang.Throwable th8) {
                    ((qbs) obj27).e(th8, "Failed to log interaction");
                    return;
                }
            case 18:
                defpackage.qtj qtjVar = (defpackage.qtj) this.b;
                if (qtjVar.h == 0 && (obj2 = this.d) == defpackage.zaj.NO_LAUNCHER) {
                    defpackage.qtj.a.l().ai(7853).y("ignore critical error in emulator:%s", obj2);
                    return;
                }
                defpackage.yqk yqkVar = defpackage.qtj.a;
                defpackage.ypu ypuVarAi2 = yqkVar.h().ai(7851);
                java.lang.Object obj31 = this.d;
                java.lang.Object obj32 = this.a;
                java.lang.Object obj33 = this.c;
                defpackage.zak zakVar2 = (defpackage.zak) obj32;
                int i8 = zakVar2.az;
                defpackage.zaj zajVar2 = (defpackage.zaj) obj31;
                int i9 = zajVar2.D;
                ypuVarAi2.R("Critical error %d detail: %d msg: %s", java.lang.Integer.valueOf(i9), java.lang.Integer.valueOf(i8), obj33);
                if (qtjVar.u()) {
                    defpackage.rxs rxsVar = qtjVar.n;
                    defpackage.abor aborVarN3 = defpackage.zal.a.n();
                    aborVarN3.t();
                    defpackage.zal zalVar4 = (defpackage.zal) aborVarN3.b;
                    zalVar4.b |= 1;
                    zalVar4.c = i9;
                    aborVarN3.t();
                    defpackage.zal zalVar5 = (defpackage.zal) aborVarN3.b;
                    zalVar5.b |= 2;
                    zalVar5.d = i8;
                    defpackage.zal zalVar6 = (defpackage.zal) aborVarN3.q();
                    defpackage.abor aborVarN4 = defpackage.yyg.a.n();
                    aborVarN4.t();
                    defpackage.yyg yygVar2 = (defpackage.yyg) aborVarN4.b;
                    zalVar6.getClass();
                    yygVar2.s = zalVar6;
                    yygVar2.b = 65536 | yygVar2.b;
                    defpackage.yyh yyhVar2 = defpackage.yyh.PROJECTION_ERROR;
                    int i10 = defpackage.ygw.d;
                    ((defpackage.rxt) rxsVar).g(aborVarN4, yyhVar2, defpackage.ymx.a);
                    if (i9 <= 0 || i9 >= 1000) {
                        return;
                    }
                    if (qtjVar.m) {
                        if (qtjVar.k != obj31) {
                            yqkVar.l().ai(7852).M("got new critical error:%s while handling old one:%s", obj31, qtjVar.k);
                            return;
                        }
                        return;
                    }
                    qtjVar.m = true;
                    qtjVar.k = zajVar2;
                    if (qtjVar.h == 0) {
                        qtjVar.f(com.google.android.gms.car.diagnostics.CriticalError.a(zajVar2, zakVar2));
                        return;
                    } else {
                        qsp.n(qtjVar.e, zajVar2, qtjVar.h, zakVar2);
                        qtjVar.f(com.google.android.gms.car.diagnostics.CriticalError.a(zajVar2, zakVar2));
                        return;
                    }
                }
                return;
            case 19:
                defpackage.qtj qtjVar2 = (defpackage.qtj) this.b;
                android.util.SparseBooleanArray sparseBooleanArray4 = qtjVar2.g;
                synchronized (sparseBooleanArray4) {
                    if (sparseBooleanArray4.get(15, false)) {
                        if (sparseBooleanArray4.get(3, false)) {
                            return;
                        }
                        android.hardware.usb.UsbAccessory[] accessoryList2 = ((android.hardware.usb.UsbManager) qtjVar2.e.getSystemService("usb")).getAccessoryList();
                        if (accessoryList2 == null || accessoryList2.length <= 0) {
                            return;
                        }
                        qtjVar2.n((defpackage.zaj) this.d, (defpackage.zak) this.a, (java.lang.String) this.c);
                        return;
                    }
                    return;
                }
            default:
                java.lang.Object obj34 = this.d;
                ?? r6 = this.c;
                if (defpackage.omv.c("CAR.CLIENT.IME", 3)) {
                    defpackage.rrx.d(3, "CAR.CLIENT.IME", null, "onStartInput %s", obj34);
                }
                java.lang.Object obj35 = this.a;
                rmv rmvVar = (rmv) obj35;
                if (rmvVar.d) {
                    if (defpackage.omv.c("CAR.CLIENT.IME", 3)) {
                        defpackage.rrx.a("CAR.CLIENT.IME", null, "ending previous input");
                    }
                    rmvVar.a();
                }
                rmvVar.f = new rmx(rmvVar);
                try {
                    r6.i(((rmv) obj35).f);
                    java.lang.Object obj36 = this.b;
                    rmvVar.c = new rnn((rnh) r6);
                    rmvVar.d = true;
                    rmvVar.c((android.view.inputmethod.EditorInfo) obj36, (com.google.android.gms.car.display.CarRegionId) obj34);
                    if (defpackage.omv.c("CAR.CLIENT.IME", 3)) {
                        defpackage.rrx.a("CAR.CLIENT.IME", null, "/onStartInput");
                        return;
                    }
                    return;
                } catch (android.os.RemoteException e4) {
                    defpackage.rrx.b("CAR.CLIENT.IME", e4, "Start input failed, unable to register car editable listener.");
                    rmvVar.f = null;
                    return;
                }
        }
    }

    public /* synthetic */ ye(android.content.Context context, j$.time.Instant instant, defpackage.qsh qshVar, java.util.concurrent.CountDownLatch countDownLatch, int i) {
        this.e = i;
        this.b = context;
        this.a = instant;
        this.d = qshVar;
        this.c = countDownLatch;
    }

    public ye(android.view.View view, defpackage.kwv kwvVar, ecd ecdVar, android.animation.ValueAnimator valueAnimator, int i) {
        this.e = i;
        this.d = view;
        this.c = kwvVar;
        this.a = ecdVar;
        this.b = valueAnimator;
    }

    public /* synthetic */ ye(androidx.work.impl.WorkDatabase workDatabase, fof fofVar, java.util.List list, fjf fjfVar, int i) {
        this.e = i;
        this.d = workDatabase;
        this.a = fofVar;
        this.c = list;
        this.b = fjfVar;
    }

    public /* synthetic */ ye(com.google.android.apps.auto.components.feedback.hats.HatsDownloadService hatsDownloadService, java.lang.String str, android.os.PersistableBundle persistableBundle, java.lang.String str2, int i) {
        this.e = i;
        this.d = hatsDownloadService;
        this.a = str;
        this.b = persistableBundle;
        this.c = str2;
    }

    public /* synthetic */ ye(defpackage.epy epyVar, androidx.car.app.IOnDoneCallback iOnDoneCallback, java.lang.String str, yf yfVar, int i) {
        this.e = i;
        this.a = epyVar;
        this.b = iOnDoneCallback;
        this.c = str;
        this.d = yfVar;
    }

    public ye(ha haVar, defpackage.aahg aahgVar, android.view.MenuItem menuItem, defpackage.hh hhVar, int i) {
        this.e = i;
        this.b = haVar;
        this.d = aahgVar;
        this.c = menuItem;
        this.a = hhVar;
    }

    public /* synthetic */ ye(defpackage.ikz ikzVar, com.google.android.gms.car.RadioProgramInfo radioProgramInfo, java.util.List list, java.util.List list2, int i) {
        this.e = i;
        this.b = ikzVar;
        this.d = radioProgramInfo;
        this.a = list;
        this.c = list2;
    }

    public /* synthetic */ ye(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i) {
        this.e = i;
        this.d = obj;
        this.c = obj2;
        this.b = obj3;
        this.a = obj4;
    }

    public ye(java.lang.Object obj, defpackage.zaj zajVar, defpackage.zak zakVar, java.lang.String str, int i) {
        this.e = i;
        this.d = zajVar;
        this.a = zakVar;
        this.c = str;
        this.b = obj;
    }

    public /* synthetic */ ye(defpackage.jdl jdlVar, defpackage.jdk jdkVar, defpackage.qug qugVar, java.nio.ByteBuffer byteBuffer, int i) {
        this.e = i;
        this.d = jdlVar;
        this.b = jdkVar;
        this.a = qugVar;
        this.c = byteBuffer;
    }

    public /* synthetic */ ye(qbs qbsVar, qar qarVar, qav qavVar, qbp qbpVar, int i) {
        this.e = i;
        this.c = qbsVar;
        this.b = qarVar;
        this.d = qavVar;
        this.a = qbpVar;
    }

    public /* synthetic */ ye(rmv rmvVar, rnh rnhVar, android.view.inputmethod.EditorInfo editorInfo, com.google.android.gms.car.display.CarRegionId carRegionId, int i) {
        this.e = i;
        this.a = rmvVar;
        this.c = rnhVar;
        this.b = editorInfo;
        this.d = carRegionId;
    }

    public /* synthetic */ ye(defpackage.zbd zbdVar, android.content.ComponentName componentName, defpackage.nve nveVar, defpackage.noc nocVar, int i) {
        this.e = i;
        this.c = zbdVar;
        this.b = componentName;
        this.a = nveVar;
        this.d = nocVar;
    }
}
