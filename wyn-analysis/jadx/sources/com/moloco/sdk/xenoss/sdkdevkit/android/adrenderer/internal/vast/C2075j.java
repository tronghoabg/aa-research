package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2075j implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final double f31400a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f31401b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f31402c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f31403d;

    public C2075j(double d3, Long l10, Integer num, Integer num2) {
        this.f31400a = d3;
        this.f31401b = l10;
        this.f31402c = num;
        this.f31403d = num2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v mf1 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v) obj;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v mf2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v) obj2;
        AbstractC3340k.e(mf1, "mf1");
        AbstractC3340k.e(mf2, "mf2");
        kotlin.jvm.internal.E e7 = new kotlin.jvm.internal.E();
        kotlin.jvm.internal.E e10 = new kotlin.jvm.internal.E();
        F f10 = new F(e7, e10, 1);
        Integer num = this.f31402c;
        Integer num2 = this.f31403d;
        Integer num3 = mf1.f31520d;
        Integer num4 = mf1.f31521e;
        Double dE = G.e(num3, num4, num, num2);
        Integer num5 = mf2.f31520d;
        Integer num6 = mf2.f31521e;
        f10.invoke(G.c(dE, G.e(num5, num6, num, num2)));
        f10.invoke(G.c(G.j(num3, num4, num, num2), G.j(num5, num6, num, num2)));
        double d3 = this.f31400a;
        Long l10 = this.f31401b;
        f10.invoke(G.c(G.d(mf1, d3, l10), G.d(mf2, d3, l10)));
        return AbstractC3340k.g(e10.f39738a, e7.f39738a);
    }
}
