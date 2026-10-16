package com.google.firebase.remoteconfig.internal;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private int f10749a = 1;

    public x(byte[] bArr) {
    }

    public final y a() {
        return new y(this.f10749a);
    }

    final void b(int i2) {
        this.f10749a = i2;
    }

    public final int c() {
        return this.f10749a;
    }

    public final void d(boolean z) {
        this.f10749a = (this.f10749a * 31) + (z ? 1 : 0);
    }

    public final void e(Object obj) {
        this.f10749a = (this.f10749a * 31) + (obj == null ? 0 : obj.hashCode());
    }
}
