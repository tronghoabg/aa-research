package com.google.firebase.perf.f;

import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface ae extends fj {
    r getGaugeMetric();

    ab getNetworkRequestMetric();

    ao getTraceMetric();

    boolean hasGaugeMetric();

    boolean hasNetworkRequestMetric();

    boolean hasTraceMetric();
}
