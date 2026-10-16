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
@InterfaceC3466e(c = "com.unity3d.services.core.domain.task.InitializeStateReset", f = "InitializeStateReset.kt", l = {33}, m = "doWork-gIAlu-s$suspendImpl")
/* loaded from: classes5.dex */
public final class InitializeStateReset$doWork$1 extends AbstractC3464c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$1(InitializeStateReset initializeStateReset, InterfaceC3103c<? super InitializeStateReset$doWork$1> interfaceC3103c) {
        super(interfaceC3103c);
        this.this$0 = initializeStateReset;
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM298doWorkgIAlus$suspendImpl = InitializeStateReset.m298doWorkgIAlus$suspendImpl(this.this$0, null, this);
        return objM298doWorkgIAlus$suspendImpl == a.f39711a ? objM298doWorkgIAlus$suspendImpl : new C2530n(objM298doWorkgIAlus$suspendImpl);
    }
}
