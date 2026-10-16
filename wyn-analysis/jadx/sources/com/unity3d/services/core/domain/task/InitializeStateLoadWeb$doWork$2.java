package com.unity3d.services.core.domain.task;

import Ef.E;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import ef.C2515C;
import ef.C2530n;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEf/E;", "Lef/n;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$LoadWebResult;", "<anonymous>", "(LEf/E;)Lef/n;"}, k = 3, mv = {1, 8, 0})
@InterfaceC3466e(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2", f = "InitializeStateLoadWeb.kt", l = {46, 64, 71}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class InitializeStateLoadWeb$doWork$2 extends AbstractC3471j implements p {
    final /* synthetic */ InitializeStateLoadWeb.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadWeb$doWork$2(InitializeStateLoadWeb.Params params, InitializeStateLoadWeb initializeStateLoadWeb, InterfaceC3103c<? super InitializeStateLoadWeb$doWork$2> interfaceC3103c) {
        super(2, interfaceC3103c);
        this.$params = params;
        this.this$0 = initializeStateLoadWeb;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
        InitializeStateLoadWeb$doWork$2 initializeStateLoadWeb$doWork$2 = new InitializeStateLoadWeb$doWork$2(this.$params, this.this$0, interfaceC3103c);
        initializeStateLoadWeb$doWork$2.L$0 = obj;
        return initializeStateLoadWeb$doWork$2;
    }

    @Override // tf.p
    @Nullable
    public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2530n> interfaceC3103c) {
        return ((InitializeStateLoadWeb$doWork$2) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x015e, code lost:
    
        if (r1 == r8) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113 A[Catch: all -> 0x0047, TRY_ENTER, TryCatch #3 {all -> 0x0047, blocks: (B:17:0x003c, B:42:0x0132, B:39:0x0113), top: B:79:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0142 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #5 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:8:0x0018, B:50:0x0161, B:54:0x0185, B:56:0x018f, B:59:0x019a, B:60:0x01ac, B:62:0x01af, B:63:0x01bb, B:45:0x013e, B:47:0x0142, B:51:0x0165, B:52:0x0177, B:44:0x0139, B:37:0x010f, B:53:0x0178, B:36:0x010b, B:27:0x0072), top: B:79:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0165 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #5 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:8:0x0018, B:50:0x0161, B:54:0x0185, B:56:0x018f, B:59:0x019a, B:60:0x01ac, B:62:0x01af, B:63:0x01bb, B:45:0x013e, B:47:0x0142, B:51:0x0165, B:52:0x0177, B:44:0x0139, B:37:0x010f, B:53:0x0178, B:36:0x010b, B:27:0x0072), top: B:79:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0178 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #5 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:8:0x0018, B:50:0x0161, B:54:0x0185, B:56:0x018f, B:59:0x019a, B:60:0x01ac, B:62:0x01af, B:63:0x01bb, B:45:0x013e, B:47:0x0142, B:51:0x0165, B:52:0x0177, B:44:0x0139, B:37:0x010f, B:53:0x0178, B:36:0x010b, B:27:0x0072), top: B:79:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01af A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #5 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:8:0x0018, B:50:0x0161, B:54:0x0185, B:56:0x018f, B:59:0x019a, B:60:0x01ac, B:62:0x01af, B:63:0x01bb, B:45:0x013e, B:47:0x0142, B:51:0x0165, B:52:0x0177, B:44:0x0139, B:37:0x010f, B:53:0x0178, B:36:0x010b, B:27:0x0072), top: B:79:0x000c }] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.unity3d.services.core.network.model.HttpRequest] */
    /* JADX WARN: Type inference failed for: r1v26, types: [com.unity3d.services.core.network.model.HttpRequest] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    @Override // lf.AbstractC3462a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
