package com.b.b.d;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: WazeSource */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @JsonProperty("dealer")
    @com.google.l.a.b(a = "dealer")
    public final c f2689a;

    /* renamed from: b, reason: collision with root package name */
    @JsonProperty("broker")
    @com.google.l.a.b(a = "broker")
    public final c f2690b;

    /* renamed from: c, reason: collision with root package name */
    @JsonProperty("subscriber")
    @com.google.l.a.b(a = "subscriber")
    public final c f2691c;

    /* renamed from: d, reason: collision with root package name */
    @JsonProperty("caller")
    @com.google.l.a.b(a = "caller")
    public final c f2692d;

    public t(c cVar, c cVar2) {
        this.f2689a = null;
        this.f2690b = null;
        this.f2691c = cVar;
        this.f2692d = cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        c cVar = this.f2689a;
        if (cVar == null ? tVar.f2689a != null : !cVar.equals(tVar.f2689a)) {
            return false;
        }
        c cVar2 = this.f2690b;
        if (cVar2 == null ? tVar.f2690b != null : !cVar2.equals(tVar.f2690b)) {
            return false;
        }
        c cVar3 = this.f2691c;
        if (cVar3 == null ? tVar.f2691c != null : !cVar3.equals(tVar.f2691c)) {
            return false;
        }
        c cVar4 = this.f2692d;
        return cVar4 != null ? cVar4.equals(tVar.f2692d) : tVar.f2692d == null;
    }

    public final int hashCode() {
        c cVar = this.f2689a;
        int iHashCode = cVar != null ? cVar.hashCode() : 0;
        c cVar2 = this.f2690b;
        int iHashCode2 = cVar2 != null ? cVar2.hashCode() : 0;
        int i2 = iHashCode * 31;
        c cVar3 = this.f2691c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (cVar3 != null ? cVar3.hashCode() : 0)) * 31;
        c cVar4 = this.f2692d;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    public final String toString() {
        c cVar = this.f2692d;
        c cVar2 = this.f2691c;
        c cVar3 = this.f2690b;
        return "Roles{dealer=" + String.valueOf(this.f2689a) + ", broker=" + String.valueOf(cVar3) + ", subscriber=" + String.valueOf(cVar2) + ", caller=" + String.valueOf(cVar) + "}";
    }

    public t() {
        this(null, null);
    }
}
