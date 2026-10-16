package com.qonversion.android.sdk.internal.dto;

import cb.AbstractC1593a;
import com.qonversion.android.sdk.dto.entitlements.QEntitlementGrantType;
import com.qonversion.android.sdk.dto.entitlements.QEntitlementSource;
import com.qonversion.android.sdk.dto.entitlements.QTransaction;
import ff.x;
import hb.AbstractC2797C;
import hb.K;
import hb.P;
import hb.r;
import hb.u;
import hb.w;
import ib.f;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R \u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QPermissionJsonAdapter;", "Lhb/r;", "Lcom/qonversion/android/sdk/internal/dto/QPermission;", "Lhb/K;", "moshi", "<init>", "(Lhb/K;)V", "", "toString", "()Ljava/lang/String;", "Lhb/w;", "reader", "fromJson", "(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/QPermission;", "Lhb/C;", "writer", "value_", "Lef/C;", "toJson", "(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/QPermission;)V", "Lhb/u;", "options", "Lhb/u;", "stringAdapter", "Lhb/r;", "Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;", "qProductRenewStateAdapter", "Ljava/util/Date;", "dateAdapter", "nullableDateAdapter", "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;", "qEntitlementSourceAdapter", "", "intAdapter", "nullableStringAdapter", "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;", "qEntitlementGrantTypeAdapter", "", "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;", "listOfQTransactionAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QPermissionJsonAdapter extends r {

    @Nullable
    private volatile Constructor<QPermission> constructorRef;

    @NotNull
    private final r dateAdapter;

    @NotNull
    private final r intAdapter;

    @NotNull
    private final r listOfQTransactionAdapter;

    @NotNull
    private final r nullableDateAdapter;

    @NotNull
    private final r nullableStringAdapter;

    @NotNull
    private final u options;

    @NotNull
    private final r qEntitlementGrantTypeAdapter;

    @NotNull
    private final r qEntitlementSourceAdapter;

    @NotNull
    private final r qProductRenewStateAdapter;

    @NotNull
    private final r stringAdapter;

    public QPermissionJsonAdapter(@NotNull K moshi) {
        AbstractC3340k.e(moshi, "moshi");
        this.options = u.a("id", "associated_product", "renew_state", "started_timestamp", "expiration_timestamp", "source", "active", "renews_count", "trial_start_timestamp", "first_purchase_timestamp", "last_purchase_timestamp", "last_activated_offer_code", "grant_type", "auto_renew_disable_timestamp", "store_transactions");
        x xVar = x.f35434a;
        this.stringAdapter = moshi.c(String.class, xVar, "permissionID");
        this.qProductRenewStateAdapter = moshi.c(QProductRenewState.class, xVar, "renewState");
        this.dateAdapter = moshi.c(Date.class, xVar, "startedDate");
        this.nullableDateAdapter = moshi.c(Date.class, xVar, "expirationDate");
        this.qEntitlementSourceAdapter = moshi.c(QEntitlementSource.class, xVar, "source");
        this.intAdapter = moshi.c(Integer.TYPE, xVar, "active");
        this.nullableStringAdapter = moshi.c(String.class, xVar, "lastActivatedOfferCode");
        this.qEntitlementGrantTypeAdapter = moshi.c(QEntitlementGrantType.class, xVar, "grantType");
        this.listOfQTransactionAdapter = moshi.c(P.f(List.class, QTransaction.class), xVar, "transactions");
    }

    @NotNull
    public String toString() {
        return AbstractC1593a.g(33, "GeneratedJsonAdapter(QPermission)", "toString(...)");
    }

    @Override // hb.r
    @NotNull
    public QPermission fromJson(@NotNull w reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i5;
        AbstractC3340k.e(reader, "reader");
        Integer num = 0;
        reader.b();
        int i10 = -1;
        QEntitlementSource qEntitlementSource = null;
        QEntitlementGrantType qEntitlementGrantType = null;
        List list = null;
        String str = null;
        String str2 = null;
        QProductRenewState qProductRenewState = null;
        Date date = null;
        Date date2 = null;
        Integer num2 = null;
        Date date3 = null;
        Date date4 = null;
        Date date5 = null;
        String str3 = null;
        Date date6 = null;
        while (reader.o()) {
            switch (reader.W(this.options)) {
                case -1:
                    reader.Y();
                    reader.Z();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw f.l("permissionID", "id", reader);
                    }
                    break;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw f.l("productID", "associated_product", reader);
                    }
                    break;
                case 2:
                    qProductRenewState = (QProductRenewState) this.qProductRenewStateAdapter.fromJson(reader);
                    if (qProductRenewState == null) {
                        throw f.l("renewState", "renew_state", reader);
                    }
                    break;
                case 3:
                    date = (Date) this.dateAdapter.fromJson(reader);
                    if (date == null) {
                        throw f.l("startedDate", "started_timestamp", reader);
                    }
                    break;
                case 4:
                    date2 = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
                case 5:
                    qEntitlementSource = (QEntitlementSource) this.qEntitlementSourceAdapter.fromJson(reader);
                    if (qEntitlementSource == null) {
                        throw f.l("source", "source", reader);
                    }
                    i10 &= -33;
                    break;
                case 6:
                    num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw f.l("active", "active", reader);
                    }
                    break;
                case 7:
                    num = (Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw f.l("renewsCount", "renews_count", reader);
                    }
                    i10 &= -129;
                    break;
                case 8:
                    date3 = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
                case 9:
                    date4 = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
                case 10:
                    date5 = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
                case 11:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 12:
                    qEntitlementGrantType = (QEntitlementGrantType) this.qEntitlementGrantTypeAdapter.fromJson(reader);
                    if (qEntitlementGrantType == null) {
                        throw f.l("grantType", "grant_type", reader);
                    }
                    i10 &= -4097;
                    break;
                case 13:
                    date6 = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
                case 14:
                    list = (List) this.listOfQTransactionAdapter.fromJson(reader);
                    if (list == null) {
                        throw f.l("transactions", "store_transactions", reader);
                    }
                    i10 &= -16385;
                    break;
            }
        }
        reader.h();
        if (i10 == -20641) {
            if (str == null) {
                throw f.f("permissionID", "id", reader);
            }
            if (str2 == null) {
                throw f.f("productID", "associated_product", reader);
            }
            if (qProductRenewState == null) {
                throw f.f("renewState", "renew_state", reader);
            }
            if (date == null) {
                throw f.f("startedDate", "started_timestamp", reader);
            }
            AbstractC3340k.c(qEntitlementSource, "null cannot be cast to non-null type com.qonversion.android.sdk.dto.entitlements.QEntitlementSource");
            if (num2 == null) {
                throw f.f("active", "active", reader);
            }
            int iIntValue = num2.intValue();
            int iIntValue2 = num.intValue();
            AbstractC3340k.c(qEntitlementGrantType, "null cannot be cast to non-null type com.qonversion.android.sdk.dto.entitlements.QEntitlementGrantType");
            AbstractC3340k.c(list, "null cannot be cast to non-null type kotlin.collections.List<com.qonversion.android.sdk.dto.entitlements.QTransaction>");
            return new QPermission(str, str2, qProductRenewState, date, date2, qEntitlementSource, iIntValue, iIntValue2, date3, date4, date5, str3, qEntitlementGrantType, date6, list);
        }
        Constructor<QPermission> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            i5 = i10;
            Class cls = Integer.TYPE;
            declaredConstructor = QPermission.class.getDeclaredConstructor(String.class, String.class, QProductRenewState.class, Date.class, Date.class, QEntitlementSource.class, cls, cls, Date.class, Date.class, Date.class, String.class, QEntitlementGrantType.class, Date.class, List.class, cls, f.f36941c);
            this.constructorRef = declaredConstructor;
            AbstractC3340k.d(declaredConstructor, "also(...)");
        } else {
            i5 = i10;
        }
        if (str == null) {
            throw f.f("permissionID", "id", reader);
        }
        if (str2 == null) {
            throw f.f("productID", "associated_product", reader);
        }
        if (qProductRenewState == null) {
            throw f.f("renewState", "renew_state", reader);
        }
        if (date == null) {
            throw f.f("startedDate", "started_timestamp", reader);
        }
        if (num2 == null) {
            throw f.f("active", "active", reader);
        }
        QPermission qPermissionNewInstance = declaredConstructor.newInstance(str, str2, qProductRenewState, date, date2, qEntitlementSource, num2, num, date3, date4, date5, str3, qEntitlementGrantType, date6, list, Integer.valueOf(i5), null);
        AbstractC3340k.d(qPermissionNewInstance, "newInstance(...)");
        return qPermissionNewInstance;
    }

    @Override // hb.r
    public void toJson(@NotNull AbstractC2797C writer, @Nullable QPermission value_) {
        AbstractC3340k.e(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.w("id");
        this.stringAdapter.toJson(writer, value_.getPermissionID());
        writer.w("associated_product");
        this.stringAdapter.toJson(writer, value_.getProductID());
        writer.w("renew_state");
        this.qProductRenewStateAdapter.toJson(writer, value_.getRenewState());
        writer.w("started_timestamp");
        this.dateAdapter.toJson(writer, value_.getStartedDate());
        writer.w("expiration_timestamp");
        this.nullableDateAdapter.toJson(writer, value_.getExpirationDate());
        writer.w("source");
        this.qEntitlementSourceAdapter.toJson(writer, value_.getSource());
        writer.w("active");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getActive$sdk_release()));
        writer.w("renews_count");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getRenewsCount()));
        writer.w("trial_start_timestamp");
        this.nullableDateAdapter.toJson(writer, value_.getTrialStartDate());
        writer.w("first_purchase_timestamp");
        this.nullableDateAdapter.toJson(writer, value_.getFirstPurchaseDate());
        writer.w("last_purchase_timestamp");
        this.nullableDateAdapter.toJson(writer, value_.getLastPurchaseDate());
        writer.w("last_activated_offer_code");
        this.nullableStringAdapter.toJson(writer, value_.getLastActivatedOfferCode());
        writer.w("grant_type");
        this.qEntitlementGrantTypeAdapter.toJson(writer, value_.getGrantType());
        writer.w("auto_renew_disable_timestamp");
        this.nullableDateAdapter.toJson(writer, value_.getAutoRenewDisableDate());
        writer.w("store_transactions");
        this.listOfQTransactionAdapter.toJson(writer, value_.getTransactions());
        writer.i();
    }
}
