package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import N.C0740o;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2043d implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z.k f30864a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tf.l f30865b;

    public C2043d(Z.k kVar, tf.l lVar) {
        this.f30864a = kVar;
        this.f30865b = lVar;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Z.k trackableModifier = (Z.k) obj;
        C0740o c0740o = (C0740o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC3340k.e(trackableModifier, "trackableModifier");
        if ((iIntValue & 6) == 0) {
            iIntValue |= c0740o.e(trackableModifier) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && c0740o.x()) {
            c0740o.I();
        } else {
            AbstractC3935e.e(this.f30864a.g(trackableModifier), this.f30865b, c0740o, 0);
        }
        return C2515C.f34653a;
    }
}
