package defpackage;

import androidx.car.app.model.Alert;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ajzg extends InputStream implements InputStreamRetargetInterface {
    private final ajzu a;
    private final akbh b;
    private final ajsm c;
    private int d;
    private long e;
    private long f;
    private boolean g = false;
    private boolean h = false;

    public ajzg(ajzu ajzuVar) {
        ahgm.e(ajzuVar, "Session input buffer");
        this.a = ajzuVar;
        this.f = 0L;
        this.b = new akbh(16);
        this.c = ajsm.a;
        this.d = 1;
    }

    private final void a() throws NumberFormatException, IOException {
        int i = this.d;
        if (i == Integer.MAX_VALUE) {
            throw new ajpn("Corrupt data stream");
        }
        try {
            if (i != 1) {
                if (i != 3) {
                    throw new IllegalStateException("Inconsistent codec state");
                }
                akbh akbhVar = this.b;
                akbhVar.i();
                if (this.a.c(akbhVar) == -1) {
                    throw new ajpn("CRLF expected at end of chunk");
                }
                if (!akbhVar.isEmpty()) {
                    throw new ajpn("Unexpected content at the end of chunk");
                }
                this.d = 1;
            }
            akbh akbhVar2 = this.b;
            akbhVar2.i();
            if (this.a.c(akbhVar2) == -1) {
                throw new ajov();
            }
            int iA = akbhVar2.a(59);
            if (iA < 0) {
                iA = akbhVar2.b;
            }
            String strD = akbhVar2.d(0, iA);
            try {
                long j = Long.parseLong(strD, 16);
                this.e = j;
                if (j < 0) {
                    throw new ajpn("Negative chunk size");
                }
                this.d = 2;
                this.f = 0L;
                if (j == 0) {
                    this.g = true;
                    try {
                        ajzu ajzuVar = this.a;
                        ajsm ajsmVar = this.c;
                        ajzc.c(ajzuVar, ajsmVar.c, ajsmVar.b, akae.a, new ArrayList());
                    } catch (ajpd e) {
                        ajpn ajpnVar = new ajpn("Invalid footer: ".concat(String.valueOf(e.getMessage())));
                        ajpnVar.initCause(e);
                        throw ajpnVar;
                    }
                }
            } catch (NumberFormatException unused) {
                throw new ajpn("Bad chunk header: ".concat(strD));
            }
        } catch (ajpn e2) {
            this.d = Alert.DURATION_SHOW_INDEFINITELY;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.a instanceof ajzr) {
            return (int) Math.min(((ajzr) r0).g(), this.e - this.f);
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.h) {
            return;
        }
        try {
            if (!this.g && this.d != Integer.MAX_VALUE) {
                do {
                } while (read(new byte[2048]) >= 0);
            }
        } finally {
            this.g = true;
            this.h = true;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws NumberFormatException, IOException {
        if (this.h) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.g) {
            return -1;
        }
        if (this.d != 2) {
            a();
            if (this.g) {
                return -1;
            }
        }
        int iB = this.a.b(bArr, i, (int) Math.min(i2, this.e - this.f));
        if (iB == -1) {
            this.g = true;
            throw new ajpv(Long.valueOf(this.e), Long.valueOf(this.f));
        }
        long j = this.f + iB;
        this.f = j;
        if (j >= this.e) {
            this.d = 3;
        }
        return iB;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() throws NumberFormatException, IOException {
        if (this.h) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.g) {
            return -1;
        }
        if (this.d != 2) {
            a();
            if (this.g) {
                return -1;
            }
        }
        int iA = this.a.a();
        if (iA != -1) {
            long j = this.f + 1;
            this.f = j;
            if (j >= this.e) {
                this.d = 3;
            }
        }
        return iA;
    }
}
