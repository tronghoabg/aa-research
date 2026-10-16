package Tc;

import C8.j;
import G8.c;
import T3.r;
import Va.Y7;
import Z9.d;
import Z9.k;
import aa.e;
import aa.i;
import aa.l;
import aa.q;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.core.di.ServiceProvider;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import j$.util.Objects;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.json.JSONException;
import org.json.JSONObject;
import qc.C3884a;
import qc.InterfaceC3885b;
import s8.g;
import uc.C4271h;
import uc.C4273j;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4269f;
import uc.InterfaceC4270g;
import uc.InterfaceC4272i;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;

/* loaded from: classes5.dex */
public class b implements FlutterFirebasePlugin, InterfaceC4279p, InterfaceC3885b, InterfaceC4272i {

    /* renamed from: a, reason: collision with root package name */
    public C4281r f11828a;

    /* renamed from: c, reason: collision with root package name */
    public C4273j f11830c;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f11829b = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Handler f11831d = new Handler(Looper.getMainLooper());

    public static HashMap a(d dVar) {
        HashMap map = new HashMap();
        map.put("fetchTimeout", Long.valueOf(dVar.c().f17482c.f1944a));
        map.put("minimumFetchInterval", Long.valueOf(dVar.c().f17482c.f1945b));
        map.put("lastFetchTime", Long.valueOf(dVar.c().f17480a));
        int i5 = dVar.c().f17481b;
        map.put("lastFetchStatus", i5 != -1 ? i5 != 0 ? i5 != 2 ? "failure" : "throttled" : "noFetchYet" : "success");
        Objects.toString(map.get("fetchTimeout"));
        return map;
    }

