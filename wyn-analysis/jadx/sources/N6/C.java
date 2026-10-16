package N6;

import A7.W0;
import D6.C0395s;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzdzo;
import com.google.android.gms.internal.ads.zzdzy;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p7.AbstractC3772b;

/* loaded from: classes3.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final int f8431a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8432b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8433c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8434d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f8435e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f8436f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f8437g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public final zzdzy f8438h;

    /* renamed from: i, reason: collision with root package name */
    public ConcurrentHashMap f8439i;

    public C(zzdzy zzdzyVar) {
        this.f8438h = zzdzyVar;
        zzbio zzbioVar = zzbix.zzhX;
        C0395s c0395s = C0395s.f2489e;
        this.f8431a = ((Integer) c0395s.f2492c.zzd(zzbioVar)).intValue();
        zzbio zzbioVar2 = zzbix.zzhY;
        zzbiv zzbivVar = c0395s.f2492c;
        this.f8432b = ((Long) zzbivVar.zzd(zzbioVar2)).longValue();
        this.f8433c = ((Boolean) zzbivVar.zzd(zzbix.zzic)).booleanValue();
        this.f8434d = ((Boolean) zzbivVar.zzd(zzbix.zzib)).booleanValue();
        this.f8435e = DesugarCollections.synchronizedMap(new A(this));
    }

    public final synchronized String a(String str, zzdzo zzdzoVar) {
        B b5 = (B) this.f8435e.get(str);
        zzdzoVar.zzc().put("request_id", str);
        if (b5 == null) {
            zzdzoVar.zzc().put("mhit", "false");
            return null;
        }
        zzdzoVar.zzc().put("mhit", "true");
        return b5.f8429b;
    }

    public final synchronized void b(String str) {
        this.f8435e.remove(str);
    }

    public final synchronized boolean c(String str, String str2) {
        B b5 = (B) this.f8435e.get(str);
        if (b5 != null) {
            if (b5.f8430c.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean d(int i5, String str, String str2) {
        B b5 = (B) this.f8435e.get(str);
        if (b5 == null) {
            return false;
        }
        HashSet hashSet = b5.f8430c;
        hashSet.add(str2);
        return hashSet.size() < i5;
    }

    public final synchronized void e() {
        C6.n.f1857D.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = this.f8435e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((B) entry.getValue()).f8428a.longValue() <= this.f8432b) {
                    break;
                }
                this.f8437g.add(new Pair((String) entry.getKey(), ((B) entry.getValue()).f8429b));
                it.remove();
            }
        } catch (ConcurrentModificationException e7) {
            C6.n.f1857D.f1868h.zzh(e7, "QueryJsonMap.removeExpiredEntries");
        }
    }

    public final synchronized void f(zzdzo zzdzoVar) throws Throwable {
        try {
            try {
                if (this.f8433c) {
                    ArrayDeque arrayDeque = this.f8437g;
                    ArrayDeque arrayDequeClone = arrayDeque.clone();
                    arrayDeque.clear();
                    ArrayDeque arrayDeque2 = this.f8436f;
                    ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
                    arrayDeque2.clear();
                    zzcfy.zza.execute(new W0(this, zzdzoVar, arrayDequeClone, arrayDequeClone2, 7, false));
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void g(zzdzo zzdzoVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdzoVar.zzc());
            this.f8439i = concurrentHashMap;
            concurrentHashMap.put(HandleInvocationsFromAdViewer.KEY_ACTION, "ev");
            this.f8439i.put("e_r", str);
            this.f8439i.put("e_id", (String) pair2.first);
            if (this.f8434d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(AbstractC3772b.X(jSONObject.getJSONObject(HandleInvocationsFromAdViewer.KEY_EXTRAS).getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                ConcurrentHashMap concurrentHashMap2 = this.f8439i;
                String str2 = (String) pair.first;
                if (!TextUtils.isEmpty(str2)) {
                    concurrentHashMap2.put("e_type", str2);
                }
                ConcurrentHashMap concurrentHashMap3 = this.f8439i;
                String str3 = (String) pair.second;
                if (!TextUtils.isEmpty(str3)) {
                    concurrentHashMap3.put("e_agent", str3);
                }
            }
            this.f8438h.zzb(this.f8439i);
        }
    }
}
