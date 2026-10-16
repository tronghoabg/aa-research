package com.moloco.sdk.publisher;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import lf.AbstractC3464c;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@InterfaceC3466e(c = "com.moloco.sdk.publisher.Moloco", f = "Moloco.kt", l = {PglCryptUtils.BASE64_FAILED, 508}, m = "clearState$moloco_sdk_release")
/* loaded from: classes4.dex */
public final class Moloco$clearState$1 extends AbstractC3464c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Moloco this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Moloco$clearState$1(Moloco moloco, InterfaceC3103c<? super Moloco$clearState$1> interfaceC3103c) {
        super(interfaceC3103c);
        this.this$0 = moloco;
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.clearState$moloco_sdk_release(this);
    }
}
