package e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ar {

    /* renamed from: a, reason: collision with root package name */
    private String f46275a;

    /* renamed from: b, reason: collision with root package name */
    private as f46276b;

    /* renamed from: c, reason: collision with root package name */
    private Long f46277c;

    /* renamed from: d, reason: collision with root package name */
    private be f46278d;

    public final at a() {
        com.google.d.b.an.C(this.f46275a, "description");
        com.google.d.b.an.C(this.f46276b, "severity");
        com.google.d.b.an.C(this.f46277c, "timestampNanos");
        com.google.d.b.an.v(true, "at least one of channelRef and subchannelRef must be null");
        return new at(this.f46275a, this.f46276b, this.f46277c.longValue(), this.f46278d);
    }

    public final void b(String str) {
        this.f46275a = str;
    }

    public final void c(as asVar) {
        this.f46276b = asVar;
    }

    public final void d(be beVar) {
        this.f46278d = beVar;
    }

    public final void e(long j2) {
        this.f46277c = Long.valueOf(j2);
    }
}
