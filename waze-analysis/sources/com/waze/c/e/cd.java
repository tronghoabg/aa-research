package com.waze.c.e;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cd {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f18640a = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd)) {
            return false;
        }
        boolean z = ((cd) obj).f18640a;
        return true;
    }

    public final int hashCode() {
        return DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS;
    }

    public final String toString() {
        return "AlternateRouteParams(isSafeRouteEnabled=true)";
    }
}
