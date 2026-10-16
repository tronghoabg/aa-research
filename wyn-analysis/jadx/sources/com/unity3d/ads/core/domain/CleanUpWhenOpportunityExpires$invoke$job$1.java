package com.unity3d.ads.core.domain;

import Ef.E;
import com.unity3d.ads.core.data.model.AdObject;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
@InterfaceC3466e(c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1", f = "CleanUpWhenOpportunityExpires.kt", l = {35, 36, 41}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class CleanUpWhenOpportunityExpires$invoke$job$1 extends AbstractC3471j implements p {
    final /* synthetic */ AdObject $adObject;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1", f = "CleanUpWhenOpportunityExpires.kt", l = {43}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3471j implements p {
        final /* synthetic */ AdObject $adObject;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdObject adObject, InterfaceC3103c<? super AnonymousClass1> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$adObject = adObject;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return new AnonymousClass1(this.$adObject, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
        @Override // lf.AbstractC3462a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                kf.a r0 = kf.a.f39711a
                int r1 = r5.label
                ef.C r2 = ef.C2515C.f34653a
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L18
                if (r1 != r4) goto L10
                Fe.e.U(r6)
                goto L39
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                Fe.e.U(r6)
                com.unity3d.ads.core.data.model.AdObject r6 = r5.$adObject
                Hf.c0 r6 = r6.getState()
                com.unity3d.ads.core.data.model.AdObjectState r1 = com.unity3d.ads.core.data.model.AdObjectState.EXPIRED
                Hf.x0 r6 = (Hf.x0) r6
                r6.j(r1)
                com.unity3d.ads.core.data.model.AdObject r6 = r5.$adObject
                com.unity3d.ads.adplayer.AdPlayer r6 = r6.getAdPlayer()
                if (r6 == 0) goto L3b
                r5.label = r4
                java.lang.Object r6 = r6.destroy(r5)
                if (r6 != r0) goto L39
                return r0
            L39:
                r6 = r2
                goto L3c
            L3b:
                r6 = r3
            L3c:
                if (r6 != 0) goto L47
                com.unity3d.ads.core.data.model.AdObject r6 = r5.$adObject
                Ef.E r6 = r6.getAdScope()
                Ef.H.j(r6, r3)
            L47:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CleanUpWhenOpportunityExpires$invoke$job$1(AdObject adObject, InterfaceC3103c<? super CleanUpWhenOpportunityExpires$invoke$job$1> interfaceC3103c) {
        super(2, interfaceC3103c);
        this.$adObject = adObject;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
        return new CleanUpWhenOpportunityExpires$invoke$job$1(this.$adObject, interfaceC3103c);
    }

    @Override // tf.p
    @Nullable
    public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
        return ((CleanUpWhenOpportunityExpires$invoke$job$1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r7 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (Ef.H.P(r7, r1, r6) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    @Override // lf.AbstractC3462a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
        /*
            r6 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r6.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            Fe.e.U(r7)
            goto L7e
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            Fe.e.U(r7)
            goto L5b
        L1f:
            Fe.e.U(r7)
            goto L4e
        L23:
            Fe.e.U(r7)
            com.unity3d.ads.core.data.model.AdObject r7 = r6.$adObject
            Hf.c0 r7 = r7.getTtl()
            Hf.x0 r7 = (Hf.x0) r7
            java.lang.Object r7 = r7.getValue()
            Cf.a r7 = (Cf.a) r7
            if (r7 == 0) goto L39
            long r4 = r7.f2204a
            goto L52
        L39:
            com.unity3d.ads.core.data.model.AdObject r7 = r6.$adObject
            Hf.c0 r7 = r7.getTtl()
            Hf.A r1 = new Hf.A
            r5 = 1
            r1.<init>(r7, r5)
            r6.label = r4
            java.lang.Object r7 = Hf.k0.o(r1, r6)
            if (r7 != r0) goto L4e
            goto L7d
        L4e:
            Cf.a r7 = (Cf.a) r7
            long r4 = r7.f2204a
        L52:
            r6.label = r3
            java.lang.Object r7 = Ef.H.n(r4, r6)
            if (r7 != r0) goto L5b
            goto L7d
        L5b:
            com.unity3d.ads.core.data.model.AdObject r7 = r6.$adObject
            Hf.c0 r7 = r7.getState()
            Hf.x0 r7 = (Hf.x0) r7
            java.lang.Object r7 = r7.getValue()
            com.unity3d.ads.core.data.model.AdObjectState r1 = com.unity3d.ads.core.data.model.AdObjectState.SHOWING
            if (r7 == r1) goto L7e
            Ef.D0 r7 = Ef.D0.f3661a
            com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1 r1 = new com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1
            com.unity3d.ads.core.data.model.AdObject r3 = r6.$adObject
            r4 = 0
            r1.<init>(r3, r4)
            r6.label = r2
            java.lang.Object r7 = Ef.H.P(r7, r1, r6)
            if (r7 != r0) goto L7e
        L7d:
            return r0
        L7e:
            ef.C r7 = ef.C2515C.f34653a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
