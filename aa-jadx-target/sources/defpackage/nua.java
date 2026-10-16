package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nua extends defpackage.eqp {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CellSignalLiveData");
    private static final android.util.SparseArray n;
    private static final android.util.SparseArray o;
    public final android.content.Context h;
    public android.net.Network i;
    public boolean j;
    public boolean k;
    public android.telephony.SignalStrength l;
    private final defpackage.ntu p;
    private final android.telephony.TelephonyManager q;
    private final android.net.ConnectivityManager r;
    private final android.net.ConnectivityManager.NetworkCallback s = new defpackage.ntz(this);
    private int t = 0;
    public int m = 0;
    private final android.telephony.PhoneStateListener u = new defpackage.ntw(this);

    static {
        android.util.SparseArray sparseArray = new android.util.SparseArray(16);
        sparseArray.put(5, defpackage.nug.b);
        sparseArray.put(6, defpackage.nug.b);
        sparseArray.put(12, defpackage.nug.b);
        sparseArray.put(14, defpackage.nug.b);
        sparseArray.put(3, defpackage.nug.b);
        sparseArray.put(0, defpackage.nug.m);
        sparseArray.put(2, defpackage.nug.d);
        sparseArray.put(4, defpackage.nug.a);
        sparseArray.put(7, defpackage.nug.a);
        sparseArray.put(2, defpackage.nug.d);
        sparseArray.put(8, defpackage.nug.c);
        sparseArray.put(9, defpackage.nug.c);
        sparseArray.put(10, defpackage.nug.c);
        sparseArray.put(15, defpackage.nug.c);
        sparseArray.put(13, defpackage.nug.h);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            sparseArray.put(20, defpackage.nug.j);
        }
        n = sparseArray;
        android.util.SparseArray sparseArray2 = new android.util.SparseArray(5);
        sparseArray2.put(1, defpackage.nug.i);
        sparseArray2.put(2, defpackage.nug.j);
        sparseArray2.put(3, defpackage.nug.j);
        sparseArray2.put(4, defpackage.nug.j);
        sparseArray2.put(5, defpackage.nug.j);
        o = sparseArray2;
    }

    public nua(android.content.Context context, defpackage.ntu ntuVar) {
        this.h = context;
        this.p = ntuVar;
        this.q = (android.telephony.TelephonyManager) context.getSystemService("phone");
        this.r = (android.net.ConnectivityManager) context.getSystemService("connectivity");
    }

    private final int r() {
        if (this.l == null) {
            return -1;
        }
        try {
            java.lang.Object objInvoke = android.telephony.SignalStrength.class.getMethod("getLevel", null).invoke(this.l, null);
            objInvoke.getClass();
            int iIntValue = ((java.lang.Integer) objInvoke).intValue();
            ((defpackage.yqj) a.l().ai(5445)).w("getLevelFallback got level: %d", iIntValue);
            return java.lang.Math.min(iIntValue, 4);
        } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.NoSuchMethodException | java.lang.SecurityException | java.lang.reflect.InvocationTargetException unused) {
            ((defpackage.yqj) a.l().ai((char) 5446)).u("getLevelFallback failed");
            return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01de  */
    /* JADX WARN: Code duplicated, block: B:174:0x02e2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.telephony.CellInfoCdma] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v23, types: [android.telephony.CellInfoCdma] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [android.telephony.CellInfo] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r16v0, types: [eqp, nua] */
    public final void a() {
        boolean z;
        defpackage.nug nugVar;
        android.os.PersistableBundle configForSubId;
        defpackage.nug nugVar2;
        android.telephony.TelephonyManager telephonyManager;
        java.util.List<android.telephony.CellInfo> allCellInfo;
        int level;
        ?? r13;
        int gsmSignalStrength;
        int iMin;
        int i;
        defpackage.wfp.c();
        android.telephony.SignalStrength signalStrength = this.l;
        int iMin2 = 4;
        if (signalStrength != null) {
            try {
                iMin2 = java.lang.Math.min(signalStrength.getLevel(), 4);
            } catch (java.lang.SecurityException unused) {
                ((defpackage.yqj) a.l().ai((char) 5441)).u("SecurityException getting signal level, returning unknown.");
                iMin2 = -1;
            }
        } else if (((defpackage.mds) defpackage.mkp.a.i(defpackage.mds.class)).s() && (allCellInfo = (telephonyManager = this.q).getAllCellInfo()) != null) {
            ?? r10 = 0;
            android.telephony.CellInfoLte cellInfoLte = null;
            android.telephony.CellInfoGsm cellInfoGsm = null;
            android.telephony.CellInfoWcdma cellInfoWcdma = null;
            for (android.telephony.CellInfo cellInfo : allCellInfo) {
                if (cellInfo != null && cellInfo.isRegistered()) {
                    defpackage.yqm yqmVar = a;
                    ((defpackage.yqj) yqmVar.l().ai((char) 5443)).y("CellInfo: %s", cellInfo);
                    if (cellInfo instanceof android.telephony.CellInfoCdma) {
                        r10 = (android.telephony.CellInfoCdma) cellInfo;
                    } else if (cellInfo instanceof android.telephony.CellInfoGsm) {
                        cellInfoGsm = (android.telephony.CellInfoGsm) cellInfo;
                    } else if (cellInfo instanceof android.telephony.CellInfoLte) {
                        cellInfoLte = (android.telephony.CellInfoLte) cellInfo;
                    } else if (cellInfo instanceof android.telephony.CellInfoWcdma) {
                        cellInfoWcdma = (android.telephony.CellInfoWcdma) cellInfo;
                    } else {
                        ((defpackage.yqj) yqmVar.l().ai((char) 5444)).y("Registered cellInfo is unrecognized type %s", cellInfo);
                    }
                }
            }
            if (!b() || r10 == 0) {
                if (cellInfoLte != null) {
                    level = cellInfoLte.getCellSignalStrength().getLevel();
                    r10 = cellInfoLte;
                } else {
                    level = 0;
                    r10 = 0;
                }
                if (level == 0 && cellInfoGsm != null) {
                    level = cellInfoGsm.getCellSignalStrength().getLevel();
                    r10 = cellInfoGsm;
                }
            } else {
                level = r10.getCellSignalStrength().getLevel();
            }
            if (level != 0) {
                r13 = r10;
            } else if (cellInfoWcdma != null) {
                level = cellInfoWcdma.getCellSignalStrength().getLevel();
            } else {
                level = 0;
                r13 = r10;
            }
            if (level == 0) {
                defpackage.yqm yqmVar2 = a;
                ((defpackage.yqj) yqmVar2.l().ai((char) 5442)).u("All registered cellinfo return SIGNAL_STRENGTH_NONE.Getting signal level through SignalStrength.");
                boolean zB = b();
                android.telephony.SignalStrength signalStrength2 = this.l;
                int i2 = 3;
                if (zB) {
                    if (signalStrength2 == null || signalStrength2.isGsm()) {
                        iMin = 0;
                    } else {
                        int cdmaDbm = this.l.getCdmaDbm();
                        int cdmaEcio = this.l.getCdmaEcio();
                        if (cdmaDbm >= -75) {
                            i = 4;
                        } else if (cdmaDbm >= -85) {
                            i = 3;
                        } else if (cdmaDbm >= -95) {
                            i = 2;
                        } else {
                            i = cdmaDbm >= -100 ? 1 : 0;
                        }
                        if (cdmaEcio >= -90) {
                            i2 = 4;
                        } else if (cdmaEcio < -110) {
                            i2 = cdmaEcio >= -130 ? 2 : cdmaEcio >= -150 ? 1 : 0;
                        }
                        iMin = java.lang.Math.min(i, i2);
                    }
                    ((defpackage.yqj) yqmVar2.l().ai(5440)).w("getCdmaLevel=%d", iMin);
                    level = iMin;
                } else {
                    if (signalStrength2 == null || !signalStrength2.isGsm() || (gsmSignalStrength = this.l.getGsmSignalStrength()) <= 2 || gsmSignalStrength == 99) {
                        i2 = 0;
                    } else if (gsmSignalStrength >= 12) {
                        i2 = 4;
                    } else if (gsmSignalStrength < 8) {
                        i2 = gsmSignalStrength >= 5 ? 2 : 1;
                    }
                    ((defpackage.yqj) yqmVar2.l().ai(5451)).w("getGsmLevel=%d", i2);
                    level = i2;
                }
            }
            r13 = cellInfoWcdma;
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                if (r13 == 0) {
                    ((defpackage.yqj) a.l().ai((char) 5454)).u("CellInfo that updates signal strength is null.");
                } else {
                    long millis = j$.time.Duration.ofNanos(r13.getTimeStamp()).toMillis();
                    defpackage.ojm.a();
                    if (android.os.SystemClock.elapsedRealtime() - millis > defpackage.acwy.a.fF().a()) {
                        ep$.ExternalSyntheticApiModelOutline0.m(telephonyManager, new java.util.concurrent.Executor() { // from class: ntv
                            @Override // java.util.concurrent.Executor
                            public final void execute(java.lang.Runnable runnable) {
                                hh$.ExternalSyntheticApiModelOutline0.m(this.a.h).execute(new defpackage.jpa(runnable, 15, null));
                            }
                        }, new defpackage.ntx(this));
                    }
                }
            }
            if (level <= 4) {
                iMin2 = level;
            }
        } else {
            iMin2 = r();
        }
        try {
            int dataState = this.q.getDataState();
            if (dataState != 2) {
                ((defpackage.yqj) a.l().ai(5455)).w("No data connection. The data state is %d", dataState);
                if (dataState == 2) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
        } catch (java.lang.SecurityException unused2) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5456)).u("Unable to get data state from phone. Checking connectivity manager.");
            z = this.j;
        }
        defpackage.nue nueVar = (defpackage.nue) e();
        defpackage.nug nugVar3 = nueVar != null ? nueVar.a : defpackage.nug.n;
        if (!z) {
            nugVar = defpackage.nug.n;
            if (nugVar3 != nugVar) {
                ((defpackage.yqj) a.l().ai((char) 5450)).w("Removing overlay, data is not connected: level = %d", iMin2);
            }
        } else if (iMin2 == -1) {
            nugVar = defpackage.nug.m;
            if (nugVar3 != nugVar) {
                ((defpackage.yqj) a.l().ai((char) 5449)).u("Removing overlay and cell signal icon: signal strength is unknown");
            }
        } else {
            int i3 = this.t;
            int i4 = android.os.Build.VERSION.SDK_INT;
            android.telephony.TelephonyManager telephonyManager2 = this.q;
            int networkType = i4 <= 29 ? telephonyManager2.getNetworkType() : ll$.ExternalSyntheticApiModelOutline0.m(telephonyManager2);
            this.t = networkType;
            boolean z2 = networkType != i3;
            defpackage.nug nugVar4 = (defpackage.nug) n.get(networkType, defpackage.nug.m);
            if (z2) {
                ((defpackage.yqj) a.l().ai(5448)).S("Data network type changed: %d (%s) -> %d (%s)", java.lang.Integer.valueOf(i3), nugVar3, java.lang.Integer.valueOf(this.t), nugVar4);
            }
            if (this.k) {
                if (z2 || nugVar3 != defpackage.nug.e) {
                    ((defpackage.yqj) a.l().ai((char) 5447)).y("Overlay would be %s, but current network is roaming.", nugVar4);
                }
                nugVar = defpackage.nug.e;
            } else {
                nugVar = defpackage.nug.h;
                if (nugVar4 == nugVar) {
                    defpackage.ntu ntuVar = this.p;
                    android.content.Context context = this.h;
                    if (((defpackage.mds) defpackage.mkp.a.i(defpackage.mds.class)).k()) {
                        android.telephony.CarrierConfigManager carrierConfigManager = (android.telephony.CarrierConfigManager) context.getSystemService(android.telephony.CarrierConfigManager.class);
                        carrierConfigManager.getClass();
                        configForSubId = carrierConfigManager.getConfigForSubId(ll$.ExternalSyntheticApiModelOutline0.m());
                    } else {
                        configForSubId = null;
                    }
                    nts ntsVar = new nts(ntuVar.a(ntt.a, configForSubId, context), ntuVar.a(ntt.b, configForSubId, context));
                    if (android.os.Build.VERSION.SDK_INT >= 30 && (nugVar2 = (defpackage.nug) o.get(this.m)) != null) {
                        if (nugVar2 != defpackage.nug.i) {
                            nugVar = nugVar2;
                        } else {
                            boolean z3 = ntsVar.b;
                            if (z3 && ntsVar.a) {
                                nugVar = defpackage.nug.f;
                            } else if (ntsVar.a) {
                                nugVar = defpackage.nug.g;
                            } else if (!z3) {
                                nugVar = nugVar2;
                            }
                        }
                        if (z2 || nugVar3 != nugVar) {
                            ((defpackage.yqj) a.l().ai((char) 5453)).M("Showing %s for LTE network due to override network type; %s", new defpackage.zkf(defpackage.zke.a, nugVar), ntsVar);
                        }
                    } else if (ntsVar.a) {
                        if (z2 || nugVar3 != defpackage.nug.f) {
                            ((defpackage.yqj) a.l().ai((char) 5452)).u("Showing 4G icon for LTE network due to carrier configuration");
                        }
                        nugVar = defpackage.nug.f;
                    }
                } else {
                    nugVar = nugVar4;
                }
            }
        }
        defpackage.nue nueVar2 = (defpackage.nue) e();
        defpackage.nue nueVar3 = new defpackage.nue(nugVar, iMin2, z);
        if (nueVar3.equals(nueVar2)) {
            return;
        }
        ((defpackage.yqj) a.l().ai((char) 5459)).M("value changed: %s -> %s", nueVar2, nueVar3);
        m(nueVar3);
    }

    public final boolean b() {
        android.telephony.SignalStrength signalStrength = this.l;
        return (signalStrength == null || signalStrength.isGsm()) ? false : true;
    }

    @Override // defpackage.eqp
    protected final void c() {
        this.r.registerNetworkCallback(new android.net.NetworkRequest.Builder().addTransportType(0).addCapability(12).build(), this.s);
        this.q.listen(this.u, android.os.Build.VERSION.SDK_INT >= 30 ? 1049057 : 481);
        a();
    }

    @Override // defpackage.eqp
    public final void d() {
        this.r.unregisterNetworkCallback(this.s);
        this.i = null;
        this.j = false;
        this.k = false;
        this.q.listen(this.u, 0);
    }
}
