package com.moloco.sdk.internal.publisher;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final /* synthetic */ class I implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V f28918b;

    public /* synthetic */ I(V v2, int i5) {
        this.f28917a = i5;
        this.f28918b = v2;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f28917a) {
            case 0:
                ((Long) obj).longValue();
                return new Cf.a(this.f28918b.f28955i.a());
            default:
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d button = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj;
                AbstractC3340k.e(button, "button");
                this.f28918b.f28966u.a(button);
                return C2515C.f34653a;
        }
    }
}
