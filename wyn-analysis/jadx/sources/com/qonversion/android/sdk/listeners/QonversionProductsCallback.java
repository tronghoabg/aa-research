package com.qonversion.android.sdk.listeners;

import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.products.QProduct;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;", "", "", "", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "products", "Lef/C;", "onSuccess", "(Ljava/util/Map;)V", "Lcom/qonversion/android/sdk/dto/QonversionError;", "error", "onError", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface QonversionProductsCallback {
    void onError(@NotNull QonversionError error);

    void onSuccess(@NotNull Map<String, QProduct> products);
}
