package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class wat {
    private static final Map a = new yw();
    private final SharedPreferences b;
    private SharedPreferences.OnSharedPreferenceChangeListener c;

    static synchronized void a() {
        Map map = a;
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            wat watVar = (wat) it.next();
            SharedPreferences sharedPreferences = watVar.b;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = watVar.c;
            throw null;
        }
        map.clear();
    }
}
