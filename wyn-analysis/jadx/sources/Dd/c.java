package Dd;

import A7.C0237b0;
import A7.L1;
import A7.P1;
import A7.T;
import Af.r;
import Cd.G;
import Cd.b0;
import E4.F;
import G6.C0549m;
import J8.AbstractC0640o;
import J8.C0627b;
import J8.C0641p;
import J8.H;
import J8.z;
import J9.C0656o;
import Jd.s;
import K8.C0693e;
import K8.C0695g;
import K8.U;
import N.AbstractC0714b;
import V5.k;
import W1.q;
import W9.t;
import a2.v;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.media.AudioRouting;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.Surface;
import c7.C1566b;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.android.gms.internal.p002firebaseauthapi.zzzh;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.moloco.sdk.internal.ortb.model.C1906u;
import com.moloco.sdk.internal.publisher.B;
import com.moloco.sdk.internal.publisher.C1934x;
import com.moloco.sdk.internal.publisher.C1935y;
import com.moloco.sdk.internal.publisher.C1936z;
import com.moloco.sdk.internal.services.E;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import ef.C2515C;
import ef.EnumC2526j;
import g4.InterfaceC2703d;
import h7.C2793a;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j1.C3075c;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k2.C3146c;
import k2.X;
import k4.j;
import ka.AbstractC3230e0;
import kc.x;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.I;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import l8.C3406H;
import l8.C3407I;
import l8.e0;
import lc.C3458b;
import m9.C;
import md.C3534b;
import md.C3542j;
import md.J;
import md.O;
import oc.C3665d;
import oc.RunnableC3663b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p7.AbstractC3772b;
import p9.n;
import q2.C3860d;
import s2.m;
import s2.o;
import s2.p;
import s2.w;
import tc.C4155a;
import tf.l;
import uc.C4281r;
import uc.InterfaceC4269f;
import uc.InterfaceC4279p;
import w9.C4386e;
import wd.C4402c;

/* loaded from: classes5.dex */
public final class c implements G, T, Continuation, o, He.b, k, InterfaceC4279p, OnCompleteListener, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g, InterfaceC2703d {

    /* renamed from: e, reason: collision with root package name */
    public static c f2640e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2641a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2642b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2643c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2644d;

    public /* synthetic */ c(int i5, Object obj, Object obj2, Object obj3, boolean z2) {
        this.f2641a = i5;
        this.f2642b = obj;
        this.f2643c = obj2;
        this.f2644d = obj3;
    }

    public static J L() {
        J j8 = new J();
        j8.f40581b = C3534b.f40612b;
        j8.f40582c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        return j8;
    }

    public static final Object p(c cVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.e eVar) {
        Fd.c cVar2 = new Fd.c();
        Fd.e.b(cVar2, str);
        b0.a(cVar2, new r(cVar, 21));
        cVar2.c(s.f6065b);
        return new S3.s(cVar2, (C4402c) cVar.f2644d).p(eVar);
    }

