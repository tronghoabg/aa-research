package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f31505a;

    /* renamed from: b, reason: collision with root package name */
    public final List f31506b;

    public r(String clickThroughUrl, List clickTrackingUrlList) {
        AbstractC3340k.e(clickThroughUrl, "clickThroughUrl");
        AbstractC3340k.e(clickTrackingUrlList, "clickTrackingUrlList");
        this.f31505a = clickThroughUrl;
        this.f31506b = clickTrackingUrlList;
    }
}
