package com.qonversion.android.sdk.internal.dto;

import A7.AbstractC0279p0;
import N0.a;
import R8.v;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.qonversion.android.sdk.dto.entitlements.QEntitlementGrantType;
import com.qonversion.android.sdk.dto.entitlements.QEntitlementSource;
import com.qonversion.android.sdk.dto.entitlements.QTransaction;
import com.qonversion.android.sdk.internal.ExtensionsKt;
import hb.InterfaceC2812o;
import hb.s;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0003\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\b\u0003\u0010\u000e\u001a\u00020\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0003\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\u0010\u0019J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0014HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\bHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010;\u001a\u00020\u000bHÆ\u0003J\u000e\u0010<\u001a\u00020\rHÀ\u0003¢\u0006\u0002\b=J\t\u0010>\u001a\u00020\rHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003J±\u0001\u0010@\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\b\b\u0003\u0010\u000e\u001a\u00020\r2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0013\u001a\u00020\u00142\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\b2\u000e\b\u0003\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0001J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\rHÖ\u0001J\u0006\u0010E\u001a\u00020BJ\t\u0010F\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001d¨\u0006G"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QPermission;", "", "permissionID", "", "productID", "renewState", "Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;", "startedDate", "Ljava/util/Date;", "expirationDate", "source", "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;", "active", "", "renewsCount", "trialStartDate", "firstPurchaseDate", "lastPurchaseDate", "lastActivatedOfferCode", "grantType", "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;", "autoRenewDisableDate", "transactions", "", "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;", "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;)V", "getActive$sdk_release", "()I", "getAutoRenewDisableDate", "()Ljava/util/Date;", "getExpirationDate", "getFirstPurchaseDate", "getGrantType", "()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;", "getLastActivatedOfferCode", "()Ljava/lang/String;", "getLastPurchaseDate", "getPermissionID", "getProductID", "getRenewState", "()Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;", "getRenewsCount", "getSource", "()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;", "getStartedDate", "getTransactions", "()Ljava/util/List;", "getTrialStartDate", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component7$sdk_release", "component8", "component9", "copy", "equals", "", "other", "hashCode", "isActive", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QPermission {
    private final int active;

    @Nullable
    private final Date autoRenewDisableDate;

    @Nullable
    private final Date expirationDate;

    @Nullable
    private final Date firstPurchaseDate;

    @NotNull
    private final QEntitlementGrantType grantType;

    @Nullable
    private final String lastActivatedOfferCode;

    @Nullable
    private final Date lastPurchaseDate;

    @NotNull
    private final String permissionID;

    @NotNull
    private final String productID;

    @NotNull
    private final QProductRenewState renewState;
    private final int renewsCount;

    @NotNull
    private final QEntitlementSource source;

    @NotNull
    private final Date startedDate;

    @NotNull
    private final List<QTransaction> transactions;

    @Nullable
    private final Date trialStartDate;

    public QPermission(@InterfaceC2812o(name = "id") @NotNull String permissionID, @InterfaceC2812o(name = "associated_product") @NotNull String productID, @InterfaceC2812o(name = "renew_state") @NotNull QProductRenewState renewState, @InterfaceC2812o(name = "started_timestamp") @NotNull Date startedDate, @InterfaceC2812o(name = "expiration_timestamp") @Nullable Date date, @InterfaceC2812o(name = "source") @NotNull QEntitlementSource source, @InterfaceC2812o(name = "active") int i5, @InterfaceC2812o(name = "renews_count") int i10, @InterfaceC2812o(name = "trial_start_timestamp") @Nullable Date date2, @InterfaceC2812o(name = "first_purchase_timestamp") @Nullable Date date3, @InterfaceC2812o(name = "last_purchase_timestamp") @Nullable Date date4, @InterfaceC2812o(name = "last_activated_offer_code") @Nullable String str, @InterfaceC2812o(name = "grant_type") @NotNull QEntitlementGrantType grantType, @InterfaceC2812o(name = "auto_renew_disable_timestamp") @Nullable Date date5, @InterfaceC2812o(name = "store_transactions") @NotNull List<QTransaction> transactions) {
        AbstractC3340k.e(permissionID, "permissionID");
        AbstractC3340k.e(productID, "productID");
        AbstractC3340k.e(renewState, "renewState");
        AbstractC3340k.e(startedDate, "startedDate");
        AbstractC3340k.e(source, "source");
        AbstractC3340k.e(grantType, "grantType");
        AbstractC3340k.e(transactions, "transactions");
        this.permissionID = permissionID;
        this.productID = productID;
        this.renewState = renewState;
        this.startedDate = startedDate;
        this.expirationDate = date;
        this.source = source;
        this.active = i5;
        this.renewsCount = i10;
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
    public final String getPermissionID() {
        return this.permissionID;
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
    public final String getProductID() {
        return this.productID;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final QProductRenewState getRenewState() {
        return this.renewState;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Date getStartedDate() {
        return this.startedDate;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final QEntitlementSource getSource() {
        return this.source;
    }

    /* renamed from: component7$sdk_release, reason: from getter */
    public final int getActive() {
        return this.active;
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
    public final QPermission copy(@InterfaceC2812o(name = "id") @NotNull String permissionID, @InterfaceC2812o(name = "associated_product") @NotNull String productID, @InterfaceC2812o(name = "renew_state") @NotNull QProductRenewState renewState, @InterfaceC2812o(name = "started_timestamp") @NotNull Date startedDate, @InterfaceC2812o(name = "expiration_timestamp") @Nullable Date expirationDate, @InterfaceC2812o(name = "source") @NotNull QEntitlementSource source, @InterfaceC2812o(name = "active") int active, @InterfaceC2812o(name = "renews_count") int renewsCount, @InterfaceC2812o(name = "trial_start_timestamp") @Nullable Date trialStartDate, @InterfaceC2812o(name = "first_purchase_timestamp") @Nullable Date firstPurchaseDate, @InterfaceC2812o(name = "last_purchase_timestamp") @Nullable Date lastPurchaseDate, @InterfaceC2812o(name = "last_activated_offer_code") @Nullable String lastActivatedOfferCode, @InterfaceC2812o(name = "grant_type") @NotNull QEntitlementGrantType grantType, @InterfaceC2812o(name = "auto_renew_disable_timestamp") @Nullable Date autoRenewDisableDate, @InterfaceC2812o(name = "store_transactions") @NotNull List<QTransaction> transactions) {
        AbstractC3340k.e(permissionID, "permissionID");
        AbstractC3340k.e(productID, "productID");
        AbstractC3340k.e(renewState, "renewState");
        AbstractC3340k.e(startedDate, "startedDate");
        AbstractC3340k.e(source, "source");
        AbstractC3340k.e(grantType, "grantType");
        AbstractC3340k.e(transactions, "transactions");
        return new QPermission(permissionID, productID, renewState, startedDate, expirationDate, source, active, renewsCount, trialStartDate, firstPurchaseDate, lastPurchaseDate, lastActivatedOfferCode, grantType, autoRenewDisableDate, transactions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QPermission)) {
            return false;
        }
        QPermission qPermission = (QPermission) other;
        return AbstractC3340k.a(this.permissionID, qPermission.permissionID) && AbstractC3340k.a(this.productID, qPermission.productID) && this.renewState == qPermission.renewState && AbstractC3340k.a(this.startedDate, qPermission.startedDate) && AbstractC3340k.a(this.expirationDate, qPermission.expirationDate) && this.source == qPermission.source && this.active == qPermission.active && this.renewsCount == qPermission.renewsCount && AbstractC3340k.a(this.trialStartDate, qPermission.trialStartDate) && AbstractC3340k.a(this.firstPurchaseDate, qPermission.firstPurchaseDate) && AbstractC3340k.a(this.lastPurchaseDate, qPermission.lastPurchaseDate) && AbstractC3340k.a(this.lastActivatedOfferCode, qPermission.lastActivatedOfferCode) && this.grantType == qPermission.grantType && AbstractC3340k.a(this.autoRenewDisableDate, qPermission.autoRenewDisableDate) && AbstractC3340k.a(this.transactions, qPermission.transactions);
    }

    public final int getActive$sdk_release() {
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

    @Nullable
    public final String getLastActivatedOfferCode() {
        return this.lastActivatedOfferCode;
    }

    @Nullable
    public final Date getLastPurchaseDate() {
        return this.lastPurchaseDate;
    }

    @NotNull
    public final String getPermissionID() {
        return this.permissionID;
    }

    @NotNull
    public final String getProductID() {
        return this.productID;
    }

    @NotNull
    public final QProductRenewState getRenewState() {
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
        int iHashCode = (this.startedDate.hashCode() + ((this.renewState.hashCode() + a.c(this.permissionID.hashCode() * 31, 31, this.productID)) * 31)) * 31;
        Date date = this.expirationDate;
        int iHashCode2 = (((((this.source.hashCode() + ((iHashCode + (date == null ? 0 : date.hashCode())) * 31)) * 31) + this.active) * 31) + this.renewsCount) * 31;
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
        return ExtensionsKt.toBoolean(this.active);
    }

    @NotNull
    public String toString() {
        String str = this.permissionID;
        String str2 = this.productID;
        QProductRenewState qProductRenewState = this.renewState;
        Date date = this.startedDate;
        Date date2 = this.expirationDate;
        QEntitlementSource qEntitlementSource = this.source;
        int i5 = this.active;
        int i10 = this.renewsCount;
        Date date3 = this.trialStartDate;
        Date date4 = this.firstPurchaseDate;
        Date date5 = this.lastPurchaseDate;
        String str3 = this.lastActivatedOfferCode;
        QEntitlementGrantType qEntitlementGrantType = this.grantType;
        Date date6 = this.autoRenewDisableDate;
        List<QTransaction> list = this.transactions;
        StringBuilder sbR = AbstractC0279p0.r("QPermission(permissionID=", str, ", productID=", str2, ", renewState=");
        sbR.append(qProductRenewState);
        sbR.append(", startedDate=");
        sbR.append(date);
        sbR.append(", expirationDate=");
        sbR.append(date2);
        sbR.append(", source=");
        sbR.append(qEntitlementSource);
        sbR.append(", active=");
        v.i(i5, i10, ", renewsCount=", ", trialStartDate=", sbR);
        sbR.append(date3);
        sbR.append(", firstPurchaseDate=");
        sbR.append(date4);
        sbR.append(", lastPurchaseDate=");
        sbR.append(date5);
        sbR.append(", lastActivatedOfferCode=");
        sbR.append(str3);
        sbR.append(", grantType=");
        sbR.append(qEntitlementGrantType);
        sbR.append(", autoRenewDisableDate=");
        sbR.append(date6);
        sbR.append(", transactions=");
        sbR.append(list);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ QPermission(String str, String str2, QProductRenewState qProductRenewState, Date date, Date date2, QEntitlementSource qEntitlementSource, int i5, int i10, Date date3, Date date4, Date date5, String str3, QEntitlementGrantType qEntitlementGrantType, Date date6, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, qProductRenewState, date, date2, (i11 & 32) != 0 ? QEntitlementSource.Unknown : qEntitlementSource, i5, (i11 & 128) != 0 ? 0 : i10, date3, date4, date5, str3, (i11 & 4096) != 0 ? QEntitlementGrantType.Purchase : qEntitlementGrantType, date6, (i11 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? ff.v.f35432a : list);
    }
}
