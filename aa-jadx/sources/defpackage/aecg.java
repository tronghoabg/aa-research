package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aecg {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public aecg(java.util.logging.Level level, java.lang.Class cls) {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(cls.getName());
        level.getClass();
        this.b = level;
        logger.getClass();
        this.a = logger;
    }

    private static java.lang.String k(defpackage.ajny ajnyVar) {
        long j = ajnyVar.b;
        return j <= 64 ? ajnyVar.t().g() : ajnyVar.u((int) java.lang.Math.min(j, 64L)).g().concat("...");
    }

    public final boolean a() {
        return ((java.util.logging.Logger) this.a).isLoggable((java.util.logging.Level) this.b);
    }

    final void b(int i, int i2, defpackage.ajny ajnyVar, int i3, boolean z) {
        if (a()) {
            java.lang.Object obj = this.a;
            java.util.logging.Logger logger = (java.util.logging.Logger) obj;
            logger.logp((java.util.logging.Level) this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logData", defpackage.adrs.z(i) + " DATA: streamId=" + i2 + " endStream=" + z + " length=" + i3 + " bytes=" + k(ajnyVar));
        }
    }

    final void c(int i, int i2, defpackage.aede aedeVar, defpackage.ajob ajobVar) {
        if (a()) {
            java.lang.Object obj = this.a;
            java.lang.Object obj2 = this.b;
            java.lang.String strZ = defpackage.adrs.z(i);
            java.lang.String string = aedeVar.toString();
            int iC = ajobVar.c();
            defpackage.ajny ajnyVar = new defpackage.ajny();
            ajnyVar.K(ajobVar);
            java.util.logging.Logger logger = (java.util.logging.Logger) obj;
            logger.logp((java.util.logging.Level) obj2, "io.grpc.okhttp.OkHttpFrameLogger", "logGoAway", strZ + " GO_AWAY: lastStreamId=" + i2 + " errorCode=" + string + " length=" + iC + " bytes=" + k(ajnyVar));
        }
    }

    final void d(int i, long j) {
        if (a()) {
            java.lang.Object obj = this.a;
            java.util.logging.Logger logger = (java.util.logging.Logger) obj;
            logger.logp((java.util.logging.Level) this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logPing", defpackage.adrs.z(i) + " PING: ack=false bytes=" + j);
        }
    }

    final void e(int i, int i2, defpackage.aede aedeVar) {
        if (a()) {
            java.lang.Object obj = this.a;
            java.util.logging.Logger logger = (java.util.logging.Logger) obj;
            logger.logp((java.util.logging.Level) this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logRstStream", defpackage.adrs.z(i) + " RST_STREAM: streamId=" + i2 + " errorCode=" + aedeVar.toString());
        }
    }

    final void f(int i, int i2, long j) {
        if (a()) {
            java.lang.Object obj = this.a;
            java.util.logging.Logger logger = (java.util.logging.Logger) obj;
            logger.logp((java.util.logging.Level) this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logWindowsUpdate", defpackage.adrs.z(i) + " WINDOW_UPDATE: streamId=" + i2 + " windowSizeIncrement=" + j);
        }
    }

    final void g(int i, defpackage.ajku ajkuVar) {
        if (a()) {
            java.lang.Object obj = this.a;
            java.lang.Object obj2 = this.b;
            java.lang.String strZ = defpackage.adrs.z(i);
            java.util.EnumMap enumMap = new java.util.EnumMap(defpackage.aecf.class);
            for (defpackage.aecf aecfVar : defpackage.aecf.values()) {
                int i2 = aecfVar.g;
                if (ajkuVar.e(i2)) {
                    enumMap.put(aecfVar, java.lang.Integer.valueOf(ajkuVar.c(i2)));
                }
            }
            ((java.util.logging.Logger) obj).logp((java.util.logging.Level) obj2, "io.grpc.okhttp.OkHttpFrameLogger", "logSettings", strZ + " SETTINGS: ack=false settings=" + enumMap.toString());
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    public final void h() {
        ((defpackage.adow) this.a).b = true;
        this.b.cancel(false);
    }

    public final boolean i() {
        defpackage.adow adowVar = (defpackage.adow) this.a;
        return (adowVar.c || adowVar.b) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void j(defpackage.adng adngVar) {
        this.b.add(adngVar);
    }

    public aecg(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public aecg(java.lang.Object obj, java.lang.Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public aecg(byte[] bArr) {
        this.b = new float[4];
        this.a = new float[4];
    }

    public aecg(defpackage.ador adorVar, java.lang.Object obj) {
        adorVar.getClass();
        this.b = adorVar;
        this.a = obj;
    }

    public aecg(com.google.android.libraries.maps.model.LatLng latLng, com.google.android.libraries.maps.model.LatLng latLng2) {
        this.a = latLng;
        this.b = latLng2;
    }

    public aecg(defpackage.adom adomVar, java.util.Map map) {
        this.a = adomVar;
        this.b = j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap(map));
    }

    public aecg() {
        this.b = new java.util.ArrayList();
        this.a = "wireless.android.auto.proto.assistant.CarAssistantCallbacksService";
    }

    public aecg(defpackage.adow adowVar, java.util.concurrent.ScheduledFuture scheduledFuture) {
        this.a = adowVar;
        scheduledFuture.getClass();
        this.b = scheduledFuture;
    }

    public aecg(defpackage.yhe yheVar) {
        int i = defpackage.adpm.a;
        this.a = new defpackage.adpl();
        this.b = yheVar;
    }
}
