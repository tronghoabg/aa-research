package com.waze.ui.af;

import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w extends s {

    /* renamed from: a, reason: collision with root package name */
    private final String f41913a;

    /* renamed from: b, reason: collision with root package name */
    private final String f41914b;

    /* renamed from: c, reason: collision with root package name */
    private final String f41915c;

    /* renamed from: d, reason: collision with root package name */
    private final String f41916d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String str, String str2, String str3, String str4) {
        super(str3, x.f41917a);
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(str2, HintConstants.AUTOFILL_HINT_NAME);
        this.f41913a = str;
        this.f41914b = str2;
        this.f41915c = str3;
        this.f41916d = str4;
    }

    @Override // com.waze.ui.af.q
    public final String b() {
        return this.f41915c;
    }

    @Override // com.waze.ui.af.q
    public final String c() {
        return this.f41913a;
    }

    @Override // com.waze.ui.af.q
    public final String d() {
        return this.f41914b;
    }

    @Override // com.waze.ui.af.s
    public final String e() {
        return this.f41916d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return h.g.b.x.n(this.f41913a, wVar.f41913a) && h.g.b.x.n(this.f41914b, wVar.f41914b) && h.g.b.x.n(this.f41915c, wVar.f41915c) && h.g.b.x.n(this.f41916d, wVar.f41916d);
    }

    public final int hashCode() {
        int iHashCode = (this.f41913a.hashCode() * 31) + this.f41914b.hashCode();
        String str = this.f41915c;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f41916d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "TtsOption(id=" + this.f41913a + ", name=" + this.f41914b + ", description=" + this.f41915c + ", lang=" + this.f41916d + ")";
    }
}
