package com.waze.asks;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Space;
import com.waze.R;
import com.waze.car_lib.r.bl;
import com.waze.design_components.cta_bar.CallToActionBar;
import com.waze.reports.dr;
import com.waze.settings.bs;
import com.waze.settings.ds;
import com.waze.settings.he;
import com.waze.settings.hg;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ad implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f15489a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f15490b;

    public /* synthetic */ ad(Object obj, int i2) {
        this.f15490b = i2;
        this.f15489a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.waze.car_lib.r.b.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19, types: [com.waze.car_lib.r.b.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v28, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v36, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v46, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        byte[] bArr = null;
        switch (this.f15490b) {
            case 0:
                return ah.e((ah) this.f15489a);
            case 1:
                hg hgVarE = ((bs) ((ds) this.f15489a).A().d()).e();
                return hgVarE instanceof he ? ((he) hgVarE).h() : "";
            case 2:
                return this.f15489a.c(R.string.HNC_IN_CAR_HOY_NO_CIRCULA_DESCRIPTION_SUBTITLE, new Object[0]);
            case 3:
                return this.f15489a.c();
            case 4:
                return this.f15489a.c(R.string.HNC_IN_CAR_PERMIT_FULL_SCREEN_TITLE, new Object[0]);
            case 5:
                ?? r5 = this.f15489a;
                r5.f();
                r5.e();
                r5.i();
                return h.ab.f48028a;
            case 6:
                return a.a.k(this.f15489a);
            case 7:
                kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) ((h.g.b.aq) this.f15489a).f48105a;
                if (afVar != null) {
                    kotlinx.coroutines.aj.h(afVar, null);
                }
                return h.ab.f48028a;
            case 8:
                return a.a.k(this.f15489a);
            case 9:
                bl.g((bl) this.f15489a);
                return h.ab.f48028a;
            case 10:
                ((dr) this.f15489a).D();
                return h.ab.f48028a;
            case 11:
                ?? r52 = this.f15489a;
                int i2 = com.waze.closure.d.e.f22495a;
                return a.a.k(r52);
            case 12:
                ((com.waze.o.d.b.b.h) this.f15489a).c(com.waze.ui.f.s.f42311a);
                return h.ab.f48028a;
            case 13:
                ((com.waze.o.d.b.b.h) this.f15489a).c(com.waze.ui.f.t.f42312a);
                return h.ab.f48028a;
            case 14:
                Object obj = this.f15489a;
                bn bnVarB = ck.b(new com.waze.config.n(((com.waze.config.f) obj).b(), false));
                com.waze.config.h.f22637a.a().e(new com.waze.car_lib.ar(bnVarB, obj, 10, bArr));
                return bnVarB;
            case 15:
                Object obj2 = this.f15489a;
                bn bnVarB2 = ck.b(((com.waze.config.f) obj2).b());
                com.waze.config.h.f22637a.a().e(new com.waze.car_lib.ar(bnVarB2, obj2, 9, bArr));
                return bnVarB2;
            case 16:
                return a.a.k(this.f15489a);
            case 17:
                return new com.waze.sharedui.d.b(((android.support.v4.app.ar) this.f15489a).requireContext(), null);
            case 18:
                Bundle arguments = ((android.support.v4.app.ar) this.f15489a).getArguments();
                if (arguments != null) {
                    return (com.waze.copilot.a.k) arguments.getParcelable("Screen To Open");
                }
                return null;
            case 19:
                return a.a.D((com.waze.app_nav.hub.b.e) this.f15489a);
            default:
                CallToActionBar callToActionBar = (CallToActionBar) this.f15489a;
                Space space = new Space(callToActionBar.getContext());
                space.setLayoutParams(new LinearLayout.LayoutParams(callToActionBar.getContext().getResources().getDimensionPixelSize(R.dimen.call_to_action_bar_horizontal_divider_margin), callToActionBar.getContext().getResources().getDimensionPixelSize(R.dimen.call_to_action_bar_vertical_divider_margin)));
                return space;
        }
    }
}
