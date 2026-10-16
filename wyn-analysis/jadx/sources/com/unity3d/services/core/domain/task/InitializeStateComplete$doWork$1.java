package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateComplete;
import ef.C2530n;
import jf.InterfaceC3103c;
import kf.a;
import kotlin.Metadata;
import lf.AbstractC3464c;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@InterfaceC3466e(c = "com.unity3d.services.core.domain.task.InitializeStateComplete", f = "InitializeStateComplete.kt", l = {21}, m = "doWork-gIAlu-s")
/* loaded from: classes5.dex */
public final class InitializeStateComplete$doWork$1 extends AbstractC3464c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateComplete this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateComplete$doWork$1(InitializeStateComplete initializeStateComplete, InterfaceC3103c<? super InitializeStateComplete$doWork$1> interfaceC3103c) {
        super(interfaceC3103c);
        this.this$0 = initializeStateComplete;
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM289doWorkgIAlus = this.this$0.m289doWorkgIAlus((InitializeStateComplete.Params) null, (InterfaceC3103c<? super C2530n>) this);
        return objM289doWorkgIAlus == a.f39711a ? objM289doWorkgIAlus : new C2530n(objM289doWorkgIAlus);
    }
}
