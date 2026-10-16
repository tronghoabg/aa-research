package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
final class aeck implements ajoc {
    int a;
    byte b;
    int c;
    int d;
    short e;
    private final ajna f;

    public aeck(ajna ajnaVar) {
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
                this.e = (short) 0;
                if ((this.b & 4) == 0) {
                    i = this.c;
                    int iB = aeco.b(ajnaVar);
                    this.d = iB;
                    this.a = iB;
                    int iD = ajnaVar.d() & 255;
                    this.b = (byte) (ajnaVar.d() & 255);
                    Logger logger = aeco.a;
                    byte b = (byte) iD;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$ContinuationSource", "readContinuationHeader", aecl.a(true, this.c, this.a, b, this.b));
                    }
                    iF = ajnaVar.f() & Alert.DURATION_SHOW_INDEFINITELY;
                    this.c = iF;
                    if (b != 9) {
                        throw aeco.c("%s != TYPE_CONTINUATION", Byte.valueOf(b));
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
        throw aeco.c("TYPE_CONTINUATION streamId changed", new Object[0]);
    }

    @Override // defpackage.ajoc
    public final ajoe hV() {
        return this.f.hV();
    }

    @Override // defpackage.ajoc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
