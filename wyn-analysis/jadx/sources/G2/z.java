package g2;

import Va.M6;
import java.io.Closeable;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import l8.e0;

/* loaded from: classes.dex */
public final class z implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final Charset f35699g = StandardCharsets.UTF_8;

    /* renamed from: a, reason: collision with root package name */
    public final Y2.B f35700a;

    /* renamed from: b, reason: collision with root package name */
    public final o2.m f35701b = new o2.m("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* renamed from: c, reason: collision with root package name */
    public final Map f35702c = M6.v();

    /* renamed from: d, reason: collision with root package name */
    public y f35703d;

    /* renamed from: e, reason: collision with root package name */
    public Socket f35704e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f35705f;

    public z(Y2.B b5) {
        this.f35700a = b5;
    }

    public final void a(Socket socket) {
        this.f35704e = socket;
        this.f35703d = new y(this, socket.getOutputStream());
        this.f35701b.f(new x(this, socket.getInputStream()), new a2.v(this, 9), 0);
    }

    public final void b(e0 e0Var) {
        Q1.k.h(this.f35703d);
        y yVar = this.f35703d;
        yVar.getClass();
        yVar.f35697c.post(new com.applovin.impl.sdk.nativeAd.e(yVar, new B8.e(AbstractC2671A.f35510h).e(e0Var).getBytes(f35699g), e0Var));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f35705f) {
            return;
        }
        try {
            y yVar = this.f35703d;
            if (yVar != null) {
                yVar.close();
            }
            this.f35701b.e(null);
            Socket socket = this.f35704e;
            if (socket != null) {
                socket.close();
            }
            this.f35705f = true;
        } catch (Throwable th) {
            this.f35705f = true;
            throw th;
        }
    }
}
