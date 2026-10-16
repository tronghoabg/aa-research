package com.qonversion.android.sdk.dto.products;

import cb.AbstractC1593a;
import com.applovin.sdk.AppLovinEventParameters;
import ff.x;
import hb.AbstractC2797C;
import hb.K;
import hb.r;
import hb.u;
import hb.w;
import ib.f;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/qonversion/android/sdk/dto/products/QProductJsonAdapter;", "Lhb/r;", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "Lhb/K;", "moshi", "<init>", "(Lhb/K;)V", "", "toString", "()Ljava/lang/String;", "Lhb/w;", "reader", "fromJson", "(Lhb/w;)Lcom/qonversion/android/sdk/dto/products/QProduct;", "Lhb/C;", "writer", "value_", "Lef/C;", "toJson", "(Lhb/C;Lcom/qonversion/android/sdk/dto/products/QProduct;)V", "Lhb/u;", "options", "Lhb/u;", "stringAdapter", "Lhb/r;", "nullableStringAdapter", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QProductJsonAdapter extends r {

    @NotNull
    private final r nullableStringAdapter;

    @NotNull
    private final u options;

    @NotNull
    private final r stringAdapter;

    public QProductJsonAdapter(@NotNull K moshi) {
        AbstractC3340k.e(moshi, "moshi");
        this.options = u.a("id", AppLovinEventParameters.IN_APP_PURCHASE_TRANSACTION_IDENTIFIER, "base_plan_id");
        x xVar = x.f35434a;
        this.stringAdapter = moshi.c(String.class, xVar, "qonversionID");
        this.nullableStringAdapter = moshi.c(String.class, xVar, "storeID");
    }

    @NotNull
    public String toString() {
        return AbstractC1593a.g(30, "GeneratedJsonAdapter(QProduct)", "toString(...)");
    }

    @Override // hb.r
    @NotNull
    public QProduct fromJson(@NotNull w reader) {
        AbstractC3340k.e(reader, "reader");
        reader.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (reader.o()) {
            int iW = reader.W(this.options);
            if (iW == -1) {
                reader.Y();
                reader.Z();
            } else if (iW == 0) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw f.l("qonversionID", "id", reader);
                }
            } else if (iW == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(reader);
            } else if (iW == 2) {
                str3 = (String) this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.h();
        if (str != null) {
            return new QProduct(str, str2, str3);
        }
        throw f.f("qonversionID", "id", reader);
    }

    @Override // hb.r
    public void toJson(@NotNull AbstractC2797C writer, @Nullable QProduct value_) {
        AbstractC3340k.e(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.w("id");
        this.stringAdapter.toJson(writer, value_.getQonversionID());
        writer.w(AppLovinEventParameters.IN_APP_PURCHASE_TRANSACTION_IDENTIFIER);
        this.nullableStringAdapter.toJson(writer, value_.getStoreID());
        writer.w("base_plan_id");
        this.nullableStringAdapter.toJson(writer, value_.getBasePlanID());
        writer.i();
    }
}
