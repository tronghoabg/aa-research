package z0;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final K0.c f48294a;

    /* renamed from: b, reason: collision with root package name */
    public final K0.e f48295b;

    /* renamed from: c, reason: collision with root package name */
    public final long f48296c;

    /* renamed from: d, reason: collision with root package name */
    public final K0.i f48297d;

    public h(K0.c cVar, K0.e eVar, long j8, K0.i iVar, S3.f fVar) {
        this.f48294a = cVar;
        this.f48295b = eVar;
        this.f48296c = j8;
        this.f48297d = iVar;
        if (L0.j.a(j8, L0.j.f6810c) || L0.j.c(j8) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + L0.j.c(j8) + ')').toString());
    }

    public final h a(h hVar) {
        if (hVar == null) {
            return this;
        }
        long j8 = hVar.f48296c;
        if (Fe.b.H(j8)) {
            j8 = this.f48296c;
        }
        long j10 = j8;
        K0.i iVar = hVar.f48297d;
        if (iVar == null) {
            iVar = this.f48297d;
        }
        K0.i iVar2 = iVar;
        K0.c cVar = hVar.f48294a;
        if (cVar == null) {
            cVar = this.f48294a;
        }
        K0.c cVar2 = cVar;
        K0.e eVar = hVar.f48295b;
        if (eVar == null) {
            eVar = this.f48295b;
        }
        return new h(cVar2, eVar, j10, iVar2, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return AbstractC3340k.a(this.f48294a, hVar.f48294a) && AbstractC3340k.a(this.f48295b, hVar.f48295b) && L0.j.a(this.f48296c, hVar.f48296c) && AbstractC3340k.a(this.f48297d, hVar.f48297d) && AbstractC3340k.a(null, null);
    }

    public final int hashCode() {
        K0.c cVar = this.f48294a;
        int i5 = (cVar != null ? cVar.f6314a : 0) * 31;
        K0.e eVar = this.f48295b;
        int iD = (L0.j.d(this.f48296c) + ((i5 + (eVar != null ? eVar.f6317a : 0)) * 31)) * 31;
        K0.i iVar = this.f48297d;
        return ((iD + (iVar != null ? iVar.hashCode() : 0)) * 961) + 0;
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + this.f48294a + ", textDirection=" + this.f48295b + ", lineHeight=" + ((Object) L0.j.e(this.f48296c)) + ", textIndent=" + this.f48297d + ", platformStyle=null, lineHeightStyle=" + ((Object) null) + ')';
    }
}
