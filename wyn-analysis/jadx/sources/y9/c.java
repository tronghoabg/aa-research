package Y9;

import A.AbstractC0213f;
import A.C0229w;
import A.InterfaceC0222o;
import A.InterfaceC0228v;
import A0.f;
import A7.AbstractC0261j0;
import A7.AbstractC0304y;
import A7.C0249f0;
import A7.C0264k0;
import A7.C0273n0;
import A7.C0303x1;
import A7.N;
import A7.P;
import A7.Z;
import C6.n;
import D6.C0395s;
import G6.C0549m;
import G6.L;
import G9.e;
import H6.l;
import I4.A;
import I4.C0617b;
import I4.m;
import I4.p;
import I4.q;
import J8.AbstractC0640o;
import J8.C0627b;
import J8.C0641p;
import K8.C0693e;
import N6.j;
import S1.v;
import Se.h;
import a2.C1325e;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.UiModeManager;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzhcc;
import com.google.android.gms.internal.measurement.zzs;
import com.google.android.gms.internal.measurement.zzv;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import df.InterfaceC2432a;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import ka.AbstractC3230e0;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p7.AbstractC3772b;
import x.AbstractC4427t;
import x.C4422o;
import x.C4425r;
import x4.d;
import xg.g;

/* loaded from: classes4.dex */
public final class c implements InterfaceC0222o, zzv, q, Continuation, zzhcc, Le.c {

    /* renamed from: c, reason: collision with root package name */
    public static volatile c f16736c;

    /* renamed from: d, reason: collision with root package name */
    public static c f16737d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16738a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16739b;

    public /* synthetic */ c(int i5, boolean z2) {
        this.f16738a = i5;
    }

    public static Ba.c e(g gVar) {
        new v(1);
        gVar.getClass();
        new HashMap();
        throw null;
    }

    public static c h() {
        if (f16737d == null) {
            f16737d = new c(27, false);
        }
        return f16737d;
    }

