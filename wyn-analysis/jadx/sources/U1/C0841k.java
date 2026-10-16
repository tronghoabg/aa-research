package U1;

import E5.C0466p;
import E5.C0467q;
import J9.C0664x;
import N1.C0754c;
import android.content.Context;
import android.os.Looper;
import k8.InterfaceC3207p;

/* renamed from: U1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0841k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12090a;

    /* renamed from: b, reason: collision with root package name */
    public final Q1.q f12091b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3207p f12092c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC3207p f12093d;

    /* renamed from: e, reason: collision with root package name */
    public final C0466p f12094e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC3207p f12095f;

    /* renamed from: g, reason: collision with root package name */
    public final C0466p f12096g;

    /* renamed from: h, reason: collision with root package name */
    public final C0664x f12097h;

    /* renamed from: i, reason: collision with root package name */
    public final Looper f12098i;

    /* renamed from: j, reason: collision with root package name */
    public final int f12099j;
    public final C0754c k;

    /* renamed from: l, reason: collision with root package name */
    public final int f12100l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12101m;

    /* renamed from: n, reason: collision with root package name */
    public final a0 f12102n;

    /* renamed from: o, reason: collision with root package name */
    public C0836f f12103o;

    /* renamed from: p, reason: collision with root package name */
    public final long f12104p;

    /* renamed from: q, reason: collision with root package name */
    public final long f12105q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f12106r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f12107s;

    /* renamed from: t, reason: collision with root package name */
    public final String f12108t;

    public C0841k(Context context) {
        this(context, new C0466p(context, 8), new C0466p(context, 9));
    }

    public final C0850u a() {
        Q1.k.g(!this.f12107s);
        this.f12107s = true;
        int i5 = Q1.x.f9724a;
        return new C0850u(this);
    }

    public C0841k(Context context, InterfaceC3207p interfaceC3207p, InterfaceC3207p interfaceC3207p2) {
        C0466p c0466p = new C0466p(context, 6);
        C0467q c0467q = new C0467q(2);
        C0466p c0466p2 = new C0466p(context, 7);
        C0664x c0664x = new C0664x(24);
        context.getClass();
        this.f12090a = context;
        this.f12092c = interfaceC3207p;
        this.f12093d = interfaceC3207p2;
        this.f12094e = c0466p;
        this.f12095f = c0467q;
        this.f12096g = c0466p2;
        this.f12097h = c0664x;
        int i5 = Q1.x.f9724a;
        Looper looperMyLooper = Looper.myLooper();
        this.f12098i = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.k = C0754c.f8139e;
        this.f12100l = 1;
        this.f12101m = true;
        this.f12102n = a0.f12019c;
        this.f12103o = new C0836f(0.97f, 1.03f, 1000L, 1.0E-7f, Q1.x.K(20L), Q1.x.K(500L), 0.999f);
        this.f12091b = Q1.q.f9708a;
        this.f12104p = 500L;
        this.f12105q = 2000L;
        this.f12106r = true;
        this.f12108t = "";
        this.f12099j = -1000;
    }
}
