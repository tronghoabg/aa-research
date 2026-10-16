package com.waze.cg.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends j {

    /* renamed from: a, reason: collision with root package name */
    private final String f22270a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22271b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, String str2) {
        super(null);
        x.f(str, "teamId");
        x.f(str2, "playerName");
        this.f22270a = str;
        this.f22271b = str2;
    }

    public final String a() {
        return this.f22271b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return x.n(this.f22270a, iVar.f22270a) && x.n(this.f22271b, iVar.f22271b);
    }

    public final int hashCode() {
        return (this.f22270a.hashCode() * 31) + this.f22271b.hashCode();
    }

    public final String toString() {
        return "Score(teamId=" + this.f22270a + ", playerName=" + this.f22271b + ")";
    }
}
