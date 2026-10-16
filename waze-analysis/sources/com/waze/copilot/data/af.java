package com.waze.copilot.data;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    private final int f22949a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22950b;

    /* renamed from: c, reason: collision with root package name */
    private final a f22951c;

    /* renamed from: d, reason: collision with root package name */
    private final b f22952d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f22953e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f22954f;

    public af(int i2, String str, a aVar, b bVar, boolean z, boolean z2) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(aVar, "downloadable");
        h.g.b.x.f(bVar, "preview");
        this.f22949a = i2;
        this.f22950b = str;
        this.f22951c = aVar;
        this.f22952d = bVar;
        this.f22953e = z;
        this.f22954f = z2;
    }

    public final int a() {
        return this.f22949a;
    }

    public final a b() {
        return this.f22951c;
    }

    public final String c() {
        return this.f22950b;
    }

    public final boolean d() {
        return this.f22954f;
    }

    public final boolean e() {
        return this.f22953e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        return this.f22949a == afVar.f22949a && h.g.b.x.n(this.f22950b, afVar.f22950b) && h.g.b.x.n(this.f22951c, afVar.f22951c) && h.g.b.x.n(this.f22952d, afVar.f22952d) && this.f22953e == afVar.f22953e && this.f22954f == afVar.f22954f;
    }

    public final int hashCode() {
        return (((((((((this.f22949a * 31) + this.f22950b.hashCode()) * 31) + this.f22951c.hashCode()) * 31) + this.f22952d.hashCode()) * 31) + a.a.a(this.f22953e)) * 31) + a.a.a(this.f22954f);
    }

    public final String toString() {
        return "MoodAsset(id=" + this.f22949a + ", name=" + this.f22950b + ", downloadable=" + this.f22951c + ", preview=" + this.f22952d + ", isHidden=" + this.f22953e + ", isAds=" + this.f22954f + ")";
    }
}
