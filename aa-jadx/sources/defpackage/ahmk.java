package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahmk {
    public static final defpackage.ahmj Companion = new defpackage.ahmj(null);
    public static final defpackage.ahmk INFINITY = new defpackage.ahmk(256, 256, 256);
    private final int major;
    private final int minor;
    private final int patch;

    public ahmk(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.patch = i3;
    }

    public final java.lang.String asString() {
        java.lang.StringBuilder sb;
        int i;
        int i2 = this.patch;
        int i3 = this.major;
        if (i2 == 0) {
            sb = new java.lang.StringBuilder();
            sb.append(i3);
            sb.append('.');
            i = this.minor;
        } else {
            sb = new java.lang.StringBuilder();
            sb.append(i3);
            sb.append('.');
            sb.append(this.minor);
            sb.append('.');
            i = this.patch;
        }
        sb.append(i);
        return sb.toString();
    }

    public final int component1() {
        return this.major;
    }

    public final int component2() {
        return this.minor;
    }

    public final int component3() {
        return this.patch;
    }

    public final void encode(defpackage.affc<? super java.lang.Integer, defpackage.afbk> affcVar, defpackage.affc<? super java.lang.Integer, defpackage.afbk> affcVar2) {
        int i;
        int i2;
        affcVar.getClass();
        affcVar2.getClass();
        if (defpackage.afga.f(this, INFINITY)) {
            return;
        }
        int i3 = this.major;
        if (i3 <= 7 && (i = this.minor) <= 15 && (i2 = this.patch) <= 127) {
            affcVar.invoke(java.lang.Integer.valueOf((i << 3) | i3 | (i2 << 7)));
        } else {
            affcVar2.invoke(java.lang.Integer.valueOf((this.patch << 16) | (this.minor << 8) | i3));
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ahmk)) {
            return false;
        }
        defpackage.ahmk ahmkVar = (defpackage.ahmk) obj;
        return this.major == ahmkVar.major && this.minor == ahmkVar.minor && this.patch == ahmkVar.patch;
    }

    public int hashCode() {
        return (((this.major * 31) + this.minor) * 31) + this.patch;
    }

    public java.lang.String toString() {
        return asString();
    }
}
