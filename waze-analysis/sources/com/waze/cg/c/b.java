package com.waze.cg.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class b implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f22311a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22312b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22313c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22314d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f22315e;

    public /* synthetic */ b(q qVar, p pVar, h.g.a.l lVar, com.waze.an.a.k kVar, int i2) {
        this.f22315e = i2;
        this.f22314d = qVar;
        this.f22312b = pVar;
        this.f22311a = lVar;
        this.f22313c = kVar;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        if (this.f22315e != 0) {
            Object obj = this.f22313c;
            return q.e((q) this.f22314d, (p) this.f22312b, this.f22311a, (com.waze.an.a.k) obj);
        }
        Object obj2 = this.f22314d;
        return q.a((q) this.f22312b, (p) this.f22313c, this.f22311a, (String) obj2);
    }

    public /* synthetic */ b(q qVar, p pVar, h.g.a.l lVar, String str, int i2) {
        this.f22315e = i2;
        this.f22312b = qVar;
        this.f22313c = pVar;
        this.f22311a = lVar;
        this.f22314d = str;
    }
}
