package defpackage;

/* loaded from: classes.dex */
public final class dje {
    public static final dje a = new dje(false, 1, dkd.a);
    public final boolean b;
    public final int f;
    public final dkd g;
    public final int c = 0;
    public final boolean d = true;
    public final int e = 1;
    private final djp h = null;

    public dje(boolean z, int i, dkd dkdVar) {
        this.b = z;
        this.f = i;
        this.g = dkdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dje)) {
            return false;
        }
        dje djeVar = (dje) obj;
        if (this.b != djeVar.b) {
            return false;
        }
        int i = djeVar.c;
        boolean z = djeVar.d;
        int i2 = djeVar.e;
        if (this.f != djeVar.f) {
            return false;
        }
        djp djpVar = djeVar.h;
        return affa.f(this.g, djeVar.g);
    }

    public final int hashCode() {
        return ((((((((true != this.b ? 1237 : 1231) * 961) + 1231) * 31) + 1) * 31) + this.f) * 961) + this.g.hashCode();
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.b + ", capitalization=None, autoCorrect=true, keyboardType=" + djf.a(1) + ", imeAction=" + djd.a(this.f) + ", platformImeOptions=null, hintLocales=" + this.g + ")";
    }
}
