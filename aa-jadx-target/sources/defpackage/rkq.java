package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rkq {
    public final java.lang.Object a;
    public final java.lang.Object b;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Set] */
    public rkq(java.util.Set set) {
        this.b = set;
        this.a = new boolean[256];
        for (int i = 0; i < 256; i++) {
            ((boolean[]) this.a)[i] = this.b.contains(java.lang.Integer.valueOf(i));
        }
    }

    private static final ajgv C(final int i, boolean z, defpackage.xyn xynVar) {
        defpackage.xyn xynVarA;
        defpackage.xyn xysVar;
        defpackage.xyn xynVar2;
        defpackage.abor aborVarN = ajgv.a.n();
        long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
        aborVarN.t();
        ajgv ajgvVar = aborVarN.b;
        ajgvVar.b |= 1;
        ajgvVar.c = elapsedCpuTime;
        aborVarN.t();
        ajgv ajgvVar2 = aborVarN.b;
        ajgvVar2.b |= 2;
        ajgvVar2.d = z;
        int iActiveCount = java.lang.Thread.activeCount();
        aborVarN.t();
        ajgv ajgvVar3 = aborVarN.b;
        ajgvVar3.b |= 4;
        ajgvVar3.e = iActiveCount;
        java.lang.String str = java.lang.String.format(java.util.Locale.US, "/proc/%d/oom_score_adj", java.lang.Integer.valueOf(i));
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            try {
                java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(str, "r");
                try {
                    xynVarA = defpackage.xyn.g(randomAccessFile.readLine()).a(new defpackage.kpo(9));
                    randomAccessFile.close();
                } catch (java.lang.Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th3;
            }
        } catch (java.io.IOException unused) {
            xynVarA = defpackage.xxe.a;
        }
        android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        if (xynVarA.f()) {
            int iIntValue = ((java.lang.Integer) xynVarA.b()).intValue();
            aborVarN.t();
            ajgv ajgvVar4 = aborVarN.b;
            ajgvVar4.b |= 16;
            ajgvVar4.g = iIntValue;
        }
        if (xynVar.f()) {
            defpackage.vro vroVar = (defpackage.vro) xynVar.b();
            if (vroVar.a) {
                defpackage.ygw ygwVarA = vroVar.a();
                defpackage.xyp xypVar = new defpackage.xyp() { // from class: vrm
                    @Override // defpackage.xyp
                    public final boolean a(java.lang.Object obj) {
                        return ((android.app.ActivityManager.RunningAppProcessInfo) obj).pid == i;
                    }
                };
                java.util.Iterator<E> it = ygwVarA.iterator();
                it.getClass();
                while (true) {
                    if (!it.hasNext()) {
                        xysVar = defpackage.xxe.a;
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (xypVar.a(next)) {
                        next.getClass();
                        xysVar = new defpackage.xys(next);
                        break;
                    }
                }
                xynVar2 = (defpackage.xyn) xysVar.a(new defpackage.kpo(6)).d(defpackage.xxe.a);
            } else {
                xynVar2 = defpackage.xxe.a;
            }
            if (xynVar2.f()) {
                java.lang.String strFlattenToString = ((android.content.ComponentName) xynVar2.b()).flattenToString();
                aborVarN.t();
                ajgv ajgvVar5 = aborVarN.b;
                strFlattenToString.getClass();
                ajgvVar5.b |= 32;
                ajgvVar5.h = strFlattenToString;
            }
        }
        return aborVarN.q();
    }

    public static defpackage.xyn j(java.lang.Class cls) {
        try {
            return defpackage.xyn.h((syr) cls.getDeclaredConstructor(null).newInstance(null));
        } catch (java.lang.ReflectiveOperationException unused) {
            return defpackage.xxe.a;
        }
    }

    public static /* synthetic */ defpackage.yhe k() {
        return defpackage.ync.a(8, new java.lang.Object[]{qoh.b, szc.class, qoh.d, szf.class, qoh.e, szd.class, qoh.f, szh.class, qoh.i, szg.class, qoh.j, szi.class, qoh.l, szb.class, qoh.n, szj.class}, null);
    }

    public final ajgv A() {
        java.lang.Object obj = this.a;
        int iMyPid = android.os.Process.myPid();
        defpackage.vro vroVarD = defpackage.vrn.d((android.content.Context) obj);
        return C(iMyPid, ((defpackage.ngb) this.b).c(new defpackage.upb(vroVarD, 13)), defpackage.xyn.g(vroVarD));
    }

    public final ajgv B(int i, defpackage.xzi xziVar) {
        return C(i, ((defpackage.ngb) this.b).c(xziVar), defpackage.xyn.g((defpackage.vro) xziVar.fF()));
    }

    public final int a() throws defpackage.qst {
        return ((java.lang.Integer) ((defpackage.rps) this.a).b(new defpackage.rdo(this.b, 10))).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized java.lang.Object b(java.lang.Class cls, defpackage.rej rejVar) throws android.os.RemoteException {
        ?? r0 = this.b;
        java.lang.Object objCast = cls.cast(r0.get(cls));
        if (objCast != null) {
            return objCast;
        }
        java.lang.Object objA = rejVar.a();
        r0.put(cls, objA);
        return objA;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized java.lang.Object c(java.lang.Class cls, java.lang.String str, defpackage.rej rejVar) throws android.os.RemoteException {
        java.lang.Object objCast;
        ?? r0 = this.a;
        java.util.Map zdVar = (java.util.Map) r0.get(cls);
        if (zdVar != null) {
            objCast = cls.cast(zdVar.get(str));
        } else {
            zdVar = new defpackage.zd();
            r0.put(cls, zdVar);
            objCast = null;
        }
        if (objCast != null) {
            return objCast;
        }
        java.lang.Object objA = rejVar.a();
        zdVar.put(str, objA);
        return objA;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized java.lang.Object d(java.lang.Class cls, defpackage.xzi xziVar) {
        ?? r0 = this.b;
        java.lang.Object objCast = cls.cast(r0.get(cls));
        if (objCast != null) {
            return objCast;
        }
        java.lang.Object objFF = xziVar.fF();
        objFF.getClass();
        r0.put(cls, objFF);
        return objFF;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void e(java.lang.Class cls) {
        this.b.remove(cls);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void f(java.lang.Class cls, java.util.function.Consumer consumer) {
        java.lang.Object objCast = cls.cast(this.b.remove(cls));
        if (objCast != null) {
            a$.ExternalSyntheticApiModelOutline2.m(consumer, objCast);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void g(java.lang.Class cls) {
        this.a.remove(cls);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void h(java.lang.Class cls, java.util.function.Consumer consumer) {
        java.util.Map map = (java.util.Map) this.a.remove(cls);
        if (map != null) {
            java.util.Iterator it = map.values().iterator();
            while (it.hasNext()) {
                a$.ExternalSyntheticApiModelOutline2.m(consumer, cls.cast(it.next()));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized void i(java.lang.Class cls, java.lang.Object obj) {
        ?? r0 = this.b;
        java.util.List listSingletonList = java.util.Collections.singletonList(obj);
        r0.values().removeAll(listSingletonList);
        ?? r1 = this.a;
        java.util.Map map = (java.util.Map) r1.get(cls);
        if (map != null) {
            map.values().removeAll(listSingletonList);
            if (map.isEmpty()) {
                r1.remove(cls);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, syq] */
    public final void l(android.content.Context context, qoh qohVar, defpackage.qof qofVar) {
        android.util.Log.e("AppDoctor", "Failed on fix: " + qohVar.a());
        defpackage.abor aborVarN = qog.a.n();
        java.lang.String packageName = context.getPackageName();
        aborVarN.t();
        qog qogVar = aborVarN.b;
        packageName.getClass();
        qogVar.b |= 1;
        qogVar.c = packageName;
        aborVarN.t();
        qog qogVar2 = aborVarN.b;
        qogVar2.g = qofVar.a();
        qogVar2.b |= 16;
        aborVarN.t();
        qog qogVar3 = aborVarN.b;
        qogVar3.f = defpackage.adrq.z(6);
        qogVar3.b |= 8;
        aborVarN.t();
        qog qogVar4 = aborVarN.b;
        qogVar4.e = qohVar.a();
        qogVar4.b |= 4;
        this.a.a(aborVarN.q());
    }

    public final void m(android.content.Context context, qow qowVar, defpackage.qof qofVar) {
        qoh qohVarB;
        if (qowVar != null) {
            qohVarB = qoh.b(qowVar.b);
            if (qohVarB == null) {
                qohVarB = qoh.p;
            }
        } else {
            qohVarB = qoh.a;
        }
        l(context, qohVarB, qofVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, syq] */
    public final void n(android.content.Context context, qoh qohVar, defpackage.qof qofVar) {
        defpackage.abor aborVarN = qog.a.n();
        java.lang.String packageName = context.getPackageName();
        aborVarN.t();
        qog qogVar = aborVarN.b;
        packageName.getClass();
        qogVar.b |= 1;
        qogVar.c = packageName;
        aborVarN.t();
        qog qogVar2 = aborVarN.b;
        qogVar2.g = qofVar.a();
        qogVar2.b |= 16;
        aborVarN.t();
        qog qogVar3 = aborVarN.b;
        qogVar3.f = defpackage.adrq.z(5);
        qogVar3.b |= 8;
        aborVarN.t();
        qog qogVar4 = aborVarN.b;
        qogVar4.e = qohVar.a();
        qogVar4.b |= 4;
        this.a.a(aborVarN.q());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, syq] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, zhs] */
    public final boolean o(android.content.Context context, defpackage.qof qofVar) {
        java.util.List<qow> list;
        qoh qohVarB;
        if (defpackage.sqs.aR(context)) {
            syv syvVar = new syv();
            syvVar.b = context;
            syvVar.a = qofVar;
            syvVar.c = this.a;
            syw sywVarA = syvVar.a();
            try {
                defpackage.syo syoVar = new defpackage.syo(context);
                try {
                    rko rkoVar = new rko(new wij(this, syoVar, sywVarA, (byte[]) null));
                    defpackage.yhe yheVarK = k();
                    android.os.Bundle bundleCall = syoVar.b.call("get_fixes", null, syoVar.a());
                    if (bundleCall == null) {
                        android.util.Log.e("AppDoctorProviderClient", "Failed to get config from AppDoctorProvider.");
                        int i = defpackage.ygw.d;
                        list = defpackage.ymx.a;
                    } else {
                        byte[] byteArray = bundleCall.getByteArray("com.google.android.gms.common.appdoctor.teledoctorconfig");
                        if (byteArray == null) {
                            android.util.Log.e("AppDoctorProviderClient", "TeleDoctor Config empty");
                            int i2 = defpackage.ygw.d;
                            list = defpackage.ymx.a;
                        } else {
                            try {
                                qox qoxVarD = defpackage.abox.D(qox.a, byteArray, 0, byteArray.length, defpackage.abol.a);
                                defpackage.abox.U(qoxVarD);
                                list = qoxVarD.b;
                            } catch (defpackage.abpp e) {
                                android.util.Log.e("AppDoctorProviderClient", "Failed to parse TeleDoctorConfig.", e);
                                int i3 = defpackage.ygw.d;
                                list = defpackage.ymx.a;
                            }
                        }
                    }
                    for (qow qowVar : list) {
                        qoh qohVarB2 = qoh.b(qowVar.b);
                        if (qohVarB2 == null) {
                            qohVarB2 = qoh.p;
                        }
                        if (yheVarK.containsKey(qohVarB2)) {
                            qoh qohVarB3 = qoh.b(qowVar.b);
                            if (qohVarB3 == null) {
                                qohVarB3 = qoh.p;
                            }
                            defpackage.xyn xynVarJ = j((java.lang.Class) yheVarK.get(qohVarB3));
                            if (xynVarJ.f()) {
                                java.lang.String str = qowVar.d;
                                qoh qohVarB4 = qoh.b(qowVar.b);
                                if (qohVarB4 == null) {
                                    qohVarB4 = qoh.p;
                                }
                                qov qovVar = qowVar.c;
                                if (qovVar == null) {
                                    qovVar = qov.a;
                                }
                                syr syrVar = (syr) xynVarJ.b();
                                rkoVar.e(new syu(str, qohVarB4, qovVar, syrVar, syu.a));
                            } else {
                                m(sywVarA.b, qowVar, sywVarA.a);
                            }
                        } else {
                            android.content.Context context2 = sywVarA.b;
                            defpackage.qof qofVar2 = sywVarA.a;
                            if (qowVar != null) {
                                qohVarB = qoh.b(qowVar.b);
                                if (qohVarB == null) {
                                    qohVarB = qoh.p;
                                }
                            } else {
                                qohVarB = qoh.a;
                            }
                            n(context2, qohVarB, qofVar2);
                        }
                    }
                    defpackage.adnr adnrVarF = rkoVar.f(sywVarA);
                    try {
                        adnrVarF.b.get();
                        boolean z = adnrVarF.a;
                        syoVar.close();
                        return z;
                    } catch (java.lang.InterruptedException | java.lang.RuntimeException | java.util.concurrent.ExecutionException unused) {
                        m(context, qow.a, qofVar);
                        syoVar.close();
                        return false;
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        syoVar.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (android.os.RemoteException | java.lang.RuntimeException unused2) {
                m(context, qow.a, qofVar);
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    public final void p(boolean z, com.google.android.gms.common.api.Status status) {
        java.util.HashMap map;
        java.util.HashMap map2;
        ?? r0 = this.a;
        synchronized (r0) {
            map = new java.util.HashMap((java.util.Map) r0);
        }
        ?? r3 = this.b;
        synchronized (r3) {
            map2 = new java.util.HashMap((java.util.Map) r3);
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (z || ((java.lang.Boolean) entry.getValue()).booleanValue()) {
                ((com.google.android.gms.common.api.internal.BasePendingResult) entry.getKey()).h(status);
            }
        }
        for (java.util.Map.Entry entry2 : map2.entrySet()) {
            if (z || ((java.lang.Boolean) entry2.getValue()).booleanValue()) {
                ((defpackage.lhe) entry2.getKey()).e(new defpackage.sls(status));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, xvq] */
    @pix
    public final xvp q(@piy java.lang.String str, defpackage.xvk xvkVar) {
        str.getClass();
        defpackage.xvk xvkVarD = defpackage.xvk.d((defpackage.xvk) this.a.a(), xvkVar);
        xvkVarD.getClass();
        defpackage.nrr nrrVarF = defpackage.xuy.f();
        ?? r6 = nrrVarF.c;
        defpackage.xvq xvcVar = (r6 == 0 || r6 == defpackage.xvf.a) ? new xvc(str, xvc.a, xvc.b, xvkVarD, nrrVarF) : r6.m(str, xvkVarD, nrrVarF);
        defpackage.xuy.c(xvcVar);
        return new xvp(new defpackage.xvg(xvcVar, r6 == defpackage.xvf.a));
    }

    public final defpackage.wdf r(java.lang.String str, double d) {
        return new defpackage.wct((java.lang.String) this.b, str, (defpackage.wdo) this.a, d);
    }

    public final defpackage.wdf s(java.lang.String str, long j) {
        return new defpackage.wcv((java.lang.String) this.b, str, (defpackage.wdo) this.a, j);
    }

    public final defpackage.wdf t(java.lang.String str, java.lang.String str2) {
        return new defpackage.wcx((java.lang.String) this.b, str, (defpackage.wdo) this.a, str2);
    }

    public final defpackage.wdf u(java.lang.String str, boolean z) {
        return new defpackage.wcp((java.lang.String) this.b, str, (defpackage.wdo) this.a, z);
    }

    public final defpackage.wdf v(java.lang.String str, defpackage.wco wcoVar, java.lang.String str2) {
        return new defpackage.wcr((java.lang.String) this.b, str, (defpackage.wdo) this.a, wcoVar, str2);
    }

    public final void w(java.lang.String str, java.lang.String str2, defpackage.abnv abnvVar) {
        defpackage.abor aborVarN = defpackage.acar.a.n();
        aborVarN.t();
        defpackage.acar acarVar = (defpackage.acar) aborVarN.b;
        acarVar.b |= 1;
        acarVar.e = str.concat(java.lang.String.valueOf(str2));
        aborVarN.t();
        defpackage.acar acarVar2 = (defpackage.acar) aborVarN.b;
        acarVar2.c = 32;
        acarVar2.d = abnvVar;
        ((defpackage.npc) this.a).c(aborVarN);
    }

    public final void x(java.lang.String str, java.lang.Number number) {
        java.lang.Object obj = this.a;
        if ((number instanceof java.lang.Float) || (number instanceof java.lang.Double)) {
            double dDoubleValue = number.doubleValue();
            defpackage.abor aborVarN = defpackage.acar.a.n();
            aborVarN.t();
            defpackage.acar acarVar = (defpackage.acar) aborVarN.b;
            acarVar.b |= 1;
            acarVar.e = str;
            aborVarN.t();
            defpackage.acar acarVar2 = (defpackage.acar) aborVarN.b;
            acarVar2.c = 11;
            acarVar2.d = java.lang.Double.valueOf(dDoubleValue);
            ((defpackage.npc) obj).c(aborVarN);
            return;
        }
        long jLongValue = number.longValue();
        defpackage.abor aborVarN2 = defpackage.acar.a.n();
        aborVarN2.t();
        defpackage.acar acarVar3 = (defpackage.acar) aborVarN2.b;
        acarVar3.b |= 1;
        acarVar3.e = str;
        aborVarN2.t();
        defpackage.acar acarVar4 = (defpackage.acar) aborVarN2.b;
        acarVar4.c = 14;
        acarVar4.d = java.lang.Long.valueOf(jLongValue);
        ((defpackage.npc) obj).c(aborVarN2);
    }

    public final void y(java.lang.String str, java.lang.String str2, java.lang.Number number) {
        x(java.lang.String.valueOf(str).concat(java.lang.String.valueOf(str2)), number);
    }

    public final void z(java.lang.String str, java.lang.Number number) {
        y(str, (java.lang.String) this.b, number);
    }

    public rkq(java.lang.String str, java.lang.Object obj) {
        this.b = str;
        this.a = obj;
    }

    public rkq(defpackage.ngb ngbVar, android.content.Context context) {
        this.b = ngbVar;
        this.a = context;
    }

    public rkq(defpackage.yqu yquVar, defpackage.yqt yqtVar) {
        this.a = yquVar;
        this.b = yqtVar;
    }

    public rkq() {
        this.b = new defpackage.zd();
        this.a = new defpackage.zd();
    }

    public rkq(defpackage.npc npcVar, java.lang.String str, boolean z) {
        this.a = npcVar;
        java.lang.String strReplaceAll = "";
        if (str != null && z) {
            strReplaceAll = defpackage.wag.a.matcher(str).replaceAll("");
        }
        this.b = strReplaceAll;
    }

    public rkq(byte[] bArr) {
        defpackage.syy syyVar = new defpackage.syy();
        this.b = new defpackage.yhv();
        this.a = syyVar;
    }

    public rkq(byte[] bArr, byte[] bArr2) {
        this.a = j$.util.DesugarCollections.synchronizedMap(new java.util.WeakHashMap());
        this.b = j$.util.DesugarCollections.synchronizedMap(new java.util.WeakHashMap());
    }

    public rkq(defpackage.rkq rkqVar) {
        this.a = rkqVar.a;
        this.b = ((defpackage.yhv) rkqVar.b).g();
    }

    public rkq(android.content.Context context) {
        this.b = new defpackage.wgf();
        defpackage.acmj.h(context != null, "Context cannot be null", new java.lang.Object[0]);
        this.a = context.getApplicationContext();
    }

    public rkq(defpackage.rli rliVar) {
        this.a = new defpackage.rps(new defpackage.nyj(3));
        this.b = rliVar;
    }

    public rkq(java.util.List list) {
        this.b = new java.util.concurrent.ConcurrentSkipListSet();
        this.a = defpackage.yhx.n(list);
    }

    public rkq(java.util.Set set, byte[] bArr) {
        defpackage.xvk xvkVarC = defpackage.xvk.c(set);
        xvkVarC.getClass();
        this.b = xvkVarC;
        this.a = new uyq(this, 4);
    }

    public rkq(java.lang.Class cls, java.lang.Object obj) {
        this.a = cls;
        this.b = obj;
    }
}
