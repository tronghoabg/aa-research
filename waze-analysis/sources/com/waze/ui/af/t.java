package com.waze.ui.af;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t implements v {

    /* renamed from: a, reason: collision with root package name */
    private final String f41903a;

    /* renamed from: b, reason: collision with root package name */
    private final List f41904b;

    /* renamed from: c, reason: collision with root package name */
    private final List f41905c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f41906d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f41907e;

    /* renamed from: f, reason: collision with root package name */
    private final d f41908f;

    public t(String str, List list, List list2, boolean z, d dVar, boolean z2) {
        h.g.b.x.f(list, "promptTtsVoices");
        h.g.b.x.f(list2, "customVoices");
        this.f41903a = str;
        this.f41904b = list;
        this.f41905c = list2;
        this.f41906d = z;
        this.f41908f = dVar;
        this.f41907e = z2;
    }

    public static /* synthetic */ t f(t tVar, String str, List list, List list2, boolean z, d dVar, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            str = tVar.f41903a;
        }
        String str2 = str;
        if ((i2 & 2) != 0) {
            list = tVar.f41904b;
        }
        List list3 = list;
        if ((i2 & 4) != 0) {
            list2 = tVar.f41905c;
        }
        List list4 = list2;
        if ((i2 & 8) != 0) {
            z = tVar.f41906d;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            dVar = tVar.f41908f;
        }
        d dVar2 = dVar;
        if ((i2 & 32) != 0) {
            z2 = tVar.f41907e;
        }
        h.g.b.x.f(list3, "promptTtsVoices");
        h.g.b.x.f(list4, "customVoices");
        return new t(str2, list3, list4, z3, dVar2, z2);
    }

    @Override // com.waze.ui.af.v
    public final String a() {
        return this.f41903a;
    }

    public final List b() {
        return this.f41905c;
    }

    public final List c() {
        return this.f41904b;
    }

    public final boolean d() {
        return this.f41906d;
    }

    @Override // com.waze.ui.af.v
    public final boolean e() {
        return this.f41907e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return h.g.b.x.n(this.f41903a, tVar.f41903a) && h.g.b.x.n(this.f41904b, tVar.f41904b) && h.g.b.x.n(this.f41905c, tVar.f41905c) && this.f41906d == tVar.f41906d && h.g.b.x.n(this.f41908f, tVar.f41908f) && this.f41907e == tVar.f41907e;
    }

    public final int hashCode() {
        String str = this.f41903a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) * 31) + this.f41904b.hashCode()) * 31) + this.f41905c.hashCode();
        boolean z = this.f41906d;
        d dVar = this.f41908f;
        return (((((iHashCode * 31) + a.a.a(z)) * 31) + (dVar != null ? 1609589007 : 0)) * 31) + a.a.a(this.f41907e);
    }

    public final String toString() {
        return "AllVoices(selectedVoiceId=" + this.f41903a + ", promptTtsVoices=" + this.f41904b + ", customVoices=" + this.f41905c + ", loading=" + this.f41906d + ", errorMessage=" + this.f41908f + ", typeWhileDrivingWarning=" + this.f41907e + ")";
    }
}
