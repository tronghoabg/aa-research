package U4;

import A7.AbstractC0279p0;
import D9.j;
import E4.B;
import E4.o;
import E4.s;
import E4.w;
import Y4.i;
import Y4.m;
import Z4.e;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.g;
import java.util.ArrayList;
import java.util.Iterator;
import ka.AbstractC3230e0;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: A, reason: collision with root package name */
    public static final boolean f12284A = Log.isLoggable("Request", 2);

    /* renamed from: a, reason: collision with root package name */
    public final String f12285a;

    /* renamed from: b, reason: collision with root package name */
    public final e f12286b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12287c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f12288d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.c f12289e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f12290f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f12291g;

    /* renamed from: h, reason: collision with root package name */
    public final g f12292h;

    /* renamed from: i, reason: collision with root package name */
    public final int f12293i;

    /* renamed from: j, reason: collision with root package name */
    public final int f12294j;
    public final com.bumptech.glide.d k;

    /* renamed from: l, reason: collision with root package name */
    public final V4.a f12295l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f12296m;

    /* renamed from: n, reason: collision with root package name */
    public final W4.a f12297n;

    /* renamed from: o, reason: collision with root package name */
    public final Y4.g f12298o;

    /* renamed from: p, reason: collision with root package name */
    public B f12299p;

    /* renamed from: q, reason: collision with root package name */
    public Dd.c f12300q;

    /* renamed from: r, reason: collision with root package name */
    public long f12301r;

    /* renamed from: s, reason: collision with root package name */
    public volatile o f12302s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f12303t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f12304u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f12305v;

    /* renamed from: w, reason: collision with root package name */
    public int f12306w;

    /* renamed from: x, reason: collision with root package name */
    public int f12307x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f12308y;

    /* renamed from: z, reason: collision with root package name */
    public int f12309z;

    public d(Context context, com.bumptech.glide.c cVar, Object obj, Object obj2, Class cls, g gVar, int i5, int i10, com.bumptech.glide.d dVar, V4.a aVar, ArrayList arrayList, o oVar, W4.a aVar2, Y4.g gVar2) {
        this.f12285a = f12284A ? String.valueOf(hashCode()) : null;
        this.f12286b = new e();
        this.f12287c = obj;
        this.f12288d = context;
        this.f12289e = cVar;
        this.f12290f = obj2;
        this.f12291g = cls;
        this.f12292h = gVar;
        this.f12293i = i5;
        this.f12294j = i10;
        this.k = dVar;
        this.f12295l = aVar;
        this.f12296m = arrayList;
        this.f12302s = oVar;
        this.f12297n = aVar2;
        this.f12298o = gVar2;
        this.f12309z = 1;
        cVar.getClass();
    }

    public final void a() {
        synchronized (this.f12287c) {
            try {
                if (this.f12308y) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f12286b.a();
                int i5 = i.f16694b;
                this.f12301r = SystemClock.elapsedRealtimeNanos();
                if (this.f12290f == null) {
                    if (m.g(this.f12293i, this.f12294j)) {
                        this.f12306w = this.f12293i;
                        this.f12307x = this.f12294j;
                    }
                    if (this.f12305v == null) {
                        this.f12292h.getClass();
                        this.f12305v = null;
                    }
                    i(new w("Received null model"), this.f12305v == null ? 5 : 3);
                    return;
                }
                int i10 = this.f12309z;
                if (i10 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i10 == 4) {
                    j(this.f12299p, 5);
                    return;
                }
                this.f12309z = 3;
                if (m.g(this.f12293i, this.f12294j)) {
                    l(this.f12293i, this.f12294j);
                } else {
                    V4.a aVar = this.f12295l;
                    l(aVar.f13015a, aVar.f13016b);
                }
                int i11 = this.f12309z;
                if (i11 == 2 || i11 == 3) {
                    V4.a aVar2 = this.f12295l;
                    d();
                    aVar2.getClass();
                }
                if (f12284A) {
                    h("finished run method in " + i.a(this.f12301r));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (this.f12308y) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f12286b.a();
        this.f12295l.getClass();
        Dd.c cVar = this.f12300q;
        if (cVar != null) {
            synchronized (((o) cVar.f2644d)) {
                ((s) cVar.f2642b).j((d) cVar.f2643c);
            }
            this.f12300q = null;
        }
    }

    public final void c() {
        synchronized (this.f12287c) {
            try {
                if (this.f12308y) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f12286b.a();
                if (this.f12309z == 6) {
                    return;
                }
                b();
                B b5 = this.f12299p;
                if (b5 != null) {
                    this.f12299p = null;
                } else {
                    b5 = null;
                }
                this.f12295l.c(d());
                this.f12309z = 6;
                if (b5 != null) {
                    this.f12302s.getClass();
                    o.g(b5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Drawable d() {
        if (this.f12304u == null) {
            g gVar = this.f12292h;
            gVar.getClass();
            this.f12304u = null;
            int i5 = gVar.f12272d;
            if (i5 > 0) {
                this.f12292h.getClass();
                Resources.Theme theme = this.f12288d.getTheme();
                com.bumptech.glide.c cVar = this.f12289e;
                this.f12304u = AbstractC3230e0.q(cVar, cVar, i5, theme);
            }
        }
        return this.f12304u;
    }

    public final boolean e() {
        boolean z2;
        synchronized (this.f12287c) {
            z2 = this.f12309z == 4;
        }
        return z2;
    }

    public final boolean f(b bVar) {
        int i5;
        int i10;
        Object obj;
        Class cls;
        g gVar;
        com.bumptech.glide.d dVar;
        int size;
        int i11;
        int i12;
        Object obj2;
        Class cls2;
        g gVar2;
        com.bumptech.glide.d dVar2;
        int size2;
        if (!(bVar instanceof d)) {
            return false;
        }
        synchronized (this.f12287c) {
            try {
                i5 = this.f12293i;
                i10 = this.f12294j;
                obj = this.f12290f;
                cls = this.f12291g;
                gVar = this.f12292h;
                dVar = this.k;
                ArrayList arrayList = this.f12296m;
                size = arrayList != null ? arrayList.size() : 0;
            } finally {
            }
        }
        d dVar3 = (d) bVar;
        synchronized (dVar3.f12287c) {
            try {
                i11 = dVar3.f12293i;
                i12 = dVar3.f12294j;
                obj2 = dVar3.f12290f;
                cls2 = dVar3.f12291g;
                gVar2 = dVar3.f12292h;
                dVar2 = dVar3.k;
                ArrayList arrayList2 = dVar3.f12296m;
                size2 = arrayList2 != null ? arrayList2.size() : 0;
            } finally {
            }
        }
        if (i5 != i11 || i10 != i12) {
            return false;
        }
        char[] cArr = m.f16700a;
        return (obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2) && gVar.equals(gVar2) && dVar == dVar2 && size == size2;
    }

    public final boolean g() {
        boolean z2;
        synchronized (this.f12287c) {
            int i5 = this.f12309z;
            z2 = i5 == 2 || i5 == 3;
        }
        return z2;
    }

    public final void h(String str) {
        StringBuilder sbQ = AbstractC0279p0.q(str, " this: ");
        sbQ.append(this.f12285a);
        Log.v("Request", sbQ.toString());
    }

    public final void i(w wVar, int i5) {
        Drawable drawableD;
        this.f12286b.a();
        synchronized (this.f12287c) {
            try {
                wVar.getClass();
                int i10 = this.f12289e.f24225g;
                if (i10 <= i5) {
                    Log.w("Glide", "Load failed for " + this.f12290f + " with size [" + this.f12306w + "x" + this.f12307x + "]", wVar);
                    if (i10 <= 4) {
                        wVar.d();
                    }
                }
                this.f12300q = null;
                this.f12309z = 5;
                this.f12308y = true;
                try {
                    ArrayList arrayList = this.f12296m;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((j) it.next()).a(wVar);
                        }
                    }
                    if (this.f12290f == null) {
                        if (this.f12305v == null) {
                            this.f12292h.getClass();
                            this.f12305v = null;
                        }
                        drawableD = this.f12305v;
                    } else {
                        drawableD = null;
                    }
                    if (drawableD == null) {
                        if (this.f12303t == null) {
                            this.f12292h.getClass();
                            this.f12303t = null;
                        }
                        drawableD = this.f12303t;
                    }
                    if (drawableD == null) {
                        drawableD = d();
                    }
                    this.f12295l.d(drawableD);
                    this.f12308y = false;
                } catch (Throwable th) {
                    this.f12308y = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j(B b5, int i5) {
        this.f12286b.a();
        B b10 = null;
        try {
            synchronized (this.f12287c) {
                try {
                    this.f12300q = null;
                    if (b5 == null) {
                        i(new w("Expected to receive a Resource<R> with an object of " + this.f12291g + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = b5.get();
                    if (obj != null && this.f12291g.isAssignableFrom(obj.getClass())) {
                        k(b5, obj, i5);
                        return;
                    }
                    try {
                        this.f12299p = null;
                        StringBuilder sb2 = new StringBuilder("Expected to receive an object of ");
                        sb2.append(this.f12291g);
                        sb2.append(" but instead got ");
                        sb2.append(obj != null ? obj.getClass() : "");
                        sb2.append("{");
                        sb2.append(obj);
                        sb2.append("} inside Resource{");
                        sb2.append(b5);
                        sb2.append("}.");
                        sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        i(new w(sb2.toString()), 5);
                        this.f12302s.getClass();
                        o.g(b5);
                    } catch (Throwable th) {
                        b10 = b5;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (b10 != null) {
                this.f12302s.getClass();
                o.g(b10);
            }
            throw th3;
        }
    }

    public final void k(B b5, Object obj, int i5) {
        this.f12309z = 4;
        this.f12299p = b5;
        if (this.f12289e.f24225g <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + AbstractC0279p0.y(i5) + " for " + this.f12290f + " with size [" + this.f12306w + "x" + this.f12307x + "] in " + i.a(this.f12301r) + " ms");
        }
        this.f12308y = true;
        try {
            ArrayList arrayList = this.f12296m;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).getClass();
                    D9.e.a("Image Downloading  Success : " + ((Drawable) obj));
                }
            }
            this.f12297n.getClass();
            this.f12295l.e(obj);
            this.f12308y = false;
        } catch (Throwable th) {
            this.f12308y = false;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(int i5, int i10) throws Throwable {
        d dVar = this;
        int iRound = i5;
        dVar.f12286b.a();
        Object obj = dVar.f12287c;
        synchronized (obj) {
            try {
                try {
                    boolean z2 = f12284A;
                    if (z2) {
                        dVar.h("Got onSizeReady in " + i.a(dVar.f12301r));
                    }
                    if (dVar.f12309z == 3) {
                        dVar.f12309z = 2;
                        dVar.f12292h.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        dVar.f12306w = iRound;
                        dVar.f12307x = i10 == Integer.MIN_VALUE ? i10 : Math.round(1.0f * i10);
                        if (z2) {
                            dVar.h("finished setup for calling load in " + i.a(dVar.f12301r));
                        }
                        o oVar = dVar.f12302s;
                        com.bumptech.glide.c cVar = dVar.f12289e;
                        Object obj2 = dVar.f12290f;
                        g gVar = dVar.f12292h;
                        B4.d dVar2 = gVar.f12276h;
                        try {
                            int i11 = dVar.f12306w;
                            int i12 = dVar.f12307x;
                            Class cls = gVar.f12279l;
                            try {
                                Class cls2 = dVar.f12291g;
                                com.bumptech.glide.d dVar3 = dVar.k;
                                E4.m mVar = gVar.f12270b;
                                try {
                                    Y4.d dVar4 = gVar.k;
                                    boolean z10 = gVar.f12277i;
                                    boolean z11 = gVar.f12282o;
                                    try {
                                        B4.g gVar2 = gVar.f12278j;
                                        boolean z12 = gVar.f12273e;
                                        boolean z13 = gVar.f12283p;
                                        Y4.g gVar3 = dVar.f12298o;
                                        dVar = obj;
                                        try {
                                            dVar.f12300q = oVar.a(cVar, obj2, dVar2, i11, i12, cls, cls2, dVar3, mVar, dVar4, z10, z11, gVar2, z12, z13, dVar, gVar3);
                                            if (dVar.f12309z != 2) {
                                                dVar.f12300q = null;
                                            }
                                            if (z2) {
                                                dVar.h("finished onSizeReady in " + i.a(dVar.f12301r));
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        dVar = obj;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    dVar = obj;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                dVar = obj;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            dVar = obj;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                dVar = obj;
            }
        }
    }

    public final void m() {
        synchronized (this.f12287c) {
            try {
                if (g()) {
                    c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
