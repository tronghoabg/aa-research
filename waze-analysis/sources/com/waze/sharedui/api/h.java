package com.waze.sharedui.api;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f38804a = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        boolean z = ((h) obj).f38804a;
        return true;
    }

    public final int hashCode() {
        return DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS;
    }

    public final String toString() {
        return "ConnectResponse(success=true)";
    }
}
