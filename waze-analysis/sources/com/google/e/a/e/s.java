package com.google.e.a.e;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final s f8457a = new s();

    /* renamed from: b, reason: collision with root package name */
    private final Map f8458b = new HashMap();

    s() {
    }

    public static s a() {
        return f8457a;
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            d((String) entry.getKey(), (com.google.d.m.a.a.b) entry.getValue());
        }
    }

    public final synchronized com.google.d.m.a.a.b c(String str) {
        Map map;
        map = this.f8458b;
        if (!map.containsKey(str)) {
            throw new GeneralSecurityException("Name " + str + " does not exist");
        }
        return (com.google.d.m.a.a.b) map.get(str);
    }

    public final synchronized void d(String str, com.google.d.m.a.a.b bVar) {
        Map map = this.f8458b;
        if (!map.containsKey(str)) {
            map.put(str, bVar);
            return;
        }
        if (((com.google.d.m.a.a.b) map.get(str)).equals(bVar)) {
            return;
        }
        throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(map.get(str)) + "), cannot insert " + String.valueOf(bVar));
    }
}
