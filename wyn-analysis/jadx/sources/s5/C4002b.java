package s5;

import com.applovin.sdk.AppLovinEventTypes;

/* renamed from: s5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4002b implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C4002b f44966a = new C4002b();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f44967b = h9.d.c("sdkVersion");

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f44968c = h9.d.c("model");

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f44969d = h9.d.c("hardware");

    /* renamed from: e, reason: collision with root package name */
    public static final h9.d f44970e = h9.d.c("device");

    /* renamed from: f, reason: collision with root package name */
    public static final h9.d f44971f = h9.d.c(AppLovinEventTypes.USER_VIEWED_PRODUCT);

    /* renamed from: g, reason: collision with root package name */
    public static final h9.d f44972g = h9.d.c("osBuild");

    /* renamed from: h, reason: collision with root package name */
    public static final h9.d f44973h = h9.d.c("manufacturer");

    /* renamed from: i, reason: collision with root package name */
    public static final h9.d f44974i = h9.d.c("fingerprint");

    /* renamed from: j, reason: collision with root package name */
    public static final h9.d f44975j = h9.d.c("locale");
    public static final h9.d k = h9.d.c("country");

    /* renamed from: l, reason: collision with root package name */
    public static final h9.d f44976l = h9.d.c("mccMnc");

    /* renamed from: m, reason: collision with root package name */
    public static final h9.d f44977m = h9.d.c("applicationBuild");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        h9.f fVar = (h9.f) obj2;
        m mVar = (m) ((AbstractC4001a) obj);
        fVar.add(f44967b, mVar.f45015a);
        fVar.add(f44968c, mVar.f45016b);
        fVar.add(f44969d, mVar.f45017c);
        fVar.add(f44970e, mVar.f45018d);
        fVar.add(f44971f, mVar.f45019e);
        fVar.add(f44972g, mVar.f45020f);
        fVar.add(f44973h, mVar.f45021g);
        fVar.add(f44974i, mVar.f45022h);
        fVar.add(f44975j, mVar.f45023i);
        fVar.add(k, mVar.f45024j);
        fVar.add(f44976l, mVar.k);
        fVar.add(f44977m, mVar.f45025l);
    }
}
