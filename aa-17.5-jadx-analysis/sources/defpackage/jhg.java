package defpackage;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class jhg {
    public float a;
    public float b;
    public float c;
    public float d;
    public final jhf e;

    public jhg(jhf jhfVar, float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f4;
        this.c = f3;
        this.d = f2;
        this.e = jhfVar;
    }

    public final void a(int i, jhg jhgVar) {
        if (i == 2) {
            this.a = Math.max(jhgVar.c, this.a);
            return;
        }
        if (i == 4) {
            this.c = Math.min(this.c, jhgVar.a);
        } else if (i == 8) {
            this.d = Math.min(this.d, jhgVar.b);
        } else {
            if (i != 16) {
                return;
            }
            this.b = Math.max(this.b, jhgVar.d);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhg)) {
            return false;
        }
        jhg jhgVar = (jhg) obj;
        return Float.compare(jhgVar.a, this.a) == 0 && Float.compare(jhgVar.b, this.b) == 0 && Float.compare(jhgVar.c, this.c) == 0 && Float.compare(jhgVar.d, this.d) == 0;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d));
    }

    public final String toString() {
        return "ProjectionWindowBounds{name=" + this.e.E() + ", [left=" + this.a + ", top=" + this.d + " -  right=" + this.c + ", bottom=" + this.b + "]}";
    }
}
