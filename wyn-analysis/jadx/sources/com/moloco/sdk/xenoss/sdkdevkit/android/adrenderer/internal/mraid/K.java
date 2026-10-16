package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import ef.C2515C;
import ef.C2527k;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class K extends AbstractC3471j implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30363a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f30364b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f30365c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i5, InterfaceC3103c interfaceC3103c, int i10) {
        super(i5, interfaceC3103c);
        this.f30363a = i10;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f30363a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                K k = new K(3, (InterfaceC3103c) obj3, 0);
                k.f30364b = zBooleanValue;
                k.f30365c = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj2;
                return k.invokeSuspend(C2515C.f34653a);
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                K k5 = new K(3, (InterfaceC3103c) obj3, 1);
                k5.f30364b = zBooleanValue2;
                k5.f30365c = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) obj2;
                return k5.invokeSuspend(C2515C.f34653a);
            case 2:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                K k10 = new K(3, (InterfaceC3103c) obj3, 2);
                k10.f30364b = zBooleanValue3;
                k10.f30365c = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.F) obj2;
                return k10.invokeSuspend(C2515C.f34653a);
            case 3:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                K k11 = new K(3, (InterfaceC3103c) obj3, 3);
                k11.f30364b = zBooleanValue4;
                k11.f30365c = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s) obj2;
                return k11.invokeSuspend(C2515C.f34653a);
            default:
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                K k12 = new K(3, (InterfaceC3103c) obj3, 4);
                k12.f30365c = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) obj;
                k12.f30364b = zBooleanValue5;
                return k12.invokeSuspend(C2515C.f34653a);
        }
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        switch (this.f30363a) {
            case 0:
                kf.a aVar = kf.a.f39711a;
                Fe.e.U(obj);
                boolean z2 = this.f30364b;
                return new C2527k(Boolean.valueOf(z2), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) this.f30365c);
            case 1:
                kf.a aVar2 = kf.a.f39711a;
                Fe.e.U(obj);
                boolean z10 = this.f30364b;
                return new C2527k(Boolean.valueOf(z10), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) this.f30365c);
            case 2:
                kf.a aVar3 = kf.a.f39711a;
                Fe.e.U(obj);
                boolean z11 = this.f30364b;
                return new C2527k(Boolean.valueOf(z11), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.F) this.f30365c);
            case 3:
                kf.a aVar4 = kf.a.f39711a;
                Fe.e.U(obj);
                boolean z12 = this.f30364b;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s sVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s) this.f30365c;
                if (z12) {
                    return sVar;
                }
                return null;
            default:
                kf.a aVar5 = kf.a.f39711a;
                Fe.e.U(obj);
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) this.f30365c, this.f30364b);
        }
    }
}
