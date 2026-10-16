package com.waze.stats;

import l.a.brf;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ap extends com.waze.sharedui.utils.o {

    /* renamed from: a, reason: collision with root package name */
    private final brf f40541a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ap(brf brfVar) {
        h.g.b.x.f(brfVar, "payload");
        byte[] bArr = null;
        super(bArr, bArr);
        this.f40541a = brfVar;
    }

    public final brf Q() {
        return this.f40541a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ap) && h.g.b.x.n(this.f40541a, ((ap) obj).f40541a);
    }

    public final int hashCode() {
        return this.f40541a.hashCode();
    }

    public final String toString() {
        return "Authenticated(payload=" + this.f40541a + ")";
    }
}
