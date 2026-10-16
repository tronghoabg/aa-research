package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.internal.model.i3;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class g1 extends b1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(Context context) {
        super(context);
        AbstractC3340k.e(context, "context");
    }

    @Override // com.vungle.ads.internal.s
    public final boolean a(i3 placement) {
        AbstractC3340k.e(placement, "placement");
        return placement.g() || placement.d();
    }
}
