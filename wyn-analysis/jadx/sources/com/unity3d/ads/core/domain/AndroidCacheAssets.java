package com.unity3d.ads.core.domain;

import Ef.E;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidCacheAssets;", "Lcom/unity3d/ads/core/domain/CacheAssets;", "LEf/E;", "scope", "Lcom/unity3d/ads/core/domain/CacheFile;", "cacheFile", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(LEf/E;Lcom/unity3d/ads/core/domain/CacheFile;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignAsset;", "assets", "Lcom/unity3d/ads/core/domain/CacheAssetsEvent;", "invoke", "(Lcom/unity3d/ads/core/data/model/AdObject;Ljava/util/List;Ljf/c;)Ljava/lang/Object;", "LEf/E;", "Lcom/unity3d/ads/core/domain/CacheFile;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidCacheAssets implements CacheAssets {

    @NotNull
    private final CacheFile cacheFile;

    @NotNull
    private final E scope;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.core.domain.AndroidCacheAssets", f = "AndroidCacheAssets.kt", l = {58}, m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.AndroidCacheAssets$invoke$1, reason: invalid class name */
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
            return AndroidCacheAssets.this.invoke(null, null, this);
        }
    }

    public AndroidCacheAssets(@NotNull E scope, @NotNull CacheFile cacheFile, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        AbstractC3340k.e(scope, "scope");
        AbstractC3340k.e(cacheFile, "cacheFile");
        AbstractC3340k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.scope = scope;
        this.cacheFile = cacheFile;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.unity3d.ads.core.domain.CacheAssets
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull com.unity3d.ads.core.data.model.AdObject r15, @org.jetbrains.annotations.NotNull java.util.List<gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignAsset> r16, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super com.unity3d.ads.core.domain.CacheAssetsEvent> r17) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidCacheAssets.invoke(com.unity3d.ads.core.data.model.AdObject, java.util.List, jf.c):java.lang.Object");
    }
}
