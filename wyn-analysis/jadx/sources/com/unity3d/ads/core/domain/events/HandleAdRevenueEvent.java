package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.AdRevenueRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086Bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/domain/events/HandleAdRevenueEvent;", "", "Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;", "adRevenueRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/domain/events/GetAdRevenueEventData;", "getAdRevenueEventData", "<init>", "(Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/domain/events/GetAdRevenueEventData;)V", "Lcom/unity3d/ads/core/data/model/AdRevenueData;", JsonStorageKeyNames.DATA_KEY, "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "mediationProvider", "Lcom/unity3d/ads/core/data/model/AdRevenueOrigin;", "origin", "Lef/C;", "invoke", "(Lcom/unity3d/ads/core/data/model/AdRevenueData;Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;Lcom/unity3d/ads/core/data/model/AdRevenueOrigin;Ljf/c;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/domain/events/GetAdRevenueEventData;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HandleAdRevenueEvent {

    @NotNull
    private final AdRevenueRepository adRevenueRepository;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final GetAdRevenueEventData getAdRevenueEventData;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.core.domain.events.HandleAdRevenueEvent", f = "HandleAdRevenueEvent.kt", l = {26, 32}, m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.events.HandleAdRevenueEvent$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3464c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
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
            return HandleAdRevenueEvent.this.invoke(null, null, null, this);
        }
    }

    public HandleAdRevenueEvent(@NotNull AdRevenueRepository adRevenueRepository, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull GetAdRevenueEventData getAdRevenueEventData) {
        AbstractC3340k.e(adRevenueRepository, "adRevenueRepository");
        AbstractC3340k.e(deviceInfoRepository, "deviceInfoRepository");
        AbstractC3340k.e(getAdRevenueEventData, "getAdRevenueEventData");
        this.adRevenueRepository = adRevenueRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getAdRevenueEventData = getAdRevenueEventData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c7, code lost:
    
        if (r10.emit(r9, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull com.unity3d.ads.core.data.model.AdRevenueData r9, @org.jetbrains.annotations.NotNull gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider r10, @org.jetbrains.annotations.NotNull com.unity3d.ads.core.data.model.AdRevenueOrigin r11, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super ef.C2515C> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.unity3d.ads.core.domain.events.HandleAdRevenueEvent.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r12
            com.unity3d.ads.core.domain.events.HandleAdRevenueEvent$invoke$1 r0 = (com.unity3d.ads.core.domain.events.HandleAdRevenueEvent.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.events.HandleAdRevenueEvent$invoke$1 r0 = new com.unity3d.ads.core.domain.events.HandleAdRevenueEvent$invoke$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            kf.a r1 = kf.a.f39711a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            Fe.e.U(r12)
            goto Lca
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            java.lang.Object r9 = r0.L$6
            gatewayprotocol.v1.AdRevenueEventRequestKt$Dsl r9 = (gatewayprotocol.v1.AdRevenueEventRequestKt.Dsl) r9
            java.lang.Object r10 = r0.L$5
            gatewayprotocol.v1.AdRevenueEventRequestKt$Dsl r10 = (gatewayprotocol.v1.AdRevenueEventRequestKt.Dsl) r10
            java.lang.Object r11 = r0.L$4
            gatewayprotocol.v1.AdRevenueEventRequestKt$Dsl r11 = (gatewayprotocol.v1.AdRevenueEventRequestKt.Dsl) r11
            java.lang.Object r2 = r0.L$3
            com.unity3d.ads.core.data.model.AdRevenueOrigin r2 = (com.unity3d.ads.core.data.model.AdRevenueOrigin) r2
            java.lang.Object r4 = r0.L$2
            gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider r4 = (gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider) r4
            java.lang.Object r5 = r0.L$1
            com.unity3d.ads.core.data.model.AdRevenueData r5 = (com.unity3d.ads.core.data.model.AdRevenueData) r5
            java.lang.Object r6 = r0.L$0
            com.unity3d.ads.core.domain.events.HandleAdRevenueEvent r6 = (com.unity3d.ads.core.domain.events.HandleAdRevenueEvent) r6
            Fe.e.U(r12)
            r7 = r12
            r12 = r11
            r11 = r2
            r2 = r7
            goto L87
        L57:
            Fe.e.U(r12)
            gatewayprotocol.v1.AdRevenueEventRequestKt$Dsl$Companion r12 = gatewayprotocol.v1.AdRevenueEventRequestKt.Dsl.INSTANCE
            gatewayprotocol.v1.AdRevenueEventRequestOuterClass$AdRevenueEventRequest$Builder r2 = gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequest.newBuilder()
            java.lang.String r5 = "newBuilder()"
            kotlin.jvm.internal.AbstractC3340k.d(r2, r5)
            gatewayprotocol.v1.AdRevenueEventRequestKt$Dsl r12 = r12._create(r2)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r2 = r8.deviceInfoRepository
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.L$3 = r11
            r0.L$4 = r12
            r0.L$5 = r12
            r0.L$6 = r12
            r0.label = r4
            java.lang.Object r2 = r2.staticDeviceInfo(r0)
            if (r2 != r1) goto L82
            goto Lc9
        L82:
            r6 = r8
            r5 = r9
            r4 = r10
            r9 = r12
            r10 = r9
        L87:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r2 = (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) r2
            r9.setStaticDeviceInfo(r2)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r9 = r6.deviceInfoRepository
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo r9 = r9.getDynamicDeviceInfo()
            r10.setDynamicDeviceInfo(r9)
            r10.setMediationProvider(r4)
            gatewayprotocol.v1.AdRevenueEventRequestOuterClass$AdRevenueOrigin r9 = com.unity3d.ads.core.domain.events.HandleAdRevenueEventKt.access$toProto(r11)
            r10.setAdRevenueOrigin(r9)
            com.unity3d.ads.core.domain.events.GetAdRevenueEventData r9 = r6.getAdRevenueEventData
            gatewayprotocol.v1.AdRevenueEventRequestOuterClass$AdRevenueData r9 = r9.invoke(r5)
            r10.setAdRevenueData(r9)
            gatewayprotocol.v1.AdRevenueEventRequestOuterClass$AdRevenueEventRequest r9 = r12._build()
            com.unity3d.ads.core.data.repository.AdRevenueRepository r10 = r6.adRevenueRepository
            Hf.b0 r10 = r10.getAdRevenueEvents()
            r11 = 0
            r0.L$0 = r11
            r0.L$1 = r11
            r0.L$2 = r11
            r0.L$3 = r11
            r0.L$4 = r11
            r0.L$5 = r11
            r0.L$6 = r11
            r0.label = r3
            java.lang.Object r9 = r10.emit(r9, r0)
            if (r9 != r1) goto Lca
        Lc9:
            return r1
        Lca:
            ef.C r9 = ef.C2515C.f34653a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.HandleAdRevenueEvent.invoke(com.unity3d.ads.core.data.model.AdRevenueData, gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider, com.unity3d.ads.core.data.model.AdRevenueOrigin, jf.c):java.lang.Object");
    }
}
