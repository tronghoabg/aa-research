package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class t7 {

    /* renamed from: f, reason: collision with root package name */
    private static final List f23302f = Arrays.asList("video/mp4", MimeTypes.VIDEO_WEBM, "video/3gpp", "video/x-matroska");

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f23303a;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f23305c;

    /* renamed from: d, reason: collision with root package name */
    private final JSONObject f23306d;

    /* renamed from: b, reason: collision with root package name */
    protected List f23304b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final long f23307e = System.currentTimeMillis();

    public t7(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        this.f23303a = kVar;
        this.f23305c = jSONObject;
        this.f23306d = jSONObject2;
    }

    public List a() {
        return this.f23304b;
    }

    public JSONObject b() {
        return this.f23305c;
    }

    public long c() {
        return this.f23307e;
    }

    public int d() {
        return this.f23304b.size();
    }

    public JSONObject e() {
        return this.f23306d;
    }

    public List f() {
        List<String> listExplode = CollectionUtils.explode(JsonUtils.getString(this.f23305c, "vast_preferred_video_types", null));
        return !listExplode.isEmpty() ? listExplode : f23302f;
    }

    public int g() {
        return o7.c(JsonUtils.getInt(this.f23305c, "video_completion_percent", -1));
    }
}
