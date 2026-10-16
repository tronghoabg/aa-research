package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
abstract class wcz extends defpackage.wck implements defpackage.wcn {
    private volatile int d;
    private defpackage.khb e;

    public wcz(java.lang.String str, java.lang.String str2, defpackage.wdo wdoVar) {
        super(str, str2, wdoVar);
        this.d = -1;
    }

    @Override // defpackage.wcn
    public final int a() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c A[Catch: all -> 0x0101, TryCatch #0 {, blocks: (B:7:0x0012, B:9:0x0019, B:11:0x001f, B:12:0x0028, B:14:0x0038, B:16:0x0042, B:52:0x00ed, B:54:0x00f3, B:55:0x00f9, B:21:0x004d, B:23:0x005c, B:26:0x0071, B:31:0x007d, B:32:0x0083, B:34:0x0091, B:36:0x009d, B:38:0x00a5, B:39:0x00bf, B:42:0x00ce, B:48:0x00e4, B:47:0x00d7, B:57:0x00fb), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[Catch: all -> 0x0101, TryCatch #0 {, blocks: (B:7:0x0012, B:9:0x0019, B:11:0x001f, B:12:0x0028, B:14:0x0038, B:16:0x0042, B:52:0x00ed, B:54:0x00f3, B:55:0x00f9, B:21:0x004d, B:23:0x005c, B:26:0x0071, B:31:0x007d, B:32:0x0083, B:34:0x0091, B:36:0x009d, B:38:0x00a5, B:39:0x00bf, B:42:0x00ce, B:48:0x00e4, B:47:0x00d7, B:57:0x00fb), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x007d A[Catch: all -> 0x0101, TryCatch #0 {, blocks: (B:7:0x0012, B:9:0x0019, B:11:0x001f, B:12:0x0028, B:14:0x0038, B:16:0x0042, B:52:0x00ed, B:54:0x00f3, B:55:0x00f9, B:21:0x004d, B:23:0x005c, B:26:0x0071, B:31:0x007d, B:32:0x0083, B:34:0x0091, B:36:0x009d, B:38:0x00a5, B:39:0x00bf, B:42:0x00ce, B:48:0x00e4, B:47:0x00d7, B:57:0x00fb), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // defpackage.wck
    protected final java.lang.Object f(defpackage.wba wbaVar) throws java.io.IOException {
        defpackage.wdn wdnVarA;
        android.content.Context context;
        defpackage.xyn xynVarA;
        java.lang.Object objFH;
        java.lang.String str;
        java.lang.Object obj;
        java.lang.String strE;
        int iA = a();
        if (iA == -1 || iA < i().f()) {
            synchronized (this) {
                int iA2 = a();
                byte[] bArrB = 0;
                java.lang.Object objE = 0;
                bArrB = 0;
                if (iA2 != -1) {
                    wdnVarA = null;
                } else if (defpackage.wba.d()) {
                    j(new defpackage.khb((byte[]) null, (byte[]) null, (byte[]) null));
                    wdnVarA = null;
                } else {
                    wbaVar.getClass();
                    wdnVarA = this.c.a(wbaVar);
                    j(wdnVarA.j);
                }
                int iF = i().f();
                if (iA2 < iF) {
                    boolean zD = defpackage.wba.d();
                    if (wbaVar != null) {
                        wbaVar.getClass();
                        context = wbaVar.c;
                        xynVarA = defpackage.waw.a(context);
                        if (xynVarA.f()) {
                            strE = ((defpackage.roy) xynVarA.b()).e(defpackage.way.a(this.a), null, this.b);
                            if (strE == null) {
                                objFH = null;
                            } else {
                                objFH = fH(strE);
                            }
                        } else {
                            objFH = null;
                        }
                        if (!zD) {
                            if (wdnVarA == null) {
                                wdnVarA = this.c.a(wbaVar);
                            }
                            str = wdnVarA.e;
                            if (!context.getPackageName().equals("com.android.vending") && !context.getPackageName().equals("com.google.android.wearable.app.cn") && !str.startsWith("com.google.android.gms.measurement#")) {
                                defpackage.zhs zhsVarC = wbaVar.b().submit(new defpackage.kfq(wbaVar, str, 20, bArrB));
                                zhsVarC.c(new defpackage.wyl(zhsVarC, 1), defpackage.zgt.INSTANCE);
                            }
                            obj = wdnVarA.a().e.get(this.b);
                            if (obj != null) {
                                try {
                                    bArrB = b(obj);
                                } catch (java.io.IOException | java.lang.ClassCastException e) {
                                    android.util.Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.b), e);
                                }
                            }
                            objE = bArrB;
                            if (xynVarA.f()) {
                            }
                        }
                        objE = objFH;
                    } else if (!zD) {
                        zD = false;
                        wbaVar.getClass();
                        context = wbaVar.c;
                        xynVarA = defpackage.waw.a(context);
                        if (xynVarA.f()) {
                            strE = ((defpackage.roy) xynVarA.b()).e(defpackage.way.a(this.a), null, this.b);
                            if (strE == null) {
                                objFH = null;
                            } else {
                                objFH = fH(strE);
                            }
                        } else {
                            objFH = null;
                        }
                        if (!zD) {
                            if (wdnVarA == null) {
                                wdnVarA = this.c.a(wbaVar);
                            }
                            str = wdnVarA.e;
                            if (!context.getPackageName().equals("com.android.vending")) {
                                defpackage.zhs zhsVarC2 = wbaVar.b().submit(new defpackage.kfq(wbaVar, str, 20, bArrB));
                                zhsVarC2.c(new defpackage.wyl(zhsVarC2, 1), defpackage.zgt.INSTANCE);
                            }
                            obj = wdnVarA.a().e.get(this.b);
                            if (obj != null) {
                                bArrB = b(obj);
                            }
                            objE = bArrB;
                            if (xynVarA.f()) {
                            }
                        }
                        objE = objFH;
                    }
                    if (objE == 0) {
                        objE = e();
                    }
                    if (objE != 0) {
                        g(objE);
                        h(iF);
                    }
                    return objE;
                }
            }
        }
        return d();
    }

    @Override // defpackage.wcn
    public final void h(int i) {
        this.d = i;
    }

    @Override // defpackage.wcn
    public final defpackage.khb i() {
        return this.e;
    }

    @Override // defpackage.wcn
    public final void j(defpackage.khb khbVar) {
        this.e = khbVar;
    }
}
