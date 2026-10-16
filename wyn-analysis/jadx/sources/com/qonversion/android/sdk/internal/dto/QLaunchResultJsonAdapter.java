package com.qonversion.android.sdk.internal.dto;

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
import ib.f;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R&\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001c0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R&\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R.\u0010#\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\"\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QLaunchResultJsonAdapter;", "Lhb/r;", "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;", "Lhb/K;", "moshi", "<init>", "(Lhb/K;)V", "", "toString", "()Ljava/lang/String;", "Lhb/w;", "reader", "fromJson", "(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;", "Lhb/C;", "writer", "value_", "Lef/C;", "toJson", "(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V", "Lhb/u;", "options", "Lhb/u;", "stringAdapter", "Lhb/r;", "Ljava/util/Date;", "dateAdapter", "", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "mapOfStringQProductAdapter", "Lcom/qonversion/android/sdk/internal/dto/QPermission;", "mapOfStringQPermissionAdapter", "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;", "nullableQOfferingsAdapter", "", "nullableMapOfStringListOfStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QLaunchResultJsonAdapter extends r {

    @Nullable
    private volatile Constructor<QLaunchResult> constructorRef;

    @NotNull
    private final r dateAdapter;

    @NotNull
    private final r mapOfStringQPermissionAdapter;

    @NotNull
    private final r mapOfStringQProductAdapter;

    @NotNull
    private final r nullableMapOfStringListOfStringAdapter;

    @NotNull
    private final r nullableQOfferingsAdapter;

    @NotNull
    private final u options;

    @NotNull
    private final r stringAdapter;

    public QLaunchResultJsonAdapter(@NotNull K moshi) {
        AbstractC3340k.e(moshi, "moshi");
        this.options = u.a("uid", "timestamp", "products", "permissions", "user_products", "offerings", "products_permissions");
        x xVar = x.f35434a;
        this.stringAdapter = moshi.c(String.class, xVar, "uid");
        this.dateAdapter = moshi.c(Date.class, xVar, "date");
        this.mapOfStringQProductAdapter = moshi.c(P.f(Map.class, String.class, QProduct.class), xVar, "products");
        this.mapOfStringQPermissionAdapter = moshi.c(P.f(Map.class, String.class, QPermission.class), xVar, "permissions");
        this.nullableQOfferingsAdapter = moshi.c(QOfferings.class, xVar, "offerings");
        this.nullableMapOfStringListOfStringAdapter = moshi.c(P.f(Map.class, String.class, P.f(List.class, String.class)), xVar, "productPermissions");
    }

    @NotNull
    public String toString() {
        return AbstractC1593a.g(35, "GeneratedJsonAdapter(QLaunchResult)", "toString(...)");
    }

    @Override // hb.r
    @NotNull
    public QLaunchResult fromJson(@NotNull w reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        char c10;
        AbstractC3340k.e(reader, "reader");
        reader.b();
        int i5 = -1;
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        String str = null;
        Date date = null;
        QOfferings qOfferings = null;
        Map map4 = null;
        while (reader.o()) {
            switch (reader.W(this.options)) {
                case -1:
                    reader.Y();
                    reader.Z();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw f.l("uid", "uid", reader);
                    }
                    break;
                case 1:
                    date = (Date) this.dateAdapter.fromJson(reader);
                    if (date == null) {
                        throw f.l("date", "timestamp", reader);
                    }
                    break;
                case 2:
                    map3 = (Map) this.mapOfStringQProductAdapter.fromJson(reader);
                    if (map3 == null) {
                        throw f.l("products", "products", reader);
                    }
                    i5 &= -5;
                    break;
                case 3:
                    map = (Map) this.mapOfStringQPermissionAdapter.fromJson(reader);
                    if (map == null) {
                        throw f.l("permissions", "permissions", reader);
                    }
                    i5 &= -9;
                    break;
                case 4:
                    map2 = (Map) this.mapOfStringQProductAdapter.fromJson(reader);
                    if (map2 == null) {
                        throw f.l("userProducts", "user_products", reader);
                    }
                    i5 &= -17;
                    break;
                case 5:
                    qOfferings = (QOfferings) this.nullableQOfferingsAdapter.fromJson(reader);
                    break;
                case 6:
                    map4 = (Map) this.nullableMapOfStringListOfStringAdapter.fromJson(reader);
                    i5 &= -65;
                    break;
            }
        }
        reader.h();
        if (i5 == -93) {
            if (str == null) {
                throw f.f("uid", "uid", reader);
            }
            if (date == null) {
                throw f.f("date", "timestamp", reader);
            }
            AbstractC3340k.c(map3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.qonversion.android.sdk.dto.products.QProduct>");
            AbstractC3340k.c(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.qonversion.android.sdk.internal.dto.QPermission>");
            AbstractC3340k.c(map2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.qonversion.android.sdk.dto.products.QProduct>");
            return new QLaunchResult(str, date, map3, map, map2, qOfferings, map4);
        }
        Constructor<QLaunchResult> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            c10 = 2;
            declaredConstructor = QLaunchResult.class.getDeclaredConstructor(String.class, Date.class, Map.class, Map.class, Map.class, QOfferings.class, Map.class, Integer.TYPE, f.f36941c);
            this.constructorRef = declaredConstructor;
            AbstractC3340k.d(declaredConstructor, "also(...)");
        } else {
            c10 = 2;
        }
        if (str == null) {
            throw f.f("uid", "uid", reader);
        }
        if (date == null) {
            throw f.f("date", "timestamp", reader);
        }
        Integer numValueOf = Integer.valueOf(i5);
        Object[] objArr = new Object[9];
        objArr[0] = str;
        objArr[1] = date;
        objArr[c10] = map3;
        objArr[3] = map;
        objArr[4] = map2;
        objArr[5] = qOfferings;
        objArr[6] = map4;
        objArr[7] = numValueOf;
        objArr[8] = null;
        QLaunchResult qLaunchResultNewInstance = declaredConstructor.newInstance(objArr);
        AbstractC3340k.d(qLaunchResultNewInstance, "newInstance(...)");
        return qLaunchResultNewInstance;
    }

    @Override // hb.r
    public void toJson(@NotNull AbstractC2797C writer, @Nullable QLaunchResult value_) {
        AbstractC3340k.e(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.w("uid");
        this.stringAdapter.toJson(writer, value_.getUid());
        writer.w("timestamp");
        this.dateAdapter.toJson(writer, value_.getDate());
        writer.w("products");
        this.mapOfStringQProductAdapter.toJson(writer, value_.getProducts());
        writer.w("permissions");
        this.mapOfStringQPermissionAdapter.toJson(writer, value_.getPermissions$sdk_release());
        writer.w("user_products");
        this.mapOfStringQProductAdapter.toJson(writer, value_.getUserProducts());
        writer.w("offerings");
        this.nullableQOfferingsAdapter.toJson(writer, value_.getOfferings());
        writer.w("products_permissions");
        this.nullableMapOfStringListOfStringAdapter.toJson(writer, value_.getProductPermissions$sdk_release());
        writer.i();
    }
}
