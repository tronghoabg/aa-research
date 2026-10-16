package com.waze.ui.af;

import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class y extends q {

    /* renamed from: a, reason: collision with root package name */
    private final String f41921a;

    /* renamed from: b, reason: collision with root package name */
    private final String f41922b;

    /* renamed from: c, reason: collision with root package name */
    private final c f41923c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f41924d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f41925e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str, String str2, c cVar, boolean z, boolean z2) {
        super(null, x.f41919c);
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(str2, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(cVar, "downloadState");
        this.f41921a = str;
        this.f41922b = str2;
        this.f41923c = cVar;
        this.f41924d = z;
        this.f41925e = z2;
    }

    @Override // com.waze.ui.af.q
    public final String c() {
        return this.f41921a;
    }

    @Override // com.waze.ui.af.q
    public final String d() {
        return this.f41922b;
    }

    public final c e() {
        return this.f41923c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return h.g.b.x.n(this.f41921a, yVar.f41921a) && h.g.b.x.n(this.f41922b, yVar.f41922b) && this.f41923c == yVar.f41923c && this.f41924d == yVar.f41924d && this.f41925e == yVar.f41925e;
    }

    public final boolean f() {
        return this.f41924d;
    }

    public final boolean g() {
        return this.f41925e;
    }

    public final int hashCode() {
        return (((((((this.f41921a.hashCode() * 31) + this.f41922b.hashCode()) * 31) + this.f41923c.hashCode()) * 31) + a.a.a(this.f41924d)) * 31) + a.a.a(this.f41925e);
    }

    public final String toString() {
        return "UserRecordedOption(id=" + this.f41921a + ", name=" + this.f41922b + ", downloadState=" + this.f41923c + ", isOwner=" + this.f41924d + ", isUploaded=" + this.f41925e + ")";
    }
}
