package com.bytedance.sdk.openadsdk.core;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class gb {
    private static volatile gb uef;

    /* renamed from: oa, reason: collision with root package name */
    private Map<String, Map<String, String>> f25612oa = new ConcurrentHashMap();

    private gb() {
    }

    public static gb uef() {
        if (uef == null) {
            synchronized (gb.class) {
                try {
                    if (uef == null) {
                        uef = new gb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    public boolean oa(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.f25612oa;
        if (map2 == null || !map2.containsKey(str) || (map = this.f25612oa.get(str)) == null) {
            return false;
        }
        return map.containsKey(str2);
    }

    public boolean yo(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.f25612oa;
        if (map2 == null || !map2.containsKey(str) || (map = this.f25612oa.get(str)) == null) {
            return false;
        }
        map.remove(str2);
        return true;
    }

    public void uef(String str, String str2, String str3) {
        Map<String, Map<String, String>> map = this.f25612oa;
        if (map == null) {
            return;
        }
        Map<String, String> map2 = map.get(str);
        if (map2 != null) {
            map2.put(str2, str3);
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(str2, str3);
        this.f25612oa.put(str, concurrentHashMap);
    }

    public String uef(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.f25612oa;
        if (map2 == null || !map2.containsKey(str) || (map = this.f25612oa.get(str)) == null) {
            return null;
        }
        return map.get(str2);
    }

    public void uef(String str) {
        Map<String, Map<String, String>> map = this.f25612oa;
        if (map != null && map.containsKey(str)) {
            Map<String, String> map2 = this.f25612oa.get(str);
            if (map2 != null) {
                map2.clear();
            }
            this.f25612oa.remove(str);
        }
    }
}
