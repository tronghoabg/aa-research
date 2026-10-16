package com.b.b.d;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: WazeSource */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @JsonProperty("uri")
    @com.google.l.a.b(a = "uri")
    public final String f2655a;

    /* renamed from: b, reason: collision with root package name */
    @JsonProperty("saved")
    @com.google.l.a.b(a = "saved")
    public final boolean f2656b;

    /* renamed from: c, reason: collision with root package name */
    @JsonProperty("can_save")
    @com.google.l.a.b(a = "can_save")
    public final boolean f2657c;

    public k(String str, boolean z) {
        this.f2655a = str;
        this.f2656b = z;
        this.f2657c = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f2656b != kVar.f2656b || this.f2657c != kVar.f2657c) {
            return false;
        }
        String str = this.f2655a;
        return str != null ? str.equals(kVar.f2655a) : kVar.f2655a == null;
    }

    public final int hashCode() {
        String str = this.f2655a;
        return ((((str != null ? str.hashCode() : 0) * 31) + (this.f2656b ? 1 : 0)) * 31) + (this.f2657c ? 1 : 0);
    }

    public final String toString() {
        return "LibraryState{uri='" + this.f2655a + "', isAdded=" + this.f2656b + ", canAdd=" + this.f2657c + "}";
    }

    private k() {
        this(null, false);
    }
}
