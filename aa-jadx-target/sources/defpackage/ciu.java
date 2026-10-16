package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ciu extends defpackage.cyc<defpackage.cix> {
    private final defpackage.cit a;

    public ciu(defpackage.cit citVar) {
        this.a = citVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.cix(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.cix cixVar = (defpackage.cix) cgeVar;
        cixVar.a.d.m(cixVar);
        cixVar.a = this.a;
        cixVar.a.d.n(cixVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.ciu) && defpackage.afga.f(this.a, ((defpackage.ciu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ")";
    }
}
