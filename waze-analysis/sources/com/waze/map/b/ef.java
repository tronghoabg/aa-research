package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class ef implements com.waze.shared_infra.s.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f28242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28243b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28244c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f28245d;

    public /* synthetic */ ef(bd bdVar, com.waze.map.canvas.bn bnVar, com.waze.shared_infra.h.c cVar, int i2) {
        this.f28245d = i2;
        this.f28243b = bdVar;
        this.f28244c = bnVar;
        this.f28242a = cVar;
    }

    @Override // com.waze.shared_infra.s.d
    public final void a() {
        if (this.f28245d != 0) {
            Object obj = this.f28242a;
            bd.E((bd) this.f28243b, (com.waze.map.canvas.bn) this.f28244c, (com.waze.shared_infra.h.c) obj);
        } else {
            Object obj2 = this.f28244c;
            fd.P((fd) this.f28242a, (com.waze.map.bv) this.f28243b, (com.waze.map.bs) obj2);
        }
    }

    public /* synthetic */ ef(fd fdVar, com.waze.map.bv bvVar, com.waze.map.bs bsVar, int i2) {
        this.f28245d = i2;
        this.f28242a = fdVar;
        this.f28243b = bvVar;
        this.f28244c = bsVar;
    }
}
