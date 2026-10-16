package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import A.C0212e;
import N.C;
import N.V;
import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.InterfaceC1455t;
import androidx.lifecycle.InterfaceC1457v;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1457v f30979b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0212e f30980c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ V f30981d;

    public /* synthetic */ c(InterfaceC1457v interfaceC1457v, C0212e c0212e, V v2, int i5) {
        this.f30978a = i5;
        this.f30979b = interfaceC1457v;
        this.f30980c = c0212e;
        this.f30981d = v2;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        C DisposableEffect = (C) obj;
        switch (this.f30978a) {
            case 0:
                AbstractC3340k.e(DisposableEffect, "$this$DisposableEffect");
                final V v2 = this.f30981d;
                final C0212e c0212e = this.f30980c;
                final int i5 = 0;
                InterfaceC1455t interfaceC1455t = new InterfaceC1455t() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.g
                    @Override // androidx.lifecycle.InterfaceC1455t
                    public final void onStateChanged(InterfaceC1457v interfaceC1457v, EnumC1449m enumC1449m) {
                        switch (i5) {
                            case 0:
                                int i10 = j.f31012a[enumC1449m.ordinal()];
                                V v10 = v2;
                                if (i10 == 1) {
                                    v10.setValue(Boolean.FALSE);
                                    break;
                                } else if (i10 == 2 && ((Number) c0212e.d()).floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    v10.setValue(Boolean.TRUE);
                                    break;
                                }
                                break;
                            default:
                                int i11 = o.f31037a[enumC1449m.ordinal()];
                                V v11 = v2;
                                if (i11 == 1) {
                                    v11.setValue(Boolean.FALSE);
                                    break;
                                } else if (i11 == 2 && ((Number) c0212e.d()).floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    v11.setValue(Boolean.TRUE);
                                    break;
                                }
                                break;
                        }
                    }
                };
                InterfaceC1457v interfaceC1457v = this.f30979b;
                interfaceC1457v.getLifecycle().a(interfaceC1455t);
                return new A.V(5, interfaceC1457v, interfaceC1455t);
            default:
                AbstractC3340k.e(DisposableEffect, "$this$DisposableEffect");
                final V v10 = this.f30981d;
                final C0212e c0212e2 = this.f30980c;
                final int i10 = 1;
                InterfaceC1455t interfaceC1455t2 = new InterfaceC1455t() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.g
                    @Override // androidx.lifecycle.InterfaceC1455t
                    public final void onStateChanged(InterfaceC1457v interfaceC1457v2, EnumC1449m enumC1449m) {
                        switch (i10) {
                            case 0:
                                int i102 = j.f31012a[enumC1449m.ordinal()];
                                V v102 = v10;
                                if (i102 == 1) {
                                    v102.setValue(Boolean.FALSE);
                                    break;
                                } else if (i102 == 2 && ((Number) c0212e2.d()).floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    v102.setValue(Boolean.TRUE);
                                    break;
                                }
                                break;
                            default:
                                int i11 = o.f31037a[enumC1449m.ordinal()];
                                V v11 = v10;
                                if (i11 == 1) {
                                    v11.setValue(Boolean.FALSE);
                                    break;
                                } else if (i11 == 2 && ((Number) c0212e2.d()).floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    v11.setValue(Boolean.TRUE);
                                    break;
                                }
                                break;
                        }
                    }
                };
                InterfaceC1457v interfaceC1457v2 = this.f30979b;
                interfaceC1457v2.getLifecycle().a(interfaceC1455t2);
                return new A.V(6, interfaceC1457v2, interfaceC1455t2);
        }
    }
}
