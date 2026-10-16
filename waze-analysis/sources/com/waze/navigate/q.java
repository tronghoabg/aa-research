package com.waze.navigate;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class q extends r {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f31801a;

    public /* synthetic */ q(byte[] bArr) {
        super(null);
        this.f31801a = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        boolean z = ((q) obj).f31801a;
        return true;
    }

    public final int hashCode() {
        return DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS;
    }

    public final String toString() {
        return "Loading(loading=true)";
    }

    public q() {
        this(null);
    }
}
