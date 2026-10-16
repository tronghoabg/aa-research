package androidx.datastore.migrations;

import android.content.SharedPreferences;
import h.a.i;
import h.a.r;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SharedPreferencesView {
    private final Set<String> keySet;
    private final SharedPreferences prefs;

    public SharedPreferencesView(SharedPreferences sharedPreferences, Set<String> set) {
        x.f(sharedPreferences, "prefs");
        this.prefs = sharedPreferences;
        this.keySet = set;
    }

    private final String checkKey(String str) {
        Set<String> set = this.keySet;
        if (set == null || set.contains(str)) {
            return str;
        }
        throw new IllegalStateException("Can't access key outside migration: ".concat(String.valueOf(str)));
    }

    public static /* synthetic */ String getString$default(SharedPreferencesView sharedPreferencesView, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return sharedPreferencesView.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set getStringSet$default(SharedPreferencesView sharedPreferencesView, String str, Set set, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            set = null;
        }
        return sharedPreferencesView.getStringSet(str, set);
    }

    public final boolean contains(String str) {
        x.f(str, "key");
        checkKey(str);
        return this.prefs.contains(str);
    }

    public final Map<String, Object> getAll() {
        Map<String, ?> all = this.prefs.getAll();
        x.e(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set<String> set = this.keySet;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(r.a(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = i.au((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public final boolean getBoolean(String str, boolean z) {
        x.f(str, "key");
        checkKey(str);
        return this.prefs.getBoolean(str, z);
    }

    public final float getFloat(String str, float f2) {
        x.f(str, "key");
        checkKey(str);
        return this.prefs.getFloat(str, f2);
    }

    public final int getInt(String str, int i2) {
        x.f(str, "key");
        checkKey(str);
        return this.prefs.getInt(str, i2);
    }

    public final long getLong(String str, long j2) {
        x.f(str, "key");
        checkKey(str);
        return this.prefs.getLong(str, j2);
    }

    public final String getString(String str, String str2) {
        x.f(str, "key");
        checkKey(str);
        return this.prefs.getString(str, str2);
    }

    public final Set<String> getStringSet(String str, Set<String> set) {
        x.f(str, "key");
        checkKey(str);
        Set<String> stringSet = this.prefs.getStringSet(str, set);
        if (stringSet != null) {
            return i.at(stringSet);
        }
        return null;
    }
}
