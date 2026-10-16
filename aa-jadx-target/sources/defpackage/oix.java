package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oix implements defpackage.oiq {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.TelemetryManager");
    public final android.content.Context b;
    java.util.UUID c;
    private final com.google.android.gms.car.CarInfo d;
    private final android.location.LocationManager e;
    private final java.util.concurrent.atomic.AtomicReference f = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference g;
    private final java.util.concurrent.atomic.AtomicReference h;
    private final java.lang.Object i;
    private final defpackage.ylx j;
    private final java.util.List k;
    private volatile java.util.UUID l;
    private j$.util.OptionalLong m;
    private final defpackage.oiw n;
    private final defpackage.rqy o;
    private final defpackage.xzi p;
    private final defpackage.xzi q;

    public oix() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        this.g = atomicReference;
        this.h = new java.util.concurrent.atomic.AtomicReference(defpackage.zbe.NO_FACET);
        this.i = new java.lang.Object();
        this.j = new defpackage.ygf(null);
        this.k = new java.util.ArrayList();
        this.m = j$.util.OptionalLong.empty();
        this.p = defpackage.ysr.aQ(new defpackage.imy(12));
        this.q = defpackage.ysr.aQ(new defpackage.imy(13));
        defpackage.mkp mkpVar = defpackage.mkp.a;
        android.content.Context context = mkpVar.c;
        this.b = context;
        this.c = ((defpackage.lbn) mkpVar.i(defpackage.lbn.class)).d();
        com.google.android.gms.car.CarInfo carInfo = new com.google.android.gms.car.CarInfo();
        this.d = carInfo;
        carInfo.a = "PhoneOnly";
        carInfo.b = "PhoneOnly";
        atomicReference.set(carInfo);
        this.e = (android.location.LocationManager) context.getSystemService("location");
        this.n = (defpackage.oiw) new defpackage.nub((java.lang.Object) null).h(new defpackage.kpe(this, 3));
        this.o = new defpackage.rqy();
    }

    public static j$.util.Optional g(java.lang.String str) {
        try {
            for (android.content.pm.PackageInfo packageInfo : defpackage.mkp.a.c.getPackageManager().getInstalledPackages(1073741824)) {
                if (packageInfo.packageName.matches(str)) {
                    return j$.util.Optional.of(java.lang.Long.valueOf(hh$.ExternalSyntheticApiModelOutline0.m(packageInfo)));
                }
            }
            return j$.util.Optional.empty();
        } catch (java.lang.IllegalStateException | java.lang.NullPointerException | java.lang.SecurityException unused) {
            return j$.util.Optional.empty();
        }
    }

    private final void h(com.google.android.apps.auto.components.telemetry.TelemetryEvent telemetryEvent, defpackage.zbd zbdVar) {
        if (telemetryEvent.a == defpackage.yyh.UI) {
            defpackage.zbg zbgVar = telemetryEvent.b.o;
            if (zbgVar == null) {
                zbgVar = defpackage.zbg.a;
            }
            if (zbgVar.d == defpackage.zbe.PHONE_CALL.he) {
                defpackage.zbg zbgVar2 = telemetryEvent.b.o;
                if (zbgVar2 == null) {
                    zbgVar2 = defpackage.zbg.a;
                }
                if (zbgVar2.e != zbdVar.a()) {
                    return;
                }
                if (!zbdVar.equals(defpackage.zbd.Dt)) {
                    j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(this.l);
                    if (true == optionalOfNullable.isPresent()) {
                        java.util.UUID uuid = (java.util.UUID) optionalOfNullable.get();
                        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5989)).y("phone call session ended. id = %s", new defpackage.zkf(defpackage.zke.a, uuid));
                    }
                    this.l = null;
                    return;
                }
                this.l = ((defpackage.lbn) defpackage.mkp.a.i(defpackage.lbn.class)).d();
                j$.util.Optional optionalOfNullable2 = j$.util.Optional.ofNullable(this.l);
                if (true == optionalOfNullable2.isPresent()) {
                    java.util.UUID uuid2 = (java.util.UUID) optionalOfNullable2.get();
                    ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5988)).y("phone call session started. id = %s", new defpackage.zkf(defpackage.zke.a, uuid2));
                }
            }
        }
    }

    private final void i(com.google.android.apps.auto.components.telemetry.TelemetryEvent telemetryEvent, defpackage.zaa zaaVar) {
        j$.util.OptionalLong optionalLongEmpty;
        if (telemetryEvent.a == defpackage.yyh.NON_UI) {
            defpackage.zae zaeVar = telemetryEvent.b.p;
            if (zaeVar == null) {
                zaeVar = defpackage.zae.a;
            }
            if (zaeVar.c == 7) {
                defpackage.zae zaeVar2 = telemetryEvent.b.p;
                if (zaeVar2 == null) {
                    zaeVar2 = defpackage.zae.a;
                }
                if (zaeVar2.d != zaaVar.fI) {
                    return;
                }
                if (zaaVar == defpackage.zaa.LIFETIME_START) {
                    defpackage.ojm.a();
                    optionalLongEmpty = j$.util.OptionalLong.of(android.os.SystemClock.elapsedRealtime());
                } else {
                    optionalLongEmpty = j$.util.OptionalLong.empty();
                }
                int iAo = defpackage.a.ao(telemetryEvent.b.A);
                if (iAo == 0) {
                    throw null;
                }
                int i = iAo - 1;
                if (i != 0) {
                    if (i != 1) {
                        defpackage.rox.o("GH.TelemetryManager", "Unexpected application mode", new java.lang.Object[0]);
                    } else {
                        this.c = ((defpackage.lbn) defpackage.mkp.a.i(defpackage.lbn.class)).d();
                        this.m = optionalLongEmpty;
                    }
                }
            }
        }
    }

    @Override // defpackage.oiq
    public final j$.util.OptionalLong a() {
        return this.m;
    }

    @Override // defpackage.oiq
    public final void b() {
        this.n.a.b();
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0463  */
    @Override // defpackage.oiq
    public final void c(com.google.android.apps.auto.components.telemetry.TelemetryEvent telemetryEvent) {
        java.util.ArrayList arrayList;
        java.util.UUID uuid;
        java.util.ArrayList arrayList2;
        defpackage.yyg yygVar;
        defpackage.yyg yygVar2;
        java.lang.String str;
        com.google.android.gms.car.CarInfo carInfo;
        android.location.LocationManager locationManager;
        android.location.Location lastKnownLocation;
        java.util.UUID uuid2;
        telemetryEvent.getClass();
        synchronized (this.i) {
            arrayList = new java.util.ArrayList(((defpackage.yde) this.j).c(telemetryEvent.a));
        }
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ((oip) arrayList.get(i2)).a(telemetryEvent);
        }
        defpackage.abor aborVarK = telemetryEvent.b.K();
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f;
        defpackage.yzo yzoVar = (defpackage.yzo) atomicReference.get();
        if (yzoVar == null) {
            defpackage.abor aborVarN = defpackage.yzo.a.n();
            defpackage.yqm yqmVar = defpackage.lfr.a;
            defpackage.lfr lfrVar = (defpackage.lfr) defpackage.mkp.a.i(defpackage.lfr.class);
            int iA = lfrVar.d.a(lfrVar.b);
            aborVarN.t();
            defpackage.yzo yzoVar2 = (defpackage.yzo) aborVarN.b;
            yzoVar2.b |= 1;
            yzoVar2.c = iA;
            boolean zG = ((defpackage.lfr) defpackage.mkp.a.i(defpackage.lfr.class)).g();
            aborVarN.t();
            defpackage.yzo yzoVar3 = (defpackage.yzo) aborVarN.b;
            yzoVar3.b |= 2;
            yzoVar3.d = zG;
            int iA2 = (int) defpackage.acxb.a.fF().a();
            aborVarN.t();
            defpackage.yzo yzoVar4 = (defpackage.yzo) aborVarN.b;
            yzoVar4.b |= 4;
            yzoVar4.e = iA2;
            yzoVar = (defpackage.yzo) aborVarN.q();
            defpackage.a.o(atomicReference, yzoVar);
        }
        aborVarK.t();
        defpackage.yyg yygVar3 = (defpackage.yyg) aborVarK.b;
        yzoVar.getClass();
        yygVar3.Q = yzoVar;
        yygVar3.c |= 131072;
        i(telemetryEvent, defpackage.zaa.LIFETIME_START);
        h(telemetryEvent, defpackage.zbd.Dt);
        defpackage.yyh yyhVar = telemetryEvent.a;
        defpackage.yyh yyhVar2 = defpackage.yyh.UI;
        if (yyhVar == yyhVar2) {
            defpackage.zbg zbgVar = ((defpackage.yyg) aborVarK.b).o;
            if (zbgVar == null) {
                zbgVar = defpackage.zbg.a;
            }
            int i3 = zbgVar.e;
            if (i3 == 6 || i3 == 1) {
                defpackage.zbg zbgVar2 = ((defpackage.yyg) aborVarK.b).o;
                if (zbgVar2 == null) {
                    zbgVar2 = defpackage.zbg.a;
                }
                defpackage.zbe zbeVarB = defpackage.zbe.b(zbgVar2.d);
                java.util.concurrent.atomic.AtomicReference atomicReference2 = this.h;
                zbeVarB.getClass();
                if (atomicReference2.getAndSet(zbeVarB) == zbeVarB) {
                    return;
                }
            }
            defpackage.zbg zbgVar3 = ((defpackage.yyg) aborVarK.b).o;
            if (zbgVar3 == null) {
                zbgVar3 = defpackage.zbg.a;
            }
            java.util.concurrent.atomic.AtomicReference atomicReference3 = this.h;
            defpackage.abor aborVarK2 = zbgVar3.K();
            int i4 = ((defpackage.zbe) atomicReference3.get()).he;
            aborVarK2.t();
            defpackage.zbg zbgVar4 = (defpackage.zbg) aborVarK2.b;
            zbgVar4.b |= 16;
            zbgVar4.h = i4;
            defpackage.zbg zbgVar5 = (defpackage.zbg) aborVarK2.q();
            aborVarK.t();
            defpackage.yyg yygVar4 = (defpackage.yyg) aborVarK.b;
            zbgVar5.getClass();
            yygVar4.o = zbgVar5;
            yygVar4.b |= 4096;
        }
        defpackage.yyh yyhVar3 = telemetryEvent.a;
        if (yyhVar3 == yyhVar2 || yyhVar3 == defpackage.yyh.NON_UI) {
            j$.util.OptionalLong optionalLongEmpty = ((defpackage.yyg) aborVarK.b).A == 1 ? this.m : j$.util.OptionalLong.empty();
            if (optionalLongEmpty.isPresent()) {
                defpackage.ojm.a();
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - optionalLongEmpty.getAsLong();
                aborVarK.t();
                defpackage.yyg yygVar5 = (defpackage.yyg) aborVarK.b;
                yygVar5.c |= 1;
                yygVar5.F = jElapsedRealtime;
            }
        }
        if (telemetryEvent.d == 1 && (uuid2 = this.c) != null) {
            defpackage.zao zaoVarL = defpackage.acmj.l(uuid2);
            aborVarK.t();
            defpackage.yyg yygVar6 = (defpackage.yyg) aborVarK.b;
            zaoVarL.getClass();
            yygVar6.J = zaoVarL;
            yygVar6.c |= 1024;
        }
        int iAo = defpackage.a.ao(((defpackage.yyg) aborVarK.b).A);
        if (iAo == 0) {
            throw null;
        }
        int i5 = iAo - 1;
        if (i5 == 0) {
            uuid = null;
        } else if (i5 != 1) {
            defpackage.rox.o("GH.TelemetryManager", "Unexpected application mode", new java.lang.Object[0]);
            uuid = null;
        } else {
            uuid = this.c;
        }
        if (uuid != null) {
            defpackage.zao zaoVarL2 = defpackage.acmj.l(uuid);
            aborVarK.t();
            defpackage.yyg yygVar7 = (defpackage.yyg) aborVarK.b;
            zaoVarL2.getClass();
            yygVar7.C = zaoVarL2;
            yygVar7.b |= 536870912;
        }
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(this.l);
        defpackage.imv imvVar = new defpackage.imv(aborVarK, 8);
        if (true == optionalOfNullable.isPresent()) {
            java.lang.Object obj = optionalOfNullable.get();
            java.lang.Object obj2 = imvVar.a;
            defpackage.zao zaoVarL3 = defpackage.acmj.l((java.util.UUID) obj);
            defpackage.abor aborVar = (defpackage.abor) obj2;
            aborVar.t();
            defpackage.yyg yygVar8 = (defpackage.yyg) aborVar.b;
            zaoVarL3.getClass();
            yygVar8.ag = zaoVarL3;
            yygVar8.d |= 32;
        }
        if (((defpackage.mds) defpackage.mkp.a.i(defpackage.mds.class)).s() && (locationManager = this.e) != null && (lastKnownLocation = locationManager.getLastKnownLocation("gps")) != null && lastKnownLocation.hasSpeed() && android.os.SystemClock.elapsedRealtimeNanos() - lastKnownLocation.getElapsedRealtimeNanos() <= 10000000000L) {
            lastKnownLocation.getSpeed();
            if (lastKnownLocation.hasSpeed()) {
                float speed = lastKnownLocation.getSpeed() * 1000.0f;
                aborVarK.t();
                defpackage.yyg yygVar9 = (defpackage.yyg) aborVarK.b;
                yygVar9.b |= 1073741824;
                yygVar9.D = (int) speed;
            }
        }
        if ((((defpackage.yyg) aborVarK.b).b & 67108864) == 0) {
            aborVarK.t();
            defpackage.yyg yygVar10 = (defpackage.yyg) aborVarK.b;
            yygVar10.b |= 67108864;
            yygVar10.A = 0;
        }
        if (((defpackage.mds) defpackage.mkp.a.i(defpackage.mds.class)).k()) {
            boolean z = ((android.telephony.TelephonyManager) this.b.getSystemService("phone")).getCallState() != 0;
            aborVarK.t();
            defpackage.yyg yygVar11 = (defpackage.yyg) aborVarK.b;
            yygVar11.c |= 8192;
            yygVar11.M = z;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29 && (((defpackage.yyg) aborVarK.b).c & 512) != 0) {
            defpackage.abpf abpfVar = defpackage.acpv.a.fF().k().b;
            defpackage.yyr yyrVar = ((defpackage.yyg) aborVarK.b).I;
            if (yyrVar == null) {
                yyrVar = defpackage.yyr.a;
            }
            if (abpfVar.contains(java.lang.Integer.valueOf((int) yyrVar.c))) {
                defpackage.yza yzaVar = defpackage.yza.a;
                defpackage.abor aborVarN2 = yzaVar.n();
                j$.util.Optional optional = (j$.util.Optional) this.p.fF();
                aborVarN2.getClass();
                defpackage.imv imvVar2 = new defpackage.imv(aborVarN2, 9);
                if (true == optional.isPresent()) {
                    java.lang.Object obj3 = optional.get();
                    java.lang.Object obj4 = imvVar2.a;
                    long jLongValue = ((java.lang.Long) obj3).longValue();
                    defpackage.abor aborVar2 = (defpackage.abor) obj4;
                    aborVar2.t();
                    defpackage.yza yzaVar2 = (defpackage.yza) aborVar2.b;
                    yzaVar2.b |= 1;
                    yzaVar2.c = jLongValue;
                }
                j$.util.Optional optional2 = (j$.util.Optional) this.q.fF();
                defpackage.imv imvVar3 = new defpackage.imv(aborVarN2, 10);
                if (true == optional2.isPresent()) {
                    java.lang.Object obj5 = optional2.get();
                    java.lang.Object obj6 = imvVar3.a;
                    long jLongValue2 = ((java.lang.Long) obj5).longValue();
                    defpackage.abor aborVar3 = (defpackage.abor) obj6;
                    aborVar3.t();
                    defpackage.yza yzaVar3 = (defpackage.yza) aborVar3.b;
                    yzaVar3.b |= 2;
                    yzaVar3.d = jLongValue2;
                }
                if (!((defpackage.yza) aborVarN2.q()).equals(yzaVar)) {
                    aborVarK.t();
                    defpackage.yyg yygVar12 = (defpackage.yyg) aborVarK.b;
                    defpackage.yza yzaVar4 = (defpackage.yza) aborVarN2.q();
                    yzaVar4.getClass();
                    yygVar12.ai = yzaVar4;
                    yygVar12.d |= 512;
                }
            }
        }
        telemetryEvent.b = (defpackage.yyg) aborVarK.q();
        this.o.a(telemetryEvent.a, telemetryEvent.b);
        if (telemetryEvent.a == defpackage.yyh.UNKNOWN_EVENT_TYPE) {
            throw new java.lang.IllegalStateException();
        }
        java.util.List list = this.k;
        synchronized (list) {
            list.add(telemetryEvent);
        }
        java.util.List list2 = this.k;
        synchronized (list2) {
            arrayList2 = new java.util.ArrayList(list2.size());
            arrayList2.addAll(list2);
            list2.clear();
        }
        int size2 = arrayList2.size();
        int i6 = 0;
        while (i6 < size2) {
            com.google.android.apps.auto.components.telemetry.TelemetryEvent telemetryEvent2 = (com.google.android.apps.auto.components.telemetry.TelemetryEvent) arrayList2.get(i6);
            if (telemetryEvent2.a == defpackage.yyh.NON_UI) {
                defpackage.abor aborVarK3 = telemetryEvent2.b.K();
                defpackage.zae zaeVar = ((defpackage.yyg) aborVarK3.b).p;
                if (zaeVar == null) {
                    zaeVar = defpackage.zae.a;
                }
                defpackage.abor aborVarK4 = zaeVar.K();
                int iDc = defpackage.ysr.dc(zaeVar.c);
                defpackage.zaa zaaVarB = defpackage.zaa.b(zaeVar.d);
                yygVar = null;
                if ((((defpackage.zae) aborVarK4.b).b & 1024) == 0 && (iDc != 8 ? iDc == 5 : zaaVarB == defpackage.zaa.LIFETIME_START) && (carInfo = (com.google.android.gms.car.CarInfo) this.g.get()) != null) {
                    defpackage.yyv yyvVarA = carInfo.a();
                    aborVarK4.t();
                    defpackage.zae zaeVar2 = (defpackage.zae) aborVarK4.b;
                    yyvVarA.getClass();
                    zaeVar2.k = yyvVarA;
                    zaeVar2.b |= 1024;
                }
                try {
                    str = this.b.getPackageManager().getPackageInfo("com.google.android.projection.gearhead", i).versionName;
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    str = null;
                }
                if (true == android.text.TextUtils.isEmpty(str)) {
                    str = "unknown";
                }
                aborVarK4.t();
                defpackage.zae zaeVar3 = (defpackage.zae) aborVarK4.b;
                str.getClass();
                zaeVar3.b |= 8;
                zaeVar3.g = str;
                defpackage.zae zaeVar4 = (defpackage.zae) aborVarK4.q();
                aborVarK3.t();
                defpackage.yyg yygVar13 = (defpackage.yyg) aborVarK3.b;
                zaeVar4.getClass();
                yygVar13.p = zaeVar4;
                yygVar13.b |= 8192;
                telemetryEvent2.b = (defpackage.yyg) aborVarK3.q();
            } else {
                yygVar = null;
            }
            defpackage.oiw oiwVar = this.n;
            defpackage.rqt rqtVar = oiwVar.a;
            rqtVar.e(telemetryEvent2.a, telemetryEvent2.b, telemetryEvent2.c);
            defpackage.ygw ygwVarB = ((defpackage.rqx) rqtVar.g.fF()).b();
            if (telemetryEvent2.a == defpackage.yyh.NON_UI) {
                defpackage.zae zaeVar5 = telemetryEvent2.b.p;
                if (zaeVar5 == null) {
                    zaeVar5 = defpackage.zae.a;
                }
                if (zaeVar5.d != 253) {
                    defpackage.zae zaeVar6 = telemetryEvent2.b.p;
                    if (zaeVar6 == null) {
                        zaeVar6 = defpackage.zae.a;
                    }
                    if (zaeVar6.d != 251) {
                        yygVar2 = yygVar;
                    }
                }
                defpackage.abor aborVarN3 = defpackage.yyg.a.n();
                defpackage.zao zaoVar = telemetryEvent2.b.C;
                if (zaoVar == null) {
                    zaoVar = defpackage.zao.a;
                }
                aborVarN3.t();
                defpackage.yyg yygVar14 = (defpackage.yyg) aborVarN3.b;
                zaoVar.getClass();
                yygVar14.C = zaoVar;
                yygVar14.b |= 536870912;
                defpackage.yyg yygVar15 = telemetryEvent2.b;
                if ((yygVar15.b & 67108864) != 0) {
                    int i7 = yygVar15.A;
                    aborVarN3.t();
                    defpackage.yyg yygVar16 = (defpackage.yyg) aborVarN3.b;
                    yygVar16.b |= 67108864;
                    yygVar16.A = i7;
                }
                defpackage.abor aborVarN4 = defpackage.zae.a.n();
                aborVarN4.t();
                defpackage.zae zaeVar7 = (defpackage.zae) aborVarN4.b;
                zaeVar7.b |= 1;
                zaeVar7.c = 7;
                aborVarN4.t();
                defpackage.zae zaeVar8 = (defpackage.zae) aborVarN4.b;
                zaeVar8.b |= 2;
                zaeVar8.d = 256;
                defpackage.zae zaeVar9 = (defpackage.zae) aborVarN4.q();
                aborVarN3.t();
                defpackage.yyg yygVar17 = (defpackage.yyg) aborVarN3.b;
                zaeVar9.getClass();
                yygVar17.p = zaeVar9;
                yygVar17.b |= 8192;
                ygwVarB.getClass();
                defpackage.ygw ygwVarN = defpackage.ygw.n(ygwVarB);
                if (!ygwVarN.isEmpty()) {
                    defpackage.abor aborVarN5 = defpackage.yzc.a.n();
                    aborVarN5.t();
                    defpackage.yzc yzcVar = (defpackage.yzc) aborVarN5.b;
                    yzcVar.b |= 1;
                    yzcVar.c = 1;
                    defpackage.yzc yzcVar2 = (defpackage.yzc) aborVarN5.q();
                    aborVarN3.t();
                    defpackage.yyg yygVar18 = (defpackage.yyg) aborVarN3.b;
                    yzcVar2.getClass();
                    yygVar18.O = yzcVar2;
                    yygVar18.c |= 32768;
                    aborVarN3.N(ygwVarN);
                }
                aborVarN3.N(telemetryEvent2.b.P);
                defpackage.yyg yygVar19 = telemetryEvent2.b;
                if ((yygVar19.b & 8388608) != 0) {
                    int i8 = yygVar19.x;
                    aborVarN3.t();
                    defpackage.yyg yygVar20 = (defpackage.yyg) aborVarN3.b;
                    yygVar20.b = 8388608 | yygVar20.b;
                    yygVar20.x = i8;
                }
                yygVar2 = (defpackage.yyg) aborVarN3.q();
            } else {
                yygVar2 = yygVar;
            }
            if (yygVar2 == null) {
                defpackage.yyg yygVar21 = (defpackage.yyg) oiwVar.b.poll();
                if (yygVar21 != null) {
                    oiwVar.a(yygVar21);
                }
            } else if (!oiwVar.a(yygVar2)) {
                oiwVar.b.add(yygVar2);
            }
            i6++;
            i = 0;
        }
        arrayList2.size();
        i(telemetryEvent, defpackage.zaa.LIFETIME_END);
        h(telemetryEvent, defpackage.zbd.Du);
    }

    @Override // defpackage.oiq
    public final void d(oip oipVar, java.util.Collection collection) {
        oipVar.getClass();
        synchronized (this.i) {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.j.t((defpackage.yyh) it.next(), oipVar);
            }
        }
    }

    @Override // defpackage.oiq
    public final void e() {
        this.h.set(defpackage.zbe.NO_FACET);
    }

    @Override // defpackage.oiq
    public final void f(oip oipVar) {
        synchronized (this.i) {
            this.j.v().removeAll(java.util.Collections.singleton(oipVar));
        }
    }
}
