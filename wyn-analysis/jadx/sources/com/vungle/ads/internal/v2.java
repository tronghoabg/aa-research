package com.vungle.ads.internal;

import com.vungle.ads.InitializationListener;
import ef.C2515C;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class v2 extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w2 f33881a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(w2 w2Var) {
        super(0);
        this.f33881a = w2Var;
    }

    @Override // tf.a
    public final Object invoke() {
        Iterator it = this.f33881a.f33886c.iterator();
        while (it.hasNext()) {
            ((InitializationListener) it.next()).onSuccess();
        }
        this.f33881a.f33886c.clear();
        return C2515C.f34653a;
    }
}
