package e.a.f;

import e.a.cm;
import e.a.cp;
import e.a.cq;
import e.a.d.jt;
import e.a.d.kc;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class t extends e.a.d.c {

    /* renamed from: a, reason: collision with root package name */
    private static final k.h f47731a = new k.h();

    /* renamed from: b, reason: collision with root package name */
    private final cq f47732b;

    /* renamed from: c, reason: collision with root package name */
    private final String f47733c;

    /* renamed from: d, reason: collision with root package name */
    private final jt f47734d;

    /* renamed from: e, reason: collision with root package name */
    private final String f47735e;

    /* renamed from: f, reason: collision with root package name */
    private final s f47736f;

    /* renamed from: g, reason: collision with root package name */
    private final r f47737g;

    /* renamed from: h, reason: collision with root package name */
    private final e.a.c f47738h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f47739i;

    t(cq cqVar, cm cmVar, h hVar, ac acVar, aq aqVar, Object obj, int i2, int i3, String str, String str2, jt jtVar, kc kcVar, e.a.h hVar2) {
        super(new al(), jtVar, kcVar, cmVar, hVar2);
        this.f47737g = new r(this);
        this.f47739i = false;
        this.f47734d = jtVar;
        this.f47732b = cqVar;
        this.f47735e = str;
        this.f47733c = str2;
        this.f47738h = acVar.v();
        cqVar.f();
        this.f47736f = new s(this, i2, jtVar, obj, hVar, aqVar, acVar, i3, hVar2);
    }

    protected final s F() {
        return this.f47736f;
    }

    final boolean K() {
        return false;
    }

    @Override // e.a.d.af
    public final e.a.c a() {
        return this.f47738h;
    }

    @Override // e.a.d.c
    protected final /* synthetic */ e.a.d.a p() {
        return this.f47737g;
    }

    @Override // e.a.d.c, e.a.d.f
    protected final /* synthetic */ e.a.d.e q() {
        return this.f47736f;
    }

    @Override // e.a.d.c
    protected final /* synthetic */ e.a.d.e v() {
        return this.f47736f;
    }

    public final cp z() {
        return this.f47732b.b();
    }
}
