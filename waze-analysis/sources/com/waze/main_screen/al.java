package com.waze.main_screen;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class al extends com.waze.main_screen.u.d {

    /* renamed from: a, reason: collision with root package name */
    private final String f25833a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(String str) {
        super(null, null);
        h.g.b.x.f(str, "versionNumber");
        this.f25833a = str;
    }

    public final String a() {
        return this.f25833a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof al) && h.g.b.x.n(this.f25833a, ((al) obj).f25833a);
    }

    public final int hashCode() {
        return this.f25833a.hashCode();
    }

    public final String toString() {
        return "CopyVersionNumberToClipboard(versionNumber=" + this.f25833a + ")";
    }
}
