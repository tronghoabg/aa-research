package com.applovin.impl.sdk;

import android.adservices.topics.GetTopicsRequest;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23261b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23262c;

    public /* synthetic */ u(int i5, Object obj, Object obj2) {
        this.f23260a = i5;
        this.f23262c = obj;
        this.f23261b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23260a) {
            case 0:
                ((AppLovinAdServiceImpl.b) this.f23262c).adReceived((com.applovin.impl.sdk.ad.b) this.f23261b);
                break;
            case 1:
                ((AppLovinAdLoadListener) this.f23262c).adReceived((com.applovin.impl.sdk.ad.b) this.f23261b);
                break;
            case 2:
                ((k) this.f23262c).a((AppLovinSdkInitializationConfiguration) this.f23261b);
                break;
            case 3:
                ((k) this.f23262c).b((String) this.f23261b);
                break;
            case 4:
                ((l) this.f23262c).b((AppLovinBidTokenCollectionListener) this.f23261b);
                break;
            case 5:
                ((n) this.f23262c).a((Long) this.f23261b);
                break;
            case 6:
                ((r) this.f23262c).a((GetTopicsRequest) this.f23261b);
                break;
            case 7:
                ((r) this.f23262c).a((List) this.f23261b);
                break;
            default:
                ((r) this.f23262c).a((String) this.f23261b);
                break;
        }
    }
}
