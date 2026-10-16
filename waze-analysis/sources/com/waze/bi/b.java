package com.waze.bi;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import h.a.r;
import h.g.b.x;
import h.k.n;
import h.n.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16804a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16805b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16806c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f16807d;

    public b(Context context) {
        x.f(context, "context");
        this.f16804a = context;
        this.f16805b = "com.waze.red_dot";
        this.f16806c = "ClearedMainMenuNotifications";
        this.f16807d = h.g.a(new a(this, 0));
    }

    static final SharedPreferences a(b bVar) {
        return bVar.f16804a.getSharedPreferences(bVar.f16805b, 0);
    }

    private final SharedPreferences d() {
        Object value = this.f16807d.getValue();
        x.e(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    public final Map b() {
        try {
            Set<String> stringSet = d().getStringSet(this.f16806c, new HashSet());
            if (stringSet == null) {
                return r.j();
            }
            Set<String> set = stringSet;
            LinkedHashMap linkedHashMap = new LinkedHashMap(n.h(r.a(h.a.i.q(set, 10)), 16));
            for (String str : set) {
                x.c(str);
                String str2 = str;
                String str3 = (String) o.ae(str2, new char[]{','}).get(0);
                x.c(str);
                linkedHashMap.put(str3, Long.valueOf(Long.parseLong((String) o.ae(str2, new char[]{','}).get(1))));
            }
            return linkedHashMap;
        } catch (Exception e2) {
            Log.e("NOTIFICATIONS_STORAGE", String.valueOf(e2.getMessage()));
            return r.j();
        }
    }

    public final void c(Map map) {
        x.f(map, "notifications");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(entry.getKey() + "," + entry.getValue());
        }
        hashSet.addAll(arrayList);
        d().edit().putStringSet(this.f16806c, hashSet).apply();
    }
}
