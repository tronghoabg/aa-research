package com.waze.ui.k;

import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f42431a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.ac.n f42432b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ui.ac.n f42433c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f42434d;

    public h(String str, com.waze.ui.ac.n nVar, com.waze.ui.ac.n nVar2, boolean z) {
        x.f(str, TtmlNode.ATTR_ID);
        x.f(nVar, HintConstants.AUTOFILL_HINT_NAME);
        this.f42431a = str;
        this.f42432b = nVar;
        this.f42433c = nVar2;
        this.f42434d = z;
    }

    public static /* synthetic */ h e(h hVar, boolean z) {
        String str = hVar.f42431a;
        com.waze.ui.ac.n nVar = hVar.f42432b;
        com.waze.ui.ac.n nVar2 = hVar.f42433c;
        x.f(str, TtmlNode.ATTR_ID);
        x.f(nVar, HintConstants.AUTOFILL_HINT_NAME);
        return new h(str, nVar, nVar2, z);
    }

    public final com.waze.ui.ac.n a() {
        return this.f42433c;
    }

    public final com.waze.ui.ac.n b() {
        return this.f42432b;
    }

    public final String c() {
        return this.f42431a;
    }

    public final boolean d() {
        return this.f42434d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return x.n(this.f42431a, hVar.f42431a) && x.n(this.f42432b, hVar.f42432b) && x.n(this.f42433c, hVar.f42433c) && this.f42434d == hVar.f42434d;
    }

    public final int hashCode() {
        int iHashCode = (this.f42431a.hashCode() * 31) + this.f42432b.hashCode();
        com.waze.ui.ac.n nVar = this.f42433c;
        return (((iHashCode * 31) + (nVar == null ? 0 : nVar.hashCode())) * 31) + a.a.a(this.f42434d);
    }

    public final String toString() {
        return "Permit(id=" + this.f42431a + ", name=" + this.f42432b + ", description=" + this.f42433c + ", isSelected=" + this.f42434d + ")";
    }
}
