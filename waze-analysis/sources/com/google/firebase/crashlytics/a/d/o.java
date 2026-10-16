package com.google.firebase.crashlytics.a.d;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f9262a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9263b;

    public o(int i2) {
        this.f9263b = new HashMap();
        this.f9262a = i2;
    }

    public static String a(String str, int i2) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i2 ? strTrim.substring(0, i2) : strTrim;
    }

    private final String e(String str) {
        if (str != null) {
            return a(str, this.f9262a);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized Map b() {
        return DesugarCollections.unmodifiableMap(new HashMap((Map) this.f9263b));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void c(Map map) {
        int i2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String strE = e((String) entry.getKey());
            ?? r3 = this.f9263b;
            if (r3.size() < 64 || r3.containsKey(strE)) {
                String str = (String) entry.getValue();
                r3.put(strE, str == null ? "" : a(str, this.f9262a));
            } else {
                i2++;
            }
        }
        if (i2 > 0) {
            com.google.firebase.crashlytics.a.i.a().h("Ignored " + i2 + " entries when adding custom keys. Maximum allowable: 64");
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized boolean d(String str, String str2) {
        ?? r1 = this.f9263b;
        String strE = e(str);
        if (r1.size() >= 64 && !r1.containsKey(strE)) {
            com.google.firebase.crashlytics.a.i.a().h("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: 64");
            return false;
        }
        String strA = a(str2, this.f9262a);
        if (com.google.firebase.crashlytics.a.c.g.n((String) r1.get(strE), strA)) {
            return false;
        }
        if (str2 == null) {
            strA = "";
        }
        r1.put(strE, strA);
        return true;
    }

    o(byte[] bArr, int i2) {
        this.f9263b = bArr;
        this.f9262a = i2;
    }
}
