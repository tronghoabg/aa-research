package com.vungle.ads.internal;

import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleError;
import ef.C2515C;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class u2 extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w2 f33715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VungleError f33716b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(w2 w2Var, VungleError vungleError) {
        super(0);
        this.f33715a = w2Var;
        this.f33716b = vungleError;
    }

    @Override // tf.a
    public final Object invoke() {
        boolean z2 = com.vungle.ads.internal.util.u.f33874a;
        com.vungle.ads.internal.util.t.b("VungleInitializer", "onError");
        CopyOnWriteArrayList copyOnWriteArrayList = this.f33715a.f33886c;
        VungleError vungleError = this.f33716b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((InitializationListener) it.next()).onError(vungleError);
        }
        this.f33715a.f33886c.clear();
        return C2515C.f34653a;
    }
}
