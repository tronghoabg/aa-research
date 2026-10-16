package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2083a {

    /* renamed from: a, reason: collision with root package name */
    public final J f31467a;

    /* renamed from: b, reason: collision with root package name */
    public final List f31468b;

    /* renamed from: c, reason: collision with root package name */
    public final List f31469c;

    public C2083a(J j8, List clickTrackingList, List customClickList) {
        AbstractC3340k.e(clickTrackingList, "clickTrackingList");
        AbstractC3340k.e(customClickList, "customClickList");
        this.f31467a = j8;
        this.f31468b = clickTrackingList;
        this.f31469c = customClickList;
    }
}
