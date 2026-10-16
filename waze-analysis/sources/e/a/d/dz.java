package e.a.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dz extends cx {

    /* renamed from: a, reason: collision with root package name */
    private final as f46838a;

    /* renamed from: b, reason: collision with root package name */
    private final u f46839b;

    /* synthetic */ dz(as asVar, u uVar) {
        this.f46838a = asVar;
        this.f46839b = uVar;
    }

    @Override // e.a.d.cx
    protected final as a() {
        return this.f46838a;
    }

    @Override // e.a.d.cx, e.a.d.aj
    public final af b(e.a.cq cqVar, e.a.cm cmVar, e.a.h hVar, e.a.p[] pVarArr) {
        return new dy(this, this.f46838a.b(cqVar, cmVar, hVar, pVarArr));
    }
}
