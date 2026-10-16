package com.waze.ui.z;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ao implements ap {

    /* renamed from: a, reason: collision with root package name */
    private final String f43925a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43926b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ui.ac.i f43927c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f43928d;

    public ao(String str, String str2, com.waze.ui.ac.i iVar, boolean z) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        this.f43925a = str;
        this.f43926b = str2;
        this.f43927c = iVar;
        this.f43928d = z;
    }

    public final com.waze.ui.ac.i a() {
        return this.f43927c;
    }

    @Override // com.waze.ui.z.aq
    public final String b() {
        return this.f43925a;
    }

    public final String c() {
        return this.f43926b;
    }

    public final boolean d() {
        return this.f43928d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        return h.g.b.x.n(this.f43925a, aoVar.f43925a) && h.g.b.x.n(this.f43926b, aoVar.f43926b) && h.g.b.x.n(this.f43927c, aoVar.f43927c) && this.f43928d == aoVar.f43928d;
    }

    public final int hashCode() {
        int iHashCode = this.f43925a.hashCode() * 31;
        String str = this.f43926b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        com.waze.ui.ac.i iVar = this.f43927c;
        return ((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31) + a.a.a(this.f43928d);
    }

    public final String toString() {
        return "Other(id=" + this.f43925a + ", name=" + this.f43926b + ", imageSource=" + this.f43927c + ", isSharingLocation=" + this.f43928d + ")";
    }
}
