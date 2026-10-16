package defpackage;

/* loaded from: classes.dex */
public final class det {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public det(Object obj, int i, int i2, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        dka.c("Reversed range is not supported");
    }

    public static /* synthetic */ det a(det detVar, Object obj, int i, int i2) {
        if ((i2 & 1) != 0) {
            obj = detVar.a;
        }
        int i3 = (i2 & 2) != 0 ? detVar.b : 0;
        if ((i2 & 4) != 0) {
            i = detVar.c;
        }
        return new det(obj, i3, i, detVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof det)) {
            return false;
        }
        det detVar = (det) obj;
        return affa.f(this.a, detVar.a) && this.b == detVar.b && this.c == detVar.c && affa.f(this.d, detVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.b) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }
}
