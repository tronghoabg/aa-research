package com.unity3d.services.ads.offerwall;

import Ef.E;
import Fe.e;
import Hf.InterfaceC0590b0;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
@InterfaceC3466e(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$3", f = "OfferwallAdapterBridge.kt", l = {114}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class OfferwallAdapterBridge$tapjoyPlacementListener$1$3 extends AbstractC3471j implements p {
    final /* synthetic */ String $placementName;
    int label;
    final /* synthetic */ OfferwallAdapterBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferwallAdapterBridge$tapjoyPlacementListener$1$3(OfferwallAdapterBridge offerwallAdapterBridge, String str, InterfaceC3103c<? super OfferwallAdapterBridge$tapjoyPlacementListener$1$3> interfaceC3103c) {
        super(2, interfaceC3103c);
        this.this$0 = offerwallAdapterBridge;
        this.$placementName = str;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
        return new OfferwallAdapterBridge$tapjoyPlacementListener$1$3(this.this$0, this.$placementName, interfaceC3103c);
    }

    @Override // tf.p
    @Nullable
    public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
        return ((OfferwallAdapterBridge$tapjoyPlacementListener$1$3) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.label;
        if (i5 == 0) {
            e.U(obj);
            InterfaceC0590b0 interfaceC0590b0 = this.this$0._offerwallEventFlow;
            OfferwallEvent offerwallEvent = OfferwallEvent.ON_CONTENT_READY;
            String str = this.$placementName;
            if (str == null) {
                str = "";
            }
            OfferwallEventData offerwallEventData = new OfferwallEventData(offerwallEvent, str, null, null, 12, null);
            this.label = 1;
            if (interfaceC0590b0.emit(offerwallEventData, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
        }
        return C2515C.f34653a;
    }
}
