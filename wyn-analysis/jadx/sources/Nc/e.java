package Nc;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.ads.metadata.MediationMetaData;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import qc.C3884a;
import qc.InterfaceC3885b;
import s8.g;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4269f;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;
import v8.EnumC4332a;

/* loaded from: classes5.dex */
public class e implements FlutterFirebasePlugin, InterfaceC4279p, InterfaceC3885b {

    /* renamed from: a, reason: collision with root package name */
    public FirebaseAnalytics f8652a;

    /* renamed from: b, reason: collision with root package name */
    public C4281r f8653b;

    public static Bundle a(Map map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            String str = (String) entry.getKey();
            if (value instanceof String) {
                bundle.putString(str, (String) value);
            } else if (value instanceof Integer) {
                bundle.putLong(str, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                bundle.putLong(str, ((Long) value).longValue());
            } else if (value instanceof Double) {
                bundle.putDouble(str, ((Double) value).doubleValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value == null) {
                bundle.putString(str, null);
            } else if (value instanceof Iterable) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (Object obj : (Iterable) value) {
                    if (!(obj instanceof Map)) {
                        throw new IllegalArgumentException("Unsupported value type: " + obj.getClass().getCanonicalName() + " in list at key " + str);
                    }
                    arrayList.add(a((Map) obj));
                }
                bundle.putParcelableArrayList(str, arrayList);
            } else {
                if (!(value instanceof Map)) {
                    throw new IllegalArgumentException("Unsupported value type: " + value.getClass().getCanonicalName());
                }
                bundle.putParcelable(str, a((Map) value));
            }
        }
        return bundle;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(0, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task getPluginConstantsForFirebaseApp(g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new a(this, taskCompletionSource, 0));
        return taskCompletionSource.getTask();
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        InterfaceC4269f interfaceC4269f = c3884a.f44188c;
        this.f8652a = FirebaseAnalytics.getInstance(c3884a.f44186a);
        C4281r c4281r = new C4281r(interfaceC4269f, "plugins.flutter.io/firebase_analytics");
        this.f8653b = c4281r;
        c4281r.b(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_analytics", this);
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        C4281r c4281r = this.f8653b;
        if (c4281r != null) {
            c4281r.b(null);
            this.f8653b = null;
        }
    }

    @Override // uc.InterfaceC4279p
    public final void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        final int i5;
        final int i10;
        final int i11;
        final int i12;
        final int i13;
        final int i14;
        final int i15;
        Object obj;
        Task task;
        i5 = 6;
        i10 = 5;
        i11 = 4;
        i12 = 0;
        i13 = 3;
        i14 = 2;
        i15 = 1;
        String str = c4278o.f46759a;
        str.getClass();
        obj = c4278o.f46760b;
        switch (str) {
            case "Analytics#getAppInstanceId":
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new a(this, taskCompletionSource, 2));
                task = taskCompletionSource.getTask();
                break;
            case "Analytics#resetAnalyticsData":
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new a(this, taskCompletionSource2, 3));
                task = taskCompletionSource2.getTask();
                break;
            case "Analytics#setConsent":
                final Map map = (Map) obj;
                final TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: Nc.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f8647b;

                    {
                        this.f8647b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                Map map2 = map;
                                TaskCompletionSource taskCompletionSource4 = taskCompletionSource3;
                                e eVar = this.f8647b;
                                eVar.getClass();
                                try {
                                    Boolean bool = (Boolean) map2.get("adStorageConsentGranted");
                                    Boolean bool2 = (Boolean) map2.get("analyticsStorageConsentGranted");
                                    Boolean bool3 = (Boolean) map2.get("adPersonalizationSignalsConsentGranted");
                                    Boolean bool4 = (Boolean) map2.get("adUserDataConsentGranted");
                                    HashMap map3 = new HashMap();
                                    EnumC4332a enumC4332a = EnumC4332a.f47025b;
                                    EnumC4332a enumC4332a2 = EnumC4332a.f47024a;
                                    if (bool != null) {
                                        map3.put(v8.b.f47027a, bool.booleanValue() ? enumC4332a2 : enumC4332a);
                                    }
                                    if (bool2 != null) {
                                        map3.put(v8.b.f47028b, bool2.booleanValue() ? enumC4332a2 : enumC4332a);
                                    }
                                    if (bool3 != null) {
                                        map3.put(v8.b.f47030d, bool3.booleanValue() ? enumC4332a2 : enumC4332a);
                                    }
                                    if (bool4 != null) {
                                        v8.b bVar = v8.b.f47029c;
                                        if (bool4.booleanValue()) {
                                            enumC4332a = enumC4332a2;
                                        }
                                        map3.put(bVar, enumC4332a);
                                    }
                                    eVar.f8652a.a(map3);
                                    taskCompletionSource4.setResult(null);
                                    break;
                                } catch (Exception e7) {
                                    taskCompletionSource4.setException(e7);
                                    return;
                                }
                            case 1:
                                Map map4 = map;
                                TaskCompletionSource taskCompletionSource5 = taskCompletionSource3;
                                e eVar2 = this.f8647b;
                                eVar2.getClass();
                                try {
                                    eVar2.f8652a.f27279a.zzd((String) map4.get("userId"));
                                    taskCompletionSource5.setResult(null);
                                    break;
                                } catch (Exception e10) {
                                    taskCompletionSource5.setException(e10);
                                    return;
                                }
                            case 2:
                                Map map5 = map;
                                TaskCompletionSource taskCompletionSource6 = taskCompletionSource3;
                                e eVar3 = this.f8647b;
                                eVar3.getClass();
                                try {
                                    FirebaseAnalytics firebaseAnalytics = eVar3.f8652a;
                                    Bundle bundleA = e.a(map5);
                                    if (bundleA != null) {
                                        firebaseAnalytics.getClass();
                                        bundleA = new Bundle(bundleA);
                                    }
                                    firebaseAnalytics.f27279a.zzd(bundleA);
                                    taskCompletionSource6.setResult(null);
                                    break;
                                } catch (Exception e11) {
                                    taskCompletionSource6.setException(e11);
                                    return;
                                }
                            case 3:
                                Map map6 = map;
                                TaskCompletionSource taskCompletionSource7 = taskCompletionSource3;
                                e eVar4 = this.f8647b;
                                eVar4.getClass();
                                try {
                                    Object obj2 = map6.get(MediationMetaData.KEY_NAME);
                                    Objects.requireNonNull(obj2);
                                    eVar4.f8652a.f27279a.zzb((String) obj2, (String) map6.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR));
                                    taskCompletionSource7.setResult(null);
                                    break;
                                } catch (Exception e12) {
                                    taskCompletionSource7.setException(e12);
                                    return;
                                }
                            case 4:
                                Map map7 = map;
                                TaskCompletionSource taskCompletionSource8 = taskCompletionSource3;
                                e eVar5 = this.f8647b;
                                eVar5.getClass();
                                try {
                                    Object obj3 = map7.get("eventName");
                                    Objects.requireNonNull(obj3);
                                    eVar5.f8652a.f27279a.zza((String) obj3, e.a((Map) map7.get("parameters")));
                                    taskCompletionSource8.setResult(null);
                                    break;
                                } catch (Exception e13) {
                                    taskCompletionSource8.setException(e13);
                                    return;
                                }
                            case 5:
                                Map map8 = map;
                                TaskCompletionSource taskCompletionSource9 = taskCompletionSource3;
                                e eVar6 = this.f8647b;
                                eVar6.getClass();
                                try {
                                    Objects.requireNonNull(map8.get("milliseconds"));
                                    eVar6.f8652a.f27279a.zza(((Integer) r0).intValue());
                                    taskCompletionSource9.setResult(null);
                                    break;
                                } catch (Exception e14) {
                                    taskCompletionSource9.setException(e14);
                                    return;
                                }
                            default:
                                Map map9 = map;
                                TaskCompletionSource taskCompletionSource10 = taskCompletionSource3;
                                e eVar7 = this.f8647b;
                                eVar7.getClass();
                                try {
                                    Object obj4 = map9.get("enabled");
                                    Objects.requireNonNull(obj4);
                                    eVar7.f8652a.f27279a.zza((Boolean) obj4);
                                    taskCompletionSource10.setResult(null);
                                    break;
                                } catch (Exception e15) {
                                    taskCompletionSource10.setException(e15);
                                }
                        }
                    }
                });
                task = taskCompletionSource3.getTask();
                break;
            case "Analytics#setAnalyticsCollectionEnabled":
                final Map map2 = (Map) obj;
                final TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: Nc.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f8647b;

                    {
                        this.f8647b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                Map map22 = map2;
                                TaskCompletionSource taskCompletionSource42 = taskCompletionSource4;
                                e eVar = this.f8647b;
                                eVar.getClass();
                                try {
                                    Boolean bool = (Boolean) map22.get("adStorageConsentGranted");
                                    Boolean bool2 = (Boolean) map22.get("analyticsStorageConsentGranted");
                                    Boolean bool3 = (Boolean) map22.get("adPersonalizationSignalsConsentGranted");
                                    Boolean bool4 = (Boolean) map22.get("adUserDataConsentGranted");
                                    HashMap map3 = new HashMap();
                                    EnumC4332a enumC4332a = EnumC4332a.f47025b;
                                    EnumC4332a enumC4332a2 = EnumC4332a.f47024a;
                                    if (bool != null) {
                                        map3.put(v8.b.f47027a, bool.booleanValue() ? enumC4332a2 : enumC4332a);
                                    }
                                    if (bool2 != null) {
                                        map3.put(v8.b.f47028b, bool2.booleanValue() ? enumC4332a2 : enumC4332a);
                                    }
                                    if (bool3 != null) {
                                        map3.put(v8.b.f47030d, bool3.booleanValue() ? enumC4332a2 : enumC4332a);
                                    }
                                    if (bool4 != null) {
                                        v8.b bVar = v8.b.f47029c;
                                        if (bool4.booleanValue()) {
                                            enumC4332a = enumC4332a2;
                                        }
                                        map3.put(bVar, enumC4332a);
                                    }
                                    eVar.f8652a.a(map3);
                                    taskCompletionSource42.setResult(null);
                                    break;
                                } catch (Exception e7) {
                                    taskCompletionSource42.setException(e7);
                                    return;
                                }
                            case 1:
                                Map map4 = map2;
                                TaskCompletionSource taskCompletionSource5 = taskCompletionSource4;
                                e eVar2 = this.f8647b;
                                eVar2.getClass();
                                try {
                                    eVar2.f8652a.f27279a.zzd((String) map4.get("userId"));
                                    taskCompletionSource5.setResult(null);
                                    break;
                                } catch (Exception e10) {
                                    taskCompletionSource5.setException(e10);
                                    return;
                                }
                            case 2:
                                Map map5 = map2;
                                TaskCompletionSource taskCompletionSource6 = taskCompletionSource4;
                                e eVar3 = this.f8647b;
                                eVar3.getClass();
                                try {
                                    FirebaseAnalytics firebaseAnalytics = eVar3.f8652a;
                                    Bundle bundleA = e.a(map5);
                                    if (bundleA != null) {
                                        firebaseAnalytics.getClass();
                                        bundleA = new Bundle(bundleA);
                                    }
                                    firebaseAnalytics.f27279a.zzd(bundleA);
                                    taskCompletionSource6.setResult(null);
                                    break;
                                } catch (Exception e11) {
                                    taskCompletionSource6.setException(e11);
                                    return;
                                }
                            case 3:
                                Map map6 = map2;
                                TaskCompletionSource taskCompletionSource7 = taskCompletionSource4;
                                e eVar4 = this.f8647b;
                                eVar4.getClass();
                                try {
                                    Object obj2 = map6.get(MediationMetaData.KEY_NAME);
                                    Objects.requireNonNull(obj2);
                                    eVar4.f8652a.f27279a.zzb((String) obj2, (String) map6.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR));
                                    taskCompletionSource7.setResult(null);
                                    break;
                                } catch (Exception e12) {
                                    taskCompletionSource7.setException(e12);
                                    return;
                                }
                            case 4:
                                Map map7 = map2;
                                TaskCompletionSource taskCompletionSource8 = taskCompletionSource4;
                                e eVar5 = this.f8647b;
                                eVar5.getClass();
                                try {
                                    Object obj3 = map7.get("eventName");
                                    Objects.requireNonNull(obj3);
                                    eVar5.f8652a.f27279a.zza((String) obj3, e.a((Map) map7.get("parameters")));
                                    taskCompletionSource8.setResult(null);
                                    break;
                                } catch (Exception e13) {
                                    taskCompletionSource8.setException(e13);
                                    return;
                                }
                            case 5:
                                Map map8 = map2;
                                TaskCompletionSource taskCompletionSource9 = taskCompletionSource4;
                                e eVar6 = this.f8647b;
                                eVar6.getClass();
                                try {
                                    Objects.requireNonNull(map8.get("milliseconds"));
                                    eVar6.f8652a.f27279a.zza(((Integer) r0).intValue());
                                    taskCompletionSource9.setResult(null);
                                    break;
                                } catch (Exception e14) {
                                    taskCompletionSource9.setException(e14);
                                    return;
                                }
                            default:
                                Map map9 = map2;
                                TaskCompletionSource taskCompletionSource10 = taskCompletionSource4;
                                e eVar7 = this.f8647b;
                                eVar7.getClass();
                                try {
                                    Object obj4 = map9.get("enabled");
                                    Objects.requireNonNull(obj4);
                                    eVar7.f8652a.f27279a.zza((Boolean) obj4);
                                    taskCompletionSource10.setResult(null);
                                    break;
                                } catch (Exception e15) {
                                    taskCompletionSource10.setException(e15);
                                }
                        }
                    }
                });
                task = taskCompletionSource4.getTask();
                break;
            case "Analytics#setDefaultEventParameters":
                final Map map3 = (Map) obj;
                final TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: Nc.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f8647b;

                    {
                        this.f8647b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                Map map22 = map3;
                                TaskCompletionSource taskCompletionSource42 = taskCompletionSource5;
                                e eVar = this.f8647b;
                                eVar.getClass();
                                try {
                                    Boolean bool = (Boolean) map22.get("adStorageConsentGranted");
                                    Boolean bool2 = (Boolean) map22.get("analyticsStorageConsentGranted");
                                    Boolean bool3 = (Boolean) map22.get("adPersonalizationSignalsConsentGranted");
                                    Boolean bool4 = (Boolean) map22.get("adUserDataConsentGranted");
                                    HashMap map32 = new HashMap();
                                    EnumC4332a enumC4332a = EnumC4332a.f47025b;
                                    EnumC4332a enumC4332a2 = EnumC4332a.f47024a;
                                    if (bool != null) {
                                        map32.put(v8.b.f47027a, bool.booleanValue() ? enumC4332a2 : enumC4332a);
                                    }
                                    if (bool2 != null) {
                                        map32.put(v8.b.f47028b, bool2.booleanValue() ? enumC4332a2 : enumC4332a);
                                    }
                                    if (bool3 != null) {
                                        map32.put(v8.b.f47030d, bool3.booleanValue() ? enumC4332a2 : enumC4332a);
                                    }
                                    if (bool4 != null) {
                                        v8.b bVar = v8.b.f47029c;
                                        if (bool4.booleanValue()) {
                                            enumC4332a = enumC4332a2;
                                        }
                                        map32.put(bVar, enumC4332a);
                                    }
                                    eVar.f8652a.a(map32);
                                    taskCompletionSource42.setResult(null);
                                    break;
                                } catch (Exception e7) {
                                    taskCompletionSource42.setException(e7);
                                    return;
                                }
                            case 1:
                                Map map4 = map3;
                                TaskCompletionSource taskCompletionSource52 = taskCompletionSource5;
                                e eVar2 = this.f8647b;
                                eVar2.getClass();
                                try {
                                    eVar2.f8652a.f27279a.zzd((String) map4.get("userId"));
                                    taskCompletionSource52.setResult(null);
                                    break;
                                } catch (Exception e10) {
                                    taskCompletionSource52.setException(e10);
                                    return;
                                }
                            case 2:
                                Map map5 = map3;
                                TaskCompletionSource taskCompletionSource6 = taskCompletionSource5;
                                e eVar3 = this.f8647b;
                                eVar3.getClass();
                                try {
                                    FirebaseAnalytics firebaseAnalytics = eVar3.f8652a;
                                    Bundle bundleA = e.a(map5);
                                    if (bundleA != null) {
                                        firebaseAnalytics.getClass();
                                        bundleA = new Bundle(bundleA);
                                    }
                                    firebaseAnalytics.f27279a.zzd(bundleA);
                                    taskCompletionSource6.setResult(null);
                                    break;
                                } catch (Exception e11) {
                                    taskCompletionSource6.setException(e11);
                                    return;
                                }
                            case 3:
                                Map map6 = map3;
                                TaskCompletionSource taskCompletionSource7 = taskCompletionSource5;
                                e eVar4 = this.f8647b;
                                eVar4.getClass();
                                try {
                                    Object obj2 = map6.get(MediationMetaData.KEY_NAME);
                                    Objects.requireNonNull(obj2);
                                    eVar4.f8652a.f27279a.zzb((String) obj2, (String) map6.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR));
                                    taskCompletionSource7.setResult(null);
                                    break;
                                } catch (Exception e12) {
                                    taskCompletionSource7.setException(e12);
                                    return;
                                }
                            case 4:
                                Map map7 = map3;
                                TaskCompletionSource taskCompletionSource8 = taskCompletionSource5;
                                e eVar5 = this.f8647b;
                                eVar5.getClass();
                                try {
                                    Object obj3 = map7.get("eventName");
                                    Objects.requireNonNull(obj3);
                                    eVar5.f8652a.f27279a.zza((String) obj3, e.a((Map) map7.get("parameters")));
                                    taskCompletionSource8.setResult(null);
                                    break;
                                } catch (Exception e13) {
                                    taskCompletionSource8.setException(e13);
                                    return;
                                }
                            case 5:
                                Map map8 = map3;
                                TaskCompletionSource taskCompletionSource9 = taskCompletionSource5;
                                e eVar6 = this.f8647b;
                                eVar6.getClass();
                                try {
                                    Objects.requireNonNull(map8.get("milliseconds"));
                                    eVar6.f8652a.f27279a.zza(((Integer) r0).intValue());
                                    taskCompletionSource9.setResult(null);
                                    break;
                                } catch (Exception e14) {
                                    taskCompletionSource9.setException(e14);
                                    return;
                                }
                            default:
                                Map map9 = map3;
                                TaskCompletionSource taskCompletionSource10 = taskCompletionSource5;
                                e eVar7 = this.f8647b;
                                eVar7.getClass();
                                try {
                                    Object obj4 = map9.get("enabled");
                                    Objects.requireNonNull(obj4);
                                    eVar7.f8652a.f27279a.zza((Boolean) obj4);
                                    taskCompletionSource10.setResult(null);
                                    break;
                                } catch (Exception e15) {
                                    taskCompletionSource10.setException(e15);
                                }
                        }
                    }
                });
                task = taskCompletionSource5.getTask();
                break;
            case "Analytics#logEvent":
                final Map map4 = (Map) obj;
                final TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: Nc.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f8647b;

                    {
                        this.f8647b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                Map map22 = map4;
                                TaskCompletionSource taskCompletionSource42 = taskCompletionSource6;
                                e eVar = this.f8647b;
                                eVar.getClass();
                                try {
                                    Boolean bool = (Boolean) map22.get("adStorageConsentGranted");
                                    Boolean bool2 = (Boolean) map22.get("analyticsStorageConsentGranted");
                                    Boolean bool3 = (Boolean) map22.get("adPersonalizationSignalsConsentGranted");
                                    Boolean bool4 = (Boolean) map22.get("adUserDataConsentGranted");
                                    HashMap map32 = new HashMap();
                                    EnumC4332a enumC4332a = EnumC4332a.f47025b;
                                    EnumC4332a enumC4332a2 = EnumC4332a.f47024a;
                                    if (bool != null) {
                                        map32.put(v8.b.f47027a, bool.booleanValue() ? enumC4332a2 : enumC4332a);
                                    }
                                    if (bool2 != null) {
                                        map32.put(v8.b.f47028b, bool2.booleanValue() ? enumC4332a2 : enumC4332a);
                                    }
                                    if (bool3 != null) {
                                        map32.put(v8.b.f47030d, bool3.booleanValue() ? enumC4332a2 : enumC4332a);
                                    }
                                    if (bool4 != null) {
                                        v8.b bVar = v8.b.f47029c;
                                        if (bool4.booleanValue()) {
                                            enumC4332a = enumC4332a2;
                                        }
                                        map32.put(bVar, enumC4332a);
                                    }
                                    eVar.f8652a.a(map32);
                                    taskCompletionSource42.setResult(null);
                                    break;
                                } catch (Exception e7) {
                                    taskCompletionSource42.setException(e7);
                                    return;
                                }
                            case 1:
                                Map map42 = map4;
                                TaskCompletionSource taskCompletionSource52 = taskCompletionSource6;
                                e eVar2 = this.f8647b;
                                eVar2.getClass();
                                try {
                                    eVar2.f8652a.f27279a.zzd((String) map42.get("userId"));
                                    taskCompletionSource52.setResult(null);
                                    break;
                                } catch (Exception e10) {
                                    taskCompletionSource52.setException(e10);
                                    return;
                                }
                            case 2:
                                Map map5 = map4;
                                TaskCompletionSource taskCompletionSource62 = taskCompletionSource6;
                                e eVar3 = this.f8647b;
                                eVar3.getClass();
                                try {
                                    FirebaseAnalytics firebaseAnalytics = eVar3.f8652a;
                                    Bundle bundleA = e.a(map5);
                                    if (bundleA != null) {
                                        firebaseAnalytics.getClass();
                                        bundleA = new Bundle(bundleA);
                                    }
                                    firebaseAnalytics.f27279a.zzd(bundleA);
                                    taskCompletionSource62.setResult(null);
                                    break;
                                } catch (Exception e11) {
                                    taskCompletionSource62.setException(e11);
                                    return;
                                }
                            case 3:
                                Map map6 = map4;
                                TaskCompletionSource taskCompletionSource7 = taskCompletionSource6;
                                e eVar4 = this.f8647b;
                                eVar4.getClass();
                                try {
                                    Object obj2 = map6.get(MediationMetaData.KEY_NAME);
                                    Objects.requireNonNull(obj2);
                                    eVar4.f8652a.f27279a.zzb((String) obj2, (String) map6.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR));
                                    taskCompletionSource7.setResult(null);
                                    break;
                                } catch (Exception e12) {
                                    taskCompletionSource7.setException(e12);
                                    return;
                                }
                            case 4:
                                Map map7 = map4;
                                TaskCompletionSource taskCompletionSource8 = taskCompletionSource6;
                                e eVar5 = this.f8647b;
                                eVar5.getClass();
                                try {
                                    Object obj3 = map7.get("eventName");
                                    Objects.requireNonNull(obj3);
                                    eVar5.f8652a.f27279a.zza((String) obj3, e.a((Map) map7.get("parameters")));
                                    taskCompletionSource8.setResult(null);
                                    break;
                                } catch (Exception e13) {
                                    taskCompletionSource8.setException(e13);
                                    return;
                                }
                            case 5:
                                Map map8 = map4;
                                TaskCompletionSource taskCompletionSource9 = taskCompletionSource6;
                                e eVar6 = this.f8647b;
                                eVar6.getClass();
                                try {
                                    Objects.requireNonNull(map8.get("milliseconds"));
                                    eVar6.f8652a.f27279a.zza(((Integer) r0).intValue());
                                    taskCompletionSource9.setResult(null);
                                    break;
                                } catch (Exception e14) {
                                    taskCompletionSource9.setException(e14);
                                    return;
                                }
                            default:
                                Map map9 = map4;
                                TaskCompletionSource taskCompletionSource10 = taskCompletionSource6;
                                e eVar7 = this.f8647b;
                                eVar7.getClass();
                                try {
                                    Object obj4 = map9.get("enabled");
                                    Objects.requireNonNull(obj4);
                                    eVar7.f8652a.f27279a.zza((Boolean) obj4);
                                    taskCompletionSource10.setResult(null);
                                    break;
                                } catch (Exception e15) {
                                    taskCompletionSource10.setException(e15);
                                }
                        }
                    }
                });
                task = taskCompletionSource6.getTask();
                break;
            case "Analytics#getSessionId":
                TaskCompletionSource taskCompletionSource7 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new a(this, taskCompletionSource7, 1));
                task = taskCompletionSource7.getTask();
                break;
            case "Analytics#setUserProperty":
                final Map map5 = (Map) obj;
                final TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: Nc.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f8647b;

                    {
                        this.f8647b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                Map map22 = map5;
                                TaskCompletionSource taskCompletionSource42 = taskCompletionSource8;
                                e eVar = this.f8647b;
                                eVar.getClass();
                                try {
                                    Boolean bool = (Boolean) map22.get("adStorageConsentGranted");
                                    Boolean bool2 = (Boolean) map22.get("analyticsStorageConsentGranted");
                                    Boolean bool3 = (Boolean) map22.get("adPersonalizationSignalsConsentGranted");
                                    Boolean bool4 = (Boolean) map22.get("adUserDataConsentGranted");
                                    HashMap map32 = new HashMap();
                                    EnumC4332a enumC4332a = EnumC4332a.f47025b;
                                    EnumC4332a enumC4332a2 = EnumC4332a.f47024a;
                                    if (bool != null) {
                                        map32.put(v8.b.f47027a, bool.booleanValue() ? enumC4332a2 : enumC4332a);
                                    }
                                    if (bool2 != null) {
                                        map32.put(v8.b.f47028b, bool2.booleanValue() ? enumC4332a2 : enumC4332a);
                                    }
                                    if (bool3 != null) {
                                        map32.put(v8.b.f47030d, bool3.booleanValue() ? enumC4332a2 : enumC4332a);
                                    }
                                    if (bool4 != null) {
                                        v8.b bVar = v8.b.f47029c;
                                        if (bool4.booleanValue()) {
                                            enumC4332a = enumC4332a2;
                                        }
                                        map32.put(bVar, enumC4332a);
                                    }
                                    eVar.f8652a.a(map32);
                                    taskCompletionSource42.setResult(null);
                                    break;
                                } catch (Exception e7) {
                                    taskCompletionSource42.setException(e7);
                                    return;
                                }
                            case 1:
                                Map map42 = map5;
                                TaskCompletionSource taskCompletionSource52 = taskCompletionSource8;
                                e eVar2 = this.f8647b;
                                eVar2.getClass();
                                try {
                                    eVar2.f8652a.f27279a.zzd((String) map42.get("userId"));
                                    taskCompletionSource52.setResult(null);
                                    break;
                                } catch (Exception e10) {
                                    taskCompletionSource52.setException(e10);
                                    return;
                                }
                            case 2:
                                Map map52 = map5;
                                TaskCompletionSource taskCompletionSource62 = taskCompletionSource8;
                                e eVar3 = this.f8647b;
                                eVar3.getClass();
                                try {
                                    FirebaseAnalytics firebaseAnalytics = eVar3.f8652a;
                                    Bundle bundleA = e.a(map52);
                                    if (bundleA != null) {
                                        firebaseAnalytics.getClass();
                                        bundleA = new Bundle(bundleA);
                                    }
                                    firebaseAnalytics.f27279a.zzd(bundleA);
                                    taskCompletionSource62.setResult(null);
                                    break;
                                } catch (Exception e11) {
                                    taskCompletionSource62.setException(e11);
                                    return;
                                }
                            case 3:
                                Map map6 = map5;
                                TaskCompletionSource taskCompletionSource72 = taskCompletionSource8;
                                e eVar4 = this.f8647b;
                                eVar4.getClass();
                                try {
                                    Object obj2 = map6.get(MediationMetaData.KEY_NAME);
                                    Objects.requireNonNull(obj2);
                                    eVar4.f8652a.f27279a.zzb((String) obj2, (String) map6.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR));
                                    taskCompletionSource72.setResult(null);
                                    break;
                                } catch (Exception e12) {
                                    taskCompletionSource72.setException(e12);
                                    return;
                                }
                            case 4:
                                Map map7 = map5;
                                TaskCompletionSource taskCompletionSource82 = taskCompletionSource8;
                                e eVar5 = this.f8647b;
                                eVar5.getClass();
                                try {
                                    Object obj3 = map7.get("eventName");
                                    Objects.requireNonNull(obj3);
                                    eVar5.f8652a.f27279a.zza((String) obj3, e.a((Map) map7.get("parameters")));
                                    taskCompletionSource82.setResult(null);
                                    break;
                                } catch (Exception e13) {
                                    taskCompletionSource82.setException(e13);
                                    return;
                                }
                            case 5:
                                Map map8 = map5;
                                TaskCompletionSource taskCompletionSource9 = taskCompletionSource8;
                                e eVar6 = this.f8647b;
                                eVar6.getClass();
                                try {
                                    Objects.requireNonNull(map8.get("milliseconds"));
                                    eVar6.f8652a.f27279a.zza(((Integer) r0).intValue());
                                    taskCompletionSource9.setResult(null);
                                    break;
                                } catch (Exception e14) {
                                    taskCompletionSource9.setException(e14);
                                    return;
                                }
                            default:
                                Map map9 = map5;
                                TaskCompletionSource taskCompletionSource10 = taskCompletionSource8;
                                e eVar7 = this.f8647b;
                                eVar7.getClass();
                                try {
                                    Object obj4 = map9.get("enabled");
                                    Objects.requireNonNull(obj4);
                                    eVar7.f8652a.f27279a.zza((Boolean) obj4);
                                    taskCompletionSource10.setResult(null);
                                    break;
                                } catch (Exception e15) {
                                    taskCompletionSource10.setException(e15);
                                }
                        }
                    }
                });
                task = taskCompletionSource8.getTask();
                break;
            case "Analytics#setSessionTimeoutDuration":
                final Map map6 = (Map) obj;
                final TaskCompletionSource taskCompletionSource9 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: Nc.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f8647b;

                    {
                        this.f8647b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                Map map22 = map6;
                                TaskCompletionSource taskCompletionSource42 = taskCompletionSource9;
                                e eVar = this.f8647b;
                                eVar.getClass();
                                try {
                                    Boolean bool = (Boolean) map22.get("adStorageConsentGranted");
                                    Boolean bool2 = (Boolean) map22.get("analyticsStorageConsentGranted");
                                    Boolean bool3 = (Boolean) map22.get("adPersonalizationSignalsConsentGranted");
                                    Boolean bool4 = (Boolean) map22.get("adUserDataConsentGranted");
                                    HashMap map32 = new HashMap();
                                    EnumC4332a enumC4332a = EnumC4332a.f47025b;
                                    EnumC4332a enumC4332a2 = EnumC4332a.f47024a;
                                    if (bool != null) {
                                        map32.put(v8.b.f47027a, bool.booleanValue() ? enumC4332a2 : enumC4332a);
                                    }
                                    if (bool2 != null) {
                                        map32.put(v8.b.f47028b, bool2.booleanValue() ? enumC4332a2 : enumC4332a);
                                    }
                                    if (bool3 != null) {
                                        map32.put(v8.b.f47030d, bool3.booleanValue() ? enumC4332a2 : enumC4332a);
                                    }
                                    if (bool4 != null) {
                                        v8.b bVar = v8.b.f47029c;
                                        if (bool4.booleanValue()) {
                                            enumC4332a = enumC4332a2;
                                        }
                                        map32.put(bVar, enumC4332a);
                                    }
                                    eVar.f8652a.a(map32);
                                    taskCompletionSource42.setResult(null);
                                    break;
                                } catch (Exception e7) {
                                    taskCompletionSource42.setException(e7);
                                    return;
                                }
                            case 1:
                                Map map42 = map6;
                                TaskCompletionSource taskCompletionSource52 = taskCompletionSource9;
                                e eVar2 = this.f8647b;
                                eVar2.getClass();
                                try {
                                    eVar2.f8652a.f27279a.zzd((String) map42.get("userId"));
                                    taskCompletionSource52.setResult(null);
                                    break;
                                } catch (Exception e10) {
                                    taskCompletionSource52.setException(e10);
                                    return;
                                }
                            case 2:
                                Map map52 = map6;
                                TaskCompletionSource taskCompletionSource62 = taskCompletionSource9;
                                e eVar3 = this.f8647b;
                                eVar3.getClass();
                                try {
                                    FirebaseAnalytics firebaseAnalytics = eVar3.f8652a;
                                    Bundle bundleA = e.a(map52);
                                    if (bundleA != null) {
                                        firebaseAnalytics.getClass();
                                        bundleA = new Bundle(bundleA);
                                    }
                                    firebaseAnalytics.f27279a.zzd(bundleA);
                                    taskCompletionSource62.setResult(null);
                                    break;
                                } catch (Exception e11) {
                                    taskCompletionSource62.setException(e11);
                                    return;
                                }
                            case 3:
                                Map map62 = map6;
                                TaskCompletionSource taskCompletionSource72 = taskCompletionSource9;
                                e eVar4 = this.f8647b;
                                eVar4.getClass();
                                try {
                                    Object obj2 = map62.get(MediationMetaData.KEY_NAME);
                                    Objects.requireNonNull(obj2);
                                    eVar4.f8652a.f27279a.zzb((String) obj2, (String) map62.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR));
                                    taskCompletionSource72.setResult(null);
                                    break;
                                } catch (Exception e12) {
                                    taskCompletionSource72.setException(e12);
                                    return;
                                }
                            case 4:
                                Map map7 = map6;
                                TaskCompletionSource taskCompletionSource82 = taskCompletionSource9;
                                e eVar5 = this.f8647b;
                                eVar5.getClass();
                                try {
                                    Object obj3 = map7.get("eventName");
                                    Objects.requireNonNull(obj3);
                                    eVar5.f8652a.f27279a.zza((String) obj3, e.a((Map) map7.get("parameters")));
                                    taskCompletionSource82.setResult(null);
                                    break;
                                } catch (Exception e13) {
                                    taskCompletionSource82.setException(e13);
                                    return;
                                }
                            case 5:
                                Map map8 = map6;
                                TaskCompletionSource taskCompletionSource92 = taskCompletionSource9;
                                e eVar6 = this.f8647b;
                                eVar6.getClass();
                                try {
                                    Objects.requireNonNull(map8.get("milliseconds"));
                                    eVar6.f8652a.f27279a.zza(((Integer) r0).intValue());
                                    taskCompletionSource92.setResult(null);
                                    break;
                                } catch (Exception e14) {
                                    taskCompletionSource92.setException(e14);
                                    return;
                                }
                            default:
                                Map map9 = map6;
                                TaskCompletionSource taskCompletionSource10 = taskCompletionSource9;
                                e eVar7 = this.f8647b;
                                eVar7.getClass();
                                try {
                                    Object obj4 = map9.get("enabled");
                                    Objects.requireNonNull(obj4);
                                    eVar7.f8652a.f27279a.zza((Boolean) obj4);
                                    taskCompletionSource10.setResult(null);
                                    break;
                                } catch (Exception e15) {
                                    taskCompletionSource10.setException(e15);
                                }
                        }
                    }
                });
                task = taskCompletionSource9.getTask();
                break;
            case "Analytics#setUserId":
                final Map map7 = (Map) obj;
                final TaskCompletionSource taskCompletionSource10 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: Nc.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f8647b;

                    {
                        this.f8647b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                Map map22 = map7;
                                TaskCompletionSource taskCompletionSource42 = taskCompletionSource10;
                                e eVar = this.f8647b;
                                eVar.getClass();
                                try {
                                    Boolean bool = (Boolean) map22.get("adStorageConsentGranted");
                                    Boolean bool2 = (Boolean) map22.get("analyticsStorageConsentGranted");
                                    Boolean bool3 = (Boolean) map22.get("adPersonalizationSignalsConsentGranted");
                                    Boolean bool4 = (Boolean) map22.get("adUserDataConsentGranted");
                                    HashMap map32 = new HashMap();
                                    EnumC4332a enumC4332a = EnumC4332a.f47025b;
                                    EnumC4332a enumC4332a2 = EnumC4332a.f47024a;
                                    if (bool != null) {
                                        map32.put(v8.b.f47027a, bool.booleanValue() ? enumC4332a2 : enumC4332a);
                                    }
                                    if (bool2 != null) {
                                        map32.put(v8.b.f47028b, bool2.booleanValue() ? enumC4332a2 : enumC4332a);
                                    }
                                    if (bool3 != null) {
                                        map32.put(v8.b.f47030d, bool3.booleanValue() ? enumC4332a2 : enumC4332a);
                                    }
                                    if (bool4 != null) {
                                        v8.b bVar = v8.b.f47029c;
                                        if (bool4.booleanValue()) {
                                            enumC4332a = enumC4332a2;
                                        }
                                        map32.put(bVar, enumC4332a);
                                    }
                                    eVar.f8652a.a(map32);
                                    taskCompletionSource42.setResult(null);
                                    break;
                                } catch (Exception e7) {
                                    taskCompletionSource42.setException(e7);
                                    return;
                                }
                            case 1:
                                Map map42 = map7;
                                TaskCompletionSource taskCompletionSource52 = taskCompletionSource10;
                                e eVar2 = this.f8647b;
                                eVar2.getClass();
                                try {
                                    eVar2.f8652a.f27279a.zzd((String) map42.get("userId"));
                                    taskCompletionSource52.setResult(null);
                                    break;
                                } catch (Exception e10) {
                                    taskCompletionSource52.setException(e10);
                                    return;
                                }
                            case 2:
                                Map map52 = map7;
                                TaskCompletionSource taskCompletionSource62 = taskCompletionSource10;
                                e eVar3 = this.f8647b;
                                eVar3.getClass();
                                try {
                                    FirebaseAnalytics firebaseAnalytics = eVar3.f8652a;
                                    Bundle bundleA = e.a(map52);
                                    if (bundleA != null) {
                                        firebaseAnalytics.getClass();
                                        bundleA = new Bundle(bundleA);
                                    }
                                    firebaseAnalytics.f27279a.zzd(bundleA);
                                    taskCompletionSource62.setResult(null);
                                    break;
                                } catch (Exception e11) {
                                    taskCompletionSource62.setException(e11);
                                    return;
                                }
                            case 3:
                                Map map62 = map7;
                                TaskCompletionSource taskCompletionSource72 = taskCompletionSource10;
                                e eVar4 = this.f8647b;
                                eVar4.getClass();
                                try {
                                    Object obj2 = map62.get(MediationMetaData.KEY_NAME);
                                    Objects.requireNonNull(obj2);
                                    eVar4.f8652a.f27279a.zzb((String) obj2, (String) map62.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR));
                                    taskCompletionSource72.setResult(null);
                                    break;
                                } catch (Exception e12) {
                                    taskCompletionSource72.setException(e12);
                                    return;
                                }
                            case 4:
                                Map map72 = map7;
                                TaskCompletionSource taskCompletionSource82 = taskCompletionSource10;
                                e eVar5 = this.f8647b;
                                eVar5.getClass();
                                try {
                                    Object obj3 = map72.get("eventName");
                                    Objects.requireNonNull(obj3);
                                    eVar5.f8652a.f27279a.zza((String) obj3, e.a((Map) map72.get("parameters")));
                                    taskCompletionSource82.setResult(null);
                                    break;
                                } catch (Exception e13) {
                                    taskCompletionSource82.setException(e13);
                                    return;
                                }
                            case 5:
                                Map map8 = map7;
                                TaskCompletionSource taskCompletionSource92 = taskCompletionSource10;
                                e eVar6 = this.f8647b;
                                eVar6.getClass();
                                try {
                                    Objects.requireNonNull(map8.get("milliseconds"));
                                    eVar6.f8652a.f27279a.zza(((Integer) r0).intValue());
                                    taskCompletionSource92.setResult(null);
                                    break;
                                } catch (Exception e14) {
                                    taskCompletionSource92.setException(e14);
                                    return;
                                }
                            default:
                                Map map9 = map7;
                                TaskCompletionSource taskCompletionSource102 = taskCompletionSource10;
                                e eVar7 = this.f8647b;
                                eVar7.getClass();
                                try {
                                    Object obj4 = map9.get("enabled");
                                    Objects.requireNonNull(obj4);
                                    eVar7.f8652a.f27279a.zza((Boolean) obj4);
                                    taskCompletionSource102.setResult(null);
                                    break;
                                } catch (Exception e15) {
                                    taskCompletionSource102.setException(e15);
                                }
                        }
                    }
                });
                task = taskCompletionSource10.getTask();
                break;
            default:
                ((tc.g) interfaceC4280q).c();
                return;
        }
        task.addOnCompleteListener(new Ka.b((tc.g) interfaceC4280q, 1));
    }
}
