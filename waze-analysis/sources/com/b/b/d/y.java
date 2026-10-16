package com.b.b.d;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: WazeSource */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @JsonProperty("roles")
    @com.google.l.a.b(a = "roles")
    public final t f2703a = null;

    private y() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        t tVar = this.f2703a;
        return tVar != null ? tVar.equals(yVar.f2703a) : yVar.f2703a == null;
    }

    public final int hashCode() {
        t tVar = this.f2703a;
        if (tVar != null) {
            return tVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WelcomeDetails{roles=" + String.valueOf(this.f2703a) + "}";
    }
}
