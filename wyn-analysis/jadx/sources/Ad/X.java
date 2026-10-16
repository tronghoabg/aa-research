package ad;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import cd.C1605k;
import java.util.HashMap;
import q.s1;
import qc.C3884a;
import qc.InterfaceC3885b;
import rc.InterfaceC3964a;
import rc.InterfaceC3965b;
import uc.C4273j;
import uc.C4281r;
import uc.C4287x;
import uc.InterfaceC4269f;
import uc.InterfaceC4279p;

/* loaded from: classes5.dex */
public class X implements InterfaceC3885b, InterfaceC3964a, InterfaceC4279p {

    /* renamed from: a, reason: collision with root package name */
    public C3884a f17547a;

    /* renamed from: b, reason: collision with root package name */
    public G9.e f17548b;

    /* renamed from: c, reason: collision with root package name */
    public C1356a f17549c;

    /* renamed from: d, reason: collision with root package name */
    public C1357b f17550d;

    /* renamed from: e, reason: collision with root package name */
    public C1605k f17551e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f17552f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final C1355I f17553g = new C1355I(0);

    public static void a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        }
    }

    @Override // rc.InterfaceC3964a
    public final void onAttachedToActivity(InterfaceC3965b interfaceC3965b) {
        G9.e eVar = this.f17548b;
        if (eVar != null) {
            eVar.f4685b = (Activity) ((s1) interfaceC3965b).f43896a;
        }
        C1356a c1356a = this.f17549c;
        if (c1356a != null) {
            c1356a.f17558d = (Activity) ((s1) interfaceC3965b).f43896a;
        }
        C1605k c1605k = this.f17551e;
        if (c1605k != null) {
            c1605k.f19842d = (Activity) ((s1) interfaceC3965b).f43896a;
        }
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        this.f17547a = c3884a;
        Context context = c3884a.f44186a;
        Y1.t tVar = new Y1.t();
        try {
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? context.getApplicationContext().getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : context.getApplicationContext().getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                tVar.f16381c = bundle.getString("io.flutter.plugins.googlemobileads.FLUTTER_GAME_TEMPLATE_VERSION");
                tVar.f16380b = applicationInfo.metaData.getString("io.flutter.plugins.googlemobileads.FLUTTER_NEWS_TEMPLATE_VERSION");
            }
        } catch (PackageManager.NameNotFoundException | ClassCastException unused) {
        }
        this.f17549c = new C1356a(context, tVar);
        C4287x c4287x = new C4287x(this.f17549c);
        InterfaceC4269f interfaceC4269f = c3884a.f44188c;
        C4281r c4281r = new C4281r(interfaceC4269f, "plugins.flutter.io/google_mobile_ads", c4287x, null);
        c4281r.b(this);
        G9.e eVar = new G9.e(c4281r);
        this.f17548b = eVar;
        c3884a.f44190e.j("plugins.flutter.io/google_mobile_ads/ad_widget", new Z(eVar));
        C1357b c1357b = new C1357b();
        new C4281r(interfaceC4269f, "plugins.flutter.io/google_mobile_ads/app_state_method").b(c1357b);
        new C4273j(interfaceC4269f, "plugins.flutter.io/google_mobile_ads/app_state_event").a(c1357b);
        this.f17550d = c1357b;
        this.f17551e = new C1605k(interfaceC4269f, c3884a.f44186a);
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivity() {
        C3884a c3884a;
        C1356a c1356a = this.f17549c;
        if (c1356a != null && (c3884a = this.f17547a) != null) {
            c1356a.f17558d = c3884a.f44186a;
        }
        G9.e eVar = this.f17548b;
        if (eVar != null) {
            eVar.f4685b = null;
        }
        C1605k c1605k = this.f17551e;
        if (c1605k != null) {
            c1605k.f19842d = null;
        }
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivityForConfigChanges() {
        C3884a c3884a;
        C1356a c1356a = this.f17549c;
        if (c1356a != null && (c3884a = this.f17547a) != null) {
            c1356a.f17558d = c3884a.f44186a;
        }
        G9.e eVar = this.f17548b;
        if (eVar != null) {
            eVar.f4685b = null;
        }
        C1605k c1605k = this.f17551e;
        if (c1605k != null) {
            c1605k.f19842d = null;
        }
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        C1357b c1357b = this.f17550d;
        if (c1357b != null) {
            androidx.lifecycle.J.f18589i.f18595f.c(c1357b);
            this.f17550d = null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0949  */
    @Override // uc.InterfaceC4279p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMethodCall(uc.C4278o r29, uc.InterfaceC4280q r30) {
        /*
            Method dump skipped, instructions count: 2828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.X.onMethodCall(uc.o, uc.q):void");
    }

    @Override // rc.InterfaceC3964a
    public final void onReattachedToActivityForConfigChanges(InterfaceC3965b interfaceC3965b) {
        G9.e eVar = this.f17548b;
        if (eVar != null) {
            eVar.f4685b = (Activity) ((s1) interfaceC3965b).f43896a;
        }
        C1356a c1356a = this.f17549c;
        if (c1356a != null) {
            c1356a.f17558d = (Activity) ((s1) interfaceC3965b).f43896a;
        }
        C1605k c1605k = this.f17551e;
        if (c1605k != null) {
            c1605k.f19842d = (Activity) ((s1) interfaceC3965b).f43896a;
        }
    }
}
