package com.google.android.gms.internal.consent_sdk;

import A.AbstractC0213f;
import A7.B0;
import Fe.g;
import N1.F;
import R8.v;
import U1.C0850u;
import U1.InterfaceC0843m;
import Va.X7;
import a.AbstractC1304a;
import ab.b;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.LongSparseArray;
import b7.k;
import ba.C1521a;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk;
import com.moloco.sdk.internal.publisher.H;
import com.qonversion.android.sdk.internal.logger.Logger;
import d0.C2384c;
import dd.C2425d;
import dd.C2426e;
import dd.C2430i;
import e0.AbstractC2461m;
import e0.C2452d;
import e0.C2454f;
import e0.r;
import fd.C2630a;
import g0.AbstractC2662c;
import g0.InterfaceC2663d;
import gd.C2748c;
import h9.c;
import h9.d;
import hd.f;
import hd.o;
import hd.q;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import uc.C4286w;
import uc.InterfaceC4265b;
import uc.InterfaceC4269f;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static int A(int i5, int i10, int i11) {
        return zbtk.zbD(i5) + i10 + i11;
    }

    public static d B(int i5, c cVar) {
        com.google.android.gms.internal.mlkit_vision_text_common.zzct zzctVar = new com.google.android.gms.internal.mlkit_vision_text_common.zzct();
        zzctVar.zza(i5);
        cVar.b(zzctVar.zzb());
        return cVar.a();
    }

    public static int C(int i5, int i10, int i11) {
        return com.google.android.gms.internal.play_billing.zzby.zzw(i5) + i10 + i11;
    }

    public static int D(int i5, int i10, int i11) {
        return com.google.android.recaptcha.internal.zzjg.zzx(i5) + i10 + i11;
    }

    public static void E(InterfaceC4269f interfaceC4269f, final k kVar) {
        C2748c c2748c = C2748c.f35869d;
        Object obj = null;
        X7 x72 = new X7(interfaceC4269f, c2748c, obj, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl");
        if (kVar != null) {
            final int i5 = 0;
            x72.n(new InterfaceC4265b() { // from class: gd.d
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    Boolean bool;
                    switch (i5) {
                        case 0:
                            k kVar2 = kVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, kVar2.o((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th) {
                                arrayList = Fe.c.G(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            k kVar3 = kVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = Fe.c.G(th2);
                            }
                            if (((Activity) kVar3.f19398d) == null) {
                                throw new C2747b();
                            }
                            try {
                                ((Activity) kVar3.f19398d).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", k.w(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            c1521a.c(arrayList2);
                            return;
                        case 2:
                            k kVar4 = kVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, kVar4.D((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (C2750e) arrayList5.get(2), (C2746a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = Fe.c.G(th3);
                            }
                            c1521a.c(arrayList4);
                            return;
                        case 3:
                            k kVar5 = kVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                kVar5.getClass();
                                arrayList6.add(0, Boolean.valueOf(u.g.b((Context) kVar5.f19396b, Collections.EMPTY_LIST, false) != null));
                            } catch (Throwable th4) {
                                arrayList6 = Fe.c.G(th4);
                            }
                            c1521a.c(arrayList6);
                            return;
                        default:
                            k kVar6 = kVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                kVar6.getClass();
                                ((Context) kVar6.f19396b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = Fe.c.G(th5);
                            }
                            c1521a.c(arrayList7);
                            return;
                    }
                }
            });
        } else {
            x72.n(null);
        }
        X7 x73 = new X7(interfaceC4269f, c2748c, obj, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl");
        if (kVar != null) {
            final int i10 = 1;
            x73.n(new InterfaceC4265b() { // from class: gd.d
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    Boolean bool;
                    switch (i10) {
                        case 0:
                            k kVar2 = kVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, kVar2.o((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th) {
                                arrayList = Fe.c.G(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            k kVar3 = kVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = Fe.c.G(th2);
                            }
                            if (((Activity) kVar3.f19398d) == null) {
                                throw new C2747b();
                            }
                            try {
                                ((Activity) kVar3.f19398d).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", k.w(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            c1521a.c(arrayList2);
                            return;
                        case 2:
                            k kVar4 = kVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, kVar4.D((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (C2750e) arrayList5.get(2), (C2746a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = Fe.c.G(th3);
                            }
                            c1521a.c(arrayList4);
                            return;
                        case 3:
                            k kVar5 = kVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                kVar5.getClass();
                                arrayList6.add(0, Boolean.valueOf(u.g.b((Context) kVar5.f19396b, Collections.EMPTY_LIST, false) != null));
                            } catch (Throwable th4) {
                                arrayList6 = Fe.c.G(th4);
                            }
                            c1521a.c(arrayList6);
                            return;
                        default:
                            k kVar6 = kVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                kVar6.getClass();
                                ((Context) kVar6.f19396b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = Fe.c.G(th5);
                            }
                            c1521a.c(arrayList7);
                            return;
                    }
                }
            });
        } else {
            x73.n(null);
        }
        X7 x74 = new X7(interfaceC4269f, c2748c, obj, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp");
        if (kVar != null) {
            final int i11 = 2;
            x74.n(new InterfaceC4265b() { // from class: gd.d
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    Boolean bool;
                    switch (i11) {
                        case 0:
                            k kVar2 = kVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, kVar2.o((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th) {
                                arrayList = Fe.c.G(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            k kVar3 = kVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = Fe.c.G(th2);
                            }
                            if (((Activity) kVar3.f19398d) == null) {
                                throw new C2747b();
                            }
                            try {
                                ((Activity) kVar3.f19398d).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", k.w(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            c1521a.c(arrayList2);
                            return;
                        case 2:
                            k kVar4 = kVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, kVar4.D((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (C2750e) arrayList5.get(2), (C2746a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = Fe.c.G(th3);
                            }
                            c1521a.c(arrayList4);
                            return;
                        case 3:
                            k kVar5 = kVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                kVar5.getClass();
                                arrayList6.add(0, Boolean.valueOf(u.g.b((Context) kVar5.f19396b, Collections.EMPTY_LIST, false) != null));
                            } catch (Throwable th4) {
                                arrayList6 = Fe.c.G(th4);
                            }
                            c1521a.c(arrayList6);
                            return;
                        default:
                            k kVar6 = kVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                kVar6.getClass();
                                ((Context) kVar6.f19396b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = Fe.c.G(th5);
                            }
                            c1521a.c(arrayList7);
                            return;
                    }
                }
            });
        } else {
            x74.n(null);
        }
        X7 x75 = new X7(interfaceC4269f, c2748c, obj, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs");
        if (kVar != null) {
            final int i12 = 3;
            x75.n(new InterfaceC4265b() { // from class: gd.d
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    Boolean bool;
                    switch (i12) {
                        case 0:
                            k kVar2 = kVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, kVar2.o((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th) {
                                arrayList = Fe.c.G(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            k kVar3 = kVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = Fe.c.G(th2);
                            }
                            if (((Activity) kVar3.f19398d) == null) {
                                throw new C2747b();
                            }
                            try {
                                ((Activity) kVar3.f19398d).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", k.w(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            c1521a.c(arrayList2);
                            return;
                        case 2:
                            k kVar4 = kVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, kVar4.D((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (C2750e) arrayList5.get(2), (C2746a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = Fe.c.G(th3);
                            }
                            c1521a.c(arrayList4);
                            return;
                        case 3:
                            k kVar5 = kVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                kVar5.getClass();
                                arrayList6.add(0, Boolean.valueOf(u.g.b((Context) kVar5.f19396b, Collections.EMPTY_LIST, false) != null));
                            } catch (Throwable th4) {
                                arrayList6 = Fe.c.G(th4);
                            }
                            c1521a.c(arrayList6);
                            return;
                        default:
                            k kVar6 = kVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                kVar6.getClass();
                                ((Context) kVar6.f19396b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = Fe.c.G(th5);
                            }
                            c1521a.c(arrayList7);
                            return;
                    }
                }
            });
        } else {
            x75.n(null);
        }
        X7 x76 = new X7(interfaceC4269f, c2748c, obj, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView");
        if (kVar == null) {
            x76.n(null);
        } else {
            final int i13 = 4;
            x76.n(new InterfaceC4265b() { // from class: gd.d
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            k kVar2 = kVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, kVar2.o((String) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th) {
                                arrayList = Fe.c.G(th);
                            }
                            c1521a.c(arrayList);
                            return;
                        case 1:
                            k kVar3 = kVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = Fe.c.G(th2);
                            }
                            if (((Activity) kVar3.f19398d) == null) {
                                throw new C2747b();
                            }
                            try {
                                ((Activity) kVar3.f19398d).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", k.w(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            c1521a.c(arrayList2);
                            return;
                        case 2:
                            k kVar4 = kVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            try {
                                arrayList4.add(0, kVar4.D((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (C2750e) arrayList5.get(2), (C2746a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = Fe.c.G(th3);
                            }
                            c1521a.c(arrayList4);
                            return;
                        case 3:
                            k kVar5 = kVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                kVar5.getClass();
                                arrayList6.add(0, Boolean.valueOf(u.g.b((Context) kVar5.f19396b, Collections.EMPTY_LIST, false) != null));
                            } catch (Throwable th4) {
                                arrayList6 = Fe.c.G(th4);
                            }
                            c1521a.c(arrayList6);
                            return;
                        default:
                            k kVar6 = kVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                kVar6.getClass();
                                ((Context) kVar6.f19396b).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = Fe.c.G(th5);
                            }
                            c1521a.c(arrayList7);
                            return;
                    }
                }
            });
        }
    }

    public static void F(InterfaceC4269f interfaceC4269f, C2426e c2426e) {
        C2430i c2430i = C2430i.f34276d;
        Object obj = null;
        X7 x72 = new X7(interfaceC4269f, c2430i, obj, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.init");
        if (c2426e != null) {
            x72.n(new C2425d(c2426e, 3));
        } else {
            x72.n(null);
        }
        X7 x73 = new X7(interfaceC4269f, c2430i, obj, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signInSilently");
        if (c2426e != null) {
            x73.n(new C2425d(c2426e, 4));
        } else {
            x73.n(null);
        }
        X7 x74 = new X7(interfaceC4269f, c2430i, obj, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signIn");
        if (c2426e != null) {
            x74.n(new C2425d(c2426e, 5));
        } else {
            x74.n(null);
        }
        X7 x75 = new X7(interfaceC4269f, c2430i, obj, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.getAccessToken");
        if (c2426e != null) {
            x75.n(new C2425d(c2426e, 6));
        } else {
            x75.n(null);
        }
        X7 x76 = new X7(interfaceC4269f, c2430i, obj, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signOut");
        if (c2426e != null) {
            x76.n(new C2425d(c2426e, 7));
        } else {
            x76.n(null);
        }
        X7 x77 = new X7(interfaceC4269f, c2430i, obj, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.disconnect");
        if (c2426e != null) {
            x77.n(new C2425d(c2426e, 8));
        } else {
            x77.n(null);
        }
        X7 x78 = new X7(interfaceC4269f, c2430i, obj, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.isSignedIn");
        if (c2426e != null) {
            x78.n(new C2425d(c2426e, 9));
        } else {
            x78.n(null);
        }
        X7 x79 = new X7(interfaceC4269f, c2430i, obj, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.clearAuthCache");
        if (c2426e != null) {
            x79.n(new C2425d(c2426e, 10));
        } else {
            x79.n(null);
        }
        X7 x710 = new X7(interfaceC4269f, c2430i, obj, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.requestScopes");
        if (c2426e != null) {
            x710.n(new C2425d(c2426e, 11));
        } else {
            x710.n(null);
        }
    }

    public static void G(InterfaceC4269f interfaceC4269f, final ed.d dVar) {
        b bVarB = interfaceC4269f.b();
        ed.b bVar = ed.b.f34647d;
        X7 x72 = new X7(interfaceC4269f, bVar, bVarB, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath");
        if (dVar != null) {
            final int i5 = 0;
            x72.n(new InterfaceC4265b() { // from class: ed.a
                @Override // uc.InterfaceC4265b
                public final void e(Object obj, C1521a c1521a) {
                    switch (i5) {
                        case 0:
                            d dVar2 = dVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f34650a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = Ba.c.V(th);
                            }
                            c1521a.c(arrayList);
                            break;
                        case 1:
                            d dVar3 = dVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f34650a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(g.A(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = Ba.c.V(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            d dVar4 = dVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f34650a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(g.A(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = Ba.c.V(th3);
                            }
                            c1521a.c(arrayList3);
                            break;
                        case 3:
                            d dVar5 = dVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f34650a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = Ba.c.V(th4);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 4:
                            d dVar6 = dVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f34650a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = Ba.c.V(th5);
                            }
                            c1521a.c(arrayList5);
                            break;
                        case 5:
                            d dVar7 = dVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f34650a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = Ba.c.V(th6);
                            }
                            c1521a.c(arrayList6);
                            break;
                        default:
                            d dVar8 = dVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = Ba.c.V(th7);
                            }
                            c1521a.c(arrayList8);
                            break;
                    }
                }
            });
        } else {
            x72.n(null);
        }
        X7 x73 = new X7(interfaceC4269f, bVar, interfaceC4269f.b(), "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath");
        if (dVar != null) {
            final int i10 = 1;
            x73.n(new InterfaceC4265b() { // from class: ed.a
                @Override // uc.InterfaceC4265b
                public final void e(Object obj, C1521a c1521a) {
                    switch (i10) {
                        case 0:
                            d dVar2 = dVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f34650a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = Ba.c.V(th);
                            }
                            c1521a.c(arrayList);
                            break;
                        case 1:
                            d dVar3 = dVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f34650a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(g.A(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = Ba.c.V(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            d dVar4 = dVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f34650a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(g.A(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = Ba.c.V(th3);
                            }
                            c1521a.c(arrayList3);
                            break;
                        case 3:
                            d dVar5 = dVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f34650a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = Ba.c.V(th4);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 4:
                            d dVar6 = dVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f34650a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = Ba.c.V(th5);
                            }
                            c1521a.c(arrayList5);
                            break;
                        case 5:
                            d dVar7 = dVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f34650a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = Ba.c.V(th6);
                            }
                            c1521a.c(arrayList6);
                            break;
                        default:
                            d dVar8 = dVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = Ba.c.V(th7);
                            }
                            c1521a.c(arrayList8);
                            break;
                    }
                }
            });
        } else {
            x73.n(null);
        }
        X7 x74 = new X7(interfaceC4269f, bVar, interfaceC4269f.b(), "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath");
        if (dVar != null) {
            final int i11 = 2;
            x74.n(new InterfaceC4265b() { // from class: ed.a
                @Override // uc.InterfaceC4265b
                public final void e(Object obj, C1521a c1521a) {
                    switch (i11) {
                        case 0:
                            d dVar2 = dVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f34650a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = Ba.c.V(th);
                            }
                            c1521a.c(arrayList);
                            break;
                        case 1:
                            d dVar3 = dVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f34650a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(g.A(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = Ba.c.V(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            d dVar4 = dVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f34650a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(g.A(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = Ba.c.V(th3);
                            }
                            c1521a.c(arrayList3);
                            break;
                        case 3:
                            d dVar5 = dVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f34650a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = Ba.c.V(th4);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 4:
                            d dVar6 = dVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f34650a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = Ba.c.V(th5);
                            }
                            c1521a.c(arrayList5);
                            break;
                        case 5:
                            d dVar7 = dVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f34650a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = Ba.c.V(th6);
                            }
                            c1521a.c(arrayList6);
                            break;
                        default:
                            d dVar8 = dVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = Ba.c.V(th7);
                            }
                            c1521a.c(arrayList8);
                            break;
                    }
                }
            });
        } else {
            x74.n(null);
        }
        X7 x75 = new X7(interfaceC4269f, bVar, interfaceC4269f.b(), "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath");
        if (dVar != null) {
            final int i12 = 3;
            x75.n(new InterfaceC4265b() { // from class: ed.a
                @Override // uc.InterfaceC4265b
                public final void e(Object obj, C1521a c1521a) {
                    switch (i12) {
                        case 0:
                            d dVar2 = dVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f34650a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = Ba.c.V(th);
                            }
                            c1521a.c(arrayList);
                            break;
                        case 1:
                            d dVar3 = dVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f34650a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(g.A(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = Ba.c.V(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            d dVar4 = dVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f34650a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(g.A(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = Ba.c.V(th3);
                            }
                            c1521a.c(arrayList3);
                            break;
                        case 3:
                            d dVar5 = dVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f34650a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = Ba.c.V(th4);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 4:
                            d dVar6 = dVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f34650a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = Ba.c.V(th5);
                            }
                            c1521a.c(arrayList5);
                            break;
                        case 5:
                            d dVar7 = dVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f34650a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = Ba.c.V(th6);
                            }
                            c1521a.c(arrayList6);
                            break;
                        default:
                            d dVar8 = dVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = Ba.c.V(th7);
                            }
                            c1521a.c(arrayList8);
                            break;
                    }
                }
            });
        } else {
            x75.n(null);
        }
        X7 x76 = new X7(interfaceC4269f, bVar, interfaceC4269f.b(), "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath");
        if (dVar != null) {
            final int i13 = 4;
            x76.n(new InterfaceC4265b() { // from class: ed.a
                @Override // uc.InterfaceC4265b
                public final void e(Object obj, C1521a c1521a) {
                    switch (i13) {
                        case 0:
                            d dVar2 = dVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f34650a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = Ba.c.V(th);
                            }
                            c1521a.c(arrayList);
                            break;
                        case 1:
                            d dVar3 = dVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f34650a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(g.A(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = Ba.c.V(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            d dVar4 = dVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f34650a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(g.A(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = Ba.c.V(th3);
                            }
                            c1521a.c(arrayList3);
                            break;
                        case 3:
                            d dVar5 = dVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f34650a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = Ba.c.V(th4);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 4:
                            d dVar6 = dVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f34650a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = Ba.c.V(th5);
                            }
                            c1521a.c(arrayList5);
                            break;
                        case 5:
                            d dVar7 = dVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f34650a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = Ba.c.V(th6);
                            }
                            c1521a.c(arrayList6);
                            break;
                        default:
                            d dVar8 = dVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = Ba.c.V(th7);
                            }
                            c1521a.c(arrayList8);
                            break;
                    }
                }
            });
        } else {
            x76.n(null);
        }
        X7 x77 = new X7(interfaceC4269f, bVar, interfaceC4269f.b(), "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths");
        if (dVar != null) {
            final int i14 = 5;
            x77.n(new InterfaceC4265b() { // from class: ed.a
                @Override // uc.InterfaceC4265b
                public final void e(Object obj, C1521a c1521a) {
                    switch (i14) {
                        case 0:
                            d dVar2 = dVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f34650a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = Ba.c.V(th);
                            }
                            c1521a.c(arrayList);
                            break;
                        case 1:
                            d dVar3 = dVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f34650a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(g.A(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = Ba.c.V(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            d dVar4 = dVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f34650a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(g.A(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = Ba.c.V(th3);
                            }
                            c1521a.c(arrayList3);
                            break;
                        case 3:
                            d dVar5 = dVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f34650a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = Ba.c.V(th4);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 4:
                            d dVar6 = dVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f34650a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = Ba.c.V(th5);
                            }
                            c1521a.c(arrayList5);
                            break;
                        case 5:
                            d dVar7 = dVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f34650a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = Ba.c.V(th6);
                            }
                            c1521a.c(arrayList6);
                            break;
                        default:
                            d dVar8 = dVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = Ba.c.V(th7);
                            }
                            c1521a.c(arrayList8);
                            break;
                    }
                }
            });
        } else {
            x77.n(null);
        }
        X7 x78 = new X7(interfaceC4269f, bVar, interfaceC4269f.b(), "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths");
        if (dVar == null) {
            x78.n(null);
        } else {
            final int i15 = 6;
            x78.n(new InterfaceC4265b() { // from class: ed.a
                @Override // uc.InterfaceC4265b
                public final void e(Object obj, C1521a c1521a) {
                    switch (i15) {
                        case 0:
                            d dVar2 = dVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f34650a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = Ba.c.V(th);
                            }
                            c1521a.c(arrayList);
                            break;
                        case 1:
                            d dVar3 = dVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f34650a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(g.A(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = Ba.c.V(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            d dVar4 = dVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f34650a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(g.A(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = Ba.c.V(th3);
                            }
                            c1521a.c(arrayList3);
                            break;
                        case 3:
                            d dVar5 = dVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f34650a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = Ba.c.V(th4);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 4:
                            d dVar6 = dVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f34650a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = Ba.c.V(th5);
                            }
                            c1521a.c(arrayList5);
                            break;
                        case 5:
                            d dVar7 = dVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f34650a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = Ba.c.V(th6);
                            }
                            c1521a.c(arrayList6);
                            break;
                        default:
                            d dVar8 = dVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = Ba.c.V(th7);
                            }
                            c1521a.c(arrayList8);
                            break;
                    }
                }
            });
        }
    }

    public static void H(InterfaceC4269f interfaceC4269f, final C2630a c2630a) {
        X7 x72 = new X7(interfaceC4269f, new C4286w(), interfaceC4269f.b(), "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove");
        if (c2630a != null) {
            final int i5 = 0;
            x72.n(new InterfaceC4265b() { // from class: fd.b
                @Override // uc.InterfaceC4265b
                public final void e(Object obj, C1521a c1521a) {
                    Long lValueOf;
                    switch (i5) {
                        case 0:
                            C2630a c2630a2 = c2630a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c2630a2.f35324a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = ic.d.N(th);
                            }
                            c1521a.c(arrayList);
                            break;
                        case 1:
                            C2630a c2630a3 = c2630a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c2630a3.f35324a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = ic.d.N(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            C2630a c2630a4 = c2630a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c2630a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = ic.d.N(th3);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 3:
                            C2630a c2630a5 = c2630a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            String str = (String) arrayList7.get(0);
                            Number number = (Number) arrayList7.get(1);
                            if (number == null) {
                                lValueOf = null;
                            } else {
                                try {
                                    lValueOf = Long.valueOf(number.longValue());
                                } catch (Throwable th4) {
                                    arrayList6 = ic.d.N(th4);
                                }
                            }
                            arrayList6.add(0, Boolean.valueOf(c2630a5.f35324a.edit().putLong(str, lValueOf.longValue()).commit()));
                            c1521a.c(arrayList6);
                            break;
                        case 4:
                            C2630a c2630a6 = c2630a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str2 = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c2630a6.getClass();
                                String string = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c2630a6.f35324a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = ic.d.N(th5);
                            }
                            c1521a.c(arrayList8);
                            break;
                        case 5:
                            C2630a c2630a7 = c2630a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            String str3 = (String) arrayList11.get(0);
                            List list = (List) arrayList11.get(1);
                            try {
                                arrayList10.add(0, Boolean.valueOf(c2630a7.f35324a.edit().putString(str3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c2630a7.f35325b.i(list)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = ic.d.N(th6);
                            }
                            c1521a.c(arrayList10);
                            break;
                        case 6:
                            C2630a c2630a8 = c2630a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            try {
                                arrayList12.add(0, c2630a8.a((String) arrayList13.get(0), (List) arrayList13.get(1)));
                            } catch (Throwable th7) {
                                arrayList12 = ic.d.N(th7);
                            }
                            c1521a.c(arrayList12);
                            break;
                        default:
                            C2630a c2630a9 = c2630a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c2630a9.b((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = ic.d.N(th8);
                            }
                            c1521a.c(arrayList14);
                            break;
                    }
                }
            });
        } else {
            x72.n(null);
        }
        X7 x73 = new X7(interfaceC4269f, new C4286w(), interfaceC4269f.b(), "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool");
        if (c2630a != null) {
            final int i10 = 1;
            x73.n(new InterfaceC4265b() { // from class: fd.b
                @Override // uc.InterfaceC4265b
                public final void e(Object obj, C1521a c1521a) {
                    Long lValueOf;
                    switch (i10) {
                        case 0:
                            C2630a c2630a2 = c2630a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c2630a2.f35324a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = ic.d.N(th);
                            }
                            c1521a.c(arrayList);
                            break;
                        case 1:
                            C2630a c2630a3 = c2630a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c2630a3.f35324a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = ic.d.N(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            C2630a c2630a4 = c2630a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c2630a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = ic.d.N(th3);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 3:
                            C2630a c2630a5 = c2630a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            String str = (String) arrayList7.get(0);
                            Number number = (Number) arrayList7.get(1);
                            if (number == null) {
                                lValueOf = null;
                            } else {
                                try {
                                    lValueOf = Long.valueOf(number.longValue());
                                } catch (Throwable th4) {
                                    arrayList6 = ic.d.N(th4);
                                }
                            }
                            arrayList6.add(0, Boolean.valueOf(c2630a5.f35324a.edit().putLong(str, lValueOf.longValue()).commit()));
                            c1521a.c(arrayList6);
                            break;
                        case 4:
                            C2630a c2630a6 = c2630a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str2 = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c2630a6.getClass();
                                String string = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c2630a6.f35324a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = ic.d.N(th5);
                            }
                            c1521a.c(arrayList8);
                            break;
                        case 5:
                            C2630a c2630a7 = c2630a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            String str3 = (String) arrayList11.get(0);
                            List list = (List) arrayList11.get(1);
                            try {
                                arrayList10.add(0, Boolean.valueOf(c2630a7.f35324a.edit().putString(str3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c2630a7.f35325b.i(list)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = ic.d.N(th6);
                            }
                            c1521a.c(arrayList10);
                            break;
                        case 6:
                            C2630a c2630a8 = c2630a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            try {
                                arrayList12.add(0, c2630a8.a((String) arrayList13.get(0), (List) arrayList13.get(1)));
                            } catch (Throwable th7) {
                                arrayList12 = ic.d.N(th7);
                            }
                            c1521a.c(arrayList12);
                            break;
                        default:
                            C2630a c2630a9 = c2630a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c2630a9.b((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = ic.d.N(th8);
                            }
                            c1521a.c(arrayList14);
                            break;
                    }
                }
            });
        } else {
            x73.n(null);
        }
        X7 x74 = new X7(interfaceC4269f, new C4286w(), interfaceC4269f.b(), "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString");
        if (c2630a != null) {
            final int i11 = 2;
            x74.n(new InterfaceC4265b() { // from class: fd.b
                @Override // uc.InterfaceC4265b
                public final void e(Object obj, C1521a c1521a) {
                    Long lValueOf;
                    switch (i11) {
                        case 0:
                            C2630a c2630a2 = c2630a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c2630a2.f35324a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = ic.d.N(th);
                            }
                            c1521a.c(arrayList);
                            break;
                        case 1:
                            C2630a c2630a3 = c2630a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c2630a3.f35324a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = ic.d.N(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            C2630a c2630a4 = c2630a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c2630a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = ic.d.N(th3);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 3:
                            C2630a c2630a5 = c2630a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            String str = (String) arrayList7.get(0);
                            Number number = (Number) arrayList7.get(1);
                            if (number == null) {
                                lValueOf = null;
                            } else {
                                try {
                                    lValueOf = Long.valueOf(number.longValue());
                                } catch (Throwable th4) {
                                    arrayList6 = ic.d.N(th4);
                                }
                            }
                            arrayList6.add(0, Boolean.valueOf(c2630a5.f35324a.edit().putLong(str, lValueOf.longValue()).commit()));
                            c1521a.c(arrayList6);
                            break;
                        case 4:
                            C2630a c2630a6 = c2630a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str2 = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c2630a6.getClass();
                                String string = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c2630a6.f35324a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = ic.d.N(th5);
                            }
                            c1521a.c(arrayList8);
                            break;
                        case 5:
                            C2630a c2630a7 = c2630a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            String str3 = (String) arrayList11.get(0);
                            List list = (List) arrayList11.get(1);
                            try {
                                arrayList10.add(0, Boolean.valueOf(c2630a7.f35324a.edit().putString(str3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c2630a7.f35325b.i(list)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = ic.d.N(th6);
                            }
                            c1521a.c(arrayList10);
                            break;
                        case 6:
                            C2630a c2630a8 = c2630a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            try {
                                arrayList12.add(0, c2630a8.a((String) arrayList13.get(0), (List) arrayList13.get(1)));
                            } catch (Throwable th7) {
                                arrayList12 = ic.d.N(th7);
                            }
                            c1521a.c(arrayList12);
                            break;
                        default:
                            C2630a c2630a9 = c2630a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c2630a9.b((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = ic.d.N(th8);
                            }
                            c1521a.c(arrayList14);
                            break;
                    }
                }
            });
        } else {
            x74.n(null);
        }
        X7 x75 = new X7(interfaceC4269f, new C4286w(), interfaceC4269f.b(), "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt");
        if (c2630a != null) {
            final int i12 = 3;
            x75.n(new InterfaceC4265b() { // from class: fd.b
                @Override // uc.InterfaceC4265b
                public final void e(Object obj, C1521a c1521a) {
                    Long lValueOf;
                    switch (i12) {
                        case 0:
                            C2630a c2630a2 = c2630a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c2630a2.f35324a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = ic.d.N(th);
                            }
                            c1521a.c(arrayList);
                            break;
                        case 1:
                            C2630a c2630a3 = c2630a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c2630a3.f35324a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = ic.d.N(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            C2630a c2630a4 = c2630a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c2630a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = ic.d.N(th3);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 3:
                            C2630a c2630a5 = c2630a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            String str = (String) arrayList7.get(0);
                            Number number = (Number) arrayList7.get(1);
                            if (number == null) {
                                lValueOf = null;
                            } else {
                                try {
                                    lValueOf = Long.valueOf(number.longValue());
                                } catch (Throwable th4) {
                                    arrayList6 = ic.d.N(th4);
                                }
                            }
                            arrayList6.add(0, Boolean.valueOf(c2630a5.f35324a.edit().putLong(str, lValueOf.longValue()).commit()));
                            c1521a.c(arrayList6);
                            break;
                        case 4:
                            C2630a c2630a6 = c2630a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str2 = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c2630a6.getClass();
                                String string = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c2630a6.f35324a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = ic.d.N(th5);
                            }
                            c1521a.c(arrayList8);
                            break;
                        case 5:
                            C2630a c2630a7 = c2630a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            String str3 = (String) arrayList11.get(0);
                            List list = (List) arrayList11.get(1);
                            try {
                                arrayList10.add(0, Boolean.valueOf(c2630a7.f35324a.edit().putString(str3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c2630a7.f35325b.i(list)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = ic.d.N(th6);
                            }
                            c1521a.c(arrayList10);
                            break;
                        case 6:
                            C2630a c2630a8 = c2630a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            try {
                                arrayList12.add(0, c2630a8.a((String) arrayList13.get(0), (List) arrayList13.get(1)));
                            } catch (Throwable th7) {
                                arrayList12 = ic.d.N(th7);
                            }
                            c1521a.c(arrayList12);
                            break;
                        default:
                            C2630a c2630a9 = c2630a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c2630a9.b((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = ic.d.N(th8);
                            }
                            c1521a.c(arrayList14);
                            break;
                    }
                }
            });
        } else {
            x75.n(null);
        }
        X7 x76 = new X7(interfaceC4269f, new C4286w(), interfaceC4269f.b(), "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble");
        if (c2630a != null) {
            final int i13 = 4;
            x76.n(new InterfaceC4265b() { // from class: fd.b
                @Override // uc.InterfaceC4265b
                public final void e(Object obj, C1521a c1521a) {
                    Long lValueOf;
                    switch (i13) {
                        case 0:
                            C2630a c2630a2 = c2630a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c2630a2.f35324a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = ic.d.N(th);
                            }
                            c1521a.c(arrayList);
                            break;
                        case 1:
                            C2630a c2630a3 = c2630a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c2630a3.f35324a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = ic.d.N(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            C2630a c2630a4 = c2630a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c2630a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = ic.d.N(th3);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 3:
                            C2630a c2630a5 = c2630a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            String str = (String) arrayList7.get(0);
                            Number number = (Number) arrayList7.get(1);
                            if (number == null) {
                                lValueOf = null;
                            } else {
                                try {
                                    lValueOf = Long.valueOf(number.longValue());
                                } catch (Throwable th4) {
                                    arrayList6 = ic.d.N(th4);
                                }
                            }
                            arrayList6.add(0, Boolean.valueOf(c2630a5.f35324a.edit().putLong(str, lValueOf.longValue()).commit()));
                            c1521a.c(arrayList6);
                            break;
                        case 4:
                            C2630a c2630a6 = c2630a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str2 = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c2630a6.getClass();
                                String string = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c2630a6.f35324a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = ic.d.N(th5);
                            }
                            c1521a.c(arrayList8);
                            break;
                        case 5:
                            C2630a c2630a7 = c2630a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            String str3 = (String) arrayList11.get(0);
                            List list = (List) arrayList11.get(1);
                            try {
                                arrayList10.add(0, Boolean.valueOf(c2630a7.f35324a.edit().putString(str3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c2630a7.f35325b.i(list)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = ic.d.N(th6);
                            }
                            c1521a.c(arrayList10);
                            break;
                        case 6:
                            C2630a c2630a8 = c2630a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            try {
                                arrayList12.add(0, c2630a8.a((String) arrayList13.get(0), (List) arrayList13.get(1)));
                            } catch (Throwable th7) {
                                arrayList12 = ic.d.N(th7);
                            }
                            c1521a.c(arrayList12);
                            break;
                        default:
                            C2630a c2630a9 = c2630a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c2630a9.b((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = ic.d.N(th8);
                            }
                            c1521a.c(arrayList14);
                            break;
                    }
                }
            });
        } else {
            x76.n(null);
        }
        X7 x77 = new X7(interfaceC4269f, new C4286w(), interfaceC4269f.b(), "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setStringList");
        if (c2630a != null) {
            final int i14 = 5;
            x77.n(new InterfaceC4265b() { // from class: fd.b
                @Override // uc.InterfaceC4265b
                public final void e(Object obj, C1521a c1521a) {
                    Long lValueOf;
                    switch (i14) {
                        case 0:
                            C2630a c2630a2 = c2630a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c2630a2.f35324a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = ic.d.N(th);
                            }
                            c1521a.c(arrayList);
                            break;
                        case 1:
                            C2630a c2630a3 = c2630a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c2630a3.f35324a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = ic.d.N(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            C2630a c2630a4 = c2630a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c2630a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = ic.d.N(th3);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 3:
                            C2630a c2630a5 = c2630a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            String str = (String) arrayList7.get(0);
                            Number number = (Number) arrayList7.get(1);
                            if (number == null) {
                                lValueOf = null;
                            } else {
                                try {
                                    lValueOf = Long.valueOf(number.longValue());
                                } catch (Throwable th4) {
                                    arrayList6 = ic.d.N(th4);
                                }
                            }
                            arrayList6.add(0, Boolean.valueOf(c2630a5.f35324a.edit().putLong(str, lValueOf.longValue()).commit()));
                            c1521a.c(arrayList6);
                            break;
                        case 4:
                            C2630a c2630a6 = c2630a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str2 = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c2630a6.getClass();
                                String string = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c2630a6.f35324a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = ic.d.N(th5);
                            }
                            c1521a.c(arrayList8);
                            break;
                        case 5:
                            C2630a c2630a7 = c2630a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            String str3 = (String) arrayList11.get(0);
                            List list = (List) arrayList11.get(1);
                            try {
                                arrayList10.add(0, Boolean.valueOf(c2630a7.f35324a.edit().putString(str3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c2630a7.f35325b.i(list)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = ic.d.N(th6);
                            }
                            c1521a.c(arrayList10);
                            break;
                        case 6:
                            C2630a c2630a8 = c2630a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            try {
                                arrayList12.add(0, c2630a8.a((String) arrayList13.get(0), (List) arrayList13.get(1)));
                            } catch (Throwable th7) {
                                arrayList12 = ic.d.N(th7);
                            }
                            c1521a.c(arrayList12);
                            break;
                        default:
                            C2630a c2630a9 = c2630a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c2630a9.b((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = ic.d.N(th8);
                            }
                            c1521a.c(arrayList14);
                            break;
                    }
                }
            });
        } else {
            x77.n(null);
        }
        X7 x78 = new X7(interfaceC4269f, new C4286w(), interfaceC4269f.b(), "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear");
        if (c2630a != null) {
            final int i15 = 6;
            x78.n(new InterfaceC4265b() { // from class: fd.b
                @Override // uc.InterfaceC4265b
                public final void e(Object obj, C1521a c1521a) {
                    Long lValueOf;
                    switch (i15) {
                        case 0:
                            C2630a c2630a2 = c2630a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c2630a2.f35324a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = ic.d.N(th);
                            }
                            c1521a.c(arrayList);
                            break;
                        case 1:
                            C2630a c2630a3 = c2630a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c2630a3.f35324a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = ic.d.N(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            C2630a c2630a4 = c2630a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c2630a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = ic.d.N(th3);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 3:
                            C2630a c2630a5 = c2630a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            String str = (String) arrayList7.get(0);
                            Number number = (Number) arrayList7.get(1);
                            if (number == null) {
                                lValueOf = null;
                            } else {
                                try {
                                    lValueOf = Long.valueOf(number.longValue());
                                } catch (Throwable th4) {
                                    arrayList6 = ic.d.N(th4);
                                }
                            }
                            arrayList6.add(0, Boolean.valueOf(c2630a5.f35324a.edit().putLong(str, lValueOf.longValue()).commit()));
                            c1521a.c(arrayList6);
                            break;
                        case 4:
                            C2630a c2630a6 = c2630a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str2 = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c2630a6.getClass();
                                String string = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c2630a6.f35324a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = ic.d.N(th5);
                            }
                            c1521a.c(arrayList8);
                            break;
                        case 5:
                            C2630a c2630a7 = c2630a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            String str3 = (String) arrayList11.get(0);
                            List list = (List) arrayList11.get(1);
                            try {
                                arrayList10.add(0, Boolean.valueOf(c2630a7.f35324a.edit().putString(str3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c2630a7.f35325b.i(list)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = ic.d.N(th6);
                            }
                            c1521a.c(arrayList10);
                            break;
                        case 6:
                            C2630a c2630a8 = c2630a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            try {
                                arrayList12.add(0, c2630a8.a((String) arrayList13.get(0), (List) arrayList13.get(1)));
                            } catch (Throwable th7) {
                                arrayList12 = ic.d.N(th7);
                            }
                            c1521a.c(arrayList12);
                            break;
                        default:
                            C2630a c2630a9 = c2630a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c2630a9.b((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = ic.d.N(th8);
                            }
                            c1521a.c(arrayList14);
                            break;
                    }
                }
            });
        } else {
            x78.n(null);
        }
        X7 x79 = new X7(interfaceC4269f, new C4286w(), interfaceC4269f.b(), "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll");
        if (c2630a == null) {
            x79.n(null);
        } else {
            final int i16 = 7;
            x79.n(new InterfaceC4265b() { // from class: fd.b
                @Override // uc.InterfaceC4265b
                public final void e(Object obj, C1521a c1521a) {
                    Long lValueOf;
                    switch (i16) {
                        case 0:
                            C2630a c2630a2 = c2630a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c2630a2.f35324a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = ic.d.N(th);
                            }
                            c1521a.c(arrayList);
                            break;
                        case 1:
                            C2630a c2630a3 = c2630a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c2630a3.f35324a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = ic.d.N(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            C2630a c2630a4 = c2630a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c2630a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = ic.d.N(th3);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 3:
                            C2630a c2630a5 = c2630a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            String str = (String) arrayList7.get(0);
                            Number number = (Number) arrayList7.get(1);
                            if (number == null) {
                                lValueOf = null;
                            } else {
                                try {
                                    lValueOf = Long.valueOf(number.longValue());
                                } catch (Throwable th4) {
                                    arrayList6 = ic.d.N(th4);
                                }
                            }
                            arrayList6.add(0, Boolean.valueOf(c2630a5.f35324a.edit().putLong(str, lValueOf.longValue()).commit()));
                            c1521a.c(arrayList6);
                            break;
                        case 4:
                            C2630a c2630a6 = c2630a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str2 = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c2630a6.getClass();
                                String string = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c2630a6.f35324a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = ic.d.N(th5);
                            }
                            c1521a.c(arrayList8);
                            break;
                        case 5:
                            C2630a c2630a7 = c2630a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            String str3 = (String) arrayList11.get(0);
                            List list = (List) arrayList11.get(1);
                            try {
                                arrayList10.add(0, Boolean.valueOf(c2630a7.f35324a.edit().putString(str3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c2630a7.f35325b.i(list)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = ic.d.N(th6);
                            }
                            c1521a.c(arrayList10);
                            break;
                        case 6:
                            C2630a c2630a8 = c2630a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            try {
                                arrayList12.add(0, c2630a8.a((String) arrayList13.get(0), (List) arrayList13.get(1)));
                            } catch (Throwable th7) {
                                arrayList12 = ic.d.N(th7);
                            }
                            c1521a.c(arrayList12);
                            break;
                        default:
                            C2630a c2630a9 = c2630a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c2630a9.b((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = ic.d.N(th8);
                            }
                            c1521a.c(arrayList14);
                            break;
                    }
                }
            });
        }
    }

    public static void I(InterfaceC4269f interfaceC4269f, final q qVar) {
        f fVar = f.f36405d;
        Object obj = null;
        X7 x72 = new X7(interfaceC4269f, fVar, obj, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.initialize");
        if (qVar != null) {
            final int i5 = 0;
            x72.n(new InterfaceC4265b() { // from class: hd.d
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    LongSparseArray longSparseArray;
                    switch (i5) {
                        case 0:
                            q qVar2 = qVar;
                            ArrayList arrayList = new ArrayList();
                            int i10 = 0;
                            while (true) {
                                try {
                                    longSparseArray = qVar2.f36426a;
                                } catch (Throwable th) {
                                    arrayList = AbstractC1304a.Q(th);
                                }
                                if (i10 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c1521a.c(arrayList);
                                    break;
                                } else {
                                    ((o) longSparseArray.valueAt(i10)).b();
                                    i10++;
                                }
                            }
                        case 1:
                            q qVar3 = qVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                arrayList2.add(0, qVar3.a((e) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC1304a.Q(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            q qVar4 = qVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                arrayList3.add(0, qVar4.b((e) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC1304a.Q(th3);
                            }
                            c1521a.c(arrayList3);
                            break;
                        case 3:
                            q qVar5 = qVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                qVar5.c((Long) ((ArrayList) obj2).get(0));
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC1304a.Q(th4);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 4:
                            q qVar6 = qVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                qVar6.f36428c.f45322b = ((Boolean) ((ArrayList) obj2).get(0)).booleanValue();
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC1304a.Q(th5);
                            }
                            c1521a.c(arrayList5);
                            break;
                        default:
                            q qVar7 = qVar;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj2;
                            try {
                                arrayList6.add(0, qVar7.d((String) arrayList7.get(0), (String) arrayList7.get(1)));
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC1304a.Q(th6);
                            }
                            c1521a.c(arrayList6);
                            break;
                    }
                }
            });
        } else {
            x72.n(null);
        }
        X7 x73 = new X7(interfaceC4269f, fVar, obj, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.createForPlatformView");
        if (qVar != null) {
            final int i10 = 1;
            x73.n(new InterfaceC4265b() { // from class: hd.d
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    LongSparseArray longSparseArray;
                    switch (i10) {
                        case 0:
                            q qVar2 = qVar;
                            ArrayList arrayList = new ArrayList();
                            int i102 = 0;
                            while (true) {
                                try {
                                    longSparseArray = qVar2.f36426a;
                                } catch (Throwable th) {
                                    arrayList = AbstractC1304a.Q(th);
                                }
                                if (i102 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c1521a.c(arrayList);
                                    break;
                                } else {
                                    ((o) longSparseArray.valueAt(i102)).b();
                                    i102++;
                                }
                            }
                        case 1:
                            q qVar3 = qVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                arrayList2.add(0, qVar3.a((e) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC1304a.Q(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            q qVar4 = qVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                arrayList3.add(0, qVar4.b((e) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC1304a.Q(th3);
                            }
                            c1521a.c(arrayList3);
                            break;
                        case 3:
                            q qVar5 = qVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                qVar5.c((Long) ((ArrayList) obj2).get(0));
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC1304a.Q(th4);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 4:
                            q qVar6 = qVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                qVar6.f36428c.f45322b = ((Boolean) ((ArrayList) obj2).get(0)).booleanValue();
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC1304a.Q(th5);
                            }
                            c1521a.c(arrayList5);
                            break;
                        default:
                            q qVar7 = qVar;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj2;
                            try {
                                arrayList6.add(0, qVar7.d((String) arrayList7.get(0), (String) arrayList7.get(1)));
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC1304a.Q(th6);
                            }
                            c1521a.c(arrayList6);
                            break;
                    }
                }
            });
        } else {
            x73.n(null);
        }
        X7 x74 = new X7(interfaceC4269f, fVar, obj, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.createForTextureView");
        if (qVar != null) {
            final int i11 = 2;
            x74.n(new InterfaceC4265b() { // from class: hd.d
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    LongSparseArray longSparseArray;
                    switch (i11) {
                        case 0:
                            q qVar2 = qVar;
                            ArrayList arrayList = new ArrayList();
                            int i102 = 0;
                            while (true) {
                                try {
                                    longSparseArray = qVar2.f36426a;
                                } catch (Throwable th) {
                                    arrayList = AbstractC1304a.Q(th);
                                }
                                if (i102 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c1521a.c(arrayList);
                                    break;
                                } else {
                                    ((o) longSparseArray.valueAt(i102)).b();
                                    i102++;
                                }
                            }
                        case 1:
                            q qVar3 = qVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                arrayList2.add(0, qVar3.a((e) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC1304a.Q(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            q qVar4 = qVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                arrayList3.add(0, qVar4.b((e) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC1304a.Q(th3);
                            }
                            c1521a.c(arrayList3);
                            break;
                        case 3:
                            q qVar5 = qVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                qVar5.c((Long) ((ArrayList) obj2).get(0));
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC1304a.Q(th4);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 4:
                            q qVar6 = qVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                qVar6.f36428c.f45322b = ((Boolean) ((ArrayList) obj2).get(0)).booleanValue();
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC1304a.Q(th5);
                            }
                            c1521a.c(arrayList5);
                            break;
                        default:
                            q qVar7 = qVar;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj2;
                            try {
                                arrayList6.add(0, qVar7.d((String) arrayList7.get(0), (String) arrayList7.get(1)));
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC1304a.Q(th6);
                            }
                            c1521a.c(arrayList6);
                            break;
                    }
                }
            });
        } else {
            x74.n(null);
        }
        X7 x75 = new X7(interfaceC4269f, fVar, obj, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.dispose");
        if (qVar != null) {
            final int i12 = 3;
            x75.n(new InterfaceC4265b() { // from class: hd.d
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    LongSparseArray longSparseArray;
                    switch (i12) {
                        case 0:
                            q qVar2 = qVar;
                            ArrayList arrayList = new ArrayList();
                            int i102 = 0;
                            while (true) {
                                try {
                                    longSparseArray = qVar2.f36426a;
                                } catch (Throwable th) {
                                    arrayList = AbstractC1304a.Q(th);
                                }
                                if (i102 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c1521a.c(arrayList);
                                    break;
                                } else {
                                    ((o) longSparseArray.valueAt(i102)).b();
                                    i102++;
                                }
                            }
                        case 1:
                            q qVar3 = qVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                arrayList2.add(0, qVar3.a((e) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC1304a.Q(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            q qVar4 = qVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                arrayList3.add(0, qVar4.b((e) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC1304a.Q(th3);
                            }
                            c1521a.c(arrayList3);
                            break;
                        case 3:
                            q qVar5 = qVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                qVar5.c((Long) ((ArrayList) obj2).get(0));
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC1304a.Q(th4);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 4:
                            q qVar6 = qVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                qVar6.f36428c.f45322b = ((Boolean) ((ArrayList) obj2).get(0)).booleanValue();
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC1304a.Q(th5);
                            }
                            c1521a.c(arrayList5);
                            break;
                        default:
                            q qVar7 = qVar;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj2;
                            try {
                                arrayList6.add(0, qVar7.d((String) arrayList7.get(0), (String) arrayList7.get(1)));
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC1304a.Q(th6);
                            }
                            c1521a.c(arrayList6);
                            break;
                    }
                }
            });
        } else {
            x75.n(null);
        }
        X7 x76 = new X7(interfaceC4269f, fVar, obj, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setMixWithOthers");
        if (qVar != null) {
            final int i13 = 4;
            x76.n(new InterfaceC4265b() { // from class: hd.d
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    LongSparseArray longSparseArray;
                    switch (i13) {
                        case 0:
                            q qVar2 = qVar;
                            ArrayList arrayList = new ArrayList();
                            int i102 = 0;
                            while (true) {
                                try {
                                    longSparseArray = qVar2.f36426a;
                                } catch (Throwable th) {
                                    arrayList = AbstractC1304a.Q(th);
                                }
                                if (i102 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c1521a.c(arrayList);
                                    break;
                                } else {
                                    ((o) longSparseArray.valueAt(i102)).b();
                                    i102++;
                                }
                            }
                        case 1:
                            q qVar3 = qVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                arrayList2.add(0, qVar3.a((e) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC1304a.Q(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            q qVar4 = qVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                arrayList3.add(0, qVar4.b((e) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC1304a.Q(th3);
                            }
                            c1521a.c(arrayList3);
                            break;
                        case 3:
                            q qVar5 = qVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                qVar5.c((Long) ((ArrayList) obj2).get(0));
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC1304a.Q(th4);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 4:
                            q qVar6 = qVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                qVar6.f36428c.f45322b = ((Boolean) ((ArrayList) obj2).get(0)).booleanValue();
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC1304a.Q(th5);
                            }
                            c1521a.c(arrayList5);
                            break;
                        default:
                            q qVar7 = qVar;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj2;
                            try {
                                arrayList6.add(0, qVar7.d((String) arrayList7.get(0), (String) arrayList7.get(1)));
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC1304a.Q(th6);
                            }
                            c1521a.c(arrayList6);
                            break;
                    }
                }
            });
        } else {
            x76.n(null);
        }
        X7 x77 = new X7(interfaceC4269f, fVar, obj, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.getLookupKeyForAsset");
        if (qVar == null) {
            x77.n(null);
        } else {
            final int i14 = 5;
            x77.n(new InterfaceC4265b() { // from class: hd.d
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    LongSparseArray longSparseArray;
                    switch (i14) {
                        case 0:
                            q qVar2 = qVar;
                            ArrayList arrayList = new ArrayList();
                            int i102 = 0;
                            while (true) {
                                try {
                                    longSparseArray = qVar2.f36426a;
                                } catch (Throwable th) {
                                    arrayList = AbstractC1304a.Q(th);
                                }
                                if (i102 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    c1521a.c(arrayList);
                                    break;
                                } else {
                                    ((o) longSparseArray.valueAt(i102)).b();
                                    i102++;
                                }
                            }
                        case 1:
                            q qVar3 = qVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                arrayList2.add(0, qVar3.a((e) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC1304a.Q(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            q qVar4 = qVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                arrayList3.add(0, qVar4.b((e) ((ArrayList) obj2).get(0)));
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC1304a.Q(th3);
                            }
                            c1521a.c(arrayList3);
                            break;
                        case 3:
                            q qVar5 = qVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                qVar5.c((Long) ((ArrayList) obj2).get(0));
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC1304a.Q(th4);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 4:
                            q qVar6 = qVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                qVar6.f36428c.f45322b = ((Boolean) ((ArrayList) obj2).get(0)).booleanValue();
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC1304a.Q(th5);
                            }
                            c1521a.c(arrayList5);
                            break;
                        default:
                            q qVar7 = qVar;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj2;
                            try {
                                arrayList6.add(0, qVar7.d((String) arrayList7.get(0), (String) arrayList7.get(1)));
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC1304a.Q(th6);
                            }
                            c1521a.c(arrayList6);
                            break;
                    }
                }
            });
        }
    }

    public static void J(InterfaceC4269f interfaceC4269f, String str, final o oVar) {
        String strConcat = str.isEmpty() ? "" : ".".concat(str);
        String strF = v.f("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setLooping", strConcat);
        f fVar = f.f36405d;
        Object obj = null;
        X7 x72 = new X7(interfaceC4269f, fVar, obj, strF);
        if (oVar != null) {
            final int i5 = 0;
            x72.n(new InterfaceC4265b() { // from class: hd.k
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    switch (i5) {
                        case 0:
                            o oVar2 = oVar;
                            ArrayList arrayList = new ArrayList();
                            Boolean bool = (Boolean) ((ArrayList) obj2).get(0);
                            try {
                                oVar2.getClass();
                                ((C0850u) oVar2.f36424d).I0(bool.booleanValue() ? 2 : 0);
                                arrayList.add(0, null);
                            } catch (Throwable th) {
                                arrayList = AbstractC1304a.Q(th);
                            }
                            c1521a.c(arrayList);
                            break;
                        case 1:
                            o oVar3 = oVar;
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            try {
                                oVar3.getClass();
                                ((C0850u) oVar3.f36424d).M0((float) Math.max(0.0d, Math.min(1.0d, d3.doubleValue())));
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC1304a.Q(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            o oVar4 = oVar;
                            ArrayList arrayList3 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            try {
                                oVar4.getClass();
                                ((C0850u) oVar4.f36424d).H0(new F(d5.floatValue()));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC1304a.Q(th3);
                            }
                            c1521a.c(arrayList3);
                            break;
                        case 3:
                            o oVar5 = oVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                B0 b02 = (B0) oVar5.f36424d;
                                b02.getClass();
                                ((C0850u) b02).G0(true);
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC1304a.Q(th4);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 4:
                            o oVar6 = oVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                B0 b03 = (B0) oVar6.f36424d;
                                b03.getClass();
                                ((C0850u) b03).G0(false);
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC1304a.Q(th5);
                            }
                            c1521a.c(arrayList5);
                            break;
                        case 5:
                            o oVar7 = oVar;
                            ArrayList arrayList6 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj2).get(0);
                            try {
                                oVar7.getClass();
                                long jLongValue = l10.longValue();
                                B0 b04 = (B0) oVar7.f36424d;
                                b04.getClass();
                                b04.O(jLongValue, ((C0850u) b04).l0(), false);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC1304a.Q(th6);
                            }
                            c1521a.c(arrayList6);
                            break;
                        default:
                            o oVar8 = oVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                InterfaceC0843m interfaceC0843m = oVar8.f36424d;
                                Long lValueOf = Long.valueOf(((C0850u) interfaceC0843m).m0());
                                Long lValueOf2 = Long.valueOf(((C0850u) interfaceC0843m).h0());
                                i iVar = new i();
                                iVar.f36409a = lValueOf;
                                iVar.f36410b = lValueOf2;
                                arrayList7.add(0, iVar);
                            } catch (Throwable th7) {
                                arrayList7 = AbstractC1304a.Q(th7);
                            }
                            c1521a.c(arrayList7);
                            break;
                    }
                }
            });
        } else {
            x72.n(null);
        }
        X7 x73 = new X7(interfaceC4269f, fVar, obj, v.f("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setVolume", strConcat));
        if (oVar != null) {
            final int i10 = 1;
            x73.n(new InterfaceC4265b() { // from class: hd.k
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    switch (i10) {
                        case 0:
                            o oVar2 = oVar;
                            ArrayList arrayList = new ArrayList();
                            Boolean bool = (Boolean) ((ArrayList) obj2).get(0);
                            try {
                                oVar2.getClass();
                                ((C0850u) oVar2.f36424d).I0(bool.booleanValue() ? 2 : 0);
                                arrayList.add(0, null);
                            } catch (Throwable th) {
                                arrayList = AbstractC1304a.Q(th);
                            }
                            c1521a.c(arrayList);
                            break;
                        case 1:
                            o oVar3 = oVar;
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            try {
                                oVar3.getClass();
                                ((C0850u) oVar3.f36424d).M0((float) Math.max(0.0d, Math.min(1.0d, d3.doubleValue())));
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC1304a.Q(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            o oVar4 = oVar;
                            ArrayList arrayList3 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            try {
                                oVar4.getClass();
                                ((C0850u) oVar4.f36424d).H0(new F(d5.floatValue()));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC1304a.Q(th3);
                            }
                            c1521a.c(arrayList3);
                            break;
                        case 3:
                            o oVar5 = oVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                B0 b02 = (B0) oVar5.f36424d;
                                b02.getClass();
                                ((C0850u) b02).G0(true);
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC1304a.Q(th4);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 4:
                            o oVar6 = oVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                B0 b03 = (B0) oVar6.f36424d;
                                b03.getClass();
                                ((C0850u) b03).G0(false);
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC1304a.Q(th5);
                            }
                            c1521a.c(arrayList5);
                            break;
                        case 5:
                            o oVar7 = oVar;
                            ArrayList arrayList6 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj2).get(0);
                            try {
                                oVar7.getClass();
                                long jLongValue = l10.longValue();
                                B0 b04 = (B0) oVar7.f36424d;
                                b04.getClass();
                                b04.O(jLongValue, ((C0850u) b04).l0(), false);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC1304a.Q(th6);
                            }
                            c1521a.c(arrayList6);
                            break;
                        default:
                            o oVar8 = oVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                InterfaceC0843m interfaceC0843m = oVar8.f36424d;
                                Long lValueOf = Long.valueOf(((C0850u) interfaceC0843m).m0());
                                Long lValueOf2 = Long.valueOf(((C0850u) interfaceC0843m).h0());
                                i iVar = new i();
                                iVar.f36409a = lValueOf;
                                iVar.f36410b = lValueOf2;
                                arrayList7.add(0, iVar);
                            } catch (Throwable th7) {
                                arrayList7 = AbstractC1304a.Q(th7);
                            }
                            c1521a.c(arrayList7);
                            break;
                    }
                }
            });
        } else {
            x73.n(null);
        }
        X7 x74 = new X7(interfaceC4269f, fVar, obj, v.f("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setPlaybackSpeed", strConcat));
        if (oVar != null) {
            final int i11 = 2;
            x74.n(new InterfaceC4265b() { // from class: hd.k
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    switch (i11) {
                        case 0:
                            o oVar2 = oVar;
                            ArrayList arrayList = new ArrayList();
                            Boolean bool = (Boolean) ((ArrayList) obj2).get(0);
                            try {
                                oVar2.getClass();
                                ((C0850u) oVar2.f36424d).I0(bool.booleanValue() ? 2 : 0);
                                arrayList.add(0, null);
                            } catch (Throwable th) {
                                arrayList = AbstractC1304a.Q(th);
                            }
                            c1521a.c(arrayList);
                            break;
                        case 1:
                            o oVar3 = oVar;
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            try {
                                oVar3.getClass();
                                ((C0850u) oVar3.f36424d).M0((float) Math.max(0.0d, Math.min(1.0d, d3.doubleValue())));
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC1304a.Q(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            o oVar4 = oVar;
                            ArrayList arrayList3 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            try {
                                oVar4.getClass();
                                ((C0850u) oVar4.f36424d).H0(new F(d5.floatValue()));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC1304a.Q(th3);
                            }
                            c1521a.c(arrayList3);
                            break;
                        case 3:
                            o oVar5 = oVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                B0 b02 = (B0) oVar5.f36424d;
                                b02.getClass();
                                ((C0850u) b02).G0(true);
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC1304a.Q(th4);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 4:
                            o oVar6 = oVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                B0 b03 = (B0) oVar6.f36424d;
                                b03.getClass();
                                ((C0850u) b03).G0(false);
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC1304a.Q(th5);
                            }
                            c1521a.c(arrayList5);
                            break;
                        case 5:
                            o oVar7 = oVar;
                            ArrayList arrayList6 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj2).get(0);
                            try {
                                oVar7.getClass();
                                long jLongValue = l10.longValue();
                                B0 b04 = (B0) oVar7.f36424d;
                                b04.getClass();
                                b04.O(jLongValue, ((C0850u) b04).l0(), false);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC1304a.Q(th6);
                            }
                            c1521a.c(arrayList6);
                            break;
                        default:
                            o oVar8 = oVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                InterfaceC0843m interfaceC0843m = oVar8.f36424d;
                                Long lValueOf = Long.valueOf(((C0850u) interfaceC0843m).m0());
                                Long lValueOf2 = Long.valueOf(((C0850u) interfaceC0843m).h0());
                                i iVar = new i();
                                iVar.f36409a = lValueOf;
                                iVar.f36410b = lValueOf2;
                                arrayList7.add(0, iVar);
                            } catch (Throwable th7) {
                                arrayList7 = AbstractC1304a.Q(th7);
                            }
                            c1521a.c(arrayList7);
                            break;
                    }
                }
            });
        } else {
            x74.n(null);
        }
        X7 x75 = new X7(interfaceC4269f, fVar, obj, v.f("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.play", strConcat));
        if (oVar != null) {
            final int i12 = 3;
            x75.n(new InterfaceC4265b() { // from class: hd.k
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    switch (i12) {
                        case 0:
                            o oVar2 = oVar;
                            ArrayList arrayList = new ArrayList();
                            Boolean bool = (Boolean) ((ArrayList) obj2).get(0);
                            try {
                                oVar2.getClass();
                                ((C0850u) oVar2.f36424d).I0(bool.booleanValue() ? 2 : 0);
                                arrayList.add(0, null);
                            } catch (Throwable th) {
                                arrayList = AbstractC1304a.Q(th);
                            }
                            c1521a.c(arrayList);
                            break;
                        case 1:
                            o oVar3 = oVar;
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            try {
                                oVar3.getClass();
                                ((C0850u) oVar3.f36424d).M0((float) Math.max(0.0d, Math.min(1.0d, d3.doubleValue())));
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC1304a.Q(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            o oVar4 = oVar;
                            ArrayList arrayList3 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            try {
                                oVar4.getClass();
                                ((C0850u) oVar4.f36424d).H0(new F(d5.floatValue()));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC1304a.Q(th3);
                            }
                            c1521a.c(arrayList3);
                            break;
                        case 3:
                            o oVar5 = oVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                B0 b02 = (B0) oVar5.f36424d;
                                b02.getClass();
                                ((C0850u) b02).G0(true);
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC1304a.Q(th4);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 4:
                            o oVar6 = oVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                B0 b03 = (B0) oVar6.f36424d;
                                b03.getClass();
                                ((C0850u) b03).G0(false);
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC1304a.Q(th5);
                            }
                            c1521a.c(arrayList5);
                            break;
                        case 5:
                            o oVar7 = oVar;
                            ArrayList arrayList6 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj2).get(0);
                            try {
                                oVar7.getClass();
                                long jLongValue = l10.longValue();
                                B0 b04 = (B0) oVar7.f36424d;
                                b04.getClass();
                                b04.O(jLongValue, ((C0850u) b04).l0(), false);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC1304a.Q(th6);
                            }
                            c1521a.c(arrayList6);
                            break;
                        default:
                            o oVar8 = oVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                InterfaceC0843m interfaceC0843m = oVar8.f36424d;
                                Long lValueOf = Long.valueOf(((C0850u) interfaceC0843m).m0());
                                Long lValueOf2 = Long.valueOf(((C0850u) interfaceC0843m).h0());
                                i iVar = new i();
                                iVar.f36409a = lValueOf;
                                iVar.f36410b = lValueOf2;
                                arrayList7.add(0, iVar);
                            } catch (Throwable th7) {
                                arrayList7 = AbstractC1304a.Q(th7);
                            }
                            c1521a.c(arrayList7);
                            break;
                    }
                }
            });
        } else {
            x75.n(null);
        }
        X7 x76 = new X7(interfaceC4269f, fVar, obj, v.f("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.pause", strConcat));
        if (oVar != null) {
            final int i13 = 4;
            x76.n(new InterfaceC4265b() { // from class: hd.k
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    switch (i13) {
                        case 0:
                            o oVar2 = oVar;
                            ArrayList arrayList = new ArrayList();
                            Boolean bool = (Boolean) ((ArrayList) obj2).get(0);
                            try {
                                oVar2.getClass();
                                ((C0850u) oVar2.f36424d).I0(bool.booleanValue() ? 2 : 0);
                                arrayList.add(0, null);
                            } catch (Throwable th) {
                                arrayList = AbstractC1304a.Q(th);
                            }
                            c1521a.c(arrayList);
                            break;
                        case 1:
                            o oVar3 = oVar;
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            try {
                                oVar3.getClass();
                                ((C0850u) oVar3.f36424d).M0((float) Math.max(0.0d, Math.min(1.0d, d3.doubleValue())));
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC1304a.Q(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            o oVar4 = oVar;
                            ArrayList arrayList3 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            try {
                                oVar4.getClass();
                                ((C0850u) oVar4.f36424d).H0(new F(d5.floatValue()));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC1304a.Q(th3);
                            }
                            c1521a.c(arrayList3);
                            break;
                        case 3:
                            o oVar5 = oVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                B0 b02 = (B0) oVar5.f36424d;
                                b02.getClass();
                                ((C0850u) b02).G0(true);
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC1304a.Q(th4);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 4:
                            o oVar6 = oVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                B0 b03 = (B0) oVar6.f36424d;
                                b03.getClass();
                                ((C0850u) b03).G0(false);
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC1304a.Q(th5);
                            }
                            c1521a.c(arrayList5);
                            break;
                        case 5:
                            o oVar7 = oVar;
                            ArrayList arrayList6 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj2).get(0);
                            try {
                                oVar7.getClass();
                                long jLongValue = l10.longValue();
                                B0 b04 = (B0) oVar7.f36424d;
                                b04.getClass();
                                b04.O(jLongValue, ((C0850u) b04).l0(), false);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC1304a.Q(th6);
                            }
                            c1521a.c(arrayList6);
                            break;
                        default:
                            o oVar8 = oVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                InterfaceC0843m interfaceC0843m = oVar8.f36424d;
                                Long lValueOf = Long.valueOf(((C0850u) interfaceC0843m).m0());
                                Long lValueOf2 = Long.valueOf(((C0850u) interfaceC0843m).h0());
                                i iVar = new i();
                                iVar.f36409a = lValueOf;
                                iVar.f36410b = lValueOf2;
                                arrayList7.add(0, iVar);
                            } catch (Throwable th7) {
                                arrayList7 = AbstractC1304a.Q(th7);
                            }
                            c1521a.c(arrayList7);
                            break;
                    }
                }
            });
        } else {
            x76.n(null);
        }
        X7 x77 = new X7(interfaceC4269f, fVar, obj, v.f("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.seekTo", strConcat));
        if (oVar != null) {
            final int i14 = 5;
            x77.n(new InterfaceC4265b() { // from class: hd.k
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    switch (i14) {
                        case 0:
                            o oVar2 = oVar;
                            ArrayList arrayList = new ArrayList();
                            Boolean bool = (Boolean) ((ArrayList) obj2).get(0);
                            try {
                                oVar2.getClass();
                                ((C0850u) oVar2.f36424d).I0(bool.booleanValue() ? 2 : 0);
                                arrayList.add(0, null);
                            } catch (Throwable th) {
                                arrayList = AbstractC1304a.Q(th);
                            }
                            c1521a.c(arrayList);
                            break;
                        case 1:
                            o oVar3 = oVar;
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            try {
                                oVar3.getClass();
                                ((C0850u) oVar3.f36424d).M0((float) Math.max(0.0d, Math.min(1.0d, d3.doubleValue())));
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC1304a.Q(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            o oVar4 = oVar;
                            ArrayList arrayList3 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            try {
                                oVar4.getClass();
                                ((C0850u) oVar4.f36424d).H0(new F(d5.floatValue()));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC1304a.Q(th3);
                            }
                            c1521a.c(arrayList3);
                            break;
                        case 3:
                            o oVar5 = oVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                B0 b02 = (B0) oVar5.f36424d;
                                b02.getClass();
                                ((C0850u) b02).G0(true);
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC1304a.Q(th4);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 4:
                            o oVar6 = oVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                B0 b03 = (B0) oVar6.f36424d;
                                b03.getClass();
                                ((C0850u) b03).G0(false);
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC1304a.Q(th5);
                            }
                            c1521a.c(arrayList5);
                            break;
                        case 5:
                            o oVar7 = oVar;
                            ArrayList arrayList6 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj2).get(0);
                            try {
                                oVar7.getClass();
                                long jLongValue = l10.longValue();
                                B0 b04 = (B0) oVar7.f36424d;
                                b04.getClass();
                                b04.O(jLongValue, ((C0850u) b04).l0(), false);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC1304a.Q(th6);
                            }
                            c1521a.c(arrayList6);
                            break;
                        default:
                            o oVar8 = oVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                InterfaceC0843m interfaceC0843m = oVar8.f36424d;
                                Long lValueOf = Long.valueOf(((C0850u) interfaceC0843m).m0());
                                Long lValueOf2 = Long.valueOf(((C0850u) interfaceC0843m).h0());
                                i iVar = new i();
                                iVar.f36409a = lValueOf;
                                iVar.f36410b = lValueOf2;
                                arrayList7.add(0, iVar);
                            } catch (Throwable th7) {
                                arrayList7 = AbstractC1304a.Q(th7);
                            }
                            c1521a.c(arrayList7);
                            break;
                    }
                }
            });
        } else {
            x77.n(null);
        }
        X7 x78 = new X7(interfaceC4269f, fVar, obj, v.f("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.getPlaybackState", strConcat));
        if (oVar == null) {
            x78.n(null);
        } else {
            final int i15 = 6;
            x78.n(new InterfaceC4265b() { // from class: hd.k
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    switch (i15) {
                        case 0:
                            o oVar2 = oVar;
                            ArrayList arrayList = new ArrayList();
                            Boolean bool = (Boolean) ((ArrayList) obj2).get(0);
                            try {
                                oVar2.getClass();
                                ((C0850u) oVar2.f36424d).I0(bool.booleanValue() ? 2 : 0);
                                arrayList.add(0, null);
                            } catch (Throwable th) {
                                arrayList = AbstractC1304a.Q(th);
                            }
                            c1521a.c(arrayList);
                            break;
                        case 1:
                            o oVar3 = oVar;
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            try {
                                oVar3.getClass();
                                ((C0850u) oVar3.f36424d).M0((float) Math.max(0.0d, Math.min(1.0d, d3.doubleValue())));
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC1304a.Q(th2);
                            }
                            c1521a.c(arrayList2);
                            break;
                        case 2:
                            o oVar4 = oVar;
                            ArrayList arrayList3 = new ArrayList();
                            Double d5 = (Double) ((ArrayList) obj2).get(0);
                            try {
                                oVar4.getClass();
                                ((C0850u) oVar4.f36424d).H0(new F(d5.floatValue()));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC1304a.Q(th3);
                            }
                            c1521a.c(arrayList3);
                            break;
                        case 3:
                            o oVar5 = oVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                B0 b02 = (B0) oVar5.f36424d;
                                b02.getClass();
                                ((C0850u) b02).G0(true);
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC1304a.Q(th4);
                            }
                            c1521a.c(arrayList4);
                            break;
                        case 4:
                            o oVar6 = oVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                B0 b03 = (B0) oVar6.f36424d;
                                b03.getClass();
                                ((C0850u) b03).G0(false);
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC1304a.Q(th5);
                            }
                            c1521a.c(arrayList5);
                            break;
                        case 5:
                            o oVar7 = oVar;
                            ArrayList arrayList6 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj2).get(0);
                            try {
                                oVar7.getClass();
                                long jLongValue = l10.longValue();
                                B0 b04 = (B0) oVar7.f36424d;
                                b04.getClass();
                                b04.O(jLongValue, ((C0850u) b04).l0(), false);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC1304a.Q(th6);
                            }
                            c1521a.c(arrayList6);
                            break;
                        default:
                            o oVar8 = oVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                InterfaceC0843m interfaceC0843m = oVar8.f36424d;
                                Long lValueOf = Long.valueOf(((C0850u) interfaceC0843m).m0());
                                Long lValueOf2 = Long.valueOf(((C0850u) interfaceC0843m).h0());
                                i iVar = new i();
                                iVar.f36409a = lValueOf;
                                iVar.f36410b = lValueOf2;
                                arrayList7.add(0, iVar);
                            } catch (Throwable th7) {
                                arrayList7 = AbstractC1304a.Q(th7);
                            }
                            c1521a.c(arrayList7);
                            break;
                    }
                }
            });
        }
    }

    public static long a(long j8, long j10) {
        return H.I(d0.f.d(j8) - C2384c.b(j10), d0.f.b(j8) - C2384c.c(j10));
    }

    public static int b(int i5) {
        for (int i10 : AbstractC0213f.g(4)) {
            if (i(i10) == i5) {
                return i10;
            }
        }
        throw new IllegalArgumentException(AbstractC3256n.g(i5, "Invalid rotation degrees specified: "));
    }

    public static void c(InterfaceC2663d interfaceC2663d, long j8, float f10, float f11, long j10, g0.g gVar) {
        interfaceC2663d.w(j8, f10, f11, C2384c.f33931b, j10, gVar);
    }

    public static void d(InterfaceC2663d interfaceC2663d, C2452d c2452d, long j8, long j10, long j11, float f10, r rVar, int i5, int i10) {
        interfaceC2663d.f(c2452d, (i10 & 2) != 0 ? L0.g.f6802b : j8, j10, L0.g.f6802b, (i10 & 16) != 0 ? j10 : j11, (i10 & 32) != 0 ? 1.0f : f10, rVar, (i10 & 512) != 0 ? 1 : i5);
    }

    public static /* synthetic */ void e(InterfaceC2663d interfaceC2663d, C2454f c2454f, AbstractC2461m abstractC2461m, float f10, g0.g gVar, int i5) {
        if ((i5 & 4) != 0) {
            f10 = 1.0f;
        }
        AbstractC2662c abstractC2662c = gVar;
        if ((i5 & 8) != 0) {
            abstractC2662c = g0.f.f35488b;
        }
        interfaceC2663d.i(c2454f, abstractC2461m, f10, abstractC2662c);
    }

    public static void f(t0.v vVar, AbstractC2461m abstractC2461m, long j8, long j10, float f10, AbstractC2662c abstractC2662c, int i5) {
        if ((i5 & 2) != 0) {
            j8 = C2384c.f33931b;
        }
        long j11 = j8;
        if ((i5 & 4) != 0) {
            j10 = a(vVar.c(), j11);
        }
        vVar.e(abstractC2461m, j11, j10, (i5 & 8) != 0 ? 1.0f : f10, (i5 & 16) != 0 ? g0.f.f35488b : abstractC2662c);
    }

    public static void g(InterfaceC2663d interfaceC2663d, long j8, long j10, float f10, r rVar, int i5) {
        long j11 = C2384c.f33931b;
        if ((i5 & 4) != 0) {
            j10 = a(interfaceC2663d.c(), j11);
        }
        interfaceC2663d.k(j8, j11, j10, (i5 & 8) != 0 ? 1.0f : f10, g0.f.f35488b, (i5 & 32) != 0 ? null : rVar, (i5 & 64) != 0 ? 3 : 0);
    }

    public static void h(t0.v vVar, AbstractC2461m abstractC2461m, long j8, long j10, long j11, AbstractC2662c abstractC2662c, int i5) {
        if ((i5 & 2) != 0) {
            j8 = C2384c.f33931b;
        }
        long j12 = j8;
        vVar.g(abstractC2461m, j12, (i5 & 4) != 0 ? a(vVar.c(), j12) : j10, j11, 1.0f, (i5 & 32) != 0 ? g0.f.f35488b : abstractC2662c);
    }

    public static /* synthetic */ int i(int i5) {
        if (i5 == 1) {
            return 0;
        }
        if (i5 == 2) {
            return 90;
        }
        if (i5 == 3) {
            return 180;
        }
        if (i5 == 4) {
            return 270;
        }
        throw null;
    }

    public static /* synthetic */ String j(int i5) {
        if (i5 == 1) {
            return "ACTION_AUTOSTART";
        }
        if (i5 == 2) {
            return "ACTION_NOTIFICATIONS";
        }
        if (i5 == 3) {
            return "ACTION_POWERSAVING";
        }
        throw null;
    }

    public static /* synthetic */ boolean k(int i5) {
        if (i5 == 1 || i5 == 2) {
            return true;
        }
        if (i5 == 3 || i5 == 4) {
            return false;
        }
        throw null;
    }

    public static /* synthetic */ int l(int i5) {
        switch (i5) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 8;
            case 5:
                return 16;
            case 6:
                return 32;
            case 7:
                return 64;
            case 8:
                return 128;
            case 9:
                return 256;
            case 10:
                return 512;
            case 11:
                return Segment.SHARE_MINIMUM;
            case 12:
                return 2048;
            case 13:
                return 4096;
            case 14:
                return Segment.SIZE;
            case 15:
                return Http2.INITIAL_MAX_FRAME_SIZE;
            case 16:
                return 32768;
            case 17:
                return 65536;
            case 18:
                return 131072;
            case 19:
                return 262144;
            case 20:
                return 524288;
            case 21:
                return 1048576;
            case 22:
                return 2097152;
            case 23:
                return 4194304;
            case 24:
                return 8388608;
            case 25:
                return Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
            case 26:
                return 33554432;
            case 27:
                return 67108864;
            case 28:
                return 134217728;
            case 29:
                return 268435456;
            case 30:
                return 536870912;
            case 31:
                return 1073741824;
            default:
                throw null;
        }
    }

    public static /* synthetic */ boolean m(int i5) {
        if (i5 == 1) {
            return true;
        }
        if (i5 == 2) {
            return false;
        }
        if (i5 == 3) {
            return true;
        }
        if (i5 == 4) {
            return false;
        }
        throw null;
    }

    public static int n(int i5, int i10, int i11) {
        return zzpv.zzC(i5) + i10 + i11;
    }

    public static com.google.android.gms.internal.mlkit_common.zzbc o(int i5) {
        com.google.android.gms.internal.mlkit_common.zzay zzayVar = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar.zza(i5);
        return zzayVar.zzb();
    }

    public static com.google.android.gms.internal.mlkit_common.zzbc p(com.google.android.gms.internal.mlkit_common.zzbc zzbcVar, HashMap map, com.google.android.gms.internal.mlkit_common.zzbc zzbcVar2, HashMap map2, int i5) {
        map.put(zzbcVar.annotationType(), zzbcVar2);
        DesugarCollections.unmodifiableMap(new HashMap(map2));
        com.google.android.gms.internal.mlkit_common.zzay zzayVar = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar.zza(i5);
        return zzayVar.zzb();
    }

    public static com.google.android.gms.internal.mlkit_vision_common.zzai q(int i5) {
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar.zza(i5);
        return zzaeVar.zzb();
    }

    public static com.google.android.gms.internal.mlkit_vision_text_common.zzcx r(int i5) {
        com.google.android.gms.internal.mlkit_vision_text_common.zzct zzctVar = new com.google.android.gms.internal.mlkit_vision_text_common.zzct();
        zzctVar.zza(i5);
        return zzctVar.zzb();
    }

    public static com.google.android.gms.internal.mlkit_vision_text_common.zzcx s(com.google.android.gms.internal.mlkit_vision_text_common.zzcx zzcxVar, HashMap map, com.google.android.gms.internal.mlkit_vision_text_common.zzcx zzcxVar2, HashMap map2, int i5) {
        map.put(zzcxVar.annotationType(), zzcxVar2);
        DesugarCollections.unmodifiableMap(new HashMap(map2));
        com.google.android.gms.internal.mlkit_vision_text_common.zzct zzctVar = new com.google.android.gms.internal.mlkit_vision_text_common.zzct();
        zzctVar.zza(i5);
        return zzctVar.zzb();
    }

    public static d t(int i5, c cVar) {
        com.google.android.gms.internal.mlkit_common.zzay zzayVar = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar.zza(i5);
        cVar.b(zzayVar.zzb());
        return cVar.a();
    }

    public static String u(int i5, int i10, String str, String str2, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(i5);
        sb2.append(str2);
        sb2.append(i10);
        return sb2.toString();
    }

    public static String v(Locale locale, String str, String str2, Locale locale2, String str3) {
        AbstractC3340k.d(locale, str);
        String lowerCase = str2.toLowerCase(locale2);
        AbstractC3340k.d(lowerCase, str3);
        return lowerCase;
    }

    public static StringBuilder w(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static void x(com.google.android.gms.internal.mlkit_common.zzbc zzbcVar, HashMap map, com.google.android.gms.internal.mlkit_common.zzbc zzbcVar2, HashMap map2) {
        map.put(zzbcVar.annotationType(), zzbcVar2);
        DesugarCollections.unmodifiableMap(new HashMap(map2));
    }

    public static void y(com.google.android.gms.internal.mlkit_vision_text_common.zzcx zzcxVar, HashMap map, com.google.android.gms.internal.mlkit_vision_text_common.zzcx zzcxVar2, HashMap map2) {
        map.put(zzcxVar.annotationType(), zzcxVar2);
        DesugarCollections.unmodifiableMap(new HashMap(map2));
    }

    public static void z(String str, String str2, Logger logger) {
        logger.debug(str + str2);
    }
}
