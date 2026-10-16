package ba;

import A.AbstractC0213f;
import A.d0;
import E5.C0441b;
import E5.Q;
import J9.C0665y;
import N.I;
import N6.w;
import Nc.d;
import R8.v;
import Va.X7;
import a2.C1323c;
import ad.L;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.WindowInsetsAnimation;
import android.view.inputmethod.InputMethodManager;
import android.webkit.ValueCallback;
import androidx.lifecycle.AbstractC1451o;
import b1.AbstractC1495d;
import b1.C1494c;
import ba.C1521a;
import cg.C1618g;
import cg.C1621j;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AbstractC2003l0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.s0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n;
import e0.InterfaceC2463o;
import g0.C2661b;
import g2.RunnableC2695p;
import g2.s;
import h4.C2775b;
import h4.h;
import h4.k;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import k2.c0;
import k4.AbstractC3188a;
import k4.j;
import ka.AbstractC3256n;
import ka.C1;
import ka.C3235g;
import kc.C3288A;
import kc.r;
import kotlin.jvm.internal.AbstractC3340k;
import m9.B;
import m9.C3508g;
import m9.C3514m;
import m9.EnumC3515n;
import m9.J;
import m9.g0;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.e;
import p7.AbstractC3772b;
import pd.f;
import qa.C3883a;
import qd.C3889d;
import rd.EnumC3966a;
import s2.C;
import s2.o;
import s8.q;
import s9.m;
import s9.p;
import sd.C4034a;
import t0.C4061i;
import tc.c;
import u0.w0;
import uc.C4276m;
import uc.C4281r;
import uc.C4287x;
import uc.InterfaceC4266c;
import uc.InterfaceC4277n;
import y1.C4522c;
import y1.C4528i;
import y1.C4534o;
import z1.C4608a;

