package g5;

import A.e0;
import Wa.h;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import b7.k;
import cb.AbstractC1593a;
import cg.C1614c;
import cg.C1618g;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import com.unity3d.services.UnityAdsConstants;
import d7.j;
import f6.C2584N;
import f6.U;
import ff.x;
import gf.C2761h;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import k1.S;
import k3.AbstractC3175g;
import k3.C3176h;
import kotlin.jvm.internal.AbstractC3340k;
import md.AbstractC3537e;
import md.W;
import md.k0;
import n1.C3567a;
import n1.ViewOnTouchListenerC3570d;
import o3.InterfaceC3644a;
import o3.g;
import od.B0;
import od.C3677d;
import od.C3685f1;
import od.C3691h1;
import od.C3711o0;
import od.E;
import od.E0;
import od.E1;
import od.G1;
import od.InterfaceC3724t;
import od.K;
import od.L0;
import od.L1;
import od.M0;
import od.RunnableC3666A;
import od.RunnableC3693i0;
import od.U0;
import pd.m;
import q.C3816i;
import q.C3838t0;
import r4.C3917c;
import r4.C3918d;
import s.C3982b;
import t1.C4075d;
import u0.C4188n;
import u4.AbstractC4249a;
import v9.AbstractC4335b;
import v9.r;
import vb.C4336a;

