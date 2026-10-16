package q2;

import K8.H;
import N1.C;
import N1.C0764m;
import N1.C0765n;
import N1.Y;
import Q1.x;
import U1.C0848s;
import Y2.B;
import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.impl.T0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArraySet;
import l8.e0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: p, reason: collision with root package name */
    public static final T0 f44054p = new T0(2);

    /* renamed from: a, reason: collision with root package name */
    public final Context f44055a;

    /* renamed from: b, reason: collision with root package name */
    public final i f44056b;

    /* renamed from: c, reason: collision with root package name */
    public final m f44057c;

    /* renamed from: d, reason: collision with root package name */
    public final p f44058d;

    /* renamed from: e, reason: collision with root package name */
    public final k f44059e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f44060f;

    /* renamed from: g, reason: collision with root package name */
    public final B f44061g;

    /* renamed from: h, reason: collision with root package name */
    public final Q1.q f44062h;

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArraySet f44063i;

    /* renamed from: j, reason: collision with root package name */
    public C0765n f44064j;
    public C0848s k;

    /* renamed from: l, reason: collision with root package name */
    public Q1.s f44065l;

    /* renamed from: m, reason: collision with root package name */
    public Pair f44066m;

    /* renamed from: n, reason: collision with root package name */
    public int f44067n;

    /* renamed from: o, reason: collision with root package name */
    public int f44068o;

    public l(H h10) {
        Context context = (Context) h10.f6583b;
        this.f44055a = context;
        i iVar = new i(this, context);
        this.f44056b = iVar;
        Q1.q qVar = (Q1.q) h10.f6588g;
        this.f44062h = qVar;
        m mVar = (m) h10.f6584c;
        this.f44057c = mVar;
        mVar.k = qVar;
        p pVar = new p(new com.google.android.gms.ads.nativead.l(this, 16), mVar);
        this.f44058d = pVar;
        k kVar = (k) h10.f6586e;
        Q1.k.h(kVar);
        this.f44059e = kVar;
        this.f44060f = (e0) h10.f6587f;
        this.f44061g = new B(mVar, pVar);
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f44063i = copyOnWriteArraySet;
        this.f44068o = 0;
        copyOnWriteArraySet.add(iVar);
    }

    public static void a(l lVar, long j8, long j10) {
        p pVar = lVar.f44058d;
        G4.f fVar = pVar.f44106f;
        int i5 = fVar.f4234b;
        if (i5 == 0) {
            return;
        }
        if (i5 == 0) {
            throw new NoSuchElementException();
        }
        long j11 = ((long[]) fVar.f4236d)[fVar.f4233a];
        Long l10 = (Long) pVar.f44105e.j(j11);
        m mVar = pVar.f44102b;
        if (l10 != null && l10.longValue() != pVar.f44109i) {
            pVar.f44109i = l10.longValue();
            mVar.d(2);
        }
        int iA = pVar.f44102b.a(j11, j8, j10, pVar.f44109i, false, pVar.f44103c);
        l lVar2 = (l) pVar.f44101a.f26356b;
        if (iA != 0 && iA != 1) {
            if (iA != 2 && iA != 3 && iA != 4) {
                if (iA != 5) {
                    throw new IllegalStateException(String.valueOf(iA));
                }
                return;
            }
            pVar.f44110j = j11;
            fVar.T();
            Iterator it = lVar2.f44063i.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                iVar.f44051m.execute(new RunnableC3864h(iVar, iVar.f44050l, 2));
            }
            Q1.k.h(null);
            throw null;
        }
        pVar.f44110j = j11;
        Y y10 = (Y) pVar.f44104d.j(fVar.T());
        if (y10 != null && !y10.equals(Y.f8125d) && !y10.equals(pVar.f44108h)) {
            pVar.f44108h = y10;
            C0764m c0764m = new C0764m();
            c0764m.f8201t = y10.f8126a;
            c0764m.f8202u = y10.f8127b;
            c0764m.f8194m = C.m("video/raw");
            lVar2.f44064j = new C0765n(c0764m);
            Iterator it2 = lVar2.f44063i.iterator();
            while (it2.hasNext()) {
                i iVar2 = (i) it2.next();
                iVar2.f44051m.execute(new RunnableC3864h(iVar2, iVar2.f44050l, y10));
            }
        }
        boolean z2 = mVar.f44072d != 3;
        mVar.f44072d = 3;
        mVar.k.getClass();
        mVar.f44074f = x.K(SystemClock.elapsedRealtime());
        if (z2 && lVar2.f44066m != null) {
            Iterator it3 = lVar2.f44063i.iterator();
            while (it3.hasNext()) {
                i iVar3 = (i) it3.next();
                iVar3.f44051m.execute(new RunnableC3864h(iVar3, iVar3.f44050l, 1));
            }
        }
        if (lVar2.k != null) {
            if (lVar2.f44064j == null) {
                new C0764m().a();
            }
            C0848s c0848s = lVar2.k;
            lVar2.f44062h.getClass();
            System.nanoTime();
            c0848s.g();
        }
        Q1.k.h(null);
        throw null;
    }
}
