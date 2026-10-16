package com.waze.search;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class at extends ai {

    /* renamed from: a, reason: collision with root package name */
    private final String f35521a;

    /* JADX WARN: Illegal instructions before constructor call */
    public at(String str) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        byte[] bArr = null;
        super(bArr, bArr);
        this.f35521a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof at) && h.g.b.x.n(this.f35521a, ((at) obj).f35521a);
    }

    public final int hashCode() {
        return this.f35521a.hashCode();
    }

    public final String p() {
        return this.f35521a;
    }

    public final String toString() {
        return "FuelProduct(id=" + this.f35521a + ")";
    }
}
