package com.waze.main_screen.g;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.google.android.libraries.phenotype.client.stable.x;
import com.google.android.material.textfield.ao;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.ig;
import com.waze.navigate.eo;
import com.waze.reports_v2.b.ab;
import com.waze.sharedui.views.OvalButton;
import com.waze.strings.DisplayStrings;
import com.waze.ui.z.as;
import com.waze.view.bottom.BottomNotificationIcon;
import com.waze.web.r;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d extends OvalButton {

    /* renamed from: a, reason: collision with root package name */
    private final List f26375a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f26376b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f26377c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f26378d;

    /* renamed from: e, reason: collision with root package name */
    private final BottomNotificationIcon f26379e;

    /* renamed from: f, reason: collision with root package name */
    private final eo f26380f;

    /* renamed from: g, reason: collision with root package name */
    private com.waze.main_screen.i.a.c f26381g;

    public d(Context context) {
        super(context, null, 0);
        this.f26380f = (eo) r.h(eo.class);
        setMinimumHeight(com.waze.shared_infra.i.h.r(44));
        setPadding(com.waze.shared_infra.i.h.r(12), com.waze.shared_infra.i.h.r(12), com.waze.shared_infra.i.h.r(12), com.waze.shared_infra.i.h.r(12));
        LayoutInflater.from(getContext()).inflate(R.layout.eta_main_bar_notification, this);
        this.f26375a = new ArrayList();
        this.f26379e = (BottomNotificationIcon) findViewById(R.id.messageIcon);
        this.f26377c = (TextView) findViewById(R.id.lblMessageTitle);
        this.f26378d = (TextView) findViewById(R.id.lblMessageSubTitle);
        bz(-1040187392);
        v(-16777216);
        w(com.waze.shared_infra.i.h.r(4));
        setClipChildren(false);
        setClipToPadding(false);
    }

    public static /* synthetic */ void a(d dVar) {
        if (dVar.getVisibility() != 8) {
            dVar.f26379e.startCloseAnimation(0, DisplayStrings.DS_NIGHT, null);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.setInterpolator(new AnticipateInterpolator());
            animationSet.setDuration(400L);
            animationSet.setStartOffset(50L);
            animationSet.setFillAfter(false);
            animationSet.setFillBefore(true);
            animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, 0.0f, as.f(32)));
            animationSet.addAnimation(new ScaleAnimation(1.0f, 0.4f, 1.0f, 0.4f, 1, 0.5f, 1, 0.5f));
            animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
            animationSet.setAnimationListener(new c(dVar));
            dVar.postDelayed(new ao(dVar, 20), 400L);
            dVar.startAnimation(animationSet);
        }
        dVar.postDelayed(new ig(dVar, 7), 1000L);
    }

    public static /* synthetic */ void c(d dVar) {
        dVar.f26376b = false;
        List list = dVar.f26375a;
        if (list.size() > 0) {
            ((Runnable) list.remove(0)).run();
        }
    }

    public static /* synthetic */ void d(d dVar) {
        com.waze.main_screen.i.a.c cVar = dVar.f26381g;
        if (cVar != null) {
            cVar.a();
        }
    }

    public static /* synthetic */ void j(d dVar, j jVar) {
        String strC = jVar.c();
        String strD = jVar.d();
        i iVarB = jVar.b();
        if (iVarB == i.f26397b || iVarB == i.f26398c) {
            com.waze.perf.c.a(com.waze.perf.b.m);
        }
        dVar.setAlpha(0.0f);
        com.waze.view.anim.g.e(dVar, 200L).alpha(1.0f).setListener(null).setStartDelay(0L);
        TextView textView = dVar.f26377c;
        textView.setVisibility(true != TextUtils.isEmpty(strC) ? 0 : 8);
        textView.setText(strC);
        TextView textView2 = dVar.f26378d;
        textView2.setVisibility(true != TextUtils.isEmpty(strD) ? 0 : 8);
        textView2.setText(strD);
        int iOrdinal = iVarB.ordinal();
        int i2 = 2;
        if (iOrdinal == 1) {
            dVar.f26379e.setImageResources(-10758913, R.drawable.bottom_message_wazers_online_front);
        } else if (iOrdinal == 2) {
            dVar.f26379e.setImageResources(-20116, R.drawable.bottom_message_reports_front);
        } else if (iOrdinal == 3) {
            dVar.f26379e.setImageResourcesAndPoints(dVar.getContext(), -15998582, 0);
        } else {
            if (iOrdinal != 4) {
                dVar.f26379e.setVisibility(8);
                return;
            }
            dVar.f26379e.setImageResources(-14780418, R.drawable.bottom_message_wazers_online_front);
        }
        BottomNotificationIcon bottomNotificationIcon = dVar.f26379e;
        bottomNotificationIcon.setVisibility(0);
        bottomNotificationIcon.startOpenAnimation(100, 1000, null);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new OvershootInterpolator());
        animationSet.setDuration(400L);
        animationSet.setFillAfter(false);
        animationSet.setFillBefore(true);
        animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, as.f(32), 0.0f));
        animationSet.addAnimation(new ScaleAnimation(0.4f, 1.0f, 0.4f, 1.0f, 1, 0.5f, 1, 0.5f));
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        dVar.startAnimation(animationSet);
        if (iVarB == i.f26399d && TextUtils.equals(ConfigValues.CONFIG_VALUE_NAVIGATION_GUIDANCE_MODE.b(), "yes")) {
            com.waze.sharedui.e.e.g().c(com.waze.resources.h.e(dVar.getContext(), "points_animation"), null, false, false, new com.waze.main_screen.c.g.a(i2));
            com.waze.reports_v2.d.j.f34595a.a().x(ab.f34010b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void e(j jVar) {
        if (jVar instanceof j) {
            x xVar = new x(this, jVar, 20);
            com.google.firebase.appcheck.debug.a.a aVar = new com.google.firebase.appcheck.debug.a.a(this, jVar, 1, null);
            int iA = jVar.a();
            if (this.f26380f.T()) {
                this.f26375a.clear();
            } else {
                if (this.f26376b) {
                    this.f26375a.add(xVar);
                    return;
                }
                this.f26376b = true;
                aVar.run();
                postDelayed(new ig(this, 6), iA <= 0 ? 8000 : iA * 1000);
            }
        }
    }

    public final void i(com.waze.main_screen.i.a.c cVar) {
        this.f26381g = cVar;
    }
}
