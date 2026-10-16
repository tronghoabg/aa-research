package com.waze.reports_v2.presentation;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.airbnb.lottie.LottieAnimationView;
import com.waze.R;
import com.waze.navigate.gn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aq {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f34817a;

    /* renamed from: b, reason: collision with root package name */
    private final LottieAnimationView f34818b;

    /* renamed from: c, reason: collision with root package name */
    private final LottieAnimationView f34819c;

    /* renamed from: d, reason: collision with root package name */
    private final LottieAnimationView f34820d;

    /* renamed from: e, reason: collision with root package name */
    private final ImageView f34821e;

    /* renamed from: f, reason: collision with root package name */
    private final LottieAnimationView f34822f;

    /* renamed from: g, reason: collision with root package name */
    private final LottieAnimationView f34823g;

    /* renamed from: h, reason: collision with root package name */
    private final TextView f34824h;

    /* renamed from: i, reason: collision with root package name */
    private final ConversationalReportingFteTooltipCompat f34825i;

    /* renamed from: j, reason: collision with root package name */
    private final h.g.a.l f34826j;

    public aq(Context context, ImageView imageView, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, LottieAnimationView lottieAnimationView3, ImageView imageView2, LottieAnimationView lottieAnimationView4, LottieAnimationView lottieAnimationView5, TextView textView, ConversationalReportingFteTooltipCompat conversationalReportingFteTooltipCompat, h.g.a.l lVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(imageView, "reportButton");
        h.g.b.x.f(lottieAnimationView, "reportButtonLottie");
        h.g.b.x.f(lottieAnimationView2, "reportButtonConversationalTintedLottie");
        h.g.b.x.f(lottieAnimationView3, "reportButtonBlueDotLottie");
        h.g.b.x.f(imageView2, "animationButton");
        h.g.b.x.f(lottieAnimationView4, "animationButtonLottie");
        h.g.b.x.f(lottieAnimationView5, "animationButtonConversationalLottie");
        h.g.b.x.f(textView, "animationText");
        h.g.b.x.f(conversationalReportingFteTooltipCompat, "fteTooltipCompat");
        h.g.b.x.f(lVar, "playCollapseAnimation");
        this.f34817a = imageView;
        this.f34818b = lottieAnimationView;
        this.f34819c = lottieAnimationView2;
        this.f34820d = lottieAnimationView3;
        this.f34821e = imageView2;
        this.f34822f = lottieAnimationView4;
        this.f34823g = lottieAnimationView5;
        this.f34824h = textView;
        this.f34825i = conversationalReportingFteTooltipCompat;
        this.f34826j = lVar;
    }

    static final h.ab a(aq aqVar, Runnable runnable, h.g.a.a aVar) {
        h.g.b.x.f(aVar, "block");
        aVar.invoke();
        aqVar.f34826j.invoke(runnable);
        return h.ab.f48028a;
    }

    static final h.ab b(aq aqVar) {
        ImageView imageView = aqVar.f34817a;
        imageView.setImageResource(R.drawable.report_button_icon);
        g(imageView);
        i(aqVar.f34818b);
        i(aqVar.f34819c);
        aqVar.c();
        return h.ab.f48028a;
    }

    private static final void g(View view) {
        view.animate().alpha(1.0f);
    }

    private static final void h(View view) {
        view.animate().cancel();
        view.setAlpha(1.0f);
    }

    private static final void i(View view) {
        view.animate().cancel();
        view.setAlpha(0.0f);
    }

    public final void c() {
        LottieAnimationView lottieAnimationView = this.f34820d;
        lottieAnimationView.g();
        lottieAnimationView.setVisibility(8);
    }

    public final void d(ba baVar, Runnable runnable) {
        h.g.b.x.f(baVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        LottieAnimationView lottieAnimationView = this.f34818b;
        lottieAnimationView.p(1);
        if (baVar instanceof az) {
            this.f34824h.setText(R.string.REPORT_BUTTON_EDUCATION_CTA);
            LottieAnimationView lottieAnimationView2 = this.f34822f;
            lottieAnimationView2.k(R.raw.tap_to_report_lottie);
            g(lottieAnimationView2);
            i(this.f34823g);
            i(this.f34821e);
            lottieAnimationView2.h();
            return;
        }
        if (baVar instanceof ay) {
            this.f34824h.setText(R.string.REPORT_BUTTON_EDUCATION_NEW_REPORT_TYPES_AVAILABLE);
            throw null;
        }
        if (baVar instanceof aw) {
            lottieAnimationView.k(R.raw.conversational_entry_point_hint_lottie);
            h(lottieAnimationView);
            i(this.f34819c);
            lottieAnimationView.h();
            return;
        }
        if (!(baVar instanceof ax)) {
            throw new h.i();
        }
        lottieAnimationView.k(R.raw.conversational_entry_point_hint_lottie);
        lottieAnimationView.e(new ar(new gn(runnable, 18)));
        h(lottieAnimationView);
        i(this.f34819c);
        lottieAnimationView.h();
    }

    public final void e(Runnable runnable) {
        h.g.b.x.f(runnable, "onCollapseFinished");
        int i2 = 1;
        new df(this, runnable, i2).invoke(new bq(this, i2));
        ConversationalReportingFteTooltipCompat conversationalReportingFteTooltipCompat = this.f34825i;
        conversationalReportingFteTooltipCompat.a();
        conversationalReportingFteTooltipCompat.setVisibility(8);
    }

    public final void f() {
        LottieAnimationView lottieAnimationView = this.f34820d;
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.h();
    }
}
