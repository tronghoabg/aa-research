package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class awm extends defpackage.cyc<defpackage.awn> {
    private final defpackage.affc a;

    public awm(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.awn(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.awn awnVar = (defpackage.awn) cgeVar;
        defpackage.affc affcVar = awnVar.a;
        defpackage.affc affcVar2 = this.a;
        if (affcVar != affcVar2) {
            awnVar.a = affcVar2;
            defpackage.awv awvVar = awnVar.d;
            if (awvVar != null) {
                awnVar.f((defpackage.awu) awnVar.a.invoke(awvVar));
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.awm) && this.a == ((defpackage.awm) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
