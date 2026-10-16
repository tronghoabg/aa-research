package com.google.android.apps.auto.components.bugreport;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class BugreportRequester {
    public static com.google.android.apps.auto.components.bugreport.BugreportRequester d;
    public final java.util.concurrent.atomic.AtomicInteger g = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.concurrent.atomic.AtomicBoolean h = new java.util.concurrent.atomic.AtomicBoolean();
    public static final defpackage.yqm a = defpackage.yqm.c("GH.BugreportRequester");
    public static final defpackage.lbs b = new defpackage.kge();
    public static final android.content.ComponentName c = new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.components.bugreport.BugreportRequester");
    static final java.util.concurrent.Executor e = java.util.concurrent.Executors.newSingleThreadExecutor();
    static final java.util.function.BiFunction f = new defpackage.kgf(0);

    public BugreportRequester(android.content.Context context, defpackage.jrm jrmVar) {
        defpackage.ysr.aQ(new defpackage.jbr(context, jrmVar, 5, null));
    }

    public static android.os.ParcelFileDescriptor a(java.io.File file) {
        try {
            return android.os.ParcelFileDescriptor.open(file, 704643072);
        } catch (java.io.FileNotFoundException e2) {
            defpackage.rox.p("GH.BugreportRequester", e2, "Couldn't create ParcelFileDescriptor for %s", file);
            throw new java.lang.IllegalArgumentException(e2);
        }
    }

    public static com.google.android.apps.auto.components.bugreport.BugreportRequester b() {
        com.google.android.apps.auto.components.bugreport.BugreportRequester bugreportRequester = d;
        bugreportRequester.getClass();
        return bugreportRequester;
    }

    public static defpackage.qtv c(android.content.Context context, j$.time.Instant instant, boolean z) {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        defpackage.qtv qtvVar = (defpackage.qtv) a$.ExternalSyntheticApiModelOutline2.m(f, context, new kgh(atomicReference, z, context, instant));
        atomicReference.set(qtvVar);
        return qtvVar;
    }

    public static java.io.File d(android.content.Context context) {
        java.io.File file = new java.io.File(context.getCacheDir(), "bugreports");
        if (!file.exists() && !file.mkdirs()) {
            defpackage.rox.o("GH.BugreportRequester", "Couldn't create directory %s", file);
        }
        return file;
    }

    static java.lang.String e(java.lang.String str, int i) {
        return str.length() <= i ? str : str.substring(str.length() - i);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static void f(android.content.Context context, j$.time.Instant instant, defpackage.qsh qshVar, boolean z) {
        if (defpackage.mkp.a != null) {
            defpackage.ygw ygwVarQ = defpackage.ygw.q(com.google.android.gms.car.display.CarDisplayId.a);
            try {
                ygwVarQ = (defpackage.ygw) j$.util.Collection.-EL.stream(defpackage.oml.p(qshVar).a()).map(new defpackage.khy(1)).collect(defpackage.yds.a);
            } catch (defpackage.qst | defpackage.qsu e2) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e2)).ai((char) 3025)).u("Error getting car displays");
            }
            int size = ygwVarQ.size();
            boolean z2 = false;
            for (int i = 0; i < size; i++) {
                com.google.android.gms.car.display.CarDisplayId carDisplayId = (com.google.android.gms.car.display.CarDisplayId) ygwVarQ.get(i);
                try {
                    defpackage.rei reiVarD = ((defpackage.qtv) qshVar).d();
                    rcf rcfVar = (rcf) ((defpackage.zhs) reiVarD.f.b(new defpackage.rdt(reiVarD, carDisplayId, 2))).get();
                    com.google.android.gms.common.api.Status status = rcfVar.b;
                    if (status.equals(com.google.android.gms.common.api.Status.a)) {
                        android.graphics.Bitmap bitmapA = rcfVar.a();
                        if (z) {
                            java.io.File file = new java.io.File(d(context), defpackage.kgl.g(defpackage.kgl.c(instant), java.lang.Integer.toString(carDisplayId.b)));
                            ((defpackage.yqj) a.l().ai((char) 3044)).y("Temporarily saving screenshot to %s", file.getAbsolutePath());
                            try {
                                java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file));
                                try {
                                    bitmapA.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, bufferedOutputStream);
                                    bufferedOutputStream.close();
                                } catch (java.lang.Throwable th) {
                                    try {
                                        bufferedOutputStream.close();
                                    } catch (java.lang.Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (java.io.IOException e3) {
                                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e3)).ai((char) 3045)).u("Couldn't save screenshot");
                                bitmapA.recycle();
                                if (!z2) {
                                    h(context, defpackage.zbd.CD);
                                    z2 = true;
                                }
                            }
                        }
                        defpackage.ivz.a(context, bitmapA);
                        bitmapA.recycle();
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 3034)).y("Failed to capture screenshot: %s", status);
                    }
                } catch (java.lang.IllegalStateException | java.lang.InterruptedException | java.util.concurrent.ExecutionException | defpackage.qst e4) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e4)).ai((char) 3035)).u("Failed to capture screenshot");
                }
                if (!z2) {
                    h(context, defpackage.zbd.CD);
                    z2 = true;
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public static void g(android.content.Context context, java.lang.String str) throws wfo {
        defpackage.wfp.b();
        java.io.File[] fileArrListFiles = new java.io.File(context.getCacheDir(), "bugreports").listFiles();
        if (fileArrListFiles == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3039)).u("No old files found");
            return;
        }
        try {
            for (java.io.File file : fileArrListFiles) {
                java.lang.String name = file.getName();
                if (name.startsWith(str)) {
                    j$.nio.file.Path path = j$.io.FileRetargetClass.toPath(file);
                    long days = j$.time.Duration.between(j$.time.Instant.ofEpochMilli(j$.nio.file.Files.readAttributes(path, j$.nio.file.attribute.BasicFileAttributes.class, new j$.nio.file.LinkOption[0]).creationTime().toMillis()), j$.time.Instant.now()).toDays();
                    defpackage.yqm yqmVar = a;
                    ((defpackage.yqj) yqmVar.l().ai(3036)).L("Found file %s which is %d days old", name, days);
                    if (days > 7) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(3037)).K("Deleting old file %s which is older than %d days", name, 7);
                        j$.nio.file.Files.delete(path);
                    } else {
                        continue;
                    }
                }
            }
        } catch (java.io.IOException e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e2)).ai((char) 3038)).u("Error deleting old files");
        }
    }

    public static void h(android.content.Context context, defpackage.zbd zbdVar) {
        defpackage.rqt.a(context).c(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.BUGREPORT, zbdVar).l());
    }
}
