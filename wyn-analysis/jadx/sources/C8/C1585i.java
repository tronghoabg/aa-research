package c8;

import com.unity3d.services.UnityAdsConstants;

/* renamed from: c8.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1585i extends Fe.e {
    @Override // Fe.e
    public final void E(t tVar, float f10, float f11) {
        tVar.d(f11 * f10, 180.0f, 90.0f);
        float f12 = f11 * 2.0f * f10;
        p pVar = new p(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f12, f12);
        pVar.f19785f = 180.0f;
        pVar.f19786g = 90.0f;
        tVar.f19797f.add(pVar);
        C1590n c1590n = new C1590n(pVar);
        tVar.a(180.0f);
        tVar.f19798g.add(c1590n);
        tVar.f19795d = 270.0f;
        float f13 = (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT + f12) * 0.5f;
        float f14 = (f12 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / 2.0f;
        double d3 = 270.0f;
        tVar.f19793b = (((float) Math.cos(Math.toRadians(d3))) * f14) + f13;
        tVar.f19794c = (f14 * ((float) Math.sin(Math.toRadians(d3)))) + f13;
    }
}
