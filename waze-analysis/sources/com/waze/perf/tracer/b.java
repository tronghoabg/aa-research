package com.waze.perf.tracer;

import androidx.autofill.HintConstants;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.gauges.GaugeManager;
import h.g.b.x;
import h.l;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    private final Trace f33068a;

    public b(String str) {
        Object objA;
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        try {
            b bVar = this;
            objA = new Trace(str, com.google.firebase.perf.d.f.a(), com.google.firebase.perf.a.c.a(), GaugeManager.getInstance());
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        this.f33068a = (Trace) (true == (objA instanceof l) ? null : objA);
    }

    @Override // com.waze.perf.tracer.f
    public final void a(String str, String str2) {
        x.f(str, "key");
        x.f(str2, "value");
        try {
            b bVar = this;
            Trace trace = this.f33068a;
            if (trace != null) {
                trace.putAttribute(str, str2);
            }
        } catch (Throwable th) {
            e.b.c.a(th);
        }
    }

    @Override // com.waze.perf.tracer.f
    public final void b(String str, long j2) {
        x.f(str, "key");
        try {
            b bVar = this;
            Trace trace = this.f33068a;
            if (trace != null) {
                trace.putMetric(str, j2);
            }
        } catch (Throwable th) {
            e.b.c.a(th);
        }
    }

    @Override // com.waze.perf.tracer.f
    public final void c() {
        try {
            b bVar = this;
            Trace trace = this.f33068a;
            if (trace != null) {
                trace.start();
            }
        } catch (Throwable th) {
            e.b.c.a(th);
        }
    }

    @Override // com.waze.perf.tracer.f
    public final void d() {
        try {
            b bVar = this;
            Trace trace = this.f33068a;
            if (trace != null) {
                trace.stop();
            }
        } catch (Throwable th) {
            e.b.c.a(th);
        }
    }
}
