package com.qonversion.android.sdk.internal.billing;

import R8.v;
import android.os.Handler;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.qonversion.android.sdk.internal.logger.Logger;
import ef.C2515C;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001-B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00192\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010&R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0011\u0010+\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;", "Lcom/android/billingclient/api/BillingClientStateListener;", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "Landroid/os/Handler;", "mainHandler", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "logger", "<init>", "(Landroid/os/Handler;Lcom/qonversion/android/sdk/internal/logger/Logger;)V", "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;", "listener", "Lef/C;", "startConnection", "(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;)V", "Lkotlin/Function1;", "Lcom/android/billingclient/api/BillingClient;", "billingFunction", "withReadyClient", "(Ltf/l;)V", "purchasesUpdatedListener", "subscribeOnPurchasesUpdates", "(Lcom/android/billingclient/api/PurchasesUpdatedListener;)V", "billingClient", "setBillingClient", "(Lcom/android/billingclient/api/BillingClient;)V", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "Lcom/android/billingclient/api/Purchase;", "purchases", "onPurchasesUpdated", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "onBillingServiceDisconnected", "()V", "onBillingSetupFinished", "(Lcom/android/billingclient/api/BillingResult;)V", "Landroid/os/Handler;", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "Lcom/android/billingclient/api/BillingClient;", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "connectionListener", "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;", "", "isConnected", "()Z", "ConnectionListener", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BillingClientHolder implements BillingClientStateListener, PurchasesUpdatedListener {

    @Nullable
    private BillingClient billingClient;

    @Nullable
    private ConnectionListener connectionListener;

    @NotNull
    private final Logger logger;

    @NotNull
    private final Handler mainHandler;

    @Nullable
    private PurchasesUpdatedListener purchasesUpdatedListener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;", "", "Lef/C;", "onBillingClientConnected", "()V", "Lcom/qonversion/android/sdk/internal/billing/BillingError;", "error", "onBillingClientUnavailable", "(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ConnectionListener {
        void onBillingClientConnected();

        void onBillingClientUnavailable(@NotNull BillingError error);
    }

    public BillingClientHolder(@NotNull Handler mainHandler, @NotNull Logger logger) {
        AbstractC3340k.e(mainHandler, "mainHandler");
        AbstractC3340k.e(logger, "logger");
        this.mainHandler = mainHandler;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startConnection$lambda$1(BillingClientHolder this$0) {
        AbstractC3340k.e(this$0, "this$0");
        synchronized (this$0) {
            try {
                BillingClient billingClient = this$0.billingClient;
                if (billingClient != null) {
                    billingClient.startConnection(this$0);
                }
                this$0.logger.debug("startConnection() -> for " + this$0.billingClient);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isConnected() {
        BillingClient billingClient = this.billingClient;
        return billingClient != null && billingClient.isReady();
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        this.logger.debug("onBillingServiceDisconnected() -> for " + this.billingClient);
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingSetupFinished(@NotNull BillingResult billingResult) {
        AbstractC3340k.e(billingResult, "billingResult");
        int responseCode = billingResult.getResponseCode();
        if (responseCode != -2) {
            if (responseCode == 0) {
                this.logger.debug("onBillingSetupFinished() -> successfully for " + this.billingClient + ".");
                ConnectionListener connectionListener = this.connectionListener;
                if (connectionListener != null) {
                    connectionListener.onBillingClientConnected();
                    return;
                }
                return;
            }
            if (responseCode != 3) {
                if (responseCode != 5) {
                    this.logger.error("onBillingSetupFinished with error: " + UtilsKt.getDescription(billingResult));
                    return;
                }
                return;
            }
        }
        this.logger.error("onBillingSetupFinished() -> with error: " + UtilsKt.getDescription(billingResult));
        BillingError billingError = new BillingError(billingResult.getResponseCode(), v.f("Billing is not available on this device. ", UtilsKt.getDescription(billingResult)));
        ConnectionListener connectionListener2 = this.connectionListener;
        if (connectionListener2 != null) {
            connectionListener2.onBillingClientUnavailable(billingError);
        }
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(@NotNull BillingResult billingResult, @Nullable List<Purchase> purchases) {
        AbstractC3340k.e(billingResult, "billingResult");
        PurchasesUpdatedListener purchasesUpdatedListener = this.purchasesUpdatedListener;
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesUpdated(billingResult, purchases);
        }
    }

    public final void setBillingClient(@NotNull BillingClient billingClient) {
        AbstractC3340k.e(billingClient, "billingClient");
        this.billingClient = billingClient;
    }

    public final void startConnection(@NotNull ConnectionListener listener) {
        AbstractC3340k.e(listener, "listener");
        this.connectionListener = listener;
        this.mainHandler.post(new a(this, 0));
    }

    public final void subscribeOnPurchasesUpdates(@NotNull PurchasesUpdatedListener purchasesUpdatedListener) {
        AbstractC3340k.e(purchasesUpdatedListener, "purchasesUpdatedListener");
        this.purchasesUpdatedListener = purchasesUpdatedListener;
    }

    public final void withReadyClient(@NotNull l billingFunction) {
        AbstractC3340k.e(billingFunction, "billingFunction");
        BillingClient billingClient = this.billingClient;
        C2515C c2515c = null;
        if (!isConnected()) {
            billingClient = null;
        }
        if (billingClient != null) {
            billingFunction.invoke(billingClient);
            c2515c = C2515C.f34653a;
        }
        if (c2515c == null) {
            this.logger.debug("Connection to the BillingClient was lost");
        }
    }
}
