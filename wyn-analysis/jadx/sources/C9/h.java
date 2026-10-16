package c9;

/* loaded from: classes4.dex */
public final class h extends i {
    @Override // c9.g
    public final boolean d() {
        return true;
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
        return new h(obj, obj2, gVar, gVar2);
    }

    @Override // c9.i
    public final int m() {
        return 1;
    }

    @Override // c9.g
    public final int size() {
        return this.f19811d.size() + this.f19810c.size() + 1;
    }
}
