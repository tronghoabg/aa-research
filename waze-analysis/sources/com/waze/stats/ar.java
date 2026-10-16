package com.waze.stats;

import l.a.bri;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ar extends com.waze.sharedui.utils.o {

    /* renamed from: a, reason: collision with root package name */
    private final bri f40543a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ar(bri briVar) {
        h.g.b.x.f(briVar, "payload");
        byte[] bArr = null;
        super(bArr, bArr);
        this.f40543a = briVar;
    }

    public final bri Q() {
        return this.f40543a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ar) && h.g.b.x.n(this.f40543a, ((ar) obj).f40543a);
    }

    public final int hashCode() {
        return this.f40543a.hashCode();
    }

    public final String toString() {
        return "Unauthenticated(payload=" + this.f40543a + ")";
    }
}
