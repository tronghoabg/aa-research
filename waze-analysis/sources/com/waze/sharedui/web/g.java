package com.waze.sharedui.web;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static f f39352a = new d();

    public static Map a(int i2, int i3) {
        HashMap map = new HashMap();
        e(map, "X-Waze-Mobile-Width", i2);
        e(map, "X-Waze-Mobile-Height", i3);
        d(map, "X-Waze-Mobile-RT-Token", f39352a.k());
        d(map, "X-Waze-Mobile-Session-Id", f39352a.f());
        d(map, "X-Waze-Mobile-Client-Session-UID", f39352a.g());
        d(map, "X-Waze-Mobile-Device-Id", f39352a.c());
        d(map, "X-Waze-Mobile-Latitude", f39352a.d());
        d(map, "X-Waze-Mobile-Longitude", f39352a.e());
        d(map, "X-Waze-Mobile-Language", f39352a.j());
        Boolean boolB = f39352a.b();
        d(map, "X-Waze-Mobile-Unit-System", boolB == null ? null : true != boolB.booleanValue() ? "imperial" : "metric");
        d(map, "X-Waze-Mobile-Client-Version", f39352a.h());
        d(map, "X-Waze-Mobile-Client-Type", f39352a.a());
        d(map, "X-Waze-Mobile-Environment", f39352a.i());
        return map;
    }

    public static void b(Context context, String str, Map map) {
        if (str.contains("centercode.com")) {
            return;
        }
        d(map, "X-Waze-Mobile-Theme", f39352a.l(context));
    }

    public static void c(f fVar) {
        f39352a = fVar;
    }

    private static void d(Map map, String str, Object obj) {
        if (obj == null) {
            return;
        }
        String string = obj.toString();
        if (string.isEmpty()) {
            return;
        }
        map.put(str, string);
    }

    private static void e(Map map, String str, int i2) {
        if (i2 == 0) {
            return;
        }
        map.put(str, Integer.toString(i2));
    }
}
