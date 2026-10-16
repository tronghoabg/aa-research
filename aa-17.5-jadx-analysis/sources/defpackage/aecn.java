package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class aecn implements aecf {
    public int a;
    private final ajmz b;
    private final ajmy c;
    private final aeci d;
    private boolean e;

    public aecn(ajmz ajmzVar) {
        this.b = ajmzVar;
        ajmy ajmyVar = new ajmy();
        this.c = ajmyVar;
        this.d = new aeci(ajmyVar);
        this.a = 16384;
    }

    @Override // defpackage.aecf
    public final synchronized void a() throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        Logger logger = aeco.a;
        if (logger.isLoggable(Level.FINE)) {
            logger.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "connectionPreface", String.format(">> CONNECTION %s", aeco.b.g()));
        }
        ajmz ajmzVar = this.b;
        byte[] bArrO = aeco.b.o();
        if (((ajnu) ajmzVar).c) {
            throw new IllegalStateException("closed");
        }
        ((ajnu) ajmzVar).b.L(bArrO, 0, bArrO.length);
        ((ajnu) ajmzVar).c();
        ajmzVar.flush();
    }

    @Override // defpackage.aecf
    public final synchronized void b(boolean z, int i, ajmy ajmyVar, int i2) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        k(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 > 0) {
            this.b.a(ajmyVar, i2);
        }
    }

    @Override // defpackage.aecf
    public final synchronized void c() throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        this.b.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.e = true;
        this.b.close();
    }

    @Override // defpackage.aecf
    public final synchronized void d(boolean z, int i, int i2) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        k(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        ajmz ajmzVar = this.b;
        ajmzVar.P(i);
        ajmzVar.P(i2);
        ajmzVar.flush();
    }

    @Override // defpackage.aecf
    public final synchronized void e(int i, aece aeceVar) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        int i2 = aeceVar.s;
        if (i2 == -1) {
            throw new IllegalArgumentException();
        }
        k(i, 4, (byte) 3, (byte) 0);
        ajmz ajmzVar = this.b;
        ajmzVar.P(i2);
        ajmzVar.flush();
    }

    @Override // defpackage.aecf
    public final synchronized void f(int i, long j) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        if (j == 0) {
            throw aeco.d("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", 0L);
        }
        k(i, 4, (byte) 8, (byte) 0);
        ajmz ajmzVar = this.b;
        ajmzVar.P((int) j);
        ajmzVar.flush();
    }

    @Override // defpackage.aecf
    public final synchronized void g(aece aeceVar, byte[] bArr) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        int i = aeceVar.s;
        if (i == -1) {
            throw aeco.d("errorCode.httpCode == -1", new Object[0]);
        }
        k(0, 8, (byte) 7, (byte) 0);
        ajmz ajmzVar = this.b;
        ajmzVar.P(0);
        ajmzVar.P(i);
        ajmzVar.flush();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    @Override // defpackage.aecf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void h(boolean r18, int r19, java.util.List r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aecn.h(boolean, int, java.util.List):void");
    }

    @Override // defpackage.aecf
    public final synchronized void i(ajju ajjuVar) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        int i = this.a;
        if ((ajjuVar.a & 32) != 0) {
            i = ((int[]) ajjuVar.b)[5];
        }
        this.a = i;
        k(0, 0, (byte) 4, (byte) 1);
        this.b.flush();
    }

    @Override // defpackage.aecf
    public final synchronized void j(ajju ajjuVar) throws IOException {
        int i;
        if (this.e) {
            throw new IOException("closed");
        }
        int i2 = 0;
        k(0, Integer.bitCount(ajjuVar.a) * 6, (byte) 4, (byte) 0);
        while (i2 < 10) {
            if (ajjuVar.e(i2)) {
                if (i2 == 4) {
                    int i3 = i2;
                    i2 = 3;
                    i = i3;
                } else {
                    i = 7;
                    if (i2 == 7) {
                        i2 = 4;
                    } else {
                        i = i2;
                    }
                }
                ajmz ajmzVar = this.b;
                ajmzVar.Q(i2);
                ajmzVar.P(ajjuVar.c(i));
                i2 = i;
            }
            i2++;
        }
        this.b.flush();
    }

    final void k(int i, int i2, byte b, byte b2) throws IOException {
        Logger logger = aeco.a;
        if (logger.isLoggable(Level.FINE)) {
            logger.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "frameHeader", aecl.a(false, i, i2, b, b2));
        }
        int i3 = this.a;
        if (i2 > i3) {
            throw aeco.d("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw aeco.d("reserved bit set: %s", Integer.valueOf(i));
        }
        ajmz ajmzVar = this.b;
        ajmzVar.W((i2 >>> 16) & 255);
        ajmzVar.W((i2 >>> 8) & 255);
        ajmzVar.W(i2 & 255);
        ajmzVar.W(b);
        ajmzVar.W(b2);
        ajmzVar.P(i & Alert.DURATION_SHOW_INDEFINITELY);
    }
}
