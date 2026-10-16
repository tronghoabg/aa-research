package com.vungle.ads.internal.signals;

import com.moloco.sdk.internal.publisher.H;
import com.vungle.ads.internal.model.r3;
import java.util.List;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.KTypeProjection;

/* loaded from: classes5.dex */
public final class d extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f33651a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar) {
        super(0);
        this.f33651a = jVar;
    }

    @Override // tf.a
    public final Object invoke() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("unclosedad: ");
        Xf.c cVar = this.f33651a.f33658b;
        sbA.append(cVar.b(H.n0(cVar.f16253b, kotlin.jvm.internal.H.c(List.class, KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.H.b(r3.class)))), this.f33651a.b().c()));
        return sbA.toString();
    }
}
