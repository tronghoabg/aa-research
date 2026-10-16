package com.waze.o.c.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q implements w {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32824a = true;

    @Override // com.waze.t.b.cb
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        boolean z = ((q) obj).f32824a;
        return true;
    }

    public final int hashCode() {
        return DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS;
    }

    public final String toString() {
        return "ChangeVoiceGuidanceModeResult(success=true)";
    }
}
