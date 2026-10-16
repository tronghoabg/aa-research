package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.BaseParams;
import com.unity3d.services.core.domain.task.BaseTask;
import ef.C2530n;
import jf.InterfaceC3103c;
import kf.a;
import kotlin.Metadata;
import lf.AbstractC3464c;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@InterfaceC3466e(c = "com.unity3d.services.core.domain.task.BaseTask$DefaultImpls", f = "BaseTask.kt", l = {11}, m = "invoke-gIAlu-s")
/* loaded from: classes5.dex */
public final class BaseTask$invoke$1<P extends BaseParams, R> extends AbstractC3464c {
    int label;
    /* synthetic */ Object result;

    public BaseTask$invoke$1(InterfaceC3103c<? super BaseTask$invoke$1> interfaceC3103c) {
        super(interfaceC3103c);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM284invokegIAlus = BaseTask.DefaultImpls.m284invokegIAlus(null, null, this);
        return objM284invokegIAlus == a.f39711a ? objM284invokegIAlus : new C2530n(objM284invokegIAlus);
    }
}
