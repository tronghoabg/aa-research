package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aips extends defpackage.aipt {
    public static final defpackage.aips INSTANCE = new defpackage.aips();

    private aips() {
        super("must have a single value parameter", null);
    }

    @Override // defpackage.aiog
    public boolean check(defpackage.agdj agdjVar) {
        agdjVar.getClass();
        return agdjVar.getValueParameters().size() == 1;
    }
}
