package com.waze.sharedrive.c.a;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final String f38069a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38070b;

    /* renamed from: c, reason: collision with root package name */
    private final e f38071c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f38072d;

    /* renamed from: e, reason: collision with root package name */
    private final q f38073e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f38074f;

    public l(String str, String str2, e eVar, com.waze.shared_infra.h.c cVar, q qVar, boolean z) {
        x.f(str, TtmlNode.ATTR_ID);
        x.f(qVar, "role");
        this.f38069a = str;
        this.f38070b = str2;
        this.f38071c = eVar;
        this.f38072d = cVar;
        this.f38073e = qVar;
        this.f38074f = z;
    }

    public static /* synthetic */ l g(l lVar, com.waze.shared_infra.h.c cVar, q qVar, int i2) {
        String str = (i2 & 1) != 0 ? lVar.f38069a : null;
        String str2 = (i2 & 2) != 0 ? lVar.f38070b : null;
        e eVar = (i2 & 4) != 0 ? lVar.f38071c : null;
        if ((i2 & 8) != 0) {
            cVar = lVar.f38072d;
        }
        boolean z = lVar.f38074f;
        x.f(str, TtmlNode.ATTR_ID);
        x.f(qVar, "role");
        return new l(str, str2, eVar, cVar, qVar, z);
    }

    public final com.waze.shared_infra.h.c a() {
        return this.f38072d;
    }

    public final e b() {
        return this.f38071c;
    }

    public final q c() {
        return this.f38073e;
    }

    public final String d() {
        return this.f38069a;
    }

    public final String e() {
        return this.f38070b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return x.n(this.f38069a, lVar.f38069a) && x.n(this.f38070b, lVar.f38070b) && x.n(this.f38071c, lVar.f38071c) && x.n(this.f38072d, lVar.f38072d) && x.n(this.f38073e, lVar.f38073e) && this.f38074f == lVar.f38074f;
    }

    public final boolean f() {
        return this.f38074f;
    }

    public final int hashCode() {
        int iHashCode = this.f38069a.hashCode() * 31;
        String str = this.f38070b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        e eVar = this.f38071c;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        com.waze.shared_infra.h.c cVar = this.f38072d;
        return ((((iHashCode3 + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.f38073e.hashCode()) * 31) + a.a.a(this.f38074f);
    }

    public final String toString() {
        return "Participant(id=" + this.f38069a + ", name=" + this.f38070b + ", avatar=" + this.f38071c + ", location=" + this.f38072d + ", role=" + this.f38073e + ", isCurrentUser=" + this.f38074f + ")";
    }
}
