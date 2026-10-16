package com.applovin.impl;

import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1676z {

    /* renamed from: a, reason: collision with root package name */
    private final Map f23960a;

    /* renamed from: b, reason: collision with root package name */
    private final List f23961b;

    public C1676z(Map map, List list) {
        this.f23960a = map;
        this.f23961b = list;
    }

    public boolean a(Object obj) {
        return obj instanceof C1676z;
    }

    public List b() {
        return this.f23961b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1676z)) {
            return false;
        }
        C1676z c1676z = (C1676z) obj;
        if (!c1676z.a(this)) {
            return false;
        }
        Map mapA = a();
        Map mapA2 = c1676z.a();
        if (mapA != null ? !mapA.equals(mapA2) : mapA2 != null) {
            return false;
        }
        List listB = b();
        List listB2 = c1676z.b();
        return listB != null ? listB.equals(listB2) : listB2 == null;
    }

    public int hashCode() {
        Map mapA = a();
        int iHashCode = mapA == null ? 43 : mapA.hashCode();
        List listB = b();
        return ((iHashCode + 59) * 59) + (listB != null ? listB.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxt(domainEntries=" + a() + ", invalidEntries=" + b() + ")";
    }

    public Map a() {
        return this.f23960a;
    }
}
