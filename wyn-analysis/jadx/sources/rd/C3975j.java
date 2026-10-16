package rd;

import cg.C1610B;
import cg.C1621j;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;
import org.apache.tika.fork.ForkServer;

/* renamed from: rd.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3975j {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f44795a = Logger.getLogger(AbstractC3972g.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final C1621j f44796b;

    static {
        C1621j c1621j = C1621j.f19903d;
        f44796b = ab.b.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static int a(C1610B c1610b) {
        return (c1610b.readByte() & ForkServer.ERROR) | ((c1610b.readByte() & ForkServer.ERROR) << 16) | ((c1610b.readByte() & ForkServer.ERROR) << 8);
    }

    public static int b(int i5, byte b5, short s10) throws IOException {
        if ((b5 & 8) != 0) {
            i5--;
        }
        if (s10 <= i5) {
            return (short) (i5 - s10);
        }
        c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i5));
        throw null;
    }

    public static void c(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
