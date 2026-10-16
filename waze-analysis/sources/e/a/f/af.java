package e.a.f;

import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class af {

    /* renamed from: a, reason: collision with root package name */
    private final Logger f47630a;

    /* renamed from: b, reason: collision with root package name */
    private final Level f47631b;

    af(Level level, Class cls) {
        Logger logger = Logger.getLogger(cls.getName());
        com.google.d.b.an.C(level, "level");
        this.f47631b = level;
        com.google.d.b.an.C(logger, "logger");
        this.f47630a = logger;
    }

    private static String k(k.h hVar) {
        return hVar.q() <= 64 ? hVar.I().h() : hVar.J((int) Math.min(hVar.q(), 64L)).h().concat("...");
    }

    private final boolean l() {
        return this.f47630a.isLoggable(this.f47631b);
    }

    final void a(int i2, int i3, k.h hVar, int i4, boolean z) {
        if (l()) {
            this.f47630a.logp(this.f47631b, "io.grpc.okhttp.OkHttpFrameLogger", "logData", ad.a(i2) + " DATA: streamId=" + i3 + " endStream=" + z + " length=" + i4 + " bytes=" + k(hVar));
        }
    }

    final void b(int i2, int i3, e.a.f.a.a.a aVar, k.k kVar) {
        if (l()) {
            Logger logger = this.f47630a;
            Level level = this.f47631b;
            String strA = ad.a(i2);
            String strValueOf = String.valueOf(aVar);
            int iD = kVar.d();
            k.h hVar = new k.h();
            hVar.Z(kVar);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logGoAway", strA + " GO_AWAY: lastStreamId=" + i3 + " errorCode=" + strValueOf + " length=" + iD + " bytes=" + k(hVar));
        }
    }

    final void c(int i2, long j2) {
        if (l()) {
            this.f47630a.logp(this.f47631b, "io.grpc.okhttp.OkHttpFrameLogger", "logPing", ad.a(i2) + " PING: ack=false bytes=" + j2);
        }
    }

    final void d(int i2, int i3, e.a.f.a.a.a aVar) {
        if (l()) {
            this.f47630a.logp(this.f47631b, "io.grpc.okhttp.OkHttpFrameLogger", "logRstStream", ad.a(i2) + " RST_STREAM: streamId=" + i3 + " errorCode=" + String.valueOf(aVar));
        }
    }

    final void e(int i2, e.a.f.a.a.p pVar) {
        if (l()) {
            Logger logger = this.f47630a;
            Level level = this.f47631b;
            String strA = ad.a(i2);
            EnumMap enumMap = new EnumMap(ae.class);
            for (ae aeVar : ae.values()) {
                if (pVar.e(aeVar.a())) {
                    enumMap.put((EnumMap) aeVar, (ae) Integer.valueOf(pVar.a(aeVar.a())));
                }
            }
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logSettings", strA + " SETTINGS: ack=false settings=" + enumMap.toString());
        }
    }

    final void f(int i2, int i3, long j2) {
        if (l()) {
            this.f47630a.logp(this.f47631b, "io.grpc.okhttp.OkHttpFrameLogger", "logWindowsUpdate", ad.a(i2) + " WINDOW_UPDATE: streamId=" + i3 + " windowSizeIncrement=" + j2);
        }
    }

    final void g(int i2, List list, boolean z) {
        if (l()) {
            this.f47630a.logp(this.f47631b, "io.grpc.okhttp.OkHttpFrameLogger", "logHeaders", "INBOUND HEADERS: streamId=" + i2 + " headers=" + list.toString() + " endStream=" + z);
        }
    }

    final void h(long j2) {
        if (l()) {
            this.f47630a.logp(this.f47631b, "io.grpc.okhttp.OkHttpFrameLogger", "logPingAck", ad.a(2) + " PING: ack=true bytes=" + j2);
        }
    }

    final void i(int i2, int i3, List list) {
        if (l()) {
            this.f47630a.logp(this.f47631b, "io.grpc.okhttp.OkHttpFrameLogger", "logPushPromise", "INBOUND PUSH_PROMISE: streamId=" + i2 + " promisedStreamId=" + i3 + " headers=" + list.toString());
        }
    }

    final void j() {
        if (l()) {
            this.f47630a.logp(this.f47631b, "io.grpc.okhttp.OkHttpFrameLogger", "logSettingsAck", ad.a(2).concat(" SETTINGS: ack=true"));
        }
    }
}
