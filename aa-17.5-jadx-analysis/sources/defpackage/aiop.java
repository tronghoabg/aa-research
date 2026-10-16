package defpackage;

/* loaded from: classes3.dex */
public final class aiop extends aiot {
    private final int n;

    public aiop(int i) {
        StringBuilder sb = new StringBuilder("must have at least ");
        sb.append(i);
        sb.append(" value parameter");
        sb.append(i > 1 ? "s" : "");
        super(sb.toString(), null);
        this.n = i;
    }

    @Override // defpackage.aing
    public boolean check(agcj agcjVar) {
        agcjVar.getClass();
        return agcjVar.getValueParameters().size() >= this.n;
    }
}
