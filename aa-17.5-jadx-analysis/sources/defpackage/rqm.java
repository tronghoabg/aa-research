package defpackage;

/* loaded from: classes2.dex */
public final class rqm extends rqx {
    public yxc a;
    public yxy b;
    public yzz c;
    public int d;
    public int e;
    public int f;
    public int g;
    public xxh h;
    public xxh i;
    public xxh j;
    public xxh k;
    public xxh l;
    public xxh m;
    public xxh n;
    public byte o;
    private final xxh p;
    private final xxh q;
    private final xxh r;
    private yfq s;
    private ygp t;
    private ygr u;

    public rqm() {
        xvy xvyVar = xvy.a;
        this.p = xvyVar;
        this.q = xvyVar;
        this.r = xvyVar;
        this.h = xvyVar;
        this.i = xvyVar;
        this.j = xvyVar;
        this.k = xvyVar;
        this.l = xvyVar;
        this.m = xvyVar;
        this.n = xvyVar;
    }

    private static final boolean d(xxh xxhVar) {
        return !xxhVar.f() || ((Integer) xxhVar.b()).intValue() >= 0;
    }

    @Override // defpackage.rqx
    protected final /* synthetic */ rqy a(rqy rqyVar) {
        rqn rqnVar = (rqn) rqyVar;
        super.a(rqnVar);
        yzz yzzVar = yzz.CALENDAR_AGENDA_VIEW;
        yfq yfqVarR = yfq.r(yzzVar, yzz.CALENDAR_ALL_DAY_EVENTS_VIEW);
        yzz yzzVar2 = rqnVar.a;
        woy.ad(yfqVarR.contains(yzzVar2), "UiContext %s is not valid here", yzzVar2);
        int i = rqnVar.b;
        woy.ab(i >= 0, "Event item count can't be negative; it's %s", i);
        int i2 = rqnVar.c;
        woy.ab(i2 >= 0, "Callable event count can't be negative; it's %s", i2);
        int i3 = rqnVar.d;
        woy.ab(i3 >= 0, "Navigable event count can't be negative; it's %s", i3);
        int i4 = rqnVar.e;
        woy.ab(i4 >= 0, "Actionless event count can't be negative; it's %s", i4);
        xxh xxhVar = rqnVar.f;
        woy.ad(d(xxhVar), "All-day event item count can't be negative; it's %s", xxhVar);
        xxh xxhVar2 = rqnVar.h;
        woy.ad(d(xxhVar2), "Work profile event item count can't be negative; it's %s", xxhVar2);
        xxh xxhVar3 = rqnVar.i;
        woy.ad(d(xxhVar3), "Work profile callable event count can't be negative; it's %s", xxhVar3);
        xxh xxhVar4 = rqnVar.j;
        woy.ad(d(xxhVar4), "Work profile navigable event count can't be negative; it's %s", xxhVar4);
        xxh xxhVar5 = rqnVar.k;
        woy.ad(d(xxhVar5), "Work profile actionless event count can't be negative; it's %s", xxhVar5);
        xxh xxhVar6 = rqnVar.l;
        woy.ad(d(xxhVar6), "Work profile all-day event item count can't be negative; it's %s", xxhVar6);
        if (yzzVar2 == yzzVar) {
            woy.ad(xxhVar.f() || rqnVar.g.f() || xxhVar6.f(), "All-day events must be logged in the Agenda View.", yzzVar2);
            return rqnVar;
        }
        woy.ad(!xxhVar.f(), "allDayEventItemCountInAgenda is present outside of the agenda view. context: %s", yzzVar2);
        woy.ad(!rqnVar.g.f(), "allDayOverflowItemPresentInAgenda is present outside of the agenda view. context: %s", yzzVar2);
        woy.ad(!xxhVar6.f(), "workProfileAllDayEventItemCountInAgenda is present outside of the agenda view. context: %s", yzzVar2);
        return rqnVar;
    }

    @Override // defpackage.rqx
    protected final /* synthetic */ rqy b() {
        yxc yxcVar;
        yxy yxyVar;
        yzz yzzVar;
        if (this.s == null) {
            int i = yfq.d;
            this.s = yls.a;
        }
        ygp ygpVar = this.t;
        if (ygpVar != null) {
            this.u = ygpVar.g();
        } else if (this.u == null) {
            this.u = yly.a;
        }
        if (this.o == 15 && (yxcVar = this.a) != null && (yxyVar = this.b) != null && (yzzVar = this.c) != null) {
            return new rqn(yxcVar, yxyVar, this.p, this.q, this.r, this.s, this.u, yzzVar, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" carEventType");
        }
        if (this.b == null) {
            sb.append(" domainIdType");
        }
        if (this.c == null) {
            sb.append(" context");
        }
        if ((this.o & 1) == 0) {
            sb.append(" eventItemCount");
        }
        if ((this.o & 2) == 0) {
            sb.append(" callableEventCount");
        }
        if ((this.o & 4) == 0) {
            sb.append(" navigableEventCount");
        }
        if ((this.o & 8) == 0) {
            sb.append(" actionlessEventCount");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.rqx
    protected final ygp c() {
        if (this.t == null) {
            if (this.u == null) {
                this.t = new ygp();
            } else {
                ygp ygpVar = new ygp();
                this.t = ygpVar;
                ygpVar.k(this.u);
                this.u = null;
            }
        }
        return this.t;
    }
}
