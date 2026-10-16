package com.b.b.d;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: WazeSource */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @JsonProperty("message")
    @com.google.l.a.b(a = "message")
    public final String f2667a;

    public n(String str) {
        this.f2667a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        String str = this.f2667a;
        return str != null ? str.equals(nVar.f2667a) : nVar.f2667a == null;
    }

    public final int hashCode() {
        String str = this.f2667a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Message{message='" + this.f2667a + "'}";
    }

    private n() {
        this(null);
    }
}
