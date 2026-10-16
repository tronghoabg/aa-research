package com.qonversion.android.sdk.dto;

import cb.AbstractC1593a;
import com.qonversion.android.sdk.dto.products.QProduct;
import ff.x;
import hb.AbstractC2797C;
import hb.K;
import hb.P;
import hb.r;
import hb.u;
import hb.w;
import ib.d;
import ib.f;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;", "Lhb/r;", "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;", "Lhb/K;", "moshi", "<init>", "(Lhb/K;)V", "", "toString", "()Ljava/lang/String;", "Lhb/w;", "reader", "fromJson", "(Lhb/w;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions;", "Lhb/C;", "writer", "value_", "Lef/C;", "toJson", "(Lhb/C;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V", "Lhb/u;", "options", "Lhb/u;", "", "nullableListOfStringAdapter", "Lhb/r;", "nullableStringAdapter", "", "booleanAdapter", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "nullableQProductAdapter", "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;", "nullableQPurchaseUpdatePolicyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QPurchaseOptionsJsonAdapter extends r {

    @NotNull
    private final r booleanAdapter;

    @Nullable
    private volatile Constructor<QPurchaseOptions> constructorRef;

    @NotNull
    private final r nullableListOfStringAdapter;

    @NotNull
    private final r nullableQProductAdapter;

    @NotNull
    private final r nullableQPurchaseUpdatePolicyAdapter;

    @NotNull
    private final r nullableStringAdapter;

    @NotNull
    private final u options;

    public QPurchaseOptionsJsonAdapter(@NotNull K moshi) {
        AbstractC3340k.e(moshi, "moshi");
        this.options = u.a("contextKeys", "offerId", "applyOffer", "oldProduct", "updatePolicy", "screenUid");
        d dVarF = P.f(List.class, String.class);
        x xVar = x.f35434a;
        this.nullableListOfStringAdapter = moshi.c(dVarF, xVar, "contextKeys");
        this.nullableStringAdapter = moshi.c(String.class, xVar, "offerId");
        this.booleanAdapter = moshi.c(Boolean.TYPE, xVar, "applyOffer");
        this.nullableQProductAdapter = moshi.c(QProduct.class, xVar, "oldProduct");
        this.nullableQPurchaseUpdatePolicyAdapter = moshi.c(QPurchaseUpdatePolicy.class, xVar, "updatePolicy");
    }

    @NotNull
    public String toString() {
        return AbstractC1593a.g(38, "GeneratedJsonAdapter(QPurchaseOptions)", "toString(...)");
    }

    @Override // hb.r
    @NotNull
    public QPurchaseOptions fromJson(@NotNull w reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AbstractC3340k.e(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.b();
        int i5 = -1;
        List list = null;
        String str = null;
        QProduct qProduct = null;
        QPurchaseUpdatePolicy qPurchaseUpdatePolicy = null;
        String str2 = null;
        while (reader.o()) {
            switch (reader.W(this.options)) {
                case -1:
                    reader.Y();
                    reader.Z();
                    break;
                case 0:
                    list = (List) this.nullableListOfStringAdapter.fromJson(reader);
                    i5 &= -2;
                    break;
                case 1:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    i5 &= -3;
                    break;
                case 2:
                    bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw f.l("applyOffer", "applyOffer", reader);
                    }
                    i5 &= -5;
                    break;
                case 3:
                    qProduct = (QProduct) this.nullableQProductAdapter.fromJson(reader);
                    i5 &= -9;
                    break;
                case 4:
                    qPurchaseUpdatePolicy = (QPurchaseUpdatePolicy) this.nullableQPurchaseUpdatePolicyAdapter.fromJson(reader);
                    i5 &= -17;
                    break;
                case 5:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    i5 &= -33;
                    break;
            }
        }
        reader.h();
        if (i5 == -64) {
            return new QPurchaseOptions(list, str, bool.booleanValue(), qProduct, qPurchaseUpdatePolicy, str2);
        }
        Constructor<QPurchaseOptions> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = QPurchaseOptions.class.getDeclaredConstructor(List.class, String.class, Boolean.TYPE, QProduct.class, QPurchaseUpdatePolicy.class, String.class, Integer.TYPE, f.f36941c);
            this.constructorRef = declaredConstructor;
            AbstractC3340k.d(declaredConstructor, "also(...)");
        }
        QPurchaseOptions qPurchaseOptionsNewInstance = declaredConstructor.newInstance(list, str, bool, qProduct, qPurchaseUpdatePolicy, str2, Integer.valueOf(i5), null);
        AbstractC3340k.d(qPurchaseOptionsNewInstance, "newInstance(...)");
        return qPurchaseOptionsNewInstance;
    }

    @Override // hb.r
    public void toJson(@NotNull AbstractC2797C writer, @Nullable QPurchaseOptions value_) {
        AbstractC3340k.e(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.w("contextKeys");
        this.nullableListOfStringAdapter.toJson(writer, value_.getContextKeys$sdk_release());
        writer.w("offerId");
        this.nullableStringAdapter.toJson(writer, value_.getOfferId());
        writer.w("applyOffer");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getApplyOffer()));
        writer.w("oldProduct");
        this.nullableQProductAdapter.toJson(writer, value_.getOldProduct());
        writer.w("updatePolicy");
        this.nullableQPurchaseUpdatePolicyAdapter.toJson(writer, value_.getUpdatePolicy());
        writer.w("screenUid");
        this.nullableStringAdapter.toJson(writer, value_.getScreenUid());
        writer.i();
    }
}
