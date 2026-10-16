package com.waze.view.navbar;

import android.content.res.Resources;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.waze.R;
import com.waze.mg;
import j$.util.Objects;
import java.util.HashSet;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f45097a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f45098b;

    l(EventsOnRouteView eventsOnRouteView, int i2) {
        this.f45098b = i2;
        Objects.requireNonNull(eventsOnRouteView);
        this.f45097a = eventsOnRouteView;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        int i2 = this.f45098b;
        Object obj = this.f45097a;
        if (i2 != 0) {
            EventsOnRouteView eventsOnRouteView = (EventsOnRouteView) obj;
            if (eventsOnRouteView.f45050e.isEmpty()) {
                return;
            }
            ImageView imageView = (ImageView) eventsOnRouteView.f45050e.poll();
            imageView.setVisibility(0);
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(mg.a(), R.anim.pop_in_event_on_route);
            animationLoadAnimation.setFillAfter(true);
            imageView.startAnimation(animationLoadAnimation);
            eventsOnRouteView.postDelayed(eventsOnRouteView.f45051f, 100L);
            return;
        }
        p pVar = (p) obj;
        if (pVar.f45113h) {
            pVar.f45113h = false;
            pVar.f45109d.cancel();
            pVar.f45109d.removeAllListeners();
            HashSet hashSet = new HashSet();
            hashSet.add(p.x(pVar.f45106a.getStatusBarColor(), pVar.f45111f, pVar.f45106a));
            m mVarY = pVar.y();
            if (mVarY == null) {
                com.waze.shared_infra.i.h.j("Attempt to hide typing-while-driving-bar-view failed. Bar not attached to layout.");
                return;
            }
            float dimension = pVar.f45106a.getContext().getResources().getDimension(R.dimen.typing_while_driving_bar_height);
            pVar.A(0, mVarY.getTranslationY() + dimension);
            hashSet.add(p.C(-dimension, mVarY));
            hashSet.add(p.B(0.0f, mVarY));
            for (int i3 = 1; i3 < pVar.f45107b.getChildCount(); i3++) {
                hashSet.add(p.C(0.0f, pVar.f45107b.getChildAt(i3)));
            }
            pVar.f45109d.addListener(new k(this, mVarY));
            pVar.f45109d.playTogether(hashSet);
            pVar.f45109d.start();
        }
    }

    l(p pVar, int i2) {
        this.f45098b = i2;
        Objects.requireNonNull(pVar);
        this.f45097a = pVar;
    }
}
