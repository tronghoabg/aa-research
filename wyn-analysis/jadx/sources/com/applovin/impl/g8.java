package com.applovin.impl;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class g8 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21617a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f21618b;

    /* renamed from: c, reason: collision with root package name */
    private final View f21619c;

    public g8(View view, com.applovin.impl.sdk.k kVar) {
        this.f21617a = kVar;
        this.f21618b = kVar.O();
        this.f21619c = view;
    }

    public long a(h3 h3Var) {
        long j8;
        if (com.applovin.impl.sdk.o.a()) {
            this.f21618b.a("ViewabilityTracker", "Checking visibility...");
        }
        Point pointB = AbstractC1654o0.b(this.f21619c.getContext());
        if (this.f21619c.isShown()) {
            j8 = 0;
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21618b.b("ViewabilityTracker", "View is hidden");
            }
            j8 = 2;
        }
        if (this.f21619c.getAlpha() < h3Var.c0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21618b.b("ViewabilityTracker", "View is transparent");
            }
            j8 |= 4;
        }
        Animation animation = this.f21619c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21618b.b("ViewabilityTracker", "View is animating");
            }
            j8 |= 8;
        }
        if (this.f21619c.getParent() == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21618b.b("ViewabilityTracker", "No parent view found");
            }
            j8 |= 16;
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f21619c.getContext(), this.f21619c.getWidth());
        if (iPxToDp < Math.min(h3Var.i0(), pointB.x)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21618b.b("ViewabilityTracker", "View has width (" + iPxToDp + ") below threshold");
            }
            j8 |= 32;
        }
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f21619c.getContext(), this.f21619c.getHeight());
        if (iPxToDp2 < h3Var.e0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21618b.b("ViewabilityTracker", "View has height (" + iPxToDp2 + ") below threshold");
            }
            j8 |= 64;
        }
        Rect rect = new Rect(0, 0, pointB.x, pointB.y);
        int[] iArr = {-1, -1};
        this.f21619c.getLocationOnScreen(iArr);
        int i5 = iArr[0];
        Rect rect2 = new Rect(i5, iArr[1], this.f21619c.getWidth() + i5, this.f21619c.getHeight() + iArr[1]);
        if (!Rect.intersects(rect, rect2)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21618b.b("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j8 |= 128;
        }
        Activity activityB = this.f21617a.e().b();
        if (activityB != null && !f8.a(this.f21619c, activityB)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21618b.b("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j8 |= 256;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21618b.a("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j8));
        }
        return j8;
    }
}
