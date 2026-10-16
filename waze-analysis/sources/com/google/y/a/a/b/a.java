package com.google.y.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final byte f13424a;

    /* renamed from: b, reason: collision with root package name */
    private final byte f13425b;

    a(int i2) {
        this.f13424a = (byte) (i2 & 224);
        this.f13425b = (byte) (i2 & 31);
    }

    public final byte a() {
        return this.f13425b;
    }

    public final byte b() {
        return this.f13424a;
    }

    public final int c() {
        return (this.f13424a >> 5) & 7;
    }
}
