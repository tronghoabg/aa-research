package ac;

import android.app.Activity;
import defpackage.d;
import defpackage.e;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import q.s1;
import qc.C3884a;
import qc.InterfaceC3885b;
import rc.InterfaceC3964a;
import rc.InterfaceC3965b;
import uc.InterfaceC4269f;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Ldev/fluttercommunity/plus/wakelock/WakelockPlusPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "LWakelockPlusApi;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "wakelock", "Ldev/fluttercommunity/plus/wakelock/Wakelock;", "onAttachedToEngine", "", "flutterPluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "binding", "onAttachedToActivity", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onDetachedFromActivity", "onReattachedToActivityForConfigChanges", "onDetachedFromActivityForConfigChanges", "toggle", "msg", "LToggleMessage;", "isEnabled", "LIsEnabledMessage;", "wakelock_plus_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements InterfaceC3885b, e, InterfaceC3964a {

    /* renamed from: a, reason: collision with root package name */
    public C1346a f17490a;

    public final void a(defpackage.b bVar) throws Ya.a {
        C1346a c1346a = this.f17490a;
        AbstractC3340k.b(c1346a);
        Activity activity = (Activity) c1346a.f17489b;
        if (activity == null) {
            throw new Ya.a(12);
        }
        AbstractC3340k.b(activity);
        boolean z2 = (activity.getWindow().getAttributes().flags & 128) != 0;
        Boolean bool = bVar.f19095a;
        AbstractC3340k.b(bool);
        if (bool.booleanValue()) {
            if (z2) {
                return;
            }
            activity.getWindow().addFlags(128);
        } else if (z2) {
            activity.getWindow().clearFlags(128);
        }
    }

    @Override // rc.InterfaceC3964a
    public final void onAttachedToActivity(InterfaceC3965b binding) {
        AbstractC3340k.e(binding, "binding");
        C1346a c1346a = this.f17490a;
        if (c1346a != null) {
            c1346a.f17489b = (Activity) ((s1) binding).f43896a;
        }
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a flutterPluginBinding) {
        AbstractC3340k.e(flutterPluginBinding, "flutterPluginBinding");
        InterfaceC4269f interfaceC4269f = flutterPluginBinding.f44188c;
        AbstractC3340k.d(interfaceC4269f, "getBinaryMessenger(...)");
        e.f34318R8.getClass();
        d.a(interfaceC4269f, this);
        this.f17490a = new C1346a(0, false);
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivity() {
        C1346a c1346a = this.f17490a;
        if (c1346a != null) {
            c1346a.f17489b = null;
        }
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a binding) {
        AbstractC3340k.e(binding, "binding");
        InterfaceC4269f interfaceC4269f = binding.f44188c;
        AbstractC3340k.d(interfaceC4269f, "getBinaryMessenger(...)");
        e.f34318R8.getClass();
        d.a(interfaceC4269f, null);
        this.f17490a = null;
    }

    @Override // rc.InterfaceC3964a
    public final void onReattachedToActivityForConfigChanges(InterfaceC3965b binding) {
        AbstractC3340k.e(binding, "binding");
        onAttachedToActivity(binding);
    }
}
