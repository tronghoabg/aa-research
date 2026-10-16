package com.qonversion.android.sdk.dto.entitlements;

import A7.AbstractC0279p0;
import N0.a;
import com.applovin.sdk.AppLovinEventParameters;
import hb.InterfaceC2812o;
import hb.s;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003Ji\u0010(\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\b\b\u0003\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006/"}, d2 = {"Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;", "", "originalTransactionId", "", "transactionId", "offerCode", "transactionDate", "Ljava/util/Date;", "expirationDate", "transactionRevocationDate", "ownershipType", "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;", "type", "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;", "environment", "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;)V", "getEnvironment", "()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;", "getExpirationDate", "()Ljava/util/Date;", "getOfferCode", "()Ljava/lang/String;", "getOriginalTransactionId", "getOwnershipType", "()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;", "getTransactionDate", "getTransactionId", "getTransactionRevocationDate", "getType", "()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QTransaction {

    @NotNull
    private final QTransactionEnvironment environment;

    @Nullable
    private final Date expirationDate;

    @Nullable
    private final String offerCode;

    @NotNull
    private final String originalTransactionId;

    @NotNull
    private final QTransactionOwnershipType ownershipType;

    @NotNull
    private final Date transactionDate;

    @NotNull
    private final String transactionId;

    @Nullable
    private final Date transactionRevocationDate;

    @NotNull
    private final QTransactionType type;

    public QTransaction(@InterfaceC2812o(name = "original_transaction_id") @NotNull String originalTransactionId, @InterfaceC2812o(name = AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER) @NotNull String transactionId, @InterfaceC2812o(name = "offer_code") @Nullable String str, @InterfaceC2812o(name = "transaction_timestamp") @NotNull Date transactionDate, @InterfaceC2812o(name = "expiration_timestamp") @Nullable Date date, @InterfaceC2812o(name = "transaction_revoke_timestamp") @Nullable Date date2, @InterfaceC2812o(name = "ownership_type") @NotNull QTransactionOwnershipType ownershipType, @InterfaceC2812o(name = "type") @NotNull QTransactionType type, @InterfaceC2812o(name = "environment") @NotNull QTransactionEnvironment environment) {
        AbstractC3340k.e(originalTransactionId, "originalTransactionId");
        AbstractC3340k.e(transactionId, "transactionId");
        AbstractC3340k.e(transactionDate, "transactionDate");
        AbstractC3340k.e(ownershipType, "ownershipType");
        AbstractC3340k.e(type, "type");
        AbstractC3340k.e(environment, "environment");
        this.originalTransactionId = originalTransactionId;
        this.transactionId = transactionId;
        this.offerCode = str;
        this.transactionDate = transactionDate;
        this.expirationDate = date;
        this.transactionRevocationDate = date2;
        this.ownershipType = ownershipType;
        this.type = type;
        this.environment = environment;
    }

    public static /* synthetic */ QTransaction copy$default(QTransaction qTransaction, String str, String str2, String str3, Date date, Date date2, Date date3, QTransactionOwnershipType qTransactionOwnershipType, QTransactionType qTransactionType, QTransactionEnvironment qTransactionEnvironment, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = qTransaction.originalTransactionId;
        }
        if ((i5 & 2) != 0) {
            str2 = qTransaction.transactionId;
        }
        if ((i5 & 4) != 0) {
            str3 = qTransaction.offerCode;
        }
        if ((i5 & 8) != 0) {
            date = qTransaction.transactionDate;
        }
        if ((i5 & 16) != 0) {
            date2 = qTransaction.expirationDate;
        }
        if ((i5 & 32) != 0) {
            date3 = qTransaction.transactionRevocationDate;
        }
        if ((i5 & 64) != 0) {
            qTransactionOwnershipType = qTransaction.ownershipType;
        }
        if ((i5 & 128) != 0) {
            qTransactionType = qTransaction.type;
        }
        if ((i5 & 256) != 0) {
            qTransactionEnvironment = qTransaction.environment;
        }
        QTransactionType qTransactionType2 = qTransactionType;
        QTransactionEnvironment qTransactionEnvironment2 = qTransactionEnvironment;
        Date date4 = date3;
        QTransactionOwnershipType qTransactionOwnershipType2 = qTransactionOwnershipType;
        Date date5 = date2;
        String str4 = str3;
        return qTransaction.copy(str, str2, str4, date, date5, date4, qTransactionOwnershipType2, qTransactionType2, qTransactionEnvironment2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getOriginalTransactionId() {
        return this.originalTransactionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getOfferCode() {
        return this.offerCode;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Date getTransactionDate() {
        return this.transactionDate;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Date getTransactionRevocationDate() {
        return this.transactionRevocationDate;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final QTransactionOwnershipType getOwnershipType() {
        return this.ownershipType;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final QTransactionType getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final QTransactionEnvironment getEnvironment() {
        return this.environment;
    }

    @NotNull
    public final QTransaction copy(@InterfaceC2812o(name = "original_transaction_id") @NotNull String originalTransactionId, @InterfaceC2812o(name = AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER) @NotNull String transactionId, @InterfaceC2812o(name = "offer_code") @Nullable String offerCode, @InterfaceC2812o(name = "transaction_timestamp") @NotNull Date transactionDate, @InterfaceC2812o(name = "expiration_timestamp") @Nullable Date expirationDate, @InterfaceC2812o(name = "transaction_revoke_timestamp") @Nullable Date transactionRevocationDate, @InterfaceC2812o(name = "ownership_type") @NotNull QTransactionOwnershipType ownershipType, @InterfaceC2812o(name = "type") @NotNull QTransactionType type, @InterfaceC2812o(name = "environment") @NotNull QTransactionEnvironment environment) {
        AbstractC3340k.e(originalTransactionId, "originalTransactionId");
        AbstractC3340k.e(transactionId, "transactionId");
        AbstractC3340k.e(transactionDate, "transactionDate");
        AbstractC3340k.e(ownershipType, "ownershipType");
        AbstractC3340k.e(type, "type");
        AbstractC3340k.e(environment, "environment");
        return new QTransaction(originalTransactionId, transactionId, offerCode, transactionDate, expirationDate, transactionRevocationDate, ownershipType, type, environment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QTransaction)) {
            return false;
        }
        QTransaction qTransaction = (QTransaction) other;
        return AbstractC3340k.a(this.originalTransactionId, qTransaction.originalTransactionId) && AbstractC3340k.a(this.transactionId, qTransaction.transactionId) && AbstractC3340k.a(this.offerCode, qTransaction.offerCode) && AbstractC3340k.a(this.transactionDate, qTransaction.transactionDate) && AbstractC3340k.a(this.expirationDate, qTransaction.expirationDate) && AbstractC3340k.a(this.transactionRevocationDate, qTransaction.transactionRevocationDate) && this.ownershipType == qTransaction.ownershipType && this.type == qTransaction.type && this.environment == qTransaction.environment;
    }

    @NotNull
    public final QTransactionEnvironment getEnvironment() {
        return this.environment;
    }

    @Nullable
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    @Nullable
    public final String getOfferCode() {
        return this.offerCode;
    }

    @NotNull
    public final String getOriginalTransactionId() {
        return this.originalTransactionId;
    }

    @NotNull
    public final QTransactionOwnershipType getOwnershipType() {
        return this.ownershipType;
    }

    @NotNull
    public final Date getTransactionDate() {
        return this.transactionDate;
    }

    @NotNull
    public final String getTransactionId() {
        return this.transactionId;
    }

    @Nullable
    public final Date getTransactionRevocationDate() {
        return this.transactionRevocationDate;
    }

    @NotNull
    public final QTransactionType getType() {
        return this.type;
    }

    public int hashCode() {
        int iC = a.c(this.originalTransactionId.hashCode() * 31, 31, this.transactionId);
        String str = this.offerCode;
        int iHashCode = (this.transactionDate.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Date date = this.expirationDate;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.transactionRevocationDate;
        return this.environment.hashCode() + ((this.type.hashCode() + ((this.ownershipType.hashCode() + ((iHashCode2 + (date2 != null ? date2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.originalTransactionId;
        String str2 = this.transactionId;
        String str3 = this.offerCode;
        Date date = this.transactionDate;
        Date date2 = this.expirationDate;
        Date date3 = this.transactionRevocationDate;
        QTransactionOwnershipType qTransactionOwnershipType = this.ownershipType;
        QTransactionType qTransactionType = this.type;
        QTransactionEnvironment qTransactionEnvironment = this.environment;
        StringBuilder sbR = AbstractC0279p0.r("QTransaction(originalTransactionId=", str, ", transactionId=", str2, ", offerCode=");
        sbR.append(str3);
        sbR.append(", transactionDate=");
        sbR.append(date);
        sbR.append(", expirationDate=");
        sbR.append(date2);
        sbR.append(", transactionRevocationDate=");
        sbR.append(date3);
        sbR.append(", ownershipType=");
        sbR.append(qTransactionOwnershipType);
        sbR.append(", type=");
        sbR.append(qTransactionType);
        sbR.append(", environment=");
        sbR.append(qTransactionEnvironment);
        sbR.append(")");
        return sbR.toString();
    }
}
