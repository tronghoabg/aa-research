package com.waze.utils;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum f {
    GLOBAL,
    HANDLER,
    ACTIVITY_RESULT(4096),
    NOTIFICATION,
    JNI_CALLBACK;


    /* renamed from: g, reason: collision with root package name */
    private int f44877g;

    f(int i2) {
        this.f44877g = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized int b() {
        int i2;
        i2 = this.f44877g + 1;
        this.f44877g = i2;
        return i2;
    }

    f() {
        this(0);
    }
}
