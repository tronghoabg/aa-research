package com.google.firebase.perf.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum a {
    TRACE_EVENT_RATE_LIMITED("_fstec"),
    NETWORK_TRACE_EVENT_RATE_LIMITED("_fsntc"),
    TRACE_STARTED_NOT_STOPPED("_tsns"),
    FRAMES_TOTAL("_fr_tot"),
    FRAMES_SLOW("_fr_slo"),
    FRAMES_FROZEN("_fr_fzn");


    /* renamed from: h, reason: collision with root package name */
    private final String f10380h;

    a(String str) {
        this.f10380h = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f10380h;
    }
}
