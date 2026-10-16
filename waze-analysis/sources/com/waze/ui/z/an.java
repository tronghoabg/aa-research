package com.waze.ui.z;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class an implements ap {

    /* renamed from: a, reason: collision with root package name */
    private final String f43920a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43921b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ui.ac.i f43922c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f43923d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f43924e;

    public an(String str, String str2, com.waze.ui.ac.i iVar, boolean z, boolean z2) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        this.f43920a = str;
        this.f43921b = str2;
        this.f43922c = iVar;
        this.f43923d = z;
        this.f43924e = z2;
    }

    public final com.waze.ui.ac.i a() {
        return this.f43922c;
    }

    @Override // com.waze.ui.z.aq
    public final String b() {
        return this.f43920a;
    }

    public final boolean c() {
        return this.f43923d;
    }

    public final boolean d() {
        return this.f43924e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an)) {
            return false;
        }
        an anVar = (an) obj;
        return h.g.b.x.n(this.f43920a, anVar.f43920a) && h.g.b.x.n(this.f43921b, anVar.f43921b) && h.g.b.x.n(this.f43922c, anVar.f43922c) && this.f43923d == anVar.f43923d && this.f43924e == anVar.f43924e;
    }

    public final int hashCode() {
        int iHashCode = this.f43920a.hashCode() * 31;
        String str = this.f43921b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        com.waze.ui.ac.i iVar = this.f43922c;
        return ((((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31) + a.a.a(this.f43923d)) * 31) + a.a.a(this.f43924e);
    }

    public final String toString() {
        return "CurrentUser(id=" + this.f43920a + ", name=" + this.f43921b + ", imageSource=" + this.f43922c + ", isSharingLocation=" + this.f43923d + ", isToggleEnabled=" + this.f43924e + ")";
    }
}
