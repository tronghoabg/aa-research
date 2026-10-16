package H;

import Fe.g;
import L0.i;
import a.AbstractC1304a;
import com.unity3d.services.UnityAdsConstants;
import d0.C2384c;
import d0.f;
import e0.InterfaceC2442E;
import e0.v;
import e0.w;
import e0.z;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class d implements InterfaceC2442E {

    /* renamed from: a, reason: collision with root package name */
    public final a f4844a;

    /* renamed from: b, reason: collision with root package name */
    public final a f4845b;

    /* renamed from: c, reason: collision with root package name */
    public final a f4846c;

    /* renamed from: d, reason: collision with root package name */
    public final a f4847d;

    public d(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f4844a = aVar;
        this.f4845b = aVar2;
        this.f4846c = aVar3;
        this.f4847d = aVar4;
    }

    @Override // e0.InterfaceC2442E
    public final z b(long j8, i layoutDirection, L0.b density) {
        AbstractC3340k.e(layoutDirection, "layoutDirection");
        AbstractC3340k.e(density, "density");
        float fA = this.f4844a.a(j8, density);
        float fA2 = this.f4845b.a(j8, density);
        float fA3 = this.f4846c.a(j8, density);
        float fA4 = this.f4847d.a(j8, density);
        float fC = f.c(j8);
        float f10 = fA + fA4;
        if (f10 > fC) {
            float f11 = fC / f10;
            fA *= f11;
            fA4 *= f11;
        }
        float f12 = fA2 + fA3;
        if (f12 > fC) {
            float f13 = fC / f12;
            fA2 *= f13;
            fA3 *= f13;
        }
        if (fA < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fA2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fA3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fA4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!").toString());
        }
        if (fA + fA2 + fA3 + fA4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return new v(AbstractC1304a.f(C2384c.f33931b, j8));
        }
        d0.d dVarF = AbstractC1304a.f(C2384c.f33931b, j8);
        i iVar = i.f6806a;
        float f14 = layoutDirection == iVar ? fA : fA2;
        long jA = g.a(f14, f14);
        if (layoutDirection == iVar) {
            fA = fA2;
        }
        long jA2 = g.a(fA, fA);
        float f15 = layoutDirection == iVar ? fA3 : fA4;
        long jA3 = g.a(f15, f15);
        if (layoutDirection != iVar) {
            fA4 = fA3;
        }
        return new w(new d0.e(dVarF.f33937a, dVarF.f33938b, dVarF.f33939c, dVarF.f33940d, jA, jA2, jA3, g.a(fA4, fA4)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!AbstractC3340k.a(this.f4844a, dVar.f4844a)) {
            return false;
        }
        if (!AbstractC3340k.a(this.f4845b, dVar.f4845b)) {
            return false;
        }
        if (AbstractC3340k.a(this.f4846c, dVar.f4846c)) {
            return AbstractC3340k.a(this.f4847d, dVar.f4847d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4847d.hashCode() + ((this.f4846c.hashCode() + ((this.f4845b.hashCode() + (this.f4844a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f4844a + ", topEnd = " + this.f4845b + ", bottomEnd = " + this.f4846c + ", bottomStart = " + this.f4847d + ')';
    }
}
