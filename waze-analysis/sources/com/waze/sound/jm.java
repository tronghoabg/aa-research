package com.waze.sound;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class jm extends jo {

    /* renamed from: a, reason: collision with root package name */
    private final int f40332a;

    /* renamed from: b, reason: collision with root package name */
    private final List f40333b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(int i2, List list) {
        super(null);
        h.g.b.x.f(list, "clientAnnouncements");
        this.f40332a = i2;
        this.f40333b = list;
    }

    @Override // com.waze.sound.jo
    public final int a() {
        return this.f40332a;
    }

    @Override // com.waze.sound.jo
    public final List b() {
        return this.f40333b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm)) {
            return false;
        }
        jm jmVar = (jm) obj;
        return this.f40332a == jmVar.f40332a && h.g.b.x.n(this.f40333b, jmVar.f40333b);
    }

    public final int hashCode() {
        return (this.f40332a * 31) + this.f40333b.hashCode();
    }

    public final String toString() {
        return "Local(routeSegmentIndex=" + this.f40332a + ", clientAnnouncements=" + this.f40333b + ")";
    }
}
