package defpackage;

/* loaded from: classes3.dex */
public final class agjc extends agey {
    public static final agjc INSTANCE = new agjc();

    private agjc() {
        super("protected_and_package", true);
    }

    @Override // defpackage.agey
    public Integer compareTo(agey ageyVar) {
        ageyVar.getClass();
        if (affa.f(this, ageyVar)) {
            return 0;
        }
        if (ageyVar == agep.INSTANCE) {
            return null;
        }
        return Integer.valueOf(true != agex.INSTANCE.isPrivate(ageyVar) ? -1 : 1);
    }

    @Override // defpackage.agey
    public String getInternalDisplayName() {
        return "protected/*protected and package*/";
    }

    @Override // defpackage.agey
    public agey normalize() {
        return ageu.INSTANCE;
    }
}
