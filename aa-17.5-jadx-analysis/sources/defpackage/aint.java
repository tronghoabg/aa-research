package defpackage;

/* loaded from: classes3.dex */
public final class aint extends ainu {
    public static final aint INSTANCE = new aint();

    private aint() {
        super("must be a member or an extension function", null);
    }

    @Override // defpackage.aing
    public boolean check(agcj agcjVar) {
        agcjVar.getClass();
        return (agcjVar.getDispatchReceiverParameter() == null && agcjVar.getExtensionReceiverParameter() == null) ? false : true;
    }
}
