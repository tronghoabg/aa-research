package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import ef.C2515C;
import ef.C2530n;
import kd.C3300K;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final /* synthetic */ class f implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tf.l f30899b;

    public /* synthetic */ f(tf.l lVar, int i5) {
        this.f30898a = i5;
        this.f30899b = lVar;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f30898a) {
            case 0:
                j outcome = (j) obj;
                AbstractC3340k.e(outcome, "outcome");
                this.f30899b.invoke(outcome);
                break;
            default:
                this.f30899b.invoke(new C3300K(((C2530n) obj).f34674a));
                break;
        }
        return C2515C.f34653a;
    }
}
