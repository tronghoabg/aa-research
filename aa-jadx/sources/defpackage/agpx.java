package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum agpx {
    FINAL(0),
    OPEN(1),
    ABSTRACT(2),
    SEALED(3);

    private static final /* synthetic */ defpackage.afef $ENTRIES = defpackage.afga.p(values());
    private final defpackage.agql flag;

    agpx(int i) {
        defpackage.ahlz<defpackage.ahjj> ahlzVar = defpackage.ahma.MODALITY;
        ahlzVar.getClass();
        this.flag = new defpackage.agql(ahlzVar, i);
    }

    public static defpackage.afef<defpackage.agpx> getEntries() {
        return $ENTRIES;
    }

    public final defpackage.agql getFlag$org_jetbrains_kotlin_kotlin_metadata() {
        return this.flag;
    }
}
