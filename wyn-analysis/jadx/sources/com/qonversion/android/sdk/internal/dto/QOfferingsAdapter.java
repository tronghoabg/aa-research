package com.qonversion.android.sdk.internal.dto;

import com.qonversion.android.sdk.dto.offerings.QOffering;
import com.qonversion.android.sdk.dto.offerings.QOfferingTag;
import com.qonversion.android.sdk.dto.offerings.QOfferings;
import ff.v;
import hb.InterfaceC2811n;
import hb.Q;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0003¨\u0006\t"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QOfferingsAdapter;", "", "()V", "fromJson", "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;", "offerings", "", "Lcom/qonversion/android/sdk/dto/offerings/QOffering;", "toJson", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QOfferingsAdapter {
    @Q
    private final List<QOffering> toJson(QOfferings offerings) {
        List<QOffering> availableOfferings;
        return (offerings == null || (availableOfferings = offerings.getAvailableOfferings()) == null) ? v.f35432a : availableOfferings;
    }

    @InterfaceC2811n
    @Nullable
    public final QOfferings fromJson(@NotNull List<QOffering> offerings) {
        AbstractC3340k.e(offerings, "offerings");
        Object obj = null;
        if (offerings.isEmpty()) {
            return null;
        }
        Iterator<T> it = offerings.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((QOffering) next).getTag() == QOfferingTag.Main) {
                obj = next;
                break;
            }
        }
        return new QOfferings((QOffering) obj, offerings);
    }
}
