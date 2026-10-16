package c8;

import com.unity3d.services.UnityAdsConstants;

/* renamed from: c8.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1580d extends Fe.e {
    @Override // Fe.e
    public final void E(t tVar, float f10, float f11) {
        tVar.d(f11 * f10, 180.0f, 90.0f);
        double d3 = f11;
        double d5 = f10;
        tVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d3 * d5), (float) (Math.sin(Math.toRadians(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) * d3 * d5));
    }
}
