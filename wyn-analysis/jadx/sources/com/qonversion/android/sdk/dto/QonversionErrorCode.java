package com.qonversion.android.sdk.dto;

import ic.d;
import kotlin.Metadata;
import mf.InterfaceC3559a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionErrorCode;", "", "specification", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getSpecification", "()Ljava/lang/String;", "Unknown", "PlayStoreError", "BillingUnavailable", "PurchasePending", "PurchaseUnspecified", "PurchaseInvalid", "PurchaseCanceled", "ProductNotOwned", "ProductAlreadyOwned", "FeatureNotSupported", "StoreProductNotAvailable", "NetworkConnectionFailed", "ResponseParsingFailed", "BackendError", "ProductNotFound", "OfferingsNotFound", "LaunchError", "InvalidCredentials", "InvalidClientUid", "UnknownClientPlatform", "FraudPurchase", "ProjectConfigError", "InvalidStoreCredentials", "RemoteConfigurationNotAvailable", "ApiRateLimitExceeded", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QonversionErrorCode {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ QonversionErrorCode[] $VALUES;

    @NotNull
    private final String specification;
    public static final QonversionErrorCode Unknown = new QonversionErrorCode("Unknown", 0, "Unknown error");
    public static final QonversionErrorCode PlayStoreError = new QonversionErrorCode("PlayStoreError", 1, "There was an issue with the Play Store service");
    public static final QonversionErrorCode BillingUnavailable = new QonversionErrorCode("BillingUnavailable", 2, "The Billing service is unavailable on the device");
    public static final QonversionErrorCode PurchasePending = new QonversionErrorCode("PurchasePending", 3, "Purchase is pending");
    public static final QonversionErrorCode PurchaseUnspecified = new QonversionErrorCode("PurchaseUnspecified", 4, "Unspecified state of the purchase");
    public static final QonversionErrorCode PurchaseInvalid = new QonversionErrorCode("PurchaseInvalid", 5, "Failure of purchase");
    public static final QonversionErrorCode PurchaseCanceled = new QonversionErrorCode("PurchaseCanceled", 6, "User pressed back or canceled a dialog for purchase");
    public static final QonversionErrorCode ProductNotOwned = new QonversionErrorCode("ProductNotOwned", 7, "Failed to consume purchase since item is not owned");
    public static final QonversionErrorCode ProductAlreadyOwned = new QonversionErrorCode("ProductAlreadyOwned", 8, "Failed to purchase since item is already owned");
    public static final QonversionErrorCode FeatureNotSupported = new QonversionErrorCode("FeatureNotSupported", 9, "The requested feature is not supported");
    public static final QonversionErrorCode StoreProductNotAvailable = new QonversionErrorCode("StoreProductNotAvailable", 10, "Requested product is not available for purchase or its product id was not found");
    public static final QonversionErrorCode NetworkConnectionFailed = new QonversionErrorCode("NetworkConnectionFailed", 11, "There was a network issue. Please make sure that the Internet connection is available on the device");
    public static final QonversionErrorCode ResponseParsingFailed = new QonversionErrorCode("ResponseParsingFailed", 12, "A problem occurred while serializing or deserializing data");
    public static final QonversionErrorCode BackendError = new QonversionErrorCode("BackendError", 13, "There was a backend error");
    public static final QonversionErrorCode ProductNotFound = new QonversionErrorCode("ProductNotFound", 14, "Failed to purchase since the Qonversion product was not found");
    public static final QonversionErrorCode OfferingsNotFound = new QonversionErrorCode("OfferingsNotFound", 15, "No offerings found");
    public static final QonversionErrorCode LaunchError = new QonversionErrorCode("LaunchError", 16, "There was an error while launching Qonversion SDK");
    public static final QonversionErrorCode InvalidCredentials = new QonversionErrorCode("InvalidCredentials", 17, "Access token is invalid or not set");
    public static final QonversionErrorCode InvalidClientUid = new QonversionErrorCode("InvalidClientUid", 18, "Client Uid is invalid or not set");
    public static final QonversionErrorCode UnknownClientPlatform = new QonversionErrorCode("UnknownClientPlatform", 19, "The current platform is not supported");
    public static final QonversionErrorCode FraudPurchase = new QonversionErrorCode("FraudPurchase", 20, "Fraud purchase was detected");
    public static final QonversionErrorCode ProjectConfigError = new QonversionErrorCode("ProjectConfigError", 21, "The project is not configured or configured incorrectly in the Qonversion Dashboard");
    public static final QonversionErrorCode InvalidStoreCredentials = new QonversionErrorCode("InvalidStoreCredentials", 22, "This account does not have access to the requested application");
    public static final QonversionErrorCode RemoteConfigurationNotAvailable = new QonversionErrorCode("RemoteConfigurationNotAvailable", 23, "Remote configuration is not available for the current user or for the provided context key");
    public static final QonversionErrorCode ApiRateLimitExceeded = new QonversionErrorCode("ApiRateLimitExceeded", 24, "API requests rate limit exceeded");

    private static final /* synthetic */ QonversionErrorCode[] $values() {
        return new QonversionErrorCode[]{Unknown, PlayStoreError, BillingUnavailable, PurchasePending, PurchaseUnspecified, PurchaseInvalid, PurchaseCanceled, ProductNotOwned, ProductAlreadyOwned, FeatureNotSupported, StoreProductNotAvailable, NetworkConnectionFailed, ResponseParsingFailed, BackendError, ProductNotFound, OfferingsNotFound, LaunchError, InvalidCredentials, InvalidClientUid, UnknownClientPlatform, FraudPurchase, ProjectConfigError, InvalidStoreCredentials, RemoteConfigurationNotAvailable, ApiRateLimitExceeded};
    }

    static {
        QonversionErrorCode[] qonversionErrorCodeArr$values = $values();
        $VALUES = qonversionErrorCodeArr$values;
        $ENTRIES = d.t(qonversionErrorCodeArr$values);
    }

    private QonversionErrorCode(String str, int i5, String str2) {
        this.specification = str2;
    }

    @NotNull
    public static InterfaceC3559a getEntries() {
        return $ENTRIES;
    }

    public static QonversionErrorCode valueOf(String str) {
        return (QonversionErrorCode) Enum.valueOf(QonversionErrorCode.class, str);
    }

    public static QonversionErrorCode[] values() {
        return (QonversionErrorCode[]) $VALUES.clone();
    }

    @NotNull
    public final String getSpecification() {
        return this.specification;
    }
}
