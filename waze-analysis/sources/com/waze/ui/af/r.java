package com.waze.ui.af;

import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r extends s {

    /* renamed from: a, reason: collision with root package name */
    private final String f41898a;

    /* renamed from: b, reason: collision with root package name */
    private final String f41899b;

    /* renamed from: c, reason: collision with root package name */
    private final String f41900c;

    /* renamed from: d, reason: collision with root package name */
    private final String f41901d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, String str2, String str3, String str4) {
        super(str3, x.f41918b);
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(str2, HintConstants.AUTOFILL_HINT_NAME);
        this.f41898a = str;
        this.f41899b = str2;
        this.f41900c = str3;
        this.f41901d = str4;
    }

    @Override // com.waze.ui.af.q
    public final String b() {
        return this.f41900c;
    }

    @Override // com.waze.ui.af.q
    public final String c() {
        return this.f41898a;
    }

    @Override // com.waze.ui.af.q
    public final String d() {
        return this.f41899b;
    }

    @Override // com.waze.ui.af.s
    public final String e() {
        return this.f41901d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return h.g.b.x.n(this.f41898a, rVar.f41898a) && h.g.b.x.n(this.f41899b, rVar.f41899b) && h.g.b.x.n(this.f41900c, rVar.f41900c) && h.g.b.x.n(this.f41901d, rVar.f41901d);
    }

    public final int hashCode() {
        int iHashCode = (this.f41898a.hashCode() * 31) + this.f41899b.hashCode();
        String str = this.f41900c;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f41901d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "PromptOption(id=" + this.f41898a + ", name=" + this.f41899b + ", description=" + this.f41900c + ", lang=" + this.f41901d + ")";
    }
}
