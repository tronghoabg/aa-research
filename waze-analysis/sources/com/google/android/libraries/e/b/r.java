package com.google.android.libraries.e.b;

import android.net.Uri;
import com.google.android.libraries.phenotype.client.stable.ag;
import com.google.android.libraries.phenotype.client.stable.am;
import com.google.b.d.b.ah;
import com.google.b.d.b.ai;
import com.google.b.d.b.aj;
import com.google.d.b.aa;
import com.google.d.m.a.as;
import com.google.d.m.a.bd;
import com.google.d.m.a.bm;
import com.google.d.m.a.cf;
import com.google.v.fi;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final String f5891a;

    /* renamed from: b, reason: collision with root package name */
    private final bm f5892b;

    /* renamed from: c, reason: collision with root package name */
    private final m f5893c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f5894d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.libraries.e.a.f f5895e;

    /* renamed from: f, reason: collision with root package name */
    private final aa f5896f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f5897g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final as f5898h = as.b();

    /* renamed from: i, reason: collision with root package name */
    private bm f5899i = null;

    r(String str, bm bmVar, m mVar, Executor executor, com.google.android.libraries.e.a.f fVar, aa aaVar) {
        this.f5891a = str;
        this.f5892b = bd.j(bmVar);
        this.f5893c = mVar;
        this.f5894d = cf.z(executor);
        this.f5895e = fVar;
        this.f5896f = aaVar;
    }

    public static y a() {
        return p.f5889a;
    }

    public static /* synthetic */ bm c(r rVar, Uri uri) {
        Uri uriH = com.google.android.material.focus.d.h(uri, ".bak");
        try {
            com.google.android.libraries.e.a.f fVar = rVar.f5895e;
            if (fVar.d(uriH)) {
                fVar.c(uriH, uri);
            }
            return bd.i();
        } catch (IOException e2) {
            return bd.g(e2);
        }
    }

    public static /* synthetic */ bm d(r rVar) {
        try {
            return bd.h(rVar.o((Uri) bd.o(rVar.f5892b)));
        } catch (IOException e2) {
            q qVar = new q(rVar);
            aa aaVar = rVar.f5896f;
            return !aaVar.f() ? bd.g(e2) : ((e2 instanceof com.google.android.libraries.e.a.b.b) || (e2.getCause() instanceof com.google.android.libraries.e.a.b.b)) ? bd.g(e2) : bd.n(((com.google.android.gms.d.b) aaVar.b()).c(e2, qVar), ah.b(new am(rVar, 5)), rVar.f5894d);
        }
    }

    public static /* synthetic */ bm e(r rVar, bm bmVar, Object obj) throws IOException {
        rVar.p((Uri) bd.o(rVar.f5892b), obj);
        synchronized (rVar.f5897g) {
            rVar.f5899i = bmVar;
        }
        return bd.h(obj);
    }

    public static /* synthetic */ bm f(r rVar, Object obj) throws IOException {
        rVar.p((Uri) bd.o(rVar.f5892b), obj);
        return bd.i();
    }

    public static /* synthetic */ bm g(r rVar, bm bmVar, bm bmVar2, Object obj) {
        if (bd.o(bmVar).equals(bd.o(bmVar2))) {
            return bd.h(obj);
        }
        bm bmVarN = bd.n(bmVar2, ah.b(new ag(rVar, bmVar2, 2)), rVar.f5894d);
        synchronized (rVar.f5897g) {
        }
        return bmVarN;
    }

    public static /* synthetic */ bm k(r rVar) {
        bm bmVar;
        synchronized (rVar.f5897g) {
            bmVar = rVar.f5899i;
        }
        return bmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a A[Catch: all -> 0x0034, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:11:0x0014, B:12:0x0016, B:14:0x001a, B:15:0x0032), top: B:20:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.d.m.a.bm n() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f5897g
            monitor-enter(r0)
            com.google.d.m.a.bm r1 = r4.f5899i     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L16
            boolean r1 = r1.isDone()     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L16
            com.google.d.m.a.bm r1 = r4.f5899i     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.Throwable -> L34
            com.google.d.m.a.bd.o(r1)     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.Throwable -> L34
            goto L16
        L13:
            r1 = 0
            r4.f5899i = r1     // Catch: java.lang.Throwable -> L34
        L16:
            com.google.d.m.a.bm r1 = r4.f5899i     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L32
            com.google.d.m.a.as r1 = r4.f5898h     // Catch: java.lang.Throwable -> L34
            com.google.android.libraries.e.b.o r2 = new com.google.android.libraries.e.b.o     // Catch: java.lang.Throwable -> L34
            r3 = 2
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L34
            com.google.d.m.a.af r2 = com.google.b.d.b.ah.a(r2)     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.Executor r3 = r4.f5894d     // Catch: java.lang.Throwable -> L34
            com.google.d.m.a.bm r1 = r1.c(r2, r3)     // Catch: java.lang.Throwable -> L34
            com.google.d.m.a.bm r1 = com.google.d.m.a.bd.j(r1)     // Catch: java.lang.Throwable -> L34
            r4.f5899i = r1     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return r1
        L34:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.e.b.r.n():com.google.d.m.a.bm");
    }

    private final Object o(Uri uri) throws IOException {
        try {
            try {
                com.google.b.d.b.p pVarD = ai.d("Read " + this.f5891a, aj.f7088a);
                try {
                    InputStream inputStream = (InputStream) this.f5895e.a(uri, com.google.android.libraries.e.a.c.b.b());
                    try {
                        m mVar = this.f5893c;
                        fi fiVar = (fi) ((com.google.android.libraries.e.b.b.b) mVar).c().getParserForType().b(inputStream, ((com.google.android.libraries.e.b.b.b) mVar).b());
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        pVarD.close();
                        return fiVar;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        pVarD.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e2) {
                throw com.google.android.libraries.b.c.d(this.f5895e, uri, e2, this.f5891a);
            }
        } catch (FileNotFoundException e3) {
            if (this.f5895e.d(uri)) {
                throw e3;
            }
            return this.f5893c.a();
        }
    }

    private final void p(Uri uri, Object obj) throws IOException {
        Uri uriH = com.google.android.material.focus.d.h(uri, ".tmp");
        try {
            com.google.b.d.b.p pVarD = ai.d("Write " + this.f5891a, aj.f7088a);
            try {
                com.google.android.datatransport.runtime.backends.c cVar = new com.google.android.datatransport.runtime.backends.c();
                try {
                    com.google.android.libraries.e.a.f fVar = this.f5895e;
                    com.google.android.libraries.e.a.c.c cVarB = com.google.android.libraries.e.a.c.c.b();
                    cVarB.c(cVar);
                    OutputStream outputStream = (OutputStream) fVar.a(uriH, cVarB);
                    try {
                        ((fi) obj).writeTo(outputStream);
                        cVar.e();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        pVarD.close();
                        this.f5895e.c(uriH, uri);
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
                } catch (IOException e2) {
                    throw com.google.android.libraries.b.c.d(this.f5895e, uri, e2, this.f5891a);
                }
            } finally {
            }
        } catch (IOException e3) {
            com.google.android.libraries.e.a.f fVar2 = this.f5895e;
            if (fVar2.d(uriH)) {
                try {
                    fVar2.b(uriH);
                } catch (IOException e4) {
                    e3.addSuppressed(e4);
                }
            }
            throw e3;
        }
    }

    public final String i() {
        return this.f5891a;
    }

    public final bm l() {
        return n();
    }

    public final bm m(com.google.d.m.a.ag agVar, Executor executor) {
        return this.f5898h.c(ah.a(new s(this, n(), agVar, executor, 1)), cf.y());
    }
}
