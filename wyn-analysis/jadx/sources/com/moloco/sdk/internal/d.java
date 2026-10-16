package com.moloco.sdk.internal;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.C2097a;
import kotlin.jvm.internal.AbstractC3339j;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.C3338i;

/* loaded from: classes4.dex */
public final /* synthetic */ class d extends C3338i implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f28502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G0 f28503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f28504c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, G0 g02, Context context) {
        super(1, AbstractC3339j.class, "createVastController", "createNativeAd$createVastController(Lcom/moloco/sdk/internal/AdFactoryImpl;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ExternalLinkHandler;Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/Ad;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/AdController;", 0);
        this.f28502a = eVar;
        this.f28503b = g02;
        this.f28504c = context;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        C2097a p02 = (C2097a) obj;
        AbstractC3340k.e(p02, "p0");
        com.moloco.sdk.internal.services.events.c cVar = this.f28502a.f28506b;
        G0 g02 = this.f28503b;
        a2.v vVar = new a2.v(g02);
        return android.support.v4.media.session.b.G(p02, g02, this.f28504c, cVar, true, Boolean.FALSE, 0, 0, 0, false, false, vVar);
    }
}
