package com.waze.ui.f;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ai extends ak {

    /* renamed from: a, reason: collision with root package name */
    private final String f42281a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(String str) {
        super(null);
        h.g.b.x.f(str, "text");
        this.f42281a = str;
    }

    public final String a() {
        return this.f42281a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ai) && h.g.b.x.n(this.f42281a, ((ai) obj).f42281a);
    }

    public final int hashCode() {
        return this.f42281a.hashCode();
    }

    public final String toString() {
        return "Speaking(text=" + this.f42281a + ")";
    }
}
