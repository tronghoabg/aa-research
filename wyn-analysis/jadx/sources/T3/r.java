package T3;

import A7.C0241c1;
import N1.L;
import N1.N;
import Pc.C0799o;
import Pc.C0800p;
import Pc.C0801q;
import U1.C0840j;
import U1.C0849t;
import U1.C0850u;
import U1.C0855z;
import U1.P;
import U1.T;
import U1.V;
import a1.AbstractC1312b;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.view.MotionEvent;
import android.webkit.WebView;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.n2;
import com.applovin.sdk.AppLovinAd;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.FirebaseFirestore;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import k2.H;
import kotlin.jvm.internal.AbstractC3340k;
import q5.EnumC3870e;
import t5.C4123r;
import uc.C4271h;
import vf.AbstractC4345a;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11435b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11436c;

    public /* synthetic */ r(int i5, Object obj, Object obj2) {
        this.f11434a = i5;
        this.f11435b = obj;
        this.f11436c = obj2;
    }

    private final void a() {
        Uc.f fVar = (Uc.f) this.f11435b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f11436c;
        HashMap map = Uc.f.f12728h;
        fVar.getClass();
        try {
            HashMap map2 = Uc.f.f12728h;
            synchronized (map2) {
                try {
                    Iterator it = map2.entrySet().iterator();
                    while (it.hasNext()) {
                        FirebaseFirestore firebaseFirestore = (FirebaseFirestore) ((Map.Entry) it.next()).getKey();
                        Tasks.await(firebaseFirestore.j());
                        Uc.f.a(firebaseFirestore);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            fVar.h();
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    private final void b() {
        Task taskA;
        Uc.n nVar = (Uc.n) this.f11435b;
        C0799o c0799o = (C0799o) this.f11436c;
        try {
            Dd.c cVar = Uc.f.c(nVar).k;
            synchronized (cVar) {
                cVar.C();
                p9.n nVar2 = (p9.n) cVar.f2643c;
                nVar2.e();
                taskA = nVar2.f43382d.a(new p9.l(nVar2, 2));
            }
            Tasks.await(taskA);
            c0799o.a(null);
        } catch (Exception e7) {
            AbstractC4345a.K(c0799o, e7);
        }
    }

    private final void c() {
        Task taskA;
        Uc.n nVar = (Uc.n) this.f11435b;
        C0800p c0800p = (C0800p) this.f11436c;
        try {
            Dd.c cVar = Uc.f.c(nVar).k;
            synchronized (cVar) {
                cVar.C();
                p9.n nVar2 = (p9.n) cVar.f2643c;
                nVar2.e();
                taskA = nVar2.f43382d.a(new p9.l(nVar2, 1));
            }
            Tasks.await(taskA);
            c0800p.a(null);
        } catch (Exception e7) {
            AbstractC4345a.K(c0800p, e7);
        }
    }

    private final void d() {
        S3.s sVar = (S3.s) this.f11435b;
        H5.e eVar = (H5.e) this.f11436c;
        sVar.getClass();
        synchronized (eVar) {
        }
        U1.r rVar = (U1.r) sVar.f11010c;
        int i5 = Q1.x.f9724a;
        V1.d dVar = rVar.f12116a.f12167r;
        dVar.L(dVar.I((H) dVar.f12902d.f1848e), 1013, new V1.b(5));
    }

    private final void e() {
        ConstraintTrackingWorker this$0 = (ConstraintTrackingWorker) this.f11435b;
        p8.p pVar = (p8.p) this.f11436c;
        AbstractC3340k.e(this$0, "this$0");
        synchronized (this$0.f19091b) {
            try {
                if (this$0.f19092c) {
                    U3.j future = this$0.f19093d;
                    AbstractC3340k.d(future, "future");
                    String str = W3.a.f15146a;
                    future.i(new J3.n());
                } else {
                    this$0.f19093d.k(pVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j8;
        boolean z2;
        int i5 = 2;
        boolean z10 = true;
        switch (this.f11434a) {
            case 0:
                s sVar = (s) this.f11435b;
                U3.j jVar = (U3.j) this.f11436c;
                if (sVar.f11438a.f12264a instanceof U3.a) {
                    jVar.cancel(true);
                    return;
                } else {
                    jVar.k(sVar.f11441d.getForegroundInfoAsync());
                    return;
                }
            case 1:
                X8.c cVar = (X8.c) this.f11435b;
                ((T8.g) cVar.f16185b).i((String) cVar.f16184a, (List) this.f11436c);
                return;
            case 2:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f11436c;
                Tc.b bVar = (Tc.b) this.f11435b;
                bVar.getClass();
                try {
                    bVar.c();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    return;
                }
            case 3:
                ((C4271h) this.f11435b).a((ArrayList) this.f11436c);
                return;
            case 4:
                C0850u c0850u = (C0850u) this.f11435b;
                T5.s sVar2 = (T5.s) this.f11436c;
                int i10 = c0850u.f12125E - sVar2.f11686b;
                c0850u.f12125E = i10;
                if (sVar2.f11688d) {
                    c0850u.f12126F = sVar2.f11690f;
                    c0850u.f12127G = true;
                }
                if (i10 == 0) {
                    N n10 = ((P) sVar2.f11689e).f11977a;
                    if (!c0850u.f12152d0.f11977a.p() && n10.p()) {
                        c0850u.f12154e0 = -1;
                        c0850u.f12156f0 = 0L;
                    }
                    if (!n10.p()) {
                        List listAsList = Arrays.asList(((V) n10).f12011i);
                        Q1.k.g(listAsList.size() == c0850u.f12164o.size());
                        for (int i11 = 0; i11 < listAsList.size(); i11++) {
                            ((C0849t) c0850u.f12164o.get(i11)).f12120b = (N) listAsList.get(i11);
                        }
                    }
                    long j10 = -9223372036854775807L;
                    if (c0850u.f12127G) {
                        if (((P) sVar2.f11689e).f11978b.equals(c0850u.f12152d0.f11978b) && ((P) sVar2.f11689e).f11980d == c0850u.f12152d0.f11994s) {
                            z10 = false;
                        }
                        if (z10) {
                            if (n10.p() || ((P) sVar2.f11689e).f11978b.b()) {
                                j10 = ((P) sVar2.f11689e).f11980d;
                            } else {
                                P p10 = (P) sVar2.f11689e;
                                H h10 = p10.f11978b;
                                long j11 = p10.f11980d;
                                Object obj = h10.f38903a;
                                L l10 = c0850u.f12163n;
                                n10.g(obj, l10);
                                j10 = j11 + l10.f8052e;
                            }
                        }
                        j8 = j10;
                        z2 = z10;
                    } else {
                        j8 = -9223372036854775807L;
                        z2 = false;
                    }
                    c0850u.f12127G = false;
                    c0850u.Q0((P) sVar2.f11689e, 1, z2, c0850u.f12126F, j8, -1, false);
                    return;
                }
                return;
            case 5:
                T t10 = (T) this.f11436c;
                ((C0855z) this.f11435b).getClass();
                try {
                    synchronized (t10) {
                    }
                    try {
                        t10.f11996a.c(t10.f11999d, t10.f12000e);
                        return;
                    } finally {
                        t10.b(true);
                    }
                } catch (C0840j e10) {
                    Q1.k.l("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
            case 6:
                Uc.n nVar = (Uc.n) this.f11435b;
                C0801q c0801q = (C0801q) this.f11436c;
                try {
                    Tasks.await(Uc.f.c(nVar).a());
                    c0801q.a(null);
                    return;
                } catch (Exception e11) {
                    AbstractC4345a.K(c0801q, e11);
                    return;
                }
            case 7:
                b();
                return;
            case 8:
                Boolean bool = (Boolean) this.f11435b;
                C0801q c0801q2 = (C0801q) this.f11436c;
                HashMap map = Uc.f.f12728h;
                try {
                    if (bool.booleanValue()) {
                        Ba.c.f1661i = 1;
                    } else {
                        Ba.c.f1661i = 2;
                    }
                    c0801q2.a(null);
                    return;
                } catch (Exception e12) {
                    AbstractC4345a.K(c0801q2, e12);
                    return;
                }
            case 9:
                a();
                return;
            case 10:
                c();
                return;
            case 11:
                Uc.n nVar2 = (Uc.n) this.f11435b;
                C0799o c0799o = (C0799o) this.f11436c;
                try {
                    Tasks.await(Uc.f.c(nVar2).l());
                    c0799o.a(null);
                    return;
                } catch (Exception e13) {
                    AbstractC4345a.K(c0799o, e13);
                    return;
                }
            case 12:
                Uc.n nVar3 = (Uc.n) this.f11435b;
                C0801q c0801q3 = (C0801q) this.f11436c;
                try {
                    FirebaseFirestore firebaseFirestoreC = Uc.f.c(nVar3);
                    Tasks.await(firebaseFirestoreC.j());
                    Uc.f.a(firebaseFirestoreC);
                    c0801q3.a(null);
                    return;
                } catch (Exception e14) {
                    AbstractC4345a.K(c0801q3, e14);
                    return;
                }
            case 13:
                d();
                return;
            case 14:
                W1.g gVar = (W1.g) this.f11436c;
                S3.s sVar3 = ((W1.v) ((xa.d) this.f11435b).f47873b).f15101D0;
                Handler handler = (Handler) sVar3.f11009b;
                if (handler != null) {
                    handler.post(new W1.f(sVar3, gVar, i5));
                    return;
                }
                return;
            case 15:
                e();
                return;
            case 16:
                ((C0241c1) this.f11435b).a((Intent) this.f11436c);
                return;
            case 17:
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f11436c;
                try {
                    taskCompletionSource2.setResult(((W9.n) this.f11435b).a());
                    return;
                } catch (Exception e15) {
                    taskCompletionSource2.setException(e15);
                    return;
                }
            case 18:
                ((Wa.h) this.f11435b).f15449c.a(this.f11436c);
                return;
            case 19:
                ((Wb.a) this.f11435b).f15452c.a((ArrayList) this.f11436c);
                return;
            case 20:
                Y8.c cVar2 = (Y8.c) this.f11435b;
                cVar2.getClass();
                try {
                    C4123r.a().f45802d.a(cVar2.f16729h.f45793a.b(EnumC3870e.f44127c), 1);
                } catch (Exception unused) {
                }
                ((CountDownLatch) this.f11436c).countDown();
                return;
            case 21:
                FlutterFirebaseMessagingBackgroundService.f37175i.D((Intent) this.f11435b, (CountDownLatch) this.f11436c);
                return;
            case 22:
                ((AbstractC1312b) this.f11435b).k((Typeface) this.f11436c);
                return;
            case 23:
                ((b2.b) ((a2.m) ((a2.s) this.f11435b).f17289c.f152b).f17217b.f19161d.get(((a2.l) this.f11436c).f17202m)).c(true);
                return;
            case 24:
                b2.b bVar2 = (b2.b) this.f11435b;
                bVar2.f19154i = false;
                bVar2.d((Uri) this.f11436c);
                return;
            case 25:
                ((AppLovinFullscreenActivity) this.f11435b).a((Long) this.f11436c);
                return;
            case 26:
                ((AppLovinFullscreenActivity) this.f11435b).a((n2) this.f11436c);
                return;
            case 27:
                ((com.applovin.impl.adview.a) this.f11435b).b((MotionEvent) this.f11436c);
                return;
            case 28:
                ((com.applovin.impl.adview.a) this.f11435b).b((WebView) this.f11436c);
                return;
            default:
                ((com.applovin.impl.adview.a) this.f11435b).a((AppLovinAd) this.f11436c);
                return;
        }
    }
}
