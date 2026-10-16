package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qnn implements java.util.concurrent.Callable {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public qnn(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return ((qno) this.a).d();
            case 1:
                java.lang.Object obj = this.a;
                synchronized (obj) {
                    if (((htg) obj).f != null) {
                        ((htg) obj).f();
                        if (((htg) obj).g()) {
                            ((htg) obj).d();
                            ((htg) obj).h = 0;
                        }
                    }
                }
                return null;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return ((qno) this.a).c();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.ypu ypuVarAi = defpackage.qsa.a.l().ai(7700);
                defpackage.qsa qsaVar = (defpackage.qsa) this.a;
                ypuVarAi.w("getInitializationStatus on main thread returns %d", qsaVar.b);
                return java.lang.Integer.valueOf(qsaVar.b);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.lang.ref.WeakReference weakReference = ((qsl) this.a).b;
                android.content.Context context = (android.content.Context) weakReference.get();
                if (context == null) {
                    qsl.a.h().ai(7827).u("Context is getting destroyed. Assuming client has unbound, not calling listeners");
                    return null;
                }
                java.io.File fileCreateTempFile = java.io.File.createTempFile("dump", null, context.getCacheDir());
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileCreateTempFile);
                try {
                    rjs.b((android.content.Context) weakReference.get(), fileOutputStream);
                    fileOutputStream.close();
                    return fileCreateTempFile;
                } catch (java.lang.Throwable th) {
                    try {
                        fileOutputStream.close();
                        break;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                android.content.Context context2 = (android.content.Context) ((qsl) this.a).b.get();
                if (context2 == null) {
                    qsl.a.h().ai(7828).u("Context is getting destroyed. Assuming client has unbound, not calling listeners");
                    return null;
                }
                java.io.File fileCreateTempFile2 = java.io.File.createTempFile("dump", null, context2.getCacheDir());
                java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(fileCreateTempFile2);
                try {
                    long jA = rjs.a(fileOutputStream2, 0);
                    fileOutputStream2.close();
                    if (jA > 20000000) {
                        int i = 100000;
                        while (jA > 20000000) {
                            fileCreateTempFile2.delete();
                            fileCreateTempFile2 = java.io.File.createTempFile("dump", null, context2.getCacheDir());
                            java.io.FileOutputStream fileOutputStream3 = new java.io.FileOutputStream(fileCreateTempFile2);
                            try {
                                jA = rjs.a(fileOutputStream3, i);
                                fileOutputStream3.close();
                                i /= 2;
                            } catch (java.lang.Throwable th3) {
                                try {
                                    fileOutputStream3.close();
                                    break;
                                } catch (java.lang.Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        }
                    }
                    return fileCreateTempFile2;
                } catch (java.lang.Throwable th5) {
                    try {
                        fileOutputStream2.close();
                        break;
                    } catch (java.lang.Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Boolean.valueOf(((rng) this.a).a.beginBatchEdit());
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return java.lang.Boolean.valueOf(((rng) this.a).a.endBatchEdit());
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return java.lang.Boolean.valueOf(((rng) this.a).a.finishComposingText());
            default:
                return xwv.a(((xwy) this.a).c(), xwy.d);
        }
    }
}
