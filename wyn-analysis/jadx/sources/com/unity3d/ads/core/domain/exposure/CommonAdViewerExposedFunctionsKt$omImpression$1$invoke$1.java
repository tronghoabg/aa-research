package com.unity3d.ads.core.domain.exposure;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import lf.AbstractC3464c;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@InterfaceC3466e(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1", f = "CommonAdViewerExposedFunctions.kt", l = {TTAdConstant.LANDING_PAGE_TYPE_CODE}, m = "invoke")
/* loaded from: classes4.dex */
public final class CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 extends AbstractC3464c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonAdViewerExposedFunctionsKt.C23461 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1(CommonAdViewerExposedFunctionsKt.C23461 c23461, InterfaceC3103c<? super CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1> interfaceC3103c) {
        super(interfaceC3103c);
        this.this$0 = c23461;
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((Object[]) null, (InterfaceC3103c<? super C2515C>) this);
    }
}
