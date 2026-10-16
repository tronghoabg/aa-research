package Oc;

import A5.h;
import C8.f;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import qc.C3884a;
import qc.InterfaceC3885b;
import s8.g;
import uc.C4273j;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4269f;
import uc.InterfaceC4272i;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;

/* loaded from: classes5.dex */
public class b implements FlutterFirebasePlugin, InterfaceC3885b, InterfaceC4279p {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8951a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC4269f f8952b;

    /* renamed from: c, reason: collision with root package name */
    public C4281r f8953c;

    public static f a(Map map) {
        Object obj = map.get("appName");
        Objects.requireNonNull(obj);
        return (f) g.f((String) obj).c(f.class);
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Nc.c(1, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task getPluginConstantsForFirebaseApp(g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Nc.c(2, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        InterfaceC4269f interfaceC4269f = c3884a.f44188c;
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_app_check", this);
        C4281r c4281r = new C4281r(interfaceC4269f, "plugins.flutter.io/firebase_app_check");
        this.f8953c = c4281r;
        c4281r.b(this);
        this.f8952b = interfaceC4269f;
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        this.f8953c.b(null);
        this.f8953c = null;
        this.f8952b = null;
        HashMap map = this.f8951a;
        for (C4273j c4273j : map.keySet()) {
            ((InterfaceC4272i) map.get(c4273j)).onCancel(null);
            c4273j.a(null);
        }
        map.clear();
    }

    @Override // uc.InterfaceC4279p
    public final void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        final int i5;
        final int i10;
        final int i11;
        final int i12;
        final int i13;
        Object obj;
        Task task;
        i5 = 4;
        i10 = 3;
        i11 = 2;
        i12 = 1;
        i13 = 0;
        String str = c4278o.f46759a;
        str.getClass();
        obj = c4278o.f46760b;
        switch (str) {
            case "FirebaseAppCheck#getLimitedUseAppCheckToken":
                final Map map = (Map) obj;
                final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: Oc.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f8948b;

                    {
                        this.f8948b = this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 404
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: Oc.a.run():void");
                    }
                });
                task = taskCompletionSource.getTask();
                break;
            case "FirebaseAppCheck#setTokenAutoRefreshEnabled":
                final Map map2 = (Map) obj;
                final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: Oc.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f8948b;

                    {
                        this.f8948b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 404
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: Oc.a.run():void");
                    }
                });
                task = taskCompletionSource2.getTask();
                break;
            case "FirebaseAppCheck#registerTokenListener":
                final Map map3 = (Map) obj;
                final TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: Oc.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f8948b;

                    {
                        this.f8948b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 404
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: Oc.a.run():void");
                    }
                });
                task = taskCompletionSource3.getTask();
                break;
            case "FirebaseAppCheck#getToken":
                final Map map4 = (Map) obj;
                final TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: Oc.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f8948b;

                    {
                        this.f8948b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 404
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: Oc.a.run():void");
                    }
                });
                task = taskCompletionSource4.getTask();
                break;
            case "FirebaseAppCheck#activate":
                final Map map5 = (Map) obj;
                final TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: Oc.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f8948b;

                    {
                        this.f8948b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 404
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: Oc.a.run():void");
                    }
                });
                task = taskCompletionSource5.getTask();
                break;
            default:
                ((tc.g) interfaceC4280q).c();
                return;
        }
        task.addOnCompleteListener(new h(17, this, (tc.g) interfaceC4280q));
    }
}
