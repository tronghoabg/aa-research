package E5;

import G5.C0527h;
import android.content.Context;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3516a;

    /* renamed from: b, reason: collision with root package name */
    public final u6.q f3517b;

    /* renamed from: c, reason: collision with root package name */
    public final C0466p f3518c;

    /* renamed from: d, reason: collision with root package name */
    public final C0466p f3519d;

    /* renamed from: e, reason: collision with root package name */
    public final C0466p f3520e;

    /* renamed from: f, reason: collision with root package name */
    public final C0466p f3521f;

    /* renamed from: g, reason: collision with root package name */
    public Looper f3522g;

    /* renamed from: h, reason: collision with root package name */
    public final C0527h f3523h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3524i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3525j;
    public final C0 k;

    /* renamed from: l, reason: collision with root package name */
    public final long f3526l;

    /* renamed from: m, reason: collision with root package name */
    public final long f3527m;

    /* renamed from: n, reason: collision with root package name */
    public final C0457j f3528n;

    /* renamed from: o, reason: collision with root package name */
    public final long f3529o;

    /* renamed from: p, reason: collision with root package name */
    public final long f3530p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3531q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f3532r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3533s;

    public r(Context context) {
        C0466p c0466p = new C0466p(context, 0);
        C0466p c0466p2 = new C0466p(context, 1);
        C0466p c0466p3 = new C0466p(context, 2);
        C0466p c0466p4 = new C0466p(context, 3);
        context.getClass();
        this.f3516a = context;
        this.f3518c = c0466p;
        this.f3519d = c0466p2;
        this.f3520e = c0466p3;
        this.f3521f = c0466p4;
        int i5 = u6.v.f46721a;
        Looper looperMyLooper = Looper.myLooper();
        this.f3522g = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f3523h = C0527h.f4408g;
        this.f3524i = 1;
        this.f3525j = true;
        this.k = C0.f3013c;
        this.f3526l = 5000L;
        this.f3527m = 15000L;
        this.f3528n = new C0457j(u6.v.y(20L), u6.v.y(500L));
        this.f3517b = u6.q.f46713a;
        this.f3529o = 500L;
        this.f3530p = 2000L;
        this.f3532r = true;
    }
}
