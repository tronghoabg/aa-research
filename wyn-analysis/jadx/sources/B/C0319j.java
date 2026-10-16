package B;

/* renamed from: B.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0319j implements N.B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1435a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N.V f1436b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D.i f1437c;

    public /* synthetic */ C0319j(N.V v2, D.i iVar, int i5) {
        this.f1435a = i5;
        this.f1436b = v2;
        this.f1437c = iVar;
    }

    @Override // N.B
    public final void dispose() {
        switch (this.f1435a) {
            case 0:
                N.V v2 = this.f1436b;
                D.k kVar = (D.k) v2.getValue();
                if (kVar != null) {
                    this.f1437c.f2248a.b(new D.j(kVar));
                    v2.setValue(null);
                    break;
                }
                break;
            case 1:
                N.V v10 = this.f1436b;
                D.a aVar = (D.a) v10.getValue();
                if (aVar != null) {
                    D.b bVar = new D.b(aVar);
                    D.i iVar = this.f1437c;
                    if (iVar != null) {
                        iVar.f2248a.b(bVar);
                    }
                    v10.setValue(null);
                    break;
                }
                break;
            default:
                N.V v11 = this.f1436b;
                D.e eVar = (D.e) v11.getValue();
                if (eVar != null) {
                    this.f1437c.f2248a.b(new D.f(eVar));
                    v11.setValue(null);
                    break;
                }
                break;
        }
    }
}
