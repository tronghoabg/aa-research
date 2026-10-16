package com.b.b.d;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: WazeSource */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @JsonProperty("parent_id")
    @com.google.l.a.b(a = "parent_id")
    public final String f2628a;

    /* renamed from: b, reason: collision with root package name */
    @JsonProperty("limit")
    @com.google.l.a.b(a = "limit")
    public final int f2629b;

    /* renamed from: c, reason: collision with root package name */
    @JsonProperty(TypedValues.CycleType.S_WAVE_OFFSET)
    @com.google.l.a.b(a = TypedValues.CycleType.S_WAVE_OFFSET)
    public final int f2630c;

    public b(String str, int i2) {
        this.f2628a = str;
        this.f2629b = i2;
        this.f2630c = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2629b != bVar.f2629b || this.f2630c != bVar.f2630c) {
            return false;
        }
        String str = this.f2628a;
        return str != null ? str.equals(bVar.f2628a) : bVar.f2628a == null;
    }

    public final int hashCode() {
        String str = this.f2628a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f2629b) * 31) + this.f2630c;
    }

    public final String toString() {
        return "ChildrenPageRequest{parentId='" + this.f2628a + "', limit=" + this.f2629b + ", offset=" + this.f2630c + "}";
    }

    private b() {
        this(null, 0);
    }
}
