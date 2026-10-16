package com.qonversion.android.sdk.automations.dto;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wg.b;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÂ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;", "", "type", "Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;", "date", "Ljava/util/Date;", InAppPurchaseMetaData.KEY_PRODUCT_ID, "", "(Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;Ljava/util/Date;Ljava/lang/String;)V", "getDate", "()Ljava/util/Date;", "getType", "()Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AutomationsEvent {

    @NotNull
    private final Date date;

    @Nullable
    private final String productId;

    @NotNull
    private final AutomationsEventType type;

    public AutomationsEvent(@NotNull AutomationsEventType type, @NotNull Date date, @Nullable String str) {
        AbstractC3340k.e(type, "type");
        AbstractC3340k.e(date, "date");
        this.type = type;
        this.date = date;
        this.productId = str;
    }

    /* renamed from: component3, reason: from getter */
    private final String getProductId() {
        return this.productId;
    }

    public static /* synthetic */ AutomationsEvent copy$default(AutomationsEvent automationsEvent, AutomationsEventType automationsEventType, Date date, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            automationsEventType = automationsEvent.type;
        }
        if ((i5 & 2) != 0) {
            date = automationsEvent.date;
        }
        if ((i5 & 4) != 0) {
            str = automationsEvent.productId;
        }
        return automationsEvent.copy(automationsEventType, date, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AutomationsEventType getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    @NotNull
    public final AutomationsEvent copy(@NotNull AutomationsEventType type, @NotNull Date date, @Nullable String productId) {
        AbstractC3340k.e(type, "type");
        AbstractC3340k.e(date, "date");
        return new AutomationsEvent(type, date, productId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutomationsEvent)) {
            return false;
        }
        AutomationsEvent automationsEvent = (AutomationsEvent) other;
        return this.type == automationsEvent.type && AbstractC3340k.a(this.date, automationsEvent.date) && AbstractC3340k.a(this.productId, automationsEvent.productId);
    }

    @NotNull
    public final Date getDate() {
        return this.date;
    }

    @NotNull
    public final AutomationsEventType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.date.hashCode() + (this.type.hashCode() * 31)) * 31;
        String str = this.productId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        AutomationsEventType automationsEventType = this.type;
        Date date = this.date;
        String str = this.productId;
        StringBuilder sb2 = new StringBuilder("AutomationsEvent(type=");
        sb2.append(automationsEventType);
        sb2.append(", date=");
        sb2.append(date);
        sb2.append(", productId=");
        return b.c(sb2, str, ")");
    }
}