    public static HashMap b(HashMap map) {
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            q qVar = (q) map.get(str);
            Objects.requireNonNull(qVar);
            HashMap map3 = new HashMap();
            int i5 = qVar.f17484b;
            map3.put(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, i5 == 0 ? d.f17049m : qVar.f17483a.getBytes(i.f17445e));
            map3.put("source", i5 != 1 ? i5 != 2 ? "static" : ServiceProvider.NAMED_REMOTE : BuildConfig.FLAVOR);
            map2.put(str, map3);
        }
        return map2;
    }

    public final void c() {
        HashMap map = this.f11829b;
        for (l lVar : map.values()) {
            Y7 y72 = lVar.f17459b;
            a aVar = lVar.f17458a;
            synchronized (y72) {
                ((LinkedHashSet) y72.f13867a).remove(aVar);
            }
        }
        map.clear();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new r(2, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task getPluginConstantsForFirebaseApp(g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new B8.a(this, gVar, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        InterfaceC4269f interfaceC4269f = c3884a.f44188c;
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_remote_config", this);
        C4281r c4281r = new C4281r(interfaceC4269f, "plugins.flutter.io/firebase_remote_config");
        this.f11828a = c4281r;
        c4281r.b(this);
        C4273j c4273j = new C4273j(interfaceC4269f, "plugins.flutter.io/firebase_remote_config_updated");
        this.f11830c = c4273j;
        c4273j.a(this);
    }

    @Override // uc.InterfaceC4272i
    public final void onCancel(Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            return;
        }
        Object obj2 = map.get("appName");
        Objects.requireNonNull(obj2);
        String str = (String) obj2;
        HashMap map2 = this.f11829b;
        l lVar = (l) map2.get(str);
        if (lVar != null) {
            Y7 y72 = lVar.f17459b;
            a aVar = lVar.f17458a;
            synchronized (y72) {
                ((LinkedHashSet) y72.f13867a).remove(aVar);
            }
            map2.remove(str);
        }
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        this.f11828a.b(null);
        this.f11828a = null;
        this.f11830c.a(null);
        this.f11830c = null;
        c();
    }

    @Override // uc.InterfaceC4272i
    public final void onListen(Object obj, InterfaceC4270g interfaceC4270g) {
        l lVar;
        Map map = (Map) obj;
        Object obj2 = map.get("appName");
        Objects.requireNonNull(obj2);
        d dVarA = ((k) g.f((String) obj2).c(k.class)).a();
        Object obj3 = map.get("appName");
        Objects.requireNonNull(obj3);
        String str = (String) obj3;
        HashMap map2 = this.f11829b;
        a aVar = new a(this, (C4271h) interfaceC4270g);
        Y7 y72 = dVarA.k;
        synchronized (y72) {
            ((LinkedHashSet) y72.f13867a).add(aVar);
            y72.c();
            lVar = new l(y72, aVar);
        }
        map2.put(str, lVar);
    }

    @Override // uc.InterfaceC4279p
    public final void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        int i5;
        d dVarA;
        Task<Void> taskWhenAll;
        i5 = 7;
        int i10 = 4;
        Object obj = ((Map) c4278o.f46760b).get("appName");
        Objects.requireNonNull(obj);
        dVarA = ((k) g.f((String) obj).c(k.class)).a();
        String str = c4278o.f46759a;
        str.getClass();
        switch (str) {
            case "RemoteConfig#ensureInitialized":
                Task taskB = dVarA.f17054e.b();
                Task taskB2 = dVarA.f17055f.b();
                Task taskB3 = dVarA.f17053d.b();
                c cVar = new c(dVarA, i5);
                Executor executor = dVarA.f17052c;
                Task taskCall = Tasks.call(executor, cVar);
                P9.c cVar2 = (P9.c) dVarA.f17059j;
                taskWhenAll = Tasks.whenAll((Task<?>[]) new Task[]{Tasks.whenAllComplete((Task<?>[]) new Task[]{taskB, taskB2, taskB3, taskCall, cVar2.d(), cVar2.e()}).continueWith(executor, new S8.b(taskCall, 18))});
                break;
            case "RemoteConfig#setConfigSettings":
                Integer num = (Integer) c4278o.a("fetchTimeout");
                Objects.requireNonNull(num);
                int iIntValue = num.intValue();
                Integer num2 = (Integer) c4278o.a("minimumFetchInterval");
                Objects.requireNonNull(num2);
                int iIntValue2 = num2.intValue();
                j jVar = new j(1);
                long j8 = iIntValue;
                if (j8 < 0) {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j8)));
                }
                jVar.f1944a = j8;
                jVar.a(iIntValue2);
                j jVar2 = new j(jVar);
                dVarA.getClass();
                taskWhenAll = Tasks.call(dVarA.f17052c, new B8.c(i5, dVarA, jVar2));
                break;
            case "RemoteConfig#getProperties":
                taskWhenAll = Tasks.forResult(a(dVarA));
                break;
            case "RemoteConfig#fetch":
                taskWhenAll = dVarA.a();
                break;
            case "RemoteConfig#activate":
                Task taskB4 = dVarA.f17053d.b();
                Task taskB5 = dVarA.f17054e.b();
                taskWhenAll = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskB4, taskB5}).continueWithTask(dVarA.f17052c, new A5.g(dVarA, taskB4, taskB5, 8));
                break;
            case "RemoteConfig#getAll":
                taskWhenAll = Tasks.forResult(b(dVarA.b()));
                break;
            case "RemoteConfig#fetchAndActivate":
                taskWhenAll = dVarA.a().onSuccessTask(dVarA.f17052c, new Z9.c(dVarA));
                break;
            case "RemoteConfig#setDefaults":
                Map map = (Map) c4278o.a("defaults");
                Objects.requireNonNull(map);
                dVarA.getClass();
                HashMap map2 = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof byte[]) {
                        map2.put((String) entry.getKey(), new String((byte[]) value));
                    } else {
                        map2.put((String) entry.getKey(), value.toString());
                    }
                }
                try {
                    aa.d dVarC = e.c();
                    dVarC.f17415a = new JSONObject(map2);
                    taskWhenAll = dVarA.f17055f.e(dVarC.a()).onSuccessTask(M8.i.f7556a, new V1.c(13));
                    break;
                } catch (JSONException e7) {
                    Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e7);
                    taskWhenAll = Tasks.forResult(null);
                    break;
                }
            default:
                ((tc.g) interfaceC4280q).c();
                return;
        }
        taskWhenAll.addOnCompleteListener(new Ka.b((tc.g) interfaceC4280q, i10));
    }
}
