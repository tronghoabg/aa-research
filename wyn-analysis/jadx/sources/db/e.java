package db;

import R8.C0805a;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.unity3d.services.core.device.MimeTypes;
import ff.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J)\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018\"\u00020\u0019H\u0002¢\u0006\u0002\u0010\u001aR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ryanheise/audio_session/AudioSessionPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "channel", "Lio/flutter/plugin/common/MethodChannel;", "androidAudioManager", "Lcom/ryanheise/audio_session/AndroidAudioManager;", "onAttachedToEngine", "", "flutterPluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "binding", "onMethodCall", "call", "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "invokeMethod", "method", "", "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "Companion", "audio_session_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements InterfaceC3885b, InterfaceC4279p {

    /* renamed from: c, reason: collision with root package name */
    public static Map f34207c;

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f34208d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public C4281r f34209a;

    /* renamed from: b, reason: collision with root package name */
    public C2403a f34210b;

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a flutterPluginBinding) {
        AbstractC3340k.e(flutterPluginBinding, "flutterPluginBinding");
        InterfaceC4269f interfaceC4269f = flutterPluginBinding.f44188c;
        AbstractC3340k.d(interfaceC4269f, "getBinaryMessenger(...)");
        C4281r c4281r = new C4281r(interfaceC4269f, "com.ryanheise.audio_session");
        this.f34209a = c4281r;
        c4281r.b(this);
        Context applicationContext = flutterPluginBinding.f44186a;
        AbstractC3340k.d(applicationContext, "getApplicationContext(...)");
        C2403a c2403a = new C2403a();
        if (C2403a.f34202b == null) {
            AbstractC3340k.e(applicationContext, "applicationContext");
            C0805a c0805a = new C0805a();
            Handler handler = new Handler(Looper.getMainLooper());
            c0805a.f10442g = new ArrayList();
            c0805a.f10443h = new ArrayList();
            c0805a.f10439d = applicationContext;
            Object systemService = applicationContext.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            c0805a.f10440e = (AudioManager) systemService;
            c0805a.f10441f = new W1.c(c0805a, 1);
            AudioManager audioManager = (AudioManager) c0805a.f10440e;
            AbstractC3340k.b(audioManager);
            W1.c cVar = (W1.c) c0805a.f10441f;
            AbstractC3340k.c(cVar, "null cannot be cast to non-null type android.media.AudioDeviceCallback");
            audioManager.registerAudioDeviceCallback(cVar, handler);
            C2403a.f34202b = c0805a;
        }
        c2403a.f34203a = new C4281r(interfaceC4269f, "com.ryanheise.android_audio_manager");
        C0805a c0805a2 = C2403a.f34202b;
        AbstractC3340k.b(c0805a2);
        ((ArrayList) c0805a2.f10442g).add(c2403a);
        C4281r c4281r2 = c2403a.f34203a;
        AbstractC3340k.b(c4281r2);
        c4281r2.b(c2403a);
        this.f34210b = c2403a;
        f34208d.add(this);
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a binding) {
        AbstractC3340k.e(binding, "binding");
        C4281r c4281r = this.f34209a;
        AbstractC3340k.b(c4281r);
        c4281r.b(null);
        this.f34209a = null;
        C2403a c2403a = this.f34210b;
        AbstractC3340k.b(c2403a);
        C4281r c4281r2 = c2403a.f34203a;
        AbstractC3340k.b(c4281r2);
        c4281r2.b(null);
        C0805a c0805a = C2403a.f34202b;
        AbstractC3340k.b(c0805a);
        ((ArrayList) c0805a.f10442g).remove(c2403a);
        C0805a c0805a2 = C2403a.f34202b;
        AbstractC3340k.b(c0805a2);
        if (((ArrayList) c0805a2.f10442g).size() == 0) {
            C0805a c0805a3 = C2403a.f34202b;
            AbstractC3340k.b(c0805a3);
            c0805a3.d();
            AudioManager audioManager = (AudioManager) c0805a3.f10440e;
            AbstractC3340k.b(audioManager);
            audioManager.unregisterAudioDeviceCallback((W1.c) c0805a3.f10441f);
            c0805a3.f10439d = null;
            c0805a3.f10440e = null;
            C2403a.f34202b = null;
        }
        c2403a.f34203a = null;
        this.f34210b = null;
        f34208d.remove(this);
    }

    @Override // uc.InterfaceC4279p
    public final void onMethodCall(C4278o call, InterfaceC4280q interfaceC4280q) {
        AbstractC3340k.e(call, "call");
        Object obj = call.f46760b;
        AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        String str = call.f46759a;
        if (!AbstractC3340k.a(str, "setConfiguration")) {
            if (AbstractC3340k.a(str, "getConfiguration")) {
                ((g) interfaceC4280q).a(f34207c);
                return;
            } else {
                ((g) interfaceC4280q).c();
                return;
            }
        }
        f34207c = (Map) list.get(0);
        ((g) interfaceC4280q).a(null);
        Map map = f34207c;
        AbstractC3340k.b(map);
        Object[] objArr = {map};
        Iterator it = f34208d.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            ArrayList arrayListO0 = m.O0(objArr);
            C4281r c4281r = eVar.f34209a;
            AbstractC3340k.b(c4281r);
            c4281r.a("onConfigurationChanged", arrayListO0, null);
        }
    }
}
