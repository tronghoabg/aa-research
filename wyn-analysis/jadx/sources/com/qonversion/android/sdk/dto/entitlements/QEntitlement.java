package com.qonversion.android.sdk.dto.entitlements;

import N0.a;
import com.qonversion.android.sdk.internal.dto.QPermission;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b/\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u008f\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0002\u0010\u001dJ\t\u00106\u001a\u00020\u0006HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010:\u001a\u00020\u0018HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bHÆ\u0003J\t\u0010=\u001a\u00020\bHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000e\u0010?\u001a\u00020\u000bHÀ\u0003¢\u0006\u0002\b@J\t\u0010A\u001a\u00020\rHÆ\u0003J\t\u0010B\u001a\u00020\u0006HÆ\u0003J\t\u0010C\u001a\u00020\u0010HÆ\u0003J\t\u0010D\u001a\u00020\u0012HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003J±\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bHÆ\u0001J\u0013\u0010G\u001a\u00020\u000b2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020\u0012HÖ\u0001J\t\u0010J\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001fR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!¨\u0006K"}, d2 = {"Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;", "", "permission", "Lcom/qonversion/android/sdk/internal/dto/QPermission;", "(Lcom/qonversion/android/sdk/internal/dto/QPermission;)V", "id", "", "startedDate", "Ljava/util/Date;", "expirationDate", "active", "", "source", "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;", InAppPurchaseMetaData.KEY_PRODUCT_ID, "renewState", "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;", "renewsCount", "", "trialStartDate", "firstPurchaseDate", "lastPurchaseDate", "lastActivatedOfferCode", "grantType", "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;", "autoRenewDisableDate", "transactions", "", "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;)V", "getActive$sdk_release", "()Z", "getAutoRenewDisableDate", "()Ljava/util/Date;", "getExpirationDate", "getFirstPurchaseDate", "getGrantType", "()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;", "getId", "()Ljava/lang/String;", "isActive", "getLastActivatedOfferCode", "getLastPurchaseDate", "getProductId", "getRenewState", "()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;", "getRenewsCount", "()I", "getSource", "()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;", "getStartedDate", "getTransactions", "()Ljava/util/List;", "getTrialStartDate", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component4$sdk_release", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QEntitlement {
    private final boolean active;

    @Nullable
    private final Date autoRenewDisableDate;

    @Nullable
    private final Date expirationDate;

    @Nullable
    private final Date firstPurchaseDate;

    @NotNull
    private final QEntitlementGrantType grantType;

    @NotNull
    private final String id;

    @Nullable
    private final String lastActivatedOfferCode;

    @Nullable
    private final Date lastPurchaseDate;

    @NotNull
    private final String productId;

    @NotNull
    private final QEntitlementRenewState renewState;
    private final int renewsCount;

    @NotNull
    private final QEntitlementSource source;

    @NotNull
    private final Date startedDate;

    @NotNull
    private final List<QTransaction> transactions;

    @Nullable
    private final Date trialStartDate;

    public QEntitlement(@NotNull String id2, @NotNull Date startedDate, @Nullable Date date, boolean z2, @NotNull QEntitlementSource source, @NotNull String productId, @NotNull QEntitlementRenewState renewState, int i5, @Nullable Date date2, @Nullable Date date3, @Nullable Date date4, @Nullable String str, @NotNull QEntitlementGrantType grantType, @Nullable Date date5, @NotNull List<QTransaction> transactions) {
        AbstractC3340k.e(id2, "id");
        AbstractC3340k.e(startedDate, "startedDate");
        AbstractC3340k.e(source, "source");
        AbstractC3340k.e(productId, "productId");
        AbstractC3340k.e(renewState, "renewState");
        AbstractC3340k.e(grantType, "grantType");
        AbstractC3340k.e(transactions, "transactions");
        this.id = id2;
        this.startedDate = startedDate;
        this.expirationDate = date;
        this.active = z2;
        this.source = source;
        this.productId = productId;
        this.renewState = renewState;
        this.renewsCount = i5;
        this.trialStartDate = date2;
        this.firstPurchaseDate = date3;
        this.lastPurchaseDate = date4;
        this.lastActivatedOfferCode = str;
        this.grantType = grantType;
        this.autoRenewDisableDate = date5;
        this.transactions = transactions;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Date getFirstPurchaseDate() {
        return this.firstPurchaseDate;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Date getLastPurchaseDate() {
        return this.lastPurchaseDate;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getLastActivatedOfferCode() {
        return this.lastActivatedOfferCode;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final QEntitlementGrantType getGrantType() {
        return this.grantType;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Date getAutoRenewDisableDate() {
        return this.autoRenewDisableDate;
    }

    @NotNull
    public final List<QTransaction> component15() {
        return this.transactions;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Date getStartedDate() {
        return this.startedDate;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component4$sdk_release, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final QEntitlementSource getSource() {
        return this.source;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final QEntitlementRenewState getRenewState() {
        return this.renewState;
    }

    /* renamed from: component8, reason: from getter */
    public final int getRenewsCount() {
        return this.renewsCount;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Date getTrialStartDate() {
        return this.trialStartDate;
    }

    @NotNull
    public final QEntitlement copy(@NotNull String id2, @NotNull Date startedDate, @Nullable Date expirationDate, boolean active, @NotNull QEntitlementSource source, @NotNull String productId, @NotNull QEntitlementRenewState renewState, int renewsCount, @Nullable Date trialStartDate, @Nullable Date firstPurchaseDate, @Nullable Date lastPurchaseDate, @Nullable String lastActivatedOfferCode, @NotNull QEntitlementGrantType grantType, @Nullable Date autoRenewDisableDate, @NotNull List<QTransaction> transactions) {
        AbstractC3340k.e(id2, "id");
        AbstractC3340k.e(startedDate, "startedDate");
        AbstractC3340k.e(source, "source");
        AbstractC3340k.e(productId, "productId");
        AbstractC3340k.e(renewState, "renewState");
        AbstractC3340k.e(grantType, "grantType");
        AbstractC3340k.e(transactions, "transactions");
        return new QEntitlement(id2, startedDate, expirationDate, active, source, productId, renewState, renewsCount, trialStartDate, firstPurchaseDate, lastPurchaseDate, lastActivatedOfferCode, grantType, autoRenewDisableDate, transactions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QEntitlement)) {
            return false;
        }
        QEntitlement qEntitlement = (QEntitlement) other;
        return AbstractC3340k.a(this.id, qEntitlement.id) && AbstractC3340k.a(this.startedDate, qEntitlement.startedDate) && AbstractC3340k.a(this.expirationDate, qEntitlement.expirationDate) && this.active == qEntitlement.active && this.source == qEntitlement.source && AbstractC3340k.a(this.productId, qEntitlement.productId) && this.renewState == qEntitlement.renewState && this.renewsCount == qEntitlement.renewsCount && AbstractC3340k.a(this.trialStartDate, qEntitlement.trialStartDate) && AbstractC3340k.a(this.firstPurchaseDate, qEntitlement.firstPurchaseDate) && AbstractC3340k.a(this.lastPurchaseDate, qEntitlement.lastPurchaseDate) && AbstractC3340k.a(this.lastActivatedOfferCode, qEntitlement.lastActivatedOfferCode) && this.grantType == qEntitlement.grantType && AbstractC3340k.a(this.autoRenewDisableDate, qEntitlement.autoRenewDisableDate) && AbstractC3340k.a(this.transactions, qEntitlement.transactions);
    }

    public final boolean getActive$sdk_release() {
        return this.active;
    }

    @Nullable
    public final Date getAutoRenewDisableDate() {
        return this.autoRenewDisableDate;
    }

    @Nullable
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    @Nullable
    public final Date getFirstPurchaseDate() {
        return this.firstPurchaseDate;
    }

    @NotNull
    public final QEntitlementGrantType getGrantType() {
        return this.grantType;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLastActivatedOfferCode() {
        return this.lastActivatedOfferCode;
    }

    @Nullable
    public final Date getLastPurchaseDate() {
        return this.lastPurchaseDate;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final QEntitlementRenewState getRenewState() {
        return this.renewState;
    }

    public final int getRenewsCount() {
        return this.renewsCount;
    }

    @NotNull
    public final QEntitlementSource getSource() {
        return this.source;
    }

    @NotNull
    public final Date getStartedDate() {
        return this.startedDate;
    }

    @NotNull
    public final List<QTransaction> getTransactions() {
        return this.transactions;
    }

    @Nullable
    public final Date getTrialStartDate() {
        return this.trialStartDate;
    }

    public int hashCode() {
        int iHashCode = (this.startedDate.hashCode() + (this.id.hashCode() * 31)) * 31;
        Date date = this.expirationDate;
        int iHashCode2 = (((this.renewState.hashCode() + a.c((this.source.hashCode() + ((((iHashCode + (date == null ? 0 : date.hashCode())) * 31) + (this.active ? 1231 : 1237)) * 31)) * 31, 31, this.productId)) * 31) + this.renewsCount) * 31;
        Date date2 = this.trialStartDate;
        int iHashCode3 = (iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.firstPurchaseDate;
        int iHashCode4 = (iHashCode3 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.lastPurchaseDate;
        int iHashCode5 = (iHashCode4 + (date4 == null ? 0 : date4.hashCode())) * 31;
        String str = this.lastActivatedOfferCode;
        int iHashCode6 = (this.grantType.hashCode() + ((iHashCode5 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Date date5 = this.autoRenewDisableDate;
        return this.transactions.hashCode() + ((iHashCode6 + (date5 != null ? date5.hashCode() : 0)) * 31);
    }

    public final boolean isActive() {
        return this.active;
    }

    @NotNull
    public String toString() {
        return "QEntitlement(id=" + this.id + ", startedDate=" + this.startedDate + ", expirationDate=" + this.expirationDate + ", active=" + this.active + ", source=" + this.source + ", productId=" + this.productId + ", renewState=" + this.renewState + ", renewsCount=" + this.renewsCount + ", trialStartDate=" + this.trialStartDate + ", firstPurchaseDate=" + this.firstPurchaseDate + ", lastPurchaseDate=" + this.lastPurchaseDate + ", lastActivatedOfferCode=" + this.lastActivatedOfferCode + ", grantType=" + this.grantType + ", autoRenewDisableDate=" + this.autoRenewDisableDate + ", transactions=" + this.transactions + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QEntitlement(@NotNull QPermission permission) {
        this(permission.getPermissionID(), permission.getStartedDate(), permission.getExpirationDate(), permission.isActive(), permission.getSource(), permission.getProductID(), QEntitlementRenewState.INSTANCE.fromProductRenewState$sdk_release(permission.getRenewState()), permission.getRenewsCount(), permission.getTrialStartDate(), permission.getFirstPurchaseDate(), permission.getLastPurchaseDate(), permission.getLastActivatedOfferCode(), permission.getGrantType(), permission.getAutoRenewDisableDate(), permission.getTransactions());
        AbstractC3340k.e(permission, "permission");
    }
}
