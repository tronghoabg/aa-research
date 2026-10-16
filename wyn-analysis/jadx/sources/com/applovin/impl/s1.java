package com.applovin.impl;

import j$.util.Objects;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class s1 {

    /* renamed from: b, reason: collision with root package name */
    private final String f22758b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f22759c;

    /* renamed from: a, reason: collision with root package name */
    private final String f22757a = UUID.randomUUID().toString();

    /* renamed from: d, reason: collision with root package name */
    private final long f22760d = System.currentTimeMillis();

    public s1(String str, Map map) {
        this.f22758b = str;
        this.f22759c = map;
    }

    public long a() {
        return this.f22760d;
    }

    public String b() {
        return this.f22757a;
    }

    public String c() {
        return this.f22758b;
    }

    public Map d() {
        return this.f22759c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s1 s1Var = (s1) obj;
        if (this.f22760d == s1Var.f22760d && Objects.equals(this.f22758b, s1Var.f22758b) && Objects.equals(this.f22759c, s1Var.f22759c)) {
            return Objects.equals(this.f22757a, s1Var.f22757a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f22758b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f22759c;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j8 = this.f22760d;
        int i5 = (iHashCode2 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        String str2 = this.f22757a;
        return i5 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Event{name='" + this.f22758b + "', id='" + this.f22757a + "', creationTimestampMillis=" + this.f22760d + ", parameters=" + this.f22759c + '}';
    }
}
