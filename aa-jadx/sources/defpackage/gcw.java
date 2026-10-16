package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gcw implements defpackage.hkd {
    public final defpackage.gfg a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gcw(java.lang.String str) {
        this(defpackage.gfe.a(str));
        str.getClass();
    }

    public final java.lang.CharSequence a() {
        return this.a.a();
    }

    public final boolean b() {
        return this.a.b();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.gcw) && defpackage.afga.f(this.a, ((defpackage.gcw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "CarTextUiModel(annotatedStringProvider=" + this.a + ")";
    }

    public gcw(defpackage.gfg gfgVar) {
        this.a = gfgVar;
    }
}