/* renamed from: ba.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1521a implements g, n, o, InterfaceC4266c {

    /* renamed from: d, reason: collision with root package name */
    public static C1521a f19411d;

    /* renamed from: e, reason: collision with root package name */
    public static d f19412e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19413a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19414b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19415c;

    public /* synthetic */ C1521a(int i5, Object obj, Object obj2) {
        this.f19413a = i5;
        this.f19415c = obj;
        this.f19414b = obj2;
    }

    public static String K(C1618g c1618g) {
        long j8 = c1618g.f19902b;
        if (j8 <= 64) {
            return c1618g.D().e();
        }
        return c1618g.J((int) Math.min(j8, 64L)).e() + "...";
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0084 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(ba.C1521a r11, org.json.JSONArray r12) throws org.json.JSONException, java.lang.NoSuchFieldException {
        /*
            r11.getClass()
            r11 = 0
            r0 = r11
            r1 = r0
            r2 = r1
        L7:
            int r3 = r12.length()
            r4 = 2
            r5 = 4
            r6 = 1
            if (r0 >= r3) goto L6b
            java.lang.String r3 = r12.getString(r0)
            int[] r5 = A.AbstractC0213f.g(r5)
            int r7 = r5.length
            r8 = r11
        L1a:
            if (r8 >= r7) goto L5f
            r9 = r5[r8]
            r10 = 1
            if (r9 == r10) goto L35
            r10 = 2
            if (r9 == r10) goto L32
            r10 = 3
            if (r9 == r10) goto L2f
            r10 = 4
            if (r9 != r10) goto L2d
            java.lang.String r10 = "DeviceOrientation.landscapeRight"
            goto L37
        L2d:
            r11 = 0
            throw r11
        L2f:
            java.lang.String r10 = "DeviceOrientation.landscapeLeft"
            goto L37
        L32:
            java.lang.String r10 = "DeviceOrientation.portraitDown"
            goto L37
        L35:
            java.lang.String r10 = "DeviceOrientation.portraitUp"
        L37:
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L5c
            int r3 = A.AbstractC0213f.f(r9)
            if (r3 == 0) goto L54
            if (r3 == r6) goto L51
            if (r3 == r4) goto L4e
            r4 = 3
            if (r3 == r4) goto L4b
            goto L56
        L4b:
            r1 = r1 | 8
            goto L56
        L4e:
            r1 = r1 | 2
            goto L56
        L51:
            r1 = r1 | 4
            goto L56
        L54:
            r1 = r1 | 1
        L56:
            if (r2 != 0) goto L59
            r2 = r1
        L59:
            int r0 = r0 + 1
            goto L7
        L5c:
            int r8 = r8 + 1
            goto L1a
        L5f:
            java.lang.NoSuchFieldException r11 = new java.lang.NoSuchFieldException
            java.lang.String r12 = "No such DeviceOrientation: "
            java.lang.String r12 = R8.v.f(r12, r3)
            r11.<init>(r12)
            throw r11
        L6b:
            if (r1 == 0) goto L88
            r12 = 8
            switch(r1) {
                case 2: goto L87;
                case 3: goto L7d;
                case 4: goto L85;
                case 5: goto L7a;
                case 6: goto L7d;
                case 7: goto L7d;
                case 8: goto L84;
                case 9: goto L7d;
                case 10: goto L77;
                case 11: goto L76;
                case 12: goto L7d;
                case 13: goto L7d;
                case 14: goto L7d;
                case 15: goto L73;
                default: goto L72;
            }
        L72:
            goto L83
        L73:
            r11 = 13
            return r11
        L76:
            return r4
        L77:
            r11 = 11
            return r11
        L7a:
            r11 = 12
            return r11
        L7d:
            if (r2 == r4) goto L87
            if (r2 == r5) goto L85
            if (r2 == r12) goto L84
        L83:
            return r6
        L84:
            return r12
        L85:
            r11 = 9
        L87:
            return r11
        L88:
            r11 = -1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C1521a.d(ba.a, org.json.JSONArray):int");
    }

    public static ArrayList f(C1521a c1521a, JSONArray jSONArray) throws JSONException, NoSuchFieldException {
        c1521a.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            String string = jSONArray.getString(i5);
            for (c cVar : c.values()) {
                if (cVar.f45979a.equals(string)) {
                    int iOrdinal = cVar.ordinal();
                    if (iOrdinal == 0) {
                        arrayList.add(c.TOP_OVERLAYS);
                    } else if (iOrdinal == 1) {
                        arrayList.add(c.BOTTOM_OVERLAYS);
                    }
                }
            }
            throw new NoSuchFieldException(v.f("No such SystemUiOverlay: ", string));
        }
        return arrayList;
    }

    public static int g(C1521a c1521a, String str) {
        String str2;
        c1521a.getClass();
        for (int i5 : AbstractC0213f.g(4)) {
            if (i5 == 1) {
                str2 = "SystemUiMode.leanBack";
            } else if (i5 == 2) {
                str2 = "SystemUiMode.immersive";
            } else if (i5 == 3) {
                str2 = "SystemUiMode.immersiveSticky";
            } else {
                if (i5 != 4) {
                    throw null;
                }
                str2 = "SystemUiMode.edgeToEdge";
            }
            if (str2.equals(str)) {
                int iF = AbstractC0213f.f(i5);
                if (iF == 0) {
                    return 1;
                }
                if (iF != 1) {
                    return iF != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException(v.f("No such SystemUiMode: ", str));
    }

    public static L8.a h(C1521a c1521a, JSONObject jSONObject) {
        c1521a.getClass();
        return new L8.a(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? f.d(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, jSONObject.isNull("systemNavigationBarIconBrightness") ? 0 : f.d(jSONObject.getString("systemNavigationBarIconBrightness")), !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public static String k(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public static boolean p(Editable editable, KeyEvent keyEvent, boolean z2) {
        C4534o[] c4534oArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c4534oArr = (C4534o[]) editable.getSpans(selectionStart, selectionEnd, C4534o.class)) != null && c4534oArr.length > 0) {
                for (C4534o c4534o : c4534oArr) {
                    int spanStart = editable.getSpanStart(c4534o);
                    int spanEnd = editable.getSpanEnd(c4534o);
                    if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static h4.d r(h hVar, Throwable th) {
        if (th instanceof k) {
            hVar.f36111u.getClass();
            C2775b c2775b = k4.d.f39263a;
            hVar.f36111u.getClass();
        } else {
            hVar.f36111u.getClass();
            C2775b c2775b2 = k4.d.f39263a;
        }
        return new h4.d(null, hVar, th);
    }

    public boolean A() {
        return ((Logger) this.f19414b).isLoggable((Level) this.f19415c);
    }

    public void B(int i5, int i10, C1618g c1618g, int i11, boolean z2) {
        if (A()) {
            ((Logger) this.f19414b).log((Level) this.f19415c, f.q(i5) + " DATA: streamId=" + i10 + " endStream=" + z2 + " length=" + i11 + " bytes=" + K(c1618g));
        }
    }

    public void C(int i5, int i10, EnumC3966a enumC3966a, C1621j c1621j) {
        if (A()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f.q(i5));
            sb2.append(" GO_AWAY: lastStreamId=");
            sb2.append(i10);
            sb2.append(" errorCode=");
            sb2.append(enumC3966a);
            sb2.append(" length=");
            sb2.append(c1621j.d());
            sb2.append(" bytes=");
            C1618g c1618g = new C1618g();
            c1618g.Q(c1621j);
            sb2.append(K(c1618g));
            ((Logger) this.f19414b).log((Level) this.f19415c, sb2.toString());
        }
    }

    public void D(int i5, long j8) {
        if (A()) {
            ((Logger) this.f19414b).log((Level) this.f19415c, f.q(i5) + " PING: ack=false bytes=" + j8);
        }
    }

    public void E(int i5, int i10, EnumC3966a enumC3966a) {
        if (A()) {
            ((Logger) this.f19414b).log((Level) this.f19415c, f.q(i5) + " RST_STREAM: streamId=" + i10 + " errorCode=" + enumC3966a);
        }
    }

    public void F(int i5, I i10) {
        if (A()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f.q(i5));
            sb2.append(" SETTINGS: ack=false settings=");
            EnumMap enumMap = new EnumMap(pd.n.class);
            for (pd.n nVar : pd.n.values()) {
                if (i10.a(nVar.f43582a)) {
                    enumMap.put((EnumMap) nVar, (pd.n) Integer.valueOf(i10.f7706b[nVar.f43582a]));
                }
            }
            sb2.append(enumMap.toString());
            ((Logger) this.f19414b).log((Level) this.f19415c, sb2.toString());
        }
    }

    public void G(int i5, int i10, long j8) {
        if (A()) {
            ((Logger) this.f19414b).log((Level) this.f19415c, f.q(i5) + " WINDOW_UPDATE: streamId=" + i10 + " windowSizeIncrement=" + j8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h4.l H(h4.h r17, i4.C2849f r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r4 = r18
            ff.v r2 = r1.f36096e
            r2.getClass()
            android.graphics.Bitmap$Config r2 = r1.f36095d
            int r3 = android.os.Build.VERSION.SDK_INT
            r5 = 26
            if (r3 < r5) goto L1e
            android.graphics.Bitmap$Config r3 = com.google.android.gms.internal.ads.AbstractC1749m.p()
            if (r2 != r3) goto L1e
            boolean r2 = r1.f36101j
            if (r2 != 0) goto L1e
            goto L2c
        L1e:
            java.lang.Object r2 = r0.f19415c
            xg.g r2 = (xg.g) r2
            boolean r2 = r2.j(r4)
            if (r2 == 0) goto L2c
            android.graphics.Bitmap$Config r2 = r1.f36095d
        L2a:
            r3 = r2
            goto L2f
        L2c:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            goto L2a
        L2f:
            java.lang.Object r2 = r0.f19414b
            k4.j r2 = (k4.j) r2
            boolean r2 = r2.f39277d
            if (r2 == 0) goto L3b
            int r2 = r1.f36115y
        L39:
            r14 = r2
            goto L3d
        L3b:
            r2 = 4
            goto L39
        L3d:
            boolean r2 = r1.k
            if (r2 == 0) goto L4d
            ff.v r2 = r1.f36096e
            r2.getClass()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ALPHA_8
            if (r3 == r2) goto L4d
            r2 = 1
        L4b:
            r7 = r2
            goto L4f
        L4d:
            r2 = 0
            goto L4b
        L4f:
            p7.b r2 = r4.f36786a
            i4.b r5 = i4.C2845b.f36783e
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L66
            p7.b r2 = r4.f36787b
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L62
            goto L66
        L62:
            int r2 = r1.f36116z
        L64:
            r5 = r2
            goto L68
        L66:
            r2 = 2
            goto L64
        L68:
            h4.l r2 = new h4.l
            r6 = r2
            android.content.Context r2 = r1.f36092a
            r8 = r6
            boolean r6 = k4.d.a(r1)
            r9 = r8
            boolean r8 = r1.f36102l
            r10 = r9
            okhttp3.Headers r9 = r1.f36098g
            r11 = r10
            h4.p r10 = r1.f36099h
            r12 = r11
            h4.n r11 = r1.f36109s
            r13 = r12
            int r12 = r1.f36113w
            int r1 = r1.f36114x
            r15 = r13
            r13 = r1
            r1 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r13 = r1
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C1521a.H(h4.h, i4.f):h4.l");
    }

    public MotionEvent I(C3288A c3288a) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long j8;
        while (true) {
            priorityQueue = (PriorityQueue) this.f19415c;
            boolean zIsEmpty = priorityQueue.isEmpty();
            longSparseArray = (LongSparseArray) this.f19414b;
            j8 = c3288a.f39450a;
            if (zIsEmpty || ((Long) priorityQueue.peek()).longValue() >= j8) {
                break;
            }
            longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j8) {
            priorityQueue.poll();
        }
        MotionEvent motionEvent = (MotionEvent) longSparseArray.get(j8);
        longSparseArray.remove(j8);
        return motionEvent;
    }

    public void J(long j8) {
        ((C2661b) this.f19415c).f35483a.f35482d = j8;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public void a() {
        g gVar = (g) this.f19414b;
        if (gVar != null) {
            gVar.a();
        }
    }

    public void b(final boolean z2) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateBridgeImpl", "viewVisible: " + z2 + " called, invoking setIsViewable in WebView", null, false, 12, null);
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("template_bridge_view_visible_invoked");
        hVar.a("viewable", String.valueOf(z2));
        i iVar = (i) this.f19414b;
        hVar.a("attached", String.valueOf(iVar.isAttachedToWindow()));
        ((com.moloco.sdk.acm.recorder.c) this.f19415c).a(hVar);
        iVar.evaluateJavascript("setIsViewable(" + z2 + ')', new ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                C1521a c1521a = this.f30597a;
                com.moloco.sdk.acm.recorder.c cVar = (com.moloco.sdk.acm.recorder.c) c1521a.f19415c;
                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
                com.moloco.sdk.acm.h hVar2 = new com.moloco.sdk.acm.h("template_bridge_view_visible_completed");
                hVar2.a("viewable", String.valueOf(z2));
                hVar2.a("attached", String.valueOf(((i) c1521a.f19414b).isAttachedToWindow()));
                cVar.a(hVar2);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateBridgeImpl", v.f("setIsViewable call completed, result: ", (String) obj), null, false, 12, null);
            }
        });
    }

    @Override // uc.InterfaceC4266c
    public void c(Object obj) {
        ((mc.g) this.f19414b).a(((InterfaceC4277n) ((X7) ((w0) this.f19415c).f46406b).f13843c).a(obj));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public void destroy() {
        ((AbstractC1451o) this.f19414b).c((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.k) this.f19415c);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public void e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
        AbstractC3340k.e(internalError, "internalError");
        ((g) this.f19414b).e(internalError);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(long r13, java.util.List r15) {
        /*
            r12 = this;
            java.lang.String r0 = "pointerInputFilters"
            kotlin.jvm.internal.AbstractC3340k.e(r15, r0)
            java.lang.Object r0 = r12.f19415c
            a2.v r0 = (a2.v) r0
            int r1 = r15.size()
            r2 = 1
            r3 = 0
            r5 = r2
            r4 = r3
        L11:
            if (r4 >= r1) goto L71
            java.lang.Object r6 = r15.get(r4)
            p0.n r6 = (p0.n) r6
            if (r5 == 0) goto L57
            java.lang.Object r7 = r0.f17322b
            P.d r7 = (P.d) r7
            int r8 = r7.f8972c
            if (r8 <= 0) goto L38
            java.lang.Object[] r7 = r7.f8970a
            r9 = r3
        L26:
            r10 = r7[r9]
            r11 = r10
            p0.e r11 = (p0.e) r11
            p0.n r11 = r11.f43125c
            boolean r11 = kotlin.jvm.internal.AbstractC3340k.a(r11, r6)
            if (r11 == 0) goto L34
            goto L39
        L34:
            int r9 = r9 + 1
            if (r9 < r8) goto L26
        L38:
            r10 = 0
        L39:
            p0.e r10 = (p0.e) r10
            if (r10 == 0) goto L56
            r10.f43131i = r2
            p0.j r0 = new p0.j
            r0.<init>(r13)
            P.d r6 = r10.f43126d
            boolean r0 = r6.f(r0)
            if (r0 != 0) goto L54
            p0.j r0 = new p0.j
            r0.<init>(r13)
            r6.b(r0)
        L54:
            r0 = r10
            goto L6e
        L56:
            r5 = r3
        L57:
            p0.e r7 = new p0.e
            r7.<init>(r6)
            p0.j r6 = new p0.j
            r6.<init>(r13)
            P.d r8 = r7.f43126d
            r8.b(r6)
            java.lang.Object r0 = r0.f17322b
            P.d r0 = (P.d) r0
            r0.b(r7)
            r0 = r7
        L6e:
            int r4 = r4 + 1
            goto L11
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.C1521a.i(long, java.util.List):void");
    }

    public void j() {
        ((w) this.f19414b).f8558b = true;
        ((ScheduledFuture) this.f19415c).cancel(false);
    }

    @Override // s2.o, J5.m
    public void l() {
        s sVar = (s) this.f19415c;
        sVar.f35660b.post(new RunnableC2695p(sVar, 0));
    }

    @Override // s2.o
    /* renamed from: m */
    public C mo0m(int i5, int i10) {
        return (c0) this.f19414b;
    }

    public HashMap n(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((String) entry.getKey(), o((C1) entry.getValue()));
        }
        return map2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Object o(C1 c12) {
        C1 c1B;
        switch (p.l(c12)) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(c12.n());
            case 2:
                return AbstractC0213f.b(c12.v(), 3) ? Long.valueOf(c12.r()) : Double.valueOf(c12.getDoubleValue());
            case 3:
                Timestamp timestampU = c12.u();
                return new q(timestampU.getSeconds(), timestampU.getNanos());
            case 4:
                int iOrdinal = ((EnumC3515n) this.f19415c).ordinal();
                if (iOrdinal == 1) {
                    Timestamp timestampA = s9.n.a(c12);
                    return new q(timestampA.getSeconds(), timestampA.getNanos());
                }
                if (iOrdinal == 2 && (c1B = s9.n.b(c12)) != null) {
                    return o(c1B);
                }
                return null;
            case 5:
                return c12.getStringValue();
            case 6:
                ByteString byteStringO = c12.o();
                Fe.c.l(byteStringO, "Provided ByteString must not be null.");
                return new C3508g(byteStringO);
            case 7:
                m mVarL = m.l(c12.t());
                A6.c.z(mVarL.f45369a.size() > 3 && mVarL.g(0).equals("projects") && mVarL.g(2).equals("databases"), "Tried to parse an invalid resource name: %s", mVarL);
                String strG = mVarL.g(1);
                String strG2 = mVarL.g(3);
                s9.f fVar = new s9.f(strG, strG2);
                s9.h hVarC = s9.h.c(c12.t());
                FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f19414b;
                s9.f fVar2 = firebaseFirestore.f27324c;
                if (!fVar.equals(fVar2)) {
                    Ba.c.p("DocumentSnapshot", "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead.", 2, hVarC.f45375a, strG, strG2, fVar2.f45370a, fVar2.f45371b);
                }
                return new C3514m(hVarC, firebaseFirestore);
            case 8:
                return new J(c12.q().e(), c12.q().f());
            case 9:
                C3235g c3235gM = c12.m();
                ArrayList arrayList = new ArrayList(c3235gM.getValuesCount());
                Iterator it = c3235gM.getValuesList().iterator();
                while (it.hasNext()) {
                    arrayList.add(o((C1) it.next()));
                }
                return arrayList;
            case 10:
                List valuesList = ((C1) c12.s().getFieldsMap().get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR)).m().getValuesList();
                double[] dArr = new double[valuesList.size()];
                for (int i5 = 0; i5 < valuesList.size(); i5++) {
                    dArr[i5] = ((C1) valuesList.get(i5)).getDoubleValue();
                }
                return new g0(dArr);
            case 11:
                return n(c12.s().getFieldsMap());
            default:
                A6.c.s("Unknown value type: ".concat(AbstractC3256n.t(c12.v())), new Object[0]);
                throw null;
        }
    }

    public boolean q(C0441b c0441b, boolean z2) {
        boolean z10;
        boolean z11;
        a2.v vVar = (a2.v) this.f19415c;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0441b.f3291c;
        C4061i parentCoordinates = (C4061i) this.f19414b;
        if (vVar.n(linkedHashMap, parentCoordinates, c0441b, z2)) {
            AbstractC3340k.e(parentCoordinates, "parentCoordinates");
            P.d dVar = (P.d) vVar.f17322b;
            int i5 = dVar.f8972c;
            if (i5 > 0) {
                Object[] objArr = dVar.f8970a;
                int i10 = 0;
                z10 = false;
                do {
                    z10 = ((e) objArr[i10]).G(linkedHashMap, parentCoordinates, c0441b, z2) || z10;
                    i10++;
                } while (i10 < i5);
            } else {
                z10 = false;
            }
            int i11 = dVar.f8972c;
            if (i11 > 0) {
                Object[] objArr2 = dVar.f8970a;
                int i12 = 0;
                z11 = false;
                do {
                    z11 = ((e) objArr2[i12]).D(c0441b) || z11;
                    i12++;
                } while (i12 < i11);
            } else {
                z11 = false;
            }
            vVar.o(c0441b);
            if (z11 || z10) {
                return true;
            }
        }
        return false;
    }

    public na.m t(C3883a c3883a) throws NoSuchMethodException, SecurityException {
        String str;
        na.m c0665y;
        int i5 = 3;
        int i10 = 4;
        final int i11 = 1;
        final int i12 = 0;
        final Type type = c3883a.f44184b;
        Map map = (Map) this.f19414b;
        if (map.get(type) != null) {
            throw new ClassCastException();
        }
        Class cls = c3883a.f44183a;
        if (map.get(cls) != null) {
            throw new ClassCastException();
        }
        B b5 = null;
        na.m mVar = EnumSet.class.isAssignableFrom(cls) ? new na.m() { // from class: na.e
            @Override // na.m
            public final Object d() {
                switch (i12) {
                    case 0:
                        Type type2 = type;
                        if (!(type2 instanceof ParameterizedType)) {
                            throw new la.p("Invalid EnumSet type: " + type2.toString(), 13);
                        }
                        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                        if (type3 instanceof Class) {
                            return EnumSet.noneOf((Class) type3);
                        }
                        throw new la.p("Invalid EnumSet type: " + type2.toString(), 13);
                    default:
                        Type type4 = type;
                        if (!(type4 instanceof ParameterizedType)) {
                            throw new la.p("Invalid EnumMap type: " + type4.toString(), 13);
                        }
                        Type type5 = ((ParameterizedType) type4).getActualTypeArguments()[0];
                        if (type5 instanceof Class) {
                            return new EnumMap((Class) type5);
                        }
                        throw new la.p("Invalid EnumMap type: " + type4.toString(), 13);
                }
            }
        } : cls == EnumMap.class ? new na.m() { // from class: na.e
            @Override // na.m
            public final Object d() {
                switch (i11) {
                    case 0:
                        Type type2 = type;
                        if (!(type2 instanceof ParameterizedType)) {
                            throw new la.p("Invalid EnumSet type: " + type2.toString(), 13);
                        }
                        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                        if (type3 instanceof Class) {
                            return EnumSet.noneOf((Class) type3);
                        }
                        throw new la.p("Invalid EnumSet type: " + type2.toString(), 13);
                    default:
                        Type type4 = type;
                        if (!(type4 instanceof ParameterizedType)) {
                            throw new la.p("Invalid EnumMap type: " + type4.toString(), 13);
                        }
                        Type type5 = ((ParameterizedType) type4).getActualTypeArguments()[0];
                        if (type5 instanceof Class) {
                            return new EnumMap((Class) type5);
                        }
                        throw new la.p("Invalid EnumMap type: " + type4.toString(), 13);
                }
            }
        } : null;
        if (mVar != null) {
            return mVar;
        }
        na.d.f((List) this.f19415c);
        if (Modifier.isAbstract(cls.getModifiers())) {
            c0665y = null;
        } else {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                AbstractC3772b abstractC3772b = pa.c.f43447a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e7) {
                    str = "Failed making constructor '" + pa.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e7.getMessage() + pa.c.e(e7);
                }
                c0665y = str != null ? new C0665y(str, i10) : new com.unity3d.services.core.webview.b(declaredConstructor, 25);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (c0665y != null) {
            return c0665y;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            b5 = SortedSet.class.isAssignableFrom(cls) ? new B(i10) : Set.class.isAssignableFrom(cls) ? new B(5) : Queue.class.isAssignableFrom(cls) ? new B(6) : new B(7);
        } else if (Map.class.isAssignableFrom(cls)) {
            b5 = ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new B(8) : ConcurrentMap.class.isAssignableFrom(cls) ? new B(9) : SortedMap.class.isAssignableFrom(cls) ? new B(10) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new C3883a(((ParameterizedType) type).getActualTypeArguments()[0]).f44183a)) ? new B(i5) : new B(11);
        }
        if (b5 != null) {
            return b5;
        }
        String strK = k(cls);
        return strK != null ? new C0665y(strK, i5) : new com.unity3d.services.core.webview.b(cls, 26);
    }

    public String toString() {
        switch (this.f19413a) {
            case 12:
                return "Bounds{lower=" + ((C1494c) this.f19414b) + " upper=" + ((C1494c) this.f19415c) + "}";
            case 16:
                return ((Map) this.f19414b).toString();
            case 23:
                return "Request{url=" + ((C4034a) this.f19414b) + '}';
            default:
                return super.toString();
        }
    }

    public da.d u(aa.e eVar) throws JSONException, Z9.e {
        String string;
        JSONArray jSONArray = eVar.f17428g;
        long j8 = eVar.f17427f;
        HashSet hashSet = new HashSet();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i5);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2));
                }
                String strOptString = jSONArray2.optString(0, "");
                aa.e eVarC = ((aa.c) this.f19414b).c();
                String string3 = null;
                if (eVarC == null) {
                    string = null;
                } else {
                    try {
                        string = eVarC.f17423b.getString(strOptString);
                    } catch (JSONException unused) {
                    }
                }
                if (string == null) {
                    aa.e eVarC2 = ((aa.c) this.f19415c).c();
                    if (eVarC2 != null) {
                        try {
                            string3 = eVarC2.f17423b.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : "";
                }
                int i10 = da.e.f34201a;
                da.b bVar = new da.b();
                if (string2 == null) {
                    throw new NullPointerException("Null rolloutId");
                }
                bVar.f34189a = string2;
                String string4 = jSONObject.getString("variantId");
                if (string4 == null) {
                    throw new NullPointerException("Null variantId");
                }
                bVar.f34190b = string4;
                if (strOptString == null) {
                    throw new NullPointerException("Null parameterKey");
                }
                bVar.f34191c = strOptString;
                bVar.f34192d = string;
                bVar.f34193e = j8;
                bVar.f34194f = (byte) (bVar.f34194f | 1);
                hashSet.add(bVar.a());
            } catch (JSONException e7) {
                throw new Z9.e("Exception parsing rollouts metadata to create RolloutsState.", e7);
            }
        }
        return new da.d(hashSet);
    }

    public InterfaceC2463o v() {
        return ((C2661b) this.f19415c).f35483a.f35481c;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public void w(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar) {
        l lVar = ((s0) this.f19415c).f30508g;
        int i5 = lVar == null ? -1 : AbstractC2003l0.f30226a[lVar.ordinal()];
        g gVar = (g) this.f19414b;
        switch (i5) {
            case -1:
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "AggregatedFullscreenAd", "creativeType is null", null, false, 12, null);
                return;
            case 0:
            default:
                throw new Q((byte) 0, 9);
            case 1:
                gVar.w(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f30091d);
                return;
            case 2:
                gVar.w(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f30092e);
                return;
            case 3:
                gVar.w(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f30093f);
                return;
            case 4:
            case 5:
            case 6:
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "AggregatedFullscreenAd", "Template creative types should not be used with AggregatedFullscreenAd. Use TemplateFullscreenAd instead.", null, false, 12, null);
                return;
            case 7:
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "AggregatedFullscreenAd", "Failed to resolve creative type for the ad. Please check the ad markup and ensure it follows the expected format.", null, false, 12, null);
                return;
        }
    }

    public s2.m x(Object... objArr) {
        Constructor constructorF;
        synchronized (((AtomicBoolean) this.f19415c)) {
            if (!((AtomicBoolean) this.f19415c).get()) {
                try {
                    constructorF = ((B) this.f19414b).f();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f19415c).set(true);
                } catch (Exception e7) {
                    throw new RuntimeException("Error instantiating extension", e7);
                }
            }
            constructorF = null;
        }
        if (constructorF == null) {
            return null;
        }
        try {
            return (s2.m) constructorF.newInstance(objArr);
        } catch (Exception e10) {
            throw new IllegalStateException("Unexpected error creating extractor", e10);
        }
    }

    public long y() {
        return ((C2661b) this.f19415c).f35483a.f35482d;
    }

    public boolean z(CharSequence charSequence, int i5, int i10, C4528i c4528i) {
        if (c4528i.f47936c == 0) {
            C4522c c4522c = (C4522c) this.f19415c;
            C4608a c4608aB = c4528i.b();
            int iA = c4608aB.a(8);
            if (iA != 0) {
                ((ByteBuffer) c4608aB.f35893d).getShort(iA + c4608aB.f35890a);
            }
            c4522c.getClass();
            ThreadLocal threadLocal = C4522c.f47918b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i5 < i10) {
                sb2.append(charSequence.charAt(i5));
                i5++;
            }
            TextPaint textPaint = c4522c.f47919a;
            String string = sb2.toString();
            int i11 = AbstractC1495d.f19125a;
            c4528i.f47936c = textPaint.hasGlyph(string) ? 2 : 1;
        }
        return c4528i.f47936c == 2;
    }

    public /* synthetic */ C1521a(Object obj, Object obj2, Object obj3, int i5) {
        this.f19413a = i5;
        this.f19414b = obj;
        this.f19415c = obj3;
    }

    public /* synthetic */ C1521a(Object obj, boolean z2, Object obj2, int i5) {
        this.f19413a = i5;
        this.f19414b = obj;
        this.f19415c = obj2;
    }

    public C1521a(Context context) {
        this.f19413a = 3;
        AbstractC3340k.e(context, "context");
        this.f19414b = context;
        this.f19415c = Fe.c.z(new Af.q(this, 5));
    }

    public C1521a(AbstractC1451o lifecycle, S8.d dVar, S8.d dVar2) {
        this.f19413a = 7;
        AbstractC3340k.e(lifecycle, "lifecycle");
        this.f19414b = lifecycle;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.k kVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.k(0, dVar, dVar2);
        this.f19415c = kVar;
        lifecycle.a(kVar);
    }

    public C1521a(X3.k kVar, j jVar) {
        Object gVar;
        this.f19413a = 10;
        this.f19414b = jVar;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 26) {
            boolean z2 = AbstractC3188a.f39257a;
        } else {
            if (!AbstractC3188a.f39257a) {
                if (i5 != 26 && i5 != 27) {
                    gVar = new k4.g(true);
                } else {
                    gVar = new k4.h();
                }
            }
            this.f19415c = gVar;
        }
        gVar = new k4.g(false);
        this.f19415c = gVar;
    }

    public C1521a(r rVar, C1323c c1323c) {
        this.f19413a = 27;
        this.f19414b = rVar;
        this.f19415c = c1323c;
        c1323c.f17156b = new wc.a(this);
    }

    public C1521a(X2.j jVar) {
        this.f19413a = 23;
        this.f19414b = (C4034a) jVar.f16075b;
        d0 d0Var = (d0) jVar.f16076c;
        d0Var.getClass();
        this.f19415c = new C3889d(d0Var);
    }

    public C1521a(r rVar, InputMethodManager inputMethodManager, a2.v vVar) {
        this.f19413a = 11;
        if (Build.VERSION.SDK_INT >= 33) {
            rVar.setAutoHandwritingEnabled(false);
        }
        this.f19415c = rVar;
        this.f19414b = inputMethodManager;
        vVar.f17322b = this;
    }

    @Override // s2.o
    public void s(s2.w wVar) {
    }

    public C1521a(C4061i rootCoordinates) {
        this.f19413a = 18;
        AbstractC3340k.e(rootCoordinates, "rootCoordinates");
        this.f19414b = rootCoordinates;
        this.f19415c = new a2.v(18);
    }

    public C1521a(int i5) {
        this.f19413a = i5;
        switch (i5) {
            case 2:
                d7.e eVar = d7.e.f34127d;
                this.f19414b = new SparseIntArray();
                this.f19415c = eVar;
                break;
            case 13:
                this.f19414b = new LongSparseArray();
                this.f19415c = new PriorityQueue();
                break;
            case 19:
                Level level = Level.FINE;
                Logger logger = Logger.getLogger(pd.m.class.getName());
                Fe.e.t(level, AppLovinEventTypes.USER_COMPLETED_LEVEL);
                this.f19415c = level;
                Fe.e.t(logger, "logger");
                this.f19414b = logger;
                break;
        }
    }

    public C1521a(C2661b c2661b) {
        this.f19413a = 8;
        this.f19415c = c2661b;
        this.f19414b = new L(this, 5);
    }

    public C1521a(mc.b bVar, PackageManager packageManager) {
        this.f19413a = 25;
        C1323c c1323c = new C1323c(this, 29);
        this.f19414b = packageManager;
        new C4281r(bVar, "flutter/processtext", C4287x.f46768b, null).b(c1323c);
    }

    public C1521a(mc.b bVar) {
        this.f19413a = 24;
        com.google.android.gms.ads.nativead.l lVar = new com.google.android.gms.ads.nativead.l(this, 23);
        C4281r c4281r = new C4281r(bVar, "flutter/platform", C4276m.f46758a, null);
        this.f19414b = c4281r;
        c4281r.b(lVar);
    }

    public C1521a(w wVar, ScheduledFuture scheduledFuture) {
        this.f19413a = 15;
        this.f19414b = wVar;
        Fe.e.t(scheduledFuture, "future");
        this.f19415c = scheduledFuture;
    }

    public C1521a(WindowInsetsAnimation.Bounds bounds) {
        this.f19413a = 12;
        this.f19414b = C1494c.c(bounds.getLowerBound());
        this.f19415c = C1494c.c(bounds.getUpperBound());
    }

    public C1521a(B b5) {
        this.f19413a = 22;
        this.f19414b = b5;
        this.f19415c = new AtomicBoolean(false);
    }
}
