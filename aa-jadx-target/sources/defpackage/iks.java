package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class iks implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ iks(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Code duplicated, block: B:56:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:58:0x02b3  */
    @Override // java.lang.Runnable
    public final void run() {
        xnx xnxVarH;
        boolean zIsEmpty;
        java.lang.Integer numB;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                java.lang.Object obj = this.a;
                defpackage.ikz ikzVar = (defpackage.ikz) obj;
                synchronized (ikzVar.e) {
                    ((defpackage.ikz) obj).r = true;
                    xnxVarH = ((defpackage.ikz) obj).h();
                    break;
                }
                if (xnxVarH != null) {
                    ikzVar.l(xnxVarH);
                    return;
                }
                return;
            case 1:
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Object obj2 = this.a;
                defpackage.jlv jlvVar = new defpackage.jlv(((defpackage.ilo) obj2).e);
                try {
                    com.google.android.gms.carsetup.CarInfoInternal carInfoInternal = ((defpackage.ilo) obj2).f;
                    com.google.android.gms.car.CarInfo carInfo = carInfoInternal.a;
                    if (carInfo.d == null) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.jlv.a.h()).ai((char) 2348)).u("vehicleId for client is null!");
                    } else {
                        android.content.ContentValues contentValues = new android.content.ContentValues();
                        defpackage.jlv.o(carInfoInternal, contentValues);
                        defpackage.jlv.p(carInfoInternal, contentValues);
                        jlvVar.k(carInfo.d, carInfo.a, "allowedcars", contentValues);
                    }
                    jlvVar.close();
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        jlvVar.close();
                        break;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.imi imiVar = (defpackage.imi) this.a;
                imiVar.O.e(defpackage.zbe.VIDEO_FOCUS, defpackage.zbd.Cr);
                ((defpackage.yqj) ((defpackage.yqj) defpackage.imi.b.f()).ai((char) 331)).u("Requested focus on primary display without delay");
                imiVar.p().o.k();
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.ioh iohVarN = ((defpackage.imi) this.a).n();
                if (iohVarN != null) {
                    iohVarN.ah();
                    return;
                }
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.lang.Object obj3 = this.a;
                defpackage.imi imiVar2 = (defpackage.imi) obj3;
                java.util.Map map = imiVar2.g;
                synchronized (map) {
                    zIsEmpty = map.isEmpty();
                    break;
                }
                if (zIsEmpty) {
                    defpackage.yqm yqmVar = defpackage.imi.b;
                    ((defpackage.yqj) yqmVar.l().ai((char) 353)).u("CSB onClientsDisconnected");
                    ((defpackage.yqj) yqmVar.l().ai((char) 402)).u("tearDownClientState");
                    defpackage.ysr.bk(android.os.Looper.myLooper() == imiVar2.o.getLooper(), "Tear down must happen in default handler thread.");
                    if (imiVar2.f) {
                        imiVar2.f = false;
                        synchronized (imiVar2.Q) {
                            imf imfVar = ((defpackage.imi) obj3).R;
                            if (imfVar != null) {
                                scp scpVar = imfVar.a;
                                if (scpVar != null) {
                                    try {
                                        scpVar.f();
                                        break;
                                    } catch (android.os.RemoteException unused) {
                                    }
                                }
                                imf imfVar2 = ((defpackage.imi) obj3).R;
                                imfVar2.b = false;
                                imfVar2.c.Q.notify();
                                defpackage.sqf.a().b(((defpackage.imi) obj3).F, ((defpackage.imi) obj3).R);
                                ((defpackage.imi) obj3).R = null;
                                j$.util.Optional optionalX = ((defpackage.imi) obj3).X();
                                optionalX.isPresent();
                                defpackage.jbw jbwVar = ((defpackage.iuk) optionalX.get()).s;
                                if (jbwVar != null) {
                                    jbwVar.h(null);
                                }
                                ((defpackage.imi) obj3).P = null;
                            }
                            break;
                        }
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 403)).u("Skip, no clients bound.");
                    }
                    imiVar2.br();
                    return;
                }
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((android.bluetooth.BluetoothAdapter) this.a).enable();
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.iuk iukVar = ((defpackage.imi) this.a).u;
                java.util.Map map2 = iukVar.L;
                synchronized (map2) {
                    if (map2.isEmpty()) {
                        return;
                    }
                    android.content.Intent intent = new android.content.Intent("com.google.android.gms.car.VENDOR_CHANNEL_READY");
                    intent.setFlags(32);
                    java.util.Set setC = iukVar.f.c("vec_dont_auto_launch", defpackage.ynd.a);
                    for (defpackage.iln ilnVar : map2.values()) {
                        intent.putExtra("com.google.android.gms.car.extra.VENDOR_CHANNEL_NAME", ilnVar.b);
                        for (java.lang.String str : ilnVar.c) {
                            if (!setC.contains(str) && ((defpackage.iyc) iukVar.d.fF()).n(str, defpackage.qqe.e)) {
                                intent.setPackage(str);
                                iukVar.k.getApplicationContext().sendBroadcast(intent);
                            }
                        }
                    }
                    return;
                }
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Object obj4 = this.a;
                defpackage.ioh iohVar = ((defpackage.iny) obj4).m;
                if (!iohVar.o) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.ioh.b.f()).ai((char) 651)).u("flushPendingResumeThenStopRunnable called after teardown, nothing to do");
                    return;
                }
                synchronized (iohVar) {
                    com.google.android.gms.car.display.CarRegionId carRegionId = ((defpackage.iny) obj4).l;
                    defpackage.inv invVarG = iohVar.g(carRegionId);
                    ioc iocVar = invVarG.o;
                    if (iocVar != null) {
                        ((defpackage.yqj) defpackage.ioh.b.l().ai(650)).M("Posting %s for %s", iocVar, carRegionId);
                        defpackage.rbz.h(iocVar);
                        invVarG.o = null;
                    }
                    break;
                }
                return;
            case 9:
                ((defpackage.iol) this.a).g();
                return;
            case 10:
                java.lang.Object obj5 = this.a;
                defpackage.yqm yqmVar2 = iow.E;
                iow iowVar = (iow) obj5;
                java.lang.String str2 = iowVar.i;
                ((defpackage.yqj) yqmVar2.l().ai((char) 849)).y("%s onStart()", str2);
                ((defpackage.yqj) ((defpackage.yqj) defpackage.irf.a.f()).ai((char) 1172)).u("Enter forced car audio focus state. All Android audio focus changes will be ignored.");
                defpackage.ioh iohVar2 = iowVar.b;
                defpackage.ita itaVar = iohVar2.A;
                defpackage.irf irfVar = (defpackage.irf) itaVar;
                irfVar.q = true;
                defpackage.ird irdVar = irfVar.m;
                irdVar.getClass();
                irdVar.post(new defpackage.iqv(itaVar, 3));
                iowVar.R(3);
                android.media.AudioManager audioManager = iowVar.L;
                if (audioManager != null) {
                    defpackage.yhx yhxVar = iowVar.K;
                    if (!yhxVar.isEmpty()) {
                        android.content.ComponentName componentName = iowVar.d;
                        if (yhxVar.contains(componentName.getPackageName())) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 851)).y("Requesting explicit audio focus for %s", componentName.getPackageName());
                            int iM$1 = ep$.ExternalSyntheticApiModelOutline1.m$1(audioManager, ep$.ExternalSyntheticApiModelOutline1.m(ep$.ExternalSyntheticApiModelOutline1.m(ep$.ExternalSyntheticApiModelOutline1.m(ep$.ExternalSyntheticApiModelOutline1.m(new android.media.AudioFocusRequest.Builder(1), new android.media.AudioAttributes.Builder().setUsage(14).setContentType(2).build()), true), new ior(0))));
                            if (iM$1 != 1) {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar2.h()).ai((char) 852)).w("Audio focus request failed: %d", iM$1);
                            }
                        }
                    }
                }
                ipu ipuVar = iowVar.G;
                ipuVar.p();
                if (!iow.S()) {
                    if (defpackage.acqh.m() && android.os.Build.VERSION.SDK_INT >= 37) {
                    }
                    numB = ipuVar.b();
                    if (numB != null) {
                        iowVar.P(numB.intValue());
                        return;
                    } else {
                        ((defpackage.yqj) yqmVar2.l().ai((char) 850)).y("%s display not ready to start activity, delaying", str2);
                        return;
                    }
                }
                android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.VIEW");
                intentFilter.addDataScheme("http");
                intentFilter.addDataScheme("https");
                intentFilter.addDataScheme("market");
                intentFilter.addCategory("android.intent.category.APP_BROWSER");
                intentFilter.addCategory("android.intent.category.BROWSABLE");
                ipuVar.n(intentFilter, new defpackage.zie(defpackage.zgt.INSTANCE), iowVar.Q);
                android.content.Context context = iohVar2.d;
                context.bindService(new android.content.Intent().setComponent(new android.content.ComponentName(context.getPackageName(), "com.google.android.gearhead.appdecor.AppDecorService")), iowVar.P, 1);
                numB = ipuVar.b();
                if (numB != null) {
                    iowVar.P(numB.intValue());
                    return;
                } else {
                    ((defpackage.yqj) yqmVar2.l().ai((char) 850)).y("%s display not ready to start activity, delaying", str2);
                    return;
                }
            case 11:
                defpackage.yqj yqjVar = (defpackage.yqj) iow.E.l().ai(848);
                java.lang.Object obj6 = this.a;
                iow iowVar2 = (iow) obj6;
                yqjVar.y("%s onResume()", iowVar2.i);
                defpackage.ioh iohVar3 = iowVar2.b;
                defpackage.inn innVar = (defpackage.inn) obj6;
                iohVar3.w(innVar);
                iohVar3.F(innVar);
                return;
            case 12:
                defpackage.yqj yqjVar2 = (defpackage.yqj) iow.E.l().ai(847);
                java.lang.Object obj7 = this.a;
                iow iowVar3 = (iow) obj7;
                yqjVar2.y("%s onPause()", iowVar3.i);
                ipu ipuVar2 = iowVar3.G;
                ipuVar2.k();
                ipuVar2.l();
                iowVar3.b.u((defpackage.inn) obj7);
                return;
            case 13:
                defpackage.yqj yqjVar3 = (defpackage.yqj) iow.E.l().ai(853);
                java.lang.Object obj8 = this.a;
                iow iowVar4 = (iow) obj8;
                yqjVar3.y("%s onStop()", iowVar4.i);
                if (iow.S()) {
                    iowVar4.G.q(iowVar4.Q);
                    iowVar4.b.d.unbindService(iowVar4.P);
                    iowVar4.I = null;
                }
                defpackage.ioh iohVar4 = iowVar4.b;
                ((defpackage.yqj) ((defpackage.yqj) defpackage.irf.a.f()).ai((char) 1173)).u("Exit forced car audio focus state. Will start monitoring Android audio focus.");
                ((defpackage.irf) iohVar4.A).q = false;
                iowVar4.R(2);
                iohVar4.A((defpackage.inn) obj8);
                return;
            case 14:
                defpackage.yqj yqjVar4 = (defpackage.yqj) iow.E.l().ai(844);
                java.lang.Object obj9 = this.a;
                iow iowVar5 = (iow) obj9;
                yqjVar4.y("%s onDestroy()", iowVar5.i);
                iowVar5.G.c();
                iowVar5.N = null;
                iowVar5.O = null;
                iowVar5.b.av((defpackage.inn) obj9, null);
                return;
            case 15:
                ((defpackage.iph) this.a).W();
                return;
            case 16:
                ((defpackage.yqj) ipj.a.f()).u("BlackHole timeout");
                ((ipj) this.a).c();
                return;
            case 17:
                int i = ipl.b;
                ajnd ajndVar = ((ipu) this.a).k;
                if (ajndVar != null) {
                    defpackage.yqj yqjVar5 = (defpackage.yqj) iow.E.l().ai(842);
                    iow iowVar6 = (iow) ajndVar.a;
                    yqjVar5.y("%s onClientFinished()", iowVar6.i);
                    defpackage.ill.d();
                    iowVar6.J = true;
                    iowVar6.Q();
                    defpackage.rqt rqtVarA = defpackage.rqt.a(iowVar6.b.d);
                    defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.ACTIVITY_MANAGER, defpackage.zbd.LS);
                    rrvVarH.p(iowVar6.d);
                    rqtVarA.c(rrvVarH.l());
                    return;
                }
                return;
            case 18:
                int i2 = ipl.b;
                ajnd ajndVar2 = ((ipu) this.a).k;
                if (ajndVar2 != null) {
                    java.lang.Object obj10 = ajndVar2.a;
                    iow iowVar7 = (iow) obj10;
                    defpackage.ioh iohVar5 = iowVar7.b;
                    java.lang.Class<?> cls = obj10.getClass();
                    android.content.Context context2 = iohVar5.d;
                    iow.O(context2, iowVar7.I, iowVar7.z, new android.content.ComponentName(context2.getPackageName(), cls.getName()), 2132083075);
                    return;
                }
                return;
            case 19:
                if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
                    throw new java.lang.IllegalStateException("expecting main thread");
                }
                defpackage.iqd iqdVar = (defpackage.iqd) this.a;
                ((defpackage.yqj) iqdVar.e.l().ai(1059)).u("Triggering AUDIO_QUALITY csat survey");
                defpackage.lby.j.e(iqdVar.a);
                return;
            default:
                java.lang.Object obj11 = this.a;
                defpackage.iqp iqpVar = (defpackage.iqp) obj11;
                int andSet = iqpVar.e.getAndSet(0);
                if (andSet == 0) {
                    iqpVar.v();
                    return;
                }
                int i3 = (andSet * 8) / 1000;
                synchronized (obj11) {
                    java.util.List list = ((defpackage.iqp) obj11).x;
                    list.add(java.lang.String.valueOf(i3));
                    if (list.size() >= 10) {
                        ((defpackage.iqp) obj11).u(defpackage.ygw.o(list));
                        list.clear();
                    }
                    break;
                }
                return;
        }
        while (true) {
            java.lang.Object obj12 = this.a;
            boolean z = ((hwb) obj12).c;
            try {
                ((hwb) obj12).c(((hwb) obj12).b.remove());
                hvz hvzVar = ((hwb) obj12).d;
            } catch (java.lang.InterruptedException unused2) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }

    public iks(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
