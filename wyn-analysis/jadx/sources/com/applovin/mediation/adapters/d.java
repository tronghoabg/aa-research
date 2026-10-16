package com.applovin.mediation.adapters;

import N.C0740o;
import Z.k;
import android.app.Activity;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.B;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.G;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v;
import ef.C2515C;
import ef.InterfaceC2521e;
import tf.p;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24065b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24066c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24068e;

    public /* synthetic */ d(MolocoMediationAdapter molocoMediationAdapter, MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener, MaxAdapterResponseParameters maxAdapterResponseParameters) {
        this.f24064a = 0;
        this.f24065b = molocoMediationAdapter;
        this.f24067d = maxAdFormat;
        this.f24068e = maxAdViewAdapterListener;
        this.f24066c = maxAdapterResponseParameters;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24064a) {
            case 0:
                MolocoMediationAdapter molocoMediationAdapter = (MolocoMediationAdapter) this.f24065b;
                MaxAdFormat maxAdFormat = (MaxAdFormat) this.f24067d;
                MaxAdapterResponseParameters maxAdapterResponseParameters = (MaxAdapterResponseParameters) this.f24066c;
                break;
            case 1:
                MolocoMediationAdapter molocoMediationAdapter2 = (MolocoMediationAdapter) this.f24065b;
                MaxAdapterResponseParameters maxAdapterResponseParameters2 = (MaxAdapterResponseParameters) this.f24066c;
                Activity activity = (Activity) this.f24068e;
                break;
            case 2:
                ((Integer) obj2).getClass();
                tf.a aVar = (tf.a) this.f24068e;
                F0 f02 = (F0) this.f24066c;
                B.a((k) this.f24065b, (String) this.f24067d, aVar, f02, (C0740o) obj, 385);
                break;
            case 3:
                ((Integer) obj2).getClass();
                G.f((Activity) this.f24065b, (q) this.f24067d, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.G) this.f24068e, (v) this.f24066c, (C0740o) obj, 1);
                break;
            default:
                ((Integer) obj2).getClass();
                tf.a aVar2 = (tf.a) this.f24068e;
                k kVar = (k) this.f24066c;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.B.a((s) this.f24065b, (tf.a) this.f24067d, aVar2, kVar, (C0740o) obj, 1);
                break;
        }
        return C2515C.f34653a;
    }

    public /* synthetic */ d(MolocoMediationAdapter molocoMediationAdapter, MaxNativeAdAdapterListener maxNativeAdAdapterListener, MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        this.f24064a = 1;
        this.f24065b = molocoMediationAdapter;
        this.f24067d = maxNativeAdAdapterListener;
        this.f24066c = maxAdapterResponseParameters;
        this.f24068e = activity;
    }

    public /* synthetic */ d(Object obj, Object obj2, InterfaceC2521e interfaceC2521e, Object obj3, int i5, int i10) {
        this.f24064a = i10;
        this.f24065b = obj;
        this.f24067d = obj2;
        this.f24068e = interfaceC2521e;
        this.f24066c = obj3;
    }
}
