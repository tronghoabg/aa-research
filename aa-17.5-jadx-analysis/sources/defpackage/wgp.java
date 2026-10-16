package defpackage;

import android.net.Uri;
import android.util.Pair;
import com.google.android.libraries.storage.protostore.MappedCounterCacheVersion;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class wgp implements wgy {
    public final zgp a;
    public final Executor b;
    public final xxh c;
    public final xti e;
    public final String f;
    public final nfh i;
    private final whb m;
    public final zfz d = new zfz();
    private final zfz j = new zfz();
    public final wgo g = new wgo(this);
    private final AtomicBoolean k = new AtomicBoolean(false);
    public final AtomicReference h = new AtomicReference(null);
    private final AtomicReference l = new AtomicReference(null);

    public wgp(String str, zgp zgpVar, whb whbVar, Executor executor, nfh nfhVar, xxh xxhVar, woy woyVar) {
        this.f = str;
        this.a = wub.Z(zgpVar);
        this.m = whbVar;
        this.b = executor;
        this.i = nfhVar;
        this.c = xxhVar;
        this.e = new xti(new vtb(this, 6), executor);
    }

    public static zgp b(zgp zgpVar, Closeable closeable, Executor executor) {
        return wub.T(zgpVar).a(new pfl(closeable, zgpVar, 10, null), executor);
    }

    public static boolean g(IOException iOException) {
        return (iOException instanceof wfd) || (iOException.getCause() instanceof wfd);
    }

    private final void j(Uri uri, IOException iOException) throws IOException {
        nfh nfhVar = this.i;
        if (!nfhVar.g(uri)) {
            throw iOException;
        }
        try {
            nfhVar.e(uri);
            throw iOException;
        } catch (IOException e) {
            iOException.addSuppressed(e);
            throw iOException;
        }
    }

    @Override // defpackage.wgy
    public final zfj a() {
        return new vtb(this, 5);
    }

    @ResultIgnorabilityUnspecified
    public final Object c(Uri uri) throws IOException {
        InputStream inputStream;
        try {
            try {
                xua xuaVarAw = woy.aw("Read " + this.f, xud.a, false);
                try {
                    inputStream = (InputStream) this.i.d(uri, new wft(0));
                    try {
                        abow abowVarA = this.m.a(inputStream);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        xuaVarAw.close();
                        return abowVarA;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        xuaVarAw.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw vuf.N(this.i, uri, e, this.f);
            }
        } catch (FileNotFoundException unused) {
            nfh nfhVar = this.i;
            if (!nfhVar.g(uri)) {
                return this.m.a;
            }
            inputStream = (InputStream) nfhVar.d(uri, new wft(0));
            try {
                abow abowVarA2 = this.m.a(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
                return abowVarA2;
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
            }
        }
    }

    public final Object d(Uri uri, MappedCounterCacheVersion mappedCounterCacheVersion) throws IOException {
        AtomicReference atomicReference = this.h;
        Pair pair = (Pair) atomicReference.get();
        long jA = mappedCounterCacheVersion.a();
        if (pair != null && ((Long) pair.second).longValue() == jA) {
            return pair.first;
        }
        nfh nfhVar = this.i;
        wfr wfrVar = new wfr(true);
        wfrVar.a = true;
        Closeable closeable = (Closeable) nfhVar.d(uri, wfrVar);
        try {
            Object objC = c(uri);
            if (this.k.get()) {
                this.l.set(objC);
            }
            if (closeable != null) {
                atomicReference.set(Pair.create(objC, Long.valueOf(jA)));
            }
            if (closeable != null) {
                closeable.close();
            }
            return objC;
        } catch (Throwable th) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.wgy
    public final String e() {
        return this.f;
    }

    public final void f(Uri uri, Object obj, MappedCounterCacheVersion mappedCounterCacheVersion) throws IOException {
        zhe zheVar;
        OutputStream outputStream;
        Uri uriT = woy.t(uri, ".tmp");
        try {
            zheVar = new zhe(null);
            try {
                nfh nfhVar = this.i;
                wfu wfuVar = new wfu();
                wfuVar.a = new zhe[]{zheVar};
                outputStream = (OutputStream) nfhVar.d(uriT, wfuVar);
            } catch (IOException e) {
                throw vuf.N(this.i, uri, e, this.f);
            }
        } catch (IOException e2) {
            j(uriT, e2);
        }
        try {
            ((abow) obj).g(outputStream);
            zheVar.e();
            if (outputStream != null) {
                outputStream.close();
            }
            long jNativeIncrementCounter = MappedCounterCacheVersion.nativeIncrementCounter(mappedCounterCacheVersion.a);
            Uri uriT2 = woy.t(uri, ".tmp");
            try {
                this.i.f(uriT2, uri);
            } catch (IOException e3) {
                j(uriT2, e3);
            }
            if (this.k.get()) {
                this.l.set(obj);
            }
            this.h.set(Pair.create(obj, Long.valueOf(jNativeIncrementCounter)));
        } finally {
        }
    }

    @Override // defpackage.wgy
    public final zgp h() {
        try {
            zgp zgpVarA = this.e.a();
            woy.ad(zgpVarA.isDone(), "Future was expected to be done: %s", zgpVarA);
            final MappedCounterCacheVersion mappedCounterCacheVersion = (MappedCounterCacheVersion) a.L(zgpVarA);
            Pair pair = (Pair) this.h.get();
            if (pair != null && ((Long) pair.second).longValue() == mappedCounterCacheVersion.a()) {
                Object obj = pair.first;
                return obj == null ? zgl.a : new zgl(obj);
            }
            zfz zfzVar = this.j;
            zfj zfjVar = new zfj() { // from class: wgl
                @Override // defpackage.zfj
                public final zgp a() {
                    wgp wgpVar = this.a;
                    zgp zgpVar = wgpVar.a;
                    woy.ad(zgpVar.isDone(), "Future was expected to be done: %s", zgpVar);
                    Uri uri = (Uri) a.L(zgpVar);
                    MappedCounterCacheVersion mappedCounterCacheVersion2 = mappedCounterCacheVersion;
                    try {
                        Object objD = wgpVar.d(uri, mappedCounterCacheVersion2);
                        return objD == null ? zgl.a : new zgl(objD);
                    } catch (IOException e) {
                        xxh xxhVar = wgpVar.c;
                        if (!xxhVar.f()) {
                            return new zhc(e);
                        }
                        if (wgp.g(e)) {
                            return new zhc(e);
                        }
                        Object objB = xxhVar.b();
                        zfz zfzVar2 = wgpVar.d;
                        wgk wgkVar = new wgk(wgpVar, uri, (kwp) objB, 2);
                        int i = xur.a;
                        zfv zfvVar = new zfv(xts.e(), wgkVar, 1);
                        Executor executor = wgpVar.b;
                        zgp zgpVarA2 = zfzVar2.a(zfvVar, executor);
                        xup xupVar = new xup(xts.e(), new pwg(wgpVar, uri, mappedCounterCacheVersion2, 4, null));
                        int i2 = zfb.c;
                        zez zezVar = new zez(zgpVarA2, xupVar);
                        zgpVarA2.c(zezVar, yrm.aK(executor, zezVar));
                        return zezVar;
                    }
                }
            };
            int i = xur.a;
            return zfzVar.a(new zfv(xts.e(), zfjVar, 1), this.b);
        } catch (ExecutionException e) {
            return new zhc(e);
        }
    }

    @Override // defpackage.wgy
    public final zgp i(zfk zfkVar, Executor executor) {
        return this.d.a(xur.a(new wgk(this, zfkVar, executor, 0)), this.b);
    }
}
