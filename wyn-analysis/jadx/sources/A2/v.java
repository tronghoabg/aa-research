package a2;

import A.AbstractC0213f;
import D6.e1;
import E5.C0441b;
import Y2.B;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import ba.C1521a;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.internal.ads.zzblx;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import com.moloco.sdk.C1862c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import ea.C2482F;
import g2.z;
import h1.InterfaceC2766a;
import h6.InterfaceC2787f;
import j$.util.DesugarCollections;
import j7.C3088a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import ka.C3252l1;
import ka.C3258n1;
import ka.E1;
import ka.G1;
import ka.H;
import ka.Z;
import kotlin.jvm.internal.AbstractC3340k;
import me.C3558a;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.json.JSONException;
import org.json.JSONObject;
import p9.C3776A;
import p9.C3785f;
import p9.EnumC3784e;
import q.W;
import q5.C3866a;
import q5.C3868c;
import q5.EnumC3870e;
import q5.InterfaceC3872g;
import r9.S;
import r9.y;
import t0.C4061i;
import t5.C4121p;
import u6.AbstractC4256a;
import uc.C4276m;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4265b;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;
import wd.C4402c;
import x6.InterfaceC4482m;

/* loaded from: classes.dex */
public class v implements com.dexterous.flutterlocalnotifications.i, zzblx, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k, o2.h, InterfaceC2766a, p.w, InterfaceC1708w, W, InterfaceC2787f, InterfaceC4265b, InterfaceC4279p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17321a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17322b;

    public /* synthetic */ v(int i5, boolean z2) {
        this.f17321a = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00de A[Catch: InvalidProtocolBufferException -> 0x0123, TryCatch #2 {InvalidProtocolBufferException -> 0x0123, blocks: (B:12:0x0029, B:48:0x00de, B:50:0x0102, B:52:0x0112, B:51:0x0110, B:54:0x011b, B:55:0x0122, B:40:0x00bb, B:44:0x00cb), top: B:63:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011b A[Catch: InvalidProtocolBufferException -> 0x0123, TryCatch #2 {InvalidProtocolBufferException -> 0x0123, blocks: (B:12:0x0029, B:48:0x00de, B:50:0x0102, B:52:0x0112, B:51:0x0110, B:54:0x011b, B:55:0x0122, B:40:0x00bb, B:44:0x00cb), top: B:63:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(a2.v r9, java.lang.String r10, lf.AbstractC3464c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.v.i(a2.v, java.lang.String, lf.c):java.lang.Object");
    }

    public static byte[] j() {
        byte[] byteArray = ((C1862c) C1862c.b().build()).toByteArray();
        AbstractC3340k.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static ArrayList q(ia.h hVar) {
        ArrayList arrayList = new ArrayList();
        for (ia.f fVar : hVar.getFieldsList()) {
            s9.j jVarL = s9.j.l(fVar.e());
            int i5 = 2;
            if (AbstractC0213f.b(fVar.g(), 2)) {
                i5 = 3;
            } else if (fVar.f().equals(ia.e.ASCENDING)) {
                i5 = 1;
            }
            arrayList.add(new s9.d(i5, jVarL));
        }
        return arrayList;
    }

    public static v v(Intent intent) {
        ArrayList arrayList = new ArrayList();
        if (intent.getBooleanExtra("trace-startup", false)) {
            arrayList.add("--trace-startup");
        }
        if (intent.getBooleanExtra("start-paused", false)) {
            arrayList.add("--start-paused");
        }
        int intExtra = intent.getIntExtra("vm-service-port", 0);
        if (intExtra > 0) {
            arrayList.add("--vm-service-port=" + Integer.toString(intExtra));
        } else {
            int intExtra2 = intent.getIntExtra("observatory-port", 0);
            if (intExtra2 > 0) {
                arrayList.add("--vm-service-port=" + Integer.toString(intExtra2));
            }
        }
        if (intent.getBooleanExtra("disable-service-auth-codes", false)) {
            arrayList.add("--disable-service-auth-codes");
        }
        if (intent.getBooleanExtra("endless-trace-buffer", false)) {
            arrayList.add("--endless-trace-buffer");
        }
        if (intent.getBooleanExtra("use-test-fonts", false)) {
            arrayList.add("--use-test-fonts");
        }
        if (intent.getBooleanExtra("enable-dart-profiling", false)) {
            arrayList.add("--enable-dart-profiling");
        }
        if (intent.getBooleanExtra("enable-software-rendering", false)) {
            arrayList.add("--enable-software-rendering");
        }
        if (intent.getBooleanExtra("skia-deterministic-rendering", false)) {
            arrayList.add("--skia-deterministic-rendering");
        }
        if (intent.getBooleanExtra("trace-skia", false)) {
            arrayList.add("--trace-skia");
        }
        String stringExtra = intent.getStringExtra("trace-skia-allowlist");
        if (stringExtra != null) {
            arrayList.add("--trace-skia-allowlist=".concat(stringExtra));
        }
        if (intent.getBooleanExtra("trace-systrace", false)) {
            arrayList.add("--trace-systrace");
        }
        if (intent.hasExtra("trace-to-file")) {
            arrayList.add("--trace-to-file=" + intent.getStringExtra("trace-to-file"));
        }
        if (intent.hasExtra("enable-impeller")) {
            if (intent.getBooleanExtra("enable-impeller", false)) {
                arrayList.add("--enable-impeller=true");
            } else {
                arrayList.add("--enable-impeller=false");
            }
        }
        if (intent.getBooleanExtra("enable-vulkan-validation", false)) {
            arrayList.add("--enable-vulkan-validation");
        }
        if (intent.getBooleanExtra("dump-skp-on-shader-compilation", false)) {
            arrayList.add("--dump-skp-on-shader-compilation");
        }
        if (intent.getBooleanExtra("cache-sksl", false)) {
            arrayList.add("--cache-sksl");
        }
        if (intent.getBooleanExtra("purge-persistent-cache", false)) {
            arrayList.add("--purge-persistent-cache");
        }
        if (intent.getBooleanExtra("verbose-logging", false)) {
            arrayList.add("--verbose-logging");
        }
        if (intent.hasExtra("dart-flags")) {
            arrayList.add("--dart-flags=" + intent.getStringExtra("dart-flags"));
        }
        v vVar = new v(15, false);
        vVar.f17322b = new HashSet(arrayList);
        return vVar;
    }

    @Override // o2.h
    public /* bridge */ /* synthetic */ void A(o2.j jVar, long j8, long j10) {
    }

    @Override // com.dexterous.flutterlocalnotifications.i
    public void B(boolean z2) {
        ((InterfaceC4280q) this.f17322b).a(Boolean.valueOf(z2));
    }

    @Override // o2.h
    public U5.f E(o2.j jVar, long j8, long j10, IOException iOException, int i5) {
        if (!((z) this.f17322b).f35705f) {
            B b5 = ((z) this.f17322b).f35700a;
        }
        return o2.m.f41318e;
    }

    @Override // p.w
    public boolean F(p.k kVar) {
        Window.Callback callback = ((j.w) this.f17322b).f38538l.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k
    public void a(String url) {
        AbstractC3340k.e(url, "url");
        ((G0) this.f17322b).a(url);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
    public void accept(Object obj, Object obj2) throws RemoteException {
        j7.f fVar = new j7.f((TaskCompletionSource) obj2);
        j7.e eVar = (j7.e) ((j7.h) obj).getService();
        C3088a c3088a = (C3088a) this.f17322b;
        Parcel parcelZaa = eVar.zaa();
        zac.zad(parcelZaa, fVar);
        zac.zac(parcelZaa, c3088a);
        zac.zad(parcelZaa, null);
        eVar.zac(2, parcelZaa);
    }

    @Override // h1.InterfaceC2766a
    public Cursor c(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f17322b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e7) {
            Log.w("FontsProvider", "Unable to query the content provider", e7);
            return null;
        }
    }

    @Override // h1.InterfaceC2766a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f17322b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // uc.InterfaceC4265b
    public void e(Object obj, C1521a c1521a) {
        HashMap map;
        HashMap map2;
        C3558a c3558a = (C3558a) this.f17322b;
        if (((io.flutter.view.a) c3558a.f40738c) == null) {
            c1521a.c(null);
            return;
        }
        map = (HashMap) obj;
        String str = (String) map.get("type");
        map2 = (HashMap) map.get(JsonStorageKeyNames.DATA_KEY);
        str.getClass();
        switch (str) {
            case "tooltip":
                String str2 = (String) map2.get(PglCryptUtils.KEY_MESSAGE);
                if (str2 != null) {
                    io.flutter.view.a aVar = (io.flutter.view.a) c3558a.f40738c;
                    if (Build.VERSION.SDK_INT < 28) {
                        io.flutter.view.l lVar = (io.flutter.view.l) aVar.f37189a;
                        AccessibilityEvent accessibilityEventD = lVar.d(0, 32);
                        accessibilityEventD.getText().add(str2);
                        lVar.h(accessibilityEventD);
                        break;
                    } else {
                        aVar.getClass();
                        break;
                    }
                }
                break;
            case "announce":
                String str3 = (String) map2.get(PglCryptUtils.KEY_MESSAGE);
                if (str3 != null) {
                    io.flutter.view.a aVar2 = (io.flutter.view.a) c3558a.f40738c;
                    if (Build.VERSION.SDK_INT >= 36) {
                        aVar2.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.l) aVar2.f37189a).f37279a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) map.get("nodeId");
                if (num != null) {
                    io.flutter.view.a aVar3 = (io.flutter.view.a) c3558a.f40738c;
                    ((io.flutter.view.l) aVar3.f37189a).g(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) map.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.a aVar4 = (io.flutter.view.a) c3558a.f40738c;
                    ((io.flutter.view.l) aVar4.f37189a).g(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) map.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.a aVar5 = (io.flutter.view.a) c3558a.f40738c;
                    ((io.flutter.view.l) aVar5.f37189a).g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        c1521a.c(null);
    }

    @Override // h6.InterfaceC2787f
    public List g(long j8) {
        return j8 >= 0 ? (List) this.f17322b : Collections.EMPTY_LIST;
    }

    @Override // h6.InterfaceC2787f
    public long k(int i5) {
        AbstractC4256a.e(i5 == 0);
        return 0L;
    }

    @Override // p.w
    public void l(p.k kVar, boolean z2) {
        ((j.w) this.f17322b).q(kVar);
    }

    public void m(C3785f c3785f) {
        s9.k kVar = c3785f.f43353b;
        s9.h hVar = kVar.f45380a;
        TreeMap treeMap = (TreeMap) this.f17322b;
        C3785f c3785f2 = (C3785f) treeMap.get(hVar);
        if (c3785f2 == null) {
            treeMap.put(hVar, c3785f);
            return;
        }
        EnumC3784e enumC3784e = EnumC3784e.f43348b;
        EnumC3784e enumC3784e2 = EnumC3784e.f43350d;
        EnumC3784e enumC3784e3 = c3785f2.f43352a;
        EnumC3784e enumC3784e4 = c3785f.f43352a;
        if (enumC3784e4 != enumC3784e && enumC3784e3 == enumC3784e2) {
            treeMap.put(hVar, c3785f);
            return;
        }
        EnumC3784e enumC3784e5 = EnumC3784e.f43347a;
        if (enumC3784e4 == enumC3784e2 && enumC3784e3 != enumC3784e5) {
            treeMap.put(hVar, new C3785f(enumC3784e3, kVar));
            return;
        }
        EnumC3784e enumC3784e6 = EnumC3784e.f43349c;
        if (enumC3784e4 == enumC3784e6 && enumC3784e3 == enumC3784e6) {
            treeMap.put(hVar, new C3785f(enumC3784e6, kVar));
            return;
        }
        if (enumC3784e4 == enumC3784e6 && enumC3784e3 == enumC3784e) {
            treeMap.put(hVar, new C3785f(enumC3784e, kVar));
            return;
        }
        if (enumC3784e4 == enumC3784e5 && enumC3784e3 == enumC3784e) {
            treeMap.remove(hVar);
            return;
        }
        if (enumC3784e4 == enumC3784e5 && enumC3784e3 == enumC3784e6) {
            treeMap.put(hVar, new C3785f(enumC3784e5, c3785f2.f43353b));
        } else if (enumC3784e4 == enumC3784e && enumC3784e3 == enumC3784e5) {
            treeMap.put(hVar, new C3785f(enumC3784e6, kVar));
        } else {
            A6.c.s("Unsupported combination of changes %s after %s", enumC3784e4, enumC3784e3);
            throw null;
        }
    }

    public boolean n(LinkedHashMap linkedHashMap, C4061i parentCoordinates, C0441b c0441b, boolean z2) {
        AbstractC3340k.e(parentCoordinates, "parentCoordinates");
        P.d dVar = (P.d) this.f17322b;
        int i5 = dVar.f8972c;
        if (i5 <= 0) {
            return false;
        }
        Object[] objArr = dVar.f8970a;
        int i10 = 0;
        boolean z10 = false;
        do {
            z10 = ((p0.e) objArr[i10]).n(linkedHashMap, parentCoordinates, c0441b, z2) || z10;
            i10++;
        } while (i10 < i5);
        return z10;
    }

    public void o(C0441b c0441b) {
        P.d dVar = (P.d) this.f17322b;
        int i5 = dVar.f8972c;
        while (true) {
            i5--;
            if (-1 >= i5) {
                return;
            }
            if (((p0.e) dVar.f8970a[i5]).f43126d.i()) {
                dVar.m(i5);
            }
        }
    }

    @Override // uc.InterfaceC4279p
    public void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        Object obj;
        boolean z2 = false;
        switch (this.f17321a) {
            case 27:
                t6.q qVar = (t6.q) this.f17322b;
                if (((tc.j) qVar.f45907b) == null) {
                    return;
                }
                String str = c4278o.f46759a;
                str.getClass();
                if (!str.equals("Localization.getStringResource")) {
                    ((tc.g) interfaceC4280q).c();
                    return;
                }
                JSONObject jSONObject = (JSONObject) c4278o.f46760b;
                try {
                    ((tc.g) interfaceC4280q).a(((tc.j) qVar.f45907b).a(jSONObject.getString(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                    return;
                } catch (JSONException e7) {
                    ((tc.g) interfaceC4280q).b("error", e7.getMessage(), null);
                    return;
                }
            default:
                t6.q qVar2 = (t6.q) this.f17322b;
                if (((io.flutter.plugin.platform.n) qVar2.f45907b) == null) {
                    return;
                }
                String str2 = c4278o.f46759a;
                str2.getClass();
                obj = c4278o.f46760b;
                switch (str2) {
                    case "create":
                        Map map = (Map) obj;
                        boolean z10 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                        ByteBuffer byteBufferWrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                        try {
                            if (z10) {
                                tc.d dVar = new tc.d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 3, byteBufferWrap);
                                io.flutter.plugin.platform.q qVar3 = (io.flutter.plugin.platform.q) ((io.flutter.plugin.platform.n) qVar2.f45907b).f37116b;
                                qVar3.getClass();
                                io.flutter.plugin.platform.q.h(19);
                                io.flutter.plugin.platform.q.e(qVar3, dVar);
                                qVar3.f(dVar, false);
                                io.flutter.plugin.platform.q.h(19);
                                ((tc.g) interfaceC4280q).a(null);
                                return;
                            }
                            if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                                z2 = true;
                            }
                            long jC = ((io.flutter.plugin.platform.n) qVar2.f45907b).c(new tc.d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z2 ? 2 : 1, byteBufferWrap));
                            if (jC != -2) {
                                ((tc.g) interfaceC4280q).a(Long.valueOf(jC));
                                return;
                            } else {
                                if (!z2) {
                                    throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                                }
                                ((tc.g) interfaceC4280q).a(null);
                                return;
                            }
                        } catch (IllegalStateException e10) {
                            ((tc.g) interfaceC4280q).b("error", Log.getStackTraceString(e10), null);
                            return;
                        }
                    case "offset":
                        Map map2 = (Map) obj;
                        try {
                            ((io.flutter.plugin.platform.n) qVar2.f45907b).g(((Integer) map2.get("id")).intValue(), ((Double) map2.get("top")).doubleValue(), ((Double) map2.get("left")).doubleValue());
                            ((tc.g) interfaceC4280q).a(null);
                            return;
                        } catch (IllegalStateException e11) {
                            ((tc.g) interfaceC4280q).b("error", Log.getStackTraceString(e11), null);
                            return;
                        }
                    case "resize":
                        Map map3 = (Map) obj;
                        try {
                            ((io.flutter.plugin.platform.n) qVar2.f45907b).k(new tc.e(((Integer) map3.get("id")).intValue(), ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue()), new Ka.b((tc.g) interfaceC4280q, 5));
                            return;
                        } catch (IllegalStateException e12) {
                            ((tc.g) interfaceC4280q).b("error", Log.getStackTraceString(e12), null);
                            return;
                        }
                    case "clearFocus":
                        try {
                            ((io.flutter.plugin.platform.n) qVar2.f45907b).b(((Integer) obj).intValue());
                            ((tc.g) interfaceC4280q).a(null);
                            return;
                        } catch (IllegalStateException e13) {
                            ((tc.g) interfaceC4280q).b("error", Log.getStackTraceString(e13), null);
                            return;
                        }
                    case "synchronizeToNativeViewHierarchy":
                        try {
                            ((io.flutter.plugin.platform.q) ((io.flutter.plugin.platform.n) qVar2.f45907b).f37116b).f37148q = ((Boolean) obj).booleanValue();
                            ((tc.g) interfaceC4280q).a(null);
                            return;
                        } catch (IllegalStateException e14) {
                            ((tc.g) interfaceC4280q).b("error", Log.getStackTraceString(e14), null);
                            return;
                        }
                    case "touch":
                        List list = (List) obj;
                        try {
                            ((io.flutter.plugin.platform.n) qVar2.f45907b).h(new tc.f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                            ((tc.g) interfaceC4280q).a(null);
                            return;
                        } catch (IllegalStateException e15) {
                            ((tc.g) interfaceC4280q).b("error", Log.getStackTraceString(e15), null);
                            return;
                        }
                    case "setDirection":
                        Map map4 = (Map) obj;
                        try {
                            ((io.flutter.plugin.platform.n) qVar2.f45907b).l(((Integer) map4.get("id")).intValue(), ((Integer) map4.get("direction")).intValue());
                            ((tc.g) interfaceC4280q).a(null);
                            return;
                        } catch (IllegalStateException e16) {
                            ((tc.g) interfaceC4280q).b("error", Log.getStackTraceString(e16), null);
                            return;
                        }
                    case "dispose":
                        try {
                            ((io.flutter.plugin.platform.n) qVar2.f45907b).e(((Integer) ((Map) obj).get("id")).intValue());
                            ((tc.g) interfaceC4280q).a(null);
                            return;
                        } catch (IllegalStateException e17) {
                            ((tc.g) interfaceC4280q).b("error", Log.getStackTraceString(e17), null);
                            return;
                        }
                    default:
                        ((tc.g) interfaceC4280q).c();
                        return;
                }
        }
    }

    @Override // h6.InterfaceC2787f
    public int p() {
        return 1;
    }

    public s9.k r(u9.c cVar) {
        int iF = AbstractC0213f.f(cVar.g());
        v9.o oVar = (v9.o) this.f17322b;
        if (iF == 0) {
            u9.f fVarI = cVar.i();
            boolean zH = cVar.h();
            s9.k kVarH = s9.k.h(oVar.b(fVarI.getName()), v9.o.f(fVarI.e()));
            if (zH) {
                kVarH.f45385f = 2;
            }
            return kVarH;
        }
        if (iF == 1) {
            H hF = cVar.f();
            boolean zH2 = cVar.h();
            s9.h hVarB = oVar.b(hF.getName());
            s9.o oVarF = v9.o.f(hF.f());
            s9.l lVarE = s9.l.e(hF.getFieldsMap());
            s9.k kVar = new s9.k(hVarB);
            kVar.a(oVarF, lVarE);
            if (zH2) {
                kVar.f45385f = 2;
            }
            return kVar;
        }
        if (iF != 2) {
            A6.c.s("Unknown MaybeDocument %s", cVar);
            throw null;
        }
        u9.m mVarJ = cVar.j();
        s9.h hVarB2 = oVar.b(mVarJ.getName());
        s9.o oVarF2 = v9.o.f(mVarJ.e());
        s9.k kVar2 = new s9.k(hVarB2);
        kVar2.f45382c = oVarF2;
        kVar2.f45381b = 4;
        kVar2.f45384e = new s9.l();
        kVar2.f45385f = 2;
        return kVar2;
    }

    @Override // com.dexterous.flutterlocalnotifications.i
    public void s() {
        ((InterfaceC4280q) this.f17322b).b("permissionRequestInProgress", "Another permission request is already in progress", null);
    }

    public t9.i t(u9.p pVar) {
        int iH = pVar.h();
        Timestamp timestampI = pVar.i();
        v9.o oVar = (v9.o) this.f17322b;
        s8.q qVar = new s8.q(timestampI.getSeconds(), timestampI.getNanos());
        int iG = pVar.g();
        ArrayList arrayList = new ArrayList(iG);
        for (int i5 = 0; i5 < iG; i5++) {
            arrayList.add(oVar.c(pVar.f(i5)));
        }
        ArrayList arrayList2 = new ArrayList(pVar.k());
        int i10 = 0;
        while (i10 < pVar.k()) {
            G1 g1J = pVar.j(i10);
            int i11 = i10 + 1;
            if (i11 >= pVar.k() || !pVar.j(i11).q()) {
                arrayList2.add(oVar.c(g1J));
            } else {
                A6.c.z(pVar.j(i10).r(), "TransformMutation should be preceded by a patch or set mutation", new Object[0]);
                E1 e1U = G1.u(g1J);
                Iterator<E> it = pVar.j(i11).k().c().iterator();
                while (it.hasNext()) {
                    e1U.a((Z) it.next());
                }
                arrayList2.add(oVar.c((G1) e1U.build()));
                i10 = i11;
            }
            i10++;
        }
        return new t9.i(iH, qVar, arrayList, arrayList2);
    }

    public S u(u9.j jVar) {
        C3776A c3776aE;
        int iP = jVar.p();
        s9.o oVarF = v9.o.f(jVar.o());
        s9.o oVarF2 = v9.o.f(jVar.k());
        ByteString byteStringN = jVar.n();
        long jL = jVar.l();
        int iOrdinal = jVar.q().ordinal();
        if (iOrdinal == 0) {
            C3258n1 c3258n1M = jVar.m();
            c3776aE = v9.o.e(c3258n1M.e(), c3258n1M.f());
        } else {
            if (iOrdinal != 1) {
                A6.c.s("Unknown targetType %d", jVar.q());
                throw null;
            }
            C3252l1 c3252l1J = jVar.j();
            int iE = c3252l1J.e();
            A6.c.z(iE == 1, "DocumentsTarget contained other than 1 document %d", Integer.valueOf(iE));
            s9.m mVarL = s9.m.l(c3252l1J.d());
            A6.c.z(v9.o.n(mVarL), "Tried to deserialize invalid key %s", mVarL);
            c3776aE = new p9.u(mVarL.f45369a.size() == 4 ? s9.m.f45388b : v9.o.m(mVarL), null).i();
        }
        return new S(c3776aE, iP, jL, y.f44679a, oVarF, oVarF2, byteStringN, null);
    }

    @Override // o2.h
    public /* bridge */ /* synthetic */ void w(o2.j jVar, long j8, long j10, boolean z2) {
    }

    public void x(C2482F c2482f) {
        ((C4121p) ((InterfaceC3872g) ((O9.b) this.f17322b).get())).a("FIREBASE_APPQUALITY_SESSION", new C3868c("json"), new com.unity3d.services.core.webview.b(this, 4)).a(new C3866a(c2482f, EnumC3870e.f44125a, null), new m9.B(23));
    }

    public void y() {
        int i5 = 0;
        while (true) {
            P.d dVar = (P.d) this.f17322b;
            if (i5 >= dVar.f8972c) {
                return;
            }
            p0.e eVar = (p0.e) dVar.f8970a[i5];
            if (eVar.f43125c.f43164b) {
                i5++;
                eVar.y();
            } else {
                dVar.m(i5);
                eVar.C();
            }
        }
    }

    public String[] z() {
        HashSet hashSet = (HashSet) this.f17322b;
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public void zza(InterfaceC4482m interfaceC4482m) {
        zzbmp zzbmpVar = ((NativeAdView) this.f17322b).f26336b;
        if (zzbmpVar == null) {
            return;
        }
        try {
            if (interfaceC4482m instanceof e1) {
                zzbmpVar.zzdE(((e1) interfaceC4482m).f2420a);
            } else if (interfaceC4482m == null) {
                zzbmpVar.zzdE(null);
            } else {
                H6.l.a("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e7) {
            H6.l.d("Unable to call setMediaContent on delegate", e7);
        }
    }

    public /* synthetic */ v(j7.g gVar, C3088a c3088a) {
        this.f17321a = 13;
        this.f17322b = c3088a;
    }

    @Override // h6.InterfaceC2787f
    public int a(long j8) {
        return j8 < 0 ? 0 : -1;
    }

    public /* synthetic */ v(Object obj, int i5) {
        this.f17321a = i5;
        this.f17322b = obj;
    }

    public v(G0 externalLinkHandler) {
        this.f17321a = 5;
        AbstractC3340k.e(externalLinkHandler, "externalLinkHandler");
        this.f17322b = externalLinkHandler;
    }

    public v(C4402c c4402c, com.moloco.sdk.internal.services.bidtoken.l lVar, com.moloco.sdk.internal.services.bidtoken.h hVar) {
        this.f17321a = 4;
        this.f17322b = c4402c;
    }

    public v(ArrayList arrayList) {
        this.f17321a = 22;
        this.f17322b = DesugarCollections.unmodifiableList(arrayList);
    }

    public v(int i5) {
        this.f17321a = i5;
        switch (i5) {
            case 18:
                this.f17322b = new P.d(new p0.e[16]);
                break;
            case 19:
                this.f17322b = new TreeMap();
                break;
            default:
                this.f17322b = new SparseArray();
                break;
        }
    }

    public v(tf.a defaultFactory) {
        this.f17321a = 24;
        AbstractC3340k.e(defaultFactory, "defaultFactory");
        this.f17322b = defaultFactory;
    }

    public v(mc.b bVar) {
        this.f17321a = 29;
        new C4281r(bVar, "flutter/scribe", C4276m.f46758a, null).b(new com.google.android.gms.ads.nativead.l(this, 24));
    }

    public v(Context context, Uri uri) {
        this.f17321a = 10;
        this.f17322b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // q.W
    public void b(int i5) {
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k
    public void d(String str) {
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k
    public void f(String str) {
    }

    @Override // q.W
    public void h(int i5) {
    }
}
