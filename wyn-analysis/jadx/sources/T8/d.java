package T8;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11787a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final int f11788b = 64;

    /* renamed from: c, reason: collision with root package name */
    public final int f11789c;

    public d(int i5) {
        this.f11789c = i5;
    }

    public static String b(int i5, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i5) {
                return str.substring(0, i5);
            }
        }
        return str;
    }

    public final synchronized Map a() {
        return DesugarCollections.unmodifiableMap(new HashMap(this.f11787a));
    }

    public final synchronized boolean c(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Custom attribute key must not be null.");
        }
        String strB = b(this.f11789c, str);
        if (this.f11787a.size() >= this.f11788b && !this.f11787a.containsKey(strB)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f11788b, null);
            return false;
        }
        String strB2 = b(this.f11789c, str2);
        String str3 = (String) this.f11787a.get(strB);
        if (str3 == null ? strB2 == null : str3.equals(strB2)) {
            return false;
        }
        HashMap map = this.f11787a;
        if (str2 == null) {
            strB2 = "";
        }
        map.put(strB, strB2);
        return true;
    }

    public final synchronized void d(Map map) {
        try {
            int i5 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strB = b(this.f11789c, str);
                if (this.f11787a.size() < this.f11788b || this.f11787a.containsKey(strB)) {
                    String str2 = (String) entry.getValue();
                    this.f11787a.put(strB, str2 == null ? "" : b(this.f11789c, str2));
                } else {
                    i5++;
                }
            }
            if (i5 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i5 + " entries when adding custom keys. Maximum allowable: " + this.f11788b, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
