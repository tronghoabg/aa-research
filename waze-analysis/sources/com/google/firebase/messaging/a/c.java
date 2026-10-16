package com.google.firebase.messaging.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum c implements com.google.firebase.d.c.d {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f10094f;

    c(int i2) {
        this.f10094f = i2;
    }

    @Override // com.google.firebase.d.c.d
    public final int a() {
        return this.f10094f;
    }
}
