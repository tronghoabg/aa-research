package com.waze.sound;

import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v extends y {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f40424a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f40425b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ByteBuffer byteBuffer, Float f2) {
        super(null);
        h.g.b.x.f(byteBuffer, "data");
        this.f40424a = byteBuffer;
        this.f40425b = f2;
    }

    public final Float a() {
        return this.f40425b;
    }

    public final ByteBuffer b() {
        return this.f40424a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return h.g.b.x.n(this.f40424a, vVar.f40424a) && h.g.b.x.n(this.f40425b, vVar.f40425b);
    }

    public final int hashCode() {
        int iHashCode = this.f40424a.hashCode() * 31;
        Float f2 = this.f40425b;
        return iHashCode + (f2 == null ? 0 : f2.hashCode());
    }

    public final String toString() {
        return "AudioData(data=" + this.f40424a + ", amplitude=" + this.f40425b + ")";
    }
}
