package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wbp {
    private static final java.util.Map a = new defpackage.zd();
    private final android.content.SharedPreferences b;
    private android.content.SharedPreferences.OnSharedPreferenceChangeListener c;

    static synchronized void a() {
        java.util.Map map = a;
        java.util.Iterator it = map.values().iterator();
        if (it.hasNext()) {
            defpackage.wbp wbpVar = (defpackage.wbp) it.next();
            android.content.SharedPreferences sharedPreferences = wbpVar.b;
            android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = wbpVar.c;
            throw null;
        }
        map.clear();
    }
}
