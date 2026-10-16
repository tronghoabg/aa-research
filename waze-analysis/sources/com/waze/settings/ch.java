package com.waze.settings;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ch extends cj {

    /* renamed from: a, reason: collision with root package name */
    private final List f36967a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch(List list) {
        super(null);
        h.g.b.x.f(list, "categories");
        this.f36967a = list;
    }

    public final List a() {
        return this.f36967a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ch) && h.g.b.x.n(this.f36967a, ((ch) obj).f36967a);
    }

    public final int hashCode() {
        return this.f36967a.hashCode();
    }

    public final String toString() {
        return "PushNotificationPreferences(categories=" + this.f36967a + ")";
    }
}
