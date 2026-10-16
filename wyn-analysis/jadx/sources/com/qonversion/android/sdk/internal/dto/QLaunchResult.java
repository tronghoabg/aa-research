package com.qonversion.android.sdk.internal.dto;

import com.qonversion.android.sdk.dto.offerings.QOfferings;
import com.qonversion.android.sdk.dto.products.QProduct;
import ff.w;
import hb.InterfaceC2812o;
import hb.s;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0087\u0001\b\u0000\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\b\u0003\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0014\b\u0003\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u001c\b\u0003\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000f\u0018\u00010\u0007¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0007HÀ\u0003¢\u0006\u0002\b\"J\u0015\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003J\"\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000f\u0018\u00010\u0007HÀ\u0003¢\u0006\u0002\b&J\u0089\u0001\u0010'\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0003\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u00072\u0014\b\u0003\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\u001c\b\u0003\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000f\u0018\u00010\u0007HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000f\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016¨\u0006."}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;", "", "uid", "", "date", "Ljava/util/Date;", "products", "", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "permissions", "Lcom/qonversion/android/sdk/internal/dto/QPermission;", "userProducts", "offerings", "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;", "productPermissions", "", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/qonversion/android/sdk/dto/offerings/QOfferings;Ljava/util/Map;)V", "getDate", "()Ljava/util/Date;", "getOfferings", "()Lcom/qonversion/android/sdk/dto/offerings/QOfferings;", "getPermissions$sdk_release", "()Ljava/util/Map;", "setPermissions$sdk_release", "(Ljava/util/Map;)V", "getProductPermissions$sdk_release", "getProducts", "getUid", "()Ljava/lang/String;", "getUserProducts", "component1", "component2", "component3", "component4", "component4$sdk_release", "component5", "component6", "component7", "component7$sdk_release", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QLaunchResult {

    @NotNull
    private final Date date;

    @Nullable
    private final QOfferings offerings;

    @NotNull
    private Map<String, QPermission> permissions;

    @Nullable
    private final Map<String, List<String>> productPermissions;

    @NotNull
    private final Map<String, QProduct> products;

    @NotNull
    private final String uid;

    @NotNull
    private final Map<String, QProduct> userProducts;

    /* JADX WARN: Multi-variable type inference failed */
    public QLaunchResult(@InterfaceC2812o(name = "uid") @NotNull String uid, @InterfaceC2812o(name = "timestamp") @NotNull Date date, @InterfaceC2812o(name = "products") @NotNull Map<String, QProduct> products, @InterfaceC2812o(name = "permissions") @NotNull Map<String, QPermission> permissions, @InterfaceC2812o(name = "user_products") @NotNull Map<String, QProduct> userProducts, @InterfaceC2812o(name = "offerings") @Nullable QOfferings qOfferings, @InterfaceC2812o(name = "products_permissions") @Nullable Map<String, ? extends List<String>> map) {
        AbstractC3340k.e(uid, "uid");
        AbstractC3340k.e(date, "date");
        AbstractC3340k.e(products, "products");
        AbstractC3340k.e(permissions, "permissions");
        AbstractC3340k.e(userProducts, "userProducts");
        this.uid = uid;
        this.date = date;
        this.products = products;
        this.permissions = permissions;
        this.userProducts = userProducts;
        this.offerings = qOfferings;
        this.productPermissions = map;
    }

    public static /* synthetic */ QLaunchResult copy$default(QLaunchResult qLaunchResult, String str, Date date, Map map, Map map2, Map map3, QOfferings qOfferings, Map map4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = qLaunchResult.uid;
        }
        if ((i5 & 2) != 0) {
            date = qLaunchResult.date;
        }
        if ((i5 & 4) != 0) {
            map = qLaunchResult.products;
        }
        if ((i5 & 8) != 0) {
            map2 = qLaunchResult.permissions;
        }
        if ((i5 & 16) != 0) {
            map3 = qLaunchResult.userProducts;
        }
        if ((i5 & 32) != 0) {
            qOfferings = qLaunchResult.offerings;
        }
        if ((i5 & 64) != 0) {
            map4 = qLaunchResult.productPermissions;
        }
        QOfferings qOfferings2 = qOfferings;
        Map map5 = map4;
        Map map6 = map3;
        Map map7 = map;
        return qLaunchResult.copy(str, date, map7, map2, map6, qOfferings2, map5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    @NotNull
    public final Map<String, QProduct> component3() {
        return this.products;
    }

    @NotNull
    public final Map<String, QPermission> component4$sdk_release() {
        return this.permissions;
    }

    @NotNull
    public final Map<String, QProduct> component5() {
        return this.userProducts;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final QOfferings getOfferings() {
        return this.offerings;
    }

    @Nullable
    public final Map<String, List<String>> component7$sdk_release() {
        return this.productPermissions;
    }

    @NotNull
    public final QLaunchResult copy(@InterfaceC2812o(name = "uid") @NotNull String uid, @InterfaceC2812o(name = "timestamp") @NotNull Date date, @InterfaceC2812o(name = "products") @NotNull Map<String, QProduct> products, @InterfaceC2812o(name = "permissions") @NotNull Map<String, QPermission> permissions, @InterfaceC2812o(name = "user_products") @NotNull Map<String, QProduct> userProducts, @InterfaceC2812o(name = "offerings") @Nullable QOfferings offerings, @InterfaceC2812o(name = "products_permissions") @Nullable Map<String, ? extends List<String>> productPermissions) {
        AbstractC3340k.e(uid, "uid");
        AbstractC3340k.e(date, "date");
        AbstractC3340k.e(products, "products");
        AbstractC3340k.e(permissions, "permissions");
        AbstractC3340k.e(userProducts, "userProducts");
        return new QLaunchResult(uid, date, products, permissions, userProducts, offerings, productPermissions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QLaunchResult)) {
            return false;
        }
        QLaunchResult qLaunchResult = (QLaunchResult) other;
        return AbstractC3340k.a(this.uid, qLaunchResult.uid) && AbstractC3340k.a(this.date, qLaunchResult.date) && AbstractC3340k.a(this.products, qLaunchResult.products) && AbstractC3340k.a(this.permissions, qLaunchResult.permissions) && AbstractC3340k.a(this.userProducts, qLaunchResult.userProducts) && AbstractC3340k.a(this.offerings, qLaunchResult.offerings) && AbstractC3340k.a(this.productPermissions, qLaunchResult.productPermissions);
    }

    @NotNull
    public final Date getDate() {
        return this.date;
    }

    @Nullable
    public final QOfferings getOfferings() {
        return this.offerings;
    }

    @NotNull
    public final Map<String, QPermission> getPermissions$sdk_release() {
        return this.permissions;
    }

    @Nullable
    public final Map<String, List<String>> getProductPermissions$sdk_release() {
        return this.productPermissions;
    }

    @NotNull
    public final Map<String, QProduct> getProducts() {
        return this.products;
    }

    @NotNull
    public final String getUid() {
        return this.uid;
    }

    @NotNull
    public final Map<String, QProduct> getUserProducts() {
        return this.userProducts;
    }

    public int hashCode() {
        int iHashCode = (this.userProducts.hashCode() + ((this.permissions.hashCode() + ((this.products.hashCode() + ((this.date.hashCode() + (this.uid.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        QOfferings qOfferings = this.offerings;
        int iHashCode2 = (iHashCode + (qOfferings == null ? 0 : qOfferings.hashCode())) * 31;
        Map<String, List<String>> map = this.productPermissions;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final void setPermissions$sdk_release(@NotNull Map<String, QPermission> map) {
        AbstractC3340k.e(map, "<set-?>");
        this.permissions = map;
    }

    @NotNull
    public String toString() {
        return "QLaunchResult(uid=" + this.uid + ", date=" + this.date + ", products=" + this.products + ", permissions=" + this.permissions + ", userProducts=" + this.userProducts + ", offerings=" + this.offerings + ", productPermissions=" + this.productPermissions + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ QLaunchResult(String str, Date date, Map map, Map map2, Map map3, QOfferings qOfferings, Map map4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        int i10 = i5 & 4;
        w wVar = w.f35433a;
        this(str, date, i10 != 0 ? wVar : map, (i5 & 8) != 0 ? wVar : map2, (i5 & 16) != 0 ? wVar : map3, qOfferings, (i5 & 64) != 0 ? null : map4);
    }
}
