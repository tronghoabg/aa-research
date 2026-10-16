package com.waze.reports_v2.presentation.a;

import com.airbnb.lottie.LottieAnimationView;
import com.waze.R;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final m f34729a;

    /* renamed from: b, reason: collision with root package name */
    private LottieAnimationView f34730b;

    public k(m mVar) {
        h.g.b.x.f(mVar, "reportFeedbackPointsStateHolder");
        this.f34729a = mVar;
    }

    public final Object b(h.c.e eVar) {
        LottieAnimationView lottieAnimationView = this.f34730b;
        if (lottieAnimationView != null) {
            CompletableDeferred completableDeferredJ = bo.j();
            j jVar = new j(completableDeferredJ, this, lottieAnimationView);
            lottieAnimationView.f(jVar);
            lottieAnimationView.e(jVar);
            lottieAnimationView.h();
            Object objC = completableDeferredJ.c(eVar);
            if (objC == h.c.a.a.f48038a) {
                return objC;
            }
        }
        return h.ab.f48028a;
    }

    public final void c(final LottieAnimationView lottieAnimationView) {
        h.g.b.x.f(lottieAnimationView, "reportPointsLottieAnimationView");
        final com.bumptech.glide.load.a.b.o oVar = new com.bumptech.glide.load.a.b.o(lottieAnimationView);
        final i iVar = new i(lottieAnimationView);
        oVar.c("+" + this.f34729a.a().a());
        com.airbnb.lottie.m.h(lottieAnimationView.getContext(), R.raw.lottie_anim_points_with_text).e(new com.airbnb.lottie.u() { // from class: com.waze.reports_v2.presentation.a.h
            @Override // com.airbnb.lottie.u
            public final void a(Object obj) {
                com.airbnb.lottie.h hVar = (com.airbnb.lottie.h) obj;
                h.g.b.x.f(hVar, "result");
                LottieAnimationView lottieAnimationView2 = lottieAnimationView;
                lottieAnimationView2.s(iVar);
                lottieAnimationView2.r(oVar);
                lottieAnimationView2.setScaleX(1.5f);
                lottieAnimationView2.setScaleY(1.5f);
                lottieAnimationView2.m(hVar);
            }
        });
        this.f34730b = lottieAnimationView;
    }
}
