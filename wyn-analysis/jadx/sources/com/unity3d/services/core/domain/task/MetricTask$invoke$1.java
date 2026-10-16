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
@InterfaceC3466e(c = "com.unity3d.services.core.domain.task.MetricTask", f = "MetricTask.kt", l = {24}, m = "invoke-gIAlu-s$suspendImpl")
/* loaded from: classes5.dex */
public final class MetricTask$invoke$1 extends AbstractC3464c {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MetricTask<P, R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MetricTask$invoke$1(MetricTask<? super P, R> metricTask, InterfaceC3103c<? super MetricTask$invoke$1> interfaceC3103c) {
        super(interfaceC3103c);
        this.this$0 = metricTask;
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM300invokegIAlus$suspendImpl = MetricTask.m300invokegIAlus$suspendImpl(this.this$0, null, this);
        return objM300invokegIAlus$suspendImpl == a.f39711a ? objM300invokegIAlus$suspendImpl : new C2530n(objM300invokegIAlus$suspendImpl);
    }
}
