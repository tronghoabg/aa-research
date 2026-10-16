package com.waze.cg.c;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final String f22332a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22333b;

    public o(String str, String str2) {
        x.f(str, "shortName");
        x.f(str2, "flagEmoji");
        this.f22332a = str;
        this.f22333b = str2;
    }

    public final String a() {
        return this.f22333b;
    }

    public final String b() {
        return this.f22332a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return x.n(this.f22332a, oVar.f22332a) && x.n(this.f22333b, oVar.f22333b);
    }

    public final int hashCode() {
        return (this.f22332a.hashCode() * 31) + this.f22333b.hashCode();
    }

    public final String toString() {
        return "Team(shortName=" + this.f22332a + ", flagEmoji=" + this.f22333b + ")";
    }
}
