package com.b.b.d;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;

/* compiled from: WazeSource */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @JsonProperty("limit")
    @com.google.l.a.b(a = "limit")
    public final int f2663a = 0;

    /* renamed from: b, reason: collision with root package name */
    @JsonProperty(TypedValues.CycleType.S_WAVE_OFFSET)
    @com.google.l.a.b(a = TypedValues.CycleType.S_WAVE_OFFSET)
    public final int f2664b = 0;

    /* renamed from: c, reason: collision with root package name */
    @JsonProperty("total")
    @com.google.l.a.b(a = "total")
    public final int f2665c = 0;

    /* renamed from: d, reason: collision with root package name */
    @JsonProperty("items")
    @com.google.l.a.b(a = "items")
    public final l[] f2666d = null;

    private m() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f2663a == mVar.f2663a && this.f2664b == mVar.f2664b && this.f2665c == mVar.f2665c) {
            return Arrays.equals(this.f2666d, mVar.f2666d);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f2663a * 31) + this.f2664b) * 31) + this.f2665c) * 31) + Arrays.hashCode(this.f2666d);
    }

    public final String toString() {
        return "ListItems{limit=" + this.f2663a + ", offset=" + this.f2664b + ", total=" + this.f2665c + ", items=" + Arrays.toString(this.f2666d) + "}";
    }
}
