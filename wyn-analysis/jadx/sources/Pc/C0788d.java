package Pc;

import android.app.Activity;
import c8.C1581e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import q.s1;
import qc.C3884a;
import qc.InterfaceC3885b;
import rc.InterfaceC3964a;
import rc.InterfaceC3965b;
import uc.C4273j;
import uc.C4281r;
import uc.InterfaceC4269f;
import uc.InterfaceC4272i;

/* renamed from: Pc.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C0788d implements FlutterFirebasePlugin, InterfaceC3885b, InterfaceC3964a {

    /* renamed from: i, reason: collision with root package name */
    public static final HashMap f9393i = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC4269f f9394a;

    /* renamed from: b, reason: collision with root package name */
    public C4281r f9395b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f9396c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f9397d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final xa.d f9398e = new xa.d(21, false);

    /* renamed from: f, reason: collision with root package name */
    public final C0795k f9399f = new C0795k();

    /* renamed from: g, reason: collision with root package name */
    public final C0796l f9400g = new C0796l();

    /* renamed from: h, reason: collision with root package name */
    public final C1581e f9401h = new C1581e(25);

    public static FirebaseAuth a(C0797m c0797m) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(s8.g.f(c0797m.f9423a));
        String str = c0797m.f9424b;
        if (str != null) {
            firebaseAuth.f(str);
        }
        String str2 = (String) Qc.c.f9945c.get(c0797m.f9423a);
        if (str2 != null) {
            firebaseAuth.d(str2);
        }
        String str3 = c0797m.f9425c;
        if (str3 != null) {
            firebaseAuth.d(str3);
        }
        return firebaseAuth;
    }

    public final void b() {
        HashMap map = this.f9397d;
        for (C4273j c4273j : map.keySet()) {
            InterfaceC4272i interfaceC4272i = (InterfaceC4272i) map.get(c4273j);
            if (interfaceC4272i != null) {
                interfaceC4272i.onCancel(null);
            }
            c4273j.a(null);
        }
        map.clear();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new C8.d(24, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task getPluginConstantsForFirebaseApp(s8.g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new B8.a(gVar, taskCompletionSource, 1));
        return taskCompletionSource.getTask();
    }

    @Override // rc.InterfaceC3964a
    public final void onAttachedToActivity(InterfaceC3965b interfaceC3965b) {
        Activity activity = (Activity) ((s1) interfaceC3965b).f43896a;
        this.f9396c = activity;
        this.f9398e.f47873b = activity;
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        InterfaceC4269f interfaceC4269f = c3884a.f44188c;
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_auth", this);
        this.f9395b = new C4281r(interfaceC4269f, "plugins.flutter.io/firebase_auth");
        N0.a.u(interfaceC4269f, this);
        N0.a.z(interfaceC4269f, this.f9398e);
        C0795k c0795k = this.f9399f;
        N0.a.x(interfaceC4269f, c0795k);
        N0.a.v(interfaceC4269f, c0795k);
        N0.a.w(interfaceC4269f, this.f9400g);
        N0.a.y(interfaceC4269f, this.f9401h);
        this.f9394a = interfaceC4269f;
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivity() {
        this.f9396c = null;
        this.f9398e.f47873b = null;
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f9396c = null;
        this.f9398e.f47873b = null;
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        this.f9395b.b(null);
        N0.a.u(this.f9394a, null);
        N0.a.z(this.f9394a, null);
        N0.a.x(this.f9394a, null);
        N0.a.v(this.f9394a, null);
        N0.a.w(this.f9394a, null);
        N0.a.y(this.f9394a, null);
        this.f9395b = null;
        this.f9394a = null;
        b();
    }

    @Override // rc.InterfaceC3964a
    public final void onReattachedToActivityForConfigChanges(InterfaceC3965b interfaceC3965b) {
        Activity activity = (Activity) ((s1) interfaceC3965b).f43896a;
        this.f9396c = activity;
        this.f9398e.f47873b = activity;
    }
}
