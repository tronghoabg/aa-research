package com.waze.settings;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bg extends bi {

    /* renamed from: a, reason: collision with root package name */
    private final Map f36867a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(Map map) {
        super(null);
        h.g.b.x.f(map, "languages");
        this.f36867a = map;
    }

    public final Map a() {
        return this.f36867a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bg) && h.g.b.x.n(this.f36867a, ((bg) obj).f36867a);
    }

    public final int hashCode() {
        return this.f36867a.hashCode();
    }

    public final String toString() {
        return "Data(languages=" + this.f36867a + ")";
    }
}
