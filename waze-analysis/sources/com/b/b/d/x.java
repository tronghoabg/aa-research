package com.b.b.d;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: WazeSource */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    @JsonProperty("code")
    @com.google.l.a.b(a = "code")
    public final int f2700a = 1;

    /* renamed from: b, reason: collision with root package name */
    @JsonProperty("short_text")
    @com.google.l.a.b(a = "short_text")
    public final String f2701b = null;

    /* renamed from: c, reason: collision with root package name */
    @JsonProperty("long_text")
    @com.google.l.a.b(a = "long_text")
    public final String f2702c = null;

    private x() {
    }

    @JsonIgnore
    public final boolean a() {
        return this.f2700a == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f2700a != xVar.f2700a) {
            return false;
        }
        String str = this.f2701b;
        if (str == null ? xVar.f2701b != null : !str.equals(xVar.f2701b)) {
            return false;
        }
        String str2 = this.f2702c;
        return str2 != null ? str2.equals(xVar.f2702c) : xVar.f2702c == null;
    }

    public final int hashCode() {
        String str = this.f2701b;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i2 = this.f2700a;
        String str2 = this.f2702c;
        return (((i2 * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "UserStatus{code=" + this.f2700a + ", shortMessage='" + this.f2701b + "', longMessage='" + this.f2702c + "'}";
    }
}
