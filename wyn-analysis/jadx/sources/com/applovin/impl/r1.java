package com.applovin.impl;

import com.applovin.impl.d2;
import com.applovin.impl.e6;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.unity3d.ads.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r1 extends e2 {

    /* renamed from: i, reason: collision with root package name */
    private JSONObject f22641i;

    public r1(com.applovin.impl.sdk.k kVar) {
        super(kVar, d2.b.ERROR);
    }

    public void a(String str, Throwable th) {
        a(str, th, new HashMap());
    }

    public void b() {
        this.f22641i = JsonUtils.deserialize((String) this.f21417a.a(y4.f23627K));
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(String str, String str2, Throwable th) {
        a(str, str2, th, new HashMap());
    }

    public void a(String str, String str2, Throwable th, Map map) {
        a(N0.a.g(str, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, str2), th, map);
    }

    public void b(String str, String str2, Throwable th) {
        this.f21417a.r0().a((j5) new s6(this.f21417a, "reportCaughtException", new Cb.a(this, str, str2, th, 17)), e6.b.OTHER);
    }

    public void a(String str, Throwable th, Map map) {
        map.put("source", str);
        map.put("top_main_method", th.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        for (Throwable th2 : th.getSuppressed()) {
            HashMap map2 = new HashMap();
            CollectionUtils.putStringIfValid("source", str, map2);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), map2);
            CollectionUtils.putStringIfValid("suppressed_throwable", th2.toString(), map2);
            arrayList.add(map2);
        }
        a(d2.f21281N0, arrayList, 0L);
    }

    public void a(String str, String str2, com.applovin.impl.sdk.ad.b bVar) {
        HashMap map = new HashMap();
        map.put("source", str);
        map.put("error_message", str2);
        if (bVar != null) {
            map.putAll(f2.a((AppLovinAdImpl) bVar));
            map.putAll(f2.a(bVar));
            boolean zC0 = bVar.C0();
            map.put("is_video_stream", String.valueOf(zC0));
            if (zC0 && (bVar instanceof com.applovin.impl.sdk.ad.a)) {
                CollectionUtils.putStringIfValid("video_url", ((com.applovin.impl.sdk.ad.a) bVar).i1(), map);
            } else {
                CollectionUtils.putStringIfValid("video_url", bVar.I(), map);
            }
        }
        d(d2.f21293T0, map);
    }

    public void a(String str, String str2, int i5, String str3) {
        List listA = a(str2);
        boolean z2 = listA != null;
        if (z2 && listA.contains(Integer.valueOf(i5))) {
            return;
        }
        if (z2 || i5 >= 400) {
            HashMap map = new HashMap(4);
            map.put("source", str);
            map.put("url", StringUtils.emptyIfNull(str2));
            map.put("code", String.valueOf(i5));
            map.put("error_message", f2.a(str3));
            d(d2.f21299W0, map);
        }
    }

    private List a(String str) {
        List<Integer> integerList = JsonUtils.getIntegerList(this.f22641i, StringUtils.getHost(str), null);
        return integerList == null ? JsonUtils.getIntegerList(this.f22641i, BuildConfig.FLAVOR, null) : integerList;
    }
}
