package G6;

import D6.C0395s;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4504a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4505b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Context f4506c;

    public G(Context context) {
        this.f4506c = context;
    }

    public final void a() {
        zzbio zzbioVar = zzbix.zzma;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            U u10 = C6.n.f1857D.f1863c;
            HashMap mapP = U.P((String) c0395s.f2492c.zzd(zzbix.zzmf));
            for (String str : mapP.keySet()) {
                synchronized (this) {
                    try {
                        HashMap map = this.f4504a;
                        if (!map.containsKey(str)) {
                            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f4506c) : this.f4506c.getSharedPreferences(str, 0);
                            E e7 = new E(this, str);
                            map.put(str, e7);
                            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(e7);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            b(new F(mapP));
        }
    }

    public final synchronized void b(F f10) {
        this.f4505b.add(f10);
    }
}
