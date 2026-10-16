package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class eh {

    /* renamed from: a, reason: collision with root package name */
    private static int f28832a;

    /* renamed from: b, reason: collision with root package name */
    private int f28833b = 1;

    public eh() {
        f28832a++;
    }

    public final synchronized boolean a() {
        return this.f28833b == 1;
    }

    public final synchronized boolean b() {
        return this.f28833b == 3;
    }

    public final synchronized void c(int i2) {
        this.f28833b = i2;
    }

    public final String toString() {
        int i2 = this.f28833b;
        return " UISurfaceEvent. Type: " + (i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "DESTROYED" : "CHANGED" : "CREATED") + ". Frame id: " + f28832a + " ";
    }
}
