package com.moloco.sdk.service_locator;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import ef.C2532p;

/* loaded from: classes4.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final C2532p f29853a = Fe.c.z(new com.moloco.sdk.internal.services.encryption.a(28));

    /* renamed from: b, reason: collision with root package name */
    public static final C2532p f29854b = Fe.c.z(new com.moloco.sdk.internal.services.encryption.a(29));

    /* renamed from: c, reason: collision with root package name */
    public static final C2532p f29855c = Fe.c.z(new h(0));

    /* renamed from: d, reason: collision with root package name */
    public static final C2532p f29856d = Fe.c.z(new h(1));

    /* renamed from: e, reason: collision with root package name */
    public static final C2532p f29857e = Fe.c.z(new h(2));

    public static G0 a() {
        return new G0(ic.d.e(null));
    }

    public static com.moloco.sdk.internal.services.k b() {
        return (com.moloco.sdk.internal.services.k) f29853a.getValue();
    }
}
