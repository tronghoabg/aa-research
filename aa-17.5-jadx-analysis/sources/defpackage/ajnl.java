package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class ajnl implements ajoc {
    private final ajna a;
    private final Inflater b;
    private int c;
    private boolean d;

    public ajnl(ajna ajnaVar, Inflater inflater) {
        this.a = ajnaVar;
        this.b = inflater;
    }

    public final long c(ajmy ajmyVar, long j) throws DataFormatException, IOException {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        try {
            ajnx ajnxVarV = ajmyVar.v(1);
            int iMin = (int) Math.min(8192L, 8192 - ajnxVarV.c);
            Inflater inflater = this.b;
            if (inflater.needsInput()) {
                ajna ajnaVar = this.a;
                if (!ajnaVar.B()) {
                    ajnx ajnxVar = ((ajnw) ajnaVar).b.a;
                    ajnxVar.getClass();
                    int i = ajnxVar.c;
                    int i2 = ajnxVar.b;
                    int i3 = i - i2;
                    this.c = i3;
                    inflater.setInput(ajnxVar.a, i2, i3);
                }
            }
            int iInflate = inflater.inflate(ajnxVarV.a, ajnxVarV.c, iMin);
            int i4 = this.c;
            if (i4 != 0) {
                int remaining = i4 - inflater.getRemaining();
                this.c -= remaining;
                this.a.A(remaining);
            }
            if (iInflate > 0) {
                ajnxVarV.c += iInflate;
                long j2 = iInflate;
                ajmyVar.b += j2;
                return j2;
            }
            if (ajnxVarV.b != ajnxVarV.c) {
                return 0L;
            }
            ajmyVar.a = ajnxVarV.a();
            ajny.b(ajnxVarV);
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.ajoc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    @Override // defpackage.ajoc
    public final long hU(ajmy ajmyVar, long j) throws DataFormatException, IOException {
        do {
            long jC = c(ajmyVar, 8192L);
            if (jC > 0) {
                return jC;
            }
            Inflater inflater = this.b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.a.B());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // defpackage.ajoc
    public final ajoe hV() {
        return this.a.hV();
    }
}
