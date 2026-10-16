package cc;

import E4.y;
import E5.C0461l;
import S3.f;
import Va.X7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.view.WindowManager;
import b7.k;
import ba.C1521a;
import flutter.overlay.window.flutter_overlay_window.OverlayService;
import java.util.HashMap;
import java.util.Map;
import kc.r;
import lc.C3458b;
import lc.d;
import oc.C3665d;
import q.s1;
import qc.C3884a;
import qc.InterfaceC3885b;
import rc.InterfaceC3964a;
import rc.InterfaceC3965b;
import tc.g;
import uc.C4275l;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4265b;
import uc.InterfaceC4269f;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;
import uc.InterfaceC4283t;

/* renamed from: cc.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1594a implements InterfaceC3885b, InterfaceC3964a, InterfaceC4265b, InterfaceC4279p, InterfaceC4283t {

    /* renamed from: a, reason: collision with root package name */
    public C4281r f19816a;

    /* renamed from: b, reason: collision with root package name */
    public Context f19817b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f19818c;

    /* renamed from: d, reason: collision with root package name */
    public X7 f19819d;

    /* renamed from: e, reason: collision with root package name */
    public g f19820e;

    @Override // uc.InterfaceC4265b
    public final void e(Object obj, C1521a c1521a) {
        new X7(((C3458b) y.a().f3001a.get("wynCachedEngine")).f40253c, C4275l.f46757a, (Object) null, "x-slayer/overlay_messenger").m(obj, c1521a);
    }

    @Override // uc.InterfaceC4283t
    public final boolean onActivityResult(int i5, int i10, Intent intent) {
        g gVar;
        if (i5 != 1248 || (gVar = this.f19820e) == null) {
            return false;
        }
        gVar.a(Boolean.valueOf(Settings.canDrawOverlays(this.f19817b)));
        this.f19820e = null;
        return true;
    }

    @Override // rc.InterfaceC3964a
    public final void onAttachedToActivity(InterfaceC3965b interfaceC3965b) {
        s1 s1Var = (s1) interfaceC3965b;
        this.f19818c = (Activity) s1Var.f43896a;
        s1Var.b(this);
        y.a().b("wynCachedEngine", null);
        if (((C3458b) y.a().f3001a.get("wynCachedEngine")) == null) {
            d dVar = new d(this.f19817b, null);
            mc.a aVar = new mc.a((String) ((M.y) ((C3665d) k.z().f19396b).f41476d).f7228c, "overlayMain");
            C0461l c0461l = new C0461l(this.f19817b);
            c0461l.f3455e = aVar;
            c0461l.f3456f = null;
            y.a().b("wynCachedEngine", dVar.a(c0461l));
        }
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        this.f19817b = c3884a.f44186a;
        InterfaceC4269f interfaceC4269f = c3884a.f44188c;
        C4281r c4281r = new C4281r(interfaceC4269f, "x-slayer/overlay_channel");
        this.f19816a = c4281r;
        c4281r.b(this);
        X7 x72 = new X7(interfaceC4269f, C4275l.f46757a, (Object) null, "x-slayer/overlay_messenger");
        this.f19819d = x72;
        x72.n(this);
        X7 x73 = this.f19819d;
        f.f10947f = x73;
        x73.n(this);
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivity() {
        this.f19818c = null;
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f19818c = null;
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        this.f19816a.b(null);
        f.f10947f.n(null);
    }

    @Override // uc.InterfaceC4279p
    public final void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        r rVar;
        boolean z2;
        r rVar2;
        int i5;
        int iA;
        HashMap map = null;
        this.f19820e = null;
        if (c4278o.f46759a.equals("checkPermission")) {
            ((g) interfaceC4280q).a(Boolean.valueOf(Settings.canDrawOverlays(this.f19817b)));
            return;
        }
        String str = c4278o.f46759a;
        if (str.equals("requestPermission")) {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            intent.setData(Uri.parse("package:" + this.f19818c.getPackageName()));
            this.f19820e = (g) interfaceC4280q;
            this.f19818c.startActivityForResult(intent, 1248);
            return;
        }
        if (!str.equals("showOverlay")) {
            if (str.equals("isOverlayActive")) {
                ((g) interfaceC4280q).a(Boolean.valueOf(OverlayService.f35438r));
                return;
            }
            if (str.equals("isOverlayActive")) {
                ((g) interfaceC4280q).a(Boolean.valueOf(OverlayService.f35438r));
                return;
            }
            if (!str.equals("moveOverlay")) {
                if (!str.equals("getOverlayPosition")) {
                    if (!str.equals("closeOverlay")) {
                        ((g) interfaceC4280q).c();
                        return;
                    } else {
                        if (OverlayService.f35438r) {
                            this.f19817b.stopService(new Intent(this.f19817b, (Class<?>) OverlayService.class));
                            ((g) interfaceC4280q).a(Boolean.TRUE);
                            return;
                        }
                        return;
                    }
                }
                OverlayService overlayService = OverlayService.f35437q;
                if (overlayService != null && (rVar = overlayService.f35443e) != null) {
                    WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rVar.getLayoutParams();
                    map = new HashMap();
                    map.put("x", Double.valueOf(layoutParams.x / OverlayService.f35437q.f35441c.getDisplayMetrics().density));
                    map.put("y", Double.valueOf(layoutParams.y / OverlayService.f35437q.f35441c.getDisplayMetrics().density));
                }
                ((g) interfaceC4280q).a(map);
                return;
            }
            int iIntValue = ((Integer) c4278o.a("x")).intValue();
            int iIntValue2 = ((Integer) c4278o.a("y")).intValue();
            OverlayService overlayService2 = OverlayService.f35437q;
            if (overlayService2 == null || (rVar2 = overlayService2.f35443e) == null || overlayService2.f35442d == null) {
                z2 = false;
            } else {
                WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) rVar2.getLayoutParams();
                if (iIntValue != -1999) {
                    i5 = -1;
                    if (iIntValue != -1) {
                        iA = OverlayService.f35437q.a(iIntValue);
                    }
                    layoutParams2.x = iA;
                    layoutParams2.y = OverlayService.f35437q.a(iIntValue2);
                    OverlayService overlayService3 = OverlayService.f35437q;
                    overlayService3.f35442d.updateViewLayout(overlayService3.f35443e, layoutParams2);
                    z2 = true;
                } else {
                    i5 = -1;
                }
                iA = i5;
                layoutParams2.x = iA;
                layoutParams2.y = OverlayService.f35437q.a(iIntValue2);
                OverlayService overlayService32 = OverlayService.f35437q;
                overlayService32.f35442d.updateViewLayout(overlayService32.f35443e, layoutParams2);
                z2 = true;
            }
            ((g) interfaceC4280q).a(Boolean.valueOf(z2));
            return;
        }
        if (!Settings.canDrawOverlays(this.f19817b)) {
            ((g) interfaceC4280q).b("PERMISSION", "overlay permission is not enabled", null);
            return;
        }
        Integer num = (Integer) c4278o.a("height");
        Integer num2 = (Integer) c4278o.a("width");
        String str2 = (String) c4278o.a("alignment");
        String str3 = (String) c4278o.a("flag");
        String str4 = (String) c4278o.a("overlayTitle");
        String str5 = (String) c4278o.a("overlayContent");
        String str6 = (String) c4278o.a("notificationVisibility");
        boolean zBooleanValue = ((Boolean) c4278o.a("enableDrag")).booleanValue();
        String str7 = (String) c4278o.a("positionGravity");
        Map map2 = (Map) c4278o.a("startPosition");
        int iIntValue3 = -6;
        int iIntValue4 = (map2 == null || map2.get("x") == null) ? -6 : ((Integer) map2.get("x")).intValue();
        if (map2 != null && map2.get("y") != null) {
            iIntValue3 = ((Integer) map2.get("y")).intValue();
        }
        f.f10944c = num2 != null ? num2.intValue() : -1;
        f.f10943b = num != null ? num.intValue() : -1;
        f.k = zBooleanValue;
        if (str2 == null) {
            str2 = "center";
        }
        if (str2.equalsIgnoreCase("topLeft")) {
            f.f10946e = 51;
        } else {
            if (str2.equalsIgnoreCase("topCenter")) {
                f.f10946e = 48;
            }
            if (str2.equalsIgnoreCase("topRight")) {
                f.f10946e = 53;
            } else if (str2.equalsIgnoreCase("centerLeft")) {
                f.f10946e = 19;
            } else {
                if (str2.equalsIgnoreCase("center")) {
                    f.f10946e = 17;
                }
                if (str2.equalsIgnoreCase("centerRight")) {
                    f.f10946e = 21;
                } else if (str2.equalsIgnoreCase("bottomLeft")) {
                    f.f10946e = 83;
                } else {
                    if (str2.equalsIgnoreCase("bottomCenter")) {
                        f.f10946e = 80;
                    }
                    if (str2.equalsIgnoreCase("bottomRight")) {
                        f.f10946e = 85;
                    }
                }
            }
        }
        if (str3 == null) {
            str3 = "flagNotFocusable";
        }
        f.G(str3);
        f.f10948g = str4;
        if (str5 == null) {
            str5 = "";
        }
        f.f10949h = str5;
        f.f10950i = str7;
        if (str6.equalsIgnoreCase("visibilityPublic")) {
            f.f10951j = 1;
        }
        if (str6.equalsIgnoreCase("visibilitySecret")) {
            f.f10951j = -1;
        }
        if (str6.equalsIgnoreCase("visibilityPrivate")) {
            f.f10951j = 0;
        }
        Intent intent2 = new Intent(this.f19817b, (Class<?>) OverlayService.class);
        intent2.addFlags(268435456);
        intent2.addFlags(536870912);
        intent2.putExtra("startX", iIntValue4);
        intent2.putExtra("startY", iIntValue3);
        this.f19817b.startService(intent2);
        ((g) interfaceC4280q).a(null);
    }

    @Override // rc.InterfaceC3964a
    public final void onReattachedToActivityForConfigChanges(InterfaceC3965b interfaceC3965b) {
        onAttachedToActivity(interfaceC3965b);
    }
}
