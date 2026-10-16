package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import N.C0732k;
import N.C0740o;
import U8.v0;
import com.moloco.sdk.internal.publisher.C1915d;
import e0.InterfaceC2442E;
import ef.C2515C;
import h0.AbstractC2765c;
import kotlin.jvm.internal.AbstractC3340k;
import z.C4599d;

/* loaded from: classes4.dex */
public final class M implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f31766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2765c f31767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC2765c f31768c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N.V f31769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tf.p f31770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tf.l f31771f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f31772g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f31773h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f31774i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f31775j;
    public final /* synthetic */ InterfaceC2442E k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f31776l;

    public M(boolean z2, AbstractC2765c abstractC2765c, AbstractC2765c abstractC2765c2, N.V v2, tf.p pVar, tf.l lVar, boolean z10, long j8, long j10, long j11, InterfaceC2442E interfaceC2442E, long j12) {
        this.f31766a = z2;
        this.f31767b = abstractC2765c;
        this.f31768c = abstractC2765c2;
        this.f31769d = v2;
        this.f31770e = pVar;
        this.f31771f = lVar;
        this.f31772g = z10;
        this.f31773h = j8;
        this.f31774i = j10;
        this.f31775j = j11;
        this.k = interfaceC2442E;
        this.f31776l = j12;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C4599d AnimatedVisibility = (C4599d) obj;
        C0740o c0740o = (C0740o) obj2;
        ((Number) obj3).intValue();
        AbstractC3340k.e(AnimatedVisibility, "$this$AnimatedVisibility");
        boolean z2 = this.f31766a;
        AbstractC2765c abstractC2765c = z2 ? this.f31767b : this.f31768c;
        Z.i iVar = Z.i.f16922a;
        N.V v2 = this.f31769d;
        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d savedStateButton = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) v2.getValue();
        c0740o.M(-133189899);
        boolean zE = c0740o.e(v2);
        tf.p pVar = this.f31770e;
        boolean zE2 = zE | c0740o.e(pVar) | c0740o.f(z2);
        Object objF = c0740o.F();
        N.P p10 = C0732k.f7800a;
        if (zE2 || objF == p10) {
            objF = new L(pVar, z2, v2, 0);
            c0740o.U(objF);
        }
        tf.l updateButtonState = (tf.l) objF;
        c0740o.p(false);
        AbstractC3340k.e(savedStateButton, "savedStateButton");
        AbstractC3340k.e(updateButtonState, "updateButtonState");
        Z.k kVarX = v0.X(iVar, new Ff.d(5, savedStateButton, updateButtonState));
        c0740o.M(-133182815);
        boolean zE3 = c0740o.e("mute_button");
        Object objF2 = c0740o.F();
        if (zE3 || objF2 == p10) {
            objF2 = new C1915d(19);
            c0740o.U(objF2);
        }
        c0740o.p(false);
        Z.k kVarJ = Fe.g.J(kVarX, false, (tf.l) objF2);
        c0740o.M(-133176485);
        tf.l lVar = this.f31771f;
        boolean zE4 = c0740o.e(lVar) | c0740o.f(z2) | c0740o.e(v2) | c0740o.e(pVar) | c0740o.e(null);
        Object objF3 = c0740o.F();
        if (zE4 || objF3 == p10) {
            objF3 = new C2122t(lVar, z2, pVar, v2);
            c0740o.U(objF3);
        }
        c0740o.p(false);
        Fe.b.a(abstractC2765c, (tf.a) objF3, kVarJ, this.f31772g, "mute/unmute", this.f31773h, this.f31774i, this.f31775j, this.k, this.f31776l, c0740o, 24576, 0);
        return C2515C.f34653a;
    }
}
