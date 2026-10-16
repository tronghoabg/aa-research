package defpackage;

/* loaded from: classes2.dex */
public final class pqm {
    private static final yob a = yob.c("com/google/android/apps/gmm/systems/clientparam/manager/ClientParametersBroadcasterImpl");
    private final psj b;
    private final sm c;

    public pqm(psj psjVar, sm smVar) {
        this.b = psjVar;
        this.c = smVar;
    }

    public final void a(plz plzVar) {
        ((ynz) ((ynz) a.d()).ai((char) 6833)).u("Notify client parameters update event");
        pnc pncVar = new pnc(plzVar);
        psj psjVar = this.b;
        psjVar.c(pncVar);
        ((vaa) this.c.a).b(plzVar);
        psjVar.c(new pni());
    }
}
