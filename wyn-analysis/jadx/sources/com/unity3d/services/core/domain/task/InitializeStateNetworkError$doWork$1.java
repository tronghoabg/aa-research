package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import ef.C2530n;
import jf.InterfaceC3103c;
import kf.a;
import kotlin.Metadata;
import lf.AbstractC3464c;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@InterfaceC3466e(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError", f = "InitializeStateNetworkError.kt", l = {33}, m = "doWork-gIAlu-s")
/* loaded from: classes5.dex */
public final class InitializeStateNetworkError$doWork$1 extends AbstractC3464c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateNetworkError$doWork$1(InitializeStateNetworkError initializeStateNetworkError, InterfaceC3103c<? super InitializeStateNetworkError$doWork$1> interfaceC3103c) {
        super(interfaceC3103c);
        this.this$0 = initializeStateNetworkError;
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM297doWorkgIAlus = this.this$0.m297doWorkgIAlus((InitializeStateNetworkError.Params) null, (InterfaceC3103c<? super C2530n>) this);
        return objM297doWorkgIAlus == a.f39711a ? objM297doWorkgIAlus : new C2530n(objM297doWorkgIAlus);
    }
}
