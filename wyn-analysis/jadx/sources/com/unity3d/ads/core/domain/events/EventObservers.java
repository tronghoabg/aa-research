package com.unity3d.ads.core.domain.events;

import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\nH\u0086Bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/domain/events/EventObservers;", "", "Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;", "operativeEventObserver", "Lcom/unity3d/ads/core/domain/events/DiagnosticEventObserver;", "diagnosticEventObserver", "Lcom/unity3d/ads/core/domain/events/TransactionEventObserver;", "transactionEventObserver", "<init>", "(Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;Lcom/unity3d/ads/core/domain/events/DiagnosticEventObserver;Lcom/unity3d/ads/core/domain/events/TransactionEventObserver;)V", "Lef/C;", "invoke", "(Ljf/c;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;", "getOperativeEventObserver", "()Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;", "Lcom/unity3d/ads/core/domain/events/DiagnosticEventObserver;", "getDiagnosticEventObserver", "()Lcom/unity3d/ads/core/domain/events/DiagnosticEventObserver;", "Lcom/unity3d/ads/core/domain/events/TransactionEventObserver;", "getTransactionEventObserver", "()Lcom/unity3d/ads/core/domain/events/TransactionEventObserver;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EventObservers {

    @NotNull
    private final DiagnosticEventObserver diagnosticEventObserver;

    @NotNull
    private final OperativeEventObserver operativeEventObserver;

    @NotNull
    private final TransactionEventObserver transactionEventObserver;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.core.domain.events.EventObservers", f = "EventObservers.kt", l = {14, 15}, m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.events.EventObservers$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3464c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC3103c<? super AnonymousClass1> interfaceC3103c) {
            super(interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventObservers.this.invoke(this);
        }
    }

    public EventObservers(@NotNull OperativeEventObserver operativeEventObserver, @NotNull DiagnosticEventObserver diagnosticEventObserver, @NotNull TransactionEventObserver transactionEventObserver) {
        AbstractC3340k.e(operativeEventObserver, "operativeEventObserver");
        AbstractC3340k.e(diagnosticEventObserver, "diagnosticEventObserver");
        AbstractC3340k.e(transactionEventObserver, "transactionEventObserver");
        this.operativeEventObserver = operativeEventObserver;
        this.diagnosticEventObserver = diagnosticEventObserver;
        this.transactionEventObserver = transactionEventObserver;
    }

    @NotNull
    public final DiagnosticEventObserver getDiagnosticEventObserver() {
        return this.diagnosticEventObserver;
    }

    @NotNull
    public final OperativeEventObserver getOperativeEventObserver() {
        return this.operativeEventObserver;
    }

    @NotNull
    public final TransactionEventObserver getTransactionEventObserver() {
        return this.transactionEventObserver;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super ef.C2515C> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.domain.events.EventObservers.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.domain.events.EventObservers$invoke$1 r0 = (com.unity3d.ads.core.domain.events.EventObservers.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.events.EventObservers$invoke$1 r0 = new com.unity3d.ads.core.domain.events.EventObservers$invoke$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kf.a r1 = kf.a.f39711a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.events.EventObservers r0 = (com.unity3d.ads.core.domain.events.EventObservers) r0
            Fe.e.U(r6)
            goto L5d
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.events.EventObservers r2 = (com.unity3d.ads.core.domain.events.EventObservers) r2
            Fe.e.U(r6)
            goto L4f
        L3e:
            Fe.e.U(r6)
            com.unity3d.ads.core.domain.events.OperativeEventObserver r6 = r5.operativeEventObserver
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L4e
            goto L5b
        L4e:
            r2 = r5
        L4f:
            com.unity3d.ads.core.domain.events.DiagnosticEventObserver r6 = r2.diagnosticEventObserver
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            r0 = r2
        L5d:
            com.unity3d.ads.core.domain.events.TransactionEventObserver r6 = r0.transactionEventObserver
            r6.invoke()
            ef.C r6 = ef.C2515C.f34653a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.EventObservers.invoke(jf.c):java.lang.Object");
    }
}
