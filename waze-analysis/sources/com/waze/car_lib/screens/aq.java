package com.waze.car_lib.screens;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aq {

    /* renamed from: a, reason: collision with root package name */
    private final int f21783a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21784b;

    /* renamed from: c, reason: collision with root package name */
    private final ar f21785c;

    /* renamed from: d, reason: collision with root package name */
    private final ar f21786d;

    public aq(int i2, int i3, ar arVar, ar arVar2) {
        h.g.b.x.f(arVar, "firstAction");
        this.f21783a = i2;
        this.f21784b = i3;
        this.f21785c = arVar;
        this.f21786d = arVar2;
    }

    public final int a() {
        return this.f21784b;
    }

    public final int b() {
        return this.f21783a;
    }

    public final ar c() {
        return this.f21785c;
    }

    public final ar d() {
        return this.f21786d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq)) {
            return false;
        }
        aq aqVar = (aq) obj;
        return this.f21783a == aqVar.f21783a && this.f21784b == aqVar.f21784b && h.g.b.x.n(this.f21785c, aqVar.f21785c) && h.g.b.x.n(this.f21786d, aqVar.f21786d);
    }

    public final int hashCode() {
        int iHashCode = (((this.f21783a * 31) + this.f21784b) * 31) + this.f21785c.hashCode();
        ar arVar = this.f21786d;
        return (iHashCode * 31) + (arVar == null ? 0 : arVar.hashCode());
    }

    public final String toString() {
        return "NavigationPopup(title=" + this.f21783a + ", message=" + this.f21784b + ", firstAction=" + this.f21785c + ", secondAction=" + this.f21786d + ")";
    }

    public /* synthetic */ aq(int i2, int i3, ar arVar) {
        this(i2, i3, arVar, null);
    }
}
