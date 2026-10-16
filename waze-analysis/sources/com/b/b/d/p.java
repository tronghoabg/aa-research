package com.b.b.d;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @JsonProperty("uri")
    @com.google.l.a.b(a = "uri")
    public final String f2669a = null;

    /* renamed from: b, reason: collision with root package name */
    @JsonProperty(GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE)
    @com.google.l.a.b(a = GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE)
    public final String f2670b = null;

    /* renamed from: c, reason: collision with root package name */
    @JsonProperty("subtitle")
    @com.google.l.a.b(a = "subtitle")
    public final String f2671c = null;

    /* renamed from: d, reason: collision with root package name */
    @JsonProperty(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY)
    @com.google.l.a.b(a = ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY)
    public final String f2672d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            p pVar = (p) obj;
            String str = this.f2669a;
            if (str == null ? pVar.f2669a != null : !str.equals(pVar.f2669a)) {
                return false;
            }
            String str2 = this.f2670b;
            if (str2 == null ? pVar.f2670b != null : !str2.equals(pVar.f2670b)) {
                return false;
            }
            String str3 = this.f2671c;
            if (str3 == null ? pVar.f2671c != null : !str3.equals(pVar.f2671c)) {
                return false;
            }
            String str4 = this.f2672d;
            if (str4 != null) {
                if (!str4.equals(pVar.f2672d)) {
                    return true;
                }
            } else if (pVar.f2672d != null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f2669a;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f2670b;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = iHashCode * 31;
        String str3 = this.f2671c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f2672d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "PlayerContext{, uri=" + this.f2669a + ", title=" + this.f2670b + ", subtitle=" + this.f2671c + ", type=" + this.f2672d + "}";
    }
}
