package com.qonversion.android.sdk.internal.dto;

import com.qonversion.android.sdk.internal.dto.automations.ActionPointScreen;
import hb.InterfaceC2812o;
import hb.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\b\u0001\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/ActionPoints;", "", "items", "", "Lcom/qonversion/android/sdk/internal/dto/Data;", "Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ActionPoints {

    @NotNull
    private final List<Data<ActionPointScreen>> items;

    public ActionPoints(@InterfaceC2812o(name = "items") @NotNull List<Data<ActionPointScreen>> items) {
        AbstractC3340k.e(items, "items");
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionPoints copy$default(ActionPoints actionPoints, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = actionPoints.items;
        }
        return actionPoints.copy(list);
    }

    @NotNull
    public final List<Data<ActionPointScreen>> component1() {
        return this.items;
    }

    @NotNull
    public final ActionPoints copy(@InterfaceC2812o(name = "items") @NotNull List<Data<ActionPointScreen>> items) {
        AbstractC3340k.e(items, "items");
        return new ActionPoints(items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ActionPoints) && AbstractC3340k.a(this.items, ((ActionPoints) other).items);
    }

    @NotNull
    public final List<Data<ActionPointScreen>> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return "ActionPoints(items=" + this.items + ")";
    }
}
