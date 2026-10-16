package ae;

import com.qonversion.android.sdk.automations.mvp.ScreenActivity;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import mf.C3560b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final b f17627b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f17628c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f17629d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f17630e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f17631f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f17632g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ c[] f17633h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ C3560b f17634i;

    /* renamed from: a, reason: collision with root package name */
    public final String f17635a;

    static {
        c cVar = new c("Url", 0, "url");
        f17628c = cVar;
        c cVar2 = new c("Deeplink", 1, "deeplink");
        f17629d = cVar2;
        c cVar3 = new c("ProductId", 2, InAppPurchaseMetaData.KEY_PRODUCT_ID);
        f17630e = cVar3;
        c cVar4 = new c("ProductIds", 3, "productIds");
        f17631f = cVar4;
        c cVar5 = new c("ScreenId", 4, ScreenActivity.INTENT_SCREEN_ID);
        f17632g = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        f17633h = cVarArr;
        f17634i = ic.d.t(cVarArr);
        f17627b = new b();
    }

    public c(String str, int i5, String str2) {
        this.f17635a = str2;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f17633h.clone();
    }
}
