package Se;

/* loaded from: classes5.dex */
public final class h extends He.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11079a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11080b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11081c;

    public /* synthetic */ h(int i5, Object obj, Object obj2) {
        this.f11079a = i5;
        this.f11080b = obj;
        this.f11081c = obj2;
    }

    @Override // He.g
    public final void c(He.h hVar) {
        switch (this.f11079a) {
            case 0:
                ((He.n) this.f11080b).b(new f(hVar, (Le.d) this.f11081c, 1));
                break;
            default:
                He.g[] gVarArr = (He.g[]) this.f11080b;
                int length = gVarArr.length;
                if (length == 1) {
                    gVarArr[0].b(new Qe.d(hVar, new Y9.c(this, 23), 1));
                    break;
                } else {
                    v vVar = new v(hVar, length, (x4.d) this.f11081c);
                    hVar.a(vVar);
                    for (int i5 = 0; i5 < length; i5++) {
                        if (vVar.get() <= 0) {
                            break;
                        } else {
                            He.g gVar = gVarArr[i5];
                            if (gVar == null) {
                                NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                                if (vVar.getAndSet(0) > 0) {
                                    vVar.a(i5);
                                    vVar.f11108a.onError(nullPointerException);
                                    break;
                                } else {
                                    S3.f.A(nullPointerException);
                                    break;
                                }
                            } else {
                                gVar.b(vVar.f11110c[i5]);
                            }
                        }
                    }
                    break;
                }
        }
    }
}
