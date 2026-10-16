package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oby extends defpackage.edd {
    public final defpackage.obw a;

    public oby(defpackage.obw obwVar) {
        this.a = obwVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.oby) && defpackage.afga.f(this.a, ((defpackage.oby) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Attribution(wrapped=" + this.a + ")";
    }
}
