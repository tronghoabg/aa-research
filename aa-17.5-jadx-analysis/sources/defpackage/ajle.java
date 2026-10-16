package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class ajle implements ajoc {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    private final ajna f;

    public ajle(ajna ajnaVar) {
        this.f = ajnaVar;
    }

    @Override // defpackage.ajoc
    public final long hU(ajmy ajmyVar, long j) throws IOException {
        int i;
        int iF;
        do {
            int i2 = this.d;
            ajna ajnaVar = this.f;
            if (i2 == 0) {
                ajnaVar.A(this.e);
                this.e = 0;
                if ((this.b & 4) == 0) {
                    i = this.c;
                    int iG = ajiq.g(ajnaVar);
                    this.d = iG;
                    this.a = iG;
                    int iD = ajnaVar.d() & 255;
                    this.b = ajnaVar.d() & 255;
                    Logger logger = ajlf.a;
                    if (logger.isLoggable(Level.FINE)) {
                        ajnb ajnbVar = ajku.a;
                        logger.fine(ajku.b(true, this.c, this.a, iD, this.b));
                    }
                    iF = ajnaVar.f() & Alert.DURATION_SHOW_INDEFINITELY;
                    this.c = iF;
                    if (iD != 9) {
                        throw new IOException(iD + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jHU = ajnaVar.hU(ajmyVar, Math.min(8192L, i2));
                if (jHU != -1) {
                    this.d -= (int) jHU;
                    return jHU;
                }
            }
            return -1L;
        } while (iF == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // defpackage.ajoc
    public final ajoe hV() {
        return this.f.hV();
    }

    @Override // defpackage.ajoc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
