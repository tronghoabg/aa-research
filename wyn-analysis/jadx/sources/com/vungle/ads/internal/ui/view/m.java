package com.vungle.ads.internal.ui.view;

import android.app.Activity;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class m extends com.vungle.ads.internal.util.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f33793a;

    public m(n nVar) {
        this.f33793a = nVar;
    }

    @Override // com.vungle.ads.internal.util.b
    public final void a(Activity activity) throws IllegalStateException {
        AbstractC3340k.e(activity, "activity");
        WeakReference weakReference = this.f33793a.f33796f;
        if (AbstractC3340k.a(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            boolean z2 = u.f33874a;
            t.a("NativeAd-VideoContentView", "onActivityPaused and pause video");
            d videoView = this.f33793a.getVideoView();
            if (videoView != null) {
                videoView.h();
            }
        }
    }

    @Override // com.vungle.ads.internal.util.b
    public final void b(Activity activity) throws IllegalStateException {
        AbstractC3340k.e(activity, "activity");
        WeakReference weakReference = this.f33793a.f33796f;
        if (AbstractC3340k.a(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            boolean z2 = u.f33874a;
            t.a("NativeAd-VideoContentView", "onActivityResumed and try to play video");
            d videoView = this.f33793a.getVideoView();
            if (videoView != null) {
                videoView.j();
            }
        }
    }
}
