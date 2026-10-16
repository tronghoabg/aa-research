package Ub;

import android.content.Context;
import android.provider.Settings;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import qc.C3884a;
import qc.InterfaceC3885b;
import tc.g;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4269f;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\fH\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lde/gigadroid/flutter_udid/FlutterUdidPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "<init>", "()V", "channel", "Lio/flutter/plugin/common/MethodChannel;", "applicationContext", "Landroid/content/Context;", "onAttachedToEngine", "", "flutterPluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "messenger", "Lio/flutter/plugin/common/BinaryMessenger;", "onMethodCall", "call", "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "onDetachedFromEngine", "binding", "getUDID", "", "flutter_udid_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements InterfaceC4279p, InterfaceC3885b {

    /* renamed from: a, reason: collision with root package name */
    public C4281r f12709a;

    /* renamed from: b, reason: collision with root package name */
    public Context f12710b;

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a flutterPluginBinding) {
        AbstractC3340k.e(flutterPluginBinding, "flutterPluginBinding");
        Context context = flutterPluginBinding.f44186a;
        AbstractC3340k.d(context, "getApplicationContext(...)");
        InterfaceC4269f interfaceC4269f = flutterPluginBinding.f44188c;
        AbstractC3340k.d(interfaceC4269f, "getBinaryMessenger(...)");
        this.f12710b = context;
        C4281r c4281r = new C4281r(interfaceC4269f, "flutter_udid");
        this.f12709a = c4281r;
        c4281r.b(this);
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a binding) {
        AbstractC3340k.e(binding, "binding");
        this.f12710b = null;
        C4281r c4281r = this.f12709a;
        if (c4281r != null) {
            c4281r.b(null);
        } else {
            AbstractC3340k.m("channel");
            throw null;
        }
    }

    @Override // uc.InterfaceC4279p
    public final void onMethodCall(C4278o call, InterfaceC4280q interfaceC4280q) {
        AbstractC3340k.e(call, "call");
        if (!AbstractC3340k.a(call.f46759a, "getUDID")) {
            ((g) interfaceC4280q).c();
            return;
        }
        Context context = this.f12710b;
        String string = Settings.Secure.getString(context != null ? context.getContentResolver() : null, "android_id");
        if (string == null || string.length() == 0) {
            ((g) interfaceC4280q).b("UNAVAILABLE", "UDID not available.", null);
        } else {
            ((g) interfaceC4280q).a(string);
        }
    }
}
