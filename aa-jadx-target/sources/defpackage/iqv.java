package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class iqv implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ iqv(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        java.util.UUID uuidFromString;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.iqx iqxVar = (defpackage.iqx) this.a;
                iqxVar.b.a();
                iqf iqfVar = iqxVar.c;
                if (iqfVar != null) {
                    iqfVar.a();
                    return;
                }
                return;
            case 1:
                java.lang.Object obj = this.a;
                defpackage.iqp iqpVar = (defpackage.iqp) obj;
                long andSet = iqpVar.g.getAndSet(0L);
                long andSet2 = iqpVar.i.getAndSet(0L);
                if (andSet == 0) {
                    synchronized (obj) {
                        java.util.concurrent.Future future = ((defpackage.iqp) obj).y;
                        if (future != null) {
                            future.cancel(false);
                            ((defpackage.iqp) obj).y = null;
                        }
                        break;
                    }
                    java.util.List list = iqpVar.z;
                    if (!list.isEmpty()) {
                        iqpVar.s(defpackage.ygw.o(list));
                        list.clear();
                    }
                    iqpVar.t();
                    return;
                }
                java.util.List list2 = iqpVar.z;
                list2.add(andSet + ":" + ((andSet2 / andSet) / 1000) + "ms");
                if (list2.size() >= 10) {
                    iqpVar.s(defpackage.ygw.o(list2));
                    list2.clear();
                    return;
                }
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.iqx iqxVar2 = (defpackage.iqx) this.a;
                iqxVar2.b.a();
                iqf iqfVar2 = iqxVar2.c;
                if (iqfVar2 != null) {
                    iqfVar2.a();
                    return;
                }
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((defpackage.irf) this.a).m(1);
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.irf) this.a).m(1);
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.irf irfVar = (defpackage.irf) this.a;
                if (irfVar.h != defpackage.xik.AUDIO_FOCUS_STATE_GAIN) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.irf.a.h()).ai((char) 1205)).u("HU failed to restore GAIN from transient loss after phone call");
                    irfVar.g.b(defpackage.zbd.zp);
                    return;
                }
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Object obj2 = this.a;
                try {
                    ((defpackage.irk) obj2).s = false;
                    ((defpackage.irk) obj2).t = false;
                    int i = ((defpackage.irk) obj2).r;
                    if (i <= 0) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.irk.a.f()).ai(1230)).u("No more audio policy restart attempts. Audio capture has failed.");
                        defpackage.jfo jfoVar = ((defpackage.irk) obj2).h;
                        jfoVar.getClass();
                        jfoVar.e(defpackage.zbe.AUDIO_DIAGNOSTICS, defpackage.zbd.wF);
                        ((defpackage.irk) obj2).i.ax(defpackage.zaj.AUDIO_ERROR, defpackage.zak.NO_AUDIO_CAPTURE, "cannot capture audio");
                    } else {
                        ((defpackage.irk) obj2).r = i - 1;
                        defpackage.yqm yqmVar = defpackage.irk.a;
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(1228)).w("Restarting audio capture. Remaining attempts: %d", ((defpackage.irk) obj2).r);
                        defpackage.itd itdVar = ((defpackage.irk) obj2).q;
                        itdVar.getClass();
                        itdVar.e();
                        ((defpackage.irk) obj2).q = ((defpackage.irk) obj2).c();
                        defpackage.yot it = defpackage.irk.b.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((java.lang.Integer) it.next()).intValue();
                            int iAb = defpackage.a.ab(iIntValue);
                            defpackage.iqi iqiVar = ((defpackage.irk) obj2).f[iAb];
                            if (iqiVar == null) {
                                throw new java.lang.IllegalStateException(defpackage.a.bo(iIntValue, "Missing audio source service configurator for stream: "));
                            }
                            defpackage.iqh iqhVar = ((defpackage.irk) obj2).w[iAb];
                            if (iqhVar != null && iqhVar.o) {
                                ((defpackage.irk) obj2).d(iIntValue, iqiVar, iqhVar, ((defpackage.irk) obj2).q);
                            }
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(1229)).u("Projection disconnected before restarting.");
                            defpackage.jfo jfoVar2 = ((defpackage.irk) obj2).h;
                            jfoVar2.getClass();
                            jfoVar2.e(defpackage.zbe.AUDIO_DIAGNOSTICS, defpackage.zbd.wH);
                        }
                        defpackage.iqj[] iqjVarArr = ((defpackage.irk) obj2).v;
                        for (int i2 = 0; i2 < 3; i2++) {
                            defpackage.iqj iqjVar = iqjVarArr[i2];
                            if (iqjVar != null) {
                                iqjVar.b();
                            }
                        }
                        defpackage.jfo jfoVar3 = ((defpackage.irk) obj2).h;
                        jfoVar3.getClass();
                        jfoVar3.e(defpackage.zbe.AUDIO_DIAGNOSTICS, defpackage.zbd.wE);
                    }
                    ((defpackage.irk) obj2).u = false;
                    return;
                } catch (java.lang.Throwable th) {
                    ((defpackage.irk) obj2).u = false;
                    throw th;
                }
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Object obj3 = this.a;
                defpackage.irk irkVar = (defpackage.irk) obj3;
                if (irkVar.u) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.irk.a.f()).ai((char) 1213)).u("The other thread is handling AudioRecord read error.");
                    return;
                }
                irkVar.u = true;
                defpackage.iqj[] iqjVarArr2 = irkVar.v;
                defpackage.iqj iqjVar2 = iqjVarArr2[0];
                defpackage.iqj iqjVar3 = iqjVarArr2[1];
                if (iqjVar2 != null) {
                    iqjVar2.f();
                }
                if (iqjVar3 != null) {
                    iqjVar3.f();
                }
                ((defpackage.yqj) ((defpackage.yqj) defpackage.irk.a.f()).ai((char) 1212)).w("Schedule audio capture restart in %d millis.", 2000);
                new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new defpackage.iqv(obj3, 6), 2000L);
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                irn irnVar = (irn) this.a;
                irnVar.a.a();
                iqf iqfVar3 = irnVar.b;
                if (iqfVar3 != null) {
                    iqfVar3.a();
                    return;
                }
                return;
            case 9:
                ((defpackage.isd) this.a).b();
                return;
            case 10:
                defpackage.yqm yqmVar2 = defpackage.isw.a;
                ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 1300)).u("Request android audio focus on exit");
                int iD = ((defpackage.isw) this.a).d(1, new android.media.AudioAttributes.Builder().setUsage(1).setContentType(1).build());
                if (iD == 1 || iD == 2) {
                    return;
                }
                ((defpackage.yqj) ((defpackage.yqj) yqmVar2.g()).ai((char) 1301)).w("Request audio focus before exit failed: %d", iD);
                return;
            case 11:
                defpackage.yqm yqmVar3 = defpackage.iuk.a;
                ((defpackage.imi) this.a).a(com.google.android.gms.car.diagnostics.CriticalError.a(defpackage.zaj.PROTOCOL_BYEBYE_REQUESTED_BY_USER, defpackage.zak.BYEBYE_BY_USER));
                return;
            case 12:
                java.lang.Object obj4 = this.a;
                defpackage.iuw iuwVar = (defpackage.iuw) obj4;
                synchronized (iuwVar.c) {
                    defpackage.ivc ivcVar = ((defpackage.iuw) obj4).b;
                    ((defpackage.iuw) obj4).d = ((defpackage.iuw) obj4).f(defpackage.iuw.b(ivcVar), ivcVar);
                    uuidFromString = java.util.UUID.fromString(((defpackage.iuw) obj4).d.g);
                    break;
                }
                defpackage.ivc ivcVar2 = iuwVar.b;
                defpackage.jkr jkrVar = ivcVar2.p;
                if (jkrVar == null) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.ivc.a.h()).ai((char) 1360)).u("Unable to configure display before window manager init");
                } else {
                    defpackage.ive iveVarA = ivcVar2.o.a();
                    iveVarA.getClass();
                    jkrVar.t(iveVarA, uuidFromString);
                }
                iuwVar.h.e(iuwVar.g());
                return;
            case 13:
                int iM = (int) defpackage.acsa.m();
                java.lang.Object obj5 = this.a;
                float fM = android.os.Build.VERSION.SDK_INT >= 30 ? bgp$.ExternalSyntheticApiModelOutline0.m(((defpackage.ixv) ((defpackage.iya) obj5).l).a, (int) j$.time.Duration.ofSeconds(iM).toSeconds()) : Float.NaN;
                if (!java.lang.Float.isNaN(fM) && fM >= 0.0f) {
                    defpackage.iya iyaVar = (defpackage.iya) obj5;
                    boolean z = iyaVar.B;
                    float f = iyaVar.A;
                    if (fM >= f) {
                        iyaVar.B = true;
                    } else if (fM < f * ((float) defpackage.acsa.b())) {
                        iyaVar.B = false;
                    }
                    if (z != iyaVar.B) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.iya.a.f()).ai(1525)).R("Thermal headroom throttling %s due to headroom: %f (threshold: %f)", java.lang.Boolean.valueOf(iyaVar.B), java.lang.Float.valueOf(fM), java.lang.Float.valueOf(iyaVar.A));
                        if (iyaVar.B) {
                            iyaVar.C = android.os.SystemClock.elapsedRealtime();
                            iyaVar.i.e(defpackage.zbe.CAR_SERVICE, defpackage.zbd.vM);
                        } else {
                            iyaVar.i.f(defpackage.zbe.CAR_SERVICE, defpackage.zbd.vN, iyaVar.C > 0 ? android.os.SystemClock.elapsedRealtime() - iyaVar.C : 0L);
                        }
                        iyaVar.d();
                    }
                }
                synchronized (((defpackage.iya) obj5).m) {
                    if (((defpackage.iya) obj5).G) {
                        ((defpackage.iya) obj5).p.postDelayed(this, defpackage.acsa.n() * 1000);
                        return;
                    }
                    return;
                }
            case 14:
                defpackage.ill.e();
                java.lang.Object obj6 = this.a;
                defpackage.iyh iyhVar = (defpackage.iyh) obj6;
                if (iyhVar.r() == null) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.iyh.a.h()).ai((char) 1624)).u("ignoring request to cache outside of a projection session");
                    return;
                }
                defpackage.tgg tggVar = defpackage.tgg.a;
                defpackage.tgf tgfVar = defpackage.tgf.GEARHEAD_CPV_PREFETCH_LAUNCHER_APPS;
                tggVar.b(tgfVar);
                synchronized (iyhVar.e) {
                    defpackage.yqm yqmVar4 = defpackage.iyh.a;
                    ((defpackage.yqj) yqmVar4.l().ai(1622)).y("preCacheProjectionApps starting CI=%s", ((defpackage.iyh) obj6).d);
                    defpackage.you youVarListIterator = defpackage.iyh.b.listIterator(0);
                    while (youVarListIterator.hasNext()) {
                        defpackage.iyg iygVar = (defpackage.iyg) youVarListIterator.next();
                        ((defpackage.iyh) obj6).e(iygVar.a, iygVar.b);
                    }
                    ((defpackage.yqj) yqmVar4.l().ai(1623)).u("preCacheProjectionApps done");
                    break;
                }
                tggVar.d(tgfVar, 1);
                iyhVar.f.countDown();
                return;
            case 15:
                defpackage.iys.a.f().ai(1640).u("car did not send byebye response. will quit.");
                defpackage.iys iysVar = (defpackage.iys) this.a;
                iysVar.h.aF(defpackage.zaj.CAR_NOT_RESPONDING, defpackage.zak.BYEBYE_TIMEOUT, "byebye timeout");
                defpackage.omv.i(iysVar.c, defpackage.yyn.PROJECTION_ENDED_BYEBYE_TIMEOUT);
                return;
            case 16:
                defpackage.izs.a.l().ai(1673).u("onReceiverClosed: Posted READER_CLOSE on control channel's handler");
                ((defpackage.izq) this.a).a(defpackage.zak.READER_CLOSE);
                return;
            case 17:
                android.content.Context context = (android.content.Context) this.a;
                android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) context.getApplicationContext().getSystemService("wifi");
                android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
                if (wifiManager == null || connectivityManager == null) {
                    defpackage.omv.i(context, defpackage.yyn.WIRELESS_WIFI_FAILED_TO_GET_WIFI_INFO);
                    return;
                }
                if (!wifiManager.isWifiEnabled()) {
                    defpackage.omv.i(context, defpackage.yyn.WIRELESS_WIFI_STATE_DISABLED);
                    return;
                }
                defpackage.omv.i(context, defpackage.yyn.WIRELESS_WIFI_STATE_ENABLED);
                android.net.wifi.WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                android.net.NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
                if (connectionInfo == null || networkInfo == null || !networkInfo.isConnected()) {
                    defpackage.omv.i(context, defpackage.yyn.WIRELESS_WIFI_NOT_CONNECTED_TO_ANY_NETWORK);
                    return;
                } else {
                    defpackage.omv.i(context, defpackage.yyn.WIRELESS_WIFI_CONNECTED_TO_A_NETWORK);
                    defpackage.omv.j(context, defpackage.yyn.WIRELESS_WIFI_RSSI_SIGNAL_LEVEL, android.net.wifi.WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 100));
                    return;
                }
            case 18:
                ((defpackage.jcs) this.a).c();
                return;
            case 19:
                ((defpackage.jdj) this.a).c();
                return;
            default:
                ((defpackage.jdk) this.a).a();
                return;
        }
    }

    public iqv(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
