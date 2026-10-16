package com.waze.settings.e.a;

import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final String f37118a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37119b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2) {
        super(null);
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, HintConstants.AUTOFILL_HINT_NAME);
        this.f37118a = str;
        this.f37119b = str2;
    }

    public final String a() {
        return this.f37119b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f37118a, aVar.f37118a) && x.n(this.f37119b, aVar.f37119b);
    }

    public final int hashCode() {
        return (this.f37118a.hashCode() * 31) + this.f37119b.hashCode();
    }

    public final String toString() {
        return "AdHocPermit(id=" + this.f37118a + ", name=" + this.f37119b + ")";
    }
}
