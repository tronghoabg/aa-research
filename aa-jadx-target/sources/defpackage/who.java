package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class who implements defpackage.whx {
    public final defpackage.zhs a;
    public final java.util.concurrent.Executor b;
    public final defpackage.xyn c;
    public final defpackage.xuo e;
    public final java.lang.String f;
    public final defpackage.ngb i;
    private final defpackage.wia m;
    public final defpackage.zhc d = new defpackage.zhc();
    private final defpackage.zhc j = new defpackage.zhc();
    public final defpackage.whn g = new defpackage.whn(this);
    private final java.util.concurrent.atomic.AtomicBoolean k = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicReference h = new java.util.concurrent.atomic.AtomicReference(null);
    private final java.util.concurrent.atomic.AtomicReference l = new java.util.concurrent.atomic.AtomicReference(null);

    public who(java.lang.String str, defpackage.zhs zhsVar, defpackage.wia wiaVar, java.util.concurrent.Executor executor, defpackage.ngb ngbVar, defpackage.xyn xynVar, defpackage.sqs sqsVar) {
        this.f = str;
        this.a = defpackage.ysr.cq(zhsVar);
        this.m = wiaVar;
        this.b = executor;
        this.i = ngbVar;
        this.c = xynVar;
        this.e = new defpackage.xuo(new defpackage.vtx(this, 6), executor);
    }

    public static defpackage.zhs b(defpackage.zhs zhsVar, java.io.Closeable closeable, java.util.concurrent.Executor executor) {
        return defpackage.ysr.ck(zhsVar).a(new pgj(closeable, zhsVar, 10, (byte[]) null), executor);
    }

    public static boolean g(java.io.IOException iOException) {
        return (iOException instanceof wgc) || (iOException.getCause() instanceof wgc);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wgi */
    private final void j(android.net.Uri uri, java.io.IOException iOException) throws wgi, java.io.IOException {
        defpackage.ngb ngbVar = this.i;
        if (!ngbVar.g(uri)) {
            throw iOException;
        }
        try {
            ngbVar.e(uri);
            throw iOException;
        } catch (java.io.IOException e) {
            iOException.addSuppressed(e);
            throw iOException;
        }
    }

    @Override // defpackage.whx
    public final defpackage.zgm a() {
        return new defpackage.vtx(this, 5);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final java.lang.Object c(android.net.Uri uri) throws java.io.IOException {
        try {
            try {
                defpackage.xvg xvgVarBG = defpackage.ysr.bG("Read " + this.f, defpackage.xvj.a, false);
                try {
                    java.io.InputStream inputStream = (java.io.InputStream) this.i.d(uri, new defpackage.wgs(0));
                    try {
                        defpackage.abpy abpyVarA = this.m.a(inputStream);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        xvgVarBG.close();
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
                        xvgVarBG.close();
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (java.io.IOException e) {
                throw vvb.N(this.i, uri, e, this.f);
            }
        } catch (java.io.FileNotFoundException unused) {
            defpackage.ngb ngbVar = this.i;
            if (!ngbVar.g(uri)) {
                return this.m.a;
            }
            java.io.InputStream inputStream2 = (java.io.InputStream) ngbVar.d(uri, new defpackage.wgs(0));
            try {
                defpackage.abpy abpyVarA2 = this.m.a(inputStream2);
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                return abpyVarA2;
            } catch (java.lang.Throwable th5) {
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (java.lang.Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        }
    }

    public final java.lang.Object d(android.net.Uri uri, com.google.android.libraries.storage.protostore.MappedCounterCacheVersion mappedCounterCacheVersion) throws java.io.IOException {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.h;
        android.util.Pair pair = (android.util.Pair) atomicReference.get();
        long jA = mappedCounterCacheVersion.a();
        if (pair != null && ((java.lang.Long) pair.second).longValue() == jA) {
            return pair.first;
        }
        defpackage.ngb ngbVar = this.i;
        defpackage.wgq wgqVar = new defpackage.wgq(true);
        wgqVar.a = true;
        java.io.Closeable closeable = (java.io.Closeable) ngbVar.d(uri, wgqVar);
        try {
            java.lang.Object objC = c(uri);
            if (this.k.get()) {
                this.l.set(objC);
            }
            if (closeable != null) {
                atomicReference.set(android.util.Pair.create(objC, java.lang.Long.valueOf(jA)));
            }
            if (closeable != null) {
                closeable.close();
            }
            return objC;
        } catch (java.lang.Throwable th) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.whx
    public final java.lang.String e() {
        return this.f;
    }

    public final void f(android.net.Uri uri, java.lang.Object obj, com.google.android.libraries.storage.protostore.MappedCounterCacheVersion mappedCounterCacheVersion) throws java.io.IOException {
        android.net.Uri uriBD = defpackage.sqs.bD(uri, ".tmp");
        try {
            wfz wfzVar = new wfz();
            try {
                defpackage.ngb ngbVar = this.i;
                wgt wgtVar = new wgt();
                wgtVar.a = new wfz[]{wfzVar};
                java.io.OutputStream outputStream = (java.io.OutputStream) ngbVar.d(uriBD, wgtVar);
                try {
                    ((defpackage.abpy) obj).g(outputStream);
                    wfzVar.a();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    long jNativeIncrementCounter = com.google.android.libraries.storage.protostore.MappedCounterCacheVersion.nativeIncrementCounter(mappedCounterCacheVersion.a);
                    android.net.Uri uriBD2 = defpackage.sqs.bD(uri, ".tmp");
                    try {
                        this.i.f(uriBD2, uri);
                    } catch (java.io.IOException e) {
                        j(uriBD2, e);
                    }
                    if (this.k.get()) {
                        this.l.set(obj);
                    }
                    this.h.set(android.util.Pair.create(obj, java.lang.Long.valueOf(jNativeIncrementCounter)));
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
            } catch (java.io.IOException e2) {
                throw vvb.N(this.i, uri, e2, this.f);
            }
        } catch (java.io.IOException e3) {
            j(uriBD, e3);
        }
    }

    @Override // defpackage.whx
    public final defpackage.zhs h() {
        try {
            defpackage.zhs zhsVarA = this.e.a();
            defpackage.ysr.bn(zhsVarA.isDone(), "Future was expected to be done: %s", zhsVarA);
            final com.google.android.libraries.storage.protostore.MappedCounterCacheVersion mappedCounterCacheVersion = (com.google.android.libraries.storage.protostore.MappedCounterCacheVersion) defpackage.a.K(zhsVarA);
            android.util.Pair pair = (android.util.Pair) this.h.get();
            if (pair != null && ((java.lang.Long) pair.second).longValue() == mappedCounterCacheVersion.a()) {
                java.lang.Object obj = pair.first;
                return obj == null ? defpackage.zho.a : new defpackage.zho(obj);
            }
            defpackage.zhc zhcVar = this.j;
            defpackage.zgm zgmVar = new defpackage.zgm() { // from class: whk
                @Override // defpackage.zgm
                public final defpackage.zhs a() {
                    defpackage.who whoVar = this.a;
                    defpackage.zhs zhsVar = whoVar.a;
                    defpackage.ysr.bn(zhsVar.isDone(), "Future was expected to be done: %s", zhsVar);
                    android.net.Uri uri = (android.net.Uri) defpackage.a.K(zhsVar);
                    com.google.android.libraries.storage.protostore.MappedCounterCacheVersion mappedCounterCacheVersion2 = mappedCounterCacheVersion;
                    try {
                        java.lang.Object objD = whoVar.d(uri, mappedCounterCacheVersion2);
                        return objD == null ? defpackage.zho.a : new defpackage.zho(objD);
                    } catch (java.io.IOException e) {
                        defpackage.xyn xynVar = whoVar.c;
                        if (!xynVar.f()) {
                            return new defpackage.zif(e);
                        }
                        if (defpackage.who.g(e)) {
                            return new defpackage.zif(e);
                        }
                        java.lang.Object objB = xynVar.b();
                        defpackage.zhc zhcVar2 = whoVar.d;
                        defpackage.whj whjVar = new defpackage.whj(whoVar, uri, (defpackage.kwv) objB, 2);
                        int i = defpackage.xvx.a;
                        defpackage.zgy zgyVar = new defpackage.zgy(defpackage.xuy.e(), whjVar, 1);
                        java.util.concurrent.Executor executor = whoVar.b;
                        defpackage.zhs zhsVarA2 = zhcVar2.a(zgyVar, executor);
                        defpackage.xvv xvvVar = new defpackage.xvv(defpackage.xuy.e(), new pwy(whoVar, uri, mappedCounterCacheVersion2, 4, (byte[]) null));
                        int i2 = defpackage.zgh.c;
                        defpackage.zgf zgfVar = new defpackage.zgf(zhsVarA2, xvvVar);
                        zhsVarA2.c(zgfVar, defpackage.ysr.ch(executor, zgfVar));
                        return zgfVar;
                    }
                }
            };
            int i = defpackage.xvx.a;
            return zhcVar.a(new defpackage.zgy(defpackage.xuy.e(), zgmVar, 1), this.b);
        } catch (java.util.concurrent.ExecutionException e) {
            return new defpackage.zif(e);
        }
    }

    @Override // defpackage.whx
    public final defpackage.zhs i(defpackage.zgn zgnVar, java.util.concurrent.Executor executor) {
        return this.d.a(defpackage.xvx.a(new defpackage.whj(this, zgnVar, executor, 0)), this.b);
    }
}
