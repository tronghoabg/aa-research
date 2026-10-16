package com.waze.ad;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.lottie.LottieAnimationView;
import com.waze.t.c.k;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements LifecycleEventObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f13875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13876b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f13877c;

    public /* synthetic */ a(LottieAnimationView lottieAnimationView, Runnable runnable, int i2) {
        this.f13877c = i2;
        this.f13875a = lottieAnimationView;
        this.f13876b = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (this.f13877c != 0) {
            x.f(lifecycleOwner, "<unused var>");
            x.f(event, NotificationCompat.CATEGORY_EVENT);
            if (event == Lifecycle.Event.ON_RESUME) {
                ((k) this.f13876b).e((Context) this.f13875a);
                return;
            }
            return;
        }
        x.f(lifecycleOwner, "<unused var>");
        x.f(event, NotificationCompat.CATEGORY_EVENT);
        if (event == Lifecycle.Event.ON_DESTROY) {
            ((LottieAnimationView) this.f13875a).removeCallbacks(this.f13876b);
        }
    }

    public /* synthetic */ a(k kVar, Context context, int i2) {
        this.f13877c = i2;
        this.f13876b = kVar;
        this.f13875a = context;
    }
}
