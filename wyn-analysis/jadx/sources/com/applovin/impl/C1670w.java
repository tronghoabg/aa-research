package com.applovin.impl;

import android.content.Context;
import com.amazon.aps.ads.Aps;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.applovin.mediation.MaxAdFormat;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.applovin.impl.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1670w implements DTBAdCallback {

    /* renamed from: a, reason: collision with root package name */
    private final MaxAdFormat f23413a;

    /* renamed from: b, reason: collision with root package name */
    private final a f23414b;

    /* renamed from: c, reason: collision with root package name */
    private DTBAdRequest f23415c;

    /* renamed from: com.applovin.impl.w$a */
    public interface a {
        void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat);
    }

    public C1670w(C1672x c1672x, MaxAdFormat maxAdFormat, Context context, a aVar) {
        this(Arrays.asList(c1672x.a()), maxAdFormat, context, aVar);
    }

    public void a() {
        DTBAdRequest dTBAdRequest = this.f23415c;
        if (dTBAdRequest == null) {
            this.f23414b.onAdLoadFailed(null, this.f23413a);
        } else {
            dTBAdRequest.loadAd(this);
        }
    }

    public void onFailure(AdError adError) {
        this.f23414b.onAdLoadFailed(adError, this.f23413a);
    }

    public void onSuccess(DTBAdResponse dTBAdResponse) {
        this.f23414b.onAdResponseLoaded(dTBAdResponse, this.f23413a);
    }

    public C1670w(List list, MaxAdFormat maxAdFormat, Context context, a aVar) {
        this.f23413a = maxAdFormat;
        this.f23414b = aVar;
        try {
            DTBAdSize[] dTBAdSizeArr = new DTBAdSize[list.size()];
            for (int i5 = 0; i5 < list.size(); i5++) {
                Object obj = list.get(i5);
                if (obj instanceof DTBAdSize) {
                    dTBAdSizeArr[i5] = (DTBAdSize) obj;
                }
            }
            if (o7.a(Aps.getSdkVersion(), "10.0.0") >= 0) {
                Class<?> cls = Class.forName("com.amazon.aps.ads.model.ApsAdNetwork");
                Class<?> cls2 = Class.forName("com.amazon.device.ads.DTBAdNetworkInfo");
                this.f23415c = (DTBAdRequest) DTBAdRequest.class.getConstructor(Context.class, cls2).newInstance(context.getApplicationContext(), cls2.getConstructor(cls).newInstance(cls.getField("MAX").get(null)));
            } else {
                this.f23415c = (DTBAdRequest) DTBAdRequest.class.getConstructor(null).newInstance(null);
            }
            this.f23415c.setSizes(dTBAdSizeArr);
        } catch (Throwable unused) {
        }
    }
}
