package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aiot extends defpackage.aiou {
    public static final defpackage.aiot INSTANCE = new defpackage.aiot();

    private aiot() {
        super("must be a member or an extension function", null);
    }

    @Override // defpackage.aiog
    public boolean check(defpackage.agdj agdjVar) {
        agdjVar.getClass();
        return (agdjVar.getDispatchReceiverParameter() == null && agdjVar.getExtensionReceiverParameter() == null) ? false : true;
    }
}
