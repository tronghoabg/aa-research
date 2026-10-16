package com.waze.main_screen;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class an extends com.waze.main_screen.u.d {

    /* renamed from: a, reason: collision with root package name */
    private final String f25835a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(String str) {
        super(null, null);
        h.g.b.x.f(str, "url");
        this.f25835a = str;
    }

    public final String a() {
        return this.f25835a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof an) && h.g.b.x.n(this.f25835a, ((an) obj).f25835a);
    }

    public final int hashCode() {
        return this.f25835a.hashCode();
    }

    public final String toString() {
        return "OpenHelpScreen(url=" + this.f25835a + ")";
    }
}
