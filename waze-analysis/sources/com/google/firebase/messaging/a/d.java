package com.google.firebase.messaging.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum d implements com.google.firebase.d.c.d {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f10100f;

    d(int i2) {
        this.f10100f = i2;
    }

    @Override // com.google.firebase.d.c.d
    public final int a() {
        return this.f10100f;
    }
}
