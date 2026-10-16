package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class aean implements aecf {
    private static final Logger d = Logger.getLogger(aebe.class.getName());
    public final aeam a;
    public final aecf b;
    public final aebg c = new aebg(Level.FINE, aebe.class);

    public aean(aeam aeamVar, aecf aecfVar) {
        this.a = aeamVar;
        this.b = aecfVar;
    }

    @Override // defpackage.aecf
    public final void a() {
        throw null;
    }

    @Override // defpackage.aecf
    public final void b(boolean z, int i, ajmy ajmyVar, int i2) {
        throw null;
    }

    @Override // defpackage.aecf
    public final void c() {
        try {
            this.b.c();
        } catch (IOException e) {
            this.a.d(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.b.close();
        } catch (IOException e) {
            d.logp(e.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "io.grpc.okhttp.ExceptionHandlingFrameWriter", "close", "Failed closing connection", (Throwable) e);
        }
    }

    @Override // defpackage.aecf
    public final void d(boolean z, int i, int i2) {
        long j = i << 32;
        long j2 = i2 & 4294967295L;
        aebg aebgVar = this.c;
        if (!z) {
            aebgVar.d(2, j | j2);
        } else if (aebgVar.a()) {
            long j3 = j | j2;
            Object obj = aebgVar.a;
            Logger logger = (Logger) obj;
            logger.logp((Level) aebgVar.b, "io.grpc.okhttp.OkHttpFrameLogger", "logPingAck", adzo.f(2) + " PING: ack=true bytes=" + j3);
        }
        try {
            aecf aecfVar = this.b;
            if (z) {
                ((aeao) aecfVar).b.h++;
            }
            ((aeao) aecfVar).a.d(z, i, i2);
        } catch (IOException e) {
            this.a.d(e);
        }
    }

    @Override // defpackage.aecf
    public final void e(int i, aece aeceVar) {
        this.c.e(2, i, aeceVar);
        try {
            aecf aecfVar = this.b;
            ((aeao) aecfVar).b.h++;
            ((aeao) aecfVar).a.e(i, aeceVar);
        } catch (IOException e) {
            this.a.d(e);
        }
    }

    @Override // defpackage.aecf
    public final void f(int i, long j) {
        this.c.f(2, i, j);
        try {
            ((aeao) this.b).a.f(i, j);
        } catch (IOException e) {
            this.a.d(e);
        }
    }

    @Override // defpackage.aecf
    public final void g(aece aeceVar, byte[] bArr) {
        ajnb ajnbVar = ajnb.a;
        this.c.c(2, 0, aeceVar, ahfd.c(bArr));
        try {
            aecf aecfVar = this.b;
            ((aeao) aecfVar).a.g(aeceVar, bArr);
            aecfVar.c();
        } catch (IOException e) {
            this.a.d(e);
        }
    }

    @Override // defpackage.aecf
    public final void h(boolean z, int i, List list) {
        throw null;
    }

    @Override // defpackage.aecf
    public final void i(ajju ajjuVar) {
        throw null;
    }

    @Override // defpackage.aecf
    public final void j(ajju ajjuVar) {
        throw null;
    }
}
