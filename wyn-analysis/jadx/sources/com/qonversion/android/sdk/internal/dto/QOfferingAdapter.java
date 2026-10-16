package com.qonversion.android.sdk.internal.dto;

import com.qonversion.android.sdk.dto.offerings.QOffering;
import com.qonversion.android.sdk.dto.products.QProduct;
import hb.InterfaceC2811n;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0006"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QOfferingAdapter;", "", "()V", "fromJson", "Lcom/qonversion/android/sdk/dto/offerings/QOffering;", "offering", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QOfferingAdapter {
    @InterfaceC2811n
    @NotNull
    public final QOffering fromJson(@NotNull QOffering offering) {
        AbstractC3340k.e(offering, "offering");
        Iterator<T> it = offering.getProducts().iterator();
        while (it.hasNext()) {
            ((QProduct) it.next()).setOfferingID(offering.getOfferingID());
        }
        return offering;
    }
}
