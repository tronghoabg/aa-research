package defpackage;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;

/* loaded from: classes3.dex */
public final class aaae implements zwu {
    public final zwv a;
    public final Paint b = new Paint();
    public Point c = new Point(-2, -2);
    public Point d = new Point(-1, -1);
    private final aaah e;

    public aaae(zwv zwvVar, aaah aaahVar) {
        this.a = zwvVar;
        this.e = aaahVar;
    }

    @Override // defpackage.zwu
    public final Rect a() {
        return new Rect(this.c.x, this.c.y, this.d.x, this.d.y);
    }

    @Override // defpackage.zwu
    public final void b() {
        aaah aaahVar = this.e;
        aaahVar.b.add(this);
        aaahVar.m();
    }

    @Override // defpackage.zwu
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
                zrn.d("Marker.setFlat()", " is not supported in Lite Mode");
                return;
            case 4:
                zrn.d("Marker.setRotation()", " is not supported in Lite Mode");
                return;
            case 5:
                zrn.d("Marker.setDraggable()", " is not supported in Lite Mode");
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
                throw new IllegalArgumentException(a.bn(i, "Invalid notifyPropertyUpdated(", ")"));
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aaae) {
            return this.a.equals(((aaae) obj).a);
        }
        return false;
    }

    @Override // defpackage.zwu
    public final void f() {
        aaah aaahVar = this.e;
        aaahVar.b.remove(this);
        if (aaahVar.e == this.a) {
            aaahVar.e = null;
        }
        aaahVar.m();
    }

    @Override // defpackage.zwu
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
        zwv zwvVar = this.a;
        if (zwvVar.isVisible()) {
            aaah aaahVar = this.e;
            zwv zwvVar2 = aaahVar.e;
            if (zwvVar2 != null && zwvVar != zwvVar2) {
                aaahVar.k();
            }
            aaahVar.e = zwvVar;
            aaahVar.m();
        }
    }

    @Override // defpackage.zwu
    public final void c() {
    }

    @Override // defpackage.zwu
    public final void d() {
    }
}
