package com.waze.car_lib.screens;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ar {

    /* renamed from: a, reason: collision with root package name */
    private final int f21787a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f21788b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f21789c;

    public /* synthetic */ ar(int i2, boolean z, boolean z2, int i3) {
        this(i2, z & ((i3 & 2) == 0), z2 & ((i3 & 4) == 0));
    }

    public final int a() {
        return this.f21787a;
    }

    public final boolean b() {
        return this.f21788b;
    }

    public final boolean c() {
        return this.f21789c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar)) {
            return false;
        }
        ar arVar = (ar) obj;
        return this.f21787a == arVar.f21787a && this.f21788b == arVar.f21788b && this.f21789c == arVar.f21789c;
    }

    public final int hashCode() {
        return (((this.f21787a * 31) + a.a.a(this.f21788b)) * 31) + a.a.a(this.f21789c);
    }

    public final String toString() {
        return "NavigationPopupButton(text=" + this.f21787a + ", primary=" + this.f21788b + ", timer=" + this.f21789c + ")";
    }

    public ar(int i2, boolean z, boolean z2) {
        this.f21787a = i2;
        this.f21788b = z;
        this.f21789c = z2;
    }
}
