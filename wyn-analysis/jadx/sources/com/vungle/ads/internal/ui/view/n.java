package com.vungle.ads.internal.ui.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.vungle.ads.NativeVideoPlaybackError;
import com.vungle.ads.R;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.n2;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.r1;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.v;
import com.vungle.ads.internal.util.w;
import ef.C2515C;
import ef.C2527k;
import ef.C2530n;
import ff.AbstractC2640A;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class n extends e implements com.vungle.ads.nativead.a, com.vungle.ads.nativead.b, v {

    /* renamed from: d, reason: collision with root package name */
    public d f33794d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f33795e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f33796f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f33797g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f33798h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f33799i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f33800j;
    public final AtomicBoolean k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f33801l;

    /* renamed from: m, reason: collision with root package name */
    public final n2 f33802m;

    /* renamed from: n, reason: collision with root package name */
    public final w f33803n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f33804o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f33805p;

    /* renamed from: q, reason: collision with root package name */
    public final m f33806q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, r1 internal) {
        super(context, internal);
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(internal, "internal");
        this.f33797g = new AtomicBoolean(false);
        this.f33798h = new AtomicBoolean(false);
        this.f33799i = new AtomicBoolean(false);
        this.f33800j = new AtomicBoolean(false);
        this.k = new AtomicBoolean(false);
        this.f33801l = new AtomicBoolean(false);
        this.f33802m = new n2(Sdk.SDKMetric.SDKMetricType.NATIVE_VIDEO_PREPARE_DURATION_MS);
        this.f33803n = new w();
        this.f33804o = new AtomicBoolean(false);
        this.f33805p = new AtomicBoolean(false);
        this.f33806q = new m(this);
    }

    public static /* synthetic */ void getVideoView$annotations() {
    }

    public final void b() {
        this.f33802m.d();
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.f33802m, getInternal().f33625m, 4);
    }

    public int getCurrentTime() {
        d dVar = this.f33794d;
        if (dVar != null) {
            return dVar.getCurrentPositionMs();
        }
        return 0;
    }

    public int getDuration() {
        d dVar = this.f33794d;
        if (dVar != null) {
            return dVar.getDurationMs();
        }
        return 0;
    }

    @Nullable
    public final d getVideoView() {
        return this.f33794d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Object objZ;
        super.onAttachedToWindow();
        try {
            if (!this.f33804o.getAndSet(true)) {
                boolean z2 = u.f33874a;
                t.a("NativeAd-VideoContentView", "registerReceiver()");
                this.f33805p.set(false);
                this.f33803n.a(this);
                getContext().registerReceiver(this.f33803n, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
            }
            objZ = C2515C.f34653a;
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        Throwable thA = C2530n.a(objZ);
        if (thA != null) {
            boolean z10 = u.f33874a;
            t.a("NativeAd-VideoContentView", "registerReceiver", thA);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object objZ;
        super.onDetachedFromWindow();
        try {
            if (this.f33804o.getAndSet(false)) {
                boolean z2 = u.f33874a;
                t.a("NativeAd-VideoContentView", "unregisterReceiver()");
                this.f33803n.a(null);
                getContext().unregisterReceiver(this.f33803n);
            }
            objZ = C2515C.f34653a;
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        Throwable thA = C2530n.a(objZ);
        if (thA != null) {
            boolean z10 = u.f33874a;
            t.a("NativeAd-VideoContentView", "unregisterReceiver", thA);
        }
    }

    public final void setVideoView(@Nullable d dVar) {
        this.f33794d = dVar;
    }

    public static final void a(n this$0, View view) {
        AbstractC3340k.e(this$0, "this$0");
        d dVar = this$0.f33794d;
        if (dVar != null) {
            boolean z2 = dVar.f33769o;
            dVar.setMuted(!z2);
            if (z2) {
                ImageView imageView = this$0.f33795e;
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.liftoff_icon_unmute);
                    return;
                }
                return;
            }
            ImageView imageView2 = this$0.f33795e;
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.liftoff_icon_mute);
            }
        }
    }

    @Override // com.vungle.ads.internal.ui.view.e
    public final void a(Context context) throws IllegalStateException {
        Activity activity;
        AbstractC3340k.e(context, "context");
        boolean z2 = u.f33874a;
        t.a("NativeAd-VideoContentView", "initView");
        ImageView imageView$vungle_ads_release = getImageView$vungle_ads_release();
        if (imageView$vungle_ads_release != null) {
            imageView$vungle_ads_release.setVisibility(8);
        }
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f33838f;
        com.vungle.ads.internal.util.a.a(this.f33806q);
        boolean zU = getInternal().u();
        t.a("NativeAd-VideoContentView", "startMuted=" + zU);
        d dVar2 = new d(context);
        this.f33794d = dVar2;
        dVar2.setMuted(zU);
        d dVar3 = this.f33794d;
        if (dVar3 != null) {
            dVar3.setLooping(false);
        }
        d dVar4 = this.f33794d;
        if (dVar4 != null) {
            dVar4.m();
        }
        d dVar5 = this.f33794d;
        if (dVar5 != null) {
            dVar5.setVideoLifecycleCallback(this);
        }
        d dVar6 = this.f33794d;
        if (dVar6 != null) {
            dVar6.setVideoTransformCallback$vungle_ads_release(new B8.b(this, 21));
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        d dVar7 = this.f33794d;
        if (dVar7 != null) {
            dVar7.setLayoutParams(layoutParams);
        }
        addView(this.f33794d);
        this.f33795e = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(5);
        layoutParams2.addRule(6);
        ImageView imageView = this.f33795e;
        if (imageView != null) {
            imageView.setLayoutParams(layoutParams2);
        }
        ImageView imageView2 = this.f33795e;
        if (imageView2 != null) {
            imageView2.setClickable(true);
        }
        ImageView imageView3 = this.f33795e;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new Lb.h(this, 0));
        }
        if (zU) {
            ImageView imageView4 = this.f33795e;
            if (imageView4 != null) {
                imageView4.setImageResource(R.drawable.liftoff_icon_mute);
            }
        } else {
            ImageView imageView5 = this.f33795e;
            if (imageView5 != null) {
                imageView5.setImageResource(R.drawable.liftoff_icon_unmute);
            }
        }
        addView(this.f33795e);
        ImageView imageView6 = this.f33795e;
        if (imageView6 != null) {
            imageView6.bringToFront();
        }
        requestLayout();
        Object objZ = null;
        try {
            if (!(context instanceof Activity)) {
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                        break;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                        AbstractC3340k.d(context, "ctx.baseContext");
                    }
                }
            } else {
                activity = (Activity) context;
            }
            if (activity != null) {
                this.f33796f = new WeakReference(activity);
            }
            boolean z10 = u.f33874a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("adActivity=");
            WeakReference weakReference = this.f33796f;
            sb2.append(weakReference != null ? (Activity) weakReference.get() : null);
            t.a("NativeAd-VideoContentView", sb2.toString());
        } catch (Throwable th) {
            Fe.e.z(th);
        }
        this.f33802m.e();
        try {
            Uri uri = Uri.parse(getInternal().o());
            AbstractC3340k.d(uri, "parse(this)");
            d dVar8 = this.f33794d;
            if (dVar8 != null) {
                dVar8.setSource(uri);
            }
            d dVar9 = this.f33794d;
            if (dVar9 != null) {
                dVar9.i();
                objZ = C2515C.f34653a;
            }
        } catch (Throwable th2) {
            objZ = Fe.e.z(th2);
        }
        Throwable thA = C2530n.a(objZ);
        if (thA != null) {
            a(String.valueOf(thA.getLocalizedMessage()), -2);
        }
    }

    public static final void a(n this$0, float f10, float f11) {
        AbstractC3340k.e(this$0, "this$0");
        ImageView imageView = this$0.f33795e;
        if (imageView != null) {
            imageView.setTranslationX(f10);
        }
        ImageView imageView2 = this$0.f33795e;
        if (imageView2 == null) {
            return;
        }
        imageView2.setTranslationY(f11);
    }

    @Override // com.vungle.ads.internal.util.v
    public final void a(boolean z2) {
        d dVar;
        d dVar2 = this.f33794d;
        Boolean boolValueOf = dVar2 != null ? Boolean.valueOf(dVar2.f33769o) : null;
        boolean z10 = u.f33874a;
        t.a("NativeAd-VideoContentView", "silentModeEnabled=" + z2 + " currentIsMuted=" + boolValueOf);
        if (!this.f33805p.getAndSet(true) || boolValueOf == null || Boolean.valueOf(z2).equals(boolValueOf) || (dVar = this.f33794d) == null) {
            return;
        }
        boolean z11 = dVar.f33769o;
        dVar.setMuted(true ^ z11);
        if (!z11) {
            ImageView imageView = this.f33795e;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.liftoff_icon_mute);
                return;
            }
            return;
        }
        ImageView imageView2 = this.f33795e;
        if (imageView2 != null) {
            imageView2.setImageResource(R.drawable.liftoff_icon_unmute);
        }
    }

    public final void a(int i5) {
        if (1 <= i5 && i5 < 25) {
            if (this.f33797g.compareAndSet(false, true)) {
                int duration = getDuration();
                C2527k c2527k = new C2527k("OM_KEY_DURATION", Integer.valueOf(duration));
                d dVar = this.f33794d;
                Map mapR = AbstractC2640A.R(c2527k, new C2527k("OM_KEY_VOLUME", Integer.valueOf(!AbstractC3340k.a(dVar != null ? Boolean.valueOf(dVar.f33769o) : null, Boolean.TRUE) ? 1 : 0)));
                getInternal().a(String.valueOf(duration));
                getInternal().a(4, mapR);
                return;
            }
            return;
        }
        if (25 <= i5 && i5 < 50) {
            if (this.f33798h.compareAndSet(false, true)) {
                r1.a(getInternal(), "checkpoint.25");
                getInternal().a(5, (Map) null);
                return;
            }
            return;
        }
        if (50 <= i5 && i5 < 75) {
            if (this.f33799i.compareAndSet(false, true)) {
                r1.a(getInternal(), "checkpoint.50");
                getInternal().a(6, (Map) null);
                return;
            }
            return;
        }
        if (75 <= i5 && i5 < 100) {
            if (this.f33800j.compareAndSet(false, true)) {
                r1.a(getInternal(), "checkpoint.75");
                getInternal().a(7, (Map) null);
                return;
            }
            return;
        }
        if (i5 < 100 || !this.k.compareAndSet(false, true)) {
            return;
        }
        r1.a(getInternal(), "checkpoint.100");
    }

    public final void a(String extra, int i5) {
        AbstractC3340k.e(extra, "extra");
        if (this.f33801l.getAndSet(true)) {
            return;
        }
        Context context = getContext();
        AbstractC3340k.d(context, "context");
        super.a(context);
        ImageView imageView$vungle_ads_release = getImageView$vungle_ads_release();
        if (imageView$vungle_ads_release != null) {
            imageView$vungle_ads_release.setVisibility(0);
        }
        ImageView imageView = this.f33795e;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        d dVar = this.f33794d;
        if (dVar != null) {
            dVar.setVisibility(8);
        }
        new NativeVideoPlaybackError("w=" + i5 + " e=" + extra + " url=" + getInternal().p()).setLogEntry$vungle_ads_release(getInternal().e()).logErrorNoReturnValue$vungle_ads_release();
    }

    @Override // com.vungle.ads.internal.ui.view.e
    public final void a() throws IllegalStateException {
        Object objZ;
        boolean z2 = u.f33874a;
        t.a("NativeAd-VideoContentView", "destroy()");
        try {
            if (this.f33804o.getAndSet(false)) {
                t.a("NativeAd-VideoContentView", "unregisterReceiver()");
                this.f33803n.a(null);
                getContext().unregisterReceiver(this.f33803n);
            }
            objZ = C2515C.f34653a;
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        Throwable thA = C2530n.a(objZ);
        if (thA != null) {
            boolean z10 = u.f33874a;
            t.a("NativeAd-VideoContentView", "unregisterReceiver", thA);
        }
        WeakReference weakReference = this.f33796f;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f33796f = null;
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f33838f;
        com.vungle.ads.internal.util.a.b(this.f33806q);
        d dVar2 = this.f33794d;
        if (dVar2 != null) {
            dVar2.l();
        }
        this.f33794d = null;
        super.a();
    }
}
