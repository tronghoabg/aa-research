package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class ajmu implements ajoc {
    final /* synthetic */ ajmv a;
    final /* synthetic */ ajoc b;

    public ajmu(ajmv ajmvVar, ajoc ajocVar) {
        this.a = ajmvVar;
        this.b = ajocVar;
    }

    @Override // defpackage.ajoc, java.io.Closeable, java.lang.AutoCloseable
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

    @Override // defpackage.ajoc
    public final long hU(ajmy ajmyVar, long j) throws IOException {
        ajmv ajmvVar = this.a;
        ajmvVar.d();
        try {
            long jHU = this.b.hU(ajmyVar, j);
            if (ajmvVar.e()) {
                throw ajmvVar.c(null);
            }
            return jHU;
        } catch (IOException e) {
            if (ajmvVar.e()) {
                throw ajmvVar.c(e);
            }
            throw e;
        } finally {
            ajmvVar.e();
        }
    }

    @Override // defpackage.ajoc
    public final /* synthetic */ ajoe hV() {
        return this.a;
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.b + ")";
    }
}
