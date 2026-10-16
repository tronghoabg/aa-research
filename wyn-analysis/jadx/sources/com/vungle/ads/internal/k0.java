package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.internal.model.i3;
import ef.C2527k;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class k0 extends s {

    /* renamed from: q, reason: collision with root package name */
    public final VungleAdSize f33029q;

    /* renamed from: r, reason: collision with root package name */
    public VungleAdSize f33030r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Context context, VungleAdSize adSize) {
        super(context);
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(adSize, "adSize");
        this.f33029q = adSize;
    }

    public final j0 a(com.vungle.ads.internal.presenter.b adPlayCallback) {
        AbstractC3340k.e(adPlayCallback, "adPlayCallback");
        return new j0(adPlayCallback, this);
    }

    @Override // com.vungle.ads.internal.s
    public final VungleAdSize b() {
        return this.f33029q;
    }

    public final VungleAdSize m() {
        return this.f33030r;
    }

    @Override // com.vungle.ads.internal.s
    public final boolean a(i3 placement) {
        AbstractC3340k.e(placement, "placement");
        return placement.e() || placement.h() || placement.f();
    }

    @Override // com.vungle.ads.internal.s
    public final boolean a(VungleAdSize vungleAdSize) {
        if (vungleAdSize != null) {
            return vungleAdSize.isValidSize$vungle_ads_release();
        }
        return false;
    }

    @Override // com.vungle.ads.internal.s
    public final void a(com.vungle.ads.internal.model.h0 advertisement) {
        AbstractC3340k.e(advertisement, "advertisement");
        super.a(advertisement);
        com.vungle.ads.internal.util.s sVarE = e();
        Long lA = sVarE != null ? sVarE.a() : null;
        if ((lA != null && lA.longValue() == 3) || (lA != null && lA.longValue() == 4)) {
            l();
        }
        if (this.f33029q.getIsAdaptiveWidth() || this.f33029q.getIsAdaptiveHeight()) {
            C2527k c2527kA = com.vungle.ads.internal.util.a0.a(d());
            int iIntValue = ((Number) c2527kA.f34671a).intValue();
            int iIntValue2 = ((Number) c2527kA.f34672b).intValue();
            int iD = this.f33029q.getIsAdaptiveWidth() ? advertisement.d() : this.f33029q.getWidth();
            int iA = this.f33029q.getIsAdaptiveHeight() ? advertisement.a() : this.f33029q.getHeight();
            int iMin = Math.min(iIntValue, iD);
            int iMin2 = Math.min(iIntValue2, iA);
            if (this.f33029q.getIsAdaptiveHeight() && this.f33029q.getHeight() > 0) {
                iMin2 = Math.min(this.f33029q.getHeight(), iMin2);
            }
            this.f33030r = new VungleAdSize(iMin, iMin2);
        }
    }
}
