package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class azy {
    public defpackage.affc a;
    public int d;
    public defpackage.skd f;
    public final defpackage.epq e = new defpackage.epq((byte[]) null);
    public int b = -1;
    public int c = -1;

    public azy(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [bam, java.lang.Object] */
    public final defpackage.azx a(int i, long j, boolean z, defpackage.affc affcVar) {
        defpackage.skd skdVar = this.f;
        if (skdVar == null) {
            return defpackage.ayq.a;
        }
        defpackage.epq epqVar = this.e;
        ?? r8 = skdVar.c;
        boolean z2 = r8 instanceof defpackage.ayi;
        if (z2) {
        }
        defpackage.bal balVar = new defpackage.bal(skdVar, i, j, epqVar, affcVar);
        if (!z2) {
            r8.c(balVar);
        } else if (z) {
            ((defpackage.ayi) r8).c(balVar);
        } else {
            defpackage.ayi ayiVar = (defpackage.ayi) r8;
            ayiVar.b.add(new defpackage.abob(0, balVar));
            ayiVar.a();
        }
        defpackage.vx.c("compose:lazy:schedule_prefetch:index", i);
        return balVar;
    }

    public azy() {
    }
}
