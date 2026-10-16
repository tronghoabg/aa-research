package com.unity3d.services;

import Ef.E;
import com.vungle.ads.internal.protos.Sdk;
import ef.C2515C;
import ef.InterfaceC2525i;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
@InterfaceC3466e(c = "com.unity3d.services.UnityAdsSDK$initialize$1$newInitializationJob$1", f = "UnityAdsSDK.kt", l = {Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 139}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UnityAdsSDK$initialize$1$newInitializationJob$1 extends AbstractC3471j implements p {
    final /* synthetic */ InterfaceC2525i $alternativeFlowReader$delegate;
    final /* synthetic */ String $gameId;
    final /* synthetic */ E $initScope;
    final /* synthetic */ InterfaceC2525i $initializeBoldSDK$delegate;
    final /* synthetic */ InterfaceC2525i $initializeSDK$delegate;
    final /* synthetic */ String $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$initialize$1$newInitializationJob$1(String str, String str2, E e7, InterfaceC2525i interfaceC2525i, InterfaceC2525i interfaceC2525i2, InterfaceC2525i interfaceC2525i3, InterfaceC3103c<? super UnityAdsSDK$initialize$1$newInitializationJob$1> interfaceC3103c) {
        super(2, interfaceC3103c);
        this.$source = str;
        this.$gameId = str2;
        this.$initScope = e7;
        this.$alternativeFlowReader$delegate = interfaceC2525i;
        this.$initializeBoldSDK$delegate = interfaceC2525i2;
        this.$initializeSDK$delegate = interfaceC2525i3;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
        return new UnityAdsSDK$initialize$1$newInitializationJob$1(this.$source, this.$gameId, this.$initScope, this.$alternativeFlowReader$delegate, this.$initializeBoldSDK$delegate, this.$initializeSDK$delegate, interfaceC3103c);
    }

    @Override // tf.p
    @Nullable
    public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
        return ((UnityAdsSDK$initialize$1$newInitializationJob$1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (r7.invoke(r1, r6) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
    
        if (r7.mo283invokegIAlus(r1, r6) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        return r0;
     */
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            Fe.e.U(r7)
            ef.n r7 = (ef.C2530n) r7
            r7.getClass()
            goto L96
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            Fe.e.U(r7)
            goto L96
        L22:
            Fe.e.U(r7)
            ef.i r7 = r6.$alternativeFlowReader$delegate
            com.unity3d.ads.core.configuration.AlternativeFlowReader r7 = com.unity3d.services.UnityAdsSDK.access$initialize$lambda$10$lambda$7(r7)
            boolean r7 = r7.invoke()
            if (r7 == 0) goto L42
            ef.i r7 = r6.$initializeBoldSDK$delegate
            com.unity3d.ads.core.domain.InitializeBoldSDK r7 = com.unity3d.services.UnityAdsSDK.access$initialize$lambda$10$lambda$9(r7)
            java.lang.String r1 = r6.$source
            r6.label = r3
            java.lang.Object r7 = r7.invoke(r1, r6)
            if (r7 != r0) goto L96
            goto L95
        L42:
            boolean r7 = com.unity3d.services.core.properties.SdkProperties.isTestMode()
            if (r7 == 0) goto L4b
            java.lang.String r7 = "test mode"
            goto L4d
        L4b:
            java.lang.String r7 = "production mode"
        L4d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Initializing Unity Services "
            r1.<init>(r3)
            java.lang.String r3 = com.unity3d.services.core.properties.SdkProperties.getVersionName()
            r1.append(r3)
            java.lang.String r3 = " ("
            r1.append(r3)
            int r3 = com.unity3d.services.core.properties.SdkProperties.getVersionCode()
            r1.append(r3)
            java.lang.String r3 = ") with game id "
            r1.append(r3)
            java.lang.String r3 = r6.$gameId
            java.lang.String r4 = " in "
            java.lang.String r5 = ", session "
            ka.AbstractC3256n.p(r1, r3, r4, r7, r5)
            com.unity3d.services.core.properties.Session$Default r7 = com.unity3d.services.core.properties.Session.INSTANCE
            java.lang.String r7 = r7.getId()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            com.unity3d.services.core.log.DeviceLog.info(r7)
            ef.i r7 = r6.$initializeSDK$delegate
            com.unity3d.services.core.domain.task.InitializeSDK r7 = com.unity3d.services.UnityAdsSDK.access$initialize$lambda$10$lambda$8(r7)
            com.unity3d.services.core.domain.task.EmptyParams r1 = com.unity3d.services.core.domain.task.EmptyParams.INSTANCE
            r6.label = r2
            java.lang.Object r7 = r7.mo283invokegIAlus(r1, r6)
            if (r7 != r0) goto L96
        L95:
            return r0
        L96:
            Ef.E r7 = r6.$initScope
            r0 = 0
            Ef.H.j(r7, r0)
            ef.C r7 = ef.C2515C.f34653a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.UnityAdsSDK$initialize$1$newInitializationJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
