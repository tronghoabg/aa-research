package com.unity3d.services.core.domain.task;

import ef.C2530n;
import jf.InterfaceC3103c;
import kf.a;
import kotlin.Metadata;
import lf.AbstractC3464c;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@InterfaceC3466e(c = "com.unity3d.services.core.domain.task.InitializeSDK", f = "InitializeSDK.kt", l = {120}, m = "executeErrorState-BWLJW6A")
/* loaded from: classes5.dex */
public final class InitializeSDK$executeErrorState$1 extends AbstractC3464c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$executeErrorState$1(InitializeSDK initializeSDK, InterfaceC3103c<? super InitializeSDK$executeErrorState$1> interfaceC3103c) {
        super(interfaceC3103c);
        this.this$0 = initializeSDK;
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM287executeErrorStateBWLJW6A = this.this$0.m287executeErrorStateBWLJW6A(null, null, null, this);
        return objM287executeErrorStateBWLJW6A == a.f39711a ? objM287executeErrorStateBWLJW6A : new C2530n(objM287executeErrorStateBWLJW6A);
    }
}
