package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class afea extends defpackage.afdy {
    private final defpackage.afdo a;
    public transient defpackage.afdk r;

    public afea(defpackage.afdk afdkVar) {
        this(afdkVar, afdkVar != null ? afdkVar.gT() : null);
    }

    @Override // defpackage.afdy
    protected void e() {
        defpackage.afdk afdkVar = this.r;
        if (afdkVar != null && afdkVar != this) {
            defpackage.afdm afdmVar = gT().get(defpackage.afdl.k);
            afdmVar.getClass();
            ((defpackage.afdl) afdmVar).d(afdkVar);
        }
        this.r = defpackage.afdz.a;
    }

    @Override // defpackage.afdk
    public defpackage.afdo gT() {
        defpackage.afdo afdoVar = this.a;
        afdoVar.getClass();
        return afdoVar;
    }

    public afea(defpackage.afdk afdkVar, defpackage.afdo afdoVar) {
        super(afdkVar);
        this.a = afdoVar;
    }
}
