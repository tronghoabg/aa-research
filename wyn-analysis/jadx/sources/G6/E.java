package G6;

import android.content.SharedPreferences;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class E implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final String f4501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f4502b;

    public E(G g9, String str) {
        Objects.requireNonNull(g9);
        this.f4502b = g9;
        this.f4501a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        G g9 = this.f4502b;
        synchronized (g9) {
            try {
                Iterator it = g9.f4505b.iterator();
                while (it.hasNext()) {
                    F f10 = (F) it.next();
                    String str2 = this.f4501a;
                    HashMap map = f10.f4503a;
                    if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                        ((O) C6.n.f1857D.f1868h.zzp()).E(false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
