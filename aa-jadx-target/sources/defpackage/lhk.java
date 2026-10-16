package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lhk implements defpackage.lhd {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.AvailableAppFinder");
    private static final defpackage.yhx b = new defpackage.ynu(defpackage.nzd.c);
    private final android.content.Context c;
    private final defpackage.yhe f;
    private boolean g;
    private defpackage.ths i;
    private final defpackage.lhj d = new defpackage.lhj();
    private final java.util.List e = new java.util.concurrent.CopyOnWriteArrayList();
    private defpackage.yhx h = defpackage.ynd.a;

    public lhk(android.content.Context context) {
        this.c = context;
        defpackage.mqj mqjVar = new defpackage.mqj(defpackage.mkt.A, defpackage.mqg.NAVIGATION);
        defpackage.mqj mqjVar2 = new defpackage.mqj(defpackage.mkt.s, defpackage.mqg.SYSTEM);
        this.f = defpackage.yhe.l(mqjVar.a, mqjVar, mqjVar2.a, mqjVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final defpackage.yhe j(defpackage.qsh qshVar, defpackage.nze nzeVar) {
        defpackage.yhe yheVarD;
        defpackage.lhk lhkVar = this;
        defpackage.nze nzeVar2 = nzeVar;
        int i = 4;
        defpackage.yha yhaVar = new defpackage.yha(4);
        defpackage.nze nzeVarC = nzeVar2.c(b);
        defpackage.nsn nsnVarE = defpackage.nsn.e();
        java.util.HashSet hashSet = new java.util.HashSet();
        for (defpackage.nzc nzcVar : lhkVar.e) {
            defpackage.lhj lhjVar = lhkVar.d;
            java.lang.String strL = nzcVar.l(nzeVarC);
            java.util.Map map = lhjVar.a;
            defpackage.yhe yheVar = (defpackage.yhe) map.get(strL);
            if (yheVar == null || nzeVar2.a.contains(defpackage.nzd.c)) {
                defpackage.ygw ygwVarB = nzcVar.b(qshVar, nzeVarC);
                defpackage.yha yhaVar2 = new defpackage.yha(i);
                int size = ygwVarB.size();
                for (int i2 = 0; i2 < size; i2++) {
                    defpackage.mqj mqjVar = (defpackage.mqj) ygwVarB.get(i2);
                    if (mqjVar.e) {
                        if (hashSet.contains(mqjVar.a().getPackageName())) {
                            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3921)).y("Skipping %s due to a conflicting driving optimized app", mqjVar);
                        }
                    } else {
                        hashSet.add(mqjVar.a().getPackageName());
                    }
                    if (!nzeVar.f() || nsnVarE.g(mqjVar.a())) {
                        yhaVar2.f(mqjVar.a, mqjVar);
                    }
                }
                yheVarD = yhaVar2.d(false);
                ((defpackage.yqj) a.l().ai((char) 3920)).M("App provider %s found available apps %s", nzcVar, yheVarD);
                map.put(nzcVar.l(nzeVarC), yheVarD);
            } else {
                yheVarD = yheVar;
            }
            yhaVar.h(yheVarD);
            lhkVar = this;
            nzeVar2 = nzeVar;
            i = 4;
        }
        return yhaVar.d(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lhd
    public final defpackage.mqj a(defpackage.qsh qshVar, defpackage.mqi mqiVar) {
        defpackage.mqj mqjVar = (defpackage.mqj) j(qshVar, defpackage.nze.b()).get(mqiVar);
        if (mqjVar != null) {
            return mqjVar;
        }
        if (defpackage.acqh.k() && defpackage.lzm.b(qshVar, false)) {
            defpackage.mdi mdiVarA = defpackage.mdi.a();
            qshVar.getClass();
            mqiVar.getClass();
            if (mdiVarA.d == null) {
                defpackage.mdk mdkVarA = defpackage.mdk.a();
                defpackage.yha yhaVar = new defpackage.yha(4);
                defpackage.ygw ygwVarB = mdkVarA.b(qshVar, defpackage.nze.a());
                int size = ygwVarB.size();
                for (int i = 0; i < size; i++) {
                    defpackage.mqj mqjVar2 = (defpackage.mqj) ygwVarB.get(i);
                    yhaVar.f(mqjVar2.a(), mqjVar2);
                }
                defpackage.ygw ygwVarD = defpackage.mdk.d(qshVar);
                int size2 = ygwVarD.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    defpackage.mqj mqjVar3 = (defpackage.mqj) ygwVarD.get(i2);
                    yhaVar.f(mqjVar3.a(), mqjVar3);
                }
                mdiVarA.d = yhaVar.d(false);
            }
            java.util.Map map = mdiVarA.d;
            if (map == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            defpackage.mqj mqjVar4 = (defpackage.mqj) map.get(mqiVar.a);
            if (mqjVar4 != null) {
                return mqjVar4;
            }
        }
        return (defpackage.mqj) this.f.get(mqiVar);
    }

    @Override // defpackage.lhd
    public final defpackage.yhx b(defpackage.qsh qshVar, defpackage.nze nzeVar) {
        defpackage.yhv yhvVar = new defpackage.yhv();
        yhvVar.k(e(qshVar, nzeVar));
        yhvVar.k(this.f.values());
        return yhvVar.g();
    }

    @Override // defpackage.lhn
    public final void d() {
        this.i = null;
        defpackage.mni.a().d(defpackage.mnh.f);
        f();
        this.g = false;
    }

    @Override // defpackage.lhd
    public final defpackage.yhx e(defpackage.qsh qshVar, defpackage.nze nzeVar) {
        defpackage.yhx yhxVarN = defpackage.yhx.n(j(qshVar, nzeVar).values());
        this.h = yhxVarN;
        return yhxVarN;
    }

    @Override // defpackage.lhn
    public final void eQ() {
        this.g = true;
        j(defpackage.kit.b().e(), defpackage.nze.d(defpackage.nzd.c, defpackage.nzd.a, defpackage.nzd.b));
        defpackage.mni.a().b(defpackage.mnh.f, this);
    }

    @Override // defpackage.lhd
    public final void f() {
        this.d.a.clear();
    }

    @Override // defpackage.lhd
    public final void g(defpackage.nzc nzcVar) {
        defpackage.ysr.bn(!this.g, "Can't register %s. AppProviders must be registered before service is started.", nzcVar);
        this.e.add(nzcVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        int i;
        java.lang.Process processStart;
        try {
            printWriter.println("Last returned launcher components:");
            mnl mnlVarL = mnq.l();
            mnm mnmVarA = mnn.a();
            mnmVarA.a = "Category";
            mnmVarA.b();
            mnmVarA.c('|');
            boolean z = true;
            mnmVarA.d(true);
            mnlVarL.b(mnmVarA.a());
            mnm mnmVarA2 = mnn.a();
            mnmVarA2.a = "Component name";
            mnmVarA2.b();
            mnmVarA2.c('|');
            mnmVarA2.d(true);
            mnlVarL.b(mnmVarA2.a());
            defpackage.yot it = this.h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                defpackage.mqj mqjVar = (defpackage.mqj) it.next();
                mnlVarL.c(new java.lang.Object[]{mqjVar.b, mqjVar});
            }
            mnlVarL.a().m(printWriter);
            java.util.List list = this.e;
            printWriter.printf("\n%d app providers:\n\n", java.lang.Integer.valueOf(list.size()));
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((defpackage.nzc) it2.next()).h(printWriter);
            }
            android.content.Context context = this.c;
            java.lang.String[] strArr = lhl.a;
            java.lang.String str = android.os.Build.TAGS;
            if (str == null || !str.contains("test-keys")) {
                java.lang.String[] strArr2 = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
                int i2 = 0;
                while (true) {
                    if (i2 >= 10) {
                        java.lang.String[] strArr3 = {"/system/xbin/which", "/system/bin/which", "which"};
                        int i3 = 0;
                        while (true) {
                            if (i3 >= 3) {
                                z = false;
                                break;
                            }
                            try {
                                processStart = new java.lang.ProcessBuilder(strArr3[i3], "su").start();
                                try {
                                    if (new java.io.BufferedReader(new java.io.InputStreamReader(processStart.getInputStream())).readLine() != null) {
                                        if (processStart == null) {
                                            break;
                                        }
                                        processStart.destroy();
                                        break;
                                    } else {
                                        if (processStart != null) {
                                            processStart.destroy();
                                        }
                                        i3++;
                                    }
                                } catch (java.lang.Throwable unused) {
                                    if (processStart != null) {
                                    }
                                    i3++;
                                }
                            } catch (java.lang.Throwable unused2) {
                                processStart = null;
                            }
                        }
                    } else if (new java.io.File(strArr2[i2]).exists()) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            java.lang.String[] strArr4 = lhl.a;
            for (int i4 = 0; i4 < 4; i4++) {
                java.lang.String str2 = strArr4[i4];
                try {
                    packageManager.getPackageInfo(str2, 0);
                    arrayList.add(str2);
                } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
                }
            }
            if (z || !arrayList.isEmpty()) {
                printWriter.println();
                printWriter.println("== Possible tampering detected ==");
                if (z) {
                    printWriter.println("Root detected");
                }
                if (!arrayList.isEmpty()) {
                    printWriter.println("Mod packages detected:");
                    int size = arrayList.size();
                    for (i = 0; i < size; i++) {
                        printWriter.println("  ".concat(java.lang.String.valueOf((java.lang.String) arrayList.get(i))));
                    }
                }
                printWriter.println();
            }
        } catch (java.lang.Throwable th) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(th)).ai((char) 3922)).u("Failed to produce report status for AvailableAppFinder");
        }
    }

    @Override // defpackage.lhd
    public final boolean i(defpackage.mqi mqiVar) {
        if (mqiVar == null) {
            return false;
        }
        if (this.i == null) {
            this.i = new defpackage.ths(this.c, defpackage.acqe.a.fF().l());
        }
        android.content.ComponentName componentName = mqiVar.a;
        boolean z = defpackage.maw.e(componentName) && defpackage.maw.d(componentName);
        if (this.i.a(componentName.getPackageName()) || z) {
            return true;
        }
        return (defpackage.maw.c(componentName.getPackageName()) || defpackage.maw.e(componentName) || componentName.getPackageName().equals("com.locnall.KimGiSa")) ? false : true;
    }
}
