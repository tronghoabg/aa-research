package Sc;

import Nc.c;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import b7.k;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import e9.AbstractC2475a;
import f9.h;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import ka.AbstractC3256n;
import q.s1;
import qc.C3884a;
import qc.InterfaceC3885b;
import rc.InterfaceC3964a;
import rc.InterfaceC3965b;
import s8.g;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;
import uc.InterfaceC4284u;

/* loaded from: classes5.dex */
public class b implements FlutterFirebasePlugin, InterfaceC3885b, InterfaceC3964a, InterfaceC4279p, InterfaceC4284u {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f11057a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public HashMap f11058b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f11059c;

    /* renamed from: d, reason: collision with root package name */
    public C4281r f11060d;

    public static AbstractC2475a a(Map map) {
        AbstractC2475a abstractC2475aB;
        String str;
        if (map != null && (str = (String) map.get("appName")) != null) {
            return AbstractC2475a.b(g.f(str));
        }
        synchronized (AbstractC2475a.class) {
            abstractC2475aB = AbstractC2475a.b(g.e());
        }
        return abstractC2475aB;
    }

    public static k b(Map map) {
        h hVar = (h) a(map);
        hVar.getClass();
        k kVar = new k(hVar);
        Object obj = map.get("uriPrefix");
        Objects.requireNonNull(obj);
        String str = (String) obj;
        String str2 = (String) map.get("link");
        boolean zMatches = str.matches("(https:\\/\\/)?[a-z0-9]{3,}\\.app\\.goo\\.gl$");
        Bundle bundle = (Bundle) kVar.f19397c;
        if (zMatches || str.matches("(https:\\/\\/)?[a-z0-9]{3,}\\.page\\.link$")) {
            bundle.putString("domain", str.replace("https://", ""));
        }
        bundle.putString("domainUriPrefix", str);
        Uri uri = Uri.parse(str2);
        Bundle bundle2 = (Bundle) kVar.f19398d;
        bundle2.putParcelable("link", uri);
        Map map2 = (Map) map.get("androidParameters");
        if (map2 != null) {
            String str3 = (String) map2.get(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
            String str4 = (String) map2.get("fallbackUrl");
            Integer num = (Integer) map2.get("minimumVersion");
            Bundle bundleB = AbstractC3256n.b("apn", str3);
            if (str4 != null) {
                bundleB.putParcelable("afl", Uri.parse(str4));
            }
            if (num != null) {
                bundleB.putInt("amv", num.intValue());
            }
            bundle2.putAll(bundleB);
        }
        Map map3 = (Map) map.get("googleAnalyticsParameters");
        if (map3 != null) {
            String str5 = (String) map3.get("campaign");
            String str6 = (String) map3.get("content");
            String str7 = (String) map3.get("medium");
            String str8 = (String) map3.get("source");
            String str9 = (String) map3.get("term");
            Bundle bundle3 = new Bundle();
            if (str5 != null) {
                bundle3.putString("utm_campaign", str5);
            }
            if (str6 != null) {
                bundle3.putString("utm_content", str6);
            }
            if (str7 != null) {
                bundle3.putString("utm_medium", str7);
            }
            if (str8 != null) {
                bundle3.putString("utm_source", str8);
            }
            if (str9 != null) {
                bundle3.putString("utm_term", str9);
            }
            bundle2.putAll(bundle3);
        }
        Map map4 = (Map) map.get("iosParameters");
        if (map4 != null) {
            String str10 = (String) map4.get("bundleId");
            String str11 = (String) map4.get("appStoreId");
            String str12 = (String) map4.get("customScheme");
            String str13 = (String) map4.get("fallbackUrl");
            String str14 = (String) map4.get("ipadBundleId");
            String str15 = (String) map4.get("ipadFallbackUrl");
            String str16 = (String) map4.get("minimumVersion");
            Bundle bundleB2 = AbstractC3256n.b("ibi", str10);
            if (str11 != null) {
                bundleB2.putString("isi", str11);
            }
            if (str12 != null) {
                bundleB2.putString("ius", str12);
            }
            if (str13 != null) {
                bundleB2.putParcelable("ifl", Uri.parse(str13));
            }
            if (str14 != null) {
                bundleB2.putString("ipbi", str14);
            }
            if (str15 != null) {
                bundleB2.putParcelable("ipfl", Uri.parse(str15));
            }
            if (str16 != null) {
                bundleB2.putString("imv", str16);
            }
            bundle2.putAll(bundleB2);
        }
        Map map5 = (Map) map.get("itunesConnectAnalyticsParameters");
        if (map5 != null) {
            String str17 = (String) map5.get("affiliateToken");
            String str18 = (String) map5.get("campaignToken");
            String str19 = (String) map5.get("providerToken");
            Bundle bundle4 = new Bundle();
            if (str17 != null) {
                bundle4.putString("at", str17);
            }
            if (str18 != null) {
                bundle4.putString("ct", str18);
            }
            if (str19 != null) {
                bundle4.putString("pt", str19);
            }
            bundle2.putAll(bundle4);
        }
        Map map6 = (Map) map.get("navigationInfoParameters");
        if (map6 != null) {
            Boolean bool = (Boolean) map6.get("forcedRedirectEnabled");
            Bundle bundle5 = new Bundle();
            if (bool != null) {
                bundle5.putInt("efr", bool.booleanValue() ? 1 : 0);
            }
            bundle2.putAll(bundle5);
        }
        Map map7 = (Map) map.get("socialMetaTagParameters");
        if (map7 != null) {
            String str20 = (String) map7.get("description");
            String str21 = (String) map7.get("imageUrl");
            String str22 = (String) map7.get("title");
            Bundle bundle6 = new Bundle();
            if (str20 != null) {
                bundle6.putString("sd", str20);
            }
            if (str21 != null) {
                bundle6.putParcelable("si", Uri.parse(str21));
            }
            if (str22 != null) {
                bundle6.putString("st", str22);
            }
            bundle2.putAll(bundle6);
        }
        return kVar;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(7, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task getPluginConstantsForFirebaseApp(g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(8, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // rc.InterfaceC3964a
    public final void onAttachedToActivity(InterfaceC3965b interfaceC3965b) {
        s1 s1Var = (s1) interfaceC3965b;
        this.f11057a.set((Activity) s1Var.f43896a);
        s1Var.c(this);
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        C4281r c4281r = new C4281r(c3884a.f44188c, "plugins.flutter.io/firebase_dynamic_links");
        this.f11060d = c4281r;
        c4281r.b(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_dynamic_links", this);
        HashMap map = this.f11058b;
        if (map != null) {
            this.f11060d.a("FirebaseDynamicLink#onLinkSuccess", map, null);
            this.f11058b = null;
        }
        HashMap map2 = this.f11059c;
        if (map2 != null) {
            this.f11060d.a("FirebaseDynamicLink#onLinkError", map2, null);
            this.f11059c = null;
        }
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivity() {
        this.f11057a.set(null);
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f11057a.set(null);
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        this.f11060d.b(null);
        this.f11060d = null;
    }

    @Override // uc.InterfaceC4279p
    public final void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        AbstractC2475a abstractC2475aA;
        Object obj;
        Task task;
        abstractC2475aA = a((Map) c4278o.f46760b);
        String str = c4278o.f46759a;
        str.getClass();
        obj = c4278o.f46760b;
        switch (str) {
            case "FirebaseDynamicLinks#getDynamicLink":
            case "FirebaseDynamicLinks#getInitialLink":
                String str2 = (String) c4278o.a("url");
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Cb.a(this, str2, abstractC2475aA, taskCompletionSource, 4));
                task = taskCompletionSource.getTask();
                break;
            case "FirebaseDynamicLinks#buildShortLink":
                Map map = (Map) obj;
                Objects.requireNonNull(map);
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.a(this, map, taskCompletionSource2, 7));
                task = taskCompletionSource2.getTask();
                break;
            case "FirebaseDynamicLinks#buildLink":
                Bundle bundle = (Bundle) b((Map) obj).f19397c;
                h.c(bundle);
                h.c(bundle);
                Uri uriBuild = (Uri) bundle.getParcelable("dynamicLink");
                if (uriBuild == null) {
                    Uri.Builder builder = new Uri.Builder();
                    String string = bundle.getString("domainUriPrefix");
                    AbstractC1732v.i(string);
                    Uri uri = Uri.parse(string);
                    builder.scheme(uri.getScheme());
                    builder.authority(uri.getAuthority());
                    builder.path(uri.getPath());
                    Bundle bundle2 = bundle.getBundle("parameters");
                    if (bundle2 != null) {
                        for (String str3 : bundle2.keySet()) {
                            Object obj2 = bundle2.get(str3);
                            if (obj2 != null) {
                                builder.appendQueryParameter(str3, obj2.toString());
                            }
                        }
                    }
                    uriBuild = builder.build();
                }
                ((tc.g) interfaceC4280q).a(uriBuild.toString());
                return;
            default:
                ((tc.g) interfaceC4280q).c();
                return;
        }
        task.addOnCompleteListener(new Ka.b((tc.g) interfaceC4280q, 3));
    }

    @Override // uc.InterfaceC4284u
    public final boolean onNewIntent(Intent intent) {
        a(null).a(intent).addOnSuccessListener(new a(this)).addOnFailureListener(new a(this));
        return false;
    }

    @Override // rc.InterfaceC3964a
    public final void onReattachedToActivityForConfigChanges(InterfaceC3965b interfaceC3965b) {
        s1 s1Var = (s1) interfaceC3965b;
        this.f11057a.set((Activity) s1Var.f43896a);
        s1Var.c(this);
    }
}
