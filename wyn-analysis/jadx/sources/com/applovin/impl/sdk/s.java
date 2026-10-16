package com.applovin.impl.sdk;

import android.view.InputEvent;
import com.applovin.impl.sdk.c;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23255c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23256d;

    public /* synthetic */ s(AppLovinAdServiceImpl appLovinAdServiceImpl, AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f23253a = 1;
        this.f23254b = appLovinAdServiceImpl;
        this.f23256d = appLovinError;
        this.f23255c = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23253a) {
            case 0:
                ((AppLovinAdServiceImpl) this.f23254b).a((AppLovinAdLoadListener) this.f23255c, (AppLovinAd) this.f23256d);
                break;
            case 1:
                ((AppLovinAdServiceImpl) this.f23254b).a((AppLovinError) this.f23256d, (AppLovinAdLoadListener) this.f23255c);
                break;
            case 2:
                ((c) this.f23254b).a((com.applovin.impl.sdk.ad.b) this.f23255c, (c.b) this.f23256d);
                break;
            case 3:
                ((n) this.f23254b).a((Long) this.f23255c, this.f23256d);
                break;
            default:
                ((r) this.f23254b).a((List) this.f23255c, (InputEvent) this.f23256d);
                break;
        }
    }

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, int i5) {
        this.f23253a = i5;
        this.f23254b = obj;
        this.f23255c = obj2;
        this.f23256d = obj3;
    }
}
