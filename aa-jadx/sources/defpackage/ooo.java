package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ooo {
    public final defpackage.oom a;
    public final defpackage.zbd b;

    public ooo(defpackage.oom oomVar, defpackage.zbd zbdVar) {
        this.a = oomVar;
        this.b = zbdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ooo) {
            defpackage.ooo oooVar = (defpackage.ooo) obj;
            defpackage.oom oomVar = this.a;
            if (oomVar != null ? oomVar.equals(oooVar.a) : oooVar.a == null) {
                if (this.b.equals(oooVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.oom oomVar = this.a;
        return this.b.hashCode() ^ (((oomVar == null ? 0 : oomVar.hashCode()) ^ 1000003) * 1000003);
    }

    public final java.lang.String toString() {
        defpackage.zbd zbdVar = this.b;
        return "WeatherDataDisplayAndUiAction{weatherDisplayData=" + java.lang.String.valueOf(this.a) + ", uiAction=" + zbdVar.toString() + "}";
    }

    protected ooo() {
        throw null;
    }
}
