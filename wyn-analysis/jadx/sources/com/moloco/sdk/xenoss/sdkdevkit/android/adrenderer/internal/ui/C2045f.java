package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import E.C0427q;
import N.C0740o;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2045f implements tf.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z.k f30868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tf.l f30869b;

    public C2045f(Z.k kVar, tf.l lVar) {
        this.f30868a = kVar;
        this.f30869b = lVar;
    }

    @Override // tf.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        tf.l onButtonRendered = (tf.l) obj2;
        C0740o c0740o = (C0740o) obj3;
        int iIntValue = ((Number) obj4).intValue();
        AbstractC3340k.e((C0427q) obj, "<this>");
        AbstractC3340k.e(onButtonRendered, "onButtonRendered");
        if ((iIntValue & 48) == 0) {
            iIntValue |= c0740o.e(onButtonRendered) ? 32 : 16;
        }
        if ((iIntValue & 145) == 144 && c0740o.x()) {
            c0740o.I();
        } else {
            AbstractC3935e.h(onButtonRendered, this.f30868a, this.f30869b, c0740o, (iIntValue >> 3) & 14);
        }
        return C2515C.f34653a;
    }
}
