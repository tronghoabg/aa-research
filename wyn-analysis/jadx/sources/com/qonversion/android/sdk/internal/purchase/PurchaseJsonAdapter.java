package com.qonversion.android.sdk.internal.purchase;

import cb.AbstractC1593a;
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

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;", "Lhb/r;", "Lcom/qonversion/android/sdk/internal/purchase/Purchase;", "Lhb/K;", "moshi", "<init>", "(Lhb/K;)V", "", "toString", "()Ljava/lang/String;", "Lhb/w;", "reader", "fromJson", "(Lhb/w;)Lcom/qonversion/android/sdk/internal/purchase/Purchase;", "Lhb/C;", "writer", "value_", "Lef/C;", "toJson", "(Lhb/C;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V", "Lhb/u;", "options", "Lhb/u;", "nullableStringAdapter", "Lhb/r;", "stringAdapter", "", "longAdapter", "", "nullableListOfStringAdapter", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PurchaseJsonAdapter extends r {

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

    public PurchaseJsonAdapter(@NotNull K moshi) {
        AbstractC3340k.e(moshi, "moshi");
        this.options = u.a("storeProductId", "orderId", "originalOrderId", "purchaseTime", "purchaseToken", "contextKeys", "screenUid");
        x xVar = x.f35434a;
        this.nullableStringAdapter = moshi.c(String.class, xVar, "storeProductId");
        this.stringAdapter = moshi.c(String.class, xVar, "orderId");
        this.longAdapter = moshi.c(Long.TYPE, xVar, "purchaseTime");
        this.nullableListOfStringAdapter = moshi.c(P.f(List.class, String.class), xVar, "contextKeys");
    }

    @NotNull
    public String toString() {
        return AbstractC1593a.g(30, "GeneratedJsonAdapter(Purchase)", "toString(...)");
    }

    @Override // hb.r
    @NotNull
    public Purchase fromJson(@NotNull w reader) {
        AbstractC3340k.e(reader, "reader");
        reader.b();
        Long l10 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        String str5 = null;
        while (reader.o()) {
            switch (reader.W(this.options)) {
                case -1:
                    reader.Y();
                    reader.Z();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw f.l("orderId", "orderId", reader);
                    }
                    break;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw f.l("originalOrderId", "originalOrderId", reader);
                    }
                    break;
                case 3:
                    l10 = (Long) this.longAdapter.fromJson(reader);
                    if (l10 == null) {
                        throw f.l("purchaseTime", "purchaseTime", reader);
                    }
                    break;
                case 4:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw f.l("purchaseToken", "purchaseToken", reader);
                    }
                    break;
                case 5:
                    list = (List) this.nullableListOfStringAdapter.fromJson(reader);
                    break;
                case 6:
                    str5 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.h();
        if (str2 == null) {
            throw f.f("orderId", "orderId", reader);
        }
        if (str3 == null) {
            throw f.f("originalOrderId", "originalOrderId", reader);
        }
        if (l10 == null) {
            throw f.f("purchaseTime", "purchaseTime", reader);
        }
        long jLongValue = l10.longValue();
        if (str4 != null) {
            return new Purchase(str, str2, str3, jLongValue, str4, list, str5);
        }
        throw f.f("purchaseToken", "purchaseToken", reader);
    }

    @Override // hb.r
    public void toJson(@NotNull AbstractC2797C writer, @Nullable Purchase value_) {
        AbstractC3340k.e(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.w("storeProductId");
        this.nullableStringAdapter.toJson(writer, value_.getStoreProductId());
        writer.w("orderId");
        this.stringAdapter.toJson(writer, value_.getOrderId());
        writer.w("originalOrderId");
        this.stringAdapter.toJson(writer, value_.getOriginalOrderId());
        writer.w("purchaseTime");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getPurchaseTime()));
        writer.w("purchaseToken");
        this.stringAdapter.toJson(writer, value_.getPurchaseToken());
        writer.w("contextKeys");
        this.nullableListOfStringAdapter.toJson(writer, value_.getContextKeys());
        writer.w("screenUid");
        this.nullableStringAdapter.toJson(writer, value_.getScreenUid());
        writer.i();
    }
}
