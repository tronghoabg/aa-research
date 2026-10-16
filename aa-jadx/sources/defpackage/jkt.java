package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class jkt extends android.view.View {
    final /* synthetic */ defpackage.jku a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkt(defpackage.jku jkuVar, android.content.Context context) {
        super(context);
        this.a = jkuVar;
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        defpackage.jkv jkvVar = this.a.b;
        long andSet = jkvVar.c.getAndSet(0L);
        long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        if (andSet != 0) {
            long j = jElapsedRealtimeNanos - andSet;
            defpackage.yqm yqmVar = defpackage.jkv.a;
            ((defpackage.yqj) yqmVar.l().ai((char) 2260)).y("SurfaceFlinger invalidate2ondraw: %f ms", java.lang.Double.valueOf(j / 1000000.0d));
            int i = jkvVar.e;
            if (i == -16777216) {
                jkvVar.e = -16776961;
            } else if (i == -16776961) {
                jkvVar.e = -16711936;
                jkvVar.d.f(defpackage.zbe.PROJECTION_WINDOW_MANAGER, defpackage.zbd.GR, j / 1000000);
                jkvVar.f++;
            } else if (i != -16711936) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).l(5, java.util.concurrent.TimeUnit.MINUTES)).ai(2261)).u("Unexpected color in surface flinger telemetry.");
            } else {
                jkvVar.e = -16777216;
            }
        }
        if (jkvVar.b.getAndSet(jElapsedRealtimeNanos) != 0) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.jkv.a.g()).ai((char) 2259)).u("no onFrameAvailable since last onDraw!");
        }
        canvas.drawColor(jkvVar.e);
    }
}
