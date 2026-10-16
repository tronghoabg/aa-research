package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class egs implements defpackage.eew {
    public final defpackage.egw a;
    public final defpackage.afer b;
    public final java.util.concurrent.atomic.AtomicBoolean c;
    private final java.io.File d;
    private final defpackage.ehh e;
    private final ajey f;

    public egs(java.io.File file, defpackage.ehh ehhVar, defpackage.egw egwVar, defpackage.afer aferVar) {
        egwVar.getClass();
        this.d = file;
        this.e = ehhVar;
        this.a = egwVar;
        this.b = aferVar;
        this.c = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f = new ajey();
    }

    private final void d() {
        if (this.c.get()) {
            throw new java.lang.IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    @Override // defpackage.eew
    public final void a() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e A[Catch: all -> 0x006f, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x006f, blocks: (B:30:0x006e, B:40:0x007f, B:39:0x007c, B:36:0x0077), top: B:56:0x001f, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [affh] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6, types: [boolean] */
    public final java.lang.Object b(defpackage.affh affhVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.egq egqVar;
        ?? C;
        java.lang.Throwable th;
        java.lang.Throwable th2;
        defpackage.ego egoVar;
        ?? r8;
        if (afdkVar instanceof defpackage.egq) {
            egqVar = (defpackage.egq) afdkVar;
            int i = egqVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                egqVar.d = i - Integer.MIN_VALUE;
            } else {
                egqVar = new defpackage.egq(this, afdkVar);
            }
        } else {
            egqVar = new defpackage.egq(this, afdkVar);
        }
        java.lang.Object obj = egqVar.b;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = egqVar.d;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                affhVar = egqVar.a;
                egoVar = egqVar.e;
                try {
                    defpackage.afga.cz(obj);
                    r8 = affhVar;
                    try {
                        egoVar.a();
                        th = null;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        this.f.d();
                    }
                    return obj;
                } catch (java.lang.Throwable th4) {
                    th2 = th4;
                    try {
                        egoVar.a();
                    } catch (java.lang.Throwable th5) {
                        defpackage.adrs.E(th2, th5);
                    }
                    throw th2;
                }
            }
            defpackage.afga.cz(obj);
            d();
            C = this.f.c();
            try {
                defpackage.ego egoVar2 = new defpackage.ego(this.d, this.e);
                try {
                    java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf((boolean) C);
                    egqVar.e = egoVar2;
                    egqVar.a = C;
                    egqVar.d = 1;
                    java.lang.Object objInvoke = affhVar.invoke(egoVar2, boolValueOf, egqVar);
                    if (objInvoke == afdrVar) {
                        return afdrVar;
                    }
                    obj = objInvoke;
                    r8 = C == true ? 1 : 0;
                    egoVar = egoVar2;
                    egoVar.a();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        this.f.d();
                    }
                    return obj;
                } catch (java.lang.Throwable th6) {
                    th2 = th6;
                    affhVar = C == true ? 1 : 0;
                    egoVar = egoVar2;
                    egoVar.a();
                    throw th2;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                if (C != 0) {
                    this.f.d();
                }
                throw th;
            }
        } catch (java.lang.Throwable th8) {
            C = affhVar;
            th = th8;
            if (C != 0) {
                this.f.d();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a1 A[Catch: all -> 0x00ca, IOException -> 0x00cc, TRY_ENTER, TryCatch #8 {IOException -> 0x00cc, all -> 0x00ca, blocks: (B:31:0x00a1, B:33:0x00aa, B:36:0x00bb, B:43:0x00c9, B:42:0x00c6, B:39:0x00c1), top: B:62:0x0023, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00aa A[Catch: all -> 0x00ca, IOException -> 0x00cc, TRY_LEAVE, TryCatch #8 {IOException -> 0x00cc, all -> 0x00ca, blocks: (B:31:0x00a1, B:33:0x00aa, B:36:0x00bb, B:43:0x00c9, B:42:0x00c6, B:39:0x00c1), top: B:62:0x0023, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bb A[Catch: all -> 0x00ca, IOException -> 0x00cc, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x00cc, all -> 0x00ca, blocks: (B:31:0x00a1, B:33:0x00aa, B:36:0x00bb, B:43:0x00c9, B:42:0x00c6, B:39:0x00c1), top: B:62:0x0023, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00dd A[Catch: all -> 0x0104, TryCatch #1 {all -> 0x0104, blocks: (B:51:0x00d4, B:53:0x00dd, B:54:0x00e3, B:55:0x0103, B:22:0x0064, B:23:0x0080), top: B:62:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4, types: [ajey] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12 */
    public final java.lang.Object c(defpackage.affg affgVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.egr egrVar;
        ?? file;
        defpackage.egr egrVar2;
        defpackage.ego egoVar;
        java.lang.Throwable th;
        defpackage.ego egoVar2;
        ?? r2;
        if (afdkVar instanceof defpackage.egr) {
            egrVar = (defpackage.egr) afdkVar;
            int i = egrVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                egrVar.d = i - Integer.MIN_VALUE;
            } else {
                egrVar = new defpackage.egr(this, afdkVar);
            }
        } else {
            egrVar = new defpackage.egr(this, afdkVar);
        }
        ?? r10 = egrVar.b;
        ?? r3 = defpackage.afdr.a;
        int i2 = egrVar.d;
        java.lang.Throwable th2 = null;
        try {
            try {
                try {
                    try {
                        if (i2 == 0) {
                            defpackage.afga.cz(r10);
                            d();
                            defpackage.eev.a(this.d);
                            egrVar2 = this.f;
                            egrVar.e = (defpackage.egj) affgVar;
                            egrVar.f = egrVar2;
                            egrVar.d = 1;
                            if (egrVar2.b(egrVar) != r3) {
                            }
                            return r3;
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            egoVar2 = egrVar.g;
                            r3 = egrVar.a;
                            egrVar = egrVar.f;
                            try {
                                defpackage.afga.cz(r10);
                                r2 = r3;
                                try {
                                    egoVar2.a();
                                } catch (java.lang.Throwable th3) {
                                    th2 = th3;
                                }
                                if (th2 == null) {
                                    throw th2;
                                }
                                if (((java.io.File) r2).exists()) {
                                    java.io.File file2 = this.d;
                                    r2.getClass();
                                    defpackage.eev.b((java.io.File) r2, file2);
                                }
                                egrVar.d();
                                return defpackage.afbk.a;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                try {
                                    egoVar2.a();
                                } catch (java.lang.Throwable th5) {
                                    defpackage.adrs.E(th, th5);
                                }
                                throw th;
                            }
                        }
                        defpackage.egr egrVar3 = egrVar.f;
                        defpackage.egj egjVar = egrVar.e;
                        defpackage.afga.cz(r10);
                        egrVar2 = egrVar3;
                        affgVar = egjVar;
                        egrVar.e = null;
                        egrVar.f = egrVar2;
                        egrVar.a = file;
                        egrVar.g = egoVar;
                        egrVar.d = 2;
                        if (affgVar.invoke(egoVar, egrVar) != r3) {
                            egrVar = egrVar2;
                            r2 = file;
                            egoVar2 = egoVar;
                            egoVar2.a();
                            if (th2 == null) {
                                throw th2;
                            }
                            if (((java.io.File) r2).exists()) {
                                java.io.File file3 = this.d;
                                r2.getClass();
                                defpackage.eev.b((java.io.File) r2, file3);
                            }
                            egrVar.d();
                            return defpackage.afbk.a;
                        }
                        return r3;
                    } catch (java.lang.Throwable th6) {
                        egrVar = egrVar2;
                        r3 = file;
                        th = th6;
                        egoVar2 = egoVar;
                        egoVar2.a();
                        throw th;
                    }
                    egoVar = new defpackage.ego(file, this.e);
                } catch (java.io.IOException e) {
                    e = e;
                    if (((java.io.File) file).exists()) {
                        ((java.io.File) file).delete();
                    }
                    throw new java.io.IOException("Unable to rename " + file + " to " + this.d + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.", e);
                }
                file = new java.io.File(this.d.getAbsolutePath() + ".tmp");
            } catch (java.lang.Throwable th7) {
                th = th7;
                r10.d();
                throw th;
            }
        } catch (java.io.IOException e2) {
            e = e2;
            file = r3;
            if (((java.io.File) file).exists()) {
                ((java.io.File) file).delete();
            }
            throw new java.io.IOException("Unable to rename " + file + " to " + this.d + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.", e);
        } catch (java.lang.Throwable th8) {
            th = th8;
            r10 = egrVar;
            r10.d();
            throw th;
        }
    }
}
