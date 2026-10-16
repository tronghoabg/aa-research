package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class leb {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.FeedbackSender");
    public static defpackage.xzi b = new defpackage.imy(11);

    static defpackage.xyn a(android.content.Context context, android.net.Uri uri) {
        try {
            int i = wev.a;
            java.io.InputStream inputStreamB = wev.b(context, uri, weu.a);
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    defpackage.yqm yqmVar = a;
                    ((defpackage.yqj) yqmVar.l().ai(3793)).y("Copying bugreport %s", uri);
                    if (inputStreamB == null) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai(3796)).y("Couldn't find bugreport %s", uri);
                        defpackage.xxe xxeVar = defpackage.xxe.a;
                        byteArrayOutputStream.close();
                        return xxeVar;
                    }
                    defpackage.yux.a(inputStreamB, byteArrayOutputStream);
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    inputStreamB.close();
                    return defpackage.xyn.h(byteArray);
                } catch (java.lang.Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                if (inputStreamB != null) {
                    try {
                        inputStreamB.close();
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (java.io.IOException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 3794)).y("Couldn't read bugreport %s from disk", uri);
            return defpackage.xxe.a;
        } catch (java.lang.OutOfMemoryError e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e2)).ai((char) 3795)).y("Bugreport %s is too large to process", uri);
            return defpackage.xxe.a;
        }
    }

    public static void b(java.util.List list, byte[] bArr, boolean z) {
        ((defpackage.yqj) a.l().ai((char) 3789)).u("Adding bugreport to Feedback PSBD");
        list.add(new com.google.android.gms.feedback.FileTeleporter(bArr, "text/plain", true != z ? "bugreport.zip" : "bugreport_minimal.zip"));
    }

    public static void c(java.util.List list, byte[] bArr) {
        ((defpackage.yqj) a.l().ai((char) 3790)).u("Adding logs to Feedback PSBD");
        list.add(new com.google.android.gms.feedback.FileTeleporter(bArr, "text/logs", "car_logs"));
    }

    public static void d(android.content.Context context, defpackage.zbd zbdVar) {
        defpackage.rqt.a(context).c(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.FEEDBACK, zbdVar).l());
    }

    public static void e(android.content.Context context) {
        java.lang.String strO;
        defpackage.sym.b(context);
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        new android.app.ApplicationErrorReport();
        try {
            strO = ((java.lang.Boolean) ssi.a.a()).booleanValue() ? defpackage.a.ce("_") : defpackage.tis.o();
        } catch (java.lang.SecurityException unused) {
            strO = defpackage.tis.o();
        }
        java.lang.String str = strO;
        android.graphics.Bitmap bitmapB = svx.b((android.app.Activity) context);
        if (bitmapB == null) {
            bitmapB = null;
        }
        new svx(context, (byte[]) null).f(defpackage.tis.w(bitmapB, bundle, null, null, arrayList, null, null, str)).m(new ldz());
    }

    static java.util.Map f(android.content.Context context) {
        defpackage.swx swxVarAS;
        defpackage.swx swxVarAS2;
        java.util.HashMap map = new java.util.HashMap();
        map.put("gearhead_version", "176663424");
        try {
            map.put("gearhead_version_name", context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 3802)).u("Problems fetching gearhead package info ");
        }
        defpackage.kmy kmyVar = (defpackage.kmy) b.fF();
        com.google.android.gms.phenotype.ExperimentTokens experimentTokens = (com.google.android.gms.phenotype.ExperimentTokens) kmyVar.d.get();
        com.google.android.gms.phenotype.ExperimentTokens experimentTokens2 = com.google.android.gms.phenotype.ExperimentTokens.b;
        if (experimentTokens.equals(experimentTokens2)) {
            defpackage.swx swxVarH = kmyVar.b.h("com.google.android.projection.gearhead");
            java.util.concurrent.Executor executor = kmyVar.c;
            swxVarH.l(executor, new kmw(kmyVar, 1));
            swxVarH.k(executor, new kmx(1));
            swxVarAS = swxVarH;
        } else {
            swxVarAS = defpackage.sqs.aS(experimentTokens);
        }
        defpackage.swx swxVarH2 = h(swxVarAS);
        defpackage.kmy kmyVar2 = (defpackage.kmy) b.fF();
        com.google.android.gms.phenotype.ExperimentTokens experimentTokens3 = (com.google.android.gms.phenotype.ExperimentTokens) kmyVar2.e.get();
        if (experimentTokens3.equals(experimentTokens2)) {
            defpackage.swx swxVarH3 = kmyVar2.b.h("com.google.android.gms.car");
            java.util.concurrent.Executor executor2 = kmyVar2.c;
            swxVarH3.l(executor2, new kmw(kmyVar2, 0));
            swxVarH3.k(executor2, new kmx(0));
            swxVarAS2 = swxVarH3;
        } else {
            swxVarAS2 = defpackage.sqs.aS(experimentTokens3);
        }
        defpackage.swx swxVarH4 = h(swxVarAS2);
        try {
            defpackage.dlv.n(new fkg(swxVarH2, swxVarH4, 2)).get(600L, java.util.concurrent.TimeUnit.MILLISECONDS);
            defpackage.abpy abpyVar = (ziq) swxVarH2.e();
            defpackage.abpy abpyVar2 = (ziq) swxVarH4.e();
            if (abpyVar == null) {
                abpyVar = abpyVar2;
            } else if (abpyVar2 != null) {
                defpackage.abor aborVarK = abpyVar.K();
                aborVarK.Q(((ziq) abpyVar2).d);
                abpyVar = (ziq) aborVarK.q();
            }
            if (abpyVar != null) {
                map.put("encryptedExperimentIdsProto", android.util.Base64.encodeToString(abpyVar.h(), 11));
            }
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 3801)).u("Timer exception while waiting for experiment ids.");
        }
        com.google.android.gms.car.CarInfo carInfoB = defpackage.kiv.a().b();
        if (carInfoB != null) {
            map.put("car_manufacturer", carInfoB.a);
            map.put("car_model", carInfoB.b);
            map.put("car_model_year", carInfoB.c);
            map.put("head_unit_make", carInfoB.i);
            map.put("head_unit_model", carInfoB.j);
            map.put("head_unit_software", java.lang.String.format(java.util.Locale.US, "%d.%d:%s:%s", java.lang.Integer.valueOf(carInfoB.e), java.lang.Integer.valueOf(carInfoB.f), carInfoB.k, carInfoB.l));
        }
        defpackage.yzn yznVarB = defpackage.yzn.b((int) defpackage.acxb.b());
        if (yznVarB != null && !defpackage.yzn.UNKNOWN.equals(yznVarB)) {
            map.put("gearhead_channel", yznVarB.name());
        }
        return map;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004c */
    /* JADX WARN: Code duplicated, block: B:107:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x008b  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b1 A[Catch: SecurityException -> 0x00bd, TryCatch #7 {SecurityException -> 0x00bd, blocks: (B:67:0x00a3, B:69:0x00b1, B:70:0x00b8), top: B:98:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8 A[Catch: SecurityException -> 0x00bd, TRY_LEAVE, TryCatch #7 {SecurityException -> 0x00bd, blocks: (B:67:0x00a3, B:69:0x00b1, B:70:0x00b8), top: B:98:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7 A[LOOP:0: B:74:0x00d1->B:76:0x00d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(android.content.Context r24, lbp r25) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.leb.g(android.content.Context, lbp):void");
    }

    private static defpackage.swx h(defpackage.swx swxVar) {
        return swxVar.c(defpackage.zgt.INSTANCE, new skp(1));
    }
}
