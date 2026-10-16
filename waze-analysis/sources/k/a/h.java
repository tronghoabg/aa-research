package k.a;

import h.g.b.x;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class h extends k.e {

    /* renamed from: a, reason: collision with root package name */
    private final Socket f50763a;

    public h(Socket socket) {
        x.f(socket, "socket");
        this.f50763a = socket;
    }

    @Override // k.e
    protected final void a() throws IOException {
        try {
            this.f50763a.close();
        } catch (AssertionError e2) {
            if (!l.b(e2)) {
                throw e2;
            }
            Socket socket = this.f50763a;
            Logger logger = l.f50785a;
            Level level = Level.WARNING;
            Objects.toString(socket);
            logger.log(level, "Failed to close timed out socket ".concat(String.valueOf(socket)), (Throwable) e2);
        } catch (Exception e3) {
            Socket socket2 = this.f50763a;
            Logger logger2 = l.f50785a;
            Level level2 = Level.WARNING;
            Objects.toString(socket2);
            logger2.log(level2, "Failed to close timed out socket ".concat(String.valueOf(socket2)), (Throwable) e3);
        }
    }

    @Override // k.e
    protected final IOException g(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
