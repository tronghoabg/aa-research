package defpackage;

/* loaded from: classes.dex */
public final class bec {
    public static final bec a = new bec();
    private final int b = -1;
    private final Boolean c = null;
    private final int d = 0;
    private final int e = -1;
    private final djp f = null;
    private final Boolean g = null;
    private final dkd h = null;

    private bec() {
    }

    public final dje a(boolean z) {
        djd djdVar = new djd(-1);
        if (djdVar.a == -1) {
            djdVar = null;
        }
        return new dje(z, djdVar != null ? djdVar.a : 1, dkd.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bec)) {
            return false;
        }
        bec becVar = (bec) obj;
        int i = becVar.b;
        Boolean bool = becVar.c;
        int i2 = becVar.d;
        int i3 = becVar.e;
        djp djpVar = becVar.f;
        Boolean bool2 = becVar.g;
        dkd dkdVar = becVar.h;
        return true;
    }

    public final int hashCode() {
        return -887533472;
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=Unspecified, autoCorrectEnabled=null, keyboardType=" + djf.a(0) + ", imeAction=" + djd.a(-1) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
