package com.waze.settings;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    private final List f36811a;

    public b(List list) {
        h.g.b.x.f(list, "partnerAppConfigs");
        this.f36811a = list;
    }

    public final List a() {
        return this.f36811a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && h.g.b.x.n(this.f36811a, ((b) obj).f36811a);
    }

    public final int hashCode() {
        return this.f36811a.hashCode();
    }

    public final String toString() {
        return "Enabled(partnerAppConfigs=" + this.f36811a + ")";
    }
}
