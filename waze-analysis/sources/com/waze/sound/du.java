package com.waze.sound;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class du extends dw {

    /* renamed from: a, reason: collision with root package name */
    private final Map f39823a;

    /* renamed from: b, reason: collision with root package name */
    private final gr f39824b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39825c;

    public du(Map map, gr grVar, String str) {
        h.g.b.x.f(map, "instructions");
        h.g.b.x.f(grVar, "startDriveAnnouncement");
        h.g.b.x.f(str, "routeUUID");
        this.f39823a = map;
        this.f39824b = grVar;
        this.f39825c = str;
    }

    public final gr a() {
        return this.f39824b;
    }

    @Override // com.waze.sound.dw
    public final String b() {
        return this.f39825c;
    }

    public final Map c() {
        return this.f39823a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du)) {
            return false;
        }
        du duVar = (du) obj;
        return h.g.b.x.n(this.f39823a, duVar.f39823a) && h.g.b.x.n(this.f39824b, duVar.f39824b) && h.g.b.x.n(this.f39825c, duVar.f39825c);
    }

    public final int hashCode() {
        return (((this.f39823a.hashCode() * 31) + this.f39824b.hashCode()) * 31) + this.f39825c.hashCode();
    }

    public final String toString() {
        return "Navigating(instructions=" + this.f39823a + ", startDriveAnnouncement=" + this.f39824b + ", routeUUID=" + this.f39825c + ")";
    }
}
