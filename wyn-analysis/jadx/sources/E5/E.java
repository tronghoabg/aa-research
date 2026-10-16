package E5;

/* loaded from: classes3.dex */
public final /* synthetic */ class E implements u6.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3020a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v6.o f3021b;

    public /* synthetic */ E(F5.a aVar, v6.o oVar) {
        this.f3021b = oVar;
    }

    @Override // u6.g
    public final void invoke(Object obj) {
        switch (this.f3020a) {
            case 0:
                ((u0) obj).x(this.f3021b);
                break;
            default:
                F5.j jVar = (F5.j) obj;
                S3.e eVar = jVar.f3929o;
                v6.o oVar = this.f3021b;
                if (eVar != null) {
                    T t10 = (T) eVar.f10941b;
                    if (t10.f3244r == -1) {
                        S sA = t10.a();
                        sA.f3209p = oVar.f46899a;
                        sA.f3210q = oVar.f46900b;
                        jVar.f3929o = new S3.e(new T(sA), false, (String) eVar.f10942c, 5);
                    }
                }
                int i5 = oVar.f46899a;
                break;
        }
    }

    public /* synthetic */ E(v6.o oVar) {
        this.f3021b = oVar;
    }
}
