package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import com.wynauto.wyn.R;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final /* synthetic */ class G implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f31732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tf.p f31733b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tf.p f31734c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tf.p f31735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tf.p f31736e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tf.p f31737f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2121s f31738g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ tf.p f31739h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ tf.p f31740i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ tf.p f31741j;
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f31742l;

    public /* synthetic */ G(long j8, tf.p pVar, tf.p pVar2, tf.p pVar3, tf.p pVar4, tf.p pVar5, C2121s c2121s, tf.p pVar6, tf.p pVar7, tf.p pVar8, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S s10, boolean z2) {
        this.f31732a = j8;
        this.f31733b = pVar;
        this.f31734c = pVar2;
        this.f31735d = pVar3;
        this.f31736e = pVar4;
        this.f31737f = pVar5;
        this.f31738g = c2121s;
        this.f31739h = pVar6;
        this.f31740i = pVar7;
        this.f31741j = pVar8;
        this.k = s10;
        this.f31742l = z2;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        Context context = (Context) obj;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y adViewModel = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y) obj2;
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(adViewModel, "adViewModel");
        u0.L l10 = new u0.L(context);
        l10.setId(R.id.moloco_fullscreen_ad_view_id);
        l10.setContent(new V.d(-1482604196, true, new S(adViewModel, this.f31732a, this.f31733b, this.f31734c, this.f31735d, this.f31736e, this.f31737f, this.f31738g, this.f31739h, this.f31740i, this.f31741j, this.k, this.f31742l, 1)));
        return l10;
    }
}
