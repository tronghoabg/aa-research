package ng;

import A.AbstractC0213f;
import B8.b;
import Ba.c;
import E5.E;
import E5.F;
import E5.I;
import E5.n0;
import F5.f;
import G5.C0535p;
import H5.e;
import N1.C0765n;
import N1.Y;
import U1.C0835e;
import U1.C0847q;
import U1.C0850u;
import U1.r;
import Va.Y7;
import X2.j;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.ConnectivityManager;
import android.util.Log;
import android.view.Surface;
import c9.d;
import ce.InterfaceC1606a;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.protobuf.ByteString;
import com.unity3d.services.store.core.api.Store;
import f6.C2613z;
import io.flutter.plugin.platform.x;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;
import k2.H;
import kotlin.jvm.internal.AbstractC3340k;
import m9.G;
import m9.InterfaceC3517p;
import md.C3542j;
import md.W;
import md.b0;
import md.k0;
import n9.C3610e;
import nd.C3615a;
import org.apache.tika.embedder.ExternalEmbedder;
import org.apache.tika.parser.external.ExternalParser;
import org.apache.tika.pipes.async.AsyncProcessor;
import org.apache.tika.pipes.pipesiterator.TotalCounter;
import p2.ExecutorC3758a;
import p7.AbstractC3772b;
import p9.C3781b;
import p9.n;
import p9.z;
import r9.C3955l;
import r9.RunnableC3951h;
import r9.RunnableC3952i;
import re.C3979c;
import s9.h;
import t6.o;
import t9.i;
import u6.v;
import uc.InterfaceC4280q;
import v9.AbstractC4335b;
import v9.B;
import v9.C4333A;
import v9.g;
import w6.k;
import w9.C4393l;
import w9.ExecutorC4387f;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41179c;

    public /* synthetic */ a(int i5, Object obj, Object obj2) {
        this.f41177a = i5;
        this.f41178b = obj;
        this.f41179c = obj2;
    }

    private final void a() {
        C0535p c0535p = (C0535p) this.f41178b;
        e eVar = (e) this.f41179c;
        c0535p.getClass();
        synchronized (eVar) {
        }
        F f10 = c0535p.f4434c;
        int i5 = v.f46721a;
        f fVar = f10.f3030a.f3098r;
        F5.a aVarL = fVar.L((C2613z) fVar.f3894d.f1848e);
        fVar.O(aVarL, 1020, new b(aVarL, eVar, 11));
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        Set<String> setUnmodifiableSet;
        int i5 = 7;
        int i10 = 1;
        int i11 = 0;
        switch (this.f41177a) {
            case 0:
                ExternalEmbedder.lambda$multiThreadedStreamCopy$0((InputStream) this.f41178b, (OutputStream) this.f41179c);
                return;
            case 1:
                ExternalParser.lambda$sendInput$1((Process) this.f41179c, (InputStream) this.f41178b);
                return;
            case 2:
                ((AsyncProcessor) this.f41178b).lambda$startCounter$1((TotalCounter) this.f41179c);
                return;
            case 3:
                z zVar = ((n) this.f41178b).f43387i;
                if (!zVar.f43432b.f3477g) {
                    c.p("z", "The network is disabled. The task returned by 'awaitPendingWrites()' will not complete until the network is enabled.", 1, new Object[0]);
                }
                int i12 = zVar.f43431a.f44633c.i();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f41179c;
                if (i12 == -1) {
                    taskCompletionSource.setResult(null);
                    return;
                }
                HashMap map = zVar.f43440j;
                if (!map.containsKey(Integer.valueOf(i12))) {
                    map.put(Integer.valueOf(i12), new ArrayList());
                }
                ((List) map.get(Integer.valueOf(i12))).add(taskCompletionSource);
                return;
            case 4:
                C3955l c3955l = ((n) this.f41178b).f43385g;
                c3955l.getClass();
                c3955l.f44631a.P("Configure indexes", new RunnableC3952i(c3955l, (ArrayList) this.f41179c, i11));
                return;
            case 5:
                ((HashSet) ((n) this.f41178b).f43388j.f9698d).remove((InterfaceC3517p) this.f41179c);
                return;
            case 6:
                HashSet hashSet = (HashSet) ((n) this.f41178b).f43388j.f9698d;
                C3781b c3781b = (C3781b) this.f41179c;
                hashSet.add(c3781b);
                c3781b.a(null, null);
                return;
            case 7:
                n nVar = (n) this.f41178b;
                A6.c.z(nVar.f43387i != null, "SyncEngine not yet initialized", new Object[0]);
                C3610e c3610e = (C3610e) this.f41179c;
                c.p("FirestoreClient", "Credential changed. Current user: %s", 1, c3610e.f40955a);
                z zVar2 = nVar.f43387i;
                boolean zEquals = zVar2.f43441l.equals(c3610e);
                zVar2.f43441l = c3610e;
                if (!zEquals) {
                    HashMap map2 = zVar2.f43440j;
                    Iterator it = map2.entrySet().iterator();
                    while (it.hasNext()) {
                        Iterator it2 = ((List) ((Map.Entry) it.next()).getValue()).iterator();
                        while (it2.hasNext()) {
                            ((TaskCompletionSource) it2.next()).setException(new G("'waitForPendingWrites' task is cancelled due to User change.", m9.F.CANCELLED));
                        }
                    }
                    map2.clear();
                    C3955l c3955l2 = zVar2.f43431a;
                    List listK = c3955l2.f44633c.k();
                    c3955l2.c(c3610e);
                    RunnableC3951h runnableC3951h = new RunnableC3951h(c3955l2, i11);
                    AbstractC3772b abstractC3772b = c3955l2.f44631a;
                    abstractC3772b.P("Start IndexManager", runnableC3951h);
                    abstractC3772b.P("Start MutationQueue", new RunnableC3951h(c3955l2, i10));
                    List listK2 = c3955l2.f44633c.k();
                    d dVarA = h.f45374c;
                    Iterator it3 = Arrays.asList(listK, listK2).iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = ((List) it3.next()).iterator();
                        while (it4.hasNext()) {
                            Iterator it5 = ((i) it4.next()).f45957d.iterator();
                            while (it5.hasNext()) {
                                dVarA = dVarA.a(((t9.h) it5.next()).f45951a);
                            }
                        }
                    }
                    zVar2.b(c3955l2.f44636f.e(dVarA), null);
                }
                n0 n0Var = zVar2.f43432b;
                if (n0Var.f3477g) {
                    c.p("RemoteStore", "Restarting streams for new credential.", 1, new Object[0]);
                    n0Var.f3477g = false;
                    n0Var.f();
                    ((x) n0Var.f3480j).d(1);
                    ((B) n0Var.f3476f).b();
                    ((C4333A) n0Var.k).b();
                    n0Var.h();
                    return;
                }
                return;
            case 8:
                j jVar = (j) this.f41178b;
                jVar.getClass();
                int i13 = Q1.x.f9724a;
                C0850u c0850u = ((r) jVar.f16076c).f12116a;
                Y y10 = (Y) this.f41179c;
                c0850u.f12148b0 = y10;
                c0850u.f12161l.e(25, new C0847q(y10));
                return;
            case 9:
                j jVar2 = (j) this.f41178b;
                jVar2.getClass();
                int i14 = Q1.x.f9724a;
                r rVar = (r) jVar2.f16076c;
                C0765n c0765n = (C0765n) this.f41179c;
                C0850u c0850u2 = rVar.f12116a;
                c0850u2.f12132M = c0765n;
                V1.d dVar = c0850u2.f12167r;
                dVar.L(dVar.K(), 1017, new V1.b(i5));
                return;
            case 10:
                j jVar3 = (j) this.f41178b;
                e eVar = (e) this.f41179c;
                jVar3.getClass();
                synchronized (eVar) {
                }
                r rVar2 = (r) jVar3.f16076c;
                int i15 = Q1.x.f9724a;
                C0850u c0850u3 = rVar2.f12116a;
                V1.d dVar2 = c0850u3.f12167r;
                V1.a aVarI = dVar2.I((H) dVar2.f12902d.f1848e);
                dVar2.L(aVarI, 1020, new S8.b(aVarI, eVar, i5));
                c0850u3.f12132M = null;
                return;
            case 11:
                ((C3955l) this.f41178b).f44640j.Q((o9.e) this.f41179c);
                return;
            case 12:
                ((C3955l) this.f41178b).f44633c.f((ByteString) this.f41179c);
                return;
            case 13:
                C3979c this$0 = (C3979c) this.f41178b;
                AbstractC3340k.e(this$0, "this$0");
                G9.e eVar2 = (G9.e) this.f41179c;
                InterfaceC1606a interfaceC1606a = (InterfaceC1606a) this$0.f44806a.get();
                if (interfaceC1606a != null) {
                    interfaceC1606a.d(eVar2);
                    return;
                }
                return;
            case 14:
                C3979c this$02 = (C3979c) this.f41178b;
                AbstractC3340k.e(this$02, "this$0");
                String str = (String) this.f41179c;
                InterfaceC1606a interfaceC1606a2 = (InterfaceC1606a) this$02.f44806a.get();
                if (interfaceC1606a2 != null) {
                    interfaceC1606a2.a(str);
                    return;
                }
                return;
            case 15:
                InterfaceC4280q interfaceC4280q = (InterfaceC4280q) this.f41178b;
                Serializable serializable = (Serializable) this.f41179c;
                if (interfaceC4280q != null) {
                    interfaceC4280q.a(serializable);
                    return;
                } else {
                    Log.w("ffmpeg-kit-flutter", String.format("ResultHandler can not send successful response %s on a null method call result.", serializable));
                    return;
                }
            case 16:
                ((o) this.f41179c).a(((u6.o) this.f41178b).c());
                return;
            case 17:
                C0535p c0535p = (C0535p) this.f41178b;
                c0535p.getClass();
                int i16 = v.f46721a;
                I i17 = c0535p.f4434c.f3030a;
                v6.o oVar = (v6.o) this.f41179c;
                i17.f3085h0 = oVar;
                i17.f3091l.p(25, new E(oVar));
                return;
            case 18:
                a();
                return;
            case 19:
                E4.n nVar2 = (E4.n) this.f41178b;
                if (c.E()) {
                    HashMap map3 = new HashMap();
                    b0 b0Var = (b0) this.f41179c;
                    if (b0Var.f40618b == 0) {
                        setUnmodifiableSet = Collections.EMPTY_SET;
                    } else {
                        HashSet hashSet2 = new HashSet(b0Var.f40618b);
                        for (int i18 = 0; i18 < b0Var.f40618b; i18++) {
                            hashSet2.add(new String(b0Var.e(i18), 0));
                        }
                        setUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet2);
                    }
                    for (String str2 : setUnmodifiableSet) {
                        if (g.f47065d.contains(str2.toLowerCase(Locale.ENGLISH))) {
                            C3542j c3542j = b0.f40615d;
                            BitSet bitSet = md.Y.f40606d;
                            map3.put(str2, (String) b0Var.c(new W(str2, c3542j)));
                        }
                    }
                    if (map3.isEmpty()) {
                        return;
                    }
                    AbstractC4335b abstractC4335b = (AbstractC4335b) nVar2.f2940d;
                    c.p(abstractC4335b.getClass().getSimpleName(), "(%x) Stream received headers: %s", 1, Integer.valueOf(System.identityHashCode(abstractC4335b)), map3);
                    return;
                }
                return;
            case 20:
                E4.n nVar3 = (E4.n) this.f41178b;
                k0 k0Var = (k0) this.f41179c;
                boolean zF = k0Var.f();
                AbstractC4335b abstractC4335b2 = (AbstractC4335b) nVar3.f2940d;
                if (zF) {
                    c.p(abstractC4335b2.getClass().getSimpleName(), "(%x) Stream closed.", 1, Integer.valueOf(System.identityHashCode(abstractC4335b2)));
                } else {
                    c.p(abstractC4335b2.getClass().getSimpleName(), "(%x) Stream closed with status: %s.", 2, Integer.valueOf(System.identityHashCode(abstractC4335b2)), k0Var);
                }
                A6.c.z(abstractC4335b2.d(), "Can't handle server close on non-started stream!", new Object[0]);
                abstractC4335b2.a(v9.r.f47109e, k0Var);
                return;
            case 21:
                ((ConnectivityManager) ((Y7) this.f41178b).f13868b).unregisterNetworkCallback((Q3.h) this.f41179c);
                return;
            case 22:
                ((Context) ((Y7) this.f41178b).f13867a).unregisterReceiver((C3615a) this.f41179c);
                return;
            case 23:
                n0 n0Var2 = (n0) this.f41178b;
                n0Var2.getClass();
                v9.f fVar = v9.f.f47063b;
                v9.f fVar2 = (v9.f) this.f41179c;
                boolean zEquals2 = fVar2.equals(fVar);
                x xVar = (x) n0Var2.f3480j;
                if (zEquals2 && AbstractC0213f.b(xVar.f37166a, 2)) {
                    return;
                }
                if (!(fVar2.equals(v9.f.f47062a) && AbstractC0213f.b(xVar.f37166a, 3)) && n0Var2.f3477g) {
                    c.p("RemoteStore", "Restarting streams for network reachability change.", 1, new Object[0]);
                    n0Var2.f3477g = false;
                    n0Var2.f();
                    xVar.d(1);
                    ((B) n0Var2.f3476f).b();
                    ((C4333A) n0Var2.k).b();
                    n0Var2.h();
                    return;
                }
                return;
            case 24:
                k kVar = (k) this.f41178b;
                SurfaceTexture surfaceTexture = kVar.f47361g;
                Surface surface = kVar.f47362h;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) this.f41179c;
                Surface surface2 = new Surface(surfaceTexture2);
                kVar.f47361g = surfaceTexture2;
                kVar.f47362h = surface2;
                Iterator it6 = kVar.f47355a.iterator();
                while (it6.hasNext()) {
                    ((F) it6.next()).f3030a.L0(surface2);
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 25:
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f41178b;
                try {
                    taskCompletionSource2.setResult(((Callable) this.f41179c).call());
                    return;
                } catch (Exception e7) {
                    taskCompletionSource2.setException(e7);
                    throw new RuntimeException(e7);
                }
            case 26:
                ExecutorC4387f executorC4387f = (ExecutorC4387f) this.f41178b;
                executorC4387f.getClass();
                ((Runnable) this.f41179c).run();
                executorC4387f.f47430a.release();
                return;
            case 27:
                C4393l c4393l = (C4393l) this.f41178b;
                c4393l.getClass();
                c4393l.f47453g = new Date().getTime();
                ((Runnable) this.f41179c).run();
                return;
            case 28:
                ExecutorC3758a executorC3758a = (ExecutorC3758a) this.f41178b;
                executorC3758a.getClass();
                ((Runnable) this.f41179c).run();
                ((Semaphore) executorC3758a.f43197c).release();
                return;
            default:
                Store.lambda$isFeatureSupported$0((Integer) this.f41178b, (String) this.f41179c);
                return;
        }
    }

    public /* synthetic */ a(j jVar, C0765n c0765n, C0835e c0835e) {
        this.f41177a = 9;
        this.f41178b = jVar;
        this.f41179c = c0765n;
    }

    public /* synthetic */ a(Process process, InputStream inputStream) {
        this.f41177a = 1;
        this.f41179c = process;
        this.f41178b = inputStream;
    }
}
