package com.qonversion.android.sdk.automations.internal.macros;

import N0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wg.b;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/qonversion/android/sdk/automations/internal/macros/Macros;", "", "type", "Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;", "productID", "", "originalMacrosString", "(Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;Ljava/lang/String;Ljava/lang/String;)V", "getOriginalMacrosString", "()Ljava/lang/String;", "getProductID", "getType", "()Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Macros {

    @NotNull
    private final String originalMacrosString;

    @NotNull
    private final String productID;

    @NotNull
    private final MacrosType type;

    public Macros(@NotNull MacrosType type, @NotNull String productID, @NotNull String originalMacrosString) {
        AbstractC3340k.e(type, "type");
        AbstractC3340k.e(productID, "productID");
        AbstractC3340k.e(originalMacrosString, "originalMacrosString");
        this.type = type;
        this.productID = productID;
        this.originalMacrosString = originalMacrosString;
    }

    public static /* synthetic */ Macros copy$default(Macros macros, MacrosType macrosType, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            macrosType = macros.type;
        }
        if ((i5 & 2) != 0) {
            str = macros.productID;
        }
        if ((i5 & 4) != 0) {
            str2 = macros.originalMacrosString;
        }
        return macros.copy(macrosType, str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final MacrosType getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getProductID() {
        return this.productID;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getOriginalMacrosString() {
        return this.originalMacrosString;
    }

    @NotNull
    public final Macros copy(@NotNull MacrosType type, @NotNull String productID, @NotNull String originalMacrosString) {
        AbstractC3340k.e(type, "type");
        AbstractC3340k.e(productID, "productID");
        AbstractC3340k.e(originalMacrosString, "originalMacrosString");
        return new Macros(type, productID, originalMacrosString);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Macros)) {
            return false;
        }
        Macros macros = (Macros) other;
        return this.type == macros.type && AbstractC3340k.a(this.productID, macros.productID) && AbstractC3340k.a(this.originalMacrosString, macros.originalMacrosString);
    }

    @NotNull
    public final String getOriginalMacrosString() {
        return this.originalMacrosString;
    }

    @NotNull
    public final String getProductID() {
        return this.productID;
    }

    @NotNull
    public final MacrosType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.originalMacrosString.hashCode() + a.c(this.type.hashCode() * 31, 31, this.productID);
    }

    @NotNull
    public String toString() {
        MacrosType macrosType = this.type;
        String str = this.productID;
        String str2 = this.originalMacrosString;
        StringBuilder sb2 = new StringBuilder("Macros(type=");
        sb2.append(macrosType);
        sb2.append(", productID=");
        sb2.append(str);
        sb2.append(", originalMacrosString=");
        return b.c(sb2, str2, ")");
    }
}
