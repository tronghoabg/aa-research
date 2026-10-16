package com.waze.main_screen.v;

import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f27798a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27799b;

    /* renamed from: c, reason: collision with root package name */
    private final String f27800c;

    /* renamed from: d, reason: collision with root package name */
    private final String f27801d;

    /* renamed from: e, reason: collision with root package name */
    private final String f27802e;

    /* renamed from: f, reason: collision with root package name */
    private final String f27803f;

    public i(String str, String str2, String str3, String str4, String str5, String str6) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(str2, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(str3, "text");
        this.f27798a = str;
        this.f27799b = str2;
        this.f27800c = str3;
        this.f27801d = str4;
        this.f27802e = str5;
        this.f27803f = str6;
    }

    public final String a() {
        return this.f27802e;
    }

    public final String b() {
        return this.f27801d;
    }

    public final String c() {
        return this.f27798a;
    }

    public final String d() {
        return this.f27803f;
    }

    public final String e() {
        return this.f27799b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return h.g.b.x.n(this.f27798a, iVar.f27798a) && h.g.b.x.n(this.f27799b, iVar.f27799b) && h.g.b.x.n(this.f27800c, iVar.f27800c) && h.g.b.x.n(this.f27801d, iVar.f27801d) && h.g.b.x.n(this.f27802e, iVar.f27802e) && h.g.b.x.n(this.f27803f, iVar.f27803f);
    }

    public final String f() {
        return this.f27800c;
    }

    public final int hashCode() {
        int iHashCode = (((this.f27798a.hashCode() * 31) + this.f27799b.hashCode()) * 31) + this.f27800c.hashCode();
        String str = this.f27801d;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f27802e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f27803f;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "PromotionalChipModel(id=" + this.f27798a + ", name=" + this.f27799b + ", text=" + this.f27800c + ", callToAction=" + this.f27801d + ", actionDeeplink=" + this.f27802e + ", imageUrl=" + this.f27803f + ")";
    }
}
