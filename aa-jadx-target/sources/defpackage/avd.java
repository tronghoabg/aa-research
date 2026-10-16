package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class avd implements defpackage.avv {
    private final defpackage.awu a;
    private final defpackage.dlo b;

    public avd(defpackage.awu awuVar, defpackage.dlo dloVar) {
        this.a = awuVar;
        this.b = dloVar;
    }

    @Override // defpackage.avv
    public final float a() {
        defpackage.awu awuVar = this.a;
        defpackage.dlo dloVar = this.b;
        return dloVar.dG(awuVar.a(dloVar));
    }

    @Override // defpackage.avv
    public final float b(defpackage.dlz dlzVar) {
        defpackage.awu awuVar = this.a;
        defpackage.dlo dloVar = this.b;
        return dloVar.dG(awuVar.b(dloVar, dlzVar));
    }

    @Override // defpackage.avv
    public final float c(defpackage.dlz dlzVar) {
        defpackage.awu awuVar = this.a;
        defpackage.dlo dloVar = this.b;
        return dloVar.dG(awuVar.c(dloVar, dlzVar));
    }

    @Override // defpackage.avv
    public final float d() {
        defpackage.awu awuVar = this.a;
        defpackage.dlo dloVar = this.b;
        return dloVar.dG(awuVar.d(dloVar));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.avd)) {
            return false;
        }
        defpackage.avd avdVar = (defpackage.avd) obj;
        return defpackage.afga.f(this.a, avdVar.a) && defpackage.afga.f(this.b, avdVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ")";
    }
}
