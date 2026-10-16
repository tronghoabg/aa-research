package defpackage;

import java.io.IOException;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class ajlg implements ajoa {
    public final boolean a;
    public boolean b;
    final /* synthetic */ ajlj c;
    private final ajmy d = new ajmy();

    public ajlg(ajlj ajljVar, boolean z) {
        this.c = ajljVar;
        this.a = z;
    }

    private final void c(boolean z) throws IOException {
        ajli ajliVar;
        ajmy ajmyVar;
        long jMin;
        boolean z2;
        ajlj ajljVar = this.c;
        synchronized (ajljVar) {
            ajliVar = ajljVar.j;
            ajliVar.d();
            while (ajljVar.d >= ajljVar.e && !this.a && !this.b && ajljVar.k() == 0) {
                try {
                    ajljVar.g();
                } catch (Throwable th) {
                    ajljVar.j.b();
                    throw th;
                }
            }
            ajliVar.b();
            ajljVar.e();
            long j = ajljVar.e - ajljVar.d;
            ajmyVar = this.d;
            jMin = Math.min(j, ajmyVar.b);
            ajljVar.d += jMin;
            boolean z3 = false;
            if (z && jMin == ajmyVar.b) {
                z3 = true;
            }
            z2 = z3;
        }
        ajliVar.d();
        try {
            ajljVar.b.f(ajljVar.a, z2, ajmyVar, jMin);
        } finally {
            this.c.j.b();
        }
    }

    @Override // defpackage.ajoa
    public final void a(ajmy ajmyVar, long j) throws IOException {
        TimeZone timeZone = ajis.a;
        ajmy ajmyVar2 = this.d;
        ajmyVar2.a(ajmyVar, j);
        while (ajmyVar2.b >= 16384) {
            c(false);
        }
    }

    @Override // defpackage.ajoa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        TimeZone timeZone = ajis.a;
        ajlj ajljVar = this.c;
        synchronized (ajljVar) {
            if (this.b) {
                return;
            }
            int iK = ajljVar.k();
            ajlj ajljVar2 = this.c;
            if (!ajljVar2.h.a) {
                ajmy ajmyVar = this.d;
                if (ajmyVar.b > 0) {
                    while (ajmyVar.b > 0) {
                        c(true);
                    }
                } else if (iK == 0) {
                    ajljVar2.b.f(ajljVar2.a, true, null, 0L);
                }
            }
            synchronized (ajljVar2) {
                this.b = true;
                ajljVar2.notifyAll();
            }
            ajlj ajljVar3 = this.c;
            ajljVar3.b.d();
            ajljVar3.d();
        }
    }

    @Override // defpackage.ajoa, java.io.Flushable
    public final void flush() throws IOException {
        TimeZone timeZone = ajis.a;
        ajlj ajljVar = this.c;
        synchronized (ajljVar) {
            ajljVar.e();
        }
        while (this.d.b > 0) {
            c(false);
            this.c.b.d();
        }
    }

    @Override // defpackage.ajoa
    public final ajoe hV() {
        return this.c.j;
    }
}