    public static final void y(c cVar, Network network, boolean z2) {
        C2515C c2515c;
        boolean z10;
        Network[] allNetworks = ((ConnectivityManager) cVar.f2642b).getAllNetworks();
        int length = allNetworks.length;
        boolean z11 = false;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            Network network2 = allNetworks[i5];
            if (AbstractC3340k.a(network2, network)) {
                z10 = z2;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) cVar.f2642b).getNetworkCapabilities(network2);
                z10 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z10) {
                z11 = true;
                break;
            }
            i5++;
        }
        j jVar = (j) cVar.f2643c;
        if (((X3.k) jVar.f39275b.get()) != null) {
            jVar.f39277d = z11;
            c2515c = C2515C.f34653a;
        } else {
            c2515c = null;
        }
        if (c2515c == null) {
            jVar.a();
        }
    }

    public void A() {
        Set hashSet;
        if (((B9.d) this.f2642b) == null || TextUtils.isEmpty((String) this.f2643c)) {
            return;
        }
        synchronized (((D9.g) this.f2644d).f2573b) {
            try {
                if (((D9.g) this.f2644d).f2573b.containsKey((String) this.f2643c)) {
                    hashSet = (Set) ((D9.g) this.f2644d).f2573b.get((String) this.f2643c);
                } else {
                    hashSet = new HashSet();
                    ((D9.g) this.f2644d).f2573b.put((String) this.f2643c, hashSet);
                }
                if (!hashSet.contains((B9.d) this.f2642b)) {
                    hashSet.add((B9.d) this.f2642b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void B() {
        HashMap map = (HashMap) this.f2644d;
        Iterator it = new ArrayList(map.values()).iterator();
        while (it.hasNext()) {
            ((eb.c) it.next()).H();
        }
        map.clear();
    }

    public synchronized void C() {
        if (!(((n) this.f2643c) != null)) {
            this.f2643c = (n) ((C) this.f2642b).apply((C4386e) this.f2644d);
        }
    }

    public void D(Intent intent, CountDownLatch countDownLatch) {
        if (((C3458b) this.f2644d) == null) {
            Log.i("FLTFireBGExecutor", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        Yc.c cVar = countDownLatch != null ? new Yc.c(countDownLatch) : null;
        byte[] byteArrayExtra = intent.getByteArrayExtra("notification");
        if (byteArrayExtra == null) {
            Log.e("FLTFireBGExecutor", "RemoteMessage byte array not found in Intent.");
            return;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            parcelObtain.setDataPosition(0);
            HashMap mapN = AbstractC3772b.N(t.CREATOR.createFromParcel(parcelObtain));
            C4281r c4281r = (C4281r) this.f2643c;
            Nc.d dVar = new Nc.d();
            dVar.put("userCallbackHandle", Long.valueOf(AbstractC3230e0.f39408h.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("user_callback_handle", 0L)));
            dVar.put(PglCryptUtils.KEY_MESSAGE, mapN);
            c4281r.a("MessagingBackground#onMessage", dVar, cVar);
        } finally {
            parcelObtain.recycle();
        }
    }

    public Object E() {
        long id2 = Thread.currentThread().getId();
        if (id2 == AbstractC0714b.f7744a) {
            return this.f2644d;
        }
        V.i iVar = (V.i) ((AtomicReference) this.f2642b).get();
        int iA = iVar.a(id2);
        if (iA >= 0) {
            return iVar.f12867c[iA];
        }
        return null;
    }

    public long F() {
        s2.j jVar = (s2.j) this.f2644d;
        if (jVar != null) {
            return jVar.f44898d;
        }
        return -1L;
    }

    public Object G() {
        C3542j c3542j = O.f40592c;
        int i5 = 0;
        while (true) {
            Object[][] objArr = (Object[][]) this.f2644d;
            if (i5 >= objArr.length) {
                return null;
            }
            if (c3542j.equals(objArr[i5][0])) {
                return objArr[i5][1];
            }
            i5++;
        }
    }

    public boolean H(KeyEvent keyEvent) {
        if (((HashSet) this.f2643c).remove(keyEvent)) {
            return false;
        }
        x[] xVarArr = (x[]) this.f2642b;
        if (xVarArr.length <= 0) {
            N(keyEvent);
            return true;
        }
        N7.e eVar = new N7.e(this, keyEvent);
        for (x xVar : xVarArr) {
            xVar.t(keyEvent, new F(eVar));
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x037c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x050f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023e  */
    /* JADX WARN: Type inference failed for: r0v106, types: [int] */
    /* JADX WARN: Type inference failed for: r0v135 */
    /* JADX WARN: Type inference failed for: r0v181 */
    /* JADX WARN: Type inference failed for: r0v182 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean I() throws org.json.JSONException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 1418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Dd.c.I():boolean");
    }

    public boolean J() throws IOException {
        String strTrim;
        if (((String) this.f2644d) == null) {
            ArrayDeque arrayDeque = (ArrayDeque) this.f2643c;
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.f2644d = str;
                return true;
            }
            do {
                String line = ((BufferedReader) this.f2642b).readLine();
                this.f2644d = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f2644d = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    public void K(S1.h hVar, Uri uri, Map map, long j8, long j10, X x5) throws j2.d {
        boolean z2;
        int i5 = 0;
        boolean z10 = true;
        s2.j jVar = new s2.j(hVar, j8, j10);
        this.f2644d = jVar;
        if (((m) this.f2643c) != null) {
            return;
        }
        m[] mVarArrA = ((p) this.f2642b).a(uri, map);
        int length = mVarArrA.length;
        C3407I c3407i = AbstractC3409K.f40056b;
        AbstractC3437s.d(length, "expectedSize");
        C3406H c3406h = new C3406H(length);
        if (mVarArrA.length == 1) {
            this.f2643c = mVarArrA[0];
        } else {
            int length2 = mVarArrA.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                m mVar = mVarArrA[i10];
                try {
                } catch (EOFException unused) {
                    z2 = ((m) this.f2643c) != null || jVar.f44898d == j8;
                } catch (Throwable th) {
                    if (((m) this.f2643c) == null && jVar.f44898d != j8) {
                        z10 = false;
                    }
                    Q1.k.g(z10);
                    jVar.f44900f = 0;
                    throw th;
                }
                if (mVar.i(jVar)) {
                    this.f2643c = mVar;
                    jVar.f44900f = 0;
                    break;
                } else {
                    c3406h.d(mVar.j());
                    z2 = ((m) this.f2643c) != null || jVar.f44898d == j8;
                    Q1.k.g(z2);
                    jVar.f44900f = 0;
                    i10++;
                }
            }
            if (((m) this.f2643c) == null) {
                String str = "None of the available extractors (" + new B8.e(", ").e(AbstractC3437s.v(AbstractC3409K.k(mVarArrA), new C3146c(i5))) + ") could read the stream.";
                uri.getClass();
                e0 e0VarG = c3406h.g();
                j2.d dVar = new j2.d(str, null, false, 1);
                AbstractC3409K.j(e0VarG);
                throw dVar;
            }
        }
        ((m) this.f2643c).g(x5);
    }

    public String M() {
        if (!J()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.f2644d;
        this.f2644d = null;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N(android.view.KeyEvent r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f2644d
            kc.r r0 = (kc.r) r0
            if (r0 == 0) goto Le4
            io.flutter.plugin.editing.i r1 = r0.k
            android.view.inputmethod.InputMethodManager r2 = r1.f37063b
            boolean r2 = r2.isAcceptingText()
            r3 = 0
            if (r2 == 0) goto Lc6
            android.view.inputmethod.InputConnection r1 = r1.f37071j
            if (r1 != 0) goto L17
            goto Lc6
        L17:
            boolean r2 = r1 instanceof io.flutter.plugin.editing.b
            if (r2 == 0) goto Lc2
            io.flutter.plugin.editing.b r1 = (io.flutter.plugin.editing.b) r1
            int r2 = r9.getAction()
            if (r2 != 0) goto Lc6
            int r2 = r9.getKeyCode()
            r4 = 21
            r5 = 1
            if (r2 != r4) goto L36
            boolean r2 = r9.isShiftPressed()
            boolean r3 = r1.d(r5, r2)
            goto Lc6
        L36:
            int r2 = r9.getKeyCode()
            r4 = 22
            if (r2 != r4) goto L48
            boolean r2 = r9.isShiftPressed()
            boolean r3 = r1.d(r3, r2)
            goto Lc6
        L48:
            int r2 = r9.getKeyCode()
            r4 = 19
            if (r2 != r4) goto L5a
            boolean r2 = r9.isShiftPressed()
            boolean r3 = r1.e(r5, r2)
            goto Lc6
        L5a:
            int r2 = r9.getKeyCode()
            r4 = 20
            if (r2 != r4) goto L6b
            boolean r2 = r9.isShiftPressed()
            boolean r3 = r1.e(r3, r2)
            goto Lc6
        L6b:
            int r2 = r9.getKeyCode()
            r4 = 66
            if (r2 == r4) goto L7b
            int r2 = r9.getKeyCode()
            r4 = 160(0xa0, float:2.24E-43)
            if (r2 != r4) goto L8d
        L7b:
            android.view.inputmethod.EditorInfo r2 = r1.f37029e
            int r4 = r2.inputType
            r6 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 & r6
            if (r4 != 0) goto L8d
            int r2 = r2.imeOptions
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1.performEditorAction(r2)
        L8b:
            r3 = r5
            goto Lc6
        L8d:
            io.flutter.plugin.editing.e r2 = r1.f37028d
            int r4 = android.text.Selection.getSelectionStart(r2)
            int r6 = android.text.Selection.getSelectionEnd(r2)
            int r7 = r9.getUnicodeChar()
            if (r4 < 0) goto Lc6
            if (r6 < 0) goto Lc6
            if (r7 != 0) goto La2
            goto Lc6
        La2:
            int r3 = java.lang.Math.min(r4, r6)
            int r4 = java.lang.Math.max(r4, r6)
            r1.beginBatchEdit()
            if (r3 == r4) goto Lb2
            r2.delete(r3, r4)
        Lb2:
            char r4 = (char) r7
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r2.insert(r3, r4)
            int r3 = r3 + r5
            r1.setSelection(r3, r3)
            r1.endBatchEdit()
            goto L8b
        Lc2:
            boolean r3 = r1.sendKeyEvent(r9)
        Lc6:
            if (r3 == 0) goto Lc9
            goto Le4
        Lc9:
            java.lang.Object r1 = r8.f2643c
            java.util.HashSet r1 = (java.util.HashSet) r1
            r1.add(r9)
            android.view.View r0 = r0.getRootView()
            r0.dispatchKeyEvent(r9)
            boolean r9 = r1.remove(r9)
            if (r9 == 0) goto Le4
            java.lang.String r9 = "KeyboardManager"
            java.lang.String r0 = "A redispatched key event was consumed before reaching KeyboardManager"
            android.util.Log.w(r9, r0)
        Le4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dd.c.N(android.view.KeyEvent):void");
    }

    public boolean O(Object obj) {
        if (obj instanceof Z4.b) {
            ((Z4.b) obj).c().f16986a = true;
        }
        ((Z4.c) this.f2643c).a(obj);
        return ((C3075c) this.f2644d).c(obj);
    }

    public void P(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.f2642b).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.f2644d) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void Q(Object obj) {
        long id2 = Thread.currentThread().getId();
        if (id2 == AbstractC0714b.f7744a) {
            this.f2644d = obj;
            return;
        }
        synchronized (this.f2643c) {
            V.i iVar = (V.i) ((AtomicReference) this.f2642b).get();
            int iA = iVar.a(id2);
            if (iA < 0) {
                ((AtomicReference) this.f2642b).set(iVar.b(id2, obj));
            } else {
                iVar.f12867c[iA] = obj;
            }
        }
    }

    public void R(final long j8, final v vVar) {
        if (((C3458b) this.f2644d) != null) {
            Log.e("FLTFireBGExecutor", "Background isolate already started.");
            return;
        }
        final C3665d c3665d = (C3665d) b7.k.z().f19396b;
        final Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() { // from class: Yc.a
            @Override // java.lang.Runnable
            public final void run() {
                Dd.c cVar = this.f16741a;
                cVar.getClass();
                Context context = AbstractC3230e0.f39408h;
                C3665d c3665d2 = c3665d;
                c3665d2.c(context);
                Context context2 = AbstractC3230e0.f39408h;
                b bVar = new b(cVar, c3665d2, vVar, j8);
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
                }
                if (((a2.k) c3665d2.f41475c) == null) {
                    throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
                }
                boolean z2 = c3665d2.f41474b;
                Handler handler2 = handler;
                if (z2) {
                    handler2.post(bVar);
                } else {
                    ((ExecutorService) c3665d2.f41478f).execute(new RunnableC3663b(c3665d2, context2, handler2, bVar, 0));
                }
            }
        });
    }

    public synchronized Task S() {
        Task taskD;
        C();
        taskD = ((n) this.f2643c).d();
        ((C4386e) this.f2644d).f47427a.f47413a.setCorePoolSize(0);
        return taskD;
    }

    public C0693e T(JSONObject jSONObject) throws JSONException {
        String string;
        String string2;
        boolean z2;
        String str;
        JSONArray jSONArray;
        int length;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        C0695g c0695gC;
        try {
            string = jSONObject.getString("cachedTokenState");
            string2 = jSONObject.getString("applicationName");
            z2 = jSONObject.getBoolean("anonymous");
            str = CommonGetHeaderBiddingToken.HB_TOKEN_VERSION;
            String string3 = jSONObject.getString("version");
            if (string3 != null) {
                str = string3;
            }
            jSONArray = jSONObject.getJSONArray("userInfos");
            length = jSONArray.length();
        } catch (zzzh e7) {
            e = e7;
            Log.wtf(((C2793a) this.f2644d).f36221a, e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e10) {
            e = e10;
            Log.wtf(((C2793a) this.f2644d).f36221a, e);
            return null;
        } catch (IllegalArgumentException e11) {
            e = e11;
            Log.wtf(((C2793a) this.f2644d).f36221a, e);
            return null;
        } catch (JSONException e12) {
            e = e12;
            Log.wtf(((C2793a) this.f2644d).f36221a, e);
            return null;
        }
        if (length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i5 = 0; i5 < length; i5++) {
            arrayList.add(U.V(jSONArray.getString(i5)));
        }
        C0693e c0693e = new C0693e(s8.g.f(string2), arrayList);
        if (!TextUtils.isEmpty(string)) {
            zzagl zzaglVarZzb = zzagl.zzb(string);
            AbstractC1732v.i(zzaglVarZzb);
            c0693e.f6627a = zzaglVarZzb;
        }
        if (!z2) {
            c0693e.f6634h = Boolean.FALSE;
        }
        c0693e.f6633g = str;
        if (jSONObject.has("userMetadata") && (c0695gC = C0695g.c(jSONObject.getJSONObject("userMetadata"))) != null) {
            c0693e.f6635i = c0695gC;
        }
        if (jSONObject.has("userMultiFactorInfo") && (jSONArray3 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < jSONArray3.length(); i10++) {
                JSONObject jSONObject2 = new JSONObject(jSONArray3.getString(i10));
                String strOptString = jSONObject2.optString("factorIdKey");
                arrayList2.add("phone".equals(strOptString) ? z.Y(jSONObject2) : Objects.equals(strOptString, "totp") ? J8.C.Y(jSONObject2) : null);
            }
            c0693e.Z(arrayList2);
        }
        if (jSONObject.has("passkeyInfo") && (jSONArray2 = jSONObject.getJSONArray("passkeyInfo")) != null) {
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                arrayList3.add(H.V(new JSONObject(jSONArray2.getString(i11))));
            }
            c0693e.f6638m = arrayList3;
        }
        return c0693e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public void a() {
        B b5 = (B) this.f2642b;
        Ef.H.D(b5.f28901j, null, new C1934x(b5, (com.moloco.sdk.internal.publisher.C) this.f2643c, (C1906u) this.f2644d, null), 3);
    }

    @Override // Cd.G
    public Object b(l lVar) {
        Object objInvoke = ((tf.a) this.f2642b).invoke();
        lVar.invoke(objInvoke);
        return new d((Nd.a) this.f2644d, objInvoke, (l) this.f2643c);
    }

    @Override // V5.k
    public void c(Bundle bundle) {
        ((MediaCodec) this.f2642b).setParameters(bundle);
    }

    @Override // V5.k
    public void d(int i5, int i10, long j8, int i11) throws MediaCodec.CryptoException {
        ((MediaCodec) this.f2642b).queueInputBuffer(i5, 0, i10, j8, i11);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public void e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
        AbstractC3340k.e(internalError, "internalError");
        B b5 = (B) this.f2642b;
        Ef.H.D(b5.f28901j, null, new C1935y(b5, (com.moloco.sdk.internal.publisher.C) this.f2643c, internalError, null), 3);
    }

    @Override // V5.k
    public MediaFormat f() {
        return ((MediaCodec) this.f2642b).getOutputFormat();
    }

    @Override // V5.k
    public void flush() {
        ((MediaCodec) this.f2642b).flush();
    }

    @Override // Cd.G
    public void g(Object obj, C4402c scope) {
        d plugin = (d) obj;
        AbstractC3340k.e(plugin, "plugin");
        AbstractC3340k.e(scope, "scope");
        b bVar = new b(plugin.f2645a, scope, plugin.f2646b);
        plugin.f2647c.invoke(bVar);
        plugin.f2648d = bVar.f2639d;
        Iterator it = bVar.f2638c.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            eVar.getClass();
            eVar.f2649a.a(scope, eVar.f2650b);
        }
    }

    @Override // Cd.G
    public Nd.a getKey() {
        return (Nd.a) this.f2644d;
    }

    @Override // V5.k
    public void h(int i5) {
        ((MediaCodec) this.f2642b).setVideoScalingMode(i5);
    }

    @Override // V5.k
    public ByteBuffer i(int i5) {
        return u6.v.f46721a >= 21 ? ((MediaCodec) this.f2642b).getInputBuffer(i5) : ((ByteBuffer[]) this.f2643c)[i5];
    }

    @Override // V5.k
    public void j(Surface surface) {
        ((MediaCodec) this.f2642b).setOutputSurface(surface);
    }

    @Override // g4.InterfaceC2703d
    public boolean k() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f2642b;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // s2.o, J5.m
    public void l() {
        ((o) this.f2642b).l();
    }

    @Override // s2.o
    /* renamed from: m */
    public s2.C mo0m(int i5, int i10) {
        o oVar = (o) this.f2642b;
        if (i10 != 3) {
            return oVar.mo0m(i5, i10);
        }
        SparseArray sparseArray = (SparseArray) this.f2644d;
        P2.m mVar = (P2.m) sparseArray.get(i5);
        if (mVar != null) {
            return mVar;
        }
        P2.m mVar2 = new P2.m(oVar.mo0m(i5, i10), (P2.j) this.f2643c);
        sparseArray.put(i5, mVar2);
        return mVar2;
    }

    @Override // V5.k
    public void n(int i5, long j8) {
        ((MediaCodec) this.f2642b).releaseOutputBuffer(i5, j8);
    }

    @Override // V5.k
    public int o() {
        return ((MediaCodec) this.f2642b).dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        C1566b c1566b = (C1566b) this.f2642b;
        String str = (String) this.f2643c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f2644d;
        synchronized (c1566b.f19674a) {
            c1566b.f19674a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // He.b
    public void onError(Throwable th) {
        He.b bVar = (He.b) this.f2642b;
        try {
            Le.c cVar = ((Qe.f) this.f2644d).f10002c;
            try {
                ((Je.c) this.f2643c).c(Me.b.f7635a);
                bVar.onComplete();
            } catch (NullPointerException e7) {
                throw e7;
            } catch (Throwable th2) {
                AbstractC3772b.U(th2);
                S3.f.A(th2);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                nullPointerException.initCause(th2);
                throw nullPointerException;
            }
        } catch (Throwable th3) {
            AbstractC3772b.U(th3);
            bVar.onError(new Ke.b(th3, th));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    @Override // uc.InterfaceC4279p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMethodCall(uc.C4278o r14, uc.InterfaceC4280q r15) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Dd.c.onMethodCall(uc.o, uc.q):void");
    }

    @Override // V5.k
    public int q(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = (MediaCodec) this.f2642b;
            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && u6.v.f46721a < 21) {
                this.f2644d = mediaCodec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // V5.k
    public ByteBuffer r(int i5) {
        return u6.v.f46721a >= 21 ? ((MediaCodec) this.f2642b).getOutputBuffer(i5) : ((ByteBuffer[]) this.f2644d)[i5];
    }

    @Override // V5.k
    public void release() {
        this.f2643c = null;
        this.f2644d = null;
        ((MediaCodec) this.f2642b).release();
    }

    @Override // s2.o
    public void s(w wVar) {
        ((o) this.f2642b).s(wVar);
    }

    @Override // g4.InterfaceC2703d
    public void shutdown() {
        ((ConnectivityManager) this.f2642b).unregisterNetworkCallback((Q3.h) this.f2644d);
    }

    @Override // A7.T
    public void t(String str, int i5, IOException iOException, byte[] bArr, Map map) {
        ((L1) this.f2644d).s((String) this.f2642b, i5, iOException, bArr, (P1) this.f2643c);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        C0641p c0641p = (C0641p) task.getResult();
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(s8.g.f(((C0693e) ((AbstractC0640o) this.f2644d)).f6629c));
        String str = c0641p.f5812a;
        AbstractC1732v.i(str);
        firebaseAuth.getClass();
        AbstractC1732v.f(str);
        String str2 = (String) this.f2642b;
        AbstractC1732v.f(str2);
        C0627b c0627b = (C0627b) this.f2643c;
        if (c0627b == null) {
            c0627b = new C0627b(new C0549m(1));
        }
        String str3 = firebaseAuth.f27291i;
        if (str3 != null) {
            c0627b.f5791h = str3;
        }
        return firebaseAuth.f27287e.zza(str, str2, c0627b);
    }

    public String toString() {
        switch (this.f2641a) {
            case 29:
                C0237b0 c0237b0S = Ba.c.S(this);
                c0237b0S.f((List) this.f2642b, "addrs");
                c0237b0S.f((C3534b) this.f2643c, "attrs");
                c0237b0S.f(Arrays.deepToString((Object[][]) this.f2644d), "customOptions");
                return c0237b0S.toString();
            default:
                return super.toString();
        }
    }

    @Override // V5.k
    public void u(int i5, H5.c cVar, long j8) throws MediaCodec.CryptoException {
        ((MediaCodec) this.f2642b).queueSecureInputBuffer(i5, 0, cVar.f4902i, j8, 0);
    }

    @Override // V5.k
    public void v(C3860d c3860d, Handler handler) {
        ((MediaCodec) this.f2642b).setOnFrameRenderedListener(new V5.a(this, c3860d, 1), handler);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public void w(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar) {
        B b5 = (B) this.f2642b;
        Ef.H.D(b5.f28901j, null, new C1936z(b5, (com.moloco.sdk.internal.publisher.C) this.f2643c, aVar, null), 3);
    }

    @Override // V5.k
    public void x(int i5, boolean z2) {
        ((MediaCodec) this.f2642b).releaseOutputBuffer(i5, z2);
    }

    public Object z() {
        Object objA = ((C3075c) this.f2644d).a();
        if (objA == null) {
            objA = ((Z4.a) this.f2642b).c();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objA.getClass());
            }
        }
        if (objA instanceof Z4.b) {
            ((Z4.b) objA).c().f16986a = false;
        }
        return objA;
    }

    public /* synthetic */ c(int i5, boolean z2) {
        this.f2641a = i5;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i5) {
        this.f2641a = i5;
        this.f2642b = obj2;
        this.f2643c = obj3;
        this.f2644d = obj;
    }

    @Override // He.b
    public void a(Je.b bVar) {
        ((Je.c) this.f2643c).c(bVar);
    }

    public c(E connectivityService, com.moloco.sdk.internal.error.b errorReportingService, C4402c httpClient) {
        this.f2641a = 21;
        AbstractC3340k.e(connectivityService, "connectivityService");
        AbstractC3340k.e(errorReportingService, "errorReportingService");
        AbstractC3340k.e(httpClient, "httpClient");
        this.f2642b = connectivityService;
        this.f2643c = errorReportingService;
        this.f2644d = httpClient;
    }

    @Override // He.b
    public void onComplete() {
        ((He.b) this.f2642b).onComplete();
    }

    public c(InterfaceC4269f interfaceC4269f, Context context) {
        this.f2641a = 23;
        this.f2644d = new HashMap();
        this.f2642b = context;
        this.f2643c = interfaceC4269f;
    }

    public c(int i5, TextPaint textPaint, CharSequence charSequence) {
        this.f2641a = 1;
        AbstractC3340k.e(charSequence, "charSequence");
        AbstractC3340k.e(textPaint, "textPaint");
        EnumC2526j enumC2526j = EnumC2526j.f34669c;
        this.f2642b = Fe.c.y(enumC2526j, new A0.c(i5, textPaint, charSequence));
        int i10 = 0;
        this.f2643c = Fe.c.y(enumC2526j, new A0.e(i10, charSequence, textPaint));
        this.f2644d = Fe.c.y(enumC2526j, new A0.d(this, charSequence, textPaint, i10));
    }

    public c(o oVar, P2.j jVar) {
        this.f2641a = 10;
        this.f2642b = oVar;
        this.f2643c = jVar;
        this.f2644d = new SparseArray();
    }

    public c(int i5) {
        this.f2641a = i5;
        switch (i5) {
            case 16:
                this.f2642b = new AtomicBoolean(false);
                break;
            case 22:
                d2.h hVar = d2.h.f33989a;
                this.f2642b = new HashSet();
                this.f2643c = hVar;
                break;
            default:
                this.f2642b = new AtomicReference(V.e.f12861b);
                this.f2643c = new Object();
                break;
        }
    }

    public c(FirebaseMessagingService firebaseMessagingService, W9.p pVar, ExecutorService executorService) {
        this.f2641a = 15;
        this.f2642b = executorService;
        this.f2643c = firebaseMessagingService;
        this.f2644d = pVar;
    }

    public c(p pVar) {
        this.f2641a = 26;
        this.f2642b = pVar;
    }

    public c(String str, tf.a createConfiguration, l lVar) {
        KType kTypeC;
        this.f2641a = 0;
        AbstractC3340k.e(createConfiguration, "createConfiguration");
        this.f2642b = createConfiguration;
        this.f2643c = lVar;
        I i5 = kotlin.jvm.internal.H.f39741a;
        KClass orCreateKotlinClass = i5.getOrCreateKotlinClass(d.class);
        try {
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            KTypeParameter kTypeParameterTypeParameter = i5.typeParameter(i5.getOrCreateKotlinClass(c.class), "PluginConfigT", KVariance.INVARIANT, false);
            i5.setUpperBounds(kTypeParameterTypeParameter, Collections.singletonList(kotlin.jvm.internal.H.b(Object.class)));
            kTypeC = kotlin.jvm.internal.H.c(d.class, companion.invariant(i5.typeOf(kTypeParameterTypeParameter, Collections.EMPTY_LIST, false)));
        } catch (Throwable unused) {
            kTypeC = null;
        }
        this.f2644d = new Nd.a(str, new Sd.a(orCreateKotlinClass, kTypeC));
    }

    public c(C c10) {
        this.f2641a = 28;
        this.f2642b = c10;
        this.f2644d = new C4386e();
    }

    public c(Context context, LocationManager locationManager) {
        this.f2641a = 25;
        this.f2644d = new j.E(0);
        this.f2642b = context;
        this.f2643c = locationManager;
    }

    public c(ConnectivityManager connectivityManager, j jVar) {
        this.f2641a = 24;
        this.f2642b = connectivityManager;
        this.f2643c = jVar;
        Q3.h hVar = new Q3.h(this, 2);
        this.f2644d = hVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), hVar);
    }

    public c(int i5, String str, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f2641a = 12;
        this.f2642b = str;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.f2643c = listUnmodifiableList;
        this.f2644d = bArr;
    }

    public c(MediaCodec mediaCodec) {
        this.f2641a = 13;
        this.f2642b = mediaCodec;
        if (u6.v.f46721a < 21) {
            this.f2643c = mediaCodec.getInputBuffers();
            this.f2644d = mediaCodec.getOutputBuffers();
        }
    }

    public c(D9.g gVar, com.bumptech.glide.g gVar2) {
        this.f2641a = 3;
        this.f2644d = gVar;
    }

    public c(kc.r rVar) {
        this.f2641a = 27;
        this.f2643c = new HashSet();
        this.f2644d = rVar;
        this.f2642b = new x[]{new kc.w(rVar.getBinaryMessenger()), new X2.j(new C4155a(rVar.getBinaryMessenger()))};
        new com.google.android.gms.ads.nativead.l(rVar.getBinaryMessenger()).f26356b = this;
    }

    public c(E4.o oVar, U4.d dVar, E4.s sVar) {
        this.f2641a = 4;
        this.f2644d = oVar;
        this.f2643c = dVar;
        this.f2642b = sVar;
    }

    public c(List list, C3534b c3534b, Object[][] objArr) {
        this.f2641a = 29;
        Fe.e.t(list, "addresses are not set");
        this.f2642b = list;
        Fe.e.t(c3534b, "attrs");
        this.f2643c = c3534b;
        Fe.e.t(objArr, "customOptions");
        this.f2644d = objArr;
    }

    public c(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f2641a = 18;
        this.f2643c = arrayDeque;
        this.f2642b = bufferedReader;
    }

    public c(AudioTrack audioTrack, C0656o c0656o) {
        this.f2641a = 14;
        this.f2642b = audioTrack;
        this.f2643c = c0656o;
        this.f2644d = new AudioRouting$OnRoutingChangedListener() { // from class: W1.q
            public final void onRoutingChanged(AudioRouting audioRouting) {
                Dd.c cVar = this.f15030a;
                if (((q) cVar.f2644d) == null || audioRouting.getRoutedDevice() == null) {
                    return;
                }
                ((C0656o) cVar.f2643c).h(audioRouting.getRoutedDevice());
            }
        };
        audioTrack.addOnRoutingChangedListener((q) this.f2644d, new Handler(Looper.myLooper()));
    }
}
