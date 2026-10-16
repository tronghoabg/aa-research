package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aipp extends defpackage.aipt {
    private final int n;

    public aipp(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("must have at least ");
        sb.append(i);
        sb.append(" value parameter");
        sb.append(i > 1 ? "s" : "");
        super(sb.toString(), null);
        this.n = i;
    }

    @Override // defpackage.aiog
    public boolean check(defpackage.agdj agdjVar) {
        agdjVar.getClass();
        return agdjVar.getValueParameters().size() >= this.n;
    }
}
