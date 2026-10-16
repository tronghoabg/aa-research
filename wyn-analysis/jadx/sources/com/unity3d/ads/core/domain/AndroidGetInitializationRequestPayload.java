package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.data.datasource.InstallReferrerDataSource;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetInitializationRequestPayload;", "Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "getClientInfo", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;", "legacyUserConsentRepository", "Lcom/unity3d/ads/core/configuration/MediationInitBlobMetadataReader;", "mediationInitBlobMetadataReader", "Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;", "installReferrerDataSource", "<init>", "(Lcom/unity3d/ads/core/domain/GetClientInfo;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;Lcom/unity3d/ads/core/configuration/MediationInitBlobMetadataReader;Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;)V", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "invoke", "(Ljf/c;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;", "Lcom/unity3d/ads/core/configuration/MediationInitBlobMetadataReader;", "Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidGetInitializationRequestPayload implements GetInitializationRequestPayload {

    @NotNull
    private static final String BLOB_EXTRA_KEY = "uads_init_blob";

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final GetClientInfo getClientInfo;

    @NotNull
    private final InstallReferrerDataSource installReferrerDataSource;

    @NotNull
    private final LegacyUserConsentRepository legacyUserConsentRepository;

    @NotNull
    private final MediationInitBlobMetadataReader mediationInitBlobMetadataReader;

    @NotNull
    private final SessionRepository sessionRepository;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload", f = "AndroidGetInitializationRequestPayload.kt", l = {30, 31, 39, 40, 51, 56, 61, 66, 81, 105}, m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$1, reason: invalid class name */
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
            return AndroidGetInitializationRequestPayload.this.invoke(this);
        }
    }

    public AndroidGetInitializationRequestPayload(@NotNull GetClientInfo getClientInfo, @NotNull SessionRepository sessionRepository, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull LegacyUserConsentRepository legacyUserConsentRepository, @NotNull MediationInitBlobMetadataReader mediationInitBlobMetadataReader, @NotNull InstallReferrerDataSource installReferrerDataSource) {
        AbstractC3340k.e(getClientInfo, "getClientInfo");
        AbstractC3340k.e(sessionRepository, "sessionRepository");
        AbstractC3340k.e(deviceInfoRepository, "deviceInfoRepository");
        AbstractC3340k.e(legacyUserConsentRepository, "legacyUserConsentRepository");
        AbstractC3340k.e(mediationInitBlobMetadataReader, "mediationInitBlobMetadataReader");
        AbstractC3340k.e(installReferrerDataSource, "installReferrerDataSource");
        this.getClientInfo = getClientInfo;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.legacyUserConsentRepository = legacyUserConsentRepository;
        this.mediationInitBlobMetadataReader = mediationInitBlobMetadataReader;
        this.installReferrerDataSource = installReferrerDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02c6 A[PHI: r1 r4 r5 r9
  0x02c6: PHI (r1v71 java.lang.Object) = (r1v70 java.lang.Object), (r1v1 java.lang.Object) binds: [B:62:0x02c2, B:16:0x0072] A[DONT_GENERATE, DONT_INLINE]
  0x02c6: PHI (r4v29 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r4v26 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r4v31 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:62:0x02c2, B:16:0x0072] A[DONT_GENERATE, DONT_INLINE]
  0x02c6: PHI (r5v13 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r5v10 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r5v15 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:62:0x02c2, B:16:0x0072] A[DONT_GENERATE, DONT_INLINE]
  0x02c6: PHI (r9v21 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) = 
  (r9v18 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
  (r9v23 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
 binds: [B:62:0x02c2, B:16:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ec A[PHI: r1 r4 r5 r9
  0x02ec: PHI (r1v75 java.lang.Object) = (r1v74 java.lang.Object), (r1v1 java.lang.Object) binds: [B:74:0x02e8, B:15:0x0061] A[DONT_GENERATE, DONT_INLINE]
  0x02ec: PHI (r4v32 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r4v29 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r4v34 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:74:0x02e8, B:15:0x0061] A[DONT_GENERATE, DONT_INLINE]
  0x02ec: PHI (r5v16 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r5v13 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r5v18 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:74:0x02e8, B:15:0x0061] A[DONT_GENERATE, DONT_INLINE]
  0x02ec: PHI (r9v24 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) = 
  (r9v21 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
  (r9v26 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
 binds: [B:74:0x02e8, B:15:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x030b A[PHI: r1 r4 r5 r9
  0x030b: PHI (r1v79 java.lang.Object) = (r1v78 java.lang.Object), (r1v1 java.lang.Object) binds: [B:80:0x0307, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x030b: PHI (r4v35 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r4v32 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r4v37 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:80:0x0307, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x030b: PHI (r5v19 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r5v16 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r5v21 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:80:0x0307, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x030b: PHI (r9v27 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) = 
  (r9v24 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
  (r9v29 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
 binds: [B:80:0x0307, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0353 A[PHI: r1 r4 r5 r9
  0x0353: PHI (r1v91 java.lang.Object) = (r1v88 java.lang.Object), (r1v1 java.lang.Object) binds: [B:95:0x034f, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x0353: PHI (r4v38 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r4v35 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r4v40 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:95:0x034f, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x0353: PHI (r5v22 gatewayprotocol.v1.InitializationRequestKt$Dsl) = (r5v19 gatewayprotocol.v1.InitializationRequestKt$Dsl), (r5v24 gatewayprotocol.v1.InitializationRequestKt$Dsl) binds: [B:95:0x034f, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x0353: PHI (r9v30 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) = 
  (r9v27 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
  (r9v32 com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload)
 binds: [B:95:0x034f, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequestPayload
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest> r22) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload.invoke(jf.c):java.lang.Object");
    }
}
