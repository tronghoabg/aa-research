package com.waze.location;

import android.os.SystemClock;
import j$.time.Instant;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class s implements com.waze.location.a.b {
    @Override // com.waze.location.a.b
    public final Instant a() {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(SystemClock.elapsedRealtime());
        h.g.b.x.e(instantOfEpochMilli, "ofEpochMilli(...)");
        return instantOfEpochMilli;
    }
}
