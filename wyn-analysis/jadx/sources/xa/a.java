package Xa;

import Fe.g;
import Hf.e0;
import ab.AbstractServiceC1345a;
import ab.c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import q.s1;
import qc.C3884a;
import qc.InterfaceC3885b;
import rc.InterfaceC3964a;
import rc.InterfaceC3965b;
import uc.C4281r;
import uc.InterfaceC4269f;
import uc.InterfaceC4284u;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u001eB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001d\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/pravera/flutter_foreground_task/FlutterForegroundTaskPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Lcom/pravera/flutter_foreground_task/service/ServiceProvider;", "Lio/flutter/plugin/common/PluginRegistry$NewIntentListener;", "<init>", "()V", "notificationPermissionManager", "Lcom/pravera/flutter_foreground_task/service/NotificationPermissionManager;", "foregroundServiceManager", "Lcom/pravera/flutter_foreground_task/service/ForegroundServiceManager;", "activityBinding", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "methodCallHandler", "Lcom/pravera/flutter_foreground_task/MethodCallHandlerImpl;", "onAttachedToEngine", "", "binding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "onAttachedToActivity", "onDetachedFromActivityForConfigChanges", "onReattachedToActivityForConfigChanges", "onDetachedFromActivity", "onNewIntent", "", "intent", "Landroid/content/Intent;", "getNotificationPermissionManager", "getForegroundServiceManager", "Companion", "flutter_foreground_task_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements InterfaceC3885b, InterfaceC3964a, InterfaceC4284u {

    /* renamed from: a, reason: collision with root package name */
    public c f16212a;

    /* renamed from: b, reason: collision with root package name */
    public ab.b f16213b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC3965b f16214c;

    /* renamed from: d, reason: collision with root package name */
    public b f16215d;

    public final ab.b a() {
        ab.b bVar = this.f16213b;
        if (bVar != null) {
            return bVar;
        }
        AbstractC3340k.m("foregroundServiceManager");
        throw null;
    }

    @Override // rc.InterfaceC3964a
    public final void onAttachedToActivity(InterfaceC3965b binding) {
        AbstractC3340k.e(binding, "binding");
        b bVar = this.f16215d;
        if (bVar == null) {
            AbstractC3340k.m("methodCallHandler");
            throw null;
        }
        s1 s1Var = (s1) binding;
        Activity activity = (Activity) s1Var.f43896a;
        bVar.f16219d = activity;
        c cVar = this.f16212a;
        if (cVar == null) {
            AbstractC3340k.m("notificationPermissionManager");
            throw null;
        }
        s1Var.d(cVar);
        b bVar2 = this.f16215d;
        if (bVar2 == null) {
            AbstractC3340k.m("methodCallHandler");
            throw null;
        }
        s1Var.b(bVar2);
        s1Var.c(this);
        this.f16214c = binding;
        Intent intent = activity.getIntent();
        e0 e0Var = AbstractServiceC1345a.f17485a;
        g.C(intent);
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a binding) {
        AbstractC3340k.e(binding, "binding");
        this.f16212a = new c();
        this.f16213b = new ab.b();
        Context context = binding.f44186a;
        AbstractC3340k.d(context, "getApplicationContext(...)");
        b bVar = new b(context, this);
        this.f16215d = bVar;
        InterfaceC4269f interfaceC4269f = binding.f44188c;
        AbstractC3340k.d(interfaceC4269f, "getBinaryMessenger(...)");
        C4281r c4281r = new C4281r(interfaceC4269f, "flutter_foreground_task/methods");
        bVar.f16218c = c4281r;
        c4281r.b(bVar);
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivity() {
        InterfaceC3965b interfaceC3965b = this.f16214c;
        if (interfaceC3965b != null) {
            c cVar = this.f16212a;
            if (cVar == null) {
                AbstractC3340k.m("notificationPermissionManager");
                throw null;
            }
            ((HashSet) ((s1) interfaceC3965b).f43898c).remove(cVar);
        }
        InterfaceC3965b interfaceC3965b2 = this.f16214c;
        if (interfaceC3965b2 != null) {
            b bVar = this.f16215d;
            if (bVar == null) {
                AbstractC3340k.m("methodCallHandler");
                throw null;
            }
            ((s1) interfaceC3965b2).m(bVar);
        }
        InterfaceC3965b interfaceC3965b3 = this.f16214c;
        if (interfaceC3965b3 != null) {
            ((HashSet) ((s1) interfaceC3965b3).f43900e).remove(this);
        }
        this.f16214c = null;
        b bVar2 = this.f16215d;
        if (bVar2 != null) {
            bVar2.f16219d = null;
        } else {
            AbstractC3340k.m("methodCallHandler");
            throw null;
        }
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a binding) {
        C4281r c4281r;
        AbstractC3340k.e(binding, "binding");
        b bVar = this.f16215d;
        if (bVar == null || (c4281r = bVar.f16218c) == null) {
            return;
        }
        c4281r.b(null);
    }

    @Override // uc.InterfaceC4284u
    public final boolean onNewIntent(Intent intent) {
        AbstractC3340k.e(intent, "intent");
        e0 e0Var = AbstractServiceC1345a.f17485a;
        g.C(intent);
        return true;
    }

    @Override // rc.InterfaceC3964a
    public final void onReattachedToActivityForConfigChanges(InterfaceC3965b binding) {
        AbstractC3340k.e(binding, "binding");
        onAttachedToActivity(binding);
    }
}
