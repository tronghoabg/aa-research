package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class aebg {
    public final Object a;
    public final Object b;

    public aebg(Level level, Class cls) {
        Logger logger = Logger.getLogger(cls.getName());
        level.getClass();
        this.b = level;
        logger.getClass();
        this.a = logger;
    }

    private static String k(ajmy ajmyVar) {
        long j = ajmyVar.b;
        return j <= 64 ? ajmyVar.t().g() : ajmyVar.u((int) Math.min(j, 64L)).g().concat("...");
    }

    public final boolean a() {
        return ((Logger) this.a).isLoggable((Level) this.b);
    }

    final void b(int i, int i2, ajmy ajmyVar, int i3, boolean z) {
        if (a()) {
            Object obj = this.a;
            Logger logger = (Logger) obj;
            logger.logp((Level) this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logData", adzo.f(i) + " DATA: streamId=" + i2 + " endStream=" + z + " length=" + i3 + " bytes=" + k(ajmyVar));
        }
    }

    final void c(int i, int i2, aece aeceVar, ajnb ajnbVar) {
        if (a()) {
            Object obj = this.a;
            Object obj2 = this.b;
            String strF = adzo.f(i);
            String string = aeceVar.toString();
            int iC = ajnbVar.c();
            ajmy ajmyVar = new ajmy();
            ajmyVar.K(ajnbVar);
            Logger logger = (Logger) obj;
            logger.logp((Level) obj2, "io.grpc.okhttp.OkHttpFrameLogger", "logGoAway", strF + " GO_AWAY: lastStreamId=" + i2 + " errorCode=" + string + " length=" + iC + " bytes=" + k(ajmyVar));
        }
    }

    final void d(int i, long j) {
        if (a()) {
            Object obj = this.a;
            Logger logger = (Logger) obj;
            logger.logp((Level) this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logPing", adzo.f(i) + " PING: ack=false bytes=" + j);
        }
    }

    final void e(int i, int i2, aece aeceVar) {
        if (a()) {
            Object obj = this.a;
            Logger logger = (Logger) obj;
            logger.logp((Level) this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logRstStream", adzo.f(i) + " RST_STREAM: streamId=" + i2 + " errorCode=" + aeceVar.toString());
        }
    }

    final void f(int i, int i2, long j) {
        if (a()) {
            Object obj = this.a;
            Logger logger = (Logger) obj;
            logger.logp((Level) this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logWindowsUpdate", adzo.f(i) + " WINDOW_UPDATE: streamId=" + i2 + " windowSizeIncrement=" + j);
        }
    }

    final void g(int i, ajju ajjuVar) {
        if (a()) {
            Object obj = this.a;
            Object obj2 = this.b;
            String strF = adzo.f(i);
            EnumMap enumMap = new EnumMap(aebf.class);
            for (aebf aebfVar : aebf.values()) {
                int i2 = aebfVar.g;
                if (ajjuVar.e(i2)) {
                    enumMap.put((EnumMap) aebfVar, (aebf) Integer.valueOf(ajjuVar.c(i2)));
                }
            }
            ((Logger) obj).logp((Level) obj2, "io.grpc.okhttp.OkHttpFrameLogger", "logSettings", strF + " SETTINGS: ack=false settings=" + enumMap.toString());
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    public final void h() {
        ((adnv) this.a).b = true;
        this.b.cancel(false);
    }

    public final boolean i() {
        adnv adnvVar = (adnv) this.a;
        return (adnvVar.c || adnvVar.b) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void j(admf admfVar) {
        this.b.add(admfVar);
    }

    public aebg(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public aebg(byte[] bArr) {
        this.b = new float[4];
        this.a = new float[4];
    }

    public aebg(adnq adnqVar, Object obj) {
        adnqVar.getClass();
        this.a = adnqVar;
        this.b = obj;
    }

    public aebg(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public aebg(adnl adnlVar, Map map) {
        this.a = adnlVar;
        this.b = DesugarCollections.unmodifiableMap(new HashMap(map));
    }

    public aebg() {
        this.b = new ArrayList();
        this.a = "wireless.android.auto.proto.assistant.CarAssistantCallbacksService";
    }

    public aebg(adnv adnvVar, ScheduledFuture scheduledFuture) {
        this.a = adnvVar;
        scheduledFuture.getClass();
        this.b = scheduledFuture;
    }

    public aebg(yfy yfyVar) {
        int i = adol.a;
        this.b = new adok();
        this.a = yfyVar;
    }
}
