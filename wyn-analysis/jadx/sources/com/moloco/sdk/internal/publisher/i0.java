package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C1903q;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class i0 implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f29042a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X2.j f29043b;

    public i0(l0 l0Var, X2.j jVar) {
        this.f29042a = l0Var;
        this.f29043b = jVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public final void a(boolean z2) {
        String str;
        l0 l0Var = this.f29042a;
        C1903q c1903q = l0Var.f29073r;
        if (c1903q != null && c1903q.f28855a && ((!z2 || c1903q.f28856b) && (str = c1903q.f28857c) != null)) {
            l0Var.f29061e.a(str);
        }
        Ff.d dVar = l0Var.f29074s;
        if (dVar != null) {
            dVar.invoke(Boolean.valueOf(z2));
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public final void b() {
        X2.j jVar = this.f29043b;
        if (jVar != null) {
            jVar.V(MolocoAdKt.createAdInfo$default(this.f29042a.f29060d, null, null, 6, null));
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public final void e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
        AbstractC3340k.e(internalShowError, "internalShowError");
        l0 l0Var = this.f29042a;
        l0Var.b(com.moloco.sdk.internal.s.a(l0Var.f29060d, MolocoAdError.ErrorType.AD_SHOW_ERROR, internalShowError, ff.w.f35433a));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public final void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "FullscreenAdImpl", "Ad skip button shown, triggering callback", null, false, 12, null);
        Af.q qVar = this.f29042a.f29075t;
        if (qVar != null) {
            qVar.invoke();
        }
        X2.j jVar = this.f29043b;
        if (jVar != null) {
            jVar.a();
        }
    }
}
