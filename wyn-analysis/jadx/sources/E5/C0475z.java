package E5;

import t5.C4114i;

/* renamed from: E5.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0475z implements u6.g, Q1.g, B5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3574b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3575c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3576d;

    public /* synthetic */ C0475z(Object obj, int i5, int i10, Object obj2) {
        this.f3573a = i10;
        this.f3574b = i5;
        this.f3575c = obj;
        this.f3576d = obj2;
    }

    @Override // B5.b
    public Object execute() {
        ((z5.f) this.f3575c).f48386d.a((C4114i) this.f3576d, this.f3574b + 1, false);
        return null;
    }

    @Override // u6.g
    public void invoke(Object obj) {
        switch (this.f3573a) {
            case 0:
                u0 u0Var = (u0) obj;
                u0Var.getClass();
                u0Var.p((v0) this.f3575c, (v0) this.f3576d, this.f3574b);
                break;
            default:
                N1.H h10 = (N1.H) obj;
                h10.getClass();
                h10.t((N1.I) this.f3575c, (N1.I) this.f3576d, this.f3574b);
                break;
        }
    }

    public /* synthetic */ C0475z(z5.f fVar, C4114i c4114i, int i5) {
        this.f3573a = 2;
        this.f3575c = fVar;
        this.f3576d = c4114i;
        this.f3574b = i5;
    }
}
