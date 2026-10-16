package com.vungle.ads.internal.presenter;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class e extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f33518a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r rVar) {
        super(0);
        this.f33518a = rVar;
    }

    @Override // tf.a
    public final Object invoke() {
        com.vungle.ads.internal.ui.view.f fVar = this.f33518a.f33540a.f33789e;
        if (fVar != null) {
            fVar.close();
        }
        return C2515C.f34653a;
    }
}
