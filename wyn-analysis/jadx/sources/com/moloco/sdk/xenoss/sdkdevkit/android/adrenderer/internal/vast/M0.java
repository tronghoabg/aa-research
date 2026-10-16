package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import ef.C2532p;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class M0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C2532p f31251a = Fe.c.z(new com.moloco.sdk.service_locator.h(18));

    /* renamed from: b, reason: collision with root package name */
    public static final Bf.i f31252b = new Bf.i("\\[ERRORCODE]");

    /* renamed from: c, reason: collision with root package name */
    public static final Bf.i f31253c = new Bf.i("\\[CONTENTPLAYHEAD]");

    /* renamed from: d, reason: collision with root package name */
    public static final Bf.i f31254d = new Bf.i("\\[CACHEBUSTING]");

    /* renamed from: e, reason: collision with root package name */
    public static final Bf.i f31255e = new Bf.i("\\[ASSETURI]");

    /* renamed from: f, reason: collision with root package name */
    public static final Bf.i f31256f = new Bf.i("\\[[^]]*]");

    /* renamed from: g, reason: collision with root package name */
    public static final Bf.i f31257g = new Bf.i("\\[MEDIAPLAYHEAD]");

    /* renamed from: h, reason: collision with root package name */
    public static final Bf.i f31258h = new Bf.i("\\[ADPLAYHEAD]");

    public static final L0 a() {
        return (L0) f31251a.getValue();
    }

    public static final String b(int i5) {
        long j8 = i5;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format("%02d:%02d:%02d.%03d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(j8)), Long.valueOf(timeUnit.toMinutes(j8) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j8) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j8 % 1000)}, 4));
    }
}
