package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import N.C0740o;
import android.content.res.Resources;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.L0;
import d0.C2384c;
import ef.C2515C;
import java.util.List;
import r7.AbstractC3935e;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C2042c implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30862b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30863c;

    public /* synthetic */ C2042c(int i5, Object obj, Object obj2) {
        this.f30861a = i5;
        this.f30862b = obj;
        this.f30863c = obj2;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30861a) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC3935e.e((Z.k) this.f30862b, (tf.l) this.f30863c, (C0740o) obj, 1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.moloco.sdk.internal.publisher.H.N((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r) this.f30863c, (Z.k) this.f30862b, (C0740o) obj, 1);
                break;
            case 2:
                C2384c c2384c = (C2384c) obj;
                long j8 = c2384c.f33935a;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(Fe.e.c((int) C2384c.b(j8)), Fe.e.c((int) C2384c.c(j8)));
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i iVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i) this.f30862b;
                iVar.f31692i = gVar;
                tf.a aVar = (tf.a) this.f30863c;
                if (aVar != null) {
                    aVar.invoke();
                } else {
                    long j10 = c2384c.f33935a;
                    com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(Fe.e.c((int) C2384c.b(j10)), Fe.e.c((int) C2384c.c(j10)));
                    String str = iVar.f31684a.f31668d;
                    if (str != null) {
                        iVar.f31693j.c(gVar2);
                        iVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a.f31672a);
                        iVar.f31689f.a(str);
                    }
                }
                break;
            case 3:
                C2384c c2384c2 = (C2384c) obj;
                tf.a aVar2 = (tf.a) this.f30862b;
                if (aVar2 != null) {
                    aVar2.invoke();
                } else {
                    long j11 = c2384c2.f33935a;
                    com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar3 = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(((int) C2384c.b(j11)) / Resources.getSystem().getDisplayMetrics().density, ((int) C2384c.c(j11)) / Resources.getSystem().getDisplayMetrics().density);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c) this.f30863c;
                    String str2 = cVar.f31969a.f32368b;
                    if (str2 != null) {
                        C6.l lVar = cVar.f31973e;
                        lVar.getClass();
                        List list = (List) lVar.f1845b;
                        if (list != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.G.h((L0) lVar.f1849f, list, ((s) lVar.f1848e).b(), (com.moloco.sdk.internal.services.events.c) lVar.f1844a, gVar3);
                            lVar.f1845b = null;
                        }
                        cVar.f31970b.a(str2);
                        Ef.H.D(cVar.f31971c, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b(cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a.f31964b, null), 3);
                    }
                }
                break;
            default:
                C2384c c2384c3 = (C2384c) obj;
                tf.a aVar3 = (tf.a) this.f30862b;
                if (aVar3 != null) {
                    aVar3.invoke();
                } else {
                    long j12 = c2384c3.f33935a;
                    ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h) this.f30863c).b(true, new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(((int) C2384c.b(j12)) / Resources.getSystem().getDisplayMetrics().density, ((int) C2384c.c(j12)) / Resources.getSystem().getDisplayMetrics().density));
                }
                break;
        }
        return C2515C.f34653a;
    }

    public /* synthetic */ C2042c(Z.k kVar, tf.l lVar, int i5) {
        this.f30861a = 0;
        this.f30862b = kVar;
        this.f30863c = lVar;
    }

    public /* synthetic */ C2042c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r rVar, Z.k kVar, int i5) {
        this.f30861a = 1;
        this.f30863c = rVar;
        this.f30862b = kVar;
    }
}
