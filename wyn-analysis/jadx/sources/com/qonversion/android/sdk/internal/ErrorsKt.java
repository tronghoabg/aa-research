package com.qonversion.android.sdk.internal;

import N0.a;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.QonversionErrorCode;
import com.qonversion.android.sdk.internal.billing.BillingError;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"toQonversionError", "Lcom/qonversion/android/sdk/dto/QonversionError;", "Lcom/qonversion/android/sdk/internal/billing/BillingError;", "", "sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ErrorsKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QonversionErrorCode.values().length];
            try {
                iArr[QonversionErrorCode.BillingUnavailable.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QonversionErrorCode.PurchaseInvalid.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final QonversionError toQonversionError(@NotNull BillingError billingError) {
        QonversionErrorCode qonversionErrorCode;
        AbstractC3340k.e(billingError, "<this>");
        int billingResponseCode = billingError.getBillingResponseCode();
        if (billingResponseCode != 12) {
            switch (billingResponseCode) {
                case -2:
                    qonversionErrorCode = QonversionErrorCode.FeatureNotSupported;
                    break;
                case -1:
                case 2:
                case 6:
                    qonversionErrorCode = QonversionErrorCode.PlayStoreError;
                    break;
                case 0:
                    qonversionErrorCode = QonversionErrorCode.Unknown;
                    break;
                case 1:
                    qonversionErrorCode = QonversionErrorCode.PurchaseCanceled;
                    break;
                case 3:
                    qonversionErrorCode = QonversionErrorCode.BillingUnavailable;
                    break;
                case 4:
                    qonversionErrorCode = QonversionErrorCode.StoreProductNotAvailable;
                    break;
                case 5:
                    qonversionErrorCode = QonversionErrorCode.PurchaseInvalid;
                    break;
                case 7:
                    qonversionErrorCode = QonversionErrorCode.ProductAlreadyOwned;
                    break;
                case 8:
                    qonversionErrorCode = QonversionErrorCode.ProductNotOwned;
                    break;
                default:
                    qonversionErrorCode = QonversionErrorCode.Unknown;
                    break;
            }
        } else {
            qonversionErrorCode = QonversionErrorCode.NetworkConnectionFailed;
        }
        QonversionErrorCode qonversionErrorCode2 = qonversionErrorCode;
        int i5 = WhenMappings.$EnumSwitchMapping$0[qonversionErrorCode2.ordinal()];
        return new QonversionError(qonversionErrorCode2, a.g(billingError.getMessage(), ". ", i5 != 1 ? i5 != 2 ? "" : "Please make sure that you are using the google account where purchases are allowed and the application was correctly signed and properly set up for billing." : "Billing service is not connected to any Google account at the moment."), null, 4, null);
    }

    @NotNull
    public static final QonversionError toQonversionError(@NotNull Throwable th) {
        AbstractC3340k.e(th, "<this>");
        if (th instanceof JSONException) {
            QonversionErrorCode qonversionErrorCode = QonversionErrorCode.ResponseParsingFailed;
            String localizedMessage = ((JSONException) th).getLocalizedMessage();
            return new QonversionError(qonversionErrorCode, localizedMessage == null ? "" : localizedMessage, null, 4, null);
        }
        if (th instanceof IOException) {
            QonversionErrorCode qonversionErrorCode2 = QonversionErrorCode.NetworkConnectionFailed;
            String localizedMessage2 = ((IOException) th).getLocalizedMessage();
            return new QonversionError(qonversionErrorCode2, localizedMessage2 == null ? "" : localizedMessage2, null, 4, null);
        }
        QonversionErrorCode qonversionErrorCode3 = QonversionErrorCode.Unknown;
        String localizedMessage3 = th.getLocalizedMessage();
        return new QonversionError(qonversionErrorCode3, localizedMessage3 == null ? "" : localizedMessage3, null, 4, null);
    }
}
