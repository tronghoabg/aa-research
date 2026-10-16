package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class wgt implements wgy {
    public final zgp a;
    public final Executor b;
    public final xxh c;
    public final nfh f;
    private final String g;
    private final whb i;
    public final Object d = new Object();
    private final zfz h = new zfz();
    public zgp e = null;

    public wgt(String str, zgp zgpVar, whb whbVar, Executor executor, nfh nfhVar, xxh xxhVar) {
        this.g = str;
        this.a = wub.Z(zgpVar);
        this.i = whbVar;
        this.b = new zhb(executor);
        this.f = nfhVar;
        this.c = xxhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a A[Catch: all -> 0x0034, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:11:0x0014, B:12:0x0016, B:14:0x001a, B:15:0x0032), top: B:20:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.zgp d() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.d
            monitor-enter(r0)
            zgp r1 = r4.e     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L16
            boolean r1 = r1.isDone()     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L16
            zgp r1 = r4.e     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.Throwable -> L34
            defpackage.wub.af(r1)     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.Throwable -> L34
            goto L16
        L13:
            r1 = 0
            r4.e = r1     // Catch: java.lang.Throwable -> L34
        L16:
            zgp r1 = r4.e     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L32
            zfz r1 = r4.h     // Catch: java.lang.Throwable -> L34
            vvx r2 = new vvx     // Catch: java.lang.Throwable -> L34
            r3 = 3
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L34
            zfj r2 = defpackage.xur.a(r2)     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.Executor r3 = r4.b     // Catch: java.lang.Throwable -> L34
            zgp r1 = r1.a(r2, r3)     // Catch: java.lang.Throwable -> L34
            zgp r1 = defpackage.wub.Z(r1)     // Catch: java.lang.Throwable -> L34
            r4.e = r1     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return r1
        L34:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgt.d():zgp");
    }

    @Override // defpackage.wgy
    public final zfj a() {
        return new vvx(this, 2);
    }

    public final Object b(Uri uri) throws IOException {
        try {
            try {
                xua xuaVarAx = woy.ax("Read " + this.g);
                try {
                    InputStream inputStream = (InputStream) this.f.d(uri, new wft(0));
                    try {
                        abow abowVarA = this.i.a(inputStream);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        xuaVarAx.close();
                        return abowVarA;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        xuaVarAx.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw vuf.N(this.f, uri, e, this.g);
            }
        } catch (FileNotFoundException e2) {
            if (this.f.g(uri)) {
                throw e2;
            }
            return this.i.a;
        }
    }

    public final void c(Uri uri, Object obj) throws IOException {
        Uri uriT = woy.t(uri, ".tmp");
        try {
            xua xuaVarAx = woy.ax("Write " + this.g);
            try {
                zhe zheVar = new zhe(null);
                try {
                    nfh nfhVar = this.f;
                    wfu wfuVar = new wfu();
                    wfuVar.a = new zhe[]{zheVar};
                    OutputStream outputStream = (OutputStream) nfhVar.d(uriT, wfuVar);
                    try {
                        ((abow) obj).g(outputStream);
                        zheVar.e();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        xuaVarAx.close();
                        this.f.f(uriT, uri);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw vuf.N(this.f, uri, e, this.g);
                }
            } finally {
            }
        } catch (IOException e2) {
            nfh nfhVar2 = this.f;
            if (nfhVar2.g(uriT)) {
                try {
                    nfhVar2.e(uriT);
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }

    @Override // defpackage.wgy
    public final String e() {
        return this.g;
    }

    @Override // defpackage.wgy
    public final zgp h() {
        return d();
    }

    @Override // defpackage.wgy
    public final zgp i(zfk zfkVar, Executor executor) {
        return this.h.a(xur.a(new wgv(this, d(), zfkVar, executor, 1)), zfq.a);
    }
}
