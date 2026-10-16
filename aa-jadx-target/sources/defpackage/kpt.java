package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kpt implements defpackage.knh {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.ConnLoggerV2");
    private static final defpackage.yhx q = defpackage.yhx.r("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED", "android.hardware.usb.action.USB_STATE", "android.hardware.usb.action.USB_ACCESSORY_DETACHED");
    public final android.content.Context b;
    public final defpackage.zhw c;
    public final android.content.SharedPreferences d;
    public final java.util.concurrent.atomic.AtomicReference e;
    final java.util.concurrent.atomic.AtomicReference f;
    public long g;
    public defpackage.zhs h;
    public long i;
    public long j;
    public long k;
    public defpackage.zhs l;
    public final java.util.List m;
    public boolean n;
    public boolean o;
    public int p;
    private final java.util.concurrent.atomic.AtomicLong r;
    private volatile defpackage.zhs s;
    private defpackage.zhs t;
    private final java.util.Map u;
    private defpackage.zhs v;
    private final android.content.BroadcastReceiver w;
    private final defpackage.mbt x;

    public kpt(android.content.Context context) {
        defpackage.zhw zhwVarCg;
        defpackage.acpv acpvVar = defpackage.acpv.a;
        if (acpvVar.fF().r()) {
            zhwVarCg = defpackage.ysr.cg(java.util.concurrent.Executors.unconfigurableScheduledExecutorService(new defpackage.tev()));
            zhwVarCg.getClass();
        } else {
            zhwVarCg = defpackage.ysr.cg(java.util.concurrent.Executors.newSingleThreadScheduledExecutor());
        }
        this.e = new java.util.concurrent.atomic.AtomicReference();
        this.r = new java.util.concurrent.atomic.AtomicLong();
        this.f = new java.util.concurrent.atomic.AtomicReference();
        this.g = 0L;
        this.p = 1;
        this.l = new defpackage.zif();
        this.t = defpackage.zho.a;
        this.m = acpvVar.fF().l().b;
        this.u = new java.util.HashMap();
        this.w = new defpackage.kpr(this);
        this.b = context.getApplicationContext();
        this.c = zhwVarCg;
        this.d = ((defpackage.lbn) defpackage.mkp.a.i(defpackage.lbn.class)).a(context, "connectivity_logger_state");
        this.x = new defpackage.mbt(new defpackage.kpm(this, 0), new defpackage.kpm(context, 2));
        C();
    }

    public static final defpackage.zhs B() {
        return ((defpackage.oqy) defpackage.mkp.a.i(defpackage.oqy.class)).f(defpackage.mkp.a.d, new defpackage.kpn());
    }

    private final void C() {
        for (java.lang.Integer num : defpackage.acpv.a.fF().m().b) {
            num.intValue();
            this.u.put(num, 0);
        }
    }

    private final void D(boolean z) {
        x(new defpackage.jhc(this, z, 7));
    }

    private final void E(defpackage.kni kniVar) {
        this.e.set(kniVar);
        this.p = 2;
        defpackage.zhs zhsVar = this.h;
        if (zhsVar == null || zhsVar.isCancelled()) {
            long jC = defpackage.acpv.a.fF().c();
            defpackage.ojm.a();
            this.i = android.os.SystemClock.elapsedRealtime();
            this.h = this.c.scheduleAtFixedRate(new defpackage.jpa(this, 8, null), jC, jC, java.util.concurrent.TimeUnit.MILLISECONDS);
            this.o = false;
            this.n = false;
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            defpackage.duw.e(this.b, this.w, intentFilter, null, 2);
            w();
        }
    }

    private static boolean F(long j, long j2) {
        return j < 0 || j > j2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    private final void G(int i, j$.util.OptionalInt optionalInt, long j, int i2) throws wfo {
        java.lang.String strConcat;
        defpackage.wfp.b();
        if (this.s == null || (defpackage.acpv.a.fF().j().b.contains(java.lang.Integer.valueOf(i)) && this.s.isDone())) {
            defpackage.zhs zhsVarQ = q();
            defpackage.kpl kplVar = new defpackage.kpl(this, 0);
            defpackage.zhw zhwVar = this.c;
            int i3 = defpackage.zgh.c;
            defpackage.zgg zggVar = new defpackage.zgg(zhsVarQ, kplVar);
            zhsVarQ.c(zggVar, defpackage.ysr.ch(zhwVar, zggVar));
            this.s = zggVar;
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = this.e;
        int andIncrement = i2 == 1 ? ((defpackage.kni) atomicReference.get()).b.getAndIncrement() : ((defpackage.kni) atomicReference.get()).b.get();
        java.util.concurrent.atomic.AtomicReference atomicReference2 = this.e;
        java.util.UUID uuid = ((defpackage.kni) atomicReference2.get()).a;
        defpackage.yyn yynVarB = defpackage.yyn.b(i);
        java.lang.String strName = yynVarB != null ? yynVarB.name() : java.lang.String.valueOf(i);
        if (i2 == 1) {
            strConcat = "";
        } else {
            strConcat = "throttle ".concat(i2 != 2 ? "THROTTLE_LIMIT_EXCEEDED" : "THROTTLE_LIMIT_REACHED");
        }
        java.lang.String str = strConcat;
        defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(3348);
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(andIncrement);
        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
        yqjVar.U("Session %s, event %d, detail %s, %s, at %d %s", uuid, numValueOf, optionalInt, strName, lValueOf, str);
        defpackage.rri rriVar = new defpackage.rri();
        rriVar.b = defpackage.yzd.CONNECTIVITY;
        rriVar.a = defpackage.yyh.CONNECTIVITY_INFO;
        rriVar.d = i;
        byte b = rriVar.i;
        rriVar.i = (byte) (b | 1);
        rriVar.c = new defpackage.xys(uuid);
        rriVar.f = andIncrement;
        rriVar.i = (byte) (b | 3);
        defpackage.xyn xynVar = (defpackage.xyn) optionalInt.stream().mapToObj(new defpackage.kpk()).findAny().orElse(defpackage.xxe.a);
        if (xynVar == null) {
            throw new java.lang.NullPointerException("Null eventDetail");
        }
        rriVar.g = xynVar;
        long j2 = -1;
        if (j != -1) {
            rriVar.e = new defpackage.xys(lValueOf);
            j2 = j;
        }
        defpackage.rrj rrjVar = (defpackage.rrj) rriVar.l();
        j$.time.Duration durationOfMillis = j$.time.Duration.ofMillis(j2);
        java.util.UUID uuid2 = ((defpackage.kni) atomicReference2.get()).a;
        int i4 = rrjVar.b;
        defpackage.yyn yynVarB2 = defpackage.yyn.b(i4);
        if (yynVarB2 == null) {
            android.util.Log.w("GH.StartupPerfLogger", defpackage.a.bo(i4, "Unknown connection event type: "));
        } else {
            defpackage.tgu tguVar = defpackage.tgu.GEARHEAD_COLD_HU_SERVICE_DISCOVERY_COMPLETED;
            int iOrdinal = yynVarB2.ordinal();
            if (iOrdinal == 33) {
                defpackage.thf.g.f(defpackage.tgu.GEARHEAD_PROJECTION_MODE_STARTED, durationOfMillis, uuid2);
            } else if (iOrdinal == 60) {
                defpackage.thf.g.f(defpackage.tgu.GEARHEAD_WARM_STARTUP_STARTED, durationOfMillis, uuid2);
            } else if (iOrdinal != 63) {
                if (iOrdinal == 85) {
                    defpackage.thf.g.f(defpackage.tgu.GEARHEAD_PROJECTION_ENABLED, durationOfMillis, uuid2);
                } else if (iOrdinal == 117) {
                    defpackage.thf.g.f(defpackage.tgu.GEARHEAD_FRX_STARTED, durationOfMillis, uuid2);
                } else if (iOrdinal == 530) {
                    defpackage.thf.g.f(defpackage.tgu.GEARHEAD_WIRELESS_WARM_STARTUP_STARTED, durationOfMillis, uuid2);
                } else if (iOrdinal == 536) {
                    defpackage.thf.g.f(defpackage.tgu.GEARHEAD_WIRELESS_COLD_STARTUP_STARTED, durationOfMillis, uuid2);
                } else if (iOrdinal != 121) {
                    if (iOrdinal != 122) {
                        if (iOrdinal == 723) {
                            defpackage.thf.g.f(defpackage.tgu.GEARHEAD_WIRELESS_CONTROL_CHANNEL_CONNECT_ATTEMPT_RFCOMM, durationOfMillis, uuid2);
                        } else if (iOrdinal == 724) {
                            defpackage.thf.g.f(defpackage.tgu.GEARHEAD_WIRELESS_CONTROL_CHANNEL_CONNECT_ATTEMPT_TCP, durationOfMillis, uuid2);
                        } else if (iOrdinal == 738) {
                            defpackage.thf.g.f(defpackage.tgu.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_RFCOMM, durationOfMillis, uuid2);
                        } else if (iOrdinal == 739) {
                            defpackage.thf.g.f(defpackage.tgu.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_TCP, durationOfMillis, uuid2);
                        } else if (iOrdinal == 742) {
                            defpackage.thf.g.f(defpackage.tgu.GEARHEAD_WIRELESS_VERSION_REQUEST_RECEIVED_RFCOMM, durationOfMillis, uuid2);
                        } else if (iOrdinal != 743) {
                            switch (iOrdinal) {
                                case 141:
                                case 142:
                                    defpackage.thf.g.f(defpackage.tgu.PROJECTION_STARTED_USB, durationOfMillis, uuid2);
                                    break;
                                case 143:
                                    defpackage.thf.g.f(defpackage.tgu.PROJECTION_STARTED_WIRELESS, durationOfMillis, uuid2);
                                    break;
                                default:
                                    switch (iOrdinal) {
                                        case 625:
                                            defpackage.thf.g.f(defpackage.tgu.GEARHEAD_COLD_STARTUP_STARTED, durationOfMillis, uuid2);
                                            break;
                                        case 626:
                                            defpackage.thf.g.f(defpackage.tgu.GEARHEAD_FACET_BAR_FIRST_RESUME, durationOfMillis, uuid2);
                                            break;
                                        case 627:
                                            defpackage.thf.g.f(defpackage.tgu.GEARHEAD_CAR_SERVICE_VIDEO_FOCUS_GAINED, durationOfMillis, uuid2);
                                            break;
                                        case 628:
                                            defpackage.thf.g.f(defpackage.tgu.PROJECTION_LIFECYCLE_LISTENER_ON_PROJECTION_START, durationOfMillis, uuid2);
                                            break;
                                        case 629:
                                            defpackage.thf.g.f(defpackage.tgu.PRIMARY_REGION_FIRST_CAR_ACTIVITY_RESUME, durationOfMillis, uuid2);
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            defpackage.thf.g.f(defpackage.tgu.GEARHEAD_WIRELESS_VERSION_REQUEST_RECEIVED_TCP, durationOfMillis, uuid2);
                        }
                    } else if (defpackage.acvt.a.fF().n()) {
                        defpackage.thf.g.f(defpackage.tgu.GEARHEAD_PREFLIGHT_COMPLETED, durationOfMillis, uuid2);
                    }
                } else if (defpackage.acvt.a.fF().n()) {
                    defpackage.thf.g.f(defpackage.tgu.GEARHEAD_PREFLIGHT_STARTED, durationOfMillis, uuid2);
                }
            } else if ("perfgate".equals(defpackage.acvt.a.fF().e())) {
                defpackage.thf.g.f(defpackage.tgu.GEARHEAD_WARM_STARTUP_STARTED, durationOfMillis, uuid2);
            }
        }
        this.s.getClass();
        defpackage.zhs zhsVar = this.s;
        zhsVar.c(new defpackage.zhi(zhsVar, new defpackage.kpq(this, rriVar, j2, i2)), this.c);
    }

    public static long p() {
        defpackage.ojm.a();
        return android.os.SystemClock.elapsedRealtime();
    }

    public static java.util.UUID r(defpackage.kni kniVar) {
        if (kniVar != null) {
            return kniVar.a;
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Type inference failed for: r1v28, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [android.content.SharedPreferences, java.lang.Object] */
    final void A(int i, long j) throws wfo {
        int i2;
        long j2;
        defpackage.wfp.b();
        long jH = defpackage.acpv.a.fF().h();
        int i3 = this.p;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 == 0) {
            android.content.SharedPreferences sharedPreferences = this.d;
            if (sharedPreferences.contains("drive_id_high_bits") && sharedPreferences.contains("drive_id_low_bits") && sharedPreferences.contains("session_start_time_ms") && sharedPreferences.contains("event_index")) {
                long j3 = sharedPreferences.getLong("last_event_time_ms", -1L);
                i2 = 1;
                if (F(j - j3, jH)) {
                    ((defpackage.yqj) a.l().ai(3346)).G("Cannot revive session: last event time = %d, current event time = %d", j3, j);
                    j2 = j;
                } else {
                    j2 = j;
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    long j4 = sharedPreferences.getLong("last_saved_time_ms", -1L);
                    if (F(jCurrentTimeMillis - j4, jH)) {
                        ((defpackage.yqj) a.l().ai(3345)).G("Cannot revive session: last saved time = %d, current time = %d", j4, jCurrentTimeMillis);
                    } else {
                        long j5 = sharedPreferences.getLong("drive_id_high_bits", 0L);
                        long j6 = sharedPreferences.getLong("drive_id_low_bits", 0L);
                        long j7 = sharedPreferences.getLong("session_start_time_ms", -1L);
                        int i5 = sharedPreferences.getInt("event_index", -1);
                        if (j5 != 0 && j6 != 0 && j7 >= 0 && i5 >= 0) {
                            defpackage.kni kniVar = new defpackage.kni(new java.util.UUID(j5, j6), new java.util.concurrent.atomic.AtomicInteger(i5), j7);
                            E(kniVar);
                            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(3361)).R("Revived session %s, start time = %d, event index = %d", kniVar.a, java.lang.Long.valueOf(kniVar.c), java.lang.Integer.valueOf(kniVar.b.get()));
                            t(defpackage.yyn.SESSION_REVIVED);
                            return;
                        }
                        ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(3360)).S("Bad saved session: high bits = %d, low bits = %d, start time = %d, event index = %d", java.lang.Long.valueOf(j5), java.lang.Long.valueOf(j6), java.lang.Long.valueOf(j7), java.lang.Integer.valueOf(i5));
                    }
                }
            } else {
                i2 = 1;
                j2 = j;
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 3344)).u("Saved session not found in SharedPreferences");
            }
        } else {
            if (i4 == 1) {
                return;
            }
            if (i4 == 2) {
                if (this.m.contains(java.lang.Integer.valueOf(i))) {
                    ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3367)).w("Would have extended the session, but event type %d is non-extending", i);
                    return;
                }
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(3366)).y("Resumed session %s", ((defpackage.kni) this.e.get()).a);
                t(defpackage.yyn.SESSION_RESUMED);
                this.p = 2;
                return;
            }
            if (i4 == 3) {
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3368)).u("Session expired, will start a new session");
            }
            i2 = 1;
            j2 = j;
        }
        defpackage.kni kniVar2 = new defpackage.kni(((defpackage.lbn) defpackage.mkp.a.i(defpackage.lbn.class)).d(), new java.util.concurrent.atomic.AtomicInteger(0), j2);
        E(kniVar2);
        defpackage.mbt mbtVar = this.x;
        defpackage.xzd xzdVarF = defpackage.xzd.d(",").b().f();
        ?? r6 = mbtVar.a;
        java.util.List listI = xzdVarF.i(r6.getString("drive_session_info_key", ""));
        java.util.UUID uuid = kniVar2.a;
        java.lang.Long lValueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = uuid;
        objArr[i2] = lValueOf;
        java.lang.String[] strArr = {java.lang.String.format("%s/%d", objArr)};
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ysr.O(i2));
        java.util.Collections.addAll(arrayList, strArr);
        arrayList.addAll(listI);
        r6.edit().putString("drive_session_info_key", new defpackage.xyj(",").b(defpackage.ysr.ak(arrayList, 10))).apply();
        ?? r1 = mbtVar.b;
        if (r1 != 0) {
            r1.edit().putString("connectivity_lifetime_id", uuid.toString()).apply();
        }
        defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(3365);
        long j8 = kniVar2.c;
        yqjVar.L("Started session %s, start time = %d", uuid, j8);
        v(defpackage.yyn.SESSION_STARTED, j$.util.OptionalInt.empty(), j8);
    }

    @Override // defpackage.knh
    public final void a(boolean z, boolean z2) {
        long jP = p();
        g(defpackage.yyn.ANDROID_AUTO_BLUETOOTH_CONNECTED, j$.util.OptionalInt.empty(), jP);
        if (z2) {
            g(defpackage.yyn.ANDROID_AUTO_WIRELESS_CAPABLE_BLUETOOTH_CONNECTED, j$.util.OptionalInt.empty(), jP);
        }
        if (z) {
            g(defpackage.yyn.ANDROID_AUTO_DONGLE_CONNECTED, j$.util.OptionalInt.empty(), jP);
        }
        x(new kpp(this, z, jP));
    }

    @Override // defpackage.knh
    public final void b() {
        defpackage.ypu ypuVarF = a.f();
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f;
        ((defpackage.yqj) ((defpackage.yqj) ypuVarF).ai((char) 3347)).y("Clear current plugbot callback (asBinder: %s).", ((mki) atomicReference.get()).asBinder());
        atomicReference.set(null);
    }

    @Override // defpackage.knh
    public final void c(android.content.Intent intent) {
        defpackage.ysr.aY(q.contains(intent.getAction()), "not allowed connectivity logger intent");
        x(new defpackage.jpa(this, 10, null));
    }

    @Override // defpackage.knh
    public final void d(defpackage.yyn yynVar) {
        e(yynVar, j$.util.OptionalInt.empty());
    }

    @Override // defpackage.knh
    public final void e(defpackage.yyn yynVar, j$.util.OptionalInt optionalInt) {
        g(yynVar, optionalInt, p());
    }

    @Override // defpackage.knh
    public final void f(final int i, final j$.util.OptionalInt optionalInt, long j) {
        if (j <= 0) {
            defpackage.ojm.a();
            j = android.os.SystemClock.elapsedRealtime();
        }
        final long j2 = j;
        this.r.getAndSet(j2);
        x(new java.lang.Runnable() { // from class: kpj
            /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
            @Override // java.lang.Runnable
            public final void run() throws wfo {
                defpackage.kpt kptVar = this.a;
                java.util.List list = kptVar.m;
                int i2 = i;
                if (!list.contains(java.lang.Integer.valueOf(i2))) {
                    kptVar.g++;
                    defpackage.ojm.a();
                    kptVar.k = android.os.SystemClock.elapsedRealtime();
                }
                j$.util.OptionalInt optionalInt2 = optionalInt;
                long j3 = j2;
                kptVar.A(i2, j3);
                kptVar.u(i2, optionalInt2, j3);
            }
        });
    }

    @Override // defpackage.knh
    public final void g(defpackage.yyn yynVar, j$.util.OptionalInt optionalInt, long j) {
        yynVar.getClass();
        f(yynVar.pE, optionalInt, j);
    }

    @Override // defpackage.knh
    public final void h() {
        D(false);
    }

    @Override // defpackage.knh
    public final void i(java.lang.String str, java.lang.String str2) {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3358)).u("Projection started");
        D(true);
        if (str2 == null || str == null || j$.util.Objects.equals(str2, str) || !defpackage.mpr.f().b().c(str, defpackage.sds.a)) {
            return;
        }
        d(defpackage.yyn.ANDROID_AUTO_USB_CAPABILITY_VIA_DONGLE_REGISTERED);
    }

    @Override // defpackage.knh
    public final int j() {
        return this.p;
    }

    @Override // defpackage.knh
    public final void k(int i, int i2, yyp yypVar, long j) {
        this.r.getAndSet(j);
        x(new kpi(this, j, i, i2, yypVar));
    }

    @Override // defpackage.knh
    public final void l(mki mkiVar) {
        mkiVar.getClass();
        this.f.set(mkiVar);
    }

    @Override // defpackage.knh
    public final void m(mki mkiVar) {
        mkiVar.getClass();
        this.f.set(null);
    }

    @Override // defpackage.knh
    public final void n(mki mkiVar) {
        mkiVar.getClass();
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3364)).y("Set plugbot callback (asBinder: %s) to connectivity logger.", mkiVar.asBinder());
        this.f.set(mkiVar);
    }

    @Override // defpackage.knh
    public final void o(defpackage.mmi mmiVar) {
        x(new defpackage.jpa(mmiVar, 11, null));
    }

    public final defpackage.zhs q() {
        if (!((defpackage.mds) defpackage.mkp.a.i(defpackage.mds.class)).g()) {
            return new defpackage.zho(java.lang.Boolean.FALSE);
        }
        defpackage.zhs zhsVar = this.v;
        if (zhsVar != null && !zhsVar.isDone()) {
            return this.v;
        }
        if (android.bluetooth.BluetoothAdapter.getDefaultAdapter() == null) {
            return new defpackage.zho(java.lang.Boolean.FALSE);
        }
        defpackage.zhs zhsVarB = B();
        defpackage.kpo kpoVar = new defpackage.kpo(0);
        defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
        int i = defpackage.zgh.c;
        defpackage.zgg zggVar = new defpackage.zgg(zhsVarB, kpoVar);
        zhsVarB.c(zggVar, defpackage.ysr.ch(zgtVar, zggVar));
        this.v = zggVar;
        return zggVar;
    }

    public final void s() {
        C();
        this.h.cancel(false);
        android.content.Context context = this.b;
        defpackage.eth.a(context).d(new android.content.Intent("com.google.android.apps.auto.components.connectivity.ACTION_SESSION_EXPIRED"));
        this.l.cancel(false);
        this.t.cancel(false);
        context.unregisterReceiver(this.w);
        this.p = 4;
        this.e.set(null);
    }

    public final void t(defpackage.yyn yynVar) {
        v(yynVar, j$.util.OptionalInt.empty(), p());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void u(int i, j$.util.OptionalInt optionalInt, long j) throws wfo {
        int i2;
        defpackage.kpt kptVar;
        long j2;
        defpackage.wfp.b();
        defpackage.wfp.b();
        defpackage.abpf abpfVar = defpackage.acpv.a.fF().i().b;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        int i3 = 3;
        if (!abpfVar.contains(numValueOf)) {
            java.util.Map map = this.u;
            if (map.containsKey(numValueOf)) {
                int iIntValue = ((java.lang.Integer) map.get(numValueOf)).intValue();
                long j3 = iIntValue;
                long jE = defpackage.acpv.e();
                if (j3 == jE) {
                    i3 = 2;
                } else if (j3 <= jE) {
                    i3 = 1;
                }
                map.put(numValueOf, java.lang.Integer.valueOf(iIntValue + 1));
            } else {
                i3 = 1;
            }
        }
        if (i3 == 2) {
            kptVar = this;
            j2 = j;
            kptVar.G(4206, j$.util.OptionalInt.of(i), j2, 1);
            i2 = 2;
        } else {
            i2 = i3;
            kptVar = this;
            j2 = j;
        }
        kptVar.G(i, optionalInt, j2, i2);
    }

    public final void v(defpackage.yyn yynVar, j$.util.OptionalInt optionalInt, long j) {
        u(yynVar.pE, optionalInt, j);
    }

    public final void w() {
        this.t.cancel(false);
        this.t = this.c.schedule(new defpackage.jpa(this, 9, null), defpackage.acpv.a.fF().b(), java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    final void x(java.lang.Runnable runnable) {
        this.c.execute(runnable);
    }

    public final boolean y() {
        android.hardware.usb.UsbAccessory[] accessoryList;
        android.hardware.usb.UsbManager usbManager = (android.hardware.usb.UsbManager) this.b.getSystemService("usb");
        if (usbManager != null && (accessoryList = usbManager.getAccessoryList()) != null) {
            for (android.hardware.usb.UsbAccessory usbAccessory : accessoryList) {
                if (usbAccessory != null && ("Android Auto".equals(usbAccessory.getModel()) || "Android Open Automotive Protocol".equals(usbAccessory.getModel()))) {
                    return true;
                }
            }
        }
        return false;
    }

    final void z(defpackage.rrj rrjVar, long j, int i) {
        if (i == 1) {
            ((defpackage.oim) defpackage.mkp.a.i(defpackage.oim.class)).d(rrjVar);
        }
        int i2 = rrjVar.b;
        if (i2 != defpackage.yyn.SESSION_EXPIRED.pE && i2 != defpackage.yyn.SESSION_OBSOLETE.pE) {
            defpackage.kni kniVar = (defpackage.kni) this.e.get();
            if (j$.util.Objects.equals(kniVar != null ? kniVar.a : null, rrjVar.a.e())) {
                android.content.SharedPreferences sharedPreferences = this.d;
                java.util.UUID uuid = kniVar.a;
                android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putLong("drive_id_high_bits", uuid.getMostSignificantBits());
                editorEdit.putLong("drive_id_low_bits", uuid.getLeastSignificantBits());
                editorEdit.putInt("event_index", kniVar.b.get());
                editorEdit.putLong("last_event_time_ms", j);
                editorEdit.putLong("last_saved_time_ms", java.lang.System.currentTimeMillis());
                editorEdit.putLong("session_start_time_ms", kniVar.c);
                editorEdit.apply();
            } else {
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3362)).u("dropped saving session id as it's obsolete");
            }
        }
        mki mkiVar = (mki) this.f.get();
        if (mkiVar == null) {
            return;
        }
        defpackage.yyn yynVarB = defpackage.yyn.b(i2);
        java.lang.String strName = yynVarB != null ? yynVarB.name() : java.lang.String.valueOf(rrjVar);
        defpackage.yhv yhvVar = new defpackage.yhv();
        yhvVar.k(acwg.b().b);
        yhvVar.k(acwg.c().b);
        yhvVar.k(acwg.d().b);
        if (yhvVar.g().contains(java.lang.Integer.valueOf(i2))) {
            try {
                android.os.Parcel parcelFp = mkiVar.fp();
                parcelFp.writeString(strName);
                mkiVar.fr(2, parcelFp);
            } catch (android.os.RemoteException unused) {
                ((defpackage.yqj) a.l().ai((char) 3363)).u("Remote gone, removing callback.");
                this.f.set(null);
            }
        }
    }
}
