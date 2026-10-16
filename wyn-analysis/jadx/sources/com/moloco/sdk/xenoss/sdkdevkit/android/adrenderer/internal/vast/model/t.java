package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final List f31508a;

    /* renamed from: b, reason: collision with root package name */
    public final List f31509b;

    /* renamed from: c, reason: collision with root package name */
    public final List f31510c;

    public t(List impressions, List errorUrls, List creatives) {
        AbstractC3340k.e(impressions, "impressions");
        AbstractC3340k.e(errorUrls, "errorUrls");
        AbstractC3340k.e(creatives, "creatives");
        this.f31508a = impressions;
        this.f31509b = errorUrls;
        this.f31510c = creatives;
    }
}
