package com.waze.search;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class as extends ai {

    /* renamed from: a, reason: collision with root package name */
    private final String f35520a;

    /* JADX WARN: Illegal instructions before constructor call */
    public as(String str) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        byte[] bArr = null;
        super(bArr, bArr);
        this.f35520a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof as) && h.g.b.x.n(this.f35520a, ((as) obj).f35520a);
    }

    public final int hashCode() {
        return this.f35520a.hashCode();
    }

    public final String p() {
        return this.f35520a;
    }

    public final String toString() {
        return "FuelBrand(id=" + this.f35520a + ")";
    }
}
