package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2084b {

    /* renamed from: a, reason: collision with root package name */
    public final String f31470a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f31471b;

    /* renamed from: c, reason: collision with root package name */
    public final List f31472c;

    /* renamed from: d, reason: collision with root package name */
    public final List f31473d;

    /* renamed from: e, reason: collision with root package name */
    public final List f31474e;

    public C2084b(String vastAdTagUrl, Boolean bool, List impressions, List errorUrls, List creatives) {
        AbstractC3340k.e(vastAdTagUrl, "vastAdTagUrl");
        AbstractC3340k.e(impressions, "impressions");
        AbstractC3340k.e(errorUrls, "errorUrls");
        AbstractC3340k.e(creatives, "creatives");
        this.f31470a = vastAdTagUrl;
        this.f31471b = bool;
        this.f31472c = impressions;
        this.f31473d = errorUrls;
        this.f31474e = creatives;
    }
}
