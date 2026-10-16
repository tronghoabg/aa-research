package defpackage;

/* loaded from: classes3.dex */
public final class aioq extends aiot {
    private final int n;

    public aioq(int i) {
        super(a.bn(i, "must have exactly ", " value parameters"), null);
        this.n = i;
    }

    @Override // defpackage.aing
    public boolean check(agcj agcjVar) {
        agcjVar.getClass();
        return agcjVar.getValueParameters().size() == this.n;
    }
}
