package Rc;

import R8.m;
import R8.o;
import R8.p;
import R8.q;
import R8.s;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.crashlytics.FlutterError;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import qc.C3884a;
import qc.InterfaceC3885b;
import r7.AbstractC3935e;
import s8.g;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;

/* loaded from: classes5.dex */
public class e implements FlutterFirebasePlugin, InterfaceC3885b, InterfaceC4279p {

    /* renamed from: a, reason: collision with root package name */
    public C4281r f10584a;

    public static boolean a(e eVar, g gVar) {
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        eVar.getClass();
        gVar.a();
        Context context = gVar.f45328a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            return sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true);
        }
        gVar.a();
        try {
            packageManager = context.getPackageManager();
        } catch (PackageManager.NameNotFoundException e7) {
            Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e7);
        }
        Boolean boolValueOf = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? Boolean.TRUE : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        N8.c.a().b(boolValueOf);
        return boolValueOf.booleanValue();
    }

    public static StackTraceElement b(Map map) {
        try {
            String str = (String) map.get("file");
            String str2 = (String) map.get("line");
            String str3 = (String) map.get("class");
            String str4 = (String) map.get("method");
            if (str3 == null) {
                str3 = "";
            }
            Objects.requireNonNull(str2);
            return new StackTraceElement(str3, str4, str, Integer.parseInt(str2));
        } catch (Exception unused) {
            Log.e("FLTFirebaseCrashlytics", "Unable to generate stack trace element from Dart error.");
            return null;
        }
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Nc.c(4, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task getPluginConstantsForFirebaseApp(g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.a(this, taskCompletionSource, gVar, 6));
        return taskCompletionSource.getTask();
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        C4281r c4281r = new C4281r(c3884a.f44188c, "plugins.flutter.io/firebase_crashlytics");
        this.f10584a = c4281r;
        c4281r.b(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_crashlytics", this);
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        C4281r c4281r = this.f10584a;
        if (c4281r != null) {
            c4281r.b(null);
            this.f10584a = null;
        }
    }

    @Override // uc.InterfaceC4279p
    public final void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        final int i5;
        final int i10;
        Object obj;
        Task task;
        i5 = 1;
        i10 = 0;
        String str = c4278o.f46759a;
        str.getClass();
        obj = c4278o.f46760b;
        switch (str) {
            case "Crashlytics#didCrashOnPreviousExecution":
                final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: Rc.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f10582b;

                    {
                        this.f10582b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task task2;
                        switch (i5) {
                            case 0:
                                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                                this.f10582b.getClass();
                                try {
                                    m mVar = N8.c.a().f8600a.f10517h;
                                    if (mVar.f10494s.compareAndSet(false, true)) {
                                        task2 = mVar.f10491p.getTask();
                                    } else {
                                        Log.w("FirebaseCrashlytics", "checkForUnsentReports should only be called once per execution.", null);
                                        task2 = Tasks.forResult(Boolean.FALSE);
                                    }
                                    Boolean bool = (Boolean) Tasks.await(task2);
                                    bool.booleanValue();
                                    Nc.d dVar = new Nc.d();
                                    dVar.put("unsentReports", bool);
                                    taskCompletionSource2.setResult(dVar);
                                    break;
                                } catch (Exception e7) {
                                    taskCompletionSource2.setException(e7);
                                    return;
                                }
                            default:
                                TaskCompletionSource taskCompletionSource3 = taskCompletionSource;
                                this.f10582b.getClass();
                                try {
                                    boolean z2 = N8.c.a().f8600a.f10516g;
                                    Nc.d dVar2 = new Nc.d();
                                    dVar2.put("didCrashOnPreviousExecution", Boolean.valueOf(z2));
                                    taskCompletionSource3.setResult(dVar2);
                                    break;
                                } catch (Exception e10) {
                                    taskCompletionSource3.setException(e10);
                                }
                        }
                    }
                });
                task = taskCompletionSource.getTask();
                break;
            case "Crashlytics#recordError":
                final Map map = (Map) obj;
                final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: Rc.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f10578b;

                    {
                        this.f10578b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        FlutterError flutterError;
                        switch (i10) {
                            case 0:
                                Map map2 = map;
                                TaskCompletionSource taskCompletionSource3 = taskCompletionSource2;
                                this.f10578b.getClass();
                                try {
                                    N8.c cVarA = N8.c.a();
                                    Object obj2 = map2.get("exception");
                                    Objects.requireNonNull(obj2);
                                    String str2 = (String) obj2;
                                    String str3 = (String) map2.get("reason");
                                    Object obj3 = map2.get("information");
                                    Objects.requireNonNull(obj3);
                                    String str4 = (String) obj3;
                                    Object obj4 = map2.get("fatal");
                                    Objects.requireNonNull(obj4);
                                    boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                    Object obj5 = map2.get("buildId");
                                    Objects.requireNonNull(obj5);
                                    String str5 = (String) obj5;
                                    Object obj6 = map2.get("loadingUnits");
                                    Objects.requireNonNull(obj6);
                                    List<String> list = (List) obj6;
                                    if (str5.length() > 0) {
                                        s sVar = N8.c.a().f8600a;
                                        sVar.f10524p.f11034a.b(new q(sVar, "com.crashlytics.flutter.build-id.0", str5, 1));
                                    }
                                    int i11 = 0;
                                    for (String str6 : list) {
                                        i11++;
                                        s sVar2 = N8.c.a().f8600a;
                                        sVar2.f10524p.f11034a.b(new q(sVar2, "com.crashlytics.flutter.build-id." + i11, str6, 1));
                                    }
                                    s sVar3 = cVarA.f8600a;
                                    if (str3 != null) {
                                        sVar3.f10524p.f11034a.b(new q(sVar3, "flutter_error_reason", "thrown " + str3, 0));
                                        flutterError = new FlutterError(str2 + ". Error thrown " + str3 + ".");
                                    } else {
                                        flutterError = new FlutterError(str2);
                                    }
                                    sVar3.f10524p.f11034a.b(new q(sVar3, "flutter_error_exception", str2, 0));
                                    ArrayList arrayList = new ArrayList();
                                    Object obj7 = map2.get("stackTraceElements");
                                    Objects.requireNonNull(obj7);
                                    Iterator it = ((List) obj7).iterator();
                                    while (it.hasNext()) {
                                        StackTraceElement stackTraceElementB = e.b((Map) it.next());
                                        if (stackTraceElementB != null) {
                                            arrayList.add(stackTraceElementB);
                                        }
                                    }
                                    flutterError.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                                    if (!str4.isEmpty()) {
                                        sVar3.f10524p.f11034a.b(new o(sVar3, System.currentTimeMillis() - sVar3.f10513d, str4, 1));
                                    }
                                    if (zBooleanValue) {
                                        AbstractC3935e.K(flutterError);
                                    } else {
                                        sVar3.f10524p.f11034a.b(new p(sVar3, flutterError, 0));
                                    }
                                    taskCompletionSource3.setResult(null);
                                    break;
                                } catch (Exception e7) {
                                    taskCompletionSource3.setException(e7);
                                    return;
                                }
                            default:
                                Map map3 = map;
                                TaskCompletionSource taskCompletionSource4 = taskCompletionSource2;
                                e eVar = this.f10578b;
                                eVar.getClass();
                                try {
                                    Object obj8 = map3.get("enabled");
                                    Objects.requireNonNull(obj8);
                                    N8.c.a().b((Boolean) obj8);
                                    Nc.d dVar = new Nc.d();
                                    dVar.put("isCrashlyticsCollectionEnabled", Boolean.valueOf(e.a(eVar, g.e())));
                                    taskCompletionSource4.setResult(dVar);
                                    break;
                                } catch (Exception e10) {
                                    taskCompletionSource4.setException(e10);
                                }
                        }
                    }
                });
                task = taskCompletionSource2.getTask();
                break;
            case "Crashlytics#checkForUnsentReports":
                final TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: Rc.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f10582b;

                    {
                        this.f10582b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task task2;
                        switch (i10) {
                            case 0:
                                TaskCompletionSource taskCompletionSource22 = taskCompletionSource3;
                                this.f10582b.getClass();
                                try {
                                    m mVar = N8.c.a().f8600a.f10517h;
                                    if (mVar.f10494s.compareAndSet(false, true)) {
                                        task2 = mVar.f10491p.getTask();
                                    } else {
                                        Log.w("FirebaseCrashlytics", "checkForUnsentReports should only be called once per execution.", null);
                                        task2 = Tasks.forResult(Boolean.FALSE);
                                    }
                                    Boolean bool = (Boolean) Tasks.await(task2);
                                    bool.booleanValue();
                                    Nc.d dVar = new Nc.d();
                                    dVar.put("unsentReports", bool);
                                    taskCompletionSource22.setResult(dVar);
                                    break;
                                } catch (Exception e7) {
                                    taskCompletionSource22.setException(e7);
                                    return;
                                }
                            default:
                                TaskCompletionSource taskCompletionSource32 = taskCompletionSource3;
                                this.f10582b.getClass();
                                try {
                                    boolean z2 = N8.c.a().f8600a.f10516g;
                                    Nc.d dVar2 = new Nc.d();
                                    dVar2.put("didCrashOnPreviousExecution", Boolean.valueOf(z2));
                                    taskCompletionSource32.setResult(dVar2);
                                    break;
                                } catch (Exception e10) {
                                    taskCompletionSource32.setException(e10);
                                }
                        }
                    }
                });
                task = taskCompletionSource3.getTask();
                break;
            case "Crashlytics#sendUnsentReports":
                TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Nc.c(6, taskCompletionSource4));
                task = taskCompletionSource4.getTask();
                break;
            case "Crashlytics#setCrashlyticsCollectionEnabled":
                final Map map2 = (Map) obj;
                final TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: Rc.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f10578b;

                    {
                        this.f10578b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        FlutterError flutterError;
                        switch (i5) {
                            case 0:
                                Map map22 = map2;
                                TaskCompletionSource taskCompletionSource32 = taskCompletionSource5;
                                this.f10578b.getClass();
                                try {
                                    N8.c cVarA = N8.c.a();
                                    Object obj2 = map22.get("exception");
                                    Objects.requireNonNull(obj2);
                                    String str2 = (String) obj2;
                                    String str3 = (String) map22.get("reason");
                                    Object obj3 = map22.get("information");
                                    Objects.requireNonNull(obj3);
                                    String str4 = (String) obj3;
                                    Object obj4 = map22.get("fatal");
                                    Objects.requireNonNull(obj4);
                                    boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                    Object obj5 = map22.get("buildId");
                                    Objects.requireNonNull(obj5);
                                    String str5 = (String) obj5;
                                    Object obj6 = map22.get("loadingUnits");
                                    Objects.requireNonNull(obj6);
                                    List<String> list = (List) obj6;
                                    if (str5.length() > 0) {
                                        s sVar = N8.c.a().f8600a;
                                        sVar.f10524p.f11034a.b(new q(sVar, "com.crashlytics.flutter.build-id.0", str5, 1));
                                    }
                                    int i11 = 0;
                                    for (String str6 : list) {
                                        i11++;
                                        s sVar2 = N8.c.a().f8600a;
                                        sVar2.f10524p.f11034a.b(new q(sVar2, "com.crashlytics.flutter.build-id." + i11, str6, 1));
                                    }
                                    s sVar3 = cVarA.f8600a;
                                    if (str3 != null) {
                                        sVar3.f10524p.f11034a.b(new q(sVar3, "flutter_error_reason", "thrown " + str3, 0));
                                        flutterError = new FlutterError(str2 + ". Error thrown " + str3 + ".");
                                    } else {
                                        flutterError = new FlutterError(str2);
                                    }
                                    sVar3.f10524p.f11034a.b(new q(sVar3, "flutter_error_exception", str2, 0));
                                    ArrayList arrayList = new ArrayList();
                                    Object obj7 = map22.get("stackTraceElements");
                                    Objects.requireNonNull(obj7);
                                    Iterator it = ((List) obj7).iterator();
                                    while (it.hasNext()) {
                                        StackTraceElement stackTraceElementB = e.b((Map) it.next());
                                        if (stackTraceElementB != null) {
                                            arrayList.add(stackTraceElementB);
                                        }
                                    }
                                    flutterError.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                                    if (!str4.isEmpty()) {
                                        sVar3.f10524p.f11034a.b(new o(sVar3, System.currentTimeMillis() - sVar3.f10513d, str4, 1));
                                    }
                                    if (zBooleanValue) {
                                        AbstractC3935e.K(flutterError);
                                    } else {
                                        sVar3.f10524p.f11034a.b(new p(sVar3, flutterError, 0));
                                    }
                                    taskCompletionSource32.setResult(null);
                                    break;
                                } catch (Exception e7) {
                                    taskCompletionSource32.setException(e7);
                                    return;
                                }
                            default:
                                Map map3 = map2;
                                TaskCompletionSource taskCompletionSource42 = taskCompletionSource5;
                                e eVar = this.f10578b;
                                eVar.getClass();
                                try {
                                    Object obj8 = map3.get("enabled");
                                    Objects.requireNonNull(obj8);
                                    N8.c.a().b((Boolean) obj8);
                                    Nc.d dVar = new Nc.d();
                                    dVar.put("isCrashlyticsCollectionEnabled", Boolean.valueOf(e.a(eVar, g.e())));
                                    taskCompletionSource42.setResult(dVar);
                                    break;
                                } catch (Exception e10) {
                                    taskCompletionSource42.setException(e10);
                                }
                        }
                    }
                });
                task = taskCompletionSource5.getTask();
                break;
            case "Crashlytics#log":
                TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new a((Map) obj, taskCompletionSource6, 1));
                task = taskCompletionSource6.getTask();
                break;
            case "Crashlytics#setCustomKey":
                TaskCompletionSource taskCompletionSource7 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new a((Map) obj, taskCompletionSource7, 0));
                task = taskCompletionSource7.getTask();
                break;
            case "Crashlytics#deleteUnsentReports":
                TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Nc.c(5, taskCompletionSource8));
                task = taskCompletionSource8.getTask();
                break;
            case "Crashlytics#setUserIdentifier":
                TaskCompletionSource taskCompletionSource9 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new a((Map) obj, taskCompletionSource9, 2));
                task = taskCompletionSource9.getTask();
                break;
            case "Crashlytics#crash":
                new Handler(Looper.myLooper()).postDelayed(new b(0), 50L);
                return;
            default:
                ((tc.g) interfaceC4280q).c();
                return;
        }
        task.addOnCompleteListener(new Ka.b((tc.g) interfaceC4280q, 2));
    }
}
