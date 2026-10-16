package com.waze.sharedrive.g;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    private final List f38628a;

    public ai(List list) {
        h.g.b.x.f(list, "items");
        this.f38628a = list;
    }

    public final List a() {
        return this.f38628a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ai) && h.g.b.x.n(this.f38628a, ((ai) obj).f38628a);
    }

    public final int hashCode() {
        return this.f38628a.hashCode();
    }

    public final String toString() {
        return "ParticipantPreviewDataList(items=" + this.f38628a + ")";
    }
}
