package Y2;

import A7.C0237b0;
import A7.C0295v;
import N1.C0764m;
import N1.C0765n;
import N1.D;
import Va.M6;
import a9.C1341a;
import a9.InterfaceC1343c;
import ac.C1346a;
import ad.L;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.ViewGroup;
import androidx.recyclerview.widget.t0;
import c7.C1571g;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.moloco.sdk.acm.eventprocessing.DBRequestWorker;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.C1913b;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2138x;
import com.unity3d.services.UnityAdsConstants;
import d2.C2386a;
import ef.C2527k;
import ef.EnumC2526j;
import f2.InterfaceC2551a;
import ff.AbstractC2640A;
import g2.C2673C;
import g2.C2676F;
import g2.C2682c;
import g2.C2693n;
import g2.C2694o;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k1.H;
import k1.S;
import k1.X;
import k2.c0;
import k8.C3194c;
import k8.C3196e;
import k8.C3205n;
import kotlin.jvm.internal.AbstractC3340k;
import l8.AbstractC3403E;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import l8.e0;
import md.C3533a;
import md.C3534b;
import md.J;
import o.AbstractC3620a;
import o.C3625f;
import org.json.JSONObject;
import p.MenuC3746A;
import r9.C3946c;
import r9.InterfaceC3944a;
import s2.AbstractC3991a;
import s2.C;
import t0.C4039D;
import t0.C4051P;
import t0.C4056d;
import uc.C4278o;
import uc.C4281r;
import uc.C4287x;
import uc.InterfaceC4266c;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;
import x.C4429v;

