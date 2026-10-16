package com.waze;

import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class kz {

    /* renamed from: a, reason: collision with root package name */
    private final String f25074a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25075b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25076c;

    public kz(String str, String str2, String str3) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(str2, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(str3, "icon");
        this.f25074a = str;
        this.f25075b = str2;
        this.f25076c = str3;
    }

    public final String a() {
        return this.f25076c;
    }

    public final String b() {
        return this.f25074a;
    }

    public final String c() {
        return this.f25075b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz)) {
            return false;
        }
        kz kzVar = (kz) obj;
        return h.g.b.x.n(this.f25074a, kzVar.f25074a) && h.g.b.x.n(this.f25075b, kzVar.f25075b) && h.g.b.x.n(this.f25076c, kzVar.f25076c);
    }

    public final int hashCode() {
        return (((this.f25074a.hashCode() * 31) + this.f25075b.hashCode()) * 31) + this.f25076c.hashCode();
    }

    public final String toString() {
        return "Service(id=" + this.f25074a + ", name=" + this.f25075b + ", icon=" + this.f25076c + ")";
    }
}
