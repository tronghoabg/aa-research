package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bjh {
    public static final defpackage.bjh a = new defpackage.bjh(null, null, null);
    public final defpackage.ctc b;
    public final defpackage.dga c;
    public final defpackage.azu d;

    public bjh(defpackage.ctc ctcVar, defpackage.dga dgaVar, defpackage.azu azuVar) {
        this.b = ctcVar;
        this.c = dgaVar;
        this.d = azuVar;
    }

    public static /* synthetic */ defpackage.bjh a(defpackage.bjh bjhVar, defpackage.ctc ctcVar, defpackage.dga dgaVar, defpackage.azu azuVar, int i) {
        if ((i & 1) != 0) {
            ctcVar = bjhVar.b;
        }
        if ((i & 2) != 0) {
            dgaVar = bjhVar.c;
        }
        if ((i & 4) != 0) {
            azuVar = bjhVar.d;
        }
        return new defpackage.bjh(ctcVar, dgaVar, azuVar);
    }
}
