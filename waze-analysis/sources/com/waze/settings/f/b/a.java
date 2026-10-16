package com.waze.settings.f.b;

import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f37219a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37220b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f37221c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f37222d;

    public a(String str, String str2, boolean z, boolean z2) {
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, HintConstants.AUTOFILL_HINT_NAME);
        this.f37219a = str;
        this.f37220b = str2;
        this.f37221c = z;
        this.f37222d = z2;
    }

    public final String a() {
        return this.f37219a;
    }

    public final String b() {
        return this.f37220b;
    }

    public final boolean c() {
        return this.f37221c;
    }

    public final boolean d() {
        return this.f37222d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f37219a, aVar.f37219a) && x.n(this.f37220b, aVar.f37220b) && this.f37221c == aVar.f37221c && this.f37222d == aVar.f37222d;
    }

    public final int hashCode() {
        return (((((this.f37219a.hashCode() * 31) + this.f37220b.hashCode()) * 31) + a.a.a(this.f37221c)) * 31) + a.a.a(this.f37222d);
    }

    public final String toString() {
        return "PassItem(id=" + this.f37219a + ", name=" + this.f37220b + ", isActive=" + this.f37221c + ", isAvailable=" + this.f37222d + ")";
    }
}
