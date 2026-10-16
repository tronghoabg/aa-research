package com.qonversion.android.sdk.internal.storage;

import I9.a;
import com.qonversion.android.sdk.dto.QPurchaseOptions;
import com.qonversion.android.sdk.internal.purchase.Purchase;
import ff.o;
import ff.w;
import ff.x;
import hb.K;
import hb.P;
import hb.r;
import ib.d;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000eJ!\u0010\u0017\u001a\u00020\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u001c\u0010\u001e\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R&\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&¨\u0006)"}, d2 = {"Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;", "", "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;", "preferences", "<init>", "(Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;)V", "", "Lcom/qonversion/android/sdk/internal/purchase/Purchase;", "purchases", "Lef/C;", "savePurchasesAsJson", "(Ljava/util/Set;)V", PurchasesCache.PURCHASE_KEY, "savePurchase", "(Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V", "", "loadPurchases", "()Ljava/util/Set;", "clearPurchase", "", "", "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;", "options", "saveProcessingPurchasesOptions", "(Ljava/util/Map;)V", "loadProcessingPurchasesOptions", "()Ljava/util/Map;", "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;", "Lhb/K;", "kotlin.jvm.PlatformType", "moshi", "Lhb/K;", "Ljava/lang/reflect/Type;", "collectionPurchaseType", "Ljava/lang/reflect/Type;", "collectionPurchaseOptionsType", "Lhb/r;", "purchasesJsonAdapter", "Lhb/r;", "purchasesOptionsJsonAdapter", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PurchasesCache {
    private static final int MAX_OLD_PURCHASES_NUMBER = 1;
    private static final int MAX_PURCHASES_NUMBER = 5;

    @NotNull
    private static final String PURCHASE_KEY = "purchase";

    @NotNull
    private static final String PURCHASE_OPTIONS_KEY = "purchase_options";

    @NotNull
    private final Type collectionPurchaseOptionsType;

    @NotNull
    private final Type collectionPurchaseType;
    private final K moshi;

    @NotNull
    private final SharedPreferencesCache preferences;

    @NotNull
    private final r purchasesJsonAdapter;

    @NotNull
    private final r purchasesOptionsJsonAdapter;

    public PurchasesCache(@NotNull SharedPreferencesCache preferences) {
        AbstractC3340k.e(preferences, "preferences");
        this.preferences = preferences;
        K k = new K(new a(2));
        this.moshi = k;
        d dVarF = P.f(Set.class, Purchase.class);
        this.collectionPurchaseType = dVarF;
        d dVarF2 = P.f(Map.class, String.class, QPurchaseOptions.class);
        this.collectionPurchaseOptionsType = dVarF2;
        r rVarB = k.b(dVarF);
        AbstractC3340k.d(rVarB, "adapter(...)");
        this.purchasesJsonAdapter = rVarB;
        r rVarB2 = k.b(dVarF2);
        AbstractC3340k.d(rVarB2, "adapter(...)");
        this.purchasesOptionsJsonAdapter = rVarB2;
    }

    private final void savePurchasesAsJson(Set<Purchase> purchases) {
        String json = this.purchasesJsonAdapter.toJson(purchases);
        AbstractC3340k.d(json, "toJson(...)");
        this.preferences.putString(PURCHASE_KEY, json);
    }

    public final void clearPurchase(@NotNull Purchase purchase) {
        AbstractC3340k.e(purchase, "purchase");
        Set<Purchase> setW0 = o.W0(loadPurchases());
        setW0.remove(purchase);
        savePurchasesAsJson(setW0);
    }

    @NotNull
    public final Map<String, QPurchaseOptions> loadProcessingPurchasesOptions() {
        Map<String, QPurchaseOptions> map = (Map) this.preferences.getObject(PURCHASE_OPTIONS_KEY, this.purchasesOptionsJsonAdapter);
        return map == null ? w.f35433a : map;
    }

    @NotNull
    public final Set<Purchase> loadPurchases() {
        String string = this.preferences.getString(PURCHASE_KEY, "");
        x xVar = x.f35434a;
        if (string != null && string.length() != 0) {
            try {
                Set<Purchase> set = (Set) this.purchasesJsonAdapter.fromJson(string);
                return set == null ? xVar : set;
            } catch (IOException unused) {
            }
        }
        return xVar;
    }

    public final void saveProcessingPurchasesOptions(@NotNull Map<String, QPurchaseOptions> options) {
        AbstractC3340k.e(options, "options");
        this.preferences.putObject(PURCHASE_OPTIONS_KEY, options, this.purchasesOptionsJsonAdapter);
    }

    public final void savePurchase(@NotNull Purchase purchase) {
        AbstractC3340k.e(purchase, "purchase");
        Set<Purchase> setW0 = o.W0(loadPurchases());
        setW0.add(purchase);
        if (setW0.size() >= 5) {
            setW0.removeAll(o.X0(o.N0(o.U0(setW0), 1)));
        }
        savePurchasesAsJson(setW0);
    }
}
