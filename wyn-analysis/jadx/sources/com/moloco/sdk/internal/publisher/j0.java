package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class j0 implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f29045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X2.j f29046b;

    public j0(l0 l0Var, X2.j jVar) {
        this.f29045a = l0Var;
        this.f29046b = jVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public final void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "FullscreenAdImpl", "Template ad skip button shown, triggering reward callback", null, false, 12, null);
        Af.q qVar = this.f29045a.f29075t;
        if (qVar != null) {
            qVar.invoke();
        }
        X2.j jVar = this.f29046b;
        if (jVar != null) {
            jVar.a();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public final void b() {
        X2.j jVar = this.f29046b;
        if (jVar != null) {
            jVar.V(MolocoAdKt.createAdInfo$default(this.f29045a.f29060d, null, null, 6, null));
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public final void e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
        AbstractC3340k.e(internalShowError, "internalShowError");
        l0 l0Var = this.f29045a;
        l0Var.b(com.moloco.sdk.internal.s.a(l0Var.f29060d, MolocoAdError.ErrorType.AD_SHOW_ERROR, internalShowError, ff.w.f35433a));
    }
}
