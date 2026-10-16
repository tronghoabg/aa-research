package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import ef.C2530n;
import jf.InterfaceC3103c;
import kf.a;
import kotlin.Metadata;
import lf.AbstractC3464c;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@InterfaceC3466e(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader", f = "InitializeStateConfigWithLoader.kt", l = {33}, m = "doWork-gIAlu-s")
/* loaded from: classes5.dex */
public final class InitializeStateConfigWithLoader$doWork$1 extends AbstractC3464c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfigWithLoader$doWork$1(InitializeStateConfigWithLoader initializeStateConfigWithLoader, InterfaceC3103c<? super InitializeStateConfigWithLoader$doWork$1> interfaceC3103c) {
        super(interfaceC3103c);
        this.this$0 = initializeStateConfigWithLoader;
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM291doWorkgIAlus = this.this$0.m291doWorkgIAlus((InitializeStateConfigWithLoader.Params) null, (InterfaceC3103c<? super C2530n>) this);
        return objM291doWorkgIAlus == a.f39711a ? objM291doWorkgIAlus : new C2530n(objM291doWorkgIAlus);
    }
}
