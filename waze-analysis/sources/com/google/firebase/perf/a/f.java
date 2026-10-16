package com.google.firebase.perf.a;

import android.app.Activity;
import android.support.v4.app.ar;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10272a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.perf.c.a f10273b = com.google.firebase.perf.c.a.a();

    /* renamed from: c, reason: collision with root package name */
    private final Activity f10274c;

    /* renamed from: d, reason: collision with root package name */
    private final FrameMetricsAggregator f10275d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f10276e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10277f;

    public f(Activity activity) {
        FrameMetricsAggregator frameMetricsAggregator = new FrameMetricsAggregator();
        HashMap map = new HashMap();
        this.f10277f = false;
        this.f10274c = activity;
        this.f10275d = frameMetricsAggregator;
        this.f10276e = map;
    }

    private final com.google.firebase.perf.e.f e() {
        if (!this.f10277f) {
            f10273b.b("No recording has been started.");
            return com.google.firebase.perf.e.f.a();
        }
        SparseIntArray[] metrics = this.f10275d.getMetrics();
        if (metrics == null) {
            f10273b.b("FrameMetricsAggregator.mMetrics is uninitialized.");
            return com.google.firebase.perf.e.f.a();
        }
        SparseIntArray sparseIntArray = metrics[0];
        if (sparseIntArray == null) {
            f10273b.b("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return com.google.firebase.perf.e.f.a();
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
            int iKeyAt = sparseIntArray.keyAt(i5);
            int iValueAt = sparseIntArray.valueAt(i5);
            i2 += iValueAt;
            if (iKeyAt > 700) {
                i4 += iValueAt;
            }
            if (iKeyAt > 16) {
                i3 += iValueAt;
            }
        }
        return com.google.firebase.perf.e.f.c(new com.google.firebase.perf.metrics.e(i2, i3, i4));
    }

    public final com.google.firebase.perf.e.f a() {
        if (!this.f10277f) {
            f10273b.b("Cannot stop because no recording was started");
            return com.google.firebase.perf.e.f.a();
        }
        Map map = this.f10276e;
        if (!map.isEmpty()) {
            f10273b.b("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            map.clear();
        }
        com.google.firebase.perf.e.f fVarE = e();
        try {
            this.f10275d.remove(this.f10274c);
        } catch (IllegalArgumentException | NullPointerException e2) {
            if (e2 instanceof NullPointerException) {
                throw e2;
            }
            f10273b.j("View not hardware accelerated. Unable to collect FrameMetrics. %s", e2.toString());
            fVarE = com.google.firebase.perf.e.f.a();
        }
        this.f10275d.reset();
        this.f10277f = false;
        return fVarE;
    }

    public final com.google.firebase.perf.e.f b(ar arVar) {
        if (!this.f10277f) {
            f10273b.b("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return com.google.firebase.perf.e.f.a();
        }
        Map map = this.f10276e;
        if (!map.containsKey(arVar)) {
            f10273b.c("Sub-recording associated with key %s was not started or does not exist", arVar.getClass().getSimpleName());
            return com.google.firebase.perf.e.f.a();
        }
        com.google.firebase.perf.metrics.e eVar = (com.google.firebase.perf.metrics.e) map.remove(arVar);
        com.google.firebase.perf.e.f fVarE = e();
        if (fVarE.e()) {
            return com.google.firebase.perf.e.f.c(((com.google.firebase.perf.metrics.e) fVarE.d()).d(eVar));
        }
        f10273b.c("stopFragment(%s): snapshot() failed", arVar.getClass().getSimpleName());
        return com.google.firebase.perf.e.f.a();
    }

    public final void c() {
        if (this.f10277f) {
            f10273b.c("FrameMetricsAggregator is already recording %s", this.f10274c.getClass().getSimpleName());
        } else {
            this.f10275d.add(this.f10274c);
            this.f10277f = true;
        }
    }

    public final void d(ar arVar) {
        if (!this.f10277f) {
            f10273b.b("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        Map map = this.f10276e;
        if (map.containsKey(arVar)) {
            f10273b.c("Cannot start sub-recording because one is already ongoing with the key %s", arVar.getClass().getSimpleName());
            return;
        }
        com.google.firebase.perf.e.f fVarE = e();
        if (fVarE.e()) {
            map.put(arVar, (com.google.firebase.perf.metrics.e) fVarE.d());
        } else {
            f10273b.c("startFragment(%s): snapshot() failed", arVar.getClass().getSimpleName());
        }
    }
}
