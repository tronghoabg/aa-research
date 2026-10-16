package com.waze.main_screen.p;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bl {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f27202a = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl)) {
            return false;
        }
        boolean z = ((bl) obj).f27202a;
        return true;
    }

    public final int hashCode() {
        return DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS;
    }

    public final String toString() {
        return "OpenAltRoutesRequest(safeRoutes=true)";
    }
}
