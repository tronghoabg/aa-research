package com.waze.ui.z;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ak implements aq {

    /* renamed from: a, reason: collision with root package name */
    private final String f43910a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43911b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ui.ac.i f43912c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f43913d;

    public ak(String str, String str2, com.waze.ui.ac.i iVar, boolean z) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        this.f43910a = str;
        this.f43911b = str2;
        this.f43912c = iVar;
        this.f43913d = z;
    }

    public final com.waze.ui.ac.i a() {
        return this.f43912c;
    }

    @Override // com.waze.ui.z.aq
    public final String b() {
        return this.f43910a;
    }

    public final String c() {
        return this.f43911b;
    }

    public final boolean d() {
        return this.f43913d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak)) {
            return false;
        }
        ak akVar = (ak) obj;
        return h.g.b.x.n(this.f43910a, akVar.f43910a) && h.g.b.x.n(this.f43911b, akVar.f43911b) && h.g.b.x.n(this.f43912c, akVar.f43912c) && this.f43913d == akVar.f43913d;
    }

    public final int hashCode() {
        int iHashCode = this.f43910a.hashCode() * 31;
        String str = this.f43911b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        com.waze.ui.ac.i iVar = this.f43912c;
        return ((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31) + a.a.a(this.f43913d);
    }

    public final String toString() {
        return "Arrived(id=" + this.f43910a + ", name=" + this.f43911b + ", imageSource=" + this.f43912c + ", isCurrentUser=" + this.f43913d + ")";
    }
}
