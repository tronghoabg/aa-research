package com.google.android.gms.common.api;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class i extends Exception {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    protected final Status f4697a;

    public i(Status status) {
        super(status.a() + ": " + (status.c() != null ? status.c() : ""));
        this.f4697a = status;
    }

    public final int a() {
        return this.f4697a.a();
    }

    public final Status b() {
        return this.f4697a;
    }
}
