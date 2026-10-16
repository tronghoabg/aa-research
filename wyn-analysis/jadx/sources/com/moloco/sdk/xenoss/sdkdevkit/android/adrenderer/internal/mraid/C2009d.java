package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import N.C0732k;
import N.C0740o;
import android.content.Intent;
import com.moloco.sdk.internal.publisher.C1915d;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KFunction;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2009d implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MraidActivity f30394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q f30395b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f30396c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.f f30397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tf.p f30398e;

    public C2009d(MraidActivity mraidActivity, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q qVar, t tVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.f fVar, tf.p pVar) {
        this.f30394a = mraidActivity;
        this.f30395b = qVar;
        this.f30396c = tVar;
        this.f30397d = fVar;
        this.f30398e = pVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C0740o c0740o = (C0740o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0740o.x()) {
            c0740o.I();
        } else {
            t tVar = this.f30396c;
            MraidActivity mraidActivity = this.f30394a;
            Intent intent = mraidActivity.getIntent();
            AbstractC3340k.d(intent, "getIntent(...)");
            int intExtra = intent.getIntExtra("CLOSE_DELAY_SECONDS", 0);
            c0740o.M(-674007660);
            Object objF = c0740o.F();
            Object obj3 = C0732k.f7800a;
            if (objF == obj3) {
                objF = new C1915d(6);
                c0740o.U(objF);
            }
            tf.l lVar = (tf.l) objF;
            c0740o.p(false);
            c0740o.M(-674005483);
            boolean zE = c0740o.e(tVar);
            Object objF2 = c0740o.F();
            if (zE || objF2 == obj3) {
                objF2 = new S8.d(0, tVar, t.class, "onSkipOrClose", "onSkipOrClose()V", 0, 10);
                c0740o.U(objF2);
            }
            c0740o.p(false);
            tf.a aVar = (tf.a) ((KFunction) objF2);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v vVar = AbstractC2012g.f30407g;
            tf.c cVar = (tf.c) this.f30398e.invoke(c0740o, 0);
            V.d dVarD = ic.d.d(null, null, 0L, 0L, 0L, null, null, c0740o, 255);
            c0740o.M(-673994329);
            Object objF3 = c0740o.F();
            if (objF3 == obj3) {
                objF3 = new com.moloco.sdk.service_locator.h(12);
                c0740o.U(objF3);
            }
            c0740o.p(false);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q qVar = this.f30395b;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.f fVar = this.f30397d;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.k.b(mraidActivity, qVar, tVar.f30449c, intExtra, lVar, aVar, fVar, vVar, cVar, dVarD, (tf.a) objF3, c0740o, 24576);
        }
        return C2515C.f34653a;
    }
}
