package com.google.android.datatransport.runtime.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum f implements com.google.firebase.d.c.d {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* renamed from: i, reason: collision with root package name */
    private final int f4118i;

    f(int i2) {
        this.f4118i = i2;
    }

    @Override // com.google.firebase.d.c.d
    public final int a() {
        return this.f4118i;
    }
}
