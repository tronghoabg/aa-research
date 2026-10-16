package z0;

import com.applovin.shadow.okio.Segment;
import e0.C2441D;
import e0.C2465q;
import ef.C2539w;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final K0.g f48300a;

    /* renamed from: b, reason: collision with root package name */
    public final long f48301b;

    /* renamed from: c, reason: collision with root package name */
    public final E0.l f48302c;

    /* renamed from: d, reason: collision with root package name */
    public final E0.j f48303d;

    /* renamed from: e, reason: collision with root package name */
    public final E0.k f48304e;

    /* renamed from: f, reason: collision with root package name */
    public final E0.o f48305f;

    /* renamed from: g, reason: collision with root package name */
    public final String f48306g;

    /* renamed from: h, reason: collision with root package name */
    public final long f48307h;

    /* renamed from: i, reason: collision with root package name */
    public final K0.a f48308i;

    /* renamed from: j, reason: collision with root package name */
    public final K0.h f48309j;
    public final G0.c k;

    /* renamed from: l, reason: collision with root package name */
    public final long f48310l;

    /* renamed from: m, reason: collision with root package name */
    public final K0.d f48311m;

    /* renamed from: n, reason: collision with root package name */
    public final C2441D f48312n;

    public j(K0.g gVar, long j8, E0.l lVar, E0.j jVar, E0.k kVar, E0.o oVar, String str, long j10, K0.a aVar, K0.h hVar, G0.c cVar, long j11, K0.d dVar, C2441D c2441d) {
        this.f48300a = gVar;
        this.f48301b = j8;
        this.f48302c = lVar;
        this.f48303d = jVar;
        this.f48304e = kVar;
        this.f48305f = oVar;
        this.f48306g = str;
        this.f48307h = j10;
        this.f48308i = aVar;
        this.f48309j = hVar;
        this.k = cVar;
        this.f48310l = j11;
        this.f48311m = dVar;
        this.f48312n = c2441d;
    }

    public final boolean a(j other) {
        AbstractC3340k.e(other, "other");
        if (this == other) {
            return true;
        }
        return L0.j.a(this.f48301b, other.f48301b) && AbstractC3340k.a(this.f48302c, other.f48302c) && AbstractC3340k.a(this.f48303d, other.f48303d) && AbstractC3340k.a(this.f48304e, other.f48304e) && AbstractC3340k.a(this.f48305f, other.f48305f) && AbstractC3340k.a(this.f48306g, other.f48306g) && L0.j.a(this.f48307h, other.f48307h) && AbstractC3340k.a(this.f48308i, other.f48308i) && AbstractC3340k.a(this.f48309j, other.f48309j) && AbstractC3340k.a(this.k, other.k) && C2465q.b(this.f48310l, other.f48310l);
    }

    public final j b(j jVar) {
        if (jVar == null) {
            return this;
        }
        K0.g gVarC = this.f48300a.c(jVar.f48300a);
        E0.o oVar = jVar.f48305f;
        if (oVar == null) {
            oVar = this.f48305f;
        }
        E0.o oVar2 = oVar;
        long j8 = jVar.f48301b;
        if (Fe.b.H(j8)) {
            j8 = this.f48301b;
        }
        long j10 = j8;
        E0.l lVar = jVar.f48302c;
        if (lVar == null) {
            lVar = this.f48302c;
        }
        E0.l lVar2 = lVar;
        E0.j jVar2 = jVar.f48303d;
        if (jVar2 == null) {
            jVar2 = this.f48303d;
        }
        E0.j jVar3 = jVar2;
        E0.k kVar = jVar.f48304e;
        if (kVar == null) {
            kVar = this.f48304e;
        }
        E0.k kVar2 = kVar;
        String str = jVar.f48306g;
        if (str == null) {
            str = this.f48306g;
        }
        String str2 = str;
        long j11 = jVar.f48307h;
        if (Fe.b.H(j11)) {
            j11 = this.f48307h;
        }
        long j12 = j11;
        K0.a aVar = jVar.f48308i;
        if (aVar == null) {
            aVar = this.f48308i;
        }
        K0.a aVar2 = aVar;
        K0.h hVar = jVar.f48309j;
        if (hVar == null) {
            hVar = this.f48309j;
        }
        K0.h hVar2 = hVar;
        G0.c cVar = jVar.k;
        if (cVar == null) {
            cVar = this.k;
        }
        G0.c cVar2 = cVar;
        long j13 = C2465q.f34380i;
        long j14 = jVar.f48310l;
        if (j14 == j13) {
            j14 = this.f48310l;
        }
        long j15 = j14;
        K0.d dVar = jVar.f48311m;
        if (dVar == null) {
            dVar = this.f48311m;
        }
        K0.d dVar2 = dVar;
        C2441D c2441d = jVar.f48312n;
        if (c2441d == null) {
            c2441d = this.f48312n;
        }
        return new j(gVarC, j10, lVar2, jVar3, kVar2, oVar2, str2, j12, aVar2, hVar2, cVar2, j15, dVar2, c2441d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (a(jVar)) {
            if (AbstractC3340k.a(this.f48300a, jVar.f48300a) && AbstractC3340k.a(this.f48311m, jVar.f48311m) && AbstractC3340k.a(this.f48312n, jVar.f48312n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jA = this.f48300a.a();
        int i5 = C2465q.f34381j;
        int iD = (L0.j.d(this.f48301b) + (C2539w.a(jA) * 961)) * 31;
        E0.l lVar = this.f48302c;
        int i10 = (iD + (lVar != null ? lVar.f2802a : 0)) * 31;
        E0.j jVar = this.f48303d;
        int i11 = (i10 + (jVar != null ? jVar.f2794a : 0)) * 31;
        E0.k kVar = this.f48304e;
        int i12 = (i11 + (kVar != null ? kVar.f2795a : 0)) * 31;
        E0.o oVar = this.f48305f;
        int iHashCode = (i12 + (oVar != null ? oVar.hashCode() : 0)) * 31;
        String str = this.f48306g;
        int iD2 = (L0.j.d(this.f48307h) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        K0.a aVar = this.f48308i;
        int iFloatToIntBits = (iD2 + (aVar != null ? Float.floatToIntBits(aVar.f6312a) : 0)) * 31;
        K0.h hVar = this.f48309j;
        int iHashCode2 = (iFloatToIntBits + (hVar != null ? hVar.hashCode() : 0)) * 31;
        G0.c cVar = this.k;
        int iA = (C2539w.a(this.f48310l) + ((iHashCode2 + (cVar != null ? cVar.f4137a.hashCode() : 0)) * 31)) * 31;
        K0.d dVar = this.f48311m;
        int i13 = (iA + (dVar != null ? dVar.f6316a : 0)) * 31;
        C2441D c2441d = this.f48312n;
        return (i13 + (c2441d != null ? c2441d.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "SpanStyle(color=" + ((Object) C2465q.h(this.f48300a.a())) + ", brush=null, fontSize=" + ((Object) L0.j.e(this.f48301b)) + ", fontWeight=" + this.f48302c + ", fontStyle=" + this.f48303d + ", fontSynthesis=" + this.f48304e + ", fontFamily=" + this.f48305f + ", fontFeatureSettings=" + this.f48306g + ", letterSpacing=" + ((Object) L0.j.e(this.f48307h)) + ", baselineShift=" + this.f48308i + ", textGeometricTransform=" + this.f48309j + ", localeList=" + this.k + ", background=" + ((Object) C2465q.h(this.f48310l)) + ", textDecoration=" + this.f48311m + ", shadow=" + this.f48312n + ", platformStyle=null)";
    }

    public j(long j8, long j10, E0.l lVar, E0.j jVar, E0.k kVar, E0.o oVar, String str, long j11, K0.a aVar, K0.h hVar, G0.c cVar, long j12, K0.d dVar, C2441D c2441d, int i5) {
        C2441D c2441d2;
        K0.g bVar;
        long j13 = (i5 & 1) != 0 ? C2465q.f34380i : j8;
        long j14 = (i5 & 2) != 0 ? L0.j.f6810c : j10;
        E0.l lVar2 = (i5 & 4) != 0 ? null : lVar;
        E0.j jVar2 = (i5 & 8) != 0 ? null : jVar;
        E0.k kVar2 = (i5 & 16) != 0 ? null : kVar;
        E0.o oVar2 = (i5 & 32) != 0 ? null : oVar;
        String str2 = (i5 & 64) != 0 ? null : str;
        long j15 = (i5 & 128) != 0 ? L0.j.f6810c : j11;
        K0.a aVar2 = (i5 & 256) != 0 ? null : aVar;
        K0.h hVar2 = (i5 & 512) != 0 ? null : hVar;
        G0.c cVar2 = (i5 & Segment.SHARE_MINIMUM) != 0 ? null : cVar;
        long j16 = (i5 & 2048) != 0 ? C2465q.f34380i : j12;
        K0.d dVar2 = (i5 & 4096) != 0 ? null : dVar;
        C2441D c2441d3 = (i5 & Segment.SIZE) != 0 ? null : c2441d;
        if (j13 != C2465q.f34380i) {
            c2441d2 = c2441d3;
            bVar = new K0.b(j13);
        } else {
            c2441d2 = c2441d3;
            bVar = K0.f.f6318a;
        }
        this(bVar, j14, lVar2, jVar2, kVar2, oVar2, str2, j15, aVar2, hVar2, cVar2, j16, dVar2, c2441d2);
    }
}
