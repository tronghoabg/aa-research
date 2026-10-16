package com.google.d.c;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class ao extends p {

    /* renamed from: g, reason: collision with root package name */
    final Object f7312g;

    /* renamed from: h, reason: collision with root package name */
    final int f7313h;

    /* renamed from: i, reason: collision with root package name */
    final be f7314i;

    /* renamed from: j, reason: collision with root package name */
    volatile as f7315j = bd.f7345b;

    ao(Object obj, int i2, be beVar) {
        this.f7312g = obj;
        this.f7313h = i2;
        this.f7314i = beVar;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final int a() {
        return this.f7313h;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final as d() {
        return this.f7315j;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final be e() {
        return this.f7314i;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final Object j() {
        return this.f7312g;
    }

    @Override // com.google.d.c.p, com.google.d.c.be
    public final void p(as asVar) {
        this.f7315j = asVar;
    }
}
