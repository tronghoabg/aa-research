package k;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    public int f50796a;

    /* renamed from: b, reason: collision with root package name */
    public e[] f50797b = new e[8];

    private final void d(int i2, e eVar) {
        while (true) {
            int i3 = i2 >> 1;
            if (i3 == 0) {
                break;
            }
            e eVar2 = this.f50797b[i3];
            h.g.b.x.c(eVar2);
            if (h.g.b.x.b(0L, eVar.e() - eVar2.e()) <= 0) {
                break;
            }
            eVar2.f50836b = i2;
            this.f50797b[i2] = eVar2;
            i2 = i3;
        }
        this.f50797b[i2] = eVar;
        eVar.f50836b = i2;
    }

    public final e a() {
        return this.f50797b[1];
    }

    public final void b(e eVar) {
        h.g.b.x.f(eVar, "node");
        int i2 = this.f50796a + 1;
        this.f50796a = i2;
        e[] eVarArr = this.f50797b;
        if (i2 == eVarArr.length) {
            e[] eVarArr2 = new e[i2 + i2];
            h.a.c.aL(eVarArr, eVarArr2, 0, 0, 0, 14);
            this.f50797b = eVarArr2;
        }
        d(i2, eVar);
    }

    public final void c(e eVar) {
        e eVar2;
        h.g.b.x.f(eVar, "node");
        int i2 = eVar.f50836b;
        if (i2 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i3 = this.f50796a;
        e eVar3 = this.f50797b[i3];
        h.g.b.x.c(eVar3);
        eVar.f50836b = -1;
        this.f50797b[i3] = null;
        this.f50796a = i3 - 1;
        if (eVar == eVar3) {
            return;
        }
        int iB = h.g.b.x.b(0L, eVar3.e() - eVar.e());
        if (iB == 0) {
            this.f50797b[i2] = eVar3;
            eVar3.f50836b = i2;
            return;
        }
        if (iB >= 0) {
            d(i2, eVar3);
            return;
        }
        while (true) {
            int i4 = i2 + i2;
            int i5 = i4 + 1;
            int i6 = this.f50796a;
            if (i5 > i6) {
                if (i4 > i6) {
                    break;
                }
                eVar2 = this.f50797b[i4];
                h.g.b.x.c(eVar2);
            } else {
                eVar2 = this.f50797b[i4];
                h.g.b.x.c(eVar2);
                e eVar4 = this.f50797b[i5];
                h.g.b.x.c(eVar4);
                if (h.g.b.x.b(0L, eVar4.e() - eVar2.e()) >= 0) {
                    eVar2 = eVar4;
                }
            }
            if (h.g.b.x.b(0L, eVar2.e() - eVar3.e()) <= 0) {
                break;
            }
            int i7 = eVar2.f50836b;
            eVar2.f50836b = i2;
            this.f50797b[i2] = eVar2;
            i2 = i7;
        }
        this.f50797b[i2] = eVar3;
        eVar3.f50836b = i2;
    }
}
