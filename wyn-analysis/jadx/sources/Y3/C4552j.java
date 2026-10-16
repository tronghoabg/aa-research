package y3;

import A7.C0237b0;
import A7.C0273n0;
import A7.L1;
import A7.N;
import A7.P0;
import A7.W0;
import Ef.C0502n;
import G5.C0535p;
import G5.K;
import G5.RunnableC0533n;
import I4.B;
import I4.C;
import I4.C0618c;
import I4.v;
import I4.z;
import J9.C0656o;
import N1.C0754c;
import Q1.x;
import Re.AbstractC0814i;
import Va.M6;
import a4.C1329b;
import a4.C1330c;
import android.app.Activity;
import android.content.ContentResolver;
import android.media.AudioAttributes;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import com.google.android.gms.internal.ads.zzclb;
import com.google.android.gms.internal.ads.zzcmx;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import k1.S;
import k2.C3168z;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import p7.C3773c;
import u6.AbstractC4256a;
import uc.C4278o;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;
import wa.C4398a;
import z9.EnumC4624C;
import z9.InterfaceC4626E;

/* renamed from: y3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4552j implements WebMessageListenerBoundaryInterface, D9.m, Z4.a, zzcmx, I4.q, B, w8.b, l1.o, OnCompleteListener, P8.b, Q8.a, P2.d, R4.i, InterfaceC4279p, o2.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48000a;

    /* renamed from: b, reason: collision with root package name */
    public Object f48001b;

    public /* synthetic */ C4552j(int i5, boolean z2) {
        this.f48000a = i5;
    }

    public static String r(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(MediationMetaData.KEY_NAME, str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // o2.h
    public void A(o2.j jVar, long j8, long j10) {
        o2.p pVar = (o2.p) jVar;
        X1.f fVar = (X1.f) this.f48001b;
        fVar.getClass();
        long j11 = pVar.f41323a;
        Uri uri = pVar.f41326d.f10922c;
        C3168z c3168z = new C3168z(j10);
        fVar.f15973m.getClass();
        fVar.f15977q.d(c3168z, pVar.f41325c);
        fVar.L = ((Long) pVar.f41328f).longValue() - j8;
        fVar.y(true);
    }

    @Override // o2.h
    public U5.f E(o2.j jVar, long j8, long j10, IOException iOException, int i5) {
        o2.p pVar = (o2.p) jVar;
        X1.f fVar = (X1.f) this.f48001b;
        fVar.getClass();
        long j11 = pVar.f41323a;
        Uri uri = pVar.f41326d.f10922c;
        fVar.f15977q.g(new C3168z(j10), pVar.f41325c, iOException, true);
        fVar.f15973m.getClass();
        fVar.x(iOException);
        return o2.m.f41318e;
    }

    @Override // P2.d, h6.InterfaceC2787f
    public int a(long j8) {
        return j8 < 0 ? 0 : -1;
    }

    @Override // Q8.a
    public void b(R8.r rVar) {
        this.f48001b = rVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // Z4.a
    public Object c() {
        E4.n nVar = (E4.n) this.f48001b;
        return new E4.k((d7.j) nVar.f2939c, (Dd.c) nVar.f2940d);
    }

    @Override // I4.q
    public I4.p d(v vVar) {
        switch (this.f48000a) {
            case 10:
                return new C0618c((z) this.f48001b, 1);
            default:
                return new C(this);
        }
    }

    @Override // D9.m
    public void e() {
        InterfaceC4626E interfaceC4626E;
        B9.d dVar = (B9.d) this.f48001b;
        B9.f fVar = dVar.f1625h;
        if (fVar.f1636j != null && (interfaceC4626E = fVar.k) != null) {
            ((C0656o) interfaceC4626E).f(EnumC4624C.f48422b);
        }
        Activity activity = dVar.f1623f;
        B9.f fVar2 = dVar.f1625h;
        fVar2.getClass();
        D9.e.a("Dismissing fiam");
        fVar2.e(activity);
        fVar2.f1636j = null;
        fVar2.k = null;
    }

    @Override // w8.b
    public void f(int i5, Bundle bundle) {
        if (i5 == 2) {
            ((AbstractC0814i) this.f48001b).b(bundle.getString("events"));
        }
    }

    @Override // P2.d, h6.InterfaceC2787f
    public List g(long j8) {
        return j8 >= 0 ? (List) this.f48001b : Collections.EMPTY_LIST;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    public AudioAttributesImpl h() {
        return new AudioAttributesImplApi21(((AudioAttributes.Builder) this.f48001b).build());
    }

    public a4.h i() {
        C1330c c1330cD;
        C0237b0 c0237b0 = (C0237b0) this.f48001b;
        a4.f fVar = (a4.f) c0237b0.f815e;
        synchronized (fVar) {
            c0237b0.l(true);
            c1330cD = fVar.d(((C1329b) c0237b0.f813c).f17342a);
        }
        if (c1330cD != null) {
            return new a4.h(c1330cD);
        }
        return null;
    }

    @Override // I4.B
    public C4.e j(Uri uri) {
        return new C4.a((ContentResolver) this.f48001b, uri, 1);
    }

    @Override // P2.d, h6.InterfaceC2787f
    public long k(int i5) {
        Q1.k.c(i5 == 0);
        return 0L;
    }

    @Override // l1.o
    public boolean l(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f48001b;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = S.f38779a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i5 = swipeDismissBehavior.f26785d;
        view.offsetLeftAndRight((!(i5 == 0 && z2) && (i5 != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return true;
    }

    @Override // P8.b
    public void m(Bundle bundle, String str) {
        R8.r rVar = (R8.r) this.f48001b;
        if (rVar != null) {
            try {
                String str2 = "$A$:" + r(bundle, str);
                R8.s sVar = rVar.f10509a;
                sVar.getClass();
                sVar.f10524p.f11034a.b(new R8.o(sVar, System.currentTimeMillis() - sVar.f10513d, str2, 1));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    public void n(Exception exc) {
        AbstractC4256a.p("MediaCodecAudioRenderer", "Audio sink error", exc);
        C0535p c0535p = ((K) this.f48001b).f4314F0;
        Handler handler = c0535p.f4433b;
        if (handler != null) {
            handler.post(new RunnableC0533n(c0535p, exc, 6));
        }
    }

    public W5.c o(J5.h hVar, b6.g gVar) throws EOFException, InterruptedIOException {
        Y4.b bVar = (Y4.b) this.f48001b;
        W5.c cVarO = null;
        int i5 = 0;
        while (true) {
            try {
                hVar.c(bVar.f16679a, 0, 10, false);
                bVar.A(0);
                if (bVar.s() != 4801587) {
                    break;
                }
                bVar.B(3);
                int iP = bVar.p();
                int i10 = iP + 10;
                if (cVarO == null) {
                    byte[] bArr = new byte[i10];
                    System.arraycopy(bVar.f16679a, 0, bArr, 0, 10);
                    hVar.c(bArr, 10, iP, false);
                    cVarO = new b6.h(gVar).O(i10, bArr);
                } else {
                    hVar.b(iP, false);
                }
                i5 += i10;
            } catch (EOFException unused) {
            }
        }
        hVar.f5648f = 0;
        hVar.b(i5, false);
        return cVarO;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Exception exception = task.getException();
        C0502n c0502n = (C0502n) this.f48001b;
        if (exception != null) {
            c0502n.resumeWith(Fe.e.z(exception));
        } else if (task.isCanceled()) {
            c0502n.a(null);
        } else {
            c0502n.resumeWith(task.getResult());
        }
    }

    @Override // uc.InterfaceC4279p
    public void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        if (!ExternalParsersConfigReaderMetKeys.CHECK_TAG.equals(c4278o.f46759a)) {
            ((tc.g) interfaceC4280q).c();
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) ((xa.d) this.f48001b).f47873b;
        ((tc.g) interfaceC4280q).a(xa.d.m(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        /*
            r7 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebMessageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class
            java.lang.Object r9 = tg.b.o(r0, r9)
            org.chromium.support_lib_boundary.WebMessageBoundaryInterface r9 = (org.chromium.support_lib_boundary.WebMessageBoundaryInterface) r9
            java.lang.reflect.InvocationHandler[] r0 = r9.getPorts()
            int r1 = r0.length
            com.google.android.gms.ads.nativead.l[] r1 = new com.google.android.gms.ads.nativead.l[r1]
            r2 = 0
        L10:
            int r3 = r0.length
            if (r2 >= r3) goto L2c
            com.google.android.gms.ads.nativead.l r3 = new com.google.android.gms.ads.nativead.l
            r4 = r0[r2]
            r5 = 27
            r6 = 0
            r3.<init>(r5, r6)
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface> r5 = org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface.class
            java.lang.Object r4 = tg.b.o(r5, r4)
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r4 = (org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface) r4
            r3.f26356b = r4
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L2c:
            y3.b r0 = y3.AbstractC4557o.f48009d
            boolean r0 = r0.b()
            if (r0 == 0) goto L61
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface.class
            java.lang.reflect.InvocationHandler r9 = r9.getMessagePayload()
            java.lang.Object r9 = tg.b.o(r0, r9)
            org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface r9 = (org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface) r9
            int r0 = r9.getType()
            if (r0 == 0) goto L57
            r1 = 1
            if (r0 == r1) goto L4c
            r9 = 0
            r3 = r9
            goto L6b
        L4c:
            x3.e r0 = new x3.e
            byte[] r9 = r9.getAsArrayBuffer()
            r0.<init>(r9)
        L55:
            r3 = r0
            goto L6b
        L57:
            x3.e r0 = new x3.e
            java.lang.String r9 = r9.getAsString()
            r0.<init>(r9)
            goto L55
        L61:
            x3.e r0 = new x3.e
            java.lang.String r9 = r9.getData()
            r0.<init>(r9)
            goto L55
        L6b:
            if (r3 == 0) goto L8e
            java.lang.Class<org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface> r9 = org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.class
            java.lang.Object r9 = tg.b.o(r9, r12)
            org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r9 = (org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface) r9
            G8.c r12 = new G8.c
            r0 = 14
            r12.<init>(r9, r0)
            java.lang.Object r9 = r9.getOrCreatePeer(r12)
            r6 = r9
            y3.f r6 = (y3.C4548f) r6
            java.lang.Object r9 = r7.f48001b
            r1 = r9
            x3.i r1 = (x3.InterfaceC4466i) r1
            r2 = r8
            r4 = r10
            r5 = r11
            r1.onPostMessage(r2, r3, r4, r5, r6)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.C4552j.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override // P2.d, h6.InterfaceC2787f
    public int p() {
        return 1;
    }

    public void q(C4398a definition) {
        AbstractC3340k.e(definition, "definition");
        M6.z(((Pd.b) this.f48001b).a(definition));
    }

    public C4552j s(int i5) {
        if (i5 == 16) {
            i5 = 12;
        }
        ((AudioAttributes.Builder) this.f48001b).setUsage(i5);
        return this;
    }

    public /* bridge */ C4552j t(int i5) {
        return s(i5);
    }

    public String toString() {
        switch (this.f48000a) {
            case 22:
                return super.toString() + "{fragment=" + ((R4.j) this.f48001b) + "}";
            default:
                return super.toString();
        }
    }

    public void u(String str, String str2, Bundle bundle) {
        switch (this.f48000a) {
            case 3:
                boolean zIsEmpty = TextUtils.isEmpty(str);
                P0 p02 = (P0) this.f48001b;
                if (!zIsEmpty) {
                    ((C0273n0) p02.f421a).getClass();
                    throw new IllegalStateException("Unexpected call on client side");
                }
                ((C0273n0) p02.f421a).f985n.getClass();
                p02.w0("auto", "_err", bundle, true, true, System.currentTimeMillis());
                return;
            default:
                boolean zIsEmpty2 = TextUtils.isEmpty(str);
                L1 l12 = (L1) this.f48001b;
                if (!zIsEmpty2) {
                    l12.zzl().m0(new W0((Object) this, str, str2, (Object) bundle, 5));
                    return;
                }
                C0273n0 c0273n0 = l12.f577l;
                if (c0273n0 != null) {
                    N n10 = c0273n0.f981i;
                    C0273n0.d(n10);
                    n10.f605f.d("AppId not known when logging event", str2);
                }
                return;
        }
    }

    public boolean v() {
        C0273n0 c0273n0 = (C0273n0) this.f48001b;
        try {
            E0.a aVarA = C3773c.a(c0273n0.f973a);
            if (aVarA != null) {
                return aVarA.c(128, "com.android.vending").versionCode >= 80837300;
            }
            N n10 = c0273n0.f981i;
            C0273n0.d(n10);
            n10.f612n.c("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e7) {
            N n11 = c0273n0.f981i;
            C0273n0.d(n11);
            n11.f612n.d("Failed to retrieve Play Store version for Install Referrer", e7);
            return false;
        }
    }

    @Override // o2.h
    public void w(o2.j jVar, long j8, long j10, boolean z2) {
        ((X1.f) this.f48001b).v((o2.p) jVar, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzcmx
    public /* synthetic */ void zza(boolean z2, int i5, String str, String str2) {
        zzclb zzclbVar = ((F6.l) this.f48001b).f3973c;
        if (zzclbVar != null) {
            zzclbVar.zzI();
        }
    }

    public /* synthetic */ C4552j(Object obj, int i5) {
        this.f48000a = i5;
        this.f48001b = obj;
    }

    public C4552j(L1 l12) {
        this.f48000a = 2;
        this.f48001b = l12.f577l;
    }

    public C4552j(C0754c c0754c) {
        this.f48000a = 18;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c0754c.f8140a).setFlags(c0754c.f8141b).setUsage(c0754c.f8142c);
        int i5 = x.f9724a;
        if (i5 >= 29) {
            usage.setAllowedCapturePolicy(1);
        }
        if (i5 >= 32) {
            usage.setSpatializationBehavior(0);
        }
        this.f48001b = usage.build();
    }

    public C4552j(EditText editText) {
        this.f48000a = 1;
        this.f48001b = new S3.s(editText);
    }

    public C4552j(int i5) {
        this.f48000a = i5;
        switch (i5) {
            case 12:
                this.f48001b = new Pd.b();
                break;
            case 13:
                this.f48001b = new Y4.b(10);
                break;
            case 15:
                this.f48001b = new AudioAttributes.Builder();
                break;
            case 23:
                this.f48001b = new ArrayList();
                break;
            default:
                this.f48001b = new z(7);
                break;
        }
    }
}
