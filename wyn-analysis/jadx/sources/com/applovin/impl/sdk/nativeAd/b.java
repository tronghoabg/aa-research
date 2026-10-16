package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import cb.AbstractC1593a;
import com.applovin.impl.e6;
import com.applovin.impl.i6;
import com.applovin.impl.j5;
import com.applovin.impl.o7;
import com.applovin.impl.p7;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.a;
import com.applovin.impl.sdk.network.e;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.y4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.List;
import org.apache.tika.metadata.OfficeOpenXMLExtended;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends j5 implements a.InterfaceC0022a, AppLovinAdLoadListener {

    /* renamed from: A, reason: collision with root package name */
    private final List f23124A;

    /* renamed from: B, reason: collision with root package name */
    private final List f23125B;

    /* renamed from: g, reason: collision with root package name */
    private final JSONObject f23126g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f23127h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f23128i;

    /* renamed from: j, reason: collision with root package name */
    private String f23129j;
    private String k;

    /* renamed from: l, reason: collision with root package name */
    private String f23130l;

    /* renamed from: m, reason: collision with root package name */
    private Double f23131m;

    /* renamed from: n, reason: collision with root package name */
    private String f23132n;

    /* renamed from: o, reason: collision with root package name */
    private Uri f23133o;

    /* renamed from: p, reason: collision with root package name */
    private Uri f23134p;

    /* renamed from: q, reason: collision with root package name */
    private p7 f23135q;

    /* renamed from: r, reason: collision with root package name */
    private Uri f23136r;

    /* renamed from: s, reason: collision with root package name */
    private Uri f23137s;

    /* renamed from: t, reason: collision with root package name */
    private Uri f23138t;

    /* renamed from: u, reason: collision with root package name */
    private Uri f23139u;

    /* renamed from: v, reason: collision with root package name */
    private final List f23140v;

    /* renamed from: w, reason: collision with root package name */
    private final List f23141w;

    /* renamed from: x, reason: collision with root package name */
    private final List f23142x;

    /* renamed from: y, reason: collision with root package name */
    private final List f23143y;

    /* renamed from: z, reason: collision with root package name */
    private final List f23144z;

    public b(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, k kVar) {
        super("TaskRenderNativeAd", kVar);
        this.f23129j = "";
        this.k = "";
        this.f23130l = "";
        this.f23131m = null;
        this.f23132n = "";
        this.f23133o = null;
        this.f23134p = null;
        this.f23136r = null;
        this.f23137s = null;
        this.f23138t = null;
        this.f23139u = null;
        this.f23140v = new ArrayList();
        this.f23141w = new ArrayList();
        this.f23142x = new ArrayList();
        this.f23143y = new ArrayList();
        this.f23144z = new ArrayList();
        this.f23124A = new ArrayList();
        this.f23125B = new ArrayList();
        this.f23126g = jSONObject;
        this.f23127h = jSONObject2;
        this.f23128i = appLovinNativeAdLoadListener;
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, "url", null);
        if (StringUtils.isValidString(string)) {
            this.f23138t = Uri.parse(string);
            if (o.a()) {
                this.f21768c.a(this.f21767b, "Processed click destination URL: " + this.f23138t);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.f23139u = Uri.parse(string2);
            if (o.a()) {
                this.f21768c.a(this.f21767b, "Processed click destination backup URL: " + this.f23139u);
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            if (!JsonUtils.getBoolean(this.f23126g, "use_requests_for_native_ad_click_postbacks", (Boolean) this.f21766a.a(y4.f23698T2)).booleanValue()) {
                try {
                    this.f23140v.addAll(JsonUtils.toList(jSONArray));
                    if (o.a()) {
                        this.f21768c.a(this.f21767b, "Processed click tracking URLs: " + this.f23140v);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (o.a()) {
                        this.f21768c.a(this.f21767b, "Failed to render click tracking URLs", th);
                        return;
                    }
                    return;
                }
            }
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i5, null);
                if (objectAtIndex instanceof String) {
                    String str = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str)) {
                        this.f23142x.add(new e.a(this.f21766a).b(str).b(false).a(false).h(f()).a());
                    }
                }
            }
            if (o.a()) {
                this.f21768c.a(this.f21767b, "Processed click tracking requests: " + this.f23142x);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.f21768c.a(this.f21767b, "Preparing native ad view components...");
        }
        try {
            appLovinNativeAdImpl.setUpNativeAdViewComponents();
            if (o.a()) {
                this.f21768c.a(this.f21767b, "Successfully prepared native ad view components");
            }
            appLovinNativeAdImpl.getAdEventTracker().h();
            this.f23128i.onNativeAdLoaded(appLovinNativeAdImpl);
        } catch (Throwable th) {
            if (o.a()) {
                this.f21768c.a(this.f21767b, "Failed to prepare native ad view components", th);
            }
            b(th.getMessage());
            this.f21766a.D().a(this.f21767b, "prepareNativeComponents", th);
        }
    }

    private void c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new e(0, this, appLovinNativeAdImpl));
    }

    private boolean f() {
        return JsonUtils.getBoolean(this.f23126g, "fire_native_ad_postbacks_from_webview", (Boolean) this.f21766a.a(y4.f23691S2)).booleanValue();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (o.a()) {
            this.f21768c.a(this.f21767b, "VAST ad rendered successfully");
        }
        this.f23135q = (p7) appLovinAd;
        e();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i5) {
        if (o.a()) {
            this.f21768c.b(this.f21767b, "VAST ad failed to render");
        }
        e();
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r32 = 0;
        String string = JsonUtils.getString(this.f23126g, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string)) {
            this.f23136r = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f23126g, "privacy_url", null);
        if (URLUtil.isValidUrl(string2)) {
            this.f23137s = Uri.parse(string2);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f23126g, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            if (o.a()) {
                this.f21768c.b(this.f21767b, "No oRtb response provided: " + this.f23126g);
            }
            b("No oRtb response provided");
            return;
        }
        String string3 = JsonUtils.getString(jSONObject, "version", null);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, (JSONObject) null);
        if (o.a()) {
            AbstractC1593a.s("Rendering native ad for oRTB version: ", string3, this.f21768c, this.f21767b);
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "native", jSONObject2);
        a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", null);
        if (jSONArray == null || jSONArray.length() == 0) {
            if (o.a()) {
                this.f21768c.b(this.f21767b, "Unable to retrieve assets - failing ad load: " + this.f23126g);
            }
            b("Unable to retrieve assets");
            return;
        }
        String str = "";
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i5, (JSONObject) null);
            if (jSONObject4.has("title")) {
                this.f23129j = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "title", (JSONObject) null), "text", null);
                if (o.a()) {
                    AbstractC1593a.w(new StringBuilder("Processed title: "), this.f23129j, this.f21768c, this.f21767b);
                }
            } else if (jSONObject4.has("link")) {
                a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) null));
            } else if (jSONObject4.has("img")) {
                int i10 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "img", (JSONObject) null);
                int i11 = JsonUtils.getInt(jSONObject5, "type", -1);
                String string4 = JsonUtils.getString(jSONObject5, "url", null);
                if (i11 == 1 || 3 == i10) {
                    this.f23133o = Uri.parse(string4);
                    if (o.a()) {
                        this.f21768c.a(this.f21767b, "Processed icon URL: " + this.f23133o);
                    }
                } else if (i11 == 3 || 2 == i10) {
                    this.f23134p = Uri.parse(string4);
                    if (o.a()) {
                        this.f21768c.a(this.f21767b, "Processed main image URL: " + this.f23134p);
                    }
                } else {
                    if (o.a()) {
                        this.f21768c.k(this.f21767b, "Unrecognized image: " + jSONObject4);
                    }
                    int i12 = JsonUtils.getInt(jSONObject5, OfficeOpenXMLExtended.WORD_PROCESSING_PREFIX, -1);
                    int i13 = JsonUtils.getInt(jSONObject5, "h", -1);
                    if (i12 <= 0 || i13 <= 0) {
                        if (o.a()) {
                            this.f21768c.k(this.f21767b, "Skipping...");
                        }
                    } else if (i12 / i13 > 1.0d) {
                        if (o.a()) {
                            this.f21768c.a(this.f21767b, N0.a.e("Inferring main image from ", i12, "x", i13, "..."));
                        }
                        this.f23134p = Uri.parse(string4);
                    } else {
                        if (o.a()) {
                            this.f21768c.a(this.f21767b, N0.a.e("Inferring icon image from ", i12, "x", i13, "..."));
                        }
                        this.f23133o = Uri.parse(string4);
                    }
                }
            } else if (jSONObject4.has(MimeTypes.BASE_TYPE_VIDEO)) {
                String string5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, MimeTypes.BASE_TYPE_VIDEO, (JSONObject) null), "vasttag", null);
                if (StringUtils.isValidString(string5)) {
                    if (o.a()) {
                        this.f21768c.a(this.f21767b, "Processed VAST video");
                    }
                } else if (o.a()) {
                    this.f21768c.k(this.f21767b, "Ignoring invalid \"vasttag\" for video: " + jSONObject4);
                }
                str = string5;
            } else if (jSONObject4.has(JsonStorageKeyNames.DATA_KEY)) {
                int i14 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, JsonStorageKeyNames.DATA_KEY, (JSONObject) null);
                int i15 = JsonUtils.getInt(jSONObject6, "type", -1);
                String string6 = JsonUtils.getString(jSONObject6, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, null);
                if (i15 == 1 || i14 == 8) {
                    this.k = string6;
                    if (o.a()) {
                        AbstractC1593a.w(new StringBuilder("Processed advertiser: "), this.k, this.f21768c, this.f21767b);
                    }
                } else if (i15 == 2 || i14 == 4) {
                    this.f23130l = string6;
                    if (o.a()) {
                        AbstractC1593a.w(new StringBuilder("Processed body: "), this.f23130l, this.f21768c, this.f21767b);
                    }
                } else if (i15 == 12 || i14 == 5) {
                    this.f23132n = string6;
                    if (o.a()) {
                        AbstractC1593a.w(new StringBuilder("Processed cta: "), this.f23132n, this.f21768c, this.f21767b);
                    }
                } else if (i15 == 3 || i14 == 6) {
                    double dA = o7.a(string6, -1.0d);
                    if (dA != -1.0d) {
                        this.f23131m = Double.valueOf(dA);
                        if (o.a()) {
                            this.f21768c.a(this.f21767b, "Processed star rating: " + this.f23131m);
                        }
                    } else if (o.a()) {
                        AbstractC1593a.s("Received invalid star rating: ", string6, this.f21768c, this.f21767b);
                    }
                } else if (o.a()) {
                    this.f21768c.k(this.f21767b, "Skipping unsupported data: " + jSONObject4);
                }
            } else if (o.a()) {
                this.f21768c.b(this.f21767b, "Unsupported asset object: " + jSONObject4);
            }
        }
        String string7 = JsonUtils.getString(jSONObject3, "jstracker", null);
        if (StringUtils.isValidString(string7)) {
            this.f23141w.add(string7);
            if (o.a()) {
                AbstractC1593a.s("Processed jstracker: ", string7, this.f21768c, this.f21767b);
            }
        }
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", null);
        if (jSONArray2 != null) {
            for (int i16 = 0; i16 < jSONArray2.length(); i16++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i16, null);
                if (objectAtIndex instanceof String) {
                    String str2 = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f23143y.add(new e.a(this.f21766a).b(str2).b(false).a(false).h(f()).a());
                        if (o.a()) {
                            AbstractC1593a.s("Processed imptracker URL: ", str2, this.f21768c, this.f21767b);
                        }
                    }
                }
            }
        }
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", null);
        if (jSONArray3 != null) {
            int i17 = 0;
            while (i17 < jSONArray3.length()) {
                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i17, (JSONObject) r32);
                int i18 = JsonUtils.getInt(jSONObject7, "event", -1);
                int i19 = JsonUtils.getInt(jSONObject7, "method", -1);
                String string8 = JsonUtils.getString(jSONObject7, "url", r32);
                if (!TextUtils.isEmpty(string8)) {
                    if (i19 == 1 || i19 == 2) {
                        if (i19 == 2 && string8.startsWith("<script")) {
                            this.f23141w.add(string8);
                        } else {
                            com.applovin.impl.sdk.network.e eVarB = new e.a(this.f21766a).b(string8).b(false).a(false).h(f() || i19 == 2).a();
                            if (i18 == 1) {
                                this.f23143y.add(eVarB);
                                if (o.a()) {
                                    AbstractC1593a.s("Processed impression URL: ", string8, this.f21768c, this.f21767b);
                                }
                            } else if (i18 == 2) {
                                this.f23144z.add(eVarB);
                                if (o.a()) {
                                    AbstractC1593a.s("Processed viewable MRC50 URL: ", string8, this.f21768c, this.f21767b);
                                }
                            } else if (i18 == 3) {
                                this.f23124A.add(eVarB);
                                if (o.a()) {
                                    AbstractC1593a.s("Processed viewable MRC100 URL: ", string8, this.f21768c, this.f21767b);
                                }
                            } else if (i18 == 4) {
                                this.f23125B.add(eVarB);
                                if (o.a()) {
                                    AbstractC1593a.s("Processed viewable video 50 URL: ", string8, this.f21768c, this.f21767b);
                                }
                            } else if (i18 == 555) {
                                if (o.a()) {
                                    AbstractC1593a.s("Ignoring processing of OMID URL: ", string8, this.f21768c, this.f21767b);
                                }
                            } else if (o.a()) {
                                this.f21768c.b(this.f21767b, "Unsupported event tracker: " + jSONObject7);
                            }
                        }
                    } else if (o.a()) {
                        this.f21768c.b(this.f21767b, "Unsupported method for event tracker: " + jSONObject7);
                    }
                }
                i17++;
                r32 = 0;
            }
        }
        if (!StringUtils.isValidString(str)) {
            e();
            return;
        }
        if (o.a()) {
            this.f21768c.a(this.f21767b, "Processing VAST video...");
        }
        this.f21766a.r0().a(i6.a(str, JsonUtils.shallowCopy(this.f23126g), JsonUtils.shallowCopy(this.f23127h), this, this.f21766a));
    }

    private void e() {
        AppLovinNativeAdImpl appLovinNativeAdImplBuild = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f23126g), JsonUtils.shallowCopy(this.f23127h), this.f21766a).setTitle(this.f23129j).setAdvertiser(this.k).setBody(this.f23130l).setCallToAction(this.f23132n).setStarRating(this.f23131m).setIconUri(this.f23133o).setMainImageUri(this.f23134p).setPrivacyIconUri(this.f23136r).setVastAd(this.f23135q).setPrivacyDestinationUri(this.f23137s).setClickDestinationUri(this.f23138t).setClickDestinationBackupUri(this.f23139u).setClickTrackingUrls(this.f23140v).setJsTrackers(this.f23141w).setClickTrackingRequests(this.f23142x).setImpressionRequests(this.f23143y).setViewableMRC50Requests(this.f23144z).setViewableMRC100Requests(this.f23124A).setViewableVideo50Requests(this.f23125B).build();
        appLovinNativeAdImplBuild.getAdEventTracker().e();
        if (o.a()) {
            this.f21768c.a(this.f21767b, "Starting cache task for type: " + appLovinNativeAdImplBuild.getType() + "...");
        }
        this.f21766a.r0().a((j5) new a(appLovinNativeAdImplBuild, this.f21766a, this), e6.b.CORE);
    }

    private void b(String str) {
        this.f23128i.onNativeAdLoadFailed(new AppLovinError(-6, str));
    }

    @Override // com.applovin.impl.sdk.nativeAd.a.InterfaceC0022a
    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.f21768c.a(this.f21767b, "Successfully cached and loaded ad");
        }
        c(appLovinNativeAdImpl);
    }
}
