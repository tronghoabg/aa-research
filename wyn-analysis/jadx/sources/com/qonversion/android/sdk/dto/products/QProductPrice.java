package com.qonversion.android.sdk.dto.products;

import N0.a;
import Va.M6;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J'\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000e¨\u0006#"}, d2 = {"Lcom/qonversion/android/sdk/dto/products/QProductPrice;", "", "priceAmountMicros", "", "priceCurrencyCode", "", "formattedPrice", "(JLjava/lang/String;Ljava/lang/String;)V", "currency", "Ljava/util/Currency;", "getCurrency", "()Ljava/util/Currency;", "currencySymbol", "getCurrencySymbol", "()Ljava/lang/String;", "getFormattedPrice", "isFree", "", "()Z", "priceAmount", "", "getPriceAmount", "()D", "getPriceAmountMicros", "()J", "getPriceCurrencyCode", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QProductPrice {

    @Nullable
    private final Currency currency;

    @Nullable
    private final String currencySymbol;

    @NotNull
    private final String formattedPrice;
    private final boolean isFree;
    private final double priceAmount;
    private final long priceAmountMicros;

    @NotNull
    private final String priceCurrencyCode;

    public QProductPrice(long j8, @NotNull String priceCurrencyCode, @NotNull String formattedPrice) {
        Currency currency;
        AbstractC3340k.e(priceCurrencyCode, "priceCurrencyCode");
        AbstractC3340k.e(formattedPrice, "formattedPrice");
        this.priceAmountMicros = j8;
        this.priceCurrencyCode = priceCurrencyCode;
        this.formattedPrice = formattedPrice;
        this.isFree = j8 == 0;
        try {
            currency = Currency.getInstance(priceCurrencyCode);
        } catch (IllegalArgumentException unused) {
            currency = null;
        }
        this.currency = currency;
        this.currencySymbol = currency != null ? currency.getSymbol() : null;
        this.priceAmount = this.priceAmountMicros / 1000000.0d;
    }

    public static /* synthetic */ QProductPrice copy$default(QProductPrice qProductPrice, long j8, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j8 = qProductPrice.priceAmountMicros;
        }
        if ((i5 & 2) != 0) {
            str = qProductPrice.priceCurrencyCode;
        }
        if ((i5 & 4) != 0) {
            str2 = qProductPrice.formattedPrice;
        }
        return qProductPrice.copy(j8, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    @NotNull
    public final QProductPrice copy(long priceAmountMicros, @NotNull String priceCurrencyCode, @NotNull String formattedPrice) {
        AbstractC3340k.e(priceCurrencyCode, "priceCurrencyCode");
        AbstractC3340k.e(formattedPrice, "formattedPrice");
        return new QProductPrice(priceAmountMicros, priceCurrencyCode, formattedPrice);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QProductPrice)) {
            return false;
        }
        QProductPrice qProductPrice = (QProductPrice) other;
        return this.priceAmountMicros == qProductPrice.priceAmountMicros && AbstractC3340k.a(this.priceCurrencyCode, qProductPrice.priceCurrencyCode) && AbstractC3340k.a(this.formattedPrice, qProductPrice.formattedPrice);
    }

    @Nullable
    public final Currency getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    @NotNull
    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    public final double getPriceAmount() {
        return this.priceAmount;
    }

    public final long getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    @NotNull
    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    public int hashCode() {
        long j8 = this.priceAmountMicros;
        return this.formattedPrice.hashCode() + a.c(((int) (j8 ^ (j8 >>> 32))) * 31, 31, this.priceCurrencyCode);
    }

    /* renamed from: isFree, reason: from getter */
    public final boolean getIsFree() {
        return this.isFree;
    }

    @NotNull
    public String toString() {
        long j8 = this.priceAmountMicros;
        String str = this.priceCurrencyCode;
        String str2 = this.formattedPrice;
        StringBuilder sb2 = new StringBuilder("QProductPrice(priceAmountMicros=");
        sb2.append(j8);
        sb2.append(", priceCurrencyCode=");
        sb2.append(str);
        return M6.t(sb2, ", formattedPrice=", str2, ")");
    }
}
