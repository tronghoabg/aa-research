package com.waze.bv;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f17489a;

    /* renamed from: b, reason: collision with root package name */
    private final long f17490b;

    public a(int i2, long j2) {
        this.f17489a = i2;
        this.f17490b = j2;
    }

    public final int a() {
        return this.f17489a;
    }

    public final long b() {
        return this.f17490b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f17489a == aVar.f17489a && this.f17490b == aVar.f17490b;
    }

    public final int hashCode() {
        return (this.f17489a * 31) + a.a.b(this.f17490b);
    }

    public final String toString() {
        return "AlertSoundState(speedForAlertSoundNoUnit=" + this.f17489a + ", timestampUtcMs=" + this.f17490b + ")";
    }
}
