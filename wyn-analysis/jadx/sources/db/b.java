package Db;

import D6.C0388o;
import U8.L0;
import android.provider.Settings;
import android.util.Log;
import android.webkit.WebView;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.t2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.moloco.sdk.internal.publisher.C1915d;
import com.vungle.ads.internal.network.q;
import com.vungle.ads.internal.network.r;
import java.util.Map;
import kd.T;
import kd.W;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2626b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2627c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2629e;

    public /* synthetic */ b(int i5, Object obj, Object obj2, Object obj3, boolean z2) {
        this.f2625a = i5;
        this.f2627c = z2;
        this.f2628d = obj;
        this.f2629e = obj2;
        this.f2626b = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws Settings.SettingNotFoundException {
        switch (this.f2625a) {
            case 0:
                r.a((r) this.f2628d, (q) this.f2629e, (String) this.f2626b, this.f2627c);
                break;
            case 1:
                C0388o c0388o = (C0388o) this.f2628d;
                c0388o.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                ((X8.a) c0388o.f2463b).d((L0) this.f2629e, (String) this.f2626b, this.f2627c);
                break;
            case 2:
                ((EventServiceImpl) this.f2628d).a((String) this.f2626b, (Map) this.f2629e, this.f2627c);
                break;
            case 3:
                String str = (String) this.f2626b;
                t2.a(this.f2627c, (MaxAdListener) this.f2628d, str, (MaxError) this.f2629e);
                break;
            case 4:
                MaxAd maxAd = (MaxAd) this.f2626b;
                t2.a(this.f2627c, (MaxNativeAdListener) this.f2628d, (MaxNativeAdView) this.f2629e, maxAd);
                break;
            case 5:
                MaxAd maxAd2 = (MaxAd) this.f2629e;
                t2.a(this.f2627c, (MaxAdListener) this.f2628d, maxAd2, (MaxError) this.f2626b);
                break;
            case 6:
                String str2 = (String) this.f2626b;
                t2.a(this.f2627c, (MaxNativeAdListener) this.f2628d, str2, (MaxError) this.f2629e);
                break;
            case 7:
                MaxAd maxAd3 = (MaxAd) this.f2629e;
                MaxAd maxAd4 = (MaxAd) this.f2626b;
                t2.a(this.f2627c, (MaxAdExpirationListener) this.f2628d, maxAd3, maxAd4);
                break;
            case 8:
                t2.a(this.f2627c, (MaxRewardedAdListener) this.f2628d, (MaxAd) this.f2629e, (MaxReward) this.f2626b);
                break;
            case 9:
                C1915d c1915d = new C1915d(24);
                T t10 = (T) this.f2628d;
                t10.f39614a.a(t10, (WebView) this.f2629e, (String) this.f2626b, this.f2627c, c1915d);
                break;
            default:
                C1915d c1915d2 = new C1915d(25);
                W w2 = (W) this.f2628d;
                w2.f39626a.a(w2, (WebView) this.f2629e, (String) this.f2626b, this.f2627c, c1915d2);
                break;
        }
    }

    public /* synthetic */ b(EventServiceImpl eventServiceImpl, String str, Map map, boolean z2) {
        this.f2625a = 2;
        this.f2628d = eventServiceImpl;
        this.f2626b = str;
        this.f2629e = map;
        this.f2627c = z2;
    }

    public /* synthetic */ b(Object obj, Object obj2, String str, boolean z2, int i5) {
        this.f2625a = i5;
        this.f2628d = obj;
        this.f2629e = obj2;
        this.f2626b = str;
        this.f2627c = z2;
    }

    public /* synthetic */ b(boolean z2, Object obj, String str, MaxError maxError, int i5) {
        this.f2625a = i5;
        this.f2627c = z2;
        this.f2628d = obj;
        this.f2626b = str;
        this.f2629e = maxError;
    }
}
