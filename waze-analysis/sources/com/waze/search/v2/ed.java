package com.waze.search.v2;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes7.dex */
public final class ed {

    /* renamed from: a, reason: collision with root package name */
    private final String f36416a;

    private /* synthetic */ ed(String str) {
        this.f36416a = str;
    }

    public static final /* synthetic */ ed a(String str) {
        return new ed(str);
    }

    public final /* synthetic */ String b() {
        return this.f36416a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ed) && h.g.b.x.n(this.f36416a, ((ed) obj).f36416a);
    }

    public final int hashCode() {
        return this.f36416a.hashCode();
    }

    public final String toString() {
        return "MarkerClicked(markerId=" + this.f36416a + ")";
    }
}
