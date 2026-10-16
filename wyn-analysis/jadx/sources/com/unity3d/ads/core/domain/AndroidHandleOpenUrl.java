package com.unity3d.ads.core.domain;

import android.content.Context;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JW\u0010\u0013\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleOpenUrl;", "Lcom/unity3d/ads/core/domain/HandleOpenUrl;", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/domain/IntentCreation;", "intentCreation", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/domain/IntentCreation;)V", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "", "url", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, HandleInvocationsFromAdViewer.KEY_ACTION, "", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", HandleInvocationsFromAdViewer.KEY_USE_ACTIVITY_FOR_RESULT, "invoke", "(Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjf/c;)Ljava/lang/Object;", "Landroid/content/Context;", "Lcom/unity3d/ads/core/domain/IntentCreation;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidHandleOpenUrl implements HandleOpenUrl {

    @NotNull
    private final Context context;

    @NotNull
    private final IntentCreation intentCreation;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.core.domain.AndroidHandleOpenUrl", f = "AndroidHandleOpenUrl.kt", l = {52}, m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3464c {
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
            return AndroidHandleOpenUrl.this.invoke(null, null, null, null, null, false, this);
        }
    }

    public AndroidHandleOpenUrl(@NotNull Context context, @NotNull IntentCreation intentCreation) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(intentCreation, "intentCreation");
        this.context = context;
        this.intentCreation = intentCreation;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.HandleOpenUrl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull final com.unity3d.ads.core.data.model.AdObject r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.Nullable java.lang.String r7, @org.jetbrains.annotations.Nullable java.lang.String r8, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r9, boolean r10, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c<? super java.lang.Boolean> r11) {
        /*
            r4 = this;
            boolean r0 = r11 instanceof com.unity3d.ads.core.domain.AndroidHandleOpenUrl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r11
            com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidHandleOpenUrl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            kf.a r1 = kf.a.f39711a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            Fe.e.U(r11)
            goto L75
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            Fe.e.U(r11)
            com.unity3d.ads.core.domain.IntentCreation r11 = r4.intentCreation
            android.content.Intent r6 = r11.invoke(r6, r7, r8, r9)
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType r7 = r5.getAdType()
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType r8 = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER
            if (r7 != r8) goto L56
            r5 = 268435456(0x10000000, float:2.524355E-29)
            r6.setFlags(r5)
            android.content.Context r5 = r4.context     // Catch: java.lang.Throwable -> L4d
            r5.startActivity(r6)     // Catch: java.lang.Throwable -> L4d
            ef.C r5 = ef.C2515C.f34653a     // Catch: java.lang.Throwable -> L4d
            goto L52
        L4d:
            r5 = move-exception
            ef.m r5 = Fe.e.z(r5)
        L52:
            boolean r5 = r5 instanceof ef.C2529m
            r5 = r5 ^ r3
            goto L80
        L56:
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$Companion r7 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.INSTANCE
            Hf.b0 r7 = r7.getDisplayMessages()
            com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1 r8 = new com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1
            r9 = 0
            r8.<init>(r5, r6, r10, r9)
            Hf.C0 r6 = new Hf.C0
            r6.<init>(r7, r8)
            com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1 r7 = new com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1
            r7.<init>()
            r0.label = r3
            java.lang.Object r11 = Hf.k0.o(r7, r0)
            if (r11 != r1) goto L75
            return r1
        L75:
            java.lang.String r5 = "null cannot be cast to non-null type com.unity3d.ads.adplayer.DisplayMessage.OpenUrlResult"
            kotlin.jvm.internal.AbstractC3340k.c(r11, r5)
            com.unity3d.ads.adplayer.DisplayMessage$OpenUrlResult r11 = (com.unity3d.ads.adplayer.DisplayMessage.OpenUrlResult) r11
            boolean r5 = r11.getSuccess()
        L80:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleOpenUrl.invoke(com.unity3d.ads.core.data.model.AdObject, java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean, jf.c):java.lang.Object");
    }
}
