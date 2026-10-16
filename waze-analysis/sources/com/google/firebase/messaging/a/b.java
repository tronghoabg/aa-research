package com.google.firebase.messaging.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum b implements com.google.firebase.d.c.d {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f10088e;

    b(int i2) {
        this.f10088e = i2;
    }

    @Override // com.google.firebase.d.c.d
    public final int a() {
        return this.f10088e;
    }
}
