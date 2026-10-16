package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aabj implements defpackage.zxx {
    public final defpackage.zxy a;
    public final android.graphics.Paint b = new android.graphics.Paint();
    public android.graphics.Point c = new android.graphics.Point(-2, -2);
    public android.graphics.Point d = new android.graphics.Point(-1, -1);
    private final defpackage.aabn e;

    public aabj(defpackage.zxy zxyVar, defpackage.aabn aabnVar) {
        this.a = zxyVar;
        this.e = aabnVar;
    }

    @Override // defpackage.zxx
    public final android.graphics.Rect a() {
        return new android.graphics.Rect(this.c.x, this.c.y, this.d.x, this.d.y);
    }

    @Override // defpackage.zxx
    public final void b() {
        defpackage.aabn aabnVar = this.e;
        aabnVar.b.add(this);
        aabnVar.m();
    }

    @Override // defpackage.zxx
    public final void e(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                this.e.m();
                return;
            case 3:
                defpackage.zsr.d("Marker.setFlat()", " is not supported in Lite Mode");
                return;
            case 4:
                defpackage.zsr.d("Marker.setRotation()", " is not supported in Lite Mode");
                return;
            case 5:
                defpackage.zsr.d("Marker.setDraggable()", " is not supported in Lite Mode");
                return;
            case 6:
                if (!this.a.v()) {
                    this.e.l(this);
                }
                this.e.m();
                return;
            case 12:
                int iW = this.a.w();
                int i2 = iW - 1;
                if (iW == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    this.e.l(this);
                    return;
                } else if (i2 == 1) {
                    i();
                    return;
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    i();
                    return;
                }
            default:
                throw new java.lang.IllegalArgumentException(defpackage.a.bm(i, "Invalid notifyPropertyUpdated(", ")"));
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.aabj) {
            return this.a.equals(((defpackage.aabj) obj).a);
        }
        return false;
    }

    @Override // defpackage.zxx
    public final void f() {
        defpackage.aabn aabnVar = this.e;
        aabnVar.b.remove(this);
        if (aabnVar.e == this.a) {
            aabnVar.e = null;
        }
        aabnVar.m();
    }

    @Override // defpackage.zxx
    public final boolean g() {
        return this.e.e == this.a;
    }

    public final float h() {
        return this.a.getZIndex();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i() {
        defpackage.zxy zxyVar = this.a;
        if (zxyVar.isVisible()) {
            defpackage.aabn aabnVar = this.e;
            defpackage.zxy zxyVar2 = aabnVar.e;
            if (zxyVar2 != null && zxyVar != zxyVar2) {
                aabnVar.k();
            }
            aabnVar.e = zxyVar;
            aabnVar.m();
        }
    }

    @Override // defpackage.zxx
    public final void c() {
    }

    @Override // defpackage.zxx
    public final void d() {
    }
}