    public static ArrayList k(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            Object objL = jSONArray.get(i5);
            if (objL instanceof JSONArray) {
                objL = k((JSONArray) objL);
            } else if (objL instanceof JSONObject) {
                objL = l((JSONObject) objL);
            }
            arrayList.add(objL);
        }
        return arrayList;
    }

    public static HashMap l(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objL = jSONObject.get(next);
            if (objL instanceof JSONArray) {
                objL = k((JSONArray) objL);
            } else if (objL instanceof JSONObject) {
                objL = l((JSONObject) objL);
            }
            map.put(next, objL);
        }
        return map;
    }

    public JSONObject a(View view) {
        int currentModeType;
        JSONObject jSONObjectA = Ra.b.a(0, 0, 0, 0);
        UiModeManager uiModeManager = AbstractC3230e0.f39407g;
        try {
            jSONObjectA.put("noOutputDevice", Ra.a.f10569a[AbstractC0213f.f((uiModeManager == null || (currentModeType = uiModeManager.getCurrentModeType()) == 1 || currentModeType != 4) ? 2 : AbstractC3772b.f43265c)] == 1);
            return jSONObjectA;
        } catch (JSONException e7) {
            Log.e("OMIDLIB", "Error with setting output device status", e7);
            return jSONObjectA;
        }
    }

    @Override // Le.c
    public Object apply(Object obj) {
        switch (this.f16738a) {
            case 19:
                List list = (List) obj;
                Collections.sort(list, (f) this.f16739b);
                return list;
            default:
                return ((d) ((h) this.f16739b).f11081c).apply(new Object[]{obj});
        }
    }

    public void b(Object obj, Object obj2) {
        C4422o c4422o = (C4422o) this.f16739b;
        int iD = c4422o.d(obj);
        boolean z2 = iD < 0;
        Object obj3 = z2 ? null : c4422o.f47536c[iD];
        if (obj3 != null) {
            if (obj3 instanceof C4425r) {
                ((C4425r) obj3).a(obj2);
            } else if (obj3 != obj2) {
                C4425r c4425r = new C4425r();
                c4425r.a(obj3);
                c4425r.a(obj2);
                obj2 = c4425r;
            }
            obj2 = obj3;
        }
        if (!z2) {
            c4422o.f47536c[iD] = obj2;
            return;
        }
        int i5 = ~iD;
        c4422o.f47535b[i5] = obj;
        c4422o.f47536c[i5] = obj2;
    }

    public X8.c c() {
        e eVar = (e) this.f16739b;
        if (eVar == null) {
            throw new IllegalStateException(e.class.getCanonicalName() + " must be set");
        }
        X8.c cVar = new X8.c();
        cVar.f16184a = C9.a.a(new G9.f(0, eVar));
        InterfaceC2432a interfaceC2432aA = C9.a.a(new G9.f(2, eVar));
        cVar.f16185b = interfaceC2432aA;
        G9.f fVar = new G9.f(1, eVar);
        cVar.f16186c = fVar;
        cVar.f16187d = C9.a.a(new E9.b((InterfaceC2432a) cVar.f16184a, interfaceC2432aA, fVar, 2));
        cVar.f16188e = C9.a.a(new E9.b((InterfaceC2432a) cVar.f16184a, (InterfaceC2432a) cVar.f16185b, (G9.f) cVar.f16186c, 3));
        cVar.f16189f = C9.a.a(new E9.b((InterfaceC2432a) cVar.f16184a, (InterfaceC2432a) cVar.f16185b, (G9.f) cVar.f16186c, 0));
        cVar.f16190g = C9.a.a(new E9.b((InterfaceC2432a) cVar.f16184a, (InterfaceC2432a) cVar.f16185b, (G9.f) cVar.f16186c, 1));
        return cVar;
    }

    @Override // I4.q
    public p d(I4.v vVar) {
        switch (this.f16738a) {
            case 12:
                return new C0617b((Resources) this.f16739b, A.f5319b);
            default:
                return new J4.a((c) this.f16739b);
        }
    }

    public A3.d f(Object obj, KClass clazz, Activity activity, F3.b bVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC3340k.e(clazz, "clazz");
        Object objNewProxyInstance = Proxy.newProxyInstance((ClassLoader) this.f16739b, new Class[]{q()}, new A3.c(clazz, bVar));
        AbstractC3340k.d(objNewProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, q()).invoke(obj, activity, objNewProxyInstance);
        return new A3.d(obj.getClass().getMethod("removeWindowLayoutInfoListener", q()), obj, objNewProxyInstance);
    }

    public HashMap g(String str) {
        String string = i().getString(str, null);
        if (string != null) {
            try {
                HashMap map = new HashMap(1);
                HashMap mapL = l(new JSONObject(string));
                mapL.put("to", str);
                map.put(PglCryptUtils.KEY_MESSAGE, mapL);
                return map;
            } catch (JSONException e7) {
                e7.printStackTrace();
            }
        }
        return null;
    }

    @Override // A.InterfaceC0222o
    public InterfaceC0228v get(int i5) {
        return (C0229w) this.f16739b;
    }

    public SharedPreferences i() {
        if (((SharedPreferences) this.f16739b) == null) {
            this.f16739b = AbstractC3230e0.f39408h.getSharedPreferences("io.flutter.plugins.firebase.messaging", 0);
        }
        return (SharedPreferences) this.f16739b;
    }

    public Set j() {
        Set setUnmodifiableSet;
        synchronized (((HashSet) this.f16739b)) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f16739b);
        }
        return setUnmodifiableSet;
    }

    public JSONObject m() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f16739b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(R8.g.i(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e7) {
                        e = e7;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        R8.g.b(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    R8.g.b(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            R8.g.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            R8.g.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public boolean n(Object obj, Object obj2) {
        C4422o c4422o = (C4422o) this.f16739b;
        Object objE = c4422o.e(obj);
        if (objE == null) {
            return false;
        }
        if (!(objE instanceof C4425r)) {
            if (!objE.equals(obj2)) {
                return false;
            }
            c4422o.g(obj);
            return true;
        }
        C4425r c4425r = (C4425r) objE;
        boolean zJ = c4425r.j(obj2);
        if (zJ && c4425r.g()) {
            c4422o.g(obj);
        }
        return zJ;
    }

    public void o(String str) {
        i().edit().remove(str).apply();
        String string = i().getString("notification_ids", "");
        if (string.isEmpty()) {
            return;
        }
        i().edit().putString("notification_ids", string.replace(str.concat(","), "")).apply();
    }

    public void p(Object obj) {
        boolean zG;
        C4422o c4422o = (C4422o) this.f16739b;
        long[] jArr = c4422o.f47534a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j8 = jArr[i5];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i5 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j8) < 128) {
                        int i12 = (i5 << 3) + i11;
                        Object obj2 = c4422o.f47535b[i12];
                        Object obj3 = c4422o.f47536c[i12];
                        if (obj3 instanceof C4425r) {
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                            C4425r c4425r = (C4425r) obj3;
                            c4425r.j(obj);
                            zG = c4425r.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            c4422o.h(i12);
                        }
                    }
                    j8 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i5 == length) {
                return;
            } else {
                i5++;
            }
        }
    }

    public Class q() throws ClassNotFoundException {
        Class<?> clsLoadClass = ((ClassLoader) this.f16739b).loadClass("java.util.function.Consumer");
        AbstractC3340k.d(clsLoadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return clsLoadClass;
    }

    public void r() {
        C0303x1 c0303x1 = (C0303x1) this.f16739b;
        c0303x1.c0();
        Z zA0 = c0303x1.a0();
        C0273n0 c0273n0 = (C0273n0) c0303x1.f421a;
        c0273n0.f985n.getClass();
        if (zA0.i0(System.currentTimeMillis())) {
            c0303x1.a0().f772m.c(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                c0303x1.zzj().f612n.c("Detected application was in foreground");
                c0273n0.f985n.getClass();
                u(System.currentTimeMillis());
            }
        }
    }

    public void s(long j8) {
        C0303x1 c0303x1 = (C0303x1) this.f16739b;
        c0303x1.c0();
        c0303x1.k0();
        if (c0303x1.a0().i0(j8)) {
            c0303x1.a0().f772m.c(true);
            ((C0273n0) c0303x1.f421a).j().m0();
        }
        c0303x1.a0().f776q.f(j8);
        if (c0303x1.a0().f772m.d()) {
            u(j8);
        }
    }

    public void t(String str, Bundle bundle) {
        String string;
        C0273n0 c0273n0 = (C0273n0) this.f16739b;
        C0264k0 c0264k0 = c0273n0.f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
        if (c0273n0.e()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        Z z2 = c0273n0.f980h;
        C0273n0.c(z2);
        z2.f783x.v(string);
        C0273n0.c(z2);
        c0273n0.f985n.getClass();
        z2.f784y.f(System.currentTimeMillis());
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        C0627b c0627b;
        C0641p c0641p = (C0641p) task.getResult();
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(s8.g.f(((C0693e) ((AbstractC0640o) this.f16739b)).f6629c));
        String str = c0641p.f5812a;
        AbstractC1732v.i(str);
        firebaseAuth.getClass();
        AbstractC1732v.f(str);
        String str2 = firebaseAuth.f27291i;
        if (str2 != null) {
            c0627b = new C0627b(new C0549m(1));
            c0627b.f5791h = str2;
        } else {
            c0627b = null;
        }
        return firebaseAuth.f27287e.zza(firebaseAuth.f27283a, c0627b, str);
    }

    public void u(long j8) {
        C0303x1 c0303x1 = (C0303x1) this.f16739b;
        c0303x1.c0();
        C0273n0 c0273n0 = (C0273n0) c0303x1.f421a;
        if (c0273n0.e()) {
            c0303x1.a0().f776q.f(j8);
            c0273n0.f985n.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            N nZzj = c0303x1.zzj();
            nZzj.f612n.d("Session started, time", Long.valueOf(jElapsedRealtime));
            long j10 = j8 / 1000;
            c0303x1.e0().k0(j8, Long.valueOf(j10), "auto", "_sid");
            c0303x1.a0().f777r.f(j10);
            c0303x1.a0().f772m.c(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j10);
            c0303x1.e0().v0("auto", "_s", bundle, j8);
            String strU = c0303x1.a0().f782w.u();
            if (TextUtils.isEmpty(strU)) {
                return;
            }
            c0303x1.e0().v0("auto", "_ssr", AbstractC3256n.b("_ffr", strU), j8);
        }
    }

    public boolean v() {
        Z z2 = ((C0273n0) this.f16739b).f980h;
        C0273n0.c(z2);
        return z2.f784y.d() > 0;
    }

    public boolean w() {
        if (!v()) {
            return false;
        }
        C0273n0 c0273n0 = (C0273n0) this.f16739b;
        c0273n0.f985n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Z z2 = c0273n0.f980h;
        C0273n0.c(z2);
        return jCurrentTimeMillis - z2.f784y.d() > c0273n0.f979g.j0(null, AbstractC0304y.f1159W);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public void zza(Throwable th) {
        n.f1857D.f1868h.zzh(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        Pair pair = new Pair("sgf_reason", th.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        j jVar = (j) this.f16739b;
        AbstractC3772b.a0(jVar.k, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(jVar.f8485C.get())));
        int i5 = L.f4523b;
        l.d("Failed to initialize webview for loading SDKCore. ", th);
        zzbio zzbioVar = zzbix.zzlp;
        C0395s c0395s = C0395s.f2489e;
        if (!((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() || jVar.f8484B.get() || jVar.f8485C.getAndIncrement() >= ((Integer) c0395s.f2492c.zzd(zzbix.zzlq)).intValue()) {
            return;
        }
        jVar.U();
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public void zzb(Object obj) {
        int i5 = L.f4523b;
        l.a("Initialized webview successfully for SDKCore.");
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzlp)).booleanValue()) {
            Pair pair = new Pair("se", "query_g");
            Pair pair2 = new Pair("ad_format", "BANNER");
            Pair pair3 = new Pair("rtype", Integer.toString(6));
            Pair pair4 = new Pair("scar", "true");
            j jVar = (j) this.f16739b;
            AbstractC3772b.a0(jVar.k, "sgs", pair, pair2, pair3, pair4, new Pair("sgi_rn", Integer.toString(jVar.f8485C.get())));
            jVar.f8484B.set(true);
        }
    }

    public /* synthetic */ c(Object obj, int i5) {
        this.f16738a = i5;
        this.f16739b = obj;
    }

    public c(j jVar) {
        this.f16738a = 18;
        Objects.requireNonNull(jVar);
        this.f16739b = jVar;
    }

    public c(int i5) {
        this.f16738a = i5;
        switch (i5) {
            case 6:
                this.f16739b = new LinkedHashMap((int) ((8 / 0.75f) + 1.0f));
                break;
            case 10:
                this.f16739b = new ConcurrentHashMap();
                new AtomicInteger(0);
                break;
            case 11:
                this.f16739b = new m(500L);
                break;
            case 13:
                this.f16739b = new Object();
                break;
            case 14:
                this.f16739b = new c(11);
                break;
            case 20:
                long[] jArr = AbstractC4427t.f47559a;
                this.f16739b = new C4422o();
                break;
            case 29:
                this.f16739b = new C1325e(5, 1.0f, false);
                break;
            default:
                this.f16739b = new HashSet();
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public void zza(zzs zzsVar, String str, List list, boolean z2, boolean z10) {
        P p10;
        int i5 = AbstractC0261j0.f914a[zzsVar.ordinal()];
        C0249f0 c0249f0 = (C0249f0) this.f16739b;
        if (i5 == 1) {
            p10 = c0249f0.zzj().f611m;
        } else if (i5 != 2) {
            if (i5 != 3) {
                if (i5 != 4) {
                    p10 = c0249f0.zzj().f610l;
                } else {
                    p10 = c0249f0.zzj().f612n;
                }
            } else if (z2) {
                p10 = c0249f0.zzj().f609j;
            } else if (!z10) {
                p10 = c0249f0.zzj().k;
            } else {
                p10 = c0249f0.zzj().f608i;
            }
        } else if (z2) {
            p10 = c0249f0.zzj().f606g;
        } else if (!z10) {
            p10 = c0249f0.zzj().f607h;
        } else {
            p10 = c0249f0.zzj().f605f;
        }
        int size = list.size();
        if (size == 1) {
            p10.d(str, list.get(0));
            return;
        }
        if (size == 2) {
            p10.b(list.get(0), str, list.get(1));
        } else if (size != 3) {
            p10.c(str);
        } else {
            p10.a(list.get(0), list.get(1), list.get(2), str);
        }
    }

    public c(X8.c cVar) {
        this.f16738a = 28;
        this.f16739b = new File((File) cVar.f16186c, "com.crashlytics.settings.json");
    }

    public c(UUID uuid, int i5, byte[] bArr) {
        this.f16738a = 17;
        this.f16739b = uuid;
    }

    public c(float f10) {
        this.f16738a = 1;
        this.f16739b = new C0229w(f10, 0.01f);
    }
}
