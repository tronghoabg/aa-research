package defpackage;

import java.io.IOException;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class ajlh implements ajoc {
    public final long a;
    public boolean b;
    public final ajmy c = new ajmy();
    public final ajmy d = new ajmy();
    public boolean e;
    final /* synthetic */ ajlj f;

    public ajlh(ajlj ajljVar, long j, boolean z) {
        this.f = ajljVar;
        this.a = j;
        this.b = z;
    }

    public final void c(long j) {
        TimeZone timeZone = ajis.a;
        this.f.b.e(j);
    }

    @Override // defpackage.ajoc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long j;
        ajlj ajljVar = this.f;
        synchronized (ajljVar) {
            this.e = true;
            ajmy ajmyVar = this.d;
            j = ajmyVar.b;
            ajmyVar.y();
            ajljVar.notifyAll();
        }
        if (j > 0) {
            c(j);
        }
        this.f.d();
    }

    @Override // defpackage.ajoc
    public final long hU(ajmy ajmyVar, long j) throws Throwable {
        Throwable ajlqVar;
        boolean z;
        long j2;
        Throwable th;
        long jHU;
        do {
            ajlj ajljVar = this.f;
            synchronized (ajljVar) {
                boolean zH = ajljVar.h();
                if (zH) {
                    ajljVar.i.d();
                }
                try {
                    if (ajljVar.k() == 0 || this.b) {
                        ajlqVar = null;
                    } else {
                        ajlqVar = ajljVar.k;
                        if (ajlqVar == null) {
                            int iK = ajljVar.k();
                            if (iK == 0) {
                                throw null;
                            }
                            ajlqVar = new ajlq(iK);
                        }
                    }
                    if (this.e) {
                        throw new IOException("stream closed");
                    }
                    ajmy ajmyVar2 = this.d;
                    long j3 = ajmyVar2.b;
                    z = false;
                    if (j3 > 0) {
                        jHU = ajmyVar2.hU(ajmyVar, Math.min(8192L, j3));
                        ajlr ajlrVar = ajljVar.c;
                        ajlrVar.b(jHU, 0L);
                        long jA = ajlrVar.a();
                        if (ajlqVar == null) {
                            ajlc ajlcVar = ajljVar.b;
                            j2 = -1;
                            if (jA >= ajlcVar.q.c() / 2) {
                                ajlcVar.h(ajljVar.a, jA);
                                ajlrVar.b(0L, jA);
                            }
                            th = null;
                        } else {
                            j2 = -1;
                            th = ajlqVar;
                        }
                    } else {
                        j2 = -1;
                        if (this.b || ajlqVar != null) {
                            th = ajlqVar;
                            jHU = -1;
                        } else {
                            ajljVar.g();
                            z = true;
                            jHU = -1;
                            th = null;
                        }
                    }
                } finally {
                    if (zH) {
                        ajljVar.i.b();
                    }
                }
            }
        } while (z);
        if (jHU != j2) {
            return jHU;
        }
        if (th == null) {
            return j2;
        }
        throw th;
    }

    @Override // defpackage.ajoc
    public final ajoe hV() {
        return this.f.i;
    }
}
