package rd;

import cg.C1610B;
import cg.C1618g;
import cg.H;
import cg.J;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.fork.ForkServer;

/* renamed from: rd.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3971f implements H {

    /* renamed from: a, reason: collision with root package name */
    public final C1610B f44778a;

    /* renamed from: b, reason: collision with root package name */
    public int f44779b;

    /* renamed from: c, reason: collision with root package name */
    public byte f44780c;

    /* renamed from: d, reason: collision with root package name */
    public int f44781d;

    /* renamed from: e, reason: collision with root package name */
    public int f44782e;

    /* renamed from: f, reason: collision with root package name */
    public short f44783f;

    public C3971f(C1610B c1610b) {
        this.f44778a = c1610b;
    }

    @Override // cg.H
    public final long read(C1618g c1618g, long j8) throws IOException {
        int i5;
        int i10;
        do {
            int i11 = this.f44782e;
            C1610B c1610b = this.f44778a;
            if (i11 == 0) {
                c1610b.skip(this.f44783f);
                this.f44783f = (short) 0;
                if ((this.f44780c & 4) == 0) {
                    i5 = this.f44781d;
                    int iA = C3975j.a(c1610b);
                    this.f44782e = iA;
                    this.f44779b = iA;
                    byte b5 = (byte) (c1610b.readByte() & ForkServer.ERROR);
                    this.f44780c = (byte) (c1610b.readByte() & ForkServer.ERROR);
                    Logger logger = C3975j.f44795a;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(AbstractC3972g.a(true, this.f44781d, this.f44779b, b5, this.f44780c));
                    }
                    i10 = c1610b.readInt() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                    this.f44781d = i10;
                    if (b5 != 9) {
                        C3975j.c("%s != TYPE_CONTINUATION", Byte.valueOf(b5));
                        throw null;
                    }
                }
            } else {
                long j10 = c1610b.read(c1618g, Math.min(j8, i11));
                if (j10 != -1) {
                    this.f44782e -= (int) j10;
                    return j10;
                }
            }
            return -1L;
        } while (i10 == i5);
        C3975j.c("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // cg.H
    public final J timeout() {
        return this.f44778a.f19863a.timeout();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
