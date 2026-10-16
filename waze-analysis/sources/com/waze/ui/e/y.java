package com.waze.ui.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final r f42260a;

    /* renamed from: b, reason: collision with root package name */
    private final aa f42261b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f42262c;

    /* renamed from: d, reason: collision with root package name */
    private final String f42263d;

    public /* synthetic */ y(r rVar, String str, int i2) {
        h.g.b.x.f(rVar, "icon");
        this.f42260a = rVar;
        this.f42261b = null;
        this.f42262c = (i2 & 4) != 0;
        this.f42263d = (i2 & 8) != 0 ? null : str;
    }

    public final r a() {
        return this.f42260a;
    }

    public final String b() {
        return this.f42263d;
    }

    public final boolean c() {
        return this.f42262c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!h.g.b.x.n(this.f42260a, yVar.f42260a)) {
            return false;
        }
        aa aaVar = yVar.f42261b;
        return h.g.b.x.n(null, null) && this.f42262c == yVar.f42262c && h.g.b.x.n(this.f42263d, yVar.f42263d);
    }

    public final int hashCode() {
        int iHashCode = this.f42260a.hashCode() * 961;
        String str = this.f42263d;
        return ((iHashCode + a.a.a(this.f42262c)) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PackButtonUiState(icon=" + this.f42260a + ", radialMenuContent=null, defaultIconSize=" + this.f42262c + ", iconContentDescription=" + this.f42263d + ")";
    }
}
