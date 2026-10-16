package com.unity3d.services.core.domain.task;

import Ef.E;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import ef.C2515C;
import ef.C2530n;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEf/E;", "Lef/n;", "Lcom/unity3d/services/core/configuration/Configuration;", "<anonymous>", "(LEf/E;)Lef/n;"}, k = 3, mv = {1, 8, 0})
@InterfaceC3466e(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2", f = "InitializeStateConfigWithLoader.kt", l = {58, 101, 109}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class InitializeStateConfigWithLoader$doWork$2 extends AbstractC3471j implements p {
    final /* synthetic */ InitializeStateConfigWithLoader.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfigWithLoader$doWork$2(InitializeStateConfigWithLoader initializeStateConfigWithLoader, InitializeStateConfigWithLoader.Params params, InterfaceC3103c<? super InitializeStateConfigWithLoader$doWork$2> interfaceC3103c) {
        super(2, interfaceC3103c);
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
        InitializeStateConfigWithLoader$doWork$2 initializeStateConfigWithLoader$doWork$2 = new InitializeStateConfigWithLoader$doWork$2(this.this$0, this.$params, interfaceC3103c);
        initializeStateConfigWithLoader$doWork$2.L$0 = obj;
        return initializeStateConfigWithLoader$doWork$2;
    }

    @Override // tf.p
    @Nullable
    public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2530n> interfaceC3103c) {
        return ((InitializeStateConfigWithLoader$doWork$2) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0158 A[Catch: all -> 0x0022, CancellationException -> 0x0025, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x0025, all -> 0x0022, blocks: (B:8:0x001d, B:56:0x01c5, B:62:0x01f6, B:50:0x0196, B:52:0x019a, B:57:0x01cf, B:58:0x01e1, B:49:0x0191, B:37:0x0154, B:39:0x0158, B:59:0x01e2, B:60:0x01ef, B:61:0x01f0, B:36:0x014f, B:27:0x0082), top: B:82:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019a A[Catch: all -> 0x0022, CancellationException -> 0x0025, TryCatch #6 {CancellationException -> 0x0025, all -> 0x0022, blocks: (B:8:0x001d, B:56:0x01c5, B:62:0x01f6, B:50:0x0196, B:52:0x019a, B:57:0x01cf, B:58:0x01e1, B:49:0x0191, B:37:0x0154, B:39:0x0158, B:59:0x01e2, B:60:0x01ef, B:61:0x01f0, B:36:0x014f, B:27:0x0082), top: B:82:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01cf A[Catch: all -> 0x0022, CancellationException -> 0x0025, TryCatch #6 {CancellationException -> 0x0025, all -> 0x0022, blocks: (B:8:0x001d, B:56:0x01c5, B:62:0x01f6, B:50:0x0196, B:52:0x019a, B:57:0x01cf, B:58:0x01e1, B:49:0x0191, B:37:0x0154, B:39:0x0158, B:59:0x01e2, B:60:0x01ef, B:61:0x01f0, B:36:0x014f, B:27:0x0082), top: B:82:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f0 A[Catch: all -> 0x0022, CancellationException -> 0x0025, TryCatch #6 {CancellationException -> 0x0025, all -> 0x0022, blocks: (B:8:0x001d, B:56:0x01c5, B:62:0x01f6, B:50:0x0196, B:52:0x019a, B:57:0x01cf, B:58:0x01e1, B:49:0x0191, B:37:0x0154, B:39:0x0158, B:59:0x01e2, B:60:0x01ef, B:61:0x01f0, B:36:0x014f, B:27:0x0082), top: B:82:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0204  */
    @Override // lf.AbstractC3462a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
