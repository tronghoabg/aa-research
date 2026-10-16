package defpackage;

/* loaded from: classes3.dex */
public final class agjb extends agey {
    public static final agjb INSTANCE = new agjb();

    private agjb() {
        super("package", false);
    }

    @Override // defpackage.agey
    public Integer compareTo(agey ageyVar) {
        ageyVar.getClass();
        if (this == ageyVar) {
            return 0;
        }
        return agex.INSTANCE.isPrivate(ageyVar) ? 1 : -1;
    }

    @Override // defpackage.agey
    public String getInternalDisplayName() {
        return "public/*package*/";
    }

    @Override // defpackage.agey
    public agey normalize() {
        return ageu.INSTANCE;
    }
}
