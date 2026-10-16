package com.qonversion.android.sdk.internal.billing;

import android.app.Activity;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.qonversion.android.sdk.dto.QPurchaseUpdatePolicy;
import com.qonversion.android.sdk.internal.logger.Logger;
import ef.C2515C;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.apache.tika.utils.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0005¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u0017H\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001c*\u00020\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0004¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;", "", "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;", "billingClientHolder", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "logger", "<init>", "(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/logger/Logger;)V", "", "purchaseToken", "Lef/C;", "consume", "(Ljava/lang/String;)V", "acknowledge", "Landroid/app/Activity;", "activity", "Lcom/android/billingclient/api/BillingFlowParams;", "params", "launchBillingFlow", "(Landroid/app/Activity;Lcom/android/billingclient/api/BillingFlowParams;)V", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "purchaseType", "Lkotlin/Function1;", "Lcom/qonversion/android/sdk/internal/billing/BillingError;", "onQueryFailed", "handlePurchasesQueryError", "(Lcom/android/billingclient/api/BillingResult;Ljava/lang/String;Ltf/l;)V", "Lcom/android/billingclient/api/BillingFlowParams$Builder;", "Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;", "info", "setSubscriptionUpdateParams", "(Lcom/android/billingclient/api/BillingFlowParams$Builder;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;)Lcom/android/billingclient/api/BillingFlowParams$Builder;", "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;", "getBillingClientHolder", "()Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "getLogger", "()Lcom/qonversion/android/sdk/internal/logger/Logger;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BillingClientWrapperBase {

    @NotNull
    private final BillingClientHolder billingClientHolder;

    @NotNull
    private final Logger logger;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/BillingClient;", "Lef/C;", "invoke", "(Lcom/android/billingclient/api/BillingClient;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.BillingClientWrapperBase$acknowledge$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        final /* synthetic */ AcknowledgePurchaseParams $params;
        final /* synthetic */ String $purchaseToken;
        final /* synthetic */ BillingClientWrapperBase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AcknowledgePurchaseParams acknowledgePurchaseParams, String str, BillingClientWrapperBase billingClientWrapperBase) {
            super(1);
            this.$params = acknowledgePurchaseParams;
            this.$purchaseToken = str;
            this.this$0 = billingClientWrapperBase;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(String purchaseToken, BillingClientWrapperBase this$0, BillingResult billingResult) {
            AbstractC3340k.e(purchaseToken, "$purchaseToken");
            AbstractC3340k.e(this$0, "this$0");
            AbstractC3340k.e(billingResult, "billingResult");
            if (UtilsKt.isOk(billingResult)) {
                return;
            }
            com.google.android.gms.internal.consent_sdk.a.z("acknowledge() -> ", N0.a.h("Failed to acknowledge purchase with token ", purchaseToken, StringUtils.SPACE, UtilsKt.getDescription(billingResult)), this$0.getLogger());
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingClient) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull BillingClient withReadyClient) {
            AbstractC3340k.e(withReadyClient, "$this$withReadyClient");
            withReadyClient.acknowledgePurchase(this.$params, new d(1, this.$purchaseToken, this.this$0));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/BillingClient;", "Lef/C;", "invoke", "(Lcom/android/billingclient/api/BillingClient;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.BillingClientWrapperBase$consume$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21861 extends AbstractC3343n implements l {
        final /* synthetic */ ConsumeParams $params;
        final /* synthetic */ BillingClientWrapperBase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21861(ConsumeParams consumeParams, BillingClientWrapperBase billingClientWrapperBase) {
            super(1);
            this.$params = consumeParams;
            this.this$0 = billingClientWrapperBase;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(BillingClientWrapperBase this$0, BillingResult billingResult, String purchaseToken) {
            AbstractC3340k.e(this$0, "this$0");
            AbstractC3340k.e(billingResult, "billingResult");
            AbstractC3340k.e(purchaseToken, "purchaseToken");
            if (UtilsKt.isOk(billingResult)) {
                return;
            }
            com.google.android.gms.internal.consent_sdk.a.z("consume() -> ", N0.a.h("Failed to consume purchase with token ", purchaseToken, StringUtils.SPACE, UtilsKt.getDescription(billingResult)), this$0.getLogger());
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingClient) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull BillingClient withReadyClient) {
            AbstractC3340k.e(withReadyClient, "$this$withReadyClient");
            withReadyClient.consumeAsync(this.$params, new c(this.this$0, 2));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/BillingClient;", "Lef/C;", "invoke", "(Lcom/android/billingclient/api/BillingClient;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.billing.BillingClientWrapperBase$launchBillingFlow$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21871 extends AbstractC3343n implements l {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ BillingFlowParams $params;
        final /* synthetic */ BillingClientWrapperBase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21871(Activity activity, BillingFlowParams billingFlowParams, BillingClientWrapperBase billingClientWrapperBase) {
            super(1);
            this.$activity = activity;
            this.$params = billingFlowParams;
            this.this$0 = billingClientWrapperBase;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingClient) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull BillingClient withReadyClient) {
            AbstractC3340k.e(withReadyClient, "$this$withReadyClient");
            BillingResult billingResultLaunchBillingFlow = withReadyClient.launchBillingFlow(this.$activity, this.$params);
            AbstractC3340k.b(billingResultLaunchBillingFlow);
            if (UtilsKt.isOk(billingResultLaunchBillingFlow)) {
                billingResultLaunchBillingFlow = null;
            }
            if (billingResultLaunchBillingFlow != null) {
                this.this$0.getLogger().error("launchBillingFlow() -> Failed to launch billing flow. " + UtilsKt.getDescription(billingResultLaunchBillingFlow));
            }
        }
    }

    public BillingClientWrapperBase(@NotNull BillingClientHolder billingClientHolder, @NotNull Logger logger) {
        AbstractC3340k.e(billingClientHolder, "billingClientHolder");
        AbstractC3340k.e(logger, "logger");
        this.billingClientHolder = billingClientHolder;
        this.logger = logger;
    }

    public static /* synthetic */ BillingFlowParams.Builder setSubscriptionUpdateParams$default(BillingClientWrapperBase billingClientWrapperBase, BillingFlowParams.Builder builder, UpdatePurchaseInfo updatePurchaseInfo, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSubscriptionUpdateParams");
        }
        if ((i5 & 1) != 0) {
            updatePurchaseInfo = null;
        }
        return billingClientWrapperBase.setSubscriptionUpdateParams(builder, updatePurchaseInfo);
    }

    public final void acknowledge(@NotNull String purchaseToken) {
        AbstractC3340k.e(purchaseToken, "purchaseToken");
        AcknowledgePurchaseParams acknowledgePurchaseParamsBuild = AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchaseToken).build();
        AbstractC3340k.d(acknowledgePurchaseParamsBuild, "build(...)");
        this.billingClientHolder.withReadyClient(new AnonymousClass1(acknowledgePurchaseParamsBuild, purchaseToken, this));
    }

    public final void consume(@NotNull String purchaseToken) {
        AbstractC3340k.e(purchaseToken, "purchaseToken");
        ConsumeParams consumeParamsBuild = ConsumeParams.newBuilder().setPurchaseToken(purchaseToken).build();
        AbstractC3340k.d(consumeParamsBuild, "build(...)");
        this.billingClientHolder.withReadyClient(new C21861(consumeParamsBuild, this));
    }

    @NotNull
    public final BillingClientHolder getBillingClientHolder() {
        return this.billingClientHolder;
    }

    @NotNull
    public final Logger getLogger() {
        return this.logger;
    }

    public final void handlePurchasesQueryError(@NotNull BillingResult billingResult, @NotNull String purchaseType, @NotNull l onQueryFailed) {
        AbstractC3340k.e(billingResult, "billingResult");
        AbstractC3340k.e(purchaseType, "purchaseType");
        AbstractC3340k.e(onQueryFailed, "onQueryFailed");
        String strH = N0.a.h("Failed to query ", purchaseType, " purchases from cache: ", UtilsKt.getDescription(billingResult));
        onQueryFailed.invoke(new BillingError(billingResult.getResponseCode(), strH));
        this.logger.error("queryPurchases() -> " + strH);
    }

    public final void launchBillingFlow(@NotNull Activity activity, @NotNull BillingFlowParams params) {
        AbstractC3340k.e(activity, "activity");
        AbstractC3340k.e(params, "params");
        this.billingClientHolder.withReadyClient(new C21871(activity, params, this));
    }

    @NotNull
    public final BillingFlowParams.Builder setSubscriptionUpdateParams(@NotNull BillingFlowParams.Builder builder, @Nullable UpdatePurchaseInfo updatePurchaseInfo) {
        AbstractC3340k.e(builder, "<this>");
        if (updatePurchaseInfo != null) {
            BillingFlowParams.SubscriptionUpdateParams.Builder builderNewBuilder = BillingFlowParams.SubscriptionUpdateParams.newBuilder();
            AbstractC3340k.d(builderNewBuilder, "newBuilder(...)");
            builderNewBuilder.setOldPurchaseToken(updatePurchaseInfo.getPurchaseToken());
            QPurchaseUpdatePolicy updatePolicy = updatePurchaseInfo.getUpdatePolicy();
            if (updatePolicy != null) {
                builderNewBuilder.setSubscriptionReplacementMode(updatePolicy.toReplacementMode$sdk_release());
            }
            BillingFlowParams.SubscriptionUpdateParams subscriptionUpdateParamsBuild = builderNewBuilder.build();
            AbstractC3340k.d(subscriptionUpdateParamsBuild, "build(...)");
            builder.setSubscriptionUpdateParams(subscriptionUpdateParamsBuild);
        }
        return builder;
    }
}
