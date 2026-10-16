package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aipr extends defpackage.aipt {
    public static final defpackage.aipr INSTANCE = new defpackage.aipr();

    private aipr() {
        super("must have no value parameters", null);
    }

    @Override // defpackage.aiog
    public boolean check(defpackage.agdj agdjVar) {
        agdjVar.getClass();
        return agdjVar.getValueParameters().isEmpty();
    }
}
