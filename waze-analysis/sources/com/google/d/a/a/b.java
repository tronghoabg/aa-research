package com.google.d.a.a;

import android.os.SystemClock;
import com.google.d.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b extends aq {
    b() {
    }

    @Override // com.google.d.b.aq
    public final long read() {
        return SystemClock.elapsedRealtime() * 1000000;
    }
}
