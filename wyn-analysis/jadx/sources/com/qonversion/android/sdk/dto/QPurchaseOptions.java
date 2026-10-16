package com.qonversion.android.sdk.dto;

import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.dto.products.QProductOfferDetails;
import hb.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019BS\b\u0000\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/qonversion/android/sdk/dto/QPurchaseOptions;", "", "contextKeys", "", "", "offerId", "applyOffer", "", "oldProduct", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "updatePolicy", "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;", "screenUid", "(Ljava/util/List;Ljava/lang/String;ZLcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Ljava/lang/String;)V", "getApplyOffer$sdk_release", "()Z", "getContextKeys$sdk_release", "()Ljava/util/List;", "getOfferId$sdk_release", "()Ljava/lang/String;", "getOldProduct$sdk_release", "()Lcom/qonversion/android/sdk/dto/products/QProduct;", "getScreenUid$sdk_release", "getUpdatePolicy$sdk_release", "()Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;", "Builder", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QPurchaseOptions {
    private final boolean applyOffer;

    @Nullable
    private final List<String> contextKeys;

    @Nullable
    private final String offerId;

    @Nullable
    private final QProduct oldProduct;

    @Nullable
    private final String screenUid;

    @Nullable
    private final QPurchaseUpdatePolicy updatePolicy;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0000J\u0014\u0010\u0011\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;", "", "()V", "applyOffer", "", "contextKeys", "", "", "offerId", "oldProduct", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "screenUid", "updatePolicy", "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;", "build", "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;", "removeOffer", "setContextKeys", "setOffer", "offer", "Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;", "setOfferId", "setOldProduct", "setScreenUid", "setUpdatePolicy", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private boolean applyOffer = true;

        @Nullable
        private List<String> contextKeys;

        @Nullable
        private String offerId;

        @Nullable
        private QProduct oldProduct;

        @Nullable
        private String screenUid;

        @Nullable
        private QPurchaseUpdatePolicy updatePolicy;

        @NotNull
        public final QPurchaseOptions build() {
            return new QPurchaseOptions(this.contextKeys, this.offerId, this.applyOffer, this.oldProduct, this.updatePolicy, this.screenUid);
        }

        @NotNull
        public final Builder removeOffer() {
            this.applyOffer = false;
            return this;
        }

        @NotNull
        public final Builder setContextKeys(@NotNull List<String> contextKeys) {
            AbstractC3340k.e(contextKeys, "contextKeys");
            this.contextKeys = contextKeys;
            return this;
        }

        @NotNull
        public final Builder setOffer(@NotNull QProductOfferDetails offer) {
            AbstractC3340k.e(offer, "offer");
            this.offerId = offer.getOfferId();
            return this;
        }

        @NotNull
        public final Builder setOfferId(@NotNull String offerId) {
            AbstractC3340k.e(offerId, "offerId");
            this.offerId = offerId;
            return this;
        }

        @NotNull
        public final Builder setOldProduct(@NotNull QProduct oldProduct) {
            AbstractC3340k.e(oldProduct, "oldProduct");
            this.oldProduct = oldProduct;
            return this;
        }

        @NotNull
        public final Builder setScreenUid(@NotNull String screenUid) {
            AbstractC3340k.e(screenUid, "screenUid");
            this.screenUid = screenUid;
            return this;
        }

        @NotNull
        public final Builder setUpdatePolicy(@NotNull QPurchaseUpdatePolicy updatePolicy) {
            AbstractC3340k.e(updatePolicy, "updatePolicy");
            this.updatePolicy = updatePolicy;
            return this;
        }
    }

    public QPurchaseOptions() {
        this(null, null, false, null, null, null, 63, null);
    }

    /* renamed from: getApplyOffer$sdk_release, reason: from getter */
    public final boolean getApplyOffer() {
        return this.applyOffer;
    }

    @Nullable
    public final List<String> getContextKeys$sdk_release() {
        return this.contextKeys;
    }

    @Nullable
    /* renamed from: getOfferId$sdk_release, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    @Nullable
    /* renamed from: getOldProduct$sdk_release, reason: from getter */
    public final QProduct getOldProduct() {
        return this.oldProduct;
    }

    @Nullable
    /* renamed from: getScreenUid$sdk_release, reason: from getter */
    public final String getScreenUid() {
        return this.screenUid;
    }

    @Nullable
    /* renamed from: getUpdatePolicy$sdk_release, reason: from getter */
    public final QPurchaseUpdatePolicy getUpdatePolicy() {
        return this.updatePolicy;
    }

    public QPurchaseOptions(@Nullable List<String> list, @Nullable String str, boolean z2, @Nullable QProduct qProduct, @Nullable QPurchaseUpdatePolicy qPurchaseUpdatePolicy, @Nullable String str2) {
        this.contextKeys = list;
        this.offerId = str;
        this.applyOffer = z2;
        this.oldProduct = qProduct;
        this.updatePolicy = qPurchaseUpdatePolicy;
        this.screenUid = str2;
    }

    public /* synthetic */ QPurchaseOptions(List list, String str, boolean z2, QProduct qProduct, QPurchaseUpdatePolicy qPurchaseUpdatePolicy, String str2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : list, (i5 & 2) != 0 ? null : str, (i5 & 4) != 0 ? true : z2, (i5 & 8) != 0 ? null : qProduct, (i5 & 16) != 0 ? null : qPurchaseUpdatePolicy, (i5 & 32) != 0 ? null : str2);
    }
}
