package com.applovin.mediation.adapters;

import com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter;
import com.applovin.mediation.adapters.GoogleMediationAdapter;
import com.google.android.gms.ads.nativead.MediaView;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaView f24055b;

    public /* synthetic */ a(MediaView mediaView, int i5) {
        this.f24054a = i5;
        this.f24055b = mediaView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24054a) {
            case 0:
                ((GoogleAdManagerMediationAdapter.AutoMeasuringMediaView) this.f24055b).lambda$requestLayout$0();
                break;
            default:
                ((GoogleMediationAdapter.AutoMeasuringMediaView) this.f24055b).lambda$requestLayout$0();
                break;
        }
    }
}
