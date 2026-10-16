package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.view.View;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class jkm extends View {
    final /* synthetic */ jkn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkm(jkn jknVar, Context context) {
        super(context);
        this.a = jknVar;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        jko jkoVar = this.a.b;
        long andSet = jkoVar.c.getAndSet(0L);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (andSet != 0) {
            long j = jElapsedRealtimeNanos - andSet;
            yph yphVar = jko.a;
            ((ype) yphVar.l().ai((char) 2259)).y("SurfaceFlinger invalidate2ondraw: %f ms", Double.valueOf(j / 1000000.0d));
            int i = jkoVar.e;
            if (i == -16777216) {
                jkoVar.e = -16776961;
            } else if (i == -16776961) {
                jkoVar.e = -16711936;
                jkoVar.d.f(yzz.PROJECTION_WINDOW_MANAGER, yzy.GN, j / 1000000);
                jkoVar.f++;
            } else if (i != -16711936) {
                ((ype) ((ype) ((ype) yphVar.f()).l(5, TimeUnit.MINUTES)).ai(2260)).u("Unexpected color in surface flinger telemetry.");
            } else {
                jkoVar.e = -16777216;
            }
        }
        if (jkoVar.b.getAndSet(jElapsedRealtimeNanos) != 0) {
            ((ype) ((ype) jko.a.g()).ai((char) 2258)).u("no onFrameAvailable since last onDraw!");
        }
        canvas.drawColor(jkoVar.e);
    }
}
