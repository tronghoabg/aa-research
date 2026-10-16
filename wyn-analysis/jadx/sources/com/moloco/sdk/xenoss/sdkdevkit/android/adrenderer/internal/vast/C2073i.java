package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C2091i;
import ef.C2527k;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2073i implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f31388a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f31389b;

    public C2073i(Integer num, Integer num2) {
        this.f31388a = num;
        this.f31389b = num2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Object obj3;
        Object next;
        C2091i c12 = (C2091i) obj;
        C2091i c22 = (C2091i) obj2;
        AbstractC3340k.e(c12, "c1");
        AbstractC3340k.e(c22, "c2");
        kotlin.jvm.internal.E e7 = new kotlin.jvm.internal.E();
        kotlin.jvm.internal.E e10 = new kotlin.jvm.internal.E();
        F f10 = new F(e7, e10, 0);
        Integer num = this.f31388a;
        Integer num2 = this.f31389b;
        Integer num3 = c12.f31479a;
        Integer num4 = c12.f31480b;
        Double dE = G.e(num3, num4, num, num2);
        Integer num5 = c22.f31479a;
        Integer num6 = c22.f31480b;
        f10.invoke(G.c(dE, G.e(num5, num6, num, num2)));
        f10.invoke(G.c(G.j(num3, num4, num, num2), G.j(num5, num6, num, num2)));
        Iterator it = c12.f31484f.iterator();
        while (true) {
            obj3 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.I it2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.I) next;
            AbstractC3340k.e(it2, "it");
            if (it2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.H) {
                break;
            }
        }
        boolean z2 = next != null;
        Iterator it3 = c22.f31484f.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.I it4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.I) next2;
            AbstractC3340k.e(it4, "it");
            if (it4 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.H) {
                obj3 = next2;
                break;
            }
        }
        f10.invoke(new C2527k(Boolean.valueOf(z2), Boolean.valueOf(obj3 != null)));
        return AbstractC3340k.g(e10.f39738a, e7.f39738a);
    }
}
