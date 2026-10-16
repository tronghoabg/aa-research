package Xb;

import S3.e;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import qc.C3884a;
import qc.InterfaceC3885b;
import uc.C4281r;
import uc.InterfaceC4269f;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Ldev/fluttercommunity/plus/device_info/DeviceInfoPlusPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "<init>", "()V", "methodChannel", "Lio/flutter/plugin/common/MethodChannel;", "onAttachedToEngine", "", "binding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "setupMethodChannel", "messenger", "Lio/flutter/plugin/common/BinaryMessenger;", "context", "Landroid/content/Context;", "device_info_plus_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements InterfaceC3885b {

    /* renamed from: a, reason: collision with root package name */
    public C4281r f16222a;

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a binding) {
        AbstractC3340k.e(binding, "binding");
        InterfaceC4269f interfaceC4269f = binding.f44188c;
        AbstractC3340k.d(interfaceC4269f, "getBinaryMessenger(...)");
        Context context = binding.f44186a;
        AbstractC3340k.d(context, "getApplicationContext(...)");
        this.f16222a = new C4281r(interfaceC4269f, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        AbstractC3340k.d(packageManager, "getPackageManager(...)");
        Object systemService = context.getSystemService("activity");
        AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        e eVar = new e(packageManager, false, (ActivityManager) systemService, 25);
        C4281r c4281r = this.f16222a;
        if (c4281r != null) {
            c4281r.b(eVar);
        } else {
            AbstractC3340k.m("methodChannel");
            throw null;
        }
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a binding) {
        AbstractC3340k.e(binding, "binding");
        C4281r c4281r = this.f16222a;
        if (c4281r != null) {
            c4281r.b(null);
        } else {
            AbstractC3340k.m("methodChannel");
            throw null;
        }
    }
}
