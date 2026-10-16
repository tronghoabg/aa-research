package com.unity3d.ads.core.configuration;

import Hf.InterfaceC0592c0;
import Hf.k0;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.configuration.ConfigurationReader;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/configuration/CommonAlternativeFlowReader;", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "Lcom/unity3d/services/core/configuration/ConfigurationReader;", "configurationReader", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "mediationMetadataReader", "Lcom/unity3d/ads/core/configuration/ForceAlternativeFlow;", "forceAlternativeFlow", "<init>", "(Lcom/unity3d/services/core/configuration/ConfigurationReader;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;Lcom/unity3d/ads/core/configuration/ForceAlternativeFlow;)V", "", "invoke", "()Z", "Lcom/unity3d/services/core/configuration/ConfigurationReader;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "Lcom/unity3d/ads/core/configuration/ForceAlternativeFlow;", "LHf/c0;", "isAlternativeFlowRead", "LHf/c0;", "isAlternativeFlowEnabled", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CommonAlternativeFlowReader implements AlternativeFlowReader {

    @NotNull
    private final ConfigurationReader configurationReader;

    @NotNull
    private final ForceAlternativeFlow forceAlternativeFlow;

    @NotNull
    private final InterfaceC0592c0 isAlternativeFlowEnabled;

    @NotNull
    private final InterfaceC0592c0 isAlternativeFlowRead;

    @NotNull
    private final MediationTraitsMetadataReader mediationMetadataReader;

    @NotNull
    private final SessionRepository sessionRepository;

    public CommonAlternativeFlowReader(@NotNull ConfigurationReader configurationReader, @NotNull SessionRepository sessionRepository, @NotNull MediationTraitsMetadataReader mediationMetadataReader, @NotNull ForceAlternativeFlow forceAlternativeFlow) {
        AbstractC3340k.e(configurationReader, "configurationReader");
        AbstractC3340k.e(sessionRepository, "sessionRepository");
        AbstractC3340k.e(mediationMetadataReader, "mediationMetadataReader");
        AbstractC3340k.e(forceAlternativeFlow, "forceAlternativeFlow");
        this.configurationReader = configurationReader;
        this.sessionRepository = sessionRepository;
        this.mediationMetadataReader = mediationMetadataReader;
        this.forceAlternativeFlow = forceAlternativeFlow;
        this.isAlternativeFlowRead = k0.c(Boolean.FALSE);
        this.isAlternativeFlowEnabled = k0.c(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    @Override // com.unity3d.ads.core.configuration.AlternativeFlowReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean invoke() {
        /*
            r4 = this;
            Hf.c0 r0 = r4.isAlternativeFlowRead
            Hf.x0 r0 = (Hf.x0) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1f
            Hf.c0 r0 = r4.isAlternativeFlowEnabled
            Hf.x0 r0 = (Hf.x0) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1f:
            com.unity3d.ads.core.configuration.ForceAlternativeFlow r0 = r4.forceAlternativeFlow
            boolean r0 = r0.getForceAlternativeFlow()
            r1 = 0
            if (r0 == 0) goto L40
            Hf.c0 r0 = r4.isAlternativeFlowEnabled
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            Hf.x0 r0 = (Hf.x0) r0
            r0.getClass()
            r0.k(r1, r2)
            Hf.c0 r0 = r4.isAlternativeFlowRead
            Hf.x0 r0 = (Hf.x0) r0
            r0.getClass()
            r0.k(r1, r2)
            r0 = 1
            return r0
        L40:
            com.unity3d.ads.core.configuration.MediationTraitsMetadataReader r0 = r4.mediationMetadataReader
            com.unity3d.services.core.misc.JsonStorage r2 = r0.getJsonStorage()
            java.lang.String r0 = r0.getKey()
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L58
            boolean r2 = r0 instanceof org.json.JSONObject
            if (r2 == 0) goto L55
            goto L56
        L55:
            r0 = r1
        L56:
            if (r0 != 0) goto L59
        L58:
            r0 = r1
        L59:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            if (r0 == 0) goto L87
            java.lang.String r2 = "boldSdkEnabled"
            boolean r3 = r0.has(r2)
            if (r3 == 0) goto L66
            goto L67
        L66:
            r0 = r1
        L67:
            if (r0 == 0) goto L87
            Hf.c0 r3 = r4.isAlternativeFlowEnabled
            boolean r0 = r0.optBoolean(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            Hf.x0 r3 = (Hf.x0) r3
            r3.getClass()
            r3.k(r1, r0)
            Hf.c0 r0 = r4.isAlternativeFlowRead
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            Hf.x0 r0 = (Hf.x0) r0
            r0.getClass()
            r0.k(r1, r2)
        L87:
            Hf.c0 r0 = r4.isAlternativeFlowRead
            Hf.x0 r0 = (Hf.x0) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Ldc
            com.unity3d.services.core.configuration.ConfigurationReader r0 = r4.configurationReader
            com.unity3d.services.core.configuration.Configuration r0 = r0.getCurrentConfiguration()
            com.unity3d.services.core.configuration.IExperiments r0 = r0.getExperiments()
            boolean r0 = r0.isBoldSdkNextSessionEnabled()
            if (r0 != 0) goto Lb4
            Hf.c0 r0 = r4.isAlternativeFlowEnabled
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            Hf.x0 r0 = (Hf.x0) r0
            r0.getClass()
            r0.k(r1, r2)
            goto Ld0
        Lb4:
            Hf.c0 r0 = r4.isAlternativeFlowEnabled
            com.unity3d.ads.core.data.repository.SessionRepository r2 = r4.sessionRepository
            gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration r2 = r2.getNativeConfiguration()
            gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlags r2 = r2.getFeatureFlags()
            boolean r2 = r2.getBoldSdkNextSessionEnabled()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            Hf.x0 r0 = (Hf.x0) r0
            r0.getClass()
            r0.k(r1, r2)
        Ld0:
            Hf.c0 r0 = r4.isAlternativeFlowRead
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            Hf.x0 r0 = (Hf.x0) r0
            r0.getClass()
            r0.k(r1, r2)
        Ldc:
            Hf.c0 r0 = r4.isAlternativeFlowEnabled
            Hf.x0 r0 = (Hf.x0) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.configuration.CommonAlternativeFlowReader.invoke():boolean");
    }
}
