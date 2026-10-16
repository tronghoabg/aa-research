package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gcc implements defpackage.hkd {
    public final java.lang.String a;
    public final defpackage.gcw b;
    public final boolean c;
    public final defpackage.gbm d;
    public final defpackage.affc e;
    public final defpackage.affc f;
    public final defpackage.afer g;
    public final boolean h;
    public final boolean i;
    private final boolean k = false;
    private final boolean l = false;
    public final int j = 1;

    public gcc(java.lang.String str, defpackage.gcw gcwVar, boolean z, defpackage.gbm gbmVar, defpackage.affc affcVar, defpackage.affc affcVar2, defpackage.afer aferVar, boolean z2, boolean z3) {
        this.a = str;
        this.b = gcwVar;
        this.c = z;
        this.d = gbmVar;
        this.e = affcVar;
        this.f = affcVar2;
        this.g = aferVar;
        this.h = z2;
        this.i = z3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.gcc)) {
            return false;
        }
        defpackage.gcc gccVar = (defpackage.gcc) obj;
        if (!defpackage.afga.f(this.a, gccVar.a) || !defpackage.afga.f(this.b, gccVar.b) || this.c != gccVar.c || !defpackage.afga.f(this.d, gccVar.d) || !defpackage.afga.f(this.e, gccVar.e) || !defpackage.afga.f(this.f, gccVar.f) || !defpackage.afga.f(this.g, gccVar.g) || this.h != gccVar.h) {
            return false;
        }
        boolean z = gccVar.k;
        if (this.i != gccVar.i) {
            return false;
        }
        boolean z2 = gccVar.l;
        int i = gccVar.j;
        return defpackage.a.X(1, 1);
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = ((((((((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + defpackage.a.e(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        defpackage.afer aferVar = this.g;
        return (((((((((((iHashCode * 31) + (aferVar == null ? 0 : aferVar.hashCode())) * 31) + defpackage.a.e(this.h)) * 31) + defpackage.a.e(false)) * 31) + defpackage.a.e(this.i)) * 31) + defpackage.a.e(false)) * 31) + 1;
    }

    public final java.lang.String toString() {
        return "CarTextFieldUiModel(initialText=" + this.a + ", hint=" + this.b + ", showKeyboardByDefault=" + this.c + ", leadingIcon=" + this.d + ", onTextChanged=" + this.e + ", onSubmit=" + this.f + ", onTriggerTranscription=" + this.g + ", enabled=" + this.h + ", isError=false, voiceOnlyEnabled=" + this.i + ", showActiveIndicator=false, keyboardType=" + defpackage.djn.a(1) + ")";
    }
}
