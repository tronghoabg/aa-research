package Yc;

import W9.t;
import a2.v;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.lifecycle.F;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ka.AbstractC3230e0;
import p7.AbstractC3772b;
import q.s1;
import qc.C3884a;
import qc.InterfaceC3885b;
import rc.InterfaceC3964a;
import rc.InterfaceC3965b;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;
import uc.InterfaceC4284u;

/* loaded from: classes5.dex */
public class f implements FlutterFirebasePlugin, InterfaceC4279p, InterfaceC4284u, InterfaceC3885b, InterfaceC3964a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f16757a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public C4281r f16758b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f16759c;

    /* renamed from: d, reason: collision with root package name */
    public final h f16760d;

    /* renamed from: e, reason: collision with root package name */
    public e f16761e;

    /* renamed from: f, reason: collision with root package name */
    public final h f16762f;

    /* renamed from: g, reason: collision with root package name */
    public e f16763g;

    /* renamed from: h, reason: collision with root package name */
    public t f16764h;

    /* renamed from: i, reason: collision with root package name */
    public Map f16765i;

    /* renamed from: j, reason: collision with root package name */
    public g f16766j;

    public f() {
        if (h.f16770l == null) {
            h.f16770l = new h();
        }
        this.f16760d = h.f16770l;
        if (h.f16771m == null) {
            h.f16771m = new h();
        }
        this.f16762f = h.f16771m;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Nc.c(12, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task getPluginConstantsForFirebaseApp(s8.g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new B8.a(gVar, taskCompletionSource, 4));
        return taskCompletionSource.getTask();
    }

    @Override // rc.InterfaceC3964a
    public final void onAttachedToActivity(InterfaceC3965b interfaceC3965b) throws NumberFormatException {
        s1 s1Var = (s1) interfaceC3965b;
        s1Var.c(this);
        s1Var.d(this.f16766j);
        Activity activity = (Activity) s1Var.f43896a;
        this.f16759c = activity;
        if (activity.getIntent() == null || this.f16759c.getIntent().getExtras() == null || (this.f16759c.getIntent().getFlags() & 1048576) == 1048576) {
            return;
        }
        onNewIntent(this.f16759c.getIntent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [Yc.e] */
    /* JADX WARN: Type inference failed for: r4v3, types: [Yc.e, androidx.lifecycle.F] */
    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        Context context = c3884a.f44186a;
        Log.d("FLTFireContextHolder", "received application context.");
        AbstractC3230e0.f39408h = context;
        C4281r c4281r = new C4281r(c3884a.f44188c, "plugins.flutter.io/firebase_messaging");
        this.f16758b = c4281r;
        c4281r.b(this);
        g gVar = new g();
        gVar.f16768b = false;
        this.f16766j = gVar;
        final int i5 = 0;
        ?? r42 = new F(this) { // from class: Yc.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f16756b;

            {
                this.f16756b = this;
            }

            @Override // androidx.lifecycle.F
            public final void b(Object obj) throws NumberFormatException {
                switch (i5) {
                    case 0:
                        f fVar = this.f16756b;
                        fVar.getClass();
                        fVar.f16758b.a("Messaging#onMessage", AbstractC3772b.N((t) obj), null);
                        break;
                    default:
                        this.f16756b.f16758b.a("Messaging#onTokenRefresh", (String) obj, null);
                        break;
                }
            }
        };
        this.f16761e = r42;
        final int i10 = 1;
        this.f16763g = new F(this) { // from class: Yc.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f16756b;

            {
                this.f16756b = this;
            }

            @Override // androidx.lifecycle.F
            public final void b(Object obj) throws NumberFormatException {
                switch (i10) {
                    case 0:
                        f fVar = this.f16756b;
                        fVar.getClass();
                        fVar.f16758b.a("Messaging#onMessage", AbstractC3772b.N((t) obj), null);
                        break;
                    default:
                        this.f16756b.f16758b.a("Messaging#onTokenRefresh", (String) obj, null);
                        break;
                }
            }
        };
        this.f16760d.e(r42);
        this.f16762f.e(this.f16763g);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_messaging", this);
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivity() {
        this.f16759c = null;
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f16759c = null;
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        this.f16762f.i(this.f16763g);
        this.f16760d.i(this.f16761e);
    }

    @Override // uc.InterfaceC4279p
    public final void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        final int i5;
        final int i10;
        final int i11;
        final int i12;
        Object obj;
        Task task;
        long jIntValue;
        long jIntValue2;
        i5 = 2;
        i10 = 1;
        i11 = 0;
        i12 = 3;
        String str = c4278o.f46759a;
        str.getClass();
        obj = c4278o.f46760b;
        switch (str) {
            case "Messaging#getInitialMessage":
                final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: Yc.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ f f16753b;

                    {
                        this.f16753b = this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:76:0x0174 A[PHI: r2
  0x0174: PHI (r2v9 W9.t) = (r2v6 W9.t), (r2v11 W9.t) binds: [B:72:0x0161, B:74:0x016b] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
                    /* JADX WARN: Type inference failed for: r1v20 */
                    /* JADX WARN: Type inference failed for: r1v21 */
                    /* JADX WARN: Type inference failed for: r1v22 */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 434
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: Yc.d.run():void");
                    }
                });
                task = taskCompletionSource.getTask();
                break;
            case "Messaging#setAutoInitEnabled":
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.a(this, (Map) obj, taskCompletionSource2, 16));
                task = taskCompletionSource2.getTask();
                break;
            case "Messaging#deleteToken":
                TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Nc.c(13, taskCompletionSource3));
                task = taskCompletionSource3.getTask();
                break;
            case "Messaging#unsubscribeFromTopic":
                TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Rc.a((Map) obj, taskCompletionSource4, 3));
                task = taskCompletionSource4.getTask();
                break;
            case "Messaging#subscribeToTopic":
                TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Rc.a((Map) obj, taskCompletionSource5, 5));
                task = taskCompletionSource5.getTask();
                break;
            case "Messaging#setDeliveryMetricsExportToBigQuery":
                TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Rc.a((Map) obj, taskCompletionSource6, 4));
                task = taskCompletionSource6.getTask();
                break;
            case "Messaging#startBackgroundIsolate":
                Map map = (Map) obj;
                Object obj2 = map.get("pluginCallbackHandle");
                Object obj3 = map.get("userCallbackHandle");
                if (obj2 instanceof Long) {
                    jIntValue = ((Long) obj2).longValue();
                } else {
                    if (!(obj2 instanceof Integer)) {
                        throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'pluginCallbackHandle'.");
                    }
                    jIntValue = ((Integer) obj2).intValue();
                }
                if (obj3 instanceof Long) {
                    jIntValue2 = ((Long) obj3).longValue();
                } else {
                    if (!(obj3 instanceof Integer)) {
                        throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'userCallbackHandle'.");
                    }
                    jIntValue2 = ((Integer) obj3).intValue();
                }
                Activity activity = this.f16759c;
                v vVarV = activity != null ? v.v(activity.getIntent()) : null;
                List list = FlutterFirebaseMessagingBackgroundService.f37174h;
                Context context = AbstractC3230e0.f39408h;
                if (context == null) {
                    Log.e("FLTFireBGExecutor", "Context is null, cannot continue.");
                } else {
                    context.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("callback_handle", jIntValue).apply();
                }
                AbstractC3230e0.f39408h.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("user_callback_handle", jIntValue2).apply();
                if (FlutterFirebaseMessagingBackgroundService.f37175i != null) {
                    Log.w("FLTFireMsgService", "Attempted to start a duplicate background isolate. Returning...");
                } else {
                    Dd.c cVar = new Dd.c(16);
                    FlutterFirebaseMessagingBackgroundService.f37175i = cVar;
                    cVar.R(jIntValue, vVarV);
                }
                task = Tasks.forResult(null);
                break;
            case "Messaging#sendMessage":
                TaskCompletionSource taskCompletionSource7 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Rc.a((Map) obj, taskCompletionSource7, 6));
                task = taskCompletionSource7.getTask();
                break;
            case "Messaging#requestPermission":
                if (Build.VERSION.SDK_INT < 33) {
                    final TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                    FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: Yc.d

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ f f16753b;

                        {
                            this.f16753b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            /*
                                Method dump skipped, instructions count: 434
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: Yc.d.run():void");
                        }
                    });
                    task = taskCompletionSource8.getTask();
                    break;
                } else {
                    final TaskCompletionSource taskCompletionSource9 = new TaskCompletionSource();
                    FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: Yc.d

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ f f16753b;

                        {
                            this.f16753b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            /*
                                Method dump skipped, instructions count: 434
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: Yc.d.run():void");
                        }
                    });
                    task = taskCompletionSource9.getTask();
                    break;
                }
            case "Messaging#getNotificationSettings":
                final TaskCompletionSource taskCompletionSource10 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: Yc.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ f f16753b;

                    {
                        this.f16753b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 434
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: Yc.d.run():void");
                    }
                });
                task = taskCompletionSource10.getTask();
                break;
            case "Messaging#getToken":
                final TaskCompletionSource taskCompletionSource11 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: Yc.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ f f16753b;

                    {
                        this.f16753b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 434
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: Yc.d.run():void");
                    }
                });
                task = taskCompletionSource11.getTask();
                break;
            default:
                ((tc.g) interfaceC4280q).c();
                return;
        }
        task.addOnCompleteListener(new A5.h(27, this, (tc.g) interfaceC4280q));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[PHI: r2
  0x0054: PHI (r2v2 W9.t) = (r2v1 W9.t), (r2v1 W9.t), (r2v5 W9.t) binds: [B:11:0x002b, B:13:0x0035, B:15:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // uc.InterfaceC4284u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onNewIntent(android.content.Intent r8) throws java.lang.NumberFormatException {
        /*
            r7 = this;
            android.os.Bundle r0 = r8.getExtras()
            if (r0 != 0) goto L7
            goto L57
        L7:
            android.os.Bundle r0 = r8.getExtras()
            java.lang.String r1 = "google.message_id"
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L1d
            android.os.Bundle r0 = r8.getExtras()
            java.lang.String r1 = "message_id"
            java.lang.String r0 = r0.getString(r1)
        L1d:
            if (r0 != 0) goto L20
            goto L57
        L20:
            java.util.HashMap r1 = io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingReceiver.f37176a
            java.lang.Object r2 = r1.get(r0)
            W9.t r2 = (W9.t) r2
            java.lang.String r3 = "notification"
            r4 = 0
            if (r2 != 0) goto L54
            Y9.c r5 = Y9.c.h()
            java.util.HashMap r5 = r5.g(r0)
            if (r5 == 0) goto L54
            W9.t r2 = p7.AbstractC3772b.F(r5)
            java.lang.String r6 = "message"
            java.lang.Object r5 = r5.get(r6)
            j$.util.Objects.requireNonNull(r5)
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r5.get(r3)
            if (r6 != 0) goto L4d
            goto L54
        L4d:
            java.lang.Object r5 = r5.get(r3)
            java.util.Map r5 = (java.util.Map) r5
            goto L55
        L54:
            r5 = r4
        L55:
            if (r2 != 0) goto L59
        L57:
            r8 = 0
            return r8
        L59:
            r7.f16764h = r2
            r7.f16765i = r5
            r1.remove(r0)
            java.util.HashMap r0 = p7.AbstractC3772b.N(r2)
            W9.s r1 = r2.X()
            if (r1 != 0) goto L71
            java.util.Map r1 = r7.f16765i
            if (r1 == 0) goto L71
            r0.put(r3, r1)
        L71:
            uc.r r1 = r7.f16758b
            java.lang.String r2 = "Messaging#onMessageOpenedApp"
            r1.a(r2, r0, r4)
            android.app.Activity r0 = r7.f16759c
            r0.setIntent(r8)
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Yc.f.onNewIntent(android.content.Intent):boolean");
    }

    @Override // rc.InterfaceC3964a
    public final void onReattachedToActivityForConfigChanges(InterfaceC3965b interfaceC3965b) {
        s1 s1Var = (s1) interfaceC3965b;
        s1Var.c(this);
        this.f16759c = (Activity) s1Var.f43896a;
    }
}
