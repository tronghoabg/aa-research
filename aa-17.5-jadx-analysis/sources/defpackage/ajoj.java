package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes2.dex */
public final class ajoj implements ajoa {
    final /* synthetic */ ajol a;
    private final OutputStream b;
    private final ajoo c;

    public ajoj(ajol ajolVar) {
        this.a = ajolVar;
        this.b = ajolVar.a.getOutputStream();
        this.c = new ajoo(ajolVar.a);
    }

    @Override // defpackage.ajoa
    public final void a(ajmy ajmyVar, long j) throws IOException {
        ahfd.g(ajmyVar.b, 0L, j);
        while (j > 0) {
            ajoo ajooVar = this.c;
            ajooVar.f();
            ajnx ajnxVar = ajmyVar.a;
            ajnxVar.getClass();
            int iMin = (int) Math.min(j, ajnxVar.c - ajnxVar.b);
            ajooVar.d();
            try {
                try {
                    this.b.write(ajnxVar.a, ajnxVar.b, iMin);
                    if (ajooVar.e()) {
                        throw ajooVar.c(null);
                    }
                    int i = ajnxVar.b + iMin;
                    ajnxVar.b = i;
                    long j2 = iMin;
                    j -= j2;
                    ajmyVar.b -= j2;
                    if (i == ajnxVar.c) {
                        ajmyVar.a = ajnxVar.a();
                        ajny.b(ajnxVar);
                    }
                } catch (IOException e) {
                    if (!ajooVar.e()) {
                        throw e;
                    }
                    throw ajooVar.c(e);
                }
            } catch (Throwable th) {
                ajooVar.e();
                throw th;
            }
        }
    }

    @Override // defpackage.ajoa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ajoo ajooVar = this.c;
        ajooVar.d();
        ajol ajolVar = this.a;
        try {
            int iB = ahfz.b(ajolVar.b, 1);
            if (iB != 0) {
                if (iB != 3) {
                    Socket socket = ajolVar.a;
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        this.b.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            this.b.close();
                        }
                    }
                } else {
                    ajolVar.a.close();
                }
                if (ajooVar.e()) {
                    throw ajooVar.c(null);
                }
            }
        } catch (IOException e) {
            if (!ajooVar.e()) {
                throw e;
            }
            throw ajooVar.c(e);
        } finally {
            ajooVar.e();
        }
    }

    @Override // defpackage.ajoa, java.io.Flushable
    public final void flush() throws IOException {
        ajoo ajooVar = this.c;
        ajooVar.d();
        try {
            this.b.flush();
            if (ajooVar.e()) {
                throw ajooVar.c(null);
            }
        } catch (IOException e) {
            if (!ajooVar.e()) {
                throw e;
            }
            throw ajooVar.c(e);
        } finally {
            ajooVar.e();
        }
    }

    @Override // defpackage.ajoa
    public final /* synthetic */ ajoe hV() {
        return this.c;
    }

    public final String toString() {
        return "sink(" + this.a.a + ")";
    }
}
