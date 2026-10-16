package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class pmg implements defpackage.xzi {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ pmg(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [aclm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, xzi] */
    /* JADX WARN: Type inference failed for: r0v36, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, zhv] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v34, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v48, types: [aclm, java.lang.Object] */
    @Override // defpackage.xzi
    public final java.lang.Object fF() {
        boolean z = true;
        java.lang.String strA = null;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                java.lang.Object obj = this.b;
                obj.getClass();
                return this.a.submit(new defpackage.fma(obj, 10));
            case 1:
                if (defpackage.mdp.d().w()) {
                    android.content.Context context = ((defpackage.lxe) this.a).b;
                    defpackage.mkj mkjVarB = defpackage.mkc.b();
                    java.lang.String defaultSmsPackage = android.provider.Telephony.Sms.getDefaultSmsPackage(context);
                    if (defaultSmsPackage != null) {
                        defpackage.qsh qshVar = (defpackage.qsh) this.b;
                        if (mkjVarB.d(qshVar, defaultSmsPackage, defpackage.qqe.g) && mkjVarB.d(qshVar, defaultSmsPackage, defpackage.qqe.b)) {
                            ((defpackage.yqj) ((defpackage.yqj) defpackage.lxe.a.f()).ai((char) 4422)).y("SMS not enabled because the default SMS app <%s> says it will handle SMSs", defaultSmsPackage);
                            defpackage.omf.u().C(defpackage.zaa.SMS_RECEIVER_DISABLED_DUE_TO_DEFAULT_SMS_APP_SUPPORT, defaultSmsPackage);
                            z = false;
                        }
                    }
                    defpackage.omf.u().C(defpackage.zaa.SMS_RECEIVER_ENABLED, defaultSmsPackage);
                } else {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return ((pzd) this.a).v(((pzf) this.b).Q, (android.accounts.Account) null, (java.lang.String) null);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                qbo qboVar = new qbo(((pzc) this.b.a()).a(), (defpackage.sr) this.a);
                vbn.d();
                java.util.concurrent.atomic.AtomicInteger atomicInteger = qboVar.b;
                android.content.SharedPreferences sharedPreferences = qboVar.a;
                atomicInteger.set(sharedPreferences.getInt("activationId", 1));
                qboVar.c.set(sharedPreferences.getInt("sequenceId", (int) (java.lang.Math.random() * 1.073741824E9d)));
                qboVar.e = sharedPreferences.getString("previousClientEventId", null);
                qboVar.f = sharedPreferences.getString("baseEventId", qbo.b());
                if (qba.b(qboVar.f) == null) {
                    qboVar.f = qbo.b();
                }
                vbn.d();
                qboVar.d.clear();
                defpackage.sr srVar = qboVar.g;
                if (srVar != null) {
                    srVar.a.put(qboVar.getClass().getName(), new defpackage.rox());
                }
                return qboVar;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new sqb((android.content.Context) this.a, (spp) this.b);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                com.google.android.gms.carsetup.FirstActivityImpl firstActivityImpl = (com.google.android.gms.carsetup.FirstActivityImpl) this.b;
                firstActivityImpl.q = firstActivityImpl.q();
                firstActivityImpl.q.c();
                firstActivityImpl.B(2);
                return new com.google.android.gms.carsetup.FirstActivityImpl.LocalBinder(firstActivityImpl, (android.content.Intent) this.a, new defpackage.slu(firstActivityImpl.q));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return new sjc((sji) this.a, (java.lang.String) this.b);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.sr srVar2 = (defpackage.sr) this.a;
                if (srVar2.t(pzj.bi)) {
                    return java.lang.Boolean.valueOf(srVar2.t(pzj.bj));
                }
                return java.lang.Boolean.FALSE;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.yhx yhxVar = tyk.a;
                vbn.d();
                return ((java.lang.Boolean) this.b.fF()).booleanValue() ? defpackage.xyn.h(new ura((android.content.res.Resources) this.a)) : defpackage.xxe.a;
            case 9:
                if (pzi.a((android.content.Context) this.a, pzj.aR)) {
                    ((defpackage.qsr) this.b).d();
                }
                return java.lang.Boolean.FALSE;
            case 10:
                defpackage.ypg ypgVar = uqk.a;
                return new plv(zxp.f().j, plt.u, (plr) this.a.a(), (defpackage.vlu) null);
            case 11:
                return pmu.a.b((android.content.Context) this.a, ((defpackage.zps) this.b).g());
            case 12:
                android.content.pm.PackageManager packageManager = ((android.content.Context) this.a).getPackageManager();
                packageManager.getClass();
                java.lang.String strG = ((defpackage.zps) this.b).g();
                pmu pmuVar = pmu.a;
                try {
                    android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(strG, 64);
                    if (packageInfo != null && packageInfo.signatures != null && packageInfo.signatures.length != 0 && packageInfo.signatures[0] != null) {
                        strA = pmu.a(packageInfo.signatures[0]);
                    }
                    break;
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                }
                strA.getClass();
                return strA;
            case 13:
                java.lang.Object obj2 = this.a;
                synchronized (this.b) {
                    java.lang.String strA2 = defpackage.vrn.a();
                    java.lang.String strBJ = defpackage.a.bJ(strA2, ".trace");
                    java.io.File file = new java.io.File(((android.content.Context) obj2).getFilesDir(), defpackage.a.bA(strA2, "primes_profiling_"));
                    if (!file.exists() && !file.mkdir()) {
                        ((defpackage.ype) ((defpackage.ype) vmf.a.e()).ai(9835)).u("Could not create directory");
                        return defpackage.xxe.a;
                    }
                    java.io.File file2 = new java.io.File(file, strBJ);
                    file2.deleteOnExit();
                    try {
                        if (file2.exists()) {
                            file2.delete();
                        }
                        break;
                    } catch (java.lang.RuntimeException e) {
                        ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.e()).p(e)).ai((char) 9834)).u("Exception when clearing trace file.");
                    }
                    return defpackage.xyn.h(file2);
                }
            default:
                java.lang.Object obj3 = this.b;
                java.lang.String str = zzf.a;
                accw accwVar = accw.a;
                return new zsm((android.content.Context) this.a, "DATA_ServerControlledParametersManager.data.v1.".concat(java.lang.String.valueOf(obj3)), defpackage.abox.L(accw.class));
        }
    }

    public /* synthetic */ pmg(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
