package com.b.b.d;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.Map;

/* compiled from: WazeSource */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @JsonProperty("roles")
    @com.google.l.a.b(a = "roles")
    public final t f2632a;

    /* renamed from: b, reason: collision with root package name */
    @JsonProperty("info")
    @com.google.l.a.b(a = "info")
    public final j f2633b;

    /* renamed from: c, reason: collision with root package name */
    @JsonProperty("authmethods")
    @com.google.l.a.b(a = "authmethods")
    public final String[] f2634c;

    /* renamed from: d, reason: collision with root package name */
    @JsonProperty("authid")
    @com.google.l.a.b(a = "authid")
    public final String f2635d;

    /* renamed from: e, reason: collision with root package name */
    @JsonProperty("extras")
    @com.google.l.a.b(a = "extras")
    public final Map<String, String> f2636e;

    public e(t tVar, j jVar, String[] strArr, String str, Map map) {
        this.f2632a = tVar;
        this.f2633b = jVar;
        this.f2634c = strArr;
        this.f2635d = str;
        this.f2636e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        t tVar = this.f2632a;
        if (tVar == null ? eVar.f2632a != null : !tVar.equals(eVar.f2632a)) {
            return false;
        }
        j jVar = this.f2633b;
        if (jVar == null ? eVar.f2633b != null : !jVar.equals(eVar.f2633b)) {
            return false;
        }
        if (!Arrays.equals(this.f2634c, eVar.f2634c)) {
            return false;
        }
        String str = this.f2635d;
        if (str == null ? eVar.f2635d != null : !str.equals(eVar.f2635d)) {
            return false;
        }
        Map<String, String> map = this.f2636e;
        return map != null ? map.equals(eVar.f2636e) : eVar.f2636e == null;
    }

    public final int hashCode() {
        t tVar = this.f2632a;
        int iHashCode = tVar != null ? tVar.hashCode() : 0;
        j jVar = this.f2633b;
        int iHashCode2 = (((iHashCode * 31) + (jVar != null ? jVar.hashCode() : 0)) * 31) + Arrays.hashCode(this.f2634c);
        String str = this.f2635d;
        int iHashCode3 = ((iHashCode2 * 31) + (str != null ? str.hashCode() : 0)) * 31;
        Map<String, String> map = this.f2636e;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        Map<String, String> map = this.f2636e;
        String[] strArr = this.f2634c;
        j jVar = this.f2633b;
        return "HelloDetails{roles=" + String.valueOf(this.f2632a) + ", info=" + String.valueOf(jVar) + ", authmethods=" + Arrays.toString(strArr) + ", authid='" + this.f2635d + "', extras=" + String.valueOf(map) + "}";
    }

    private e() {
        this(null, null, null, null, null);
    }
}
