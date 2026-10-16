package cg;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes5.dex */
public final class G extends C1616e {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f19878m;

    public G(Socket socket) {
        this.f19878m = socket;
    }

    @Override // cg.C1616e
    public final void j() throws IOException {
        Socket socket = this.f19878m;
        try {
            socket.close();
        } catch (AssertionError e7) {
            if (!AbstractC1613b.g(e7)) {
                throw e7;
            }
            w.f19934a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e7);
        } catch (Exception e10) {
            w.f19934a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
