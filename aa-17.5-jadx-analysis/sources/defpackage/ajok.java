package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/* loaded from: classes2.dex */
public final class ajok implements ajoc {
    final /* synthetic */ ajol a;
    private final InputStream b;
    private final ajoo c;

    public ajok(ajol ajolVar) {
        this.a = ajolVar;
        this.b = ajolVar.a.getInputStream();
        this.c = new ajoo(ajolVar.a);
    }

    @Override // defpackage.ajoc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ajoo ajooVar = this.c;
        ajooVar.d();
        ajol ajolVar = this.a;
        try {
            int iB = ahfz.b(ajolVar.b, 2);
            if (iB != 0) {
                if (iB != 3) {
                    Socket socket = ajolVar.a;
                    if (!socket.isClosed() && !socket.isInputShutdown()) {
                        try {
                            socket.shutdownInput();
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

    @Override // defpackage.ajoc
    public final long hU(ajmy ajmyVar, long j) throws IOException {
        ajoo ajooVar = this.c;
        ajooVar.f();
        ajnx ajnxVarV = ajmyVar.v(1);
        int iMin = (int) Math.min(8192L, 8192 - ajnxVarV.c);
        try {
            ajooVar.d();
            try {
                int i = this.b.read(ajnxVarV.a, ajnxVarV.c, iMin);
                if (ajooVar.e()) {
                    throw ajooVar.c(null);
                }
                if (i != -1) {
                    ajnxVarV.c += i;
                    long j2 = i;
                    ajmyVar.b += j2;
                    return j2;
                }
                if (ajnxVarV.b != ajnxVarV.c) {
                    return -1L;
                }
                ajmyVar.a = ajnxVarV.a();
                ajny.b(ajnxVarV);
                return -1L;
            } catch (IOException e) {
                if (ajooVar.e()) {
                    throw ajooVar.c(e);
                }
                throw e;
            } finally {
                ajooVar.e();
            }
        } catch (AssertionError e2) {
            if (ajor.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // defpackage.ajoc
    public final /* synthetic */ ajoe hV() {
        return this.c;
    }

    public final String toString() {
        return "source(" + this.a.a + ")";
    }
}
