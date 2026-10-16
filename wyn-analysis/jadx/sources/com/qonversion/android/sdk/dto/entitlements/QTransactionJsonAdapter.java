package com.qonversion.android.sdk.dto.entitlements;

import cb.AbstractC1593a;
import com.applovin.sdk.AppLovinEventParameters;
import ff.x;
import hb.AbstractC2797C;
import hb.K;
import hb.r;
import hb.u;
import hb.w;
import ib.f;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018¨\u0006#"}, d2 = {"Lcom/qonversion/android/sdk/dto/entitlements/QTransactionJsonAdapter;", "Lhb/r;", "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;", "Lhb/K;", "moshi", "<init>", "(Lhb/K;)V", "", "toString", "()Ljava/lang/String;", "Lhb/w;", "reader", "fromJson", "(Lhb/w;)Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;", "Lhb/C;", "writer", "value_", "Lef/C;", "toJson", "(Lhb/C;Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;)V", "Lhb/u;", "options", "Lhb/u;", "stringAdapter", "Lhb/r;", "nullableStringAdapter", "Ljava/util/Date;", "dateAdapter", "nullableDateAdapter", "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;", "qTransactionOwnershipTypeAdapter", "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;", "qTransactionTypeAdapter", "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;", "qTransactionEnvironmentAdapter", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QTransactionJsonAdapter extends r {

    @NotNull
    private final r dateAdapter;

    @NotNull
    private final r nullableDateAdapter;

    @NotNull
    private final r nullableStringAdapter;

    @NotNull
    private final u options;

    @NotNull
    private final r qTransactionEnvironmentAdapter;

    @NotNull
    private final r qTransactionOwnershipTypeAdapter;

    @NotNull
    private final r qTransactionTypeAdapter;

    @NotNull
    private final r stringAdapter;

    public QTransactionJsonAdapter(@NotNull K moshi) {
        AbstractC3340k.e(moshi, "moshi");
        this.options = u.a("original_transaction_id", AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, "offer_code", "transaction_timestamp", "expiration_timestamp", "transaction_revoke_timestamp", "ownership_type", "type", "environment");
        x xVar = x.f35434a;
        this.stringAdapter = moshi.c(String.class, xVar, "originalTransactionId");
        this.nullableStringAdapter = moshi.c(String.class, xVar, "offerCode");
        this.dateAdapter = moshi.c(Date.class, xVar, "transactionDate");
        this.nullableDateAdapter = moshi.c(Date.class, xVar, "expirationDate");
        this.qTransactionOwnershipTypeAdapter = moshi.c(QTransactionOwnershipType.class, xVar, "ownershipType");
        this.qTransactionTypeAdapter = moshi.c(QTransactionType.class, xVar, "type");
        this.qTransactionEnvironmentAdapter = moshi.c(QTransactionEnvironment.class, xVar, "environment");
    }

    @NotNull
    public String toString() {
        return AbstractC1593a.g(34, "GeneratedJsonAdapter(QTransaction)", "toString(...)");
    }

    @Override // hb.r
    @NotNull
    public QTransaction fromJson(@NotNull w reader) {
        AbstractC3340k.e(reader, "reader");
        reader.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        Date date = null;
        Date date2 = null;
        Date date3 = null;
        QTransactionOwnershipType qTransactionOwnershipType = null;
        QTransactionType qTransactionType = null;
        QTransactionEnvironment qTransactionEnvironment = null;
        while (true) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            Date date4 = date;
            Date date5 = date2;
            if (!reader.o()) {
                Date date6 = date3;
                reader.h();
                if (str4 == null) {
                    throw f.f("originalTransactionId", "original_transaction_id", reader);
                }
                if (str5 == null) {
                    throw f.f("transactionId", AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, reader);
                }
                if (date4 == null) {
                    throw f.f("transactionDate", "transaction_timestamp", reader);
                }
                if (qTransactionOwnershipType == null) {
                    throw f.f("ownershipType", "ownership_type", reader);
                }
                if (qTransactionType == null) {
                    throw f.f("type", "type", reader);
                }
                if (qTransactionEnvironment != null) {
                    return new QTransaction(str4, str5, str6, date4, date5, date6, qTransactionOwnershipType, qTransactionType, qTransactionEnvironment);
                }
                throw f.f("environment", "environment", reader);
            }
            Date date7 = date3;
            switch (reader.W(this.options)) {
                case -1:
                    reader.Y();
                    reader.Z();
                    date3 = date7;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    date = date4;
                    date2 = date5;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw f.l("originalTransactionId", "original_transaction_id", reader);
                    }
                    date3 = date7;
                    str2 = str5;
                    str3 = str6;
                    date = date4;
                    date2 = date5;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw f.l("transactionId", AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, reader);
                    }
                    date3 = date7;
                    str = str4;
                    str3 = str6;
                    date = date4;
                    date2 = date5;
                case 2:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    date3 = date7;
                    str = str4;
                    str2 = str5;
                    date = date4;
                    date2 = date5;
                case 3:
                    date = (Date) this.dateAdapter.fromJson(reader);
                    if (date == null) {
                        throw f.l("transactionDate", "transaction_timestamp", reader);
                    }
                    date3 = date7;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    date2 = date5;
                case 4:
                    date2 = (Date) this.nullableDateAdapter.fromJson(reader);
                    date3 = date7;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    date = date4;
                case 5:
                    date3 = (Date) this.nullableDateAdapter.fromJson(reader);
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    date = date4;
                    date2 = date5;
                case 6:
                    qTransactionOwnershipType = (QTransactionOwnershipType) this.qTransactionOwnershipTypeAdapter.fromJson(reader);
                    if (qTransactionOwnershipType == null) {
                        throw f.l("ownershipType", "ownership_type", reader);
                    }
                    date3 = date7;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    date = date4;
                    date2 = date5;
                case 7:
                    qTransactionType = (QTransactionType) this.qTransactionTypeAdapter.fromJson(reader);
                    if (qTransactionType == null) {
                        throw f.l("type", "type", reader);
                    }
                    date3 = date7;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    date = date4;
                    date2 = date5;
                case 8:
                    qTransactionEnvironment = (QTransactionEnvironment) this.qTransactionEnvironmentAdapter.fromJson(reader);
                    if (qTransactionEnvironment == null) {
                        throw f.l("environment", "environment", reader);
                    }
                    date3 = date7;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    date = date4;
                    date2 = date5;
                default:
                    date3 = date7;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    date = date4;
                    date2 = date5;
            }
        }
    }

    @Override // hb.r
    public void toJson(@NotNull AbstractC2797C writer, @Nullable QTransaction value_) {
        AbstractC3340k.e(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.w("original_transaction_id");
        this.stringAdapter.toJson(writer, value_.getOriginalTransactionId());
        writer.w(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER);
        this.stringAdapter.toJson(writer, value_.getTransactionId());
        writer.w("offer_code");
        this.nullableStringAdapter.toJson(writer, value_.getOfferCode());
        writer.w("transaction_timestamp");
        this.dateAdapter.toJson(writer, value_.getTransactionDate());
        writer.w("expiration_timestamp");
        this.nullableDateAdapter.toJson(writer, value_.getExpirationDate());
        writer.w("transaction_revoke_timestamp");
        this.nullableDateAdapter.toJson(writer, value_.getTransactionRevocationDate());
        writer.w("ownership_type");
        this.qTransactionOwnershipTypeAdapter.toJson(writer, value_.getOwnershipType());
        writer.w("type");
        this.qTransactionTypeAdapter.toJson(writer, value_.getType());
        writer.w("environment");
        this.qTransactionEnvironmentAdapter.toJson(writer, value_.getEnvironment());
        writer.i();
    }
}