/* renamed from: g5.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2707d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35742a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f35743b;

    public /* synthetic */ RunnableC2707d(Object obj, int i5) {
        this.f35742a = i5;
        this.f35743b = obj;
    }

    private final void b() {
        ((m) this.f35743b).getClass();
        m mVar = (m) this.f35743b;
        mVar.f43569o.execute(mVar.f43574t);
        synchronized (((m) this.f35743b).k) {
            m mVar2 = (m) this.f35743b;
            mVar2.f43544C = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            mVar2.v();
        }
        ((m) this.f35743b).getClass();
    }

    public C2761h a() throws IOException {
        C3176h c3176h = (C3176h) this.f35743b;
        C2761h c2761h = new C2761h();
        Cursor cursorL = c3176h.f39194a.l(new Ne.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        while (cursorL.moveToNext()) {
            try {
                c2761h.add(Integer.valueOf(cursorL.getInt(0)));
            } finally {
            }
        }
        cursorL.close();
        C2761h c2761hM = tg.b.m(c2761h);
        if (c2761hM.f35910a.isEmpty()) {
            return c2761hM;
        }
        if (((C3176h) this.f35743b).f39200g == null) {
            throw new IllegalStateException("Required value was null.");
        }
        g gVar = ((C3176h) this.f35743b).f39200g;
        if (gVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        gVar.g();
        return c2761hM;
    }

    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, o2.k] */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        Set setA;
        C3816i c3816i;
        switch (this.f35742a) {
            case 0:
                ((h) this.f35743b).f15449c.c();
                return;
            case 1:
                ReentrantReadWriteLock.ReadLock lock = ((C3176h) this.f35743b).f39194a.f39231i.readLock();
                AbstractC3340k.d(lock, "readWriteLock.readLock()");
                lock.lock();
                try {
                    try {
                    } finally {
                        lock.unlock();
                        ((C3176h) this.f35743b).getClass();
                    }
                } catch (SQLiteException e7) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e7);
                    setA = x.f35434a;
                } catch (IllegalStateException e10) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                    setA = x.f35434a;
                }
                if (((C3176h) this.f35743b).a() && ((C3176h) this.f35743b).f39198e.compareAndSet(true, false) && !((C3176h) this.f35743b).f39194a.g().I().O()) {
                    InterfaceC3644a interfaceC3644aI = ((C3176h) this.f35743b).f39194a.g().I();
                    interfaceC3644aI.n();
                    try {
                        setA = a();
                        interfaceC3644aI.k();
                        if (setA.isEmpty()) {
                            return;
                        }
                        C3176h c3176h = (C3176h) this.f35743b;
                        synchronized (c3176h.f39202i) {
                            Iterator it = c3176h.f39202i.iterator();
                            while (true) {
                                C3982b c3982b = (C3982b) it;
                                if (c3982b.hasNext()) {
                                    ((AbstractC3175g) ((Map.Entry) c3982b.next()).getValue()).a(setA);
                                }
                            }
                        }
                        return;
                    } finally {
                        interfaceC3644aI.p();
                    }
                }
                return;
            case 2:
                l.e eVar = (l.e) this.f35743b;
                eVar.a(true);
                eVar.invalidateSelf();
                return;
            case 3:
                ViewOnTouchListenerC3570d viewOnTouchListenerC3570d = (ViewOnTouchListenerC3570d) this.f35743b;
                if (viewOnTouchListenerC3570d.f40781o) {
                    boolean z2 = viewOnTouchListenerC3570d.f40779m;
                    C3567a c3567a = viewOnTouchListenerC3570d.f40768a;
                    if (z2) {
                        viewOnTouchListenerC3570d.f40779m = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c3567a.f40762e = jCurrentAnimationTimeMillis;
                        c3567a.f40764g = -1L;
                        c3567a.f40763f = jCurrentAnimationTimeMillis;
                        c3567a.f40765h = 0.5f;
                    }
                    if ((c3567a.f40764g > 0 && AnimationUtils.currentAnimationTimeMillis() > c3567a.f40764g + c3567a.f40766i) || !viewOnTouchListenerC3570d.e()) {
                        viewOnTouchListenerC3570d.f40781o = false;
                        return;
                    }
                    boolean z10 = viewOnTouchListenerC3570d.f40780n;
                    ListView listView = viewOnTouchListenerC3570d.f40770c;
                    if (z10) {
                        viewOnTouchListenerC3570d.f40780n = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                        listView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c3567a.f40763f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = c3567a.a(jCurrentAnimationTimeMillis2);
                    long j8 = jCurrentAnimationTimeMillis2 - c3567a.f40763f;
                    c3567a.f40763f = jCurrentAnimationTimeMillis2;
                    viewOnTouchListenerC3570d.f40783q.scrollListBy((int) (j8 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * c3567a.f40761d));
                    WeakHashMap weakHashMap = S.f38779a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 4:
                this.f35743b.p();
                return;
            case 5:
                ((E) this.f35743b).f41545d.m();
                return;
            case 6:
                ((InterfaceC3724t) ((K) this.f35743b).f41616b).h();
                return;
            case 7:
                C3711o0 c3711o0 = (C3711o0) ((RunnableC3666A) this.f35743b).f41481b;
                U0 u02 = c3711o0.f42042r;
                c3711o0.f42041q = null;
                c3711o0.f42042r = null;
                u02.d(k0.f40682n.h("InternalSubchannel closed transport due to address change"));
                return;
            case 8:
                ((M0) ((j) this.f35743b).f34137a).s();
                return;
            case 9:
                M0 m02 = ((E0) this.f35743b).f41549b;
                m02.f41692m.e();
                if (m02.f41702w) {
                    m02.f41701v.h();
                    return;
                }
                return;
            case 10:
                C3711o0 c3711o02 = ((L0) this.f35743b).f41635i;
                k0 k0Var = M0.f41649h0;
                c3711o02.getClass();
                c3711o02.k.execute(new RunnableC3693i0(c3711o02, k0Var, i));
                return;
            case 11:
                C3691h1 c3691h1 = (C3691h1) this.f35743b;
                c3691h1.k = null;
                if (c3691h1.f41975h.b()) {
                    c3691h1.e();
                    return;
                }
                return;
            case 12:
                ((AbstractC3537e) ((C3685f1) this.f35743b).f41957c).o();
                return;
            case 13:
                B0 b02 = (B0) this.f35743b;
                if (b02.f41519z) {
                    return;
                }
                b02.f41514u.h();
                return;
            case 14:
                E1 e12 = (E1) this.f35743b;
                B0 b03 = (B0) e12.f41552c.f41915c;
                G1 g12 = e12.f41551b;
                W w2 = B0.f41487E;
                b03.q(g12);
                return;
            case 15:
                ((L1) this.f35743b).h();
                return;
            case 16:
                ((rb.c) this.f35743b).b(null);
                return;
            case 17:
                pd.c cVar = (pd.c) this.f35743b;
                m mVar = cVar.f43470d;
                try {
                    C1614c c1614c = cVar.f43475i;
                    if (c1614c != null) {
                        C1618g c1618g = cVar.f43468b;
                        long j10 = c1618g.f19902b;
                        if (j10 > 0) {
                            c1614c.E(c1618g, j10);
                        }
                    }
                } catch (IOException e11) {
                    mVar.q(e11);
                }
                try {
                    C1614c c1614c2 = cVar.f43475i;
                    if (c1614c2 != null) {
                        c1614c2.close();
                    }
                } catch (IOException e13) {
                    mVar.q(e13);
                }
                try {
                    Socket socket = cVar.f43476j;
                    if (socket != null) {
                        socket.close();
                        return;
                    }
                    return;
                } catch (IOException e14) {
                    mVar.q(e14);
                    return;
                }
            case 18:
                A2.d dVar = (A2.d) this.f35743b;
                long j11 = dVar.f271b;
                long jMax = Math.max(2 * j11, j11);
                C3677d c3677d = (C3677d) dVar.f272c;
                if (c3677d.f41934b.compareAndSet(j11, jMax)) {
                    C3677d.f41932c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{c3677d.f41933a, Long.valueOf(jMax)});
                    return;
                }
                return;
            case 19:
                b();
                return;
            case 20:
                C3838t0 c3838t0 = (C3838t0) this.f35743b;
                c3838t0.f43916l = null;
                c3838t0.drawableStateChanged();
                return;
            case 21:
                ActionMenuView actionMenuView = ((Toolbar) this.f35743b).f17977a;
                if (actionMenuView == null || (c3816i = actionMenuView.f17844t) == null) {
                    return;
                }
                c3816i.k();
                return;
            case 22:
                C3917c c3917c = (C3917c) this.f35743b;
                FFmpegKitConfig.e(c3917c);
                s4.a aVar = FFmpegKitConfig.f24192j;
                if (aVar != null) {
                    try {
                        aVar.f44947a.b(c3917c);
                        return;
                    } catch (Exception e15) {
                        AbstractC1593a.t("Exception thrown inside global complete callback.", AbstractC4249a.a(e15), "ffmpeg-kit");
                        return;
                    }
                }
                return;
            case 23:
                C3918d c3918d = (C3918d) this.f35743b;
                FFmpegKitConfig.f(c3918d);
                s4.a aVar2 = FFmpegKitConfig.k;
                if (aVar2 != null) {
                    try {
                        aVar2.f44947a.b(c3918d);
                        return;
                    } catch (Exception e16) {
                        AbstractC1593a.t("Exception thrown inside global complete callback.", AbstractC4249a.a(e16), "ffmpeg-kit");
                        return;
                    }
                }
                return;
            case 24:
                ((C4075d) this.f35743b).n(0);
                return;
            case 25:
                C2584N c2584n = (C2584N) this.f35743b;
                U[] uArr = c2584n.f34945r;
                int length = uArr.length;
                while (i < length) {
                    U u10 = uArr[i];
                    u10.o(true);
                    e0 e0Var = u10.f34989h;
                    if (e0Var != null) {
                        e0Var.y(u10.f34986e);
                        u10.f34989h = null;
                        u10.f34988g = null;
                    }
                    i++;
                }
                k kVar = c2584n.k;
                J5.k kVar2 = (J5.k) kVar.f19397c;
                if (kVar2 != null) {
                    kVar2.release();
                    kVar.f19397c = null;
                }
                kVar.f19398d = null;
                return;
            case 26:
                ((C4336a) this.f35743b).b(null);
                return;
            case 27:
                C4188n c4188n = (C4188n) this.f35743b;
                c4188n.removeCallbacks(this);
                MotionEvent motionEvent = c4188n.f46293e0;
                if (motionEvent != null) {
                    i = motionEvent.getToolType(0) == 3 ? 1 : 0;
                    int actionMasked = motionEvent.getActionMasked();
                    if (i != 0) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i5 = (actionMasked == 7 || actionMasked == 9) ? 7 : 2;
                    C4188n c4188n2 = (C4188n) this.f35743b;
                    c4188n2.v(motionEvent, i5, c4188n2.f46295f0, false);
                    return;
                }
                return;
            default:
                AbstractC4335b abstractC4335b = (AbstractC4335b) this.f35743b;
                if (abstractC4335b.c()) {
                    abstractC4335b.a(r.f47105a, k0.f40674e);
                    return;
                }
                return;
        }
    }
}
