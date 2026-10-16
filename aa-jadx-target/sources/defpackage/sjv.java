package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class sjv extends defpackage.smr {
    final /* synthetic */ defpackage.sjw a;
    private final defpackage.sim e;
    private final defpackage.sjo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjv(defpackage.sjw sjwVar, defpackage.sim simVar, defpackage.slz slzVar, defpackage.sjo sjoVar) {
        super(slzVar);
        this.a = sjwVar;
        java.util.List list = defpackage.sip.n;
        this.e = simVar;
        this.f = sjoVar;
    }

    /* JADX WARN: Code duplicated, block: B:184:0x03e0 A[Catch: all -> 0x03e2, DONT_GENERATE, TryCatch #3 {, blocks: (B:172:0x03a8, B:174:0x03ac, B:176:0x03ba, B:178:0x03c6, B:180:0x03d4, B:181:0x03db, B:183:0x03dd, B:184:0x03e0), top: B:257:0x03a8 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.Queue] */
    @Override // defpackage.smr
    protected final /* synthetic */ void b(defpackage.slm slmVar) throws android.os.RemoteException {
        boolean z;
        defpackage.sim simVar;
        java.util.List<acbt> list;
        java.util.ArrayList<acbt> arrayList;
        int i;
        com.google.android.gms.clearcut.LogEventParcelable logEventParcelable;
        int size;
        boolean z2;
        int i2;
        defpackage.acbn acbnVarB;
        long j;
        long jLongValue;
        long j2;
        java.lang.Long lValueOf;
        long jLongValue2;
        long jD;
        defpackage.sjx sjxVar = (defpackage.sjx) slmVar;
        try {
            defpackage.sim simVar2 = this.e;
            defpackage.sil silVar = simVar2.a;
            java.util.Iterator it = ((defpackage.sip) silVar).o.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    for (defpackage.sjr sjrVar : defpackage.sjr.a().a) {
                        if (!silVar.c()) {
                            defpackage.wde.c(simVar2, new defpackage.jbr(sjrVar, simVar2, 11), new defpackage.wdc(sjrVar, simVar2, 0));
                            defpackage.wde.c(simVar2, new defpackage.jbr(sjrVar, simVar2, 12), new defpackage.kpl(sjrVar.a, 7));
                        }
                    }
                    java.util.Iterator it2 = defpackage.sip.n.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            simVar = simVar2;
                            break;
                        } else {
                            ((sio) it2.next()).a(simVar2);
                            if (simVar2 == null) {
                            }
                        }
                    }
                } else {
                    ((sio) it.next()).a(simVar2);
                    if (simVar2 == null) {
                    }
                }
                simVar = null;
                break;
            }
            if (simVar == null) {
                j(com.google.android.gms.common.api.Status.a);
                return;
            }
            java.lang.String str = simVar.i;
            int i3 = ((defpackage.acbo) simVar.p.b).e;
            if (str == null || str.isEmpty()) {
                str = null;
            }
            defpackage.sjl sjlVar = simVar.a.d;
            boolean z3 = true;
            if (str == null) {
                arrayList = new java.util.ArrayList();
            } else {
                android.content.Context context = ((defpackage.skc) sjlVar).e;
                if (context == null) {
                    list = java.util.Collections.EMPTY_LIST;
                } else {
                    j$.util.concurrent.ConcurrentHashMap concurrentHashMap = defpackage.skc.b;
                    defpackage.wbn wbnVar = (defpackage.wbn) concurrentHashMap.get(str);
                    if (wbnVar == null) {
                        defpackage.wbl wblVar = defpackage.skc.a;
                        defpackage.acbu acbuVar = defpackage.acbu.a;
                        boolean z4 = defpackage.wbn.b;
                        defpackage.wbi wbiVar = new defpackage.wbi(wblVar, str, acbuVar);
                        wbnVar = (defpackage.wbn) concurrentHashMap.putIfAbsent(str, wbiVar);
                        if (wbnVar == null) {
                            wbnVar = wbiVar;
                        }
                    }
                    list = ((defpackage.acbu) wbnVar.b()).b;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.String packageName = context != null ? context.getPackageName() : "";
                for (acbt acbtVar : list) {
                    if (acbtVar.g.size() <= 0 || acbtVar.g.contains(packageName)) {
                        if ((acbtVar.b & 1) == 0 || (i = acbtVar.c) == 0 || i == i3) {
                            arrayList2.add(acbtVar);
                        }
                    }
                }
                arrayList = arrayList2;
            }
            for (acbt acbtVar2 : arrayList) {
                java.lang.String str2 = acbtVar2.d;
                android.content.Context context2 = ((defpackage.skc) sjlVar).e;
                if (defpackage.tnx.e(context2)) {
                    if (defpackage.skc.d != null) {
                        j = 0;
                    } else if (context2 != null) {
                        if (defpackage.skc.c == null) {
                            defpackage.skc.c = java.lang.Boolean.valueOf(defpackage.sqx.a.a(context2).g("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? z3 : z);
                        }
                        if (defpackage.skc.c.booleanValue()) {
                            android.content.ContentResolver contentResolver = context2.getContentResolver();
                            defpackage.syf syfVar = defpackage.syd.a;
                            defpackage.syj syjVar = (defpackage.syj) syfVar;
                            syjVar.f(contentResolver);
                            syjVar.d(contentResolver);
                            j = 0;
                            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = syjVar.e;
                            readLock.lock();
                            try {
                                java.lang.Object obj = ((defpackage.syj) syfVar).i;
                                java.lang.Long l = (java.lang.Long) ((defpackage.syj) syfVar).c(((defpackage.syj) syfVar).h, "android_id", 0L, defpackage.syj.c);
                                readLock.unlock();
                                if (l != null) {
                                    jLongValue2 = l.longValue();
                                } else {
                                    java.lang.String strB = syjVar.b(contentResolver, "android_id");
                                    if (strB == null) {
                                        lValueOf = l;
                                        j2 = 0;
                                    } else {
                                        try {
                                            j2 = java.lang.Long.parseLong(strB);
                                            lValueOf = java.lang.Long.valueOf(j2);
                                        } catch (java.lang.NumberFormatException unused) {
                                            lValueOf = l;
                                            j2 = 0;
                                        }
                                    }
                                    syjVar.e(obj, syjVar.h, "android_id", lValueOf, defpackage.syj.c);
                                    jLongValue2 = j2;
                                }
                                defpackage.skc.d = java.lang.Long.valueOf(jLongValue2);
                            } catch (java.lang.Throwable th) {
                                syjVar.e.unlock();
                                throw th;
                            }
                        } else {
                            j = 0;
                            defpackage.skc.d = 0L;
                        }
                    } else {
                        z3 = z3;
                        j = 0;
                        jLongValue = 0;
                    }
                    jLongValue = defpackage.skc.d.longValue();
                } else {
                    z3 = z3;
                    jLongValue = 0;
                    j = 0;
                }
                if (str2 == null || str2.isEmpty()) {
                    jD = qsp.D(java.nio.ByteBuffer.allocate(8).putLong(jLongValue).array());
                } else {
                    byte[] bytes = str2.getBytes(java.nio.charset.StandardCharsets.UTF_8);
                    java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(bytes.length + 8);
                    byteBufferAllocate.put(bytes);
                    byteBufferAllocate.putLong(jLongValue);
                    jD = qsp.D(byteBufferAllocate.array());
                }
                long j3 = acbtVar2.e;
                long j4 = acbtVar2.f;
                if (j3 >= j && j4 > j) {
                    if ((jD >= j ? jD % j4 : (((Long.MAX_VALUE % j4) + 1) + ((jD & Long.MAX_VALUE) % j4)) % j4) >= j3) {
                        j(com.google.android.gms.common.api.Status.a);
                        return;
                    }
                }
                z3 = z3;
                z = false;
            }
            boolean z5 = z3;
            defpackage.sjo sjoVar = this.f;
            if (!sjoVar.b()) {
                j(new com.google.android.gms.common.api.Status(0, "The event was not logged due to sampling.", null, null));
                defpackage.skb.b().e(simVar.i, 1006);
                return;
            }
            double d = sjoVar.e;
            if (d != 0.0d) {
                defpackage.abot abotVar = simVar.p;
                abotVar.t();
                defpackage.acbo acboVar = (defpackage.acbo) abotVar.b;
                acboVar.b |= 67108864;
                acboVar.j = d;
            }
            try {
                defpackage.abot abotVar2 = simVar.p;
                defpackage.abnv abnvVarF = simVar.m.f();
                abotVar2.t();
                defpackage.acbo acboVar2 = (defpackage.acbo) abotVar2.b;
                acboVar2.b |= 2048;
                acboVar2.f = abnvVarF;
                defpackage.sil silVar2 = simVar.a;
                sin sinVar = ((defpackage.sip) silVar2).p;
                if (sinVar != null && (acbnVarB = sinVar.b()) != null) {
                    abotVar2.t();
                    defpackage.acbo acboVar3 = (defpackage.acbo) abotVar2.b;
                    acboVar3.k = acbnVarB;
                    acboVar3.b |= 134217728;
                }
                defpackage.acbo acboVar4 = (defpackage.acbo) abotVar2.q();
                java.lang.String str3 = ((defpackage.sip) silVar2).i;
                android.content.Context context3 = ((defpackage.sip) silVar2).f;
                int i4 = -1;
                if (defpackage.sil.a == -1) {
                    synchronized (defpackage.sil.class) {
                        if (defpackage.sil.a == -1) {
                            try {
                                defpackage.sil.a = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 0).versionCode;
                            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                                android.util.Log.wtf("AbstractClearcutLogger", "This can't happen.", e);
                            }
                        }
                    }
                }
                int i5 = defpackage.sil.a;
                java.lang.String str4 = simVar.i;
                java.lang.String str5 = simVar.h;
                int iD = simVar.d();
                defpackage.sjp sjpVar = ((defpackage.sip) simVar.a).j;
                boolean zA = sjpVar.a(defpackage.sjq.ANDROID_ID);
                boolean zEquals = sjpVar.equals(defpackage.sjp.b);
                int i6 = iD - 1;
                if (sjpVar.equals(defpackage.sjp.a)) {
                    i2 = 0;
                } else {
                    defpackage.yot it3 = sjpVar.d.iterator();
                    while (it3.hasNext()) {
                        i4 &= ~((defpackage.sjq) it3.next()).e;
                    }
                    i2 = i4;
                }
                com.google.android.gms.clearcut.internal.PlayLoggerContext playLoggerContext = new com.google.android.gms.clearcut.internal.PlayLoggerContext(str3, i5, -1, str5, zA, str4, zEquals, i6, null, false, i2);
                byte[] bArrH = acboVar4.h();
                int[] iArrD = defpackage.sil.d(simVar.c);
                java.util.ArrayList arrayList3 = simVar.d;
                java.lang.String[] strArr = arrayList3 != null ? (java.lang.String[]) arrayList3.toArray(defpackage.sil.c) : null;
                int[] iArrD2 = defpackage.sil.d(simVar.e);
                java.util.ArrayList arrayList4 = simVar.f;
                com.google.android.gms.phenotype.ExperimentTokens[] experimentTokensArr = arrayList4 != null ? (com.google.android.gms.phenotype.ExperimentTokens[]) arrayList4.toArray(defpackage.sil.b) : null;
                java.util.Set set = simVar.g;
                logEventParcelable = new com.google.android.gms.clearcut.LogEventParcelable(playLoggerContext, acboVar4, bArrH, iArrD, strArr, iArrD2, experimentTokensArr, set != null ? (java.lang.String[]) set.toArray(defpackage.sil.c) : null, acboVar4.e, null);
                defpackage.tns tnsVar = simVar.n;
                if (tnsVar != null) {
                    defpackage.acbo acboVar5 = logEventParcelable.o;
                    acboVar5.getClass();
                    acboVar5.f.D();
                    wd wdVar = tnl.a;
                    if (android.os.Looper.getMainLooper().equals(android.os.Looper.myLooper())) {
                        throw new android.os.NetworkOnMainThreadException();
                    }
                    defpackage.tnj tnjVar = tnsVar.a;
                    android.content.Context context4 = tnjVar.a;
                    wd wdVar2 = tnl.a;
                    if (!tnr.a) {
                        synchronized (tnr.b) {
                            if (!tnr.a) {
                                tnr.a = z5;
                                defpackage.wba.c(context4);
                                defpackage.wbn.f(context4);
                                if (!tnm.i(context4)) {
                                    if (!addu.a.b().b() || defpackage.slj.a(context4).b(context4.getPackageName())) {
                                        tnr.a(tnjVar, wdVar2);
                                    } else {
                                        android.util.Log.w("CBVerifier", "Phenotype flags were not sycned because package was not Google Signed.");
                                    }
                                }
                            }
                        }
                    }
                    if (addu.a.b().a()) {
                        if (tnm.a == null) {
                            synchronized (tnm.class) {
                                if (tnm.a == null) {
                                    tnm.a = new tnm();
                                }
                            }
                        }
                        defpackage.tnn tnnVar = tnsVar.b;
                        tnm tnmVar = tnm.a;
                        tnnVar.a.a();
                    }
                    addx.a.b();
                    addu.a.b().c();
                    logEventParcelable.i = new com.google.android.gms.clearcut.internal.LogVerifierResultParcelable(z5);
                }
            } catch (java.lang.RuntimeException e2) {
                android.util.Log.e("ClearcutLoggerApiImpl", "Error building the LogEventParcelable.", e2);
                logEventParcelable = null;
            }
            if (logEventParcelable == null) {
                f(new com.google.android.gms.common.api.Status(10, "MessageProducer", null, null));
                return;
            }
            defpackage.sjw sjwVar = this.a;
            defpackage.addo addoVarFF = defpackage.addn.a.fF();
            android.content.Context context5 = sjwVar.b;
            if (!addoVarFF.e(context5)) {
                try {
                    if (defpackage.addq.a.fF().b(context5)) {
                        logEventParcelable.l = defpackage.skb.b().a();
                    }
                    sju sjuVar = new sju(this);
                    defpackage.ska skaVar = (defpackage.ska) sjxVar.v();
                    android.os.Parcel parcelFp = skaVar.fp();
                    defpackage.ijx.i(parcelFp, sjuVar);
                    defpackage.ijx.g(parcelFp, logEventParcelable);
                    skaVar.fs(1, parcelFp);
                    this.a.c(defpackage.skb.b().a());
                    return;
                } catch (android.os.RemoteException | java.lang.RuntimeException e3) {
                    android.util.Log.e("ClearcutLoggerApiImpl", "Failed to call logEvent", e3);
                    defpackage.skb.b().d(1009, this.a.b);
                    if (e3 instanceof android.os.TransactionTooLargeException) {
                        android.util.Log.e("ClearcutLoggerApiImpl", "Log event caused a TransactionTooLargeException", e3);
                        defpackage.skb.b().e(logEventParcelable.a.f, 31004);
                    } else {
                        defpackage.skb.b().e(logEventParcelable.a.f, 1003);
                    }
                    throw e3;
                }
            }
            defpackage.ski skiVar = defpackage.sjw.a;
            defpackage.jpe jpeVar = new defpackage.jpe(this, 4);
            defpackage.jpe jpeVar2 = new defpackage.jpe(this, 5);
            defpackage.ske skeVar = new defpackage.ske();
            skeVar.c(false);
            skeVar.b(false);
            skeVar.a = logEventParcelable;
            skeVar.b = jpeVar;
            skeVar.c = jpeVar2;
            defpackage.skf skfVarA = skeVar.a();
            defpackage.skd skdVar = skiVar.a;
            android.content.Context context6 = sjxVar.b;
            long jC = defpackage.addn.a.fF().c(context6);
            synchronized (skdVar.a) {
                ?? r9 = skdVar.c;
                r9.add(skfVarA);
                size = r9.size() + skdVar.d.size();
                z2 = skdVar.b;
                skdVar.b = true;
            }
            com.google.android.gms.clearcut.LogEventParcelable logEventParcelable2 = skfVarA.a;
            java.lang.String str6 = logEventParcelable2.a.f;
            defpackage.skb.b().e(str6, 1025);
            byte[] bArr = logEventParcelable2.b;
            if (bArr == null) {
                defpackage.skb.b().e(str6, 1038);
            } else if (bArr.length > defpackage.addn.a.fF().b(context6)) {
                defpackage.skb.b().e(str6, 1039);
            }
            if (size >= jC) {
                defpackage.skb.b().e(str6, 1040);
            }
            if (z2) {
                return;
            }
            skiVar.b(sjxVar, logEventParcelable.a.f);
        } catch (java.lang.RuntimeException e4) {
            android.util.Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.EventModifier ", e4);
            f(new com.google.android.gms.common.api.Status(10, "EventModifier", null, null));
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ defpackage.sme a(com.google.android.gms.common.api.Status status) {
        return status;
    }
}
