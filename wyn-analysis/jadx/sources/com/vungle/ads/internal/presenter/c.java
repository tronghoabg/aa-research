package com.vungle.ads.internal.presenter;

import com.vungle.ads.VungleError;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final b f33507a;

    public c(b adPlayCallback) {
        AbstractC3340k.e(adPlayCallback, "adPlayCallback");
        this.f33507a = adPlayCallback;
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdClick(String str) {
        this.f33507a.onAdClick(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdLeftApplication(String str) {
        this.f33507a.onAdLeftApplication(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdRewarded(String str) {
        this.f33507a.onAdRewarded(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public void onFailure(VungleError error) {
        AbstractC3340k.e(error, "error");
        this.f33507a.onFailure(error);
    }
}