/* loaded from: classes.dex */
public final class B implements SuccessContinuation, InterfaceC1343c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q, d2.i, o2.o, InterfaceC3944a, InterfaceC4279p, InterfaceC4266c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16382a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16383b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16384c;

    public /* synthetic */ B(int i5, char c10) {
        this.f16382a = i5;
    }

    public static B r(char c10) {
        return new B(16, new a2.v(new C3194c(c10), 14), C3196e.f39296b);
    }

    @Override // r9.InterfaceC3944a
    public o9.j A(String str) {
        return (o9.j) ((HashMap) this.f16384c).get(str);
    }

    public boolean B(t0.t node) {
        AbstractC3340k.e(node, "node");
        if (node.r()) {
            return ((C4051P) this.f16384c).remove(node);
        }
        throw new IllegalStateException("Check failed.");
    }

    public c9.d C(int i5) {
        C0295v c0295vB = ((c9.d) this.f16384c).b(new C3946c(s9.h.b(), i5));
        c9.d dVarA = s9.h.f45374c;
        while (((Iterator) c0295vB.f1081b).hasNext()) {
            C3946c c3946c = (C3946c) c0295vB.next();
            if (c3946c.f44607b != i5) {
                break;
            }
            dVarA = dVarA.a(c3946c.f44606a);
            this.f16383b = ((c9.d) this.f16383b).c(c3946c);
            this.f16384c = ((c9.d) this.f16384c).c(c3946c);
        }
        return dVarA;
    }

    public void D(C3533a c3533a, Object obj) {
        if (((IdentityHashMap) this.f16384c) == null) {
            this.f16384c = new IdentityHashMap(1);
        }
        ((IdentityHashMap) this.f16384c).put(c3533a, obj);
    }

    public List E(CharSequence charSequence) {
        charSequence.getClass();
        C3205n c3205n = new C3205n((a2.v) this.f16384c, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (c3205n.hasNext()) {
            arrayList.add((String) c3205n.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public C F(int i5) {
        int i10 = 0;
        while (true) {
            int[] iArr = (int[]) this.f16383b;
            if (i10 >= iArr.length) {
                Q1.k.k("BaseMediaChunkOutput", "Unmatched track of type: " + i5);
                return new s2.l();
            }
            if (i5 == iArr[i10]) {
                return ((c0[]) this.f16384c)[i10];
            }
            i10++;
        }
    }

    @Override // r9.InterfaceC3944a
    public void M(o9.j jVar) {
        ((HashMap) this.f16384c).put(jVar.f41458a, jVar);
    }

    @Override // r9.InterfaceC3944a
    public void Q(o9.e eVar) {
        ((HashMap) this.f16383b).put(eVar.f41439a, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z0 r21, java.lang.String r22, lf.AbstractC3464c r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.B.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z0, java.lang.String, lf.c):java.lang.Object");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public void b() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q qVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q) this.f16383b;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override // uc.InterfaceC4266c
    public void c(Object obj) {
        J j8 = (J) this.f16384c;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) j8.f40580a;
        tc.h hVar = (tc.h) this.f16383b;
        concurrentLinkedQueue.remove(hVar);
        if (((ConcurrentLinkedQueue) j8.f40580a).isEmpty()) {
            return;
        }
        Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(hVar.f46011a));
    }

    public void d(MolocoAd molocoAd, String str) {
        AbstractC3340k.e(molocoAd, "molocoAd");
        ((C1913b) this.f16383b).b(molocoAd, str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public void e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
        AbstractC3340k.e(internalShowError, "internalShowError");
        ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q) this.f16383b).e(internalShowError);
        ((C2138x) this.f16384c).destroy();
    }

    @Override // a9.InterfaceC1343c
    public StackTraceElement[] f(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        InterfaceC1343c[] interfaceC1343cArr = (InterfaceC1343c[]) this.f16383b;
        StackTraceElement[] stackTraceElementArrF = stackTraceElementArr;
        for (int i5 = 0; i5 < 1; i5++) {
            InterfaceC1343c interfaceC1343c = interfaceC1343cArr[i5];
            if (stackTraceElementArrF.length <= 1024) {
                break;
            }
            stackTraceElementArrF = interfaceC1343c.f(stackTraceElementArr);
        }
        return stackTraceElementArrF.length > 1024 ? ((C1341a) this.f16384c).f(stackTraceElementArrF) : stackTraceElementArrF;
    }

    public void g(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.f16383b).add(M6.t(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    public void h(t0.t node) {
        AbstractC3340k.e(node, "node");
        if (!node.r()) {
            throw new IllegalStateException("Check failed.");
        }
        ((C4051P) this.f16384c).add(node);
    }

    public C3534b i() {
        if (((IdentityHashMap) this.f16384c) != null) {
            for (Map.Entry entry : ((C3534b) this.f16383b).f40613a.entrySet()) {
                if (!((IdentityHashMap) this.f16384c).containsKey(entry.getKey())) {
                    ((IdentityHashMap) this.f16384c).put((C3533a) entry.getKey(), entry.getValue());
                }
            }
            this.f16383b = new C3534b((IdentityHashMap) this.f16384c);
            this.f16384c = null;
        }
        return (C3534b) this.f16383b;
    }

    public void j() {
        int[] iArr = (int[]) this.f16383b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f16384c = null;
    }

    public void k(long j8, Q1.o oVar) {
        if (oVar.a() < 9) {
            return;
        }
        int iH = oVar.h();
        int iH2 = oVar.h();
        int iU = oVar.u();
        if (iH == 434 && iH2 == 1195456820 && iU == 3) {
            AbstractC3991a.g(j8, oVar, (C[]) this.f16384c);
        }
    }

    public boolean l(s9.h hVar) {
        C0295v c0295vB = ((c9.d) this.f16383b).b(new C3946c(hVar, 0));
        if (((Iterator) c0295vB.f1081b).hasNext()) {
            return ((C3946c) c0295vB.next()).f44606a.equals(hVar);
        }
        return false;
    }

    @Override // d2.i
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C2386a b(C6.l lVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = ((d2.m) lVar.f1844a).f33992a;
        C2386a c2386a = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                C2386a c2386a2 = new C2386a(mediaCodecCreateByCodecName, (HandlerThread) ((V5.b) this.f16383b).get(), new d2.d(mediaCodecCreateByCodecName, (HandlerThread) ((V5.b) this.f16384c).get()), (Dd.c) lVar.f1849f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) lVar.f1847d;
                    C2386a.a(c2386a2, (MediaFormat) lVar.f1845b, surface, (MediaCrypto) lVar.f1848e, (surface == null && ((d2.m) lVar.f1844a).f33999h && Q1.x.f9724a >= 35) ? 8 : 0);
                    return c2386a2;
                } catch (Exception e7) {
                    e = e7;
                    c2386a = c2386a2;
                    if (c2386a != null) {
                        c2386a.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            mediaCodecCreateByCodecName = null;
        }
    }

    public void n(s2.o oVar, T5.B b5) {
        int i5 = 0;
        while (true) {
            C[] cArr = (C[]) this.f16384c;
            if (i5 >= cArr.length) {
                return;
            }
            b5.a();
            b5.b();
            C cMo0m = oVar.mo0m(b5.f11473e, 3);
            C0765n c0765n = (C0765n) ((List) this.f16383b).get(i5);
            String str = c0765n.f8232n;
            Q1.k.b("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            C0764m c0764m = new C0764m();
            b5.b();
            c0764m.f8183a = b5.f11474f;
            c0764m.f8194m = N1.C.m(str);
            c0764m.f8187e = c0765n.f8224e;
            c0764m.f8186d = c0765n.f8223d;
            c0764m.f8178G = c0765n.f8215H;
            c0764m.f8197p = c0765n.f8235q;
            M6.y(c0764m, cMo0m);
            cArr[i5] = cMo0m;
            i5++;
        }
    }

    public void o(int i5) {
        int[] iArr = (int[]) this.f16383b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i5, 10) + 1];
            this.f16383b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i5 >= iArr.length) {
            int length = iArr.length;
            while (length <= i5) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f16383b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f16383b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    @Override // uc.InterfaceC4279p
    public void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        com.google.android.gms.ads.nativead.l lVar = (com.google.android.gms.ads.nativead.l) this.f16384c;
        if (((Dd.c) lVar.f26356b) == null) {
            ((tc.g) interfaceC4280q).a((Map) this.f16383b);
            return;
        }
        String str = c4278o.f46759a;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            ((tc.g) interfaceC4280q).c();
            return;
        }
        try {
            this.f16383b = DesugarCollections.unmodifiableMap(((kc.w) ((kc.x[]) ((Dd.c) lVar.f26356b).f2642b)[0]).f39551b);
        } catch (IllegalStateException e7) {
            ((tc.g) interfaceC4280q).b("error", e7.getMessage(), null);
        }
        ((tc.g) interfaceC4280q).a((Map) this.f16383b);
    }

    public void p(int i5, int i10) {
        int[] iArr = (int[]) this.f16383b;
        if (iArr == null || i5 >= iArr.length) {
            return;
        }
        int i11 = i5 + i10;
        o(i11);
        int[] iArr2 = (int[]) this.f16383b;
        System.arraycopy(iArr2, i5, iArr2, i11, (iArr2.length - i5) - i10);
        Arrays.fill((int[]) this.f16383b, i5, i11, -1);
        ArrayList arrayList = (ArrayList) this.f16384c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            t0 t0Var = (t0) ((ArrayList) this.f16384c).get(size);
            int i12 = t0Var.f18986a;
            if (i12 >= i5) {
                t0Var.f18986a = i12 + i10;
            }
        }
    }

    public void q(int i5, int i10) {
        int[] iArr = (int[]) this.f16383b;
        if (iArr == null || i5 >= iArr.length) {
            return;
        }
        int i11 = i5 + i10;
        o(i11);
        int[] iArr2 = (int[]) this.f16383b;
        System.arraycopy(iArr2, i11, iArr2, i5, (iArr2.length - i5) - i10);
        int[] iArr3 = (int[]) this.f16383b;
        Arrays.fill(iArr3, iArr3.length - i10, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f16384c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            t0 t0Var = (t0) ((ArrayList) this.f16384c).get(size);
            int i12 = t0Var.f18986a;
            if (i12 >= i5) {
                if (i12 < i11) {
                    ((ArrayList) this.f16384c).remove(size);
                } else {
                    t0Var.f18986a = i12 - i10;
                }
            }
        }
    }

    public void s(MolocoAd molocoAd) {
        AbstractC3340k.e(molocoAd, "molocoAd");
        ((C1913b) this.f16383b).d(molocoAd);
    }

    @Override // o2.o
    public Object t(Uri uri, S1.j jVar) {
        InterfaceC2551a interfaceC2551a = (InterfaceC2551a) ((o2.o) this.f16384c).t(uri, jVar);
        List list = (List) this.f16383b;
        return (list == null || list.isEmpty()) ? interfaceC2551a : (InterfaceC2551a) interfaceC2551a.a(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v1, types: [xa.d] */
    /* JADX WARN: Type inference failed for: r3v0, types: [long] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Closeable] */
    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) throws Throwable {
        FileWriter fileWriter;
        ?? r10 = (JSONObject) ((S8.f) this.f16383b).f11036c.f11029a.submit(new G8.c(this, 6)).get();
        Closeable closeable = null;
        if (r10 != 0) {
            K3.r rVar = (K3.r) this.f16384c;
            Z8.a aVarB = ((xa.d) rVar.f6513c).B(r10);
            ?? r32 = aVarB.f17034c;
            Y9.c cVar = (Y9.c) rVar.f6515e;
            cVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                try {
                    try {
                        r10.put("expires_at", r32);
                        try {
                            fileWriter = new FileWriter((File) cVar.f16739b);
                        } catch (Exception e7) {
                            e = e7;
                            fileWriter = null;
                            Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                            r32 = fileWriter;
                            R8.g.b(r32, "Failed to close settings writer.");
                            K3.r.d("Loaded settings: ", r10);
                            String str = ((Z8.c) rVar.f6512b).f17043f;
                            SharedPreferences.Editor editorEdit = ((Context) rVar.f6511a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                            editorEdit.putString("existing_instance_identifier", str);
                            editorEdit.apply();
                            ((AtomicReference) rVar.f6518h).set(aVarB);
                            ((TaskCompletionSource) ((AtomicReference) rVar.f6519i).get()).trySetResult(aVarB);
                            return Tasks.forResult(null);
                        }
                    } catch (Throwable th) {
                        th = th;
                        R8.g.b(closeable, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                }
                try {
                    fileWriter.write(r10.toString());
                    fileWriter.flush();
                    r32 = fileWriter;
                } catch (Exception e11) {
                    e = e11;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    r32 = fileWriter;
                    R8.g.b(r32, "Failed to close settings writer.");
                    K3.r.d("Loaded settings: ", r10);
                    String str2 = ((Z8.c) rVar.f6512b).f17043f;
                    SharedPreferences.Editor editorEdit2 = ((Context) rVar.f6511a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    editorEdit2.putString("existing_instance_identifier", str2);
                    editorEdit2.apply();
                    ((AtomicReference) rVar.f6518h).set(aVarB);
                    ((TaskCompletionSource) ((AtomicReference) rVar.f6519i).get()).trySetResult(aVarB);
                    return Tasks.forResult(null);
                }
                R8.g.b(r32, "Failed to close settings writer.");
                K3.r.d("Loaded settings: ", r10);
                String str22 = ((Z8.c) rVar.f6512b).f17043f;
                SharedPreferences.Editor editorEdit22 = ((Context) rVar.f6511a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                editorEdit22.putString("existing_instance_identifier", str22);
                editorEdit22.apply();
                ((AtomicReference) rVar.f6518h).set(aVarB);
                ((TaskCompletionSource) ((AtomicReference) rVar.f6519i).get()).trySetResult(aVarB);
            } catch (Throwable th2) {
                th = th2;
                closeable = r32;
                R8.g.b(closeable, "Failed to close settings writer.");
                throw th;
            }
        }
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f16382a) {
            case 5:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f16384c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f16383b;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    sb2.append((String) arrayList.get(i5));
                    if (i5 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            case 26:
                String string = ((C4051P) this.f16384c).toString();
                AbstractC3340k.d(string, "set.toString()");
                return string;
            default:
                return super.toString();
        }
    }

    @Override // r9.InterfaceC3944a
    public o9.e u(String str) {
        return (o9.e) ((HashMap) this.f16383b).get(str);
    }

    public void v(X2.j jVar) {
        C2682c c2682c;
        C2673C c2673cA = C2673C.f35515c;
        String str = (String) ((C2676F) jVar.f16076c).f35533a.get("range");
        C2693n c2693n = (C2693n) this.f16384c;
        if (str != null) {
            try {
                c2673cA = C2673C.a(str);
            } catch (D e7) {
                c2693n.f35628a.N("SDP format error.", e7);
                return;
            }
        }
        Uri uri = c2693n.f35635h;
        AbstractC3437s.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i5 = 0;
        int i10 = 0;
        while (true) {
            e0 e0Var = ((C2676F) jVar.f16076c).f35534b;
            if (i5 < e0Var.f40103d) {
                c2682c = (C2682c) e0Var.get(i5);
                String strP = A6.h.P(c2682c.f35576j.f35564b);
                strP.getClass();
                switch (strP) {
                    case "MPEG4-GENERIC":
                    case "L8":
                    case "AC3":
                    case "AMR":
                    case "L16":
                    case "VP8":
                    case "VP9":
                    case "H264":
                    case "H265":
                    case "OPUS":
                    case "PCMA":
                    case "PCMU":
                    case "MP4A-LATM":
                    case "AMR-WB":
                    case "MP4V-ES":
                    case "H263-1998":
                    case "H263-2000":
                        g2.w wVar = new g2.w((C2694o) jVar.f16075b, c2682c, uri);
                        int i11 = i10 + 1;
                        int iF = AbstractC3403E.f(objArrCopyOf.length, i11);
                        if (iF > objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF);
                        }
                        objArrCopyOf[i10] = wVar;
                        i10 = i11;
                        break;
                }
                i5++;
            } else {
                e0 e0VarH = AbstractC3409K.h(i10, objArrCopyOf);
                boolean zIsEmpty = e0VarH.isEmpty();
                C1346a c1346a = c2693n.f35628a;
                if (zIsEmpty) {
                    c1346a.N("No playable track.", null);
                    return;
                }
                c1346a.getClass();
                int i12 = 0;
                while (true) {
                    int i13 = e0VarH.f40103d;
                    g2.s sVar = (g2.s) c1346a.f17489b;
                    if (i12 >= i13) {
                        com.google.android.gms.ads.nativead.l lVar = sVar.f35665g;
                        long j8 = c2673cA.f35517a;
                        long j10 = c2673cA.f35518b;
                        long jK = Q1.x.K(j10 - j8);
                        g2.v vVar = (g2.v) lVar.f26356b;
                        vVar.f35684l = jK;
                        vVar.f35685m = !(j10 == -9223372036854775807L);
                        vVar.f35686n = j10 == -9223372036854775807L;
                        vVar.f35687o = false;
                        vVar.t();
                        c2693n.f35642p = true;
                        return;
                    }
                    g2.r rVar = new g2.r(sVar, (g2.w) e0VarH.get(i12), i12, sVar.f35666h);
                    sVar.f35663e.add(rVar);
                    rVar.f35654b.f(rVar.f35653a.f35650b, sVar.f35661c, 0);
                    i12++;
                }
            }
        }
    }

    public void w(AbstractC3620a abstractC3620a) {
        S3.i iVar = (S3.i) this.f16383b;
        ((ActionMode.Callback) iVar.f10961a).onDestroyActionMode(iVar.b(abstractC3620a));
        j.w wVar = (j.w) this.f16384c;
        if (wVar.f38549w != null) {
            wVar.f38538l.getDecorView().removeCallbacks(wVar.f38550x);
        }
        if (wVar.f38548v != null) {
            X x5 = wVar.f38551y;
            if (x5 != null) {
                x5.b();
            }
            X xA = S.a(wVar.f38548v);
            xA.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            wVar.f38551y = xA;
            xA.d(new j.n(this, 2));
        }
        wVar.f38547u = null;
        ViewGroup viewGroup = wVar.f38505A;
        WeakHashMap weakHashMap = S.f38779a;
        H.c(viewGroup);
        wVar.J();
    }

    public void x() {
        C2693n c2693n = (C2693n) this.f16384c;
        Q1.k.g(c2693n.f35641o == 2);
        c2693n.f35641o = 1;
        c2693n.f35644r = false;
        long j8 = c2693n.f35645s;
        if (j8 != -9223372036854775807L) {
            c2693n.i(Q1.x.W(j8));
        }
    }

    public boolean y(AbstractC3620a abstractC3620a, p.k kVar) {
        ViewGroup viewGroup = ((j.w) this.f16384c).f38505A;
        WeakHashMap weakHashMap = S.f38779a;
        H.c(viewGroup);
        S3.i iVar = (S3.i) this.f16383b;
        C3625f c3625fB = iVar.b(abstractC3620a);
        C4429v c4429v = (C4429v) iVar.f10964d;
        Menu menuC3746A = (Menu) c4429v.get(kVar);
        if (menuC3746A == null) {
            menuC3746A = new MenuC3746A((Context) iVar.f10962b, kVar);
            c4429v.put(kVar, menuC3746A);
        }
        return ((ActionMode.Callback) iVar.f10961a).onPrepareActionMode(c3625fB, menuC3746A);
    }

    public c9.d z(int i5) {
        C0295v c0295vB = ((c9.d) this.f16384c).b(new C3946c(s9.h.b(), i5));
        c9.d dVarA = s9.h.f45374c;
        while (((Iterator) c0295vB.f1081b).hasNext()) {
            C3946c c3946c = (C3946c) c0295vB.next();
            if (c3946c.f44607b != i5) {
                break;
            }
            dVarA = dVarA.a(c3946c.f44606a);
        }
        return dVarA;
    }

    public /* synthetic */ B(int i5, Object obj, Object obj2) {
        this.f16382a = i5;
        this.f16384c = obj;
        this.f16383b = obj2;
    }

    public /* synthetic */ B(Object obj, boolean z2, Object obj2, int i5) {
        this.f16382a = i5;
        this.f16383b = obj;
        this.f16384c = obj2;
    }

    public B(IBinder iBinder) throws RemoteException {
        this.f16382a = 4;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f16383b = new Messenger(iBinder);
            this.f16384c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f16384c = new C1571g(iBinder);
            this.f16383b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public B(com.moloco.sdk.acm.n nVar, Context context) {
        this.f16382a = 6;
        AbstractC3340k.e(context, "context");
        this.f16383b = nVar;
        this.f16384c = context;
    }

    public B(com.moloco.sdk.acm.recorder.c metricsRecorder) {
        this.f16382a = 7;
        AbstractC3340k.e(metricsRecorder, "metricsRecorder");
        this.f16383b = metricsRecorder;
        this.f16384c = new AtomicBoolean(false);
    }

    public B(BannerAdShowListener bannerAdShowListener, com.moloco.sdk.internal.services.u appLifecycleTrackerService, com.moloco.sdk.internal.services.events.c customUserEventBuilderService, com.moloco.sdk.internal.publisher.J j8, com.moloco.sdk.internal.publisher.J j10, AdFormatType adType, com.moloco.sdk.acm.recorder.c metricsRecorder, com.moloco.sdk.internal.publisher.J j11) {
        this.f16382a = 8;
        AbstractC3340k.e(appLifecycleTrackerService, "appLifecycleTrackerService");
        AbstractC3340k.e(customUserEventBuilderService, "customUserEventBuilderService");
        AbstractC3340k.e(adType, "adType");
        AbstractC3340k.e(metricsRecorder, "metricsRecorder");
        this.f16383b = tg.b.a(bannerAdShowListener, appLifecycleTrackerService, customUserEventBuilderService, j8, j10, adType, metricsRecorder, j11, 608);
        this.f16384c = bannerAdShowListener;
    }

    public /* synthetic */ B(Object obj) {
        this.f16382a = 5;
        this.f16384c = obj;
        this.f16383b = new ArrayList();
    }

    public B(String clickThroughUrl, List clickTrackingUrls) {
        this.f16382a = 11;
        AbstractC3340k.e(clickThroughUrl, "clickThroughUrl");
        AbstractC3340k.e(clickTrackingUrls, "clickTrackingUrls");
        this.f16384c = clickThroughUrl;
        this.f16383b = clickTrackingUrls;
    }

    public B(ArrayList pointers, MotionEvent motionEvent) {
        this.f16382a = 21;
        AbstractC3340k.e(pointers, "pointers");
        AbstractC3340k.e(motionEvent, "motionEvent");
        this.f16383b = pointers;
        this.f16384c = motionEvent;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Map] */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public void a() {
        Set setX0;
        J3.h hVarA;
        switch (this.f16382a) {
            case 6:
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (Build.VERSION.SDK_INT >= 24) {
                    setX0 = ff.o.X0(linkedHashSet);
                } else {
                    setX0 = ff.x.f35434a;
                }
                J3.d dVar = new J3.d(2, false, false, false, false, -1L, -1L, setX0);
                com.moloco.sdk.acm.n nVar = (com.moloco.sdk.acm.n) this.f16383b;
                C2527k c2527k = new C2527k("url", nVar.f28456b);
                ?? r22 = nVar.f28458d;
                Map mapR = AbstractC2640A.R(c2527k, new C2527k("AppKey", r22.get("AppKey")), new C2527k("AppBundle", r22.get("AppBundle")), new C2527k("AppVersion", r22.get("AppVersion")), new C2527k("OS", r22.get("OS")), new C2527k("osv", r22.get("osv")), new C2527k("SdkVersion", r22.get("SdkVersion")), new C2527k("Mediator", r22.get("Mediator")));
                try {
                    ArrayList arrayList = new ArrayList(mapR.size());
                    for (Map.Entry entry : mapR.entrySet()) {
                        arrayList.add(new C2527k(entry.getKey(), entry.getValue()));
                    }
                    C2527k[] c2527kArr = (C2527k[]) arrayList.toArray(new C2527k[0]);
                    C2527k[] c2527kArr2 = (C2527k[]) Arrays.copyOf(c2527kArr, c2527kArr.length);
                    J3.g gVar = new J3.g(0);
                    for (C2527k c2527k2 : c2527kArr2) {
                        gVar.i(c2527k2.f34672b, (String) c2527k2.f34671a);
                    }
                    hVarA = gVar.a();
                } catch (Exception e7) {
                    Log.e("DBPeriodicRequest", e7.getMessage() + ". Data: " + mapR);
                    hVarA = null;
                }
                if (hVarA != null) {
                    C0237b0 c0237b0 = new C0237b0(DBRequestWorker.class);
                    S3.p pVar = (S3.p) c0237b0.f814d;
                    pVar.f10986j = dVar;
                    pVar.f10981e = hVarA;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    c0237b0.r(1);
                    K3.q.c((Context) this.f16384c).a(c0237b0.i());
                    break;
                }
                break;
            default:
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateFullscreenAd", "Skip button shown, triggering listener callback", null, false, 12, null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q qVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q) this.f16383b;
                if (qVar != null) {
                    qVar.a();
                    break;
                }
                break;
        }
    }

    public B(byte b5, int i5) {
        this.f16382a = i5;
        switch (i5) {
            case 24:
                List list = Collections.EMPTY_LIST;
                this.f16383b = new c9.d(list, C3946c.f44604c);
                this.f16384c = new c9.d(list, C3946c.f44605d);
                break;
            case 25:
            default:
                this.f16383b = new HashMap();
                this.f16384c = new HashMap();
                break;
            case 26:
                this.f16383b = Fe.c.y(EnumC2526j.f34669c, C4056d.f45459j);
                this.f16384c = new C4051P(new C4039D(1));
                break;
        }
    }

    public B(com.google.android.gms.ads.nativead.l lVar) {
        this.f16382a = 27;
        this.f16384c = lVar;
        this.f16383b = new HashMap();
    }

    public B(InterfaceC1343c[] interfaceC1343cArr) {
        this.f16382a = 2;
        this.f16383b = interfaceC1343cArr;
        this.f16384c = new C1341a();
    }

    public B(List list) {
        this.f16382a = 0;
        this.f16383b = list;
        this.f16384c = new C[list.size()];
    }

    public B(mc.b bVar) {
        this.f16382a = 28;
        L l10 = new L(this, 27);
        C4281r c4281r = new C4281r(bVar, "flutter/platform_views_2", C4287x.f46768b, null);
        this.f16383b = c4281r;
        c4281r.b(l10);
    }

    public B(q2.m mVar, q2.p pVar) {
        this.f16382a = 22;
        this.f16383b = mVar;
        this.f16384c = pVar;
        new C0765n(new C0764m());
    }

    public B(int i5) {
        this.f16382a = 12;
        V5.b bVar = new V5.b(i5, 2);
        V5.b bVar2 = new V5.b(i5, 3);
        this.f16383b = bVar;
        this.f16384c = bVar2;
    }

    public B(C3534b c3534b) {
        this.f16382a = 18;
        this.f16383b = c3534b;
    }

    public B(C2693n c2693n) {
        this.f16382a = 14;
        this.f16384c = c2693n;
        this.f16383b = Q1.x.m(null);
    }
}
