package Xc;

import J9.H;
import J9.Y;
import Nc.c;
import Re.AbstractC0814i;
import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ic.d;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import j$.util.Objects;
import qc.C3884a;
import qc.InterfaceC3885b;
import s8.g;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;
import z9.C4623B;

/* loaded from: classes5.dex */
public class a implements FlutterFirebasePlugin, InterfaceC3885b, InterfaceC4279p {

    /* renamed from: a, reason: collision with root package name */
    public C4281r f16223a;

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(11, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task getPluginConstantsForFirebaseApp(g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(10, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        C4281r c4281r = new C4281r(c3884a.f44188c, "plugins.flutter.io/firebase_in_app_messaging");
        this.f16223a = c4281r;
        c4281r.b(new a());
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        C4281r c4281r = this.f16223a;
        if (c4281r != null) {
            c4281r.b(null);
            this.f16223a = null;
        }
    }

    @Override // uc.InterfaceC4279p
    public final void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        String str = c4278o.f46759a;
        str.getClass();
        switch (str) {
            case "FirebaseInAppMessaging#triggerEvent":
                String str2 = (String) c4278o.a("eventName");
                Objects.requireNonNull(str2);
                H h10 = ((C4623B) g.e().c(C4623B.class)).f48417d;
                h10.getClass();
                d.E("Programmatically trigger: ".concat(str2));
                ((AbstractC0814i) h10.f5884a.f1602b).b(str2);
                ((tc.g) interfaceC4280q).a(null);
                break;
            case "FirebaseInAppMessaging#setMessagesSuppressed":
                Boolean bool = (Boolean) c4278o.a("suppress");
                Objects.requireNonNull(bool);
                C4623B c4623b = (C4623B) g.e().c(C4623B.class);
                c4623b.getClass();
                c4623b.f48418e = bool.booleanValue();
                ((tc.g) interfaceC4280q).a(null);
                break;
            case "FirebaseInAppMessaging#setAutomaticDataCollectionEnabled":
                Boolean bool2 = (Boolean) c4278o.a("enabled");
                Y y10 = ((C4623B) g.e().c(C4623B.class)).f48414a.f5936a;
                if (bool2 == null) {
                    g gVar = y10.f5908a;
                    gVar.a();
                    SharedPreferences.Editor editorEdit = ((Application) gVar.f45328a).getSharedPreferences("com.google.firebase.inappmessaging", 0).edit();
                    editorEdit.remove("auto_init");
                    editorEdit.apply();
                } else {
                    y10.a("auto_init", Boolean.TRUE.equals(bool2));
                }
                ((tc.g) interfaceC4280q).a(null);
                break;
            default:
                ((tc.g) interfaceC4280q).c();
                break;
        }
    }
}
