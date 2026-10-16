package com.waze.ui.u;

import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    private final String f43436a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43437b;

    /* renamed from: c, reason: collision with root package name */
    private final String f43438c;

    public ai(String str, String str2, String str3) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(str2, HintConstants.AUTOFILL_HINT_NAME);
        this.f43436a = str;
        this.f43437b = str2;
        this.f43438c = str3;
    }

    public final String a() {
        return this.f43436a;
    }

    public final String b() {
        return this.f43437b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) obj;
        return h.g.b.x.n(this.f43436a, aiVar.f43436a) && h.g.b.x.n(this.f43437b, aiVar.f43437b) && h.g.b.x.n(this.f43438c, aiVar.f43438c);
    }

    public final int hashCode() {
        int iHashCode = (this.f43436a.hashCode() * 31) + this.f43437b.hashCode();
        String str = this.f43438c;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "VenueData(id=" + this.f43436a + ", name=" + this.f43437b + ", image=" + this.f43438c + ")";
    }
}
