package com.google.firebase.perf.d;

import android.content.Context;
import androidx.camera.video.AudioStats;
import androidx.tracing.Trace;
import com.google.firebase.perf.e.i;
import com.google.firebase.perf.e.n;
import com.google.firebase.perf.f.ad;
import com.google.firebase.perf.f.ah;
import com.google.firebase.perf.f.ak;
import java.util.List;
import java.util.Random;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f10352a;

    /* renamed from: b, reason: collision with root package name */
    private final double f10353b;

    /* renamed from: c, reason: collision with root package name */
    private final double f10354c;

    /* renamed from: d, reason: collision with root package name */
    private c f10355d;

    /* renamed from: e, reason: collision with root package name */
    private c f10356e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10357f;

    public d(Context context, i iVar) {
        double dA = a();
        double dA2 = a();
        com.google.firebase.perf.config.a aVarO = com.google.firebase.perf.config.a.o();
        this.f10355d = null;
        this.f10356e = null;
        boolean z = false;
        this.f10357f = false;
        n.b(dA >= AudioStats.AUDIO_AMPLITUDE_NONE && dA < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (dA2 >= AudioStats.AUDIO_AMPLITUDE_NONE && dA2 < 1.0d) {
            z = true;
        }
        n.b(z, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.f10353b = dA;
        this.f10354c = dA2;
        this.f10352a = aVarO;
        this.f10355d = new c(iVar, aVarO, Trace.TAG, this.f10357f);
        this.f10356e = new c(iVar, aVarO, "Network", this.f10357f);
        this.f10357f = n.c(context);
    }

    static double a() {
        return new Random().nextDouble();
    }

    private static final boolean e(List list) {
        return list.size() > 0 && ((ah) list.get(0)).getSessionVerbosityCount() > 0 && ((ah) list.get(0)).getSessionVerbosity(0) == ak.GAUGES_AND_SYSTEM_EVENTS;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(boolean z) {
        this.f10355d.a(z);
        this.f10356e.a(z);
    }

    final boolean c(ad adVar) {
        if ((!adVar.hasTraceMetric() || (!(adVar.getTraceMetric().getName().equals(com.google.firebase.perf.e.b.FOREGROUND_TRACE_NAME.toString()) || adVar.getTraceMetric().getName().equals(com.google.firebase.perf.e.b.BACKGROUND_TRACE_NAME.toString())) || adVar.getTraceMetric().getCountersCount() <= 0)) && !adVar.hasGaugeMetric()) {
            return adVar.hasNetworkRequestMetric() ? !this.f10356e.b() : (adVar.hasTraceMetric() && this.f10355d.b()) ? false : true;
        }
        return false;
    }

    final boolean d(ad adVar) {
        if (adVar.hasTraceMetric()) {
            if (this.f10353b >= this.f10352a.d() && !e(adVar.getTraceMetric().getPerfSessionsList())) {
                return false;
            }
        }
        if (adVar.hasTraceMetric() && adVar.getTraceMetric().getName().startsWith("_st_") && adVar.getTraceMetric().containsCustomAttributes("Hosting_activity")) {
            if (this.f10354c >= this.f10352a.a() && !e(adVar.getTraceMetric().getPerfSessionsList())) {
                return false;
            }
        }
        if (adVar.hasNetworkRequestMetric()) {
            return this.f10353b < this.f10352a.b() || e(adVar.getNetworkRequestMetric().getPerfSessionsList());
        }
        return true;
    }
}
