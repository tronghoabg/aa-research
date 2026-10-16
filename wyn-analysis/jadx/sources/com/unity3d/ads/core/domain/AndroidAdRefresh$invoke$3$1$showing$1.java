package com.unity3d.ads.core.domain;

import Ef.E;
import Fe.e;
import Hf.InterfaceC0592c0;
import Hf.k0;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.C3330a;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lcom/unity3d/ads/core/data/model/AdObjectState;", "<anonymous>", "(LEf/E;)Lcom/unity3d/ads/core/data/model/AdObjectState;"}, k = 3, mv = {1, 8, 0})
@InterfaceC3466e(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$showing$1", f = "AndroidAdRefresh.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AndroidAdRefresh$invoke$3$1$showing$1 extends AbstractC3471j implements p {
    final /* synthetic */ AdObject $adObject;
    int label;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$showing$1$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends C3330a implements p {
        public AnonymousClass1(Object obj) {
            super(2, obj, AdObjectState.class, "equals", "equals(Ljava/lang/Object;)Z", 4);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@Nullable Object obj, @NotNull InterfaceC3103c<? super Boolean> interfaceC3103c) {
            return AndroidAdRefresh$invoke$3$1$showing$1.invokeSuspend$equals((AdObjectState) this.receiver, obj, interfaceC3103c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$invoke$3$1$showing$1(AdObject adObject, InterfaceC3103c<? super AndroidAdRefresh$invoke$3$1$showing$1> interfaceC3103c) {
        super(2, interfaceC3103c);
        this.$adObject = adObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invokeSuspend$equals(AdObjectState adObjectState, Object obj, InterfaceC3103c interfaceC3103c) {
        return Boolean.valueOf(adObjectState.equals(obj));
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
        return new AndroidAdRefresh$invoke$3$1$showing$1(this.$adObject, interfaceC3103c);
    }

    @Override // tf.p
    @Nullable
    public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super AdObjectState> interfaceC3103c) {
        return ((AndroidAdRefresh$invoke$3$1$showing$1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            return obj;
        }
        e.U(obj);
        InterfaceC0592c0 state = this.$adObject.getState();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(AdObjectState.SHOWING);
        this.label = 1;
        Object objP = k0.p(state, anonymousClass1, this);
        return objP == aVar ? aVar : objP;
    }
}
