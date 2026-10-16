package com.unity3d.ads.core.utils;

import Ef.A;
import Ef.E;
import Ef.H;
import Ef.I0;
import Ef.InterfaceC0501m0;
import Ef.InterfaceC0515v;
import Fe.e;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.a;
import tf.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/utils/CommonCoroutineTimer;", "Lcom/unity3d/ads/core/utils/CoroutineTimer;", "LEf/A;", "dispatcher", "<init>", "(LEf/A;)V", "", "delayStartMillis", "repeatMillis", "Lkotlin/Function0;", "Lef/C;", HandleInvocationsFromAdViewer.KEY_ACTION, "LEf/m0;", "start", "(JJLtf/a;)LEf/m0;", "LEf/A;", "LEf/v;", "job", "LEf/v;", "LEf/E;", "scope", "LEf/E;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CommonCoroutineTimer implements CoroutineTimer {

    @NotNull
    private final A dispatcher;

    @NotNull
    private final InterfaceC0515v job;

    @NotNull
    private final E scope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1", f = "CommonCoroutineTimer.kt", l = {21, 24}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3471j implements p {
        final /* synthetic */ a $action;
        final /* synthetic */ long $delayStartMillis;
        final /* synthetic */ long $repeatMillis;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j8, a aVar, long j10, InterfaceC3103c<? super AnonymousClass1> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$delayStartMillis = j8;
            this.$action = aVar;
            this.$repeatMillis = j10;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$delayStartMillis, this.$action, this.$repeatMillis, interfaceC3103c);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            E e7;
            kf.a aVar = kf.a.f39711a;
            int i5 = this.label;
            if (i5 == 0) {
                e.U(obj);
                e7 = (E) this.L$0;
                long j8 = this.$delayStartMillis;
                this.L$0 = e7;
                this.label = 1;
                if (H.m(j8, this) != aVar) {
                }
                return aVar;
            }
            if (i5 != 1 && i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e7 = (E) this.L$0;
            e.U(obj);
            while (H.y(e7)) {
                this.$action.invoke();
                long j10 = this.$repeatMillis;
                this.L$0 = e7;
                this.label = 2;
                if (H.m(j10, this) == aVar) {
                    return aVar;
                }
            }
            return C2515C.f34653a;
        }
    }

    public CommonCoroutineTimer(@NotNull A dispatcher) {
        AbstractC3340k.e(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        I0 i0F = H.f();
        this.job = i0F;
        this.scope = H.c(dispatcher.plus(i0F));
    }

    @Override // com.unity3d.ads.core.utils.CoroutineTimer
    @NotNull
    public InterfaceC0501m0 start(long delayStartMillis, long repeatMillis, @NotNull a action) {
        AbstractC3340k.e(action, "action");
        return H.D(this.scope, this.dispatcher, new AnonymousClass1(delayStartMillis, action, repeatMillis, null), 2);
    }
}
