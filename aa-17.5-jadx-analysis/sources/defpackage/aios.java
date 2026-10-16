package defpackage;

/* loaded from: classes3.dex */
public final class aios extends aiot {
    public static final aios INSTANCE = new aios();

    private aios() {
        super("must have a single value parameter", null);
    }

    @Override // defpackage.aing
    public boolean check(agcj agcjVar) {
        agcjVar.getClass();
        return agcjVar.getValueParameters().size() == 1;
    }
}
