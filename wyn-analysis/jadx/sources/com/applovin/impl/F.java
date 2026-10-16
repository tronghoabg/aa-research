package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.hardware.SensorEventListener;
import android.webkit.WebView;
import com.applovin.impl.b4;
import com.applovin.impl.e6;
import com.applovin.impl.i2;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.t4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinPostbackListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final /* synthetic */ class F implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20772c;

    public /* synthetic */ F(int i5, Object obj, Object obj2) {
        this.f20770a = i5;
        this.f20771b = obj;
        this.f20772c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20770a) {
            case 0:
                b4.b.a((b4.c) this.f20771b, (b4.d) this.f20772c);
                break;
            case 1:
                ((ScheduledThreadPoolExecutor) this.f20771b).execute((e6.e) this.f20772c);
                break;
            case 2:
                ((i2.b) this.f20771b).a((AppLovinAd) this.f20772c);
                break;
            case 3:
                ((a2) this.f20771b).h((String) this.f20772c);
                break;
            case 4:
                ((C1636f0) this.f20771b).a((SensorEventListener) this.f20772c);
                break;
            case 5:
                ((f4) this.f20771b).a((String) this.f20772c);
                break;
            case 6:
                ((f4) this.f20771b).b((WebView) this.f20772c);
                break;
            case 7:
                ((g6) this.f20771b).b((MaxErrorImpl) this.f20772c);
                break;
            case 8:
                ((h8) this.f20771b).a((WeakReference) this.f20772c);
                break;
            case 9:
                ((l5) this.f20771b).a((k3) this.f20772c);
                break;
            case 10:
                ((m3) this.f20771b).a((Context) this.f20772c);
                break;
            case 11:
                ((m8) this.f20771b).c((String) this.f20772c);
                break;
            case 12:
                ((m8) this.f20771b).b((WebView) this.f20772c);
                break;
            case 13:
                ((n2) this.f20771b).a((Context) this.f20772c);
                break;
            case 14:
                ((n2) this.f20771b).a((AppLovinAd) this.f20772c);
                break;
            case 15:
                ((n2) this.f20771b).b((com.applovin.impl.sdk.ad.b) this.f20772c);
                break;
            case 16:
                o7.a((Context) this.f20771b, (String) this.f20772c);
                break;
            case 17:
                t2.b((AppLovinPostbackListener) this.f20771b, (String) this.f20772c);
                break;
            case 18:
                t2.a((AppLovinNativeAdLoadListener) this.f20771b, (AppLovinError) this.f20772c);
                break;
            case 19:
                t2.a((AppLovinNativeAdEventListener) this.f20771b, (AppLovinNativeAd) this.f20772c);
                break;
            case 20:
                t2.b((l2) this.f20771b, (String) this.f20772c);
                break;
            case 21:
                t2.b((AppLovinAdClickListener) this.f20771b, (AppLovinAd) this.f20772c);
                break;
            case 22:
                t2.b((AppLovinAdVideoPlaybackListener) this.f20771b, (AppLovinAd) this.f20772c);
                break;
            case 23:
                ((t4) this.f20771b).a((t4.b) this.f20772c);
                break;
            default:
                ((C1667u0) this.f20771b).a((Activity) this.f20772c);
                break;
        }
    }
}
