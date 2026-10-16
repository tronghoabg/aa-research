package com.unity3d.ads.core.domain;

import Ef.E;
import Fe.e;
import Gf.s;
import Gf.t;
import android.app.Activity;
import com.unity3d.ads.core.domain.LifecycleEvent;
import ef.C2515C;
import java.lang.ref.WeakReference;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
@InterfaceC3466e(c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1", f = "AndroidGetLifecycleFlow.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1 extends AbstractC3471j implements p {
    final /* synthetic */ t $$this$channelFlow;
    final /* synthetic */ Activity $activity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1(t tVar, Activity activity, InterfaceC3103c<? super AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1> interfaceC3103c) {
        super(2, interfaceC3103c);
        this.$$this$channelFlow = tVar;
        this.$activity = activity;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
        return new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1(this.$$this$channelFlow, this.$activity, interfaceC3103c);
    }

    @Override // tf.p
    @Nullable
    public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
        return ((AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.label;
        if (i5 == 0) {
            e.U(obj);
            t tVar = this.$$this$channelFlow;
            LifecycleEvent.Resumed resumed = new LifecycleEvent.Resumed(new WeakReference(this.$activity));
            this.label = 1;
            if (((s) tVar).f4839d.i(resumed, this) == aVar) {
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
