package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import N.V;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z;
import ef.C2515C;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30982a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V f30983b;

    public /* synthetic */ d(V v2, int i5) {
        this.f30982a = i5;
        this.f30983b = v2;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f30982a) {
            case 0:
                this.f30983b.setValue(new L0.h(((L0.h) obj).f6805a));
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                this.f30983b.setValue(new z(bool));
                break;
        }
        return C2515C.f34653a;
    }
}
