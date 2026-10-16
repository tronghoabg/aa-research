package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class ajmt implements ajoa {
    final /* synthetic */ ajmv a;
    final /* synthetic */ ajoa b;

    public ajmt(ajmv ajmvVar, ajoa ajoaVar) {
        this.a = ajmvVar;
        this.b = ajoaVar;
    }

    @Override // defpackage.ajoa
    public final void a(ajmy ajmyVar, long j) throws IOException {
        ahfd.g(ajmyVar.b, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            ajnx ajnxVar = ajmyVar.a;
            ajnxVar.getClass();
            while (true) {
                if (j2 >= 65536) {
                    break;
                }
                j2 += ajnxVar.c - ajnxVar.b;
                if (j2 >= j) {
                    j2 = j;
                    break;
                } else {
                    ajnxVar = ajnxVar.f;
                    ajnxVar.getClass();
                }
            }
            ajmv ajmvVar = this.a;
            ajoa ajoaVar = this.b;
            ajmvVar.d();
            try {
                try {
                    ajoaVar.a(ajmyVar, j2);
                    if (ajmvVar.e()) {
                        throw ajmvVar.c(null);
                    }
                    j -= j2;
                } catch (IOException e) {
                    if (!ajmvVar.e()) {
                        throw e;
                    }
                    throw ajmvVar.c(e);
                }
            } catch (Throwable th) {
                ajmvVar.e();
                throw th;
            }
        }
    }

    @Override // defpackage.ajoa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ajmv ajmvVar = this.a;
        ajmvVar.d();
        try {
            this.b.close();
            if (ajmvVar.e()) {
                throw ajmvVar.c(null);
            }
        } catch (IOException e) {
            if (!ajmvVar.e()) {
                throw e;
            }
            throw ajmvVar.c(e);
        } finally {
            ajmvVar.e();
        }
    }

    @Override // defpackage.ajoa, java.io.Flushable
    public final void flush() throws IOException {
        ajmv ajmvVar = this.a;
        ajmvVar.d();
        try {
            this.b.flush();
            if (ajmvVar.e()) {
                throw ajmvVar.c(null);
            }
        } catch (IOException e) {
            if (!ajmvVar.e()) {
                throw e;
            }
            throw ajmvVar.c(e);
        } finally {
            ajmvVar.e();
        }
    }

    @Override // defpackage.ajoa
    public final /* synthetic */ ajoe hV() {
        return this.a;
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.b + ")";
    }
}
