package c9;

/* loaded from: classes4.dex */
public final class e extends i {

    /* renamed from: e, reason: collision with root package name */
    public int f19806e;

    public e(Object obj, Object obj2, g gVar, g gVar2) {
        super(obj, obj2, gVar, gVar2);
        this.f19806e = -1;
    }

    @Override // c9.g
    public final boolean d() {
        return false;
    }

    @Override // c9.i
    public final i k(Object obj, Object obj2, g gVar, g gVar2) {
        if (obj == null) {
            obj = this.f19808a;
        }
        if (obj2 == null) {
            obj2 = this.f19809b;
        }
        if (gVar == null) {
            gVar = this.f19810c;
        }
        if (gVar2 == null) {
            gVar2 = this.f19811d;
        }
        return new e(obj, obj2, gVar, gVar2);
    }

    @Override // c9.i
    public final int m() {
        return 2;
    }

    @Override // c9.i
    public final void q(i iVar) {
        if (this.f19806e != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        this.f19810c = iVar;
    }

    @Override // c9.g
    public final int size() {
        if (this.f19806e == -1) {
            this.f19806e = this.f19811d.size() + this.f19810c.size() + 1;
        }
        return this.f19806e;
    }
}
