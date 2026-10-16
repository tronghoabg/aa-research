package com.google.firebase.perf.metrics.a;

import com.google.firebase.perf.f.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b extends e {

    /* renamed from: b, reason: collision with root package name */
    private final r f10510b;

    b(r rVar) {
        this.f10510b = rVar;
    }

    @Override // com.google.firebase.perf.metrics.a.e
    public final boolean a() {
        r rVar = this.f10510b;
        if (!rVar.hasSessionId()) {
            return false;
        }
        if (rVar.getCpuMetricReadingsCount() > 0 || rVar.getAndroidMemoryReadingsCount() > 0) {
            return true;
        }
        return rVar.hasGaugeMetadata() && rVar.getGaugeMetadata().hasMaxAppJavaHeapMemoryKb();
    }
}
