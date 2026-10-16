package com.qonversion.android.sdk.dto;

import cb.AbstractC1593a;
import com.qonversion.android.sdk.dto.offerings.QOfferings;
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
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR.\u0010\u001e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001d\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/qonversion/android/sdk/dto/QFallbackObjectJsonAdapter;", "Lhb/r;", "Lcom/qonversion/android/sdk/dto/QFallbackObject;", "Lhb/K;", "moshi", "<init>", "(Lhb/K;)V", "", "toString", "()Ljava/lang/String;", "Lhb/w;", "reader", "fromJson", "(Lhb/w;)Lcom/qonversion/android/sdk/dto/QFallbackObject;", "Lhb/C;", "writer", "value_", "Lef/C;", "toJson", "(Lhb/C;Lcom/qonversion/android/sdk/dto/QFallbackObject;)V", "Lhb/u;", "options", "Lhb/u;", "", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "mapOfStringQProductAdapter", "Lhb/r;", "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;", "nullableQOfferingsAdapter", "", "nullableMapOfStringListOfStringAdapter", "Lcom/qonversion/android/sdk/dto/QRemoteConfigList;", "nullableQRemoteConfigListAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QFallbackObjectJsonAdapter extends r {

    @Nullable
    private volatile Constructor<QFallbackObject> constructorRef;

    @NotNull
    private final r mapOfStringQProductAdapter;

    @NotNull
    private final r nullableMapOfStringListOfStringAdapter;

    @NotNull
    private final r nullableQOfferingsAdapter;

    @NotNull
    private final r nullableQRemoteConfigListAdapter;

    @NotNull
    private final u options;

    public QFallbackObjectJsonAdapter(@NotNull K moshi) {
        AbstractC3340k.e(moshi, "moshi");
        this.options = u.a("products", "offerings", "products_permissions", "remote_config_list");
        d dVarF = P.f(Map.class, String.class, QProduct.class);
        x xVar = x.f35434a;
        this.mapOfStringQProductAdapter = moshi.c(dVarF, xVar, "products");
        this.nullableQOfferingsAdapter = moshi.c(QOfferings.class, xVar, "offerings");
        this.nullableMapOfStringListOfStringAdapter = moshi.c(P.f(Map.class, String.class, P.f(List.class, String.class)), xVar, "productPermissions");
        this.nullableQRemoteConfigListAdapter = moshi.c(QRemoteConfigList.class, xVar, "remoteConfigList");
    }

    @NotNull
    public String toString() {
        return AbstractC1593a.g(37, "GeneratedJsonAdapter(QFallbackObject)", "toString(...)");
    }

    @Override // hb.r
    @NotNull
    public QFallbackObject fromJson(@NotNull w reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AbstractC3340k.e(reader, "reader");
        reader.b();
        Map map = null;
        QOfferings qOfferings = null;
        Map map2 = null;
        QRemoteConfigList qRemoteConfigList = null;
        int i5 = -1;
        while (reader.o()) {
            int iW = reader.W(this.options);
            if (iW == -1) {
                reader.Y();
                reader.Z();
            } else if (iW == 0) {
                map = (Map) this.mapOfStringQProductAdapter.fromJson(reader);
                if (map == null) {
                    throw f.l("products", "products", reader);
                }
                i5 = -2;
            } else if (iW == 1) {
                qOfferings = (QOfferings) this.nullableQOfferingsAdapter.fromJson(reader);
            } else if (iW == 2) {
                map2 = (Map) this.nullableMapOfStringListOfStringAdapter.fromJson(reader);
            } else if (iW == 3) {
                qRemoteConfigList = (QRemoteConfigList) this.nullableQRemoteConfigListAdapter.fromJson(reader);
            }
        }
        reader.h();
        if (i5 == -2) {
            AbstractC3340k.c(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.qonversion.android.sdk.dto.products.QProduct>");
            return new QFallbackObject(map, qOfferings, map2, qRemoteConfigList);
        }
        Constructor<QFallbackObject> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = QFallbackObject.class.getDeclaredConstructor(Map.class, QOfferings.class, Map.class, QRemoteConfigList.class, Integer.TYPE, f.f36941c);
            this.constructorRef = declaredConstructor;
            AbstractC3340k.d(declaredConstructor, "also(...)");
        }
        QFallbackObject qFallbackObjectNewInstance = declaredConstructor.newInstance(map, qOfferings, map2, qRemoteConfigList, Integer.valueOf(i5), null);
        AbstractC3340k.d(qFallbackObjectNewInstance, "newInstance(...)");
        return qFallbackObjectNewInstance;
    }

    @Override // hb.r
    public void toJson(@NotNull AbstractC2797C writer, @Nullable QFallbackObject value_) {
        AbstractC3340k.e(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.w("products");
        this.mapOfStringQProductAdapter.toJson(writer, value_.getProducts());
        writer.w("offerings");
        this.nullableQOfferingsAdapter.toJson(writer, value_.getOfferings());
        writer.w("products_permissions");
        this.nullableMapOfStringListOfStringAdapter.toJson(writer, value_.getProductPermissions());
        writer.w("remote_config_list");
        this.nullableQRemoteConfigListAdapter.toJson(writer, value_.getRemoteConfigList());
        writer.i();
    }
}
