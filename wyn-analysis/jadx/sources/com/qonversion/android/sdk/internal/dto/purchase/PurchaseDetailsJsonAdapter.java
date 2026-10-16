package com.qonversion.android.sdk.internal.dto.purchase;

import cb.AbstractC1593a;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventTypes;
import ff.x;
import hb.AbstractC2797C;
import hb.K;
import hb.P;
import hb.r;
import hb.u;
import hb.w;
import ib.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;", "Lhb/r;", "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;", "Lhb/K;", "moshi", "<init>", "(Lhb/K;)V", "", "toString", "()Ljava/lang/String;", "Lhb/w;", "reader", "fromJson", "(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;", "Lhb/C;", "writer", "value_", "Lef/C;", "toJson", "(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;)V", "Lhb/u;", "options", "Lhb/u;", "stringAdapter", "Lhb/r;", "", "longAdapter", "", "nullableListOfStringAdapter", "nullableStringAdapter", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PurchaseDetailsJsonAdapter extends r {

    @NotNull
    private final r longAdapter;

    @NotNull
    private final r nullableListOfStringAdapter;

    @NotNull
    private final r nullableStringAdapter;

    @NotNull
    private final u options;

    @NotNull
    private final r stringAdapter;

    public PurchaseDetailsJsonAdapter(@NotNull K moshi) {
        AbstractC3340k.e(moshi, "moshi");
        this.options = u.a("purchase_token", "purchase_time", AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, "original_transaction_id", AppLovinEventTypes.USER_VIEWED_PRODUCT, "product_id", "context_keys", "screen_uid");
        x xVar = x.f35434a;
        this.stringAdapter = moshi.c(String.class, xVar, "purchaseToken");
        this.longAdapter = moshi.c(Long.TYPE, xVar, "purchaseTime");
        this.nullableListOfStringAdapter = moshi.c(P.f(List.class, String.class), xVar, "contextKeys");
        this.nullableStringAdapter = moshi.c(String.class, xVar, "screenUid");
    }

    @NotNull
    public String toString() {
        return AbstractC1593a.g(37, "GeneratedJsonAdapter(PurchaseDetails)", "toString(...)");
    }

    @Override // hb.r
    @NotNull
    public PurchaseDetails fromJson(@NotNull w reader) {
        AbstractC3340k.e(reader, "reader");
        reader.b();
        Long l10 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list = null;
        String str6 = null;
        while (true) {
            Long l11 = l10;
            String str7 = str;
            String str8 = str2;
            String str9 = str3;
            String str10 = str4;
            String str11 = str5;
            if (!reader.o()) {
                List list2 = list;
                reader.h();
                if (str7 == null) {
                    throw f.f("purchaseToken", "purchase_token", reader);
                }
                if (l11 == null) {
                    throw f.f("purchaseTime", "purchase_time", reader);
                }
                long jLongValue = l11.longValue();
                if (str8 == null) {
                    throw f.f("transactionId", AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, reader);
                }
                if (str9 == null) {
                    throw f.f("originalTransactionId", "original_transaction_id", reader);
                }
                if (str10 == null) {
                    throw f.f("storeProductId", AppLovinEventTypes.USER_VIEWED_PRODUCT, reader);
                }
                if (str11 != null) {
                    return new PurchaseDetails(str7, jLongValue, str8, str9, str10, str11, list2, str6);
                }
                throw f.f("qProductId", "product_id", reader);
            }
            List list3 = list;
            switch (reader.W(this.options)) {
                case -1:
                    reader.Y();
                    reader.Z();
                    l10 = l11;
                    list = list3;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                    str5 = str11;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw f.l("purchaseToken", "purchase_token", reader);
                    }
                    l10 = l11;
                    list = list3;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                    str5 = str11;
                case 1:
                    l10 = (Long) this.longAdapter.fromJson(reader);
                    if (l10 == null) {
                        throw f.l("purchaseTime", "purchase_time", reader);
                    }
                    list = list3;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                    str5 = str11;
                case 2:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw f.l("transactionId", AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, reader);
                    }
                    l10 = l11;
                    list = list3;
                    str = str7;
                    str3 = str9;
                    str4 = str10;
                    str5 = str11;
                case 3:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw f.l("originalTransactionId", "original_transaction_id", reader);
                    }
                    l10 = l11;
                    list = list3;
                    str = str7;
                    str2 = str8;
                    str4 = str10;
                    str5 = str11;
                case 4:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw f.l("storeProductId", AppLovinEventTypes.USER_VIEWED_PRODUCT, reader);
                    }
                    l10 = l11;
                    list = list3;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str5 = str11;
                case 5:
                    String str12 = (String) this.stringAdapter.fromJson(reader);
                    if (str12 == null) {
                        throw f.l("qProductId", "product_id", reader);
                    }
                    str5 = str12;
                    l10 = l11;
                    list = list3;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                case 6:
                    list = (List) this.nullableListOfStringAdapter.fromJson(reader);
                    l10 = l11;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                    str5 = str11;
                case 7:
                    str6 = (String) this.nullableStringAdapter.fromJson(reader);
                    l10 = l11;
                    list = list3;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                    str5 = str11;
                default:
                    l10 = l11;
                    list = list3;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                    str5 = str11;
            }
        }
    }

    @Override // hb.r
    public void toJson(@NotNull AbstractC2797C writer, @Nullable PurchaseDetails value_) {
        AbstractC3340k.e(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.w("purchase_token");
        this.stringAdapter.toJson(writer, value_.getPurchaseToken());
        writer.w("purchase_time");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getPurchaseTime()));
        writer.w(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER);
        this.stringAdapter.toJson(writer, value_.getTransactionId());
        writer.w("original_transaction_id");
        this.stringAdapter.toJson(writer, value_.getOriginalTransactionId());
        writer.w(AppLovinEventTypes.USER_VIEWED_PRODUCT);
        this.stringAdapter.toJson(writer, value_.getStoreProductId());
        writer.w("product_id");
        this.stringAdapter.toJson(writer, value_.getQProductId());
        writer.w("context_keys");
        this.nullableListOfStringAdapter.toJson(writer, value_.getContextKeys());
        writer.w("screen_uid");
        this.nullableStringAdapter.toJson(writer, value_.getScreenUid());
        writer.i();
    }
}
