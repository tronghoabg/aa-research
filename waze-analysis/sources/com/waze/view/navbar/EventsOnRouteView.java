package com.waze.view.navbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.waze.R;
import com.waze.main.navigate.EventOnRoute;
import com.waze.navigate.DriveToNativeManager;
import com.waze.web.r;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class EventsOnRouteView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private RelativeLayout f45046a;

    /* renamed from: b, reason: collision with root package name */
    private FrameLayout f45047b;

    /* renamed from: c, reason: collision with root package name */
    private int f45048c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f45049d;

    /* renamed from: e, reason: collision with root package name */
    private Queue f45050e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f45051f;

    public EventsOnRouteView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f45050e = new LinkedBlockingQueue();
        this.f45051f = new l(this, 1);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.events_on_route_view, (ViewGroup) null);
        this.f45046a = (RelativeLayout) viewInflate.findViewById(R.id.trafficEventsContainer);
        this.f45047b = (FrameLayout) viewInflate.findViewById(R.id.otherEventsContainer);
        addView(viewInflate);
    }

    public final void c() {
        this.f45049d = false;
        this.f45048c = 0;
        this.f45046a.removeAllViews();
        this.f45047b.removeAllViews();
    }

    public final void d() {
        int currentAlternativeRouteId = ((DriveToNativeManager) r.h(DriveToNativeManager.class)).getCurrentAlternativeRouteId();
        if (this.f45049d && this.f45048c == currentAlternativeRouteId) {
            return;
        }
        c();
        ((DriveToNativeManager) r.h(DriveToNativeManager.class)).getEventsOnRoute(new com.waze.uid.b(this, 4));
    }

    public final void e(EventOnRoute[] eventOnRouteArr) {
        int length;
        boolean z;
        int i2;
        if (eventOnRouteArr == null || (length = eventOnRouteArr.length) == 0 || this.f45049d) {
            return;
        }
        float measuredWidth = this.f45046a.getMeasuredWidth();
        boolean z2 = false;
        if (measuredWidth == 0.0f) {
            getViewTreeObserver().addOnGlobalLayoutListener(new b(this, eventOnRouteArr));
            return;
        }
        c();
        int i3 = 1;
        this.f45049d = true;
        this.f45048c = ((DriveToNativeManager) r.h(DriveToNativeManager.class)).getCurrentAlternativeRouteId();
        int i4 = 0;
        boolean z3 = false;
        while (i4 < length) {
            EventOnRoute eventOnRoute = eventOnRouteArr[i4];
            if (eventOnRoute == null || !((i2 = this.f45048c) == 0 || eventOnRoute.alertRouteId == i2)) {
                z = z2;
            } else {
                double d2 = measuredWidth;
                int i5 = eventOnRoute.alertType;
                if (i5 == 4) {
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (((eventOnRoute.end - eventOnRoute.start) * measuredWidth) / 100.0d), -1);
                    ImageView imageView = new ImageView(getContext());
                    layoutParams.setMargins((int) ((eventOnRoute.start / 100.0d) * d2), 0, 0, 0);
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    int i6 = eventOnRoute.severity;
                    if (i6 == 3) {
                        imageView.setImageResource(R.drawable.eta_traffic_4);
                    } else if (i6 == 2) {
                        imageView.setImageResource(R.drawable.eta_traffic_3);
                    } else if (i6 == 1) {
                        imageView.setImageResource(R.drawable.eta_traffic_2);
                    } else if (i6 == 0) {
                        imageView.setImageResource(R.drawable.eta_traffic_1);
                    }
                    imageView.setLayoutParams(layoutParams);
                    this.f45046a.addView(imageView);
                    AnimationSet animationSet = new AnimationSet(false);
                    z = false;
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 1.0f, 1.0f);
                    scaleAnimation.setDuration(500L);
                    animationSet.addAnimation(scaleAnimation);
                    imageView.startAnimation(animationSet);
                    z3 = true;
                } else {
                    z = z2;
                    int i7 = i5 == i3 ? R.drawable.traffic_bar_report_police : i5 == 2 ? R.drawable.traffic_bar_report_accident : i5 == 3 ? R.drawable.traffic_bar_report_trafficjam : (i5 != 5 && i5 == 12) ? R.drawable.traffic_bar_report_closure : R.drawable.traffic_bar_report_hazard;
                    ImageView imageView2 = new ImageView(getContext());
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                    imageView2.setImageResource(i7);
                    imageView2.setLayoutParams(layoutParams2);
                    imageView2.measure(0, 0);
                    layoutParams2.setMargins(((int) ((eventOnRoute.start / 100.0d) * d2)) - (imageView2.getMeasuredWidth() / 2), 0, 0, 0);
                    imageView2.setLayoutParams(layoutParams2);
                    this.f45047b.addView(imageView2);
                    imageView2.setVisibility(4);
                    this.f45050e.add(imageView2);
                }
            }
            i4++;
            z2 = z;
            i3 = 1;
        }
        Runnable runnable = this.f45051f;
        if (z3) {
            postDelayed(runnable, 500L);
        } else {
            postDelayed(runnable, 0L);
        }
    }

    public EventsOnRouteView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EventsOnRouteView(Context context) {
        this(context, null);
    }
}
