package com.waze.ui.z;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class al implements aq {

    /* renamed from: a, reason: collision with root package name */
    private final String f43914a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43915b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ui.ac.i f43916c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f43917d;

    /* renamed from: e, reason: collision with root package name */
    private final String f43918e;

    public al(String str, String str2, com.waze.ui.ac.i iVar, boolean z, String str3) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(str3, "eta");
        this.f43914a = str;
        this.f43915b = str2;
        this.f43916c = iVar;
        this.f43917d = z;
        this.f43918e = str3;
    }

    public final com.waze.ui.ac.i a() {
        return this.f43916c;
    }

    @Override // com.waze.ui.z.aq
    public final String b() {
        return this.f43914a;
    }

    public final String c() {
        return this.f43918e;
    }

    public final String d() {
        return this.f43915b;
    }

    public final boolean e() {
        return this.f43917d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al)) {
            return false;
        }
        al alVar = (al) obj;
        return h.g.b.x.n(this.f43914a, alVar.f43914a) && h.g.b.x.n(this.f43915b, alVar.f43915b) && h.g.b.x.n(this.f43916c, alVar.f43916c) && this.f43917d == alVar.f43917d && h.g.b.x.n(this.f43918e, alVar.f43918e);
    }

    public final int hashCode() {
        int iHashCode = this.f43914a.hashCode() * 31;
        String str = this.f43915b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        com.waze.ui.ac.i iVar = this.f43916c;
        return ((((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31) + a.a.a(this.f43917d)) * 31) + this.f43918e.hashCode();
    }

    public final String toString() {
        return "Driver(id=" + this.f43914a + ", name=" + this.f43915b + ", imageSource=" + this.f43916c + ", isCurrentUser=" + this.f43917d + ", eta=" + this.f43918e + ")";
    }
}
