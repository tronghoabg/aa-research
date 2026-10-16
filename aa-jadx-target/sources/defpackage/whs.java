package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class whs implements defpackage.whx {
    public final defpackage.zhs a;
    public final java.util.concurrent.Executor b;
    public final defpackage.xyn c;
    public final defpackage.ngb f;
    private final java.lang.String g;
    private final defpackage.wia i;
    public final java.lang.Object d = new java.lang.Object();
    private final defpackage.zhc h = new defpackage.zhc();
    public defpackage.zhs e = null;

    public whs(java.lang.String str, defpackage.zhs zhsVar, defpackage.wia wiaVar, java.util.concurrent.Executor executor, defpackage.ngb ngbVar, defpackage.xyn xynVar) {
        this.g = str;
        this.a = defpackage.ysr.cq(zhsVar);
        this.i = wiaVar;
        this.b = new defpackage.zie(executor);
        this.f = ngbVar;
        this.c = xynVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001a A[Catch: all -> 0x0034, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:11:0x0014, B:12:0x0016, B:14:0x001a, B:15:0x0032), top: B:20:0x0003, inners: #1 }] */
    private final defpackage.zhs d() {
        defpackage.zhs zhsVarCq;
        synchronized (this.d) {
            defpackage.zhs zhsVar = this.e;
            if (zhsVar == null || !zhsVar.isDone()) {
                zhsVarCq = this.e;
                if (zhsVarCq == null) {
                    zhsVarCq = defpackage.ysr.cq(this.h.a(defpackage.xvx.a(new defpackage.vws(this, 3)), this.b));
                    this.e = zhsVarCq;
                }
            } else {
                try {
                    defpackage.ysr.cw(this.e);
                } catch (java.util.concurrent.ExecutionException unused) {
                    this.e = null;
                }
                zhsVarCq = this.e;
                if (zhsVarCq == null) {
                    zhsVarCq = defpackage.ysr.cq(this.h.a(defpackage.xvx.a(new defpackage.vws(this, 3)), this.b));
                    this.e = zhsVarCq;
                }
            }
            throw th;
        }
        return zhsVarCq;
    }

    @Override // defpackage.whx
    public final defpackage.zgm a() {
        return new defpackage.vws(this, 2);
    }

    public final java.lang.Object b(android.net.Uri uri) throws java.io.IOException {
        try {
            try {
                defpackage.xvg xvgVarAY = defpackage.sqs.aY("Read " + this.g);
                try {
                    java.io.InputStream inputStream = (java.io.InputStream) this.f.d(uri, new defpackage.wgs(0));
                    try {
                        defpackage.abpy abpyVarA = this.i.a(inputStream);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        xvgVarAY.close();
                        return abpyVarA;
                    } catch (java.lang.Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    try {
                        xvgVarAY.close();
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (java.io.IOException e) {
                throw vvb.N(this.f, uri, e, this.g);
            }
        } catch (java.io.FileNotFoundException e2) {
            if (this.f.g(uri)) {
                throw e2;
            }
            return this.i.a;
        }
    }

    public final void c(android.net.Uri uri, java.lang.Object obj) throws java.io.IOException {
        android.net.Uri uriBD = defpackage.sqs.bD(uri, ".tmp");
        try {
            defpackage.xvg xvgVarAY = defpackage.sqs.aY("Write " + this.g);
            try {
                wfz wfzVar = new wfz();
                try {
                    defpackage.ngb ngbVar = this.f;
                    wgt wgtVar = new wgt();
                    wgtVar.a = new wfz[]{wfzVar};
                    java.io.OutputStream outputStream = (java.io.OutputStream) ngbVar.d(uriBD, wgtVar);
                    try {
                        ((defpackage.abpy) obj).g(outputStream);
                        wfzVar.a();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        xvgVarAY.close();
                        this.f.f(uriBD, uri);
                    } catch (java.lang.Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (java.io.IOException e) {
                    throw vvb.N(this.f, uri, e, this.g);
                }
            } catch (java.lang.Throwable th3) {
                try {
                    xvgVarAY.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (java.io.IOException e2) {
            defpackage.ngb ngbVar2 = this.f;
            if (ngbVar2.g(uriBD)) {
                try {
                    ngbVar2.e(uriBD);
                } catch (java.io.IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }

    @Override // defpackage.whx
    public final java.lang.String e() {
        return this.g;
    }

    @Override // defpackage.whx
    public final defpackage.zhs h() {
        return d();
    }

    @Override // defpackage.whx
    public final defpackage.zhs i(defpackage.zgn zgnVar, java.util.concurrent.Executor executor) {
        return this.h.a(defpackage.xvx.a(new whu(this, d(), zgnVar, executor, 1)), defpackage.zgt.INSTANCE);
    }
}
