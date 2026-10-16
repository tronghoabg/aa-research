package A7;

import D6.InterfaceC0407y;
import E4.C0434c;
import G6.AbstractC0552p;
import U1.C0850u;
import Va.Y7;
import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import androidx.work.Worker;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbsd;
import com.google.android.gms.internal.ads.zzccw;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.unity3d.services.UnityAdsConstants;
import j$.util.Objects;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import n7.C3597b;
import t1.C4075d;
import y3.C4552j;

/* loaded from: classes4.dex */
public final class V implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f721a;

    /* renamed from: b, reason: collision with root package name */
    public Object f722b;

    public /* synthetic */ V(int i5) {
        this.f721a = i5;
    }

    private final void a() {
        G7.a aVar = (G7.a) this.f722b;
        synchronized (aVar.f4652a) {
            try {
                if (aVar.b()) {
                    Log.e("WakeLock", String.valueOf(aVar.f4661j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.d();
                    if (aVar.b()) {
                        aVar.f4654c = 1;
                        aVar.e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [Yc.k] */
    private final void b() {
        Yc.l lVarA;
        while (true) {
            io.flutter.plugins.firebase.messaging.a aVar = (io.flutter.plugins.firebase.messaging.a) ((G9.e) this.f722b).f4687d;
            Yc.m mVar = aVar.f37179a;
            if (mVar == null || (lVarA = mVar.a()) == null) {
                synchronized (aVar.f37183e) {
                    try {
                        lVarA = aVar.f37183e.size() > 0 ? (Yc.k) aVar.f37183e.remove(0) : null;
                    } finally {
                    }
                }
            }
            if (lVarA == null) {
                ((Handler) ((G9.e) this.f722b).f4686c).post(new V(this, 20));
                return;
            } else {
                ((io.flutter.plugins.firebase.messaging.a) ((G9.e) this.f722b).f4687d).c(lVarA.getIntent());
                lVarA.a();
            }
        }
    }

    private final void c() {
        Object obj;
        synchronized (((androidx.lifecycle.D) this.f722b).f18579a) {
            obj = ((androidx.lifecycle.D) this.f722b).f18584f;
            ((androidx.lifecycle.D) this.f722b).f18584f = androidx.lifecycle.D.k;
        }
        ((androidx.lifecycle.D) this.f722b).j(obj);
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    @Override // java.lang.Runnable
    public final void run() {
        int i5 = 3;
        int i10 = 2;
        int i11 = 1;
        switch (this.f721a) {
            case 0:
                ((L1) ((W) this.f722b).f730d).C();
                return;
            case 1:
                A1 a12 = (A1) this.f722b;
                S3.s sVar = a12.f420c;
                ((C0303x1) sVar.f11010c).c0();
                C0303x1 c0303x1 = (C0303x1) sVar.f11010c;
                c0303x1.zzj().f611m.c("Application going to the background");
                c0303x1.a0().f779t.c(true);
                c0303x1.c0();
                c0303x1.f1113d = true;
                C0273n0 c0273n0 = (C0273n0) c0303x1.f421a;
                if (!c0273n0.f979g.q0()) {
                    boolean zO0 = c0273n0.f979g.o0(null, AbstractC0304y.f1146P0);
                    long j8 = a12.f419b;
                    B1 b12 = c0303x1.f1115f;
                    if (zO0) {
                        b12.c(j8, false, false);
                        ((C1) b12.f425d).a();
                    } else {
                        ((C1) b12.f425d).a();
                        b12.c(j8, false, false);
                    }
                }
                c0303x1.zzj().f610l.d("Application backgrounded at: timestamp_millis", Long.valueOf(a12.f418a));
                C0245e c0245e = c0273n0.f979g;
                D d3 = AbstractC0304y.f1177d1;
                if (c0245e.o0(null, d3)) {
                    P0 p0E0 = c0303x1.e0();
                    p0E0.c0();
                    p0E0.h0();
                    C0273n0 c0273n02 = (C0273n0) p0E0.f421a;
                    if (c0273n02.f979g.o0(null, d3)) {
                        C0271m1 c0271m1H = AbstractC0279p0.h(c0273n02);
                        if (c0271m1H.t0() && c0271m1H.b0().i1() < 242600) {
                            return;
                        }
                        C0271m1 c0271m1H2 = AbstractC0279p0.h(c0273n02);
                        c0271m1H2.m0(new RunnableC0283q1(c0271m1H2, c0271m1H2.w0(true), i10));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                L1 l12 = (L1) this.f722b;
                l12.zzl().c0();
                l12.k = new C4552j(l12);
                C0257i c0257i = new C0257i(l12);
                c0257i.i0();
                l12.f569c = c0257i;
                C0245e c0245eO = l12.O();
                C0249f0 c0249f0 = l12.f567a;
                AbstractC1732v.i(c0249f0);
                c0245eO.f853d = c0249f0;
                C0300w1 c0300w1 = new C0300w1(l12);
                c0300w1.i0();
                l12.f575i = c0300w1;
                W1 w12 = new W1(l12);
                w12.i0();
                l12.f572f = w12;
                C0256h1 c0256h1 = new C0256h1(l12);
                c0256h1.i0();
                l12.f574h = c0256h1;
                F1 f1 = new F1(l12);
                f1.i0();
                l12.f571e = f1;
                l12.f570d = new W(l12);
                if (l12.f583r != l12.f584s) {
                    l12.zzj().f605f.b(Integer.valueOf(l12.f583r), "Not all upload components initialized", Integer.valueOf(l12.f584s));
                }
                l12.f578m = true;
                l12.zzl().c0();
                C0257i c0257i2 = l12.f569c;
                L1.m(c0257i2);
                c0257i2.q1();
                C0257i c0257i3 = l12.f569c;
                L1.m(c0257i3);
                c0257i3.c0();
                c0257i3.h0();
                if (c0257i3.Q0()) {
                    D d5 = AbstractC0304y.f1190i0;
                    if (((Long) d5.a(null)).longValue() != 0) {
                        SQLiteDatabase sQLiteDatabaseL0 = c0257i3.l0();
                        ((C0273n0) c0257i3.f421a).f985n.getClass();
                        int iDelete = sQLiteDatabaseL0.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(d5.a(null))});
                        if (iDelete > 0) {
                            c0257i3.zzj().f612n.d("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(iDelete));
                        }
                    }
                }
                if (l12.f575i.f1100h.d() == 0) {
                    C0234a0 c0234a0 = l12.f575i.f1100h;
                    ((C3597b) l12.zzb()).getClass();
                    c0234a0.f(System.currentTimeMillis());
                }
                l12.C();
                return;
            case 3:
                C0273n0 c0273n03 = (C0273n0) this.f722b;
                U1 u12 = c0273n03.f983l;
                C0273n0.c(u12);
                u12.c0();
                if (u12.n1() != 1) {
                    N n10 = c0273n03.f981i;
                    C0273n0.d(n10);
                    n10.f608i.c("registerTrigger called but app not eligible");
                    return;
                } else {
                    P0 p02 = c0273n03.f987p;
                    C0273n0.b(p02);
                    RunnableC0284r0 runnableC0284r0 = new RunnableC0284r0(i5);
                    runnableC0284r0.f1037b = p02;
                    new Thread(runnableC0284r0).start();
                    return;
                }
            case 4:
                B9.d dVar = (B9.d) this.f722b;
                D9.i iVar = dVar.f1625h.f1632f;
                Activity activity = dVar.f1623f;
                E9.c cVar = iVar.f2577a;
                boolean zIsShown = cVar == null ? false : cVar.j().isShown();
                E9.c cVar2 = dVar.f1622e;
                if (zIsShown) {
                    D9.e.d("Fiam already active. Cannot show new Fiam.");
                } else if (activity.isFinishing() || activity.isDestroyed()) {
                    D9.e.d("Activity is finishing or does not have valid window token. Cannot show FIAM.");
                } else {
                    D9.k kVarF = cVar2.f();
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(kVarF.f2586g.intValue(), kVarF.f2587h.intValue(), BackupConstant.SCENE_CLOSED_WITHOUT_SHOW, kVarF.f2584e.intValue(), -3);
                    Rect rectA = D9.i.a(activity);
                    if ((kVarF.f2585f.intValue() & 48) == 48) {
                        layoutParams.y = rectA.top;
                    }
                    layoutParams.dimAmount = 0.3f;
                    layoutParams.gravity = kVarF.f2585f.intValue();
                    layoutParams.windowAnimations = 0;
                    WindowManager windowManager = (WindowManager) activity.getSystemService("window");
                    windowManager.addView(cVar2.j(), layoutParams);
                    Rect rectA2 = D9.i.a(activity);
                    D9.e.c("Inset (top, bottom)", rectA2.top, rectA2.bottom);
                    D9.e.c("Inset (left, right)", rectA2.left, rectA2.right);
                    if (cVar2 instanceof E9.a) {
                        S3.l lVar = new S3.l(cVar2);
                        cVar2.g().setOnTouchListener(kVarF.f2586g.intValue() == -1 ? new D9.s(cVar2.g(), lVar) : new D9.h(cVar2.g(), lVar, layoutParams, windowManager, cVar2));
                    }
                    iVar.f2577a = cVar2;
                }
                if (cVar2.f().f2589j.booleanValue()) {
                    B9.f fVar = dVar.f1625h;
                    D9.d dVar2 = fVar.f1635i;
                    ViewGroup viewGroupJ = cVar2.j();
                    dVar2.getClass();
                    viewGroupJ.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    viewGroupJ.measure(-2, -2);
                    Point point = new Point(0, viewGroupJ.getMeasuredHeight() * (-1));
                    viewGroupJ.animate().translationX(point.x).translationY(point.y).setDuration(1L).setListener(new D9.c(0, viewGroupJ, fVar.f1634h));
                    return;
                }
                return;
            case 5:
                InterfaceC0407y interfaceC0407y = ((D6.g1) this.f722b).f2428a.f2434a;
                if (interfaceC0407y != null) {
                    try {
                        interfaceC0407y.zzc(1);
                        return;
                    } catch (RemoteException e7) {
                        H6.l.g("Could not notify onAdFailedToLoad event.", e7);
                        return;
                    }
                }
                return;
            case 6:
                InterfaceC0407y interfaceC0407y2 = ((D6.i1) this.f722b).f2440a;
                if (interfaceC0407y2 != null) {
                    try {
                        interfaceC0407y2.zzc(1);
                        return;
                    } catch (RemoteException e10) {
                        H6.l.g("Could not notify onAdFailedToLoad event.", e10);
                        return;
                    }
                }
                return;
            case 7:
                zzbsd zzbsdVar = ((D6.j1) this.f722b).f2446a;
                if (zzbsdVar != null) {
                    try {
                        zzbsdVar.zzb(Collections.EMPTY_LIST);
                        return;
                    } catch (RemoteException e11) {
                        H6.l.g("Could not notify onComplete event.", e11);
                        return;
                    }
                }
                return;
            case 8:
                zzccw zzccwVar = (zzccw) this.f722b;
                if (zzccwVar != null) {
                    try {
                        zzccwVar.zzf(1);
                        return;
                    } catch (RemoteException e12) {
                        H6.l.i("#007 Could not call remote method.", e12);
                        return;
                    }
                }
                return;
            case 9:
                Y7 y72 = (Y7) this.f722b;
                y72.getClass();
                while (true) {
                    try {
                        y72.d((C0434c) ((ReferenceQueue) y72.f13869c).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            case 10:
                F6.b bVar = (F6.b) this.f722b;
                if (bVar.f3950g) {
                    bVar.f3945b.finish();
                    return;
                }
                return;
            case 11:
                ((F6.l) this.f722b).S();
                return;
            case 12:
                Thread threadCurrentThread = Thread.currentThread();
                AbstractC0552p abstractC0552p = (AbstractC0552p) this.f722b;
                abstractC0552p.zzc(threadCurrentThread);
                abstractC0552p.zza();
                return;
            case 13:
                G6.O o7 = (G6.O) this.f722b;
                if (o7.f4532b) {
                    if (!(o7.o() && o7.p()) && ((Boolean) zzbko.zzb.zze()).booleanValue()) {
                        synchronized (o7.f4531a) {
                            try {
                                if (Looper.getMainLooper() == null) {
                                    return;
                                }
                                if (o7.f4535e == null) {
                                    o7.f4535e = new zzbfx();
                                }
                                o7.f4535e.zza();
                                int i12 = G6.L.f4523b;
                                H6.l.e("start fetching content...");
                                return;
                            } finally {
                            }
                        }
                    }
                    return;
                }
                return;
            case 14:
                a();
                return;
            case 15:
                Worker worker = (Worker) this.f722b;
                try {
                    worker.f19056a.i(worker.doWork());
                    return;
                } catch (Throwable th) {
                    worker.f19056a.j(th);
                    return;
                }
            case 16:
                N7.e eVar = (N7.e) this.f722b;
                eVar.f8588b = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f8591e;
                C4075d c4075d = bottomSheetBehavior.f26800M;
                if (c4075d != null && c4075d.f()) {
                    eVar.f(eVar.f8589c);
                    return;
                } else {
                    if (bottomSheetBehavior.L == 2) {
                        bottomSheetBehavior.A(eVar.f8589c);
                        return;
                    }
                    return;
                }
            case 17:
                ((WebView) this.f722b).destroy();
                return;
            case 18:
                S3.c cVar3 = ((Sa.a) this.f722b).f11045e;
                cVar3.getClass();
                Ta.b bVar2 = new Ta.b(cVar3);
                G9.e eVar2 = (G9.e) cVar3.f10937c;
                bVar2.f11817a = eVar2;
                ((ArrayDeque) eVar2.f4686c).add(bVar2);
                if (((Ta.a) eVar2.f4687d) == null) {
                    eVar2.o();
                    return;
                }
                return;
            case 19:
                View view = (View) this.f722b;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
                return;
            case 20:
                ((io.flutter.plugins.firebase.messaging.a) ((G9.e) ((V) this.f722b).f722b).f4687d).d();
                return;
            case 21:
                b();
                return;
            case 22:
                aa.n nVar = (aa.n) this.f722b;
                if (nVar.a()) {
                    aa.j jVarB = nVar.f17476o.b();
                    nVar.f17475n.getClass();
                    if (new Date(System.currentTimeMillis()).before(jVarB.f17451b)) {
                        nVar.h();
                        return;
                    }
                    P9.c cVar4 = (P9.c) nVar.f17471i;
                    Task taskE = cVar4.e();
                    Task taskD = cVar4.d();
                    Task<List<Task<?>>> taskWhenAllComplete = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskE, taskD});
                    A5.g gVar = new A5.g(nVar, taskE, taskD, 9);
                    ScheduledExecutorService scheduledExecutorService = nVar.f17468f;
                    Task taskContinueWithTask = taskWhenAllComplete.continueWithTask(scheduledExecutorService, gVar);
                    Tasks.whenAllComplete((Task<?>[]) new Task[]{taskContinueWithTask}).continueWith(scheduledExecutorService, new aa.f(i11, nVar, taskContinueWithTask));
                    return;
                }
                return;
            case 23:
                c();
                return;
            case 24:
                if (((TaskCompletionSource) this.f722b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 25:
                com.bumptech.glide.h hVar = (com.bumptech.glide.h) this.f722b;
                hVar.f24251c.f(hVar);
                return;
            case 26:
                ((com.google.android.gms.common.api.internal.H) this.f722b).e();
                return;
            case 27:
                com.google.android.gms.common.api.g gVar2 = ((com.google.android.gms.common.api.internal.H) ((ad.L) this.f722b).f17515b).f26455b;
                gVar2.disconnect(gVar2.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 28:
                ((com.google.android.gms.common.api.internal.U) this.f722b).f26494g.g(new d7.b(4, null, null));
                return;
            default:
                eb.c cVar5 = (eb.c) this.f722b;
                C0850u c0850u = cVar5.f34626x;
                if (c0850u == null) {
                    return;
                }
                if (c0850u.h0() != cVar5.f34609f) {
                    cVar5.r();
                }
                int iT0 = cVar5.f34626x.t0();
                Handler handler = cVar5.f34601C;
                if (iT0 == 2) {
                    handler.postDelayed(this, 200L);
                    return;
                } else {
                    if (iT0 != 3) {
                        return;
                    }
                    if (cVar5.f34626x.s0()) {
                        handler.postDelayed(this, 500L);
                        return;
                    } else {
                        handler.postDelayed(this, 1000L);
                        return;
                    }
                }
        }
    }

    public V(Qa.c cVar) {
        this.f721a = 17;
        this.f722b = cVar.f9934f;
    }

    public /* synthetic */ V(Object obj, int i5) {
        this.f721a = i5;
        this.f722b = obj;
    }

    public V(W w2, boolean z2) {
        this.f721a = 0;
        this.f722b = w2;
    }

    public V(L1 l12, Q1 q12) {
        this.f721a = 2;
        this.f722b = l12;
    }

    public V(D6.g1 g1Var) {
        this.f721a = 5;
        Objects.requireNonNull(g1Var);
        this.f722b = g1Var;
    }

    public V(D6.i1 i1Var) {
        this.f721a = 6;
        Objects.requireNonNull(i1Var);
        this.f722b = i1Var;
    }

    public V(AbstractC0552p abstractC0552p) {
        this.f721a = 12;
        Objects.requireNonNull(abstractC0552p);
        this.f722b = abstractC0552p;
    }
}
