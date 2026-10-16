package com.google.android.gms.common.api;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ac extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.f f4695a;

    public ac(com.google.android.gms.common.f fVar) {
        this.f4695a = fVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(String.valueOf(this.f4695a)));
    }
}
