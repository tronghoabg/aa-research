package com.waze.ui.z;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class am implements aq {

    /* renamed from: a, reason: collision with root package name */
    private final String f43919a;

    public am(String str) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        this.f43919a = str;
    }

    @Override // com.waze.ui.z.aq
    public final String b() {
        return this.f43919a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof am) && h.g.b.x.n(this.f43919a, ((am) obj).f43919a);
    }

    public final int hashCode() {
        return this.f43919a.hashCode();
    }

    public final String toString() {
        return "Loading(id=" + this.f43919a + ")";
    }
}
