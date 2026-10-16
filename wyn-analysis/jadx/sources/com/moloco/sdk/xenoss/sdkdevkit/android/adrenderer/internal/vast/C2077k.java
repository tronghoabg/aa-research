package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import N.C0740o;
import ef.C2515C;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2077k implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31412a;

    public /* synthetic */ C2077k(int i5) {
        this.f31412a = i5;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31412a) {
            case 0:
                C0740o c0740o = (C0740o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0740o.x()) {
                    c0740o.I();
                }
                break;
            default:
                C0740o c0740o2 = (C0740o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0740o2.x()) {
                    c0740o2.I();
                }
                break;
        }
        return C2515C.f34653a;
    }
}
