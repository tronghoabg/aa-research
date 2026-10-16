package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rph {
    public static final defpackage.yhe a;
    public final int b;
    public final android.graphics.Rect c;

    static {
        defpackage.yha yhaVar = new defpackage.yha(4);
        yhaVar.f(17, 66);
        yhaVar.f(66, 17);
        yhaVar.f(33, 130);
        yhaVar.f(130, 33);
        yhaVar.f(2, 1);
        yhaVar.f(1, 2);
        a = yhaVar.d(true);
    }

    public rph(int i, android.graphics.Rect rect) {
        this.b = i;
        this.c = rect;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.rph rphVar = (defpackage.rph) obj;
        if (this.b != rphVar.b) {
            return false;
        }
        return j$.util.Objects.equals(this.c, rphVar.c);
    }

    public final int hashCode() {
        android.graphics.Rect rect = this.c;
        return (this.b * 31) + (rect != null ? rect.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "FocusInfo{direction=" + this.b + ", focusedRect=" + java.lang.String.valueOf(this.c) + "}";
    }
}
