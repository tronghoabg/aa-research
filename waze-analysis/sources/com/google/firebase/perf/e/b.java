package com.google.firebase.perf.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum b {
    APP_START_TRACE_NAME("_as"),
    ON_CREATE_TRACE_NAME("_astui"),
    ON_START_TRACE_NAME("_astfd"),
    ON_RESUME_TRACE_NAME("_asti"),
    FOREGROUND_TRACE_NAME("_fs"),
    BACKGROUND_TRACE_NAME("_bs");


    /* renamed from: h, reason: collision with root package name */
    private final String f10388h;

    b(String str) {
        this.f10388h = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f10388h;
    }
}
