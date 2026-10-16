package com.vungle.ads.internal;

import com.vungle.ads.VungleError;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class j0 extends com.vungle.ads.internal.presenter.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f33026b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.vungle.ads.internal.presenter.b bVar, k0 k0Var) {
        super(bVar);
        this.f33026b = k0Var;
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdEnd(String str) {
        this.f33026b.a(h.f33013f);
        this.f33507a.onAdEnd(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdImpression(String str) {
        this.f33026b.a(h.f33012e);
        this.f33507a.onAdImpression(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdStart(String str) {
        this.f33026b.a(h.f33011d);
        this.f33507a.onAdStart(str);
    }

    @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
    public final void onFailure(VungleError error) {
        AbstractC3340k.e(error, "error");
        this.f33026b.a(h.f33014g);
        super.onFailure(error);
    }
}
