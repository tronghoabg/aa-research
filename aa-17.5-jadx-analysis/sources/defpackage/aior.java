package defpackage;

/* loaded from: classes3.dex */
public final class aior extends aiot {
    public static final aior INSTANCE = new aior();

    private aior() {
        super("must have no value parameters", null);
    }

    @Override // defpackage.aing
    public boolean check(agcj agcjVar) {
        agcjVar.getClass();
        return agcjVar.getValueParameters().isEmpty();
    }
}
